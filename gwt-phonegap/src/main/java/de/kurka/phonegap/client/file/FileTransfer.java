package de.kurka.phonegap.client.file;

public interface FileTransfer {
	public void upload(String fileUri, String serverUrl, FileUploadOptions options, FileUploadCallback callback);
}
