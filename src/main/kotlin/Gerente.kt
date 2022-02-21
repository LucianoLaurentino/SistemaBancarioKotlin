class Gerente(
    var salario: String,
    var matricula: String,
    nome: String,
    cpf: String,
    telefone: String,
    endereco: String,
    email: String
): Pessoa(
    nome = nome,
    cpf = cpf,
    telefone = telefone,
    endereco = endereco,
    email = email
)