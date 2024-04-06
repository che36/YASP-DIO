package one.digitalinnovation.santander.yasp.common.dto.entity;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@AllArgsConstructor
public abstract class BankCard {

    private final Long id;
    private final BankCardTypeEnum type;
    protected final double monthlyTax;
    protected final boolean taxFreeForRelationShip;
    protected final Set<BankCardEntry> entries = new HashSet<>();

    public BankCard(Long id, BankCardTypeEnum bankCardTypeEnum, double monthlyTax, boolean taxFreeForRelationShip, Long id1, BankCardTypeEnum type, double monthlyTax1, boolean taxFreeForRelationShip1) {
        this.id = id1;
        this.type = type;
        this.monthlyTax = monthlyTax1;
        this.taxFreeForRelationShip = taxFreeForRelationShip1;
    }

    public Long getId() {
        return id;
    }

    public void addEntry(final LocalDateTime dateTime, final double value) {
        entries.add(BankCardEntry.builder().withDateTime(dateTime).withValue(value).build());
    }

}