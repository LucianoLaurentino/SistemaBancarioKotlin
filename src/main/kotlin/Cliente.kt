class Cliente(
    var senha: String,
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
){
    override fun toString(): String {
     return ("Nome do cliente $nome cpf e endereço $cpf $endereco .")
    }
}