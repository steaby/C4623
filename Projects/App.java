package com.bloodbank.main;

import com.bloodbank.Dao.BloodDonorDao;
import com.bloodbank.model.BloodDonor;


public class App 
{

	public static void main(String[] args)
	{
		BloodDonorDao dao = new BloodDonorDao();
		BloodDonor donor =new BloodDonor();
		BloodDonor donor1 = new BloodDonor();
		BloodDonor donor2 = new BloodDonor();
		donor.setB_ID(12);
		donor.setB_Grp("A+");
		donor1.setB_ID(14);
		donor1.setB_Grp("O+");
		donor2.setB_ID(41);
		donor2.setB_Grp("AB-");
		
		BloodDonorDao.saveDonor(donor);
		BloodDonorDao.saveDonor(donor1);
		BloodDonorDao.saveDonor(donor2);
		
		donor1.setB_ID(65);
		BloodDonorDao.saveOrUpdateDonor(donor1);
		
		BloodDonorDao.deletedonor(donor2);
		


	}

}
