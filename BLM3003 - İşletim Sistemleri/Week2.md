- Bootstrap yani firmware yazılımı bilgisayar açıldığı zaman kernel programını hard diskten alıp main memory'ye yükler ve o sayede işletim sistemi başlar. BIOS ve UEFI bu işi yapar.
- CPU I/O cihazları ile iletişime geçmek için controller isimli çipleri kullanır. Bu çipler CPU'ya I/O cihazları ile iletişim kurma yeteneği kazandırır.
  Controllerlerin kendi işlem kapasitelerinin olması CPU'nun diğer işlemlere odaklanmasını sağlar. Bu şekilde threadler meşgul edilmemiş olur ve diğer işlemler suspend edilmemiş olur.
- Interrupt'ların da kendi içlerinde öncelikleri vardır. Bir program tarafından gönderilen interrupt ile kernel'den gelen interruptın önceliği aynı değildir. Kernel'den gelen interruptlar daha önceliklidir.
