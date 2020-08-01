package com.yc.thread.d0726;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Demo {
	private int downNums=0;
	public static void main(String[] args) throws Exception {
		new Demo().download();
	}
	
	public void download() throws Exception {
		URL url=new URL("https://mirrors.tuna.tsinghua.edu.cn/apache//commons/lang/binaries/commons-lang3-3.11-bin.tar.gz");
		String filename="d:/commons-lang3-3.11-bin.tar.gz";
		long time=System.currentTimeMillis();
		SslUtils.ignoreSsl();
		URLConnection conn=url.openConnection();
		int filesize=conn.getContentLength();
		int blocksize=2*1024*1024;
		int blocknums=filesize/blocksize;
		if(filesize%blocksize!=0) {
			blocknums++;
		}
		
		
		System.out.println("开始下载");
		for(int i=0;i<blocknums;i++) {
			downNums++;
			int index=i;
			new Thread() {
				public void run() {
					try {
					System.out.println("第"+(index+1)+"块开始下载");
					URLConnection conn=url.openConnection();
					InputStream in =conn.getInputStream();
					FileOutputStream out=new FileOutputStream(filename+index);
					int beginBytes=index*blocksize;
					int enBytes=beginBytes+blocksize;
					if(enBytes>filesize) {
						enBytes=filesize;
					}
					in.skip(beginBytes);
					int position=beginBytes;
					byte[] buffer=new byte[1024];
					int count;
					while((count =in.read(buffer))>0) {
						if(position+count>enBytes) {
							int a=position+count-enBytes;
							count=count-a;
						}
						
						
						out.write(buffer,0,count);
						position+=count;
						
						if(position>=enBytes) {
							break;
						}
					}
					in.close();
					out.close();
					System.out.println("第"+(index+1)+"下载完成");
					synchronized (Demo.this) {
						Demo.this.downNums--;
						Demo.this.notify();
					}
				}catch(IOException e){
					e.printStackTrace();
				}
				}
				}.start();
			}
		synchronized (this) {
			while(downNums>0) {
				wait();
			}
		}
		
		marge(filename,blocknums);
				System.out.println("共花了"+(System.currentTimeMillis()-time)/1000+"秒");
				
				
				System.out.println("下载完成");
			
		
	}
	
	public static void marge(String path,int filenums) throws IOException {
		FileOutputStream fos=new FileOutputStream(path);
		for(int i=0;i<filenums;i++) {
			FileInputStream fis=new FileInputStream(path+i);
			byte[] buffer=new byte[1024];
			int count;
			while((count =fis.read(buffer))>0) {
				fos.write(buffer,0,count);
			}
			fis.close();
		}
		fos.close();
		
		
	}

}
