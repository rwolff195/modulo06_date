package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgPrincipal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // definir o timezome GMT
		
		
		Date x1 = new Date();// mostra a data atual
		Date x2 = new Date(System.currentTimeMillis()); // mostra data e hora atual
		Date x3 = new Date(0L); // informando os milissigundos
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("14/05/2019");
		Date y2 = sdf2.parse("14/05/2019 18:03:52");
		Date y3 = Date.from(Instant.parse("2019-05-14T18:16:00Z"));
		
		System.out.println("Data atual X1 : " + x1);
		System.out.println("Data e Hora atual X2 : " + x2);
		System.out.println("Data informando em milissigundos X3 : " + x3);
		System.out.println("Data informando em milissigundos(5 horas depois) X4 : " + x4);
		System.out.println("Y1 : " + y1);
		System.out.println("Y2 : " + y2);
		System.out.println("Y3 : " + y3);
		System.out.println();		
		System.out.println("-----------------------------------");
		System.out.println("Data atual X1 : " + sdf2.format(x1));
		System.out.println("Data e Hora atual X2 : " + sdf2.format(x2)); // muda o formato -  sdf2.format
		System.out.println("Data informando em milissigundos X3 : " + sdf2.format(x3));
		System.out.println("Data informando em milissigundos(5 horas depois) X4 : " + sdf2.format(x4));
		System.out.println("Y1 : " + sdf2.format(y1));
		System.out.println("Y2 : " + sdf2.format(y2));
		System.out.println("Y3 : " + sdf2.format(y3));
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("Data atual X1 : " + sdf3.format(x1));
		System.out.println("Data e Hora atual X2 : " + sdf3.format(x2));
		System.out.println("Data informando em milissigundos X3 : " + sdf3.format(x3));
		System.out.println("Data informando em milissigundos(5 horas depois) X4 : " + sdf3.format(x4));
		System.out.println("Y1 : " + sdf3.format(y1));
		System.out.println("Y2 : " + sdf3.format(y2));
		System.out.println("Y3 : " + sdf3.format(y3));		

	}

}
