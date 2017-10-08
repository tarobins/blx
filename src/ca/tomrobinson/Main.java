package ca.tomrobinson;

import ca.tomrobinson.proto.PersonOuterClass;
import ca.tomrobinson.proto.PersonOuterClass.Person;
import com.google.common.collect.ImmutableList;

public class Main {
  public static void main(String argv[]) {
    Person.Builder personBuilder = Person.newBuilder();
    personBuilder.setName("Tom");
    personBuilder.setEmail("tom@someemail.com");
    personBuilder.setAddress(PersonOuterClass.Address.newBuilder().setCity("Ottawa").setStreet("Glasgow").build());
    Person p = personBuilder.build();
    byte[] ba = p.toByteArray();
    System.out.println(p.getName() + "  " + p.getAddress().getCity());
    for (byte b : ba) {
      System.out.println(b);
    }
  }
}
