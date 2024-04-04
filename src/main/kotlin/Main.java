import java.math.BigDecimal;
import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.proxy.OrcamentoServiceProxy;

public class Main {
    public static void main(String[] args){
        OrcamentoModel orcamento = new OrcamentoModel(new BigDecimal("100"), new BigDecimal(10));
        System.out.println("Valor do orcamento = "+orcamento.getValorOrcamento());
        System.out.println("Tempo para ver o desconto = "+ orcamento.getDescontoOrcamento());

        OrcamentoServiceProxy proxy = new OrcamentoServiceProxy(orcamento);
        System.out.println("Valor sem proxy = "+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy = "+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy = "+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy = "+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy = "+proxy.getDescontoOrcamento());
    }
}
