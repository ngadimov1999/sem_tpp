package com.webshop.simplewebapplication;

import com.webshop.simplewebapplication.Service.DeviceService;
import com.webshop.simplewebapplication.database.Device.DeviceDAOHib;
import com.webshop.simplewebapplication.model.Device;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class DeviceServiceTest {

	@InjectMocks
	private DeviceService deviceService;

	@Mock
	private DeviceDAOHib dataBase;

	@Test
	void addDevice() {
		Device device = new Device(0, "Морковь");
		boolean isDeviceCreated = deviceService.addDevice(device);
		Assert.assertTrue(isDeviceCreated);
		Mockito.verify(dataBase, Mockito.times(1)).addDevice(device);
	}

	@Test
	void deleteDevice() {
		boolean isDeviceDeleted = deviceService.deleteDevice(1);
		Assert.assertTrue(isDeviceDeleted);
		Mockito.verify(dataBase, Mockito.times(1)).deleteDevice(1);
	}

	@Test
	void findAll() {
		List<Device> deviceList = new ArrayList<>();
		deviceList.add(new Device(0, "Морковь"));
		Mockito.when(dataBase.findAll()).thenReturn(deviceList);
		Assert.assertArrayEquals(deviceList.toArray(), deviceService.findAll().toArray());
	}

	@Test
	void countOfDevices() {
		Mockito.when(dataBase.countOfDevices()).thenReturn(3);
		Assert.assertEquals(3, deviceService.countOfDevices());
	}
}
