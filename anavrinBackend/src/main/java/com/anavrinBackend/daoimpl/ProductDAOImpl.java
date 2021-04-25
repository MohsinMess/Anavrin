package com.anavrinBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anavrinBackend.dao.ProductDAO;
import com.anavrinBackend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public List<Product> list() {
		return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).getResultList();
	}

	public Product get(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));

	}

	public boolean add(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean delete(Product product) {
		product.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public List<Product> listActiveProducts() {
		String selectActiveProducts = "from Product where active = :active";
//		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProducts);
//		query.setParameter("active", true);
//		return query.getResultList();
		
		return sessionFactory.getCurrentSession().createQuery(selectActiveProducts,Product.class).setParameter("active",true).getResultList();
		
	}


	public List<Product> ListActiveProductsByCategory(int categoryId) {
		
		String selectActiveProductsByCategory = "from Product where active = :active and categoryId = :id";
		return sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCategory,Product.class)
				.setParameter("active",true).setParameter("id",categoryId).getResultList();
	}

	public List<Product> getLatestActiveProducts(int count) {
		
		return sessionFactory.getCurrentSession().createQuery("from Product where active = :active order by id",Product.class).setParameter("active", true)
				.setFirstResult(0).setMaxResults(count).getResultList();
	}

}
