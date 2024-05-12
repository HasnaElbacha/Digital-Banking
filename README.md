# Gestionnaire de Comptes Bancaires

## Présentation
Ce projet consiste en une application de gestion de comptes bancaires, permettant à chaque client de gérer ses comptes courants et épargnes. L'application prend également en charge les opérations de débit et crédit sur les comptes.

## Technologies Utilisées
- Backend: Java avec Spring Boot
- Frontend: Angular
- Base de données: MySQL (ou une base de données de votre choix compatible avec Spring Data JPA)
- Sécurité: Spring Security avec JSON Web Token (JWT)
- Documentation API: Swagger avec Springdoc OpenAPI

## Fonctionnalités
- Gestion des Clients:
Saisie, ajout, suppression, édition, recherche, etc.
- Gestion des Comptes:
Ajout, recherche, administration.
- Enregistrement des Opérations:
Pour chaque opération enregistrée, l'identifiant de l'utilisateur authentifié est stocké.
- Gestion des Utilisateurs:
Enregistrement des comptes et des mots de passe avec possibilité pour un utilisateur de changer son mot de passe.
- Dashboard:
Utilisation de Chart.js pour afficher des graphiques et des statistiques utiles pour les prises de décision.
- Autres fonctionnalités:
Ajoutez d'autres fonctionnalités supplémentaires selon les besoins spécifiques.

## Prtie 1 : Back-end
- Création des Entities JPA et les Interfaces Repositories et la création des interfaces JPA Repository basées sur Spring Data

<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/f595a937-7718-4f64-ad57-3d67552c940d.png" width="1000" height="500">

- Test sur couche DAO avec Mysql
<div>
<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/f287cfc9-d57e-4703-8b73-281b8adf97ef.png" width="300" height="200">
<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/aa59d638-494f-4a7f-9901-0168a9342270.png" width="300" height="200">
<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/8d3eb9c5-6963-4151-9624-4a013c236a2e.png" width="300" height="200">
</div>
- Création de la couche DTOs et service

<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/1c132f5b-8dee-4580-a858-5d08708e8abb.png" width="1000" height="500">
<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/6b67ee5c-bd5e-4a20-a73b-7ea65d1b701a.png" width="1000" height="500">
- Création de la class RestController

<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/91f0b61b-d091-441f-a184-7448175978ff.png" width="1000" height="500">
- Test sur les web services Restful

<img src="https://github.com/HasnaElbacha/Digital-Banking/assets/92520540/646dd713-9ab5-4822-ad03-c17f6f61f335.png" width="1000" height="500">
