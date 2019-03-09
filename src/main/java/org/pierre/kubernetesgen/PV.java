package org.pierre.kubernetesgen;


public class PV {
/**
kind: PersistentVolume
apiVersion: v1
metadata:
  name: task-pv
spec:
  capacity:
    storage: 100Gi
  accessModes:
    - ReadWriteOnce
  awsElasticBlockStore:
    volumeID: vol-867g5kii
    fsType: ext4
*/
	String volumeName;
	Storage storage;
	AccessMode accessMode;
	String volumeId;

	public String toString() {
		return toYAML();
	}
	
	public String toYAML() {
		StringBuilder sb = new StringBuilder();
		sb.append("kind: PersistentVolume\n");
		sb.append("apiVersion: v1\n");
		sb.append("metadata:\n");
		sb.append("  name: " + this.volumeName +  "\n");
		sb.append("spec:\n");
		sb.append("  capacity:\n");
		sb.append("    storage: " + this.storage.amount + this.storage.unitOfMeasure + "\n");
		sb.append("  accessModes:\n");
		sb.append("    - ReadWriteOnce\n");
		sb.append("  awsElasticBlockStore:\n");
		sb.append("    volumeID: " + this.volumeId+ "\n");
		sb.append("    fsType: ext4" + "\n");
		return sb.toString();
	}

	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public AccessMode getAccessMode() {
		return accessMode;
	}

	public void setAccessMode(AccessMode accessMode) {
		this.accessMode = accessMode;
	}

	public String getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}
   
}
