package com.supply.chain.state

import net.corda.core.contracts.LinearState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party

data class Pedido(val solicitante: Party,
                  val dono: Party,
                  val tipoProduto: TipoProduto,
                  val quantidadeProduto: Int,
                  val statusPedido: StatusPedido = StatusPedido.Solicitado,
                  override val linearId: UniqueIdentifier = UniqueIdentifier()): LinearState {
    override val participants: List<AbstractParty> = listOf(solicitante, dono)
}