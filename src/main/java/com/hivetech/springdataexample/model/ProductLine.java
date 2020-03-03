package com.hivetech.springdataexample.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //chỉ định rằng ProductLine là một Entity
@Table(name = "productlines")   // chỉ định model sẽ liên kết tới một bảng trong DB
@Setter @Getter @ToString
public class ProductLine {
    //  filed này sẽ tương ứng với 1 PK
    @Id
    private String productLine;
    // filed này sẽ tương ứng mới một cột của bảng productlines
    @Column
    private String textDescription;
    @Column
    private String htmlDescription;
    @Column
    private String productPhoto;

}
