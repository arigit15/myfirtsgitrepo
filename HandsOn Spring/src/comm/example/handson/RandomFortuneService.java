package comm.example.handson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private Random random;
	    
	String content = null;
	   ArrayList<String> data=null;
	   int i=0;
	   int index=0;
	   FileReader f=null;
	   BufferedReader br=null;
	   
	   @PostConstruct
	   public void DoInitStuff() {
		   try {
			f=new FileReader("fortune.txt");
			br=new BufferedReader(f);
			data= new ArrayList<String>();
			
			while((content=br.readLine())!=null)
			{
				data.add(content);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   
	   @PreDestroy
	   public void DoCleanupStuff() {
		   try {
			f.close();
			br.close();
			   data=null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   

	@Override
	public String getFortune() {
		random =new Random();
		index=random.nextInt(data.size());
		
		return data.get(index);
		

	}

}

