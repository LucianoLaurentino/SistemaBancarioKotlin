class ContaPoupanca(
    var rendimento: String,
    var limiteDeTransferencia: Byte,
    var extratoBancarioMax: Byte,
    var investimentoDeRiscoBaixo: String,
    var percentualDeRendimento: Byte,
    saque: String,
    saldo: Int,
    agencia: String,
    numeroDaConta: Short,
    gerente: String,
    cliente: String
): Conta(
    saque = saque,
    saldo = saldo,
    agencia = agencia,
    numeroDaConta = numeroDaConta,
    gerente = gerente,
    cliente = cliente
)