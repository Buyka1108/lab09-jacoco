# Лаборатори 9 — Код хамралт, JaCoCo

- Оюутан: Ж.Буянхишиг
- Оюутны код: B232270114

## Ажлын орчин

```text
openjdk version "17.0.20.1" 2026-08-18
OpenJDK Runtime Environment (build 17.0.20.1+1-1-26.04-Ubuntu)
OpenJDK 64-Bit Server VM (build 17.0.20.1+1-1-26.04-Ubuntu, mixed mode, sharing)
[1mApache Maven 3.9.12[m
Maven home: /usr/share/maven
Java version: 17.0.20.1, vendor: Ubuntu, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "6.6.114.1-microsoft-standard-wsl2", arch: "amd64", family: "unix"

```

## A — Happy path тестүүд

Хэвийн урсгалын 5 тест ажилласан бөгөөд бүгд амжилттай болсон.

| Үзүүлэлт | Хамрагдсан | Хамрагдаагүй | Хамралт |
|---|---:|---:|---:|
| Line | 16 | 9 | 64.00% |
| Branch | 22 | 19 | 53.66% |

Эдгээр тоог results/jacoco-A.csv файлаас тооцсон.
Line хамралт: 16 / (16 + 9) × 100 = 64.00%.
Branch хамралт: 22 / (22 + 19) × 100 = 53.66%.

Одоогийн тестүүд буруу оролтын exception замууд болон зарим дүн,
тэтгэлгийн хувилбарыг ажиллуулаагүй тул хүрээгүй мөрүүд улаан харагдана.
Зөв оролтоор зөвхөн нэг тал нь ажилласан нөхцөлүүд шар ромботой байна.

Нотолгоо:
- results/mvn-verify-A.txt
- results/jacoco-A.csv
