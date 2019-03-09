package org.pierre.kubernetesgen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubernetesgenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesgenApplication.class, args);
	}

	public void run(String... args) throws Exception {
		PV pv = new PV();
		pv.setAccessMode(AccessMode.ReadWriteMany);
		pv.setStorage(new Storage(1 , UnitOfMeasure.Gi));
		pv.setVolumeId("vol-867g5kii");
		pv.setVolumeName("task-pv");
		System.out.println(pv.toYAML());
	}

}
