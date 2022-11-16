
package br.com.unicamp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fragmentos implements Serializable {
    
    @Id
    private Integer id; 
    private Integer groupId;
    private String file;
    private Integer line;
    private String text; 

    public Fragmentos() {
    }

    public Fragmentos(Integer groupId, String file, Integer line, String text) {
        this.groupId = groupId;
        this.file = file;
        this.line = line;
        this.text = text;
    }

    
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Fragmentos{" + "id=" + id + ", groupId=" + groupId + ", file=" + file + ", line=" + line + ", text=" + text + '}';
    }
    
}
