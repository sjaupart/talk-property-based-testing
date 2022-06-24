# Property-based Testing ou l'insuffisance des tests unitaires

Talk sur la découverte des tests de propriétés, leur usage et complémentarité avec les tests unitaires.

### Pré-requis

Pour le live coding, une JDK 17 suffit (le Gradle Wrapper est fourni).

### Structure

- `slides.pdf` - Les slides du talk
- `src/` - Les sources pour le live coding
- `gradlew` - Le Gradle Wrapper pour la compilation
- `images/` - Screenshots explicatives à présenter lors du talk
- `docs/` - Les étapes du live coding + live templates IntelliJ

### Le code ne passe pas les tests à la compilation ?

C'est voulu.

Certains des tests présents concernent la gestion des cas à la marge découverts par un test de propriété.

Le but de ce dépôt est d'avoir un talk prêt à l'usage, nécessitant le moins de préparation possible (un `git clone` et c'est parti !).

