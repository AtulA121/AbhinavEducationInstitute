<td><button id='' class='btn btn-primary' onclick='' data-toggle='modal' data-target='#myModal'>Update</button></td>
<th>Update</th>

<td><button id='' class='btn btn-danger' onclick=''>Delete</button></td>
<th>Delete</th>

<!-- ---------------------------------- -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Heading of Modal</h4>
        </div>
        <div class="modal-body">
	        <div class="container" style="width:100%">
				<p>Body of Modal
			</div>		
			</div>
      	<div class="modal-footer">
      		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      	</div>
    </div>
  </div>  
</div>
<!-- ---------------------------------- -->
<style></style>

<script>
function myfun() 
	{
		var mobile= $("#mobile").val();
				
		//alert(mobile);
				
		$.ajax({
		url : "LoginController",
		method : "GET",
		dataType : "json",
		data : { mobile : mobile }, 
		success :  function(data)
			{	
				//alert(data);	
			}
		});
			
		//window.location.href='';
	}
</script>

<div class="container" style=''>
	<div class="rows">
		<div class="col-sm-4"></div>
		<div class="col-sm-4"></div>
		<div class="col-sm-4"></div>	
	</div>
</div>

<form method='GET' action=''>

<img src='' width='' height='' title='' style='' />

<input type='text' name='' value='' id='' class='form-control' pattern='' title='' required onkeyup='' style=''>

<input type='checkbox' name='' value='' id='' class='form-control' required style='' onclick=''>

<input type="radio" name='' value='' id='' class='form-control' style='' onclick=''>

<textarea name='' id='' class='form-control' cols='' rows='' title='' required onkeyup='' style=''>value</textarea>

<select name='' id='' class='form-control' required onselect='' style=''>
<option value=''>select</option>
<option value=''></option>
<option value=''></option>
<option value=''></option>
</select>

<input type='submit' name='' value='submit' id='' class='btn btn-primary' onclick='' style=''>

<button id='' class='btn btn-primary' onclick='' style=''>Login</button>

</form>

<table class="table table-hover table-bordered table-responsive">
	<tr style="background-color:#eee">
		<th>Batch Id</th>
		<th>Course Name</th>
		<th>Batch Start Time</th>
    </tr>
	<tr>
		<td>Batch Id</td>
		<td>Course Name</td>
		<td>Batch Start Time</td>
    </tr>
</table>