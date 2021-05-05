import pl.blueenergy.document.DocumentDao;
import pl.blueenergy.service.ProgrammerService;

public class
Main {
	
	public static void main(String[] args) {
		DocumentDao documentDao = new DocumentDao();
		ProgrammerService programmerService = new ProgrammerService();
		programmerService.execute(documentDao);
	}
}
