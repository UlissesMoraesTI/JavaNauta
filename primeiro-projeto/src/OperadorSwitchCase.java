public class OperadorSwitchCase {
    public static void main(String[] args) {

        String unidadeFederativa = "MS";
        String estado = "";

        switch (unidadeFederativa) {
            case "AC": estado = "AC - Acre"; break;
            case "AL": estado = "AL - Alagoas"; break;
            case "AP": estado = "AP - Amapá"; break;
            case "AM": estado = "AM - Amazonas"; break;
            case "BA": estado = "BA - Bahia"; break;
            case "CE": estado = "CE - Ceará"; break;
            case "DF": estado = "DF - Distrito Federal"; break;
            case "ES": estado = "ES - Espírito Santo"; break;
            case "GO": estado = "GO - Goiás"; break;
            case "MA": estado = "MA - Maranhão"; break;
            case "MT": estado = "MT - Mato Grosso"; break;
            case "MS": estado = "MS - Mato Grosso do Sul"; break;
            case "MG": estado = "MG - Minas Gerais"; break;
            case "PA": estado = "PA - Pará"; break;
            case "PB": estado = "PB - Paraíba"; break;
            case "PR": estado = "PR - Paraná"; break;
            case "PE": estado = "PE - Pernambuco"; break;
            case "PI": estado = "PI - Piauí"; break;
            case "RJ": estado = "RJ - Rio de Janeiro"; break;
            case "RN": estado = "RN - Rio Grande do Norte"; break;
            case "RS": estado = "RS - Rio Grande do Sul"; break;
            case "RO": estado = "RO - Rondônia"; break;
            case "RR": estado = "RR - Roraima"; break;
            case "SC": estado = "SC - Santa Catarina"; break;
            case "SP": estado = "SP - São Paulo"; break;
            case "SE": estado = "SE - Sergipe"; break;
            case "TO": estado = "TO - Tocantins"; break;
            default: estado = "Indefinido"; break;
        }

        System.out.println(estado);

        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case 5:
                System.out.println("Quinta-Feira");
                break;

            case 6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia da Semana Inválido!");
                break;
        }
    }
}
