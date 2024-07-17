package model;

public class LegalPerson extends Client{
    private String cnpj;

    public LegalPerson(String name, String cnpj) {
        super(name);
        this.cnpj = cnpj;
    }
}
