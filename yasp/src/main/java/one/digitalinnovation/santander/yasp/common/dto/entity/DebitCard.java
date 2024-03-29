package one.digitalinnovation.santander.yasp.common.dto.entity;

import lombok.Builder;

public class DebitCard extends BankCard implements TaxableCard {
    @Builder(setterPrefix = "with")
    public DebitCard(Long id, double monthlyTax, boolean taxFreeForRelashionShip) {
        super(id, BankCardTypeEnum.DEBIT, monthlyTax, taxFreeForRelashionShip);
    }

    @Override
    public Double getCalculatedTax() {
        return 0D;
    }
}
