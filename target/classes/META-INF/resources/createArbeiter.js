function submitArbeiterForm(event){
    event.preventDefault();
    let xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText!==null){
                location.href='http://localhost:8080/loginPage.html';
            }
        }
    }
    xhttp.open('POST', 'http://localhost:8080/arbeiter', true)
    xhttp.setRequestHeader('Content-Type', 'application/json')
    xhttp.send(JSON.stringify({
        vorname: document.getElementById('vorname').value,
        nachname: document.getElementById('nachname').value,
        eMail: document.getElementById('eMail').value,
        password: document.getElementById('password').value

    }))
}

