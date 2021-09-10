$("#bearbeiten").submit(function (e) {
    e.preventDefault();

    var form = $(this);
    var eMail = this.eMail.value
    var password = this.password.value
    var vorname = this.vorname.value
    var nachname = this.nachname.value
    var id = this.id.value

    $.ajax({
        type: "PUT",
        url: "/arbeiter",
        contentType: "application/json",
        data: JSON.stringify({ id: id, eMail: eMail, password: password, vorname: vorname, nachname: nachname }),
        success: function (data) {

            window.location.href = "http://localhost:8080/index.html";
        }
    });
});