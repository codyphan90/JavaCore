package week1;

public interface InterfaceLoginAuth {
		 String encryptPassword(String pass);
	     void checkDBforUser();
}
//public class DBMySQL implements InterfaceLoginAuth{
//    // Needs to implement both methods
//}
//public class DBOracle implements InterfaceLoginAuth{
//    // Needs to implement both methods
//}
//public class DBAbc implements InterfaceLoginAuth{
//    // Needs to implement both methods
//}

//abstract class example
//public abstract class bike {
//	String colour = "RED";
//	public abstract float price(){
//		
//	}
//}
//	public class mountainBike extends bike {
//		public float price(){
//			//price 500$
//		}
//	}
//	public class roadBike extends bike {
//		public float price(){
//			//price 1000$
//		}
//	}