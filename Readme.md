A program célja:

Egy gyros-t árusító büfé működését implementálni.
	
Tervezési minták:
- Template-method -> Milyen gyros készüljön el (pita/tortilla, feltétek, etc..), a sorrend fontos, mi miután következik.
- Decorator -> A különböző akciókat a díszítő tervezési mintával valósítanám meg(Közös ős a rendelés, a díszítendő a gyros, a díszítés pedig az akció, amit alkalmazva az ételen annak ára olcsóbb lesz.
- A rendeléseket factory-methoddal készíteném el (ez még csak elméletben van meg, később változhat)

Unit-testek:
- A rendelés végösszege nem lehet negatív szám.
- A gyrosnak mindenképp tartalmaznia kell pitát vagy tortillját.
- A feltétet egy gyroshoz csak egyszer lehet felhasználni.