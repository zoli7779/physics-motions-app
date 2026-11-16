# Physics Motions App (M10)

## Leírás
A Physics Motions egy többnyelvű, akadálymentesített Android mobilalkalmazás, amely a fizika legfontosabb mozgástípusait (egyenletes mozgás, gyorsuló mozgás, körmozgás, szabadesés) és azok képleteit mutatja be.

## Fejlesztési környezet
- **Fejlesztőeszköz:** Android Studio
- **Nyelv:** Kotlin, XML
- **Minimum SDK:** API 24+
- **Célzott SDK:** API 34+

## Telepítési és indítási lépések Android Studio-ban
1. Nyisd meg az Android Studio-t.
2. Válaszd az **Open an Existing Project** opciót, majd add meg a projekt mappáját.
3. Várd meg, amíg a Gradle szinkronizáció befejeződik.
4. Csatlakoztass egy fizikai Android eszközt (bekapcsolt USB hibakereséssel) vagy indíts el egy virtuális emulátort (pl. Pixel API 37).
5. Kattints a felső sávban található zöld **Run ('app')** gombra (vagy nyomj `Shift + F10`-et) az alkalmazás fordításához és telepítéséhez.

## Architektúra és API-használat
Ez az alkalmazás egy önálló (standalone) UI- és akadálymentesítési demonstrációs prototípus (M10 feladat), amely helyi statikus tartalommal működik, és **nem kommunikál külső `MeetingNotesAPI` szerverrel vagy hálózati végponttal**. Éles API-kulcsokat, személyes adatokat vagy valódi hangfelvételeket nem tartalmaz.

## AI-eszközök használata
A fejlesztés és a dokumentáció (kódstruktúra, XML elrendezés, többnyelvű erőforrásfájlok) elkészítése során AI-alapú kódgeneráló és szövegszerkesztő asszisztenst (Gemini) használtam támogatásként, a generált kódot pedig saját magam ellenőriztem, teszteltem és véglegesítettem az Android Studio környezetben.
