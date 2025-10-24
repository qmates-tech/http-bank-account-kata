package repositories

import java.math.BigDecimal
import java.util.*

interface BankRepository {
    // replace these with get + store methods and commands on Account aggregate
    fun createAccount(): UUID
    fun accountExists(accountUUID: UUID): Boolean
    fun balanceFor(accountUUID: UUID): BigDecimal
    fun depositInto(accountUUID: UUID, amount: BigDecimal)
    fun withdrawFrom(accountUUID: UUID, amount: BigDecimal)

    // more DDD approach with Account aggregate
    fun getAccountById(accountUUID: UUID): Account
    fun store(account: Account)
}

class NonExistingAccountException(accountUUID: UUID) : Exception("Account with $accountUUID does not exist")
class InsufficientFundException(accountUUID: UUID) : Exception("Account with $accountUUID does not have enough fund")

