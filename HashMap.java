public class HashMap {
  
  private static final int SIZE = 128;
  private Entry[] table;

  public HashMap() {
    table = new Entry[SIZE];
  }
  
  public static void main(String[] args) {
    HashMap h = new HashMap();
    h.put("Krishna", "Arji");
    h.put("Anchith", "Arji");
    h.put("Samarth", "Arji");
    h.put("Krishna", "Daddy");
    h.print();
    System.out.println("Get Value:" + h.get("Krishna"));
  }
  
  class Entry {
    String key;
    String value;
    Entry next;
    
    public Entry(String k, String v) {
      this.key = k;
      this.value = v;
    }
  }
  
  public void put(String k, String v) {
    // Don't allow null keys
    if (k == null) {
      return;
    }
    
    int index = Math.abs(k.hashCode() % SIZE);
    if (table[index] == null) {
      // No existing element with the key
      Entry e = new Entry(k,v);
      table[index] = e;
    } else {
      // Check if key already exits. if yes, replace the value
      Entry e = table[index];
      boolean exists = false;
      while ((e.key != null)) {
        if (e.key.equals(k)) {
          e.value = v;
          exists = true;
          break;
        } else {
          e = e.next;
        }
      }
      if (!exists) {
        e.next = new Entry(k, v);
      }
    }
  }

  public String get(String k){
    if (k == null) {
       return null;
    }
    int index = Math.abs(k.hashCode() % SIZE);
    if (table[index] == null) {
       return null;
    } else {
       Entry e = table[index];
       return e.value;
    } 
  }

  public void print(){
    if (table != null) {
      for (int i = 0;i < table.length;i++) {
        Entry e = table[i];
        if (e != null) {
           System.out.println("Key :"+ e.key + " Value:"+ e.value);
        }
      }
    }
  }
}
