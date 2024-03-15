package one.digitalinnovation.santander.yasp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class BankCardController {
    private final BankCardService bankCardService;

    public BankCardController(final BankCardService bankCardService) {
        this.bankCardService = bankCardService;
    }

    @GetMapping("/{id}/tax")
    ResponseEntity<BankCardTaxDTO> getCardTax(@Pathvariable("id") final long id) {
        final BankCardService bankCardService = new BankCardService();
        final Double tax = bankCardService.getCardTax(id);
        return ResponseEntity.ok(new BankCardTaxDTO(id, tax));
    }
}
