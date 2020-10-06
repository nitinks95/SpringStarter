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
 
    row.insertCell(0).innerHTML= '<p id="listEnv" name="listEnv">' + env.value + '</p>';
    row.insertCell(1).innerHTML= '<p id="listLoc" name="listLoc">' + loc.value + '</p>';
    row.insertCell(2).innerHTML= '<p id="isActiveCheck" name="isActiveCheck">' + actVal.value + '</p>';
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