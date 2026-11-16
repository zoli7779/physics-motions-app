# Alkalmazás Tesztesetek

## 1. Teszteset: Többnyelvűség (HU / EN váltás)
* **Cél:** Ellenőrizni, hogy a feliratok helyesen váltanak-e magyar és angol nyelv között.
* **Művelet:** Megnyitás után a felhasználó rákattint a tetején lévő "Toggle Language / Nyelv váltása" gombra.
* **Elvárt eredmény:** Az alkalmazás azonnal újratöltődik, és a felületen minden cím, leírás és képlet a kiválasztott nyelvre módosul.
* **Státusz:** **Sikeres**

## 2. Teszteset: Nagy betűméret és reszponzivitás (Akadálymentesség)
* **Cél:** Ellenőrizni, hogy nagyobb rendszer-betűméret esetén sem vágódnak-e le a vezérlők.
* **Művelet:** A telefon akadálymentességi beállításaiban megnövelt betűméretre állítjuk a rendszert, majd megnyitjuk az alkalmazást.
* **Elvárt eredmény:** A tartalom nem lóg le a képernyőről, a `ScrollView`-nak köszönhetően a teljes leírás kényelmesen lefelé görgethető marad.
* **Státusz:** **Sikeres**

## 3. Teszteset: Képernyőolvasó címke (Accessibility)
* **Cél:** Ellenőrizni a fő interaktív gomb akadálymentes leírását.
* **Művelet:** A TalkBack (képernyőolvasó) funkció bekapcsolásával rákattintunk vagy fókuszálunk a nyelvváltó gombra.
* **Elvárt eredmény:** A rendszer tisztán felolvassa a gombhoz rendelt `contentDescription` szöveget (*"Kattintson a nyelv váltásához..."*).
* **Státusz:** **Sikeres**