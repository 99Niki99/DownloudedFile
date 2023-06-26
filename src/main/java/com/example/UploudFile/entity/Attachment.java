package com.example.UploudFile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
public class Attachment {

    @Id
    @GeneratedValue(generator = "uuid") //генерирую первичный ключ
    @GenericGenerator(name = "uuid", strategy ="uuid2")//Остатся вопросы
    private String id;

    private String fileName;
    private  String fileType;

    @Lob // тип данных для хранения больших обьектов в SQL

    private byte[] data;

    public Attachment(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }


}
