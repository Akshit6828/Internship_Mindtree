function validateDetails() {
    
    if(validateName())
        console.log("Name is valid");
    if(validatePassword())
        console.log("Password is valid");
    if(validateCheckBox())
        console.log("Checkbox is valid");
    

}

function validatePassword(){
    // Should contains 1 to 10 characters + Alpha Numeric+ Minimum one special character
    var password = document.getElementById("studentpassword");
    if(password.value.match(/[a-z]/i) && password.value.match(/[A-Z]/i) && password.value.match(/\d/i) && password.value.match(/[$@$!%*?&]/i) && password.value.length <=10 && password.value.length>=1){
        return true;
    }
    else{
        alert("Password should contain 1 to 10 characters + Alpha Numeric+ Minimum one special character")
       return false;
    }
}

function validateName(){
    // Should contain 5 to 20 characters. Should have one Uppercase letter.
    var name = document.getElementById("studentname");
    var regex = /^[A-Za-z]{5,20}$/;
    if(regex.test(name.value)){
        return true;
    }
    else{
        alert("Name should contain 5 to 20 characters. Should have one Uppercase letter.");
         return false;
     }
}

function validateCheckBox(){
    // If user selects one checkbox and clicks on submit button appropriate error message should show.

    var checkboxs = document.getElementsByName("sub");
    console.log("Checkbox len = ", checkboxs.length);
    var count = 0;
    for(var i=0; i<checkboxs.length; i++){
        if(checkboxs[i].checked == true){
            count++;
        }
    }
    console.log("count = ",count);
    if(count <=1){
        alert("Please select more than 1 course!");
        return false;
    }
    else{
        return true;
    }
}
