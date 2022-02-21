class ContaCorrente(
    var taxaMensal: String,
    var trasferencia: String,
    var limite: String,
    saque: String,
    saldo: Int,
    agencia: String,
    numeroDaConta: Short,
    gerente: String,
    cliente: String

):Conta(
    agencia = agencia,
    numeroDaConta = numeroDaConta,
    gerente = gerente,
    cliente = cliente,
    saldo = saldo,
    saque = saque
)