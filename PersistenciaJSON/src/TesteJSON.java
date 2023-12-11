import com.fasterxml.jackson.databind.ObjectMapper;
public class TesteJSON {
	public static void main(String[] args) {
		
		try {
			
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serializaçao
			Pessoa p1 = new Pessoa("Caim", 54);
			
			//serializar o obj p1
			String json = objeto.writeValueAsString(p1);
			System.out.println("Objeto serializado");
			System.out.println(json);
			
			//desserializar o JSON para o obj p1
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa:");
			System.out.println("Nome: " + desPessoa.getNome() + "\nIdade: " + desPessoa.getIdade());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
