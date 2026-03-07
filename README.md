# Objectif :
 Créer une application Web JEE basée sur Spring, Spring Data JPA, Hibernate, Tymeleaf et Spring Security qui permet de gérer des produits
# 1. Créer un projet Spring Boot avec les dépendances : 
### Spring Web, Spring Data JOA, H2, MySQL, Thymeleaf, Lombock, Spring Security, Spring Validation
<img width="764" height="607" alt="image" src="https://github.com/user-attachments/assets/c7ea251d-ffc0-4d63-8af8-448ea62783ea" />

# 2. Créer l'entité JPA Product
<img width="701" height="486" alt="image" src="https://github.com/user-attachments/assets/2af7e3b9-49b2-4193-99b8-aba9e95a5956" />

# 3. Créer l'interface ProductRepository basée sur Spring Data
<img width="733" height="176" alt="image" src="https://github.com/user-attachments/assets/17dfe1b9-60d7-4a91-a86b-4484bbb4f60e" />

# 4.Tester la couche DAO
<img width="762" height="491" alt="image" src="https://github.com/user-attachments/assets/6608f3a4-c08c-4c4a-ab93-ff89cbd10bd2" />
<img width="789" height="391" alt="image" src="https://github.com/user-attachments/assets/d5c200fa-0e9c-4ca4-b71e-f6823bfb7709" />

# 5. Désactiver la protection par défaut de spring security
<img width="548" height="59" alt="image" src="https://github.com/user-attachments/assets/1efc730a-76eb-413d-91bf-7958cdadc3de" />

# 6. Créer le contrôleur spring MVC et les vues thymeleaf pour 
## 6.1. Affichier la liste des produits
<img width="677" height="230" alt="image" src="https://github.com/user-attachments/assets/257db0e6-ed37-421a-80ef-0ea3fe1f3688" />
<img width="866" height="614" alt="image" src="https://github.com/user-attachments/assets/0f53189a-4727-4d52-a5d3-3427fd379da8" />


## 6.2. Supprimer un produit
<img width="604" height="671" alt="image" src="https://github.com/user-attachments/assets/9c616278-0608-4433-b357-ed21efddb9b5" />
<img width="470" height="135" alt="image" src="https://github.com/user-attachments/assets/f1a03167-0f57-4482-96c8-8ec0b1430d34" />

## 6.3. Page template basée sur Thymeleaf layout et bootstrap
layout.html

<img width="804" height="476" alt="image" src="https://github.com/user-attachments/assets/3b85dc7e-f79a-48ce-9a69-74efd01554ac" />

fragment:content1

<img width="791" height="310" alt="image" src="https://github.com/user-attachments/assets/84614e75-d1e2-432c-8d77-7c141b899da3" />

<img width="1226" height="347" alt="image" src="https://github.com/user-attachments/assets/37da15f3-0085-4984-a3de-37936a9ba271" />


## 6.4. Saisir et ajouter un produit avec la validation du formulaire
Boutton d'ajout

<img width="600" height="67" alt="image" src="https://github.com/user-attachments/assets/50e40bdc-97d4-4c34-b526-71eca0040571" />

Form HTML

<img width="658" height="400" alt="image" src="https://github.com/user-attachments/assets/e2b1760e-3f1b-4fe2-885a-a3f2d6d528a5" />

Actions de controller

<img width="755" height="291" alt="image" src="https://github.com/user-attachments/assets/5ff58c1e-4208-4502-8714-8db5aea20af1" />


Validation

<img width="568" height="205" alt="image" src="https://github.com/user-attachments/assets/39fb238c-192c-4101-a1ce-2e0552b3f30b" />

Ajout sans problème

<img width="304" height="223" alt="image" src="https://github.com/user-attachments/assets/fb8c6024-2805-4928-ae1a-15fca069fd24" />
<img width="637" height="291" alt="image" src="https://github.com/user-attachments/assets/0c941c55-9300-4077-a2de-6f0ca0e563fd" />


# 7. Sécuriser l'application avec Spring Security
Les dépendances

<img width="474" height="91" alt="image" src="https://github.com/user-attachments/assets/64562563-9143-46c6-b193-af07c1598182" />
<img width="505" height="94" alt="image" src="https://github.com/user-attachments/assets/94a54c53-5821-4320-a0fb-dc77a11ff68a" />

Activer la Sécurité

<img width="1286" height="252" alt="image" src="https://github.com/user-attachments/assets/da3de386-0f89-47d9-86a2-da4d2f30bbd2" />

Personnaliser la configuration par défaut

<img width="1187" height="582" alt="image" src="https://github.com/user-attachments/assets/997369b3-5c0e-4dfc-ba1f-4cfa40e3dde1" />
<img width="643" height="63" alt="image" src="https://github.com/user-attachments/assets/2dab000c-937d-469b-a7b5-49ff06ca3f69" />


# 8. Ajouter d'autres fonctionalités supplémentaires :
## 8.1. Recherche des produits
<img width="987" height="185" alt="image" src="https://github.com/user-attachments/assets/ce621018-6e30-4879-9691-66b70f5f179e" />

<img width="750" height="73" alt="image" src="https://github.com/user-attachments/assets/186cd30b-93f1-4e63-92ab-67d455735ad7" />

<img width="938" height="303" alt="image" src="https://github.com/user-attachments/assets/ce89ed16-052b-41af-b16a-1243b308f524" />

<img width="658" height="182" alt="image" src="https://github.com/user-attachments/assets/79b5ed67-1ab4-4433-b215-706828b928d9" />

## 8.2. Edition et mise à jour d'un produit
form edit

<img width="820" height="469" alt="image" src="https://github.com/user-attachments/assets/472c854f-566e-42d1-9d0d-180e3287bcb7" />

methodes de controlleur

<img width="649" height="282" alt="image" src="https://github.com/user-attachments/assets/269c073f-26db-4c00-a46a-96df65b91894" />

<img width="657" height="228" alt="image" src="https://github.com/user-attachments/assets/d255a4ac-813a-41ac-b035-0447aaeee0fc" />

## 8.3 Page login

login.html

<img width="846" height="593" alt="image" src="https://github.com/user-attachments/assets/0e3d9024-8a73-47ee-be41-80a47bf9a768" />

actions de controlleur

<img width="526" height="256" alt="image" src="https://github.com/user-attachments/assets/2a46a21a-14db-40a2-818e-7b36f41a56d8" />

SecurityConfig

<img width="1128" height="275" alt="image" src="https://github.com/user-attachments/assets/77617788-db24-44e9-aebd-a987f412dc1b" />

<img width="1361" height="393" alt="image" src="https://github.com/user-attachments/assets/9ff706f2-4040-4f68-b6bf-659ade588364" />

