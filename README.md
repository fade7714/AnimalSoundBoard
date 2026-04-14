# 🐾 AnimalSoundBoard
### Interfejsy i Lista Zwierząt

---

## 📋 Opis projektu

Celem projektu było stworzenie aplikacji mobilnej **"Zwierzęcy Dźwięk"** na Androida. Aplikacja pokazuje listę zwierząt – każde z nich po kliknięciu "wydaje dźwięk". Projekt miał mi pomóc zrozumieć, jak działa programowanie oparte na interfejsach oraz jak budować listy w Androidzie za pomocą RecyclerView.

Aplikację napisałem w taki sposób, żeby dodanie nowego zwierzęcia nie wymagało zmieniania reszty kodu – wystarczy dopisać nową klasę.

---

## ⚙️ Kluczowe funkcjonalności

1. **Interfejs `Animal`** – stworzyłem interfejs, który wymusza na każdej klasie zwierzęcia posiadanie metod `getName()` oraz `makeSound()`. Dzięki temu klasy `Dog`, `Cat` i `Cow` działają według tych samych zasad i można je przechowywać razem na jednej liście jako typ `Animal`.

2. **Lista RecyclerView** – zastosowałem RecyclerView z własnym adapterem `AnimalAdapter`. RecyclerView działa wydajniej niż zwykły ListView, bo ponownie wykorzystuje elementy listy zamiast tworzyć nowe.

3. **Dźwięki zwierząt** – kliknięcie na zwierzę wywołuje metodę `makeSound()`, która wyświetla komunikat Toast z onomatopeją (np. `"Hau!"` lub `"Miau!"`). To prosty sposób na sprawdzenie, czy metoda działa poprawnie.

---

## 🔧 Techniczne szczegóły

| Element | Opis |
|---|---|
| **Java** | Cała logika aplikacji napisana w Javie |
| **`List<Animal>`** | Obiekty wszystkich zwierząt trzymam na jednej liście ogólnego typu `Animal`, co pozwala je obsługiwać w ten sam sposób niezależnie od gatunku |
| **LinearLayout** | Atrybut `gravity="center"` wyśrodkowuje listę na ekranie, a stopka pozostaje na dole |
| **`strings.xml`** | Teksty wydzielone do osobnego pliku zgodnie z dobrymi praktykami Androida |
| **`drawable`** | Ikony zwierząt w formacie WebP |
