package com.levo.domain;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_admin")
public class Admin  extends Staff{
}
