import com.service.PhoneService;
import com.service.impl.PhoneServiceImpl;

public class Main {

	public static void main(String[] args) throws Exception {
		
		PhoneService phoneService = new PhoneServiceImpl();

		phoneService.getAllPhone();
		
		System.out.println("===========================");
		
		phoneService.getByPrice();
		
		System.out.println();
		phoneService.getUpdatePrice();
	}

}
