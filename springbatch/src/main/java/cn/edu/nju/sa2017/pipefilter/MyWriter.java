package cn.edu.nju.sa2017.pipefilter;

import org.springframework.batch.item.ItemWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

public class MyWriter implements ItemWriter<Report> {
    private String resource;

    public void setResource(String resource) {
        this.resource = resource;
    }
    @Override
    public void write(List<? extends Report> list) {
        File file = new File(resource);
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(file);
         /*   Iterator<? extends Report> iterator = list.iterator();
            while(iterator.hasNext()){

            }*/
            for(int i = 0; i < list.size(); i++){
                fileWriter.write(list.get(i).toMyString());
                fileWriter.write("\n");
                fileWriter.flush();
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
