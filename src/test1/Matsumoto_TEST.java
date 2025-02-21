package test1;

import java.util.Scanner;//ユーザの入力を取得するため
import java.time.LocalTime;

public class Matsumoto_TEST {
	public void hello() {
		String mName="";
		LocalTime mNow = LocalTime.now();
		int mHour = mNow.getHour();
		String mHello ="";
		if (mHour <= 11 && mHour >= 2){
			mHello="おはようございます！";
		}else if(mHour<=17) {
			mHello="こんにちは！";
		}else {
			mHello="こんばんは！";
		}
				
		
		try(Scanner scanner = new Scanner(System.in);
				) {// ユーザに入力を促す
					System.out.println("あなたの名前は？：");
					mName= scanner.nextLine();
					System.out.println (mName +"さん、" + mHello);
		} finally{
			
		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Matsumoto_TEST mMT = new Matsumoto_TEST();
		//mMT.hello();
		
	}

}
