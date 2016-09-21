package chapter3.item9;

public class PhoneNumber {
  private final short prefix;
  private final short areaCode;
  private final short lineNumber;
  
  // Lazily initialized, cached hashCode
  private volatile int hashCode;

  public PhoneNumber(short prefix, short areaCode, short lineNumber) {
    this.prefix = prefix;
    this.areaCode = areaCode;
    this.lineNumber = lineNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof PhoneNumber)) {
      return false;
    }
    PhoneNumber pn = (PhoneNumber) o;
    return pn.prefix == prefix && pn.areaCode == areaCode && pn.lineNumber == lineNumber;
  }
  
  /**
   * equal objects must have equal hash codes.
   */
  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = 17;
      result = 31 * result + prefix;
      result = 31 * result + areaCode;
      result = 31 * result + lineNumber;
      hashCode = result;
    }
    return result;
  }

}
