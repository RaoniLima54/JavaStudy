document.getElementById("reservaForm").addEventListener("submit", function(event) {
            let valido = true;

            // Limpar mensagens anteriores
            document.querySelectorAll(".erro").forEach(e => e.textContent = "");

            // Nome
            let nome = document.getElementById("nome").value.trim();
            if (nome === "") {
                document.getElementById("erroNome").textContent = "Por favor, preencha o nome.";
                valido = false;
            }

            // Sexo
            let sexo = document.getElementById("sexo").value;
            if (sexo === "") {
                document.getElementById("erroSexo").textContent = "Selecione o sexo.";
                valido = false;
            }

            // Email
            let email = document.getElementById("email").value.trim();
            let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                document.getElementById("erroEmail").textContent = "Digite um e-mail válido.";
                valido = false;
            }

            // Data
            let data = document.getElementById("data").value;
            if (data === "") {
                document.getElementById("erroData").textContent = "Escolha a data de chegada.";
                valido = false;
            }

            // Noites
            let noites = document.getElementById("noites").value;
            if (noites < 1) {
                document.getElementById("erroNoites").textContent = "Número de noites deve ser maior que 0.";
                valido = false;
            }

            // Hóspedes
            let hospedes = document.getElementById("hospedes").value;
            if (hospedes < 1) {
                document.getElementById("erroHospedes").textContent = "Número de hóspedes deve ser maior que 0.";
                valido = false;
            }

            if (!valido) {
                event.preventDefault(); // Impede o envio se houver erro
            }
        });