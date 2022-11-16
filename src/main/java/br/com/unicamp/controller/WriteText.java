package br.com.unicamp.controller;

import br.com.unicamp.dao.DAODatabase;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteText {

    public WriteText() {
    }
    
    public void writeText(String fileName) throws FileNotFoundException
    {
         PrintStream ps = new PrintStream(fileName);
         DAODatabase dao = new DAODatabase();
         dao.getText(5).forEach(e->{ps.print(e);ps.println();});
         ps.close();
        
    }
    
}
