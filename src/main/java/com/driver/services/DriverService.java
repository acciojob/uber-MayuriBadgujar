package com.driver.services;

import com.driver.model.Driver;

public interface DriverService {

	/*	public void register(String mobile, String password);
		public void deleteDriver(int driverId);
		public void updateStatus(int driverId);

  //  void deleteDriver(Integer driverId);

	//void removeDriver(Integer driverId);

	 */

	public void register(String mobile, String password);
	public void removeDriver(int driverId);
	public void updateStatus(int driverId);
}
