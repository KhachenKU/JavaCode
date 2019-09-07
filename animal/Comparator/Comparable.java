package Comparator;

public interface Comparable {
    /*
    return - when this come before other
           0 when at the same position as other
           + when this comes after other
     */
    int compareTo(Object other);
}
