$.ajax({
    type: "POST",
    url: 'http://localhost:8080/auth/login', // script to do the actual authentication, set session etc.
    data: {
        username: "email",
        password: "password", // get element value of password here
    },
    success: function(data) {
        // process result
        console.log(data);
    },
});