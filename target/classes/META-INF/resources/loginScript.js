function submitLoginForm(event){
    event.preventDefault();
    console.log("hallo");
    let xhttp = new XMLHttpRequest()

    xhttp.open('POST', 'http://localhost:8080/auth/login', true)
    xhttp.setRequestHeader('Content-Type', 'application/json')
    xhttp.send(JSON.stringify({
        username: document.getElementById('username').value,
        password: document.getElementById('password').value
    }))
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText!==null){
                var authorization = this.responseText;
                localStorage.setItem('access-token', authorization);
                location.href='http://localhost:8080/';
            }
        }
    }

}

