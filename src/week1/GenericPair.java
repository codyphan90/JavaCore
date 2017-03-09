package week1;

public class GenericPair <K,V> implements GenericsInterface<K,V>{
	
		private K key;
		private V value;
		
		

		public GenericPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return key;
		}
		
		

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return value;
		}
		
		
	
		
}
