$(function(){
	
	var $table = $('#categoryProducts');  // fetch the table from categoryProducts.jsp page
	
	if($table.length){						// if condition to only get data if table is present in the page
		console.log('Inside the table');
		
		var jsonURL = '';
		if(window.categoryId == ''){
			jsonURL = window.contextRoot + '/json/data/all/products';
		}
		else{
			jsonURL = window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
		}
		
		$table.DataTable({
			
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','All Records']],
			pageLength:5,
			ajax: {
				url: jsonURL,
				dataSrc: ''
			},
			columns:[
				{
					data : 'code',
						mRender: function(data,type,row){
							return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>'
					}
				},
				{
					data : 'name'
				},
				{
					data: 'brand'
				},
				{
					data: 'price',
					mRender: function(data,type,row){
						return '&#8377; ' + data
					}
				},
				{
					data: 'quantity',
					mRender: function(data,type,row){
						
						if(data < 1){
							return '<span style="color:red">Out of Stock !!</span>';
						}else{
						return data;
						}
					}
				},
				{
					data: 'id',
					bSortable:false,
					mRender: function(data,type,row){
						
						var str = '';
						str += '<a href = "'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary">VIEW</a> &#160;'; 
						
						if(row.quantity < 1) {
							str += '<a href = "javascript:void(0)" class="btn btn-success disabled"><strike>BUY</strike></a>'
						}
						else{
							str += '<a href = "'+window.contextRoot+'/cart/add/'+data+'/product" class="btn btn-success">BUY</a>';
						}
						return str;
					}
				}
				
	
			]
		});
	}
	
		
});