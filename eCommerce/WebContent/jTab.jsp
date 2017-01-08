<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des produits!</title>
<link href="jTable/css/metro/blue/jtable.css" rel="stylesheet"
	type="text/css" />
<link href="jTable/css/jquery-ui-1.10.3.custom.css" rel="stylesheet"
	type="text/css" />
<script src="jTable/js/jquery-1.8.2.js" type="text/javascript"></script>
<script src="jTable/js/jquery-ui-1.10.3.custom.js"
	type="text/javascript"></script>
<script src="jTable/js/jquery.jtable.js" type="text/javascript"></script>
<script type="text/javascript">
	    $(document).ready(function() {
		//initialize jTable
		$('#ProductTableContainer').jtable({
			title : 'Table de produits',
			actions : {
				listArticle : 'listArticle'
			},
			fields : {
				articleId : {
					title : 'Product Id',
					width : '30%',
					key : true,
					list : true,
					edit : false,
					create : true
				},
				designation : {
					title : 'Designation',
					width : '30%',
					edit : true
				},
				categorie : {
					title : 'Categorie',
					width : '30%',
					edit : true
				},
				prix : {
					title : 'Prix',
					width : '20%',
					edit : true
				},
				quantiteEnStock : {
					title : 'Qte',
					width : '20%',
					edit : true
				},
				articleTypes : {
					title : 'Type darticle',
					width : '20%',
					edit : true
				},
				marqueArticle : {
					title : 'Marque',
					width : '20%',
					edit : true
				}
			}
		});
		$('#ProductTableContainer').jtable('load');
	});
</script>
</head>
<body>
	<div
		style="width: 60%; margin-right: 20%; margin-left: 20%; text-align: center;">
		<h1>Setup and Load Data in jTable using Servlet and JSP</h1>
		<h4>Demo by Priya Darshini, Tutorial at www.programming-free.com</h4>
		<div id="ProductTableContainer"></div>
	</div>
</body>
</html>