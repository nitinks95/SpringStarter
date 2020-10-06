function addRow() {
          
    var env = document.getElementById("env");
    var loc = document.getElementById("loc");
    const isActive = document.getElementById("isActive");
    var table = document.getElementById("myTableData");
    if (isActive.checked == true){
    	var actVal = 'Yes';
    } else {
        var actVal = 'No';
    }
 
    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);
 
    row.insertCell(0).innerHTML= env.value;
    row.insertCell(1).innerHTML= loc.value;
    row.insertCell(2).innerHTML= actVal.value;
    row.insertCell(3).innerHTML= '<button type="button" class="btn btn-danger" value="Delete" onClick="Javacsript:deleteRow(this)">Delete</button>';
 
}
 
function deleteRow(obj) {
      
    var index = obj.parentNode.parentNode.rowIndex;
    var table = document.getElementById("myTableData");
    table.deleteRow(index);
    
}

function load() {
    
    console.log("Page load finished");
 
}