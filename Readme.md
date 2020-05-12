A program célja:

Egy gyros-t árusító büfé működését implementálni.
	
Tervezési minták:
- Template-method -> Milyen gyros készüljön el (pita/tortilla, feltétek, etc..), a sorrend fontos, mi miután következik.
- Decorator -> A különböző akciókat a díszítő tervezési mintával valósítanám meg(Közös ős a rendelés, a díszítendő a gyros, a díszítés pedig az akció, amit alkalmazva az ételen annak ára olcsóbb lesz.
- A rendeléseket factory-methoddal "készítem" el.

Unit-testek:
- A rendelés végösszege nem lehet negatív szám.
- Nem lehet egy rendeléshez 1-nél több kupont felhasználni.
- Ne lehessen negatív árat beállítani az Egyszemélyes/Többszemélyes adagnál.