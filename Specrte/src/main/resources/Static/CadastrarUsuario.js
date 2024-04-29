document.addEventListener("DOMContentLoaded", function() {
    // Coloque o código JavaScript que precisa interagir com o DOM aqui
    document.querySelector("form").addEventListener("submit", function(event) {
        event.preventDefault(); 
    
        var email = document.getElementById("email").value;
        var nome = document.getElementById("nome").value;
        var password = document.getElementById("password").value;
    
        var usuario = {
            userEmail: email,
            userName: nome,
            userPassword: password
        };

        console.log(usuario);

        var requestOptions = {
            method: 'POST', 
            headers: {
                'Content-Type': 'application/json' 
            },
            body: JSON.stringify(usuario) 
        };
        fetch('http://localhost:8080/User', requestOptions)
            .then(response => response.json())
            .then(data => {
                console.log(data);
            })
            .catch(error => console.log('Erro ao enviar dados para o backend:', error));
    });
});
