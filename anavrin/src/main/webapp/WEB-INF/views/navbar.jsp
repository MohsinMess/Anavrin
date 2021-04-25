<nav class="navbar navbar-expand-sm navbar-custom">
	<a class="navbar-brand" href="${contextRoot}/home">Anavrin</a>
	<ul class="navbar-nav">
		<li class="nav-item dropdown"><a class="nav-link dropbtn"
			href="${contextRoot}/men" id="navbardrop">Men</a>
			<div class="dropdown-content">
				<c:forEach items="${categories}" var="category">
				<a href="${contextRoot}/show/category/${category.id}/products">${category.name}</a>
				</c:forEach>
			</div></li>
		<li class="nav-item dropdown"><a class="nav-link dropbtn"
			href="${contextRoot}/women" id="navbardrop">Women</a>
			<div class="dropdown-content">
				<a href="#">Kurtas & Suits</a> <a href="#">Sarees</a><a href="#">T-shirts</a> <a href="#">Jeans</a>
				<a href="#">Shoes</a> <a href="#">Accessories</a>
			</div></li>
		<li class="nav-item dropdown"><a class="nav-link dropbtn"
			href="${contextRoot}/kids" id="navbardrop">Kids</a>
			<div class="dropdown-content">
				<a href="#">T-shirts</a> <a href="#">Shirts</a><a href="#">shorts</a> <a href="#">Jeans</a>
				<a href="#">Shoes</a> <a href="#">Accessories</a>
			</div></li>
		<li class="nav-item"><a class="nav-link"
			href="${contextRoot}/addCategory" id="navbardrop">Add Category</a>
	</ul>
</nav>