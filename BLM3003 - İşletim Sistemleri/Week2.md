- Bootstrap yani firmware yazılımı bilgisayar açıldığı zaman kernel programını hard diskten alıp main memory'ye yükler ve o sayede işletim sistemi başlar. BIOS ve UEFI bu işi yapar.
- CPU I/O cihazları ile iletişime geçmek için controller isimli çipleri kullanır. Bu çipler CPU'ya I/O cihazları ile iletişim kurma yeteneği kazandırır.
  Controllerlerin kendi işlem kapasitelerinin olması CPU'nun diğer işlemlere odaklanmasını sağlar. Bu şekilde threadler meşgul edilmemiş olur ve diğer işlemler suspend edilmemiş olur.
- Interrupt'ların da kendi içlerinde öncelikleri vardır. Bir program tarafından gönderilen interrupt ile kernel'den gelen interruptın önceliği aynı değildir. Kernel'den gelen interruptlar daha önceliklidir.
- Program counter bir sonraki çalıştırılacak komutun adresidir. Program counter'ın değeri bir interrupt geldiğinde kaydedilir ve interrupt işlendikten sonra program counter'ın değeri geri yüklenir.
- Polling(sorgulama) işlemci aralıklarla gidip interruptın var mı idye tüm donanım cihazlarına sorar. Günümüzde çok kullanılan bir yöntem değil.
- Verctored Interrupt ise her interrupt için ayrı bir adres vektörü oluşturulur. Bu vektörlerin içinde o interrupta ait işlemler bulunur. Bu yöntemde CPU'nun interrupt işleme süresi kısadır.

# Dosya Yapısı

- CPU Main Mermory'ye doğrudan erişebilirken ikincil depolamaya doğrudan erişemez, ancak disk controller main memory ye gerekli bilgiyi gönderdikten sonra CPU bu bilgiye erişebilir.
- Random Access(doğrudan erişim) disklerde her sektöre erişim aynı sürede gerçekleşir. Bu yüzden disklerdeki verilere rastgele erişim yapılabilir.
- Depolama ya da bellek hiyerarşisi:
  - Hız
  - Maliyet
  - Uçuculuk

1. Asymmetric multiprocessing: Bir master olur görevleri o dağıtır.
2. Symmetric multiprocessing: Herkes eşittir, herkes her işi yapabilir.

- Mod biti: Kernel ve user mode arasında geçiş yapar. Kernel mode'da işletim sistemi işlerken user mode'da kullanıcı işlemleri yapılır.
  0 ise kernel mode, 1 ise user mode'da olduğunu gösterir.

Deadlock: İki işlem birbirinin işlemi bitmesini bekliyorsa deadlock oluşur. İkisi de aynı işleme erişmek ister ama biri bırakmaz mesela.
Stack: Programın çalıştığı sırada kullanılan verilerin tutulduğu alandır. LIFO(Last In First Out) yapısına sahiptir.
Stack overflow: Stack alanının dolması durumunda oluşur. Bu durumda programın çalışması durur.
