package com.bloodbank.model;


import javax.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "BloodDonor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class BloodDonor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "BloodId")
	private int B_ID;

	@Column(name = "BloodGrp")
	private String B_Grp;

	

}
