<div class="container">
	<script>
		window.categoryId = '${category.id}';
	</script>
	<div class="row">
		<div class="col-md-12 col-lg-12">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home /</a></li>
				<li class="active"><strong>/ Category /</strong></li>
				<li class="active"><b>/ ${category.name}</b></li>
			</ol>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 col-lg-12">
			<table id="categoryProducts"
				class="table table-striped table-bordered">
				<thead>
					<tr>
						<th></th>
						<th>Name</th>
						<th>Brand</th>
						<th>Price</th>
						<th>Available Quantity</th>
						<th></th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</div>
