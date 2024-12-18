# Protected Düzenleyici (Modifier)

- Protected düzenleyici, sınıfın kendisi ve türetilmiş sınıflar tarafından erişilebilen bir üyenin erişim düzeyini belirler.

# Final Düzenleyici (Modifier)

- Final düzenleyici, bir sınıfın türetilmesini engeller. Bir sınıfın final olarak işaretlenmesi, bu sınıfın başka bir sınıf tarafından türetilmesini engeller.
- final yerel değişkenler üzerinde de kullanılabilir. Bu durumda, değişkenin değeri bir kez atanır ve daha sonra değiştirilemez.
- Final method cannot be overridden by its subclasses.

# Dinamik bağlama (Dynamic Binding)

- Dinamik bağlama, bir nesnenin hangi yöntemin çağrılacağını çalışma zamanında belirler.

# İstisna Yönetimi ve Metin I/O (Exception Handling and Text I/O)

- Text IO vizede sorumlu değiliz.

## Exception ve Error Farlılıkları

- Error sınıfı, JVM tarafından oluşturulan ve programcının kontrolü dışında olan hataları temsil eder.
- Exception sınıfı, programcının kontrolü altında olan hataları temsil eder.
- Error alındığı zaman zarif bir şekilde kullanıcıyı bilgilendirerek programı sonlandırmaktan başka yapılacak pek bir şey yoktur. Exception ise programcının kontrolü altında olan hatalardır ve programcı bu hatalara karşı önlem alabilir.
