<div class="container">
	<div class="row">
		<div class="col-xs-12 col-md-12">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home /</a></li>
				<li><a href="${contextRoot}/men">/ ${product.categoryId} /</a></li>
				<li class="active">/ ${product.name}</li>
			</ol>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-4">
			<div class="thumbnail">	
				<img src="${images}/${product.code}.jpg" class="img img-responsive" width="250" height="250" />
			</div>
		</div>
		<div class="col-sm-8">
			<h3>${product.name}</h3>
			<hr />
			<p>${product.description}</p>
			<hr />
			<h4>
				Price : <strong> &#8377; ${product.price} /-</strong>
			</h4>
			<hr />
			<h6>Quantity Available : ${product.quantity}</h6>
			<a href="${contextRoot}/cart/add/${product.id}/product"
				class="btn btn-success">Add to Cart</a> <a
				href="${contextRoot}/show/category/${product.categoryId}/products"
				class="btn btn-primary">Back</a>
		</div>
	</div>
</div>