# Sürekli ve Ayrık Zamanlı Sinyaller

- Sinyal: Değikenlerin nitelik ve davranışları hakkındaki bilgiyi içeren matematiksel ifade.
- Sistem: Sinyalleri işleyen bir yapı. Giriş işaretine çıkış işareti üreten düzeneklere sistem denir.
  Her sistem çıkış sinyali üretmek için giriş sinyaline sahip olmak zorunda değildir. Böyle durumlarda white noise girişi varmış gibi varsayacağız.

- Sürekli zamanlı sinyaller t(zaman)'nin her anında bir değer alır.
- Ayrık zamanlı sinyaller ise t'de belirli aralıklarla değer alır.

### Analog işaret hem zamana hem genliğe göre sürekli olan işaretdir.

### Sayısal işaret hem zamana hem de genliğe göre ayrık olan işaretdir.

Genliğin belli anlarında değer alır. Zamanın da belli anlarında değer alır. Dolayısıyla yatay düzlemde sadece belli anlamda değer alabilirken dikey düzlemde de aynı şey geçerlidir.

### Ayrık işaret zamana göre ayrık genliğe göre sürekli işaretdir.

kuantalama: yuvarlama genlik değerini 8e kuantalama.

# Periyodik Sinyaller

- Her T saniyede bir kendini tekrarlayan işaretlerdir.
  x(t) = x(t + T) olacak şekilde tanımlanır. n bir tam sayı ve T pozitif reel sayı olan periyotdur.
  N (pozitif TAMSAYI!) periyotlu ayrık zamanlı işaret
  x[n] = x[n + N] olacak şekilde tanımlanır.

euler denklemleri sınavda çıkabilir.
ayrık zamanlı sinus ve kosinüs sinyalleri
x[n] = cos(w(omega olan w)n + theta) = 1/2(e^(jw(omega olan w)n) + e^(-jw(omega olan w)n))
x[n] = sin(w(omega olan w)n + theta) = 1/2j(e^(jw(omega olan w)n) - e^(-jw(omega olan w)n))
e^(j*theta) = cos(theta) + j*sin(theta)

slayttaki ödevi yap.!
