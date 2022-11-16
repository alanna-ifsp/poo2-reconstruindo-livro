/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unicamp.controller;

import br.com.unicamp.dao.DAODatabase;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Controller {

    DAODatabase dao = new DAODatabase();

    public void login(String username, String password) {
        dao.openConnection(username, password);
    }

    public List<String> getText(Integer groupId,String fileName) throws FileNotFoundException, UnsupportedEncodingException {

        List<String> text = dao.getText(groupId);
        writeText(text, fileName);
        return text;
    }

    public void writeText(List<String> text, String fileName) throws FileNotFoundException, UnsupportedEncodingException {

        try ( PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
            text.forEach(t -> {
                writer.println(t);
            });

        }

    }
}
