package repositories

import java.util.*

class Account(id: UUID, operations: MutableList<Operation>) {

    val id: UUID = id
    private val operations: Collection<Operation> = operations

    fun getOperations(): Collection<Operation> {
        return Collections.unmodifiableCollection(operations)
    }

    companion object {
        fun new(): Account {
            return Account(UUID.randomUUID(), mutableListOf())
        }
    }

}

class Operation(amountInCents: AmountInCents) {
    private val amount: AmountInCents = amountInCents
}

data class AmountInCents(val amount: Int)
