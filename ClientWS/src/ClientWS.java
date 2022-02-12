import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService ws=new BanqueWS().getBanqueServicePort();
        System.out.println(ws.conversionEuroToDH(20));
        Compte cp=ws.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getDateCreation());
        System.out.println(cp.getSolde());
    }
}
