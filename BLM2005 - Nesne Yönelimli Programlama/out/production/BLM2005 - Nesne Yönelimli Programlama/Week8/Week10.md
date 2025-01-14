recursive fonksiyonların ara değerleri stackde tutulur.

```java
public static int recursive(int n) {
    if (n == 0) {
        return 1; // base case
    }
    return n + recursive(n - 1);// her ara değer stackte tutulur.
}

public static int fibonacci(int n) {
    if (n == 0) {
        return 0;// base case
    }
    if (n == 1) {
        return 1;// base case
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

public static boolean isPalindrome(String str) {
    if (str.length() == 0 || str.length() == 1) {
        return true;
    }
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
        return false;
    }
    return isPalindrome(str.substring(1, str.length() - 1));
}

public static boolean isPalindromeBetter(String str) {
    isPalindromBetter(str, 0, str.length() - 1);
}

public static boolean isPalindromeBetter(String str, int start, int end) {
    if (start >= end) {
        return true;
    }
    if (str.charAt(start) != str.charAt(end)) {
        return false;
    }
    return isPalindromeBetter(str, start + 1, end - 1);
}
```

java
generic types T, V, E
type , value, element
