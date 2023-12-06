## Commande pour lancer Vault
> vault server -dev  
### Mise en oeuvre des micro-services avec Spring Cloud : 
![Architecture](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/3efe9bee-3e6d-4a9c-b25c-222194298f7a)
#### Config Service : 
ou on a centraliser la configuration de nos microServices dans un service :
 ![ConfigService](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/e24f2c34-ebfb-4b52-a0e9-18b7d34d11aa)
Exemple :  
![ConfigService2](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/3bad365a-a238-47f8-9b4a-9ea8e000c134)

### Utilisation du consul comme étant un service de découverte, de surveillance et de configuration pour les architectures de microservices.
![Consul](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/5c46e8c0-81ab-4a50-8a53-fc57a41c1df7)
Configuration des parametres : 
![ConsulParam](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/daf23140-ee09-4c38-ba10-03ee8f3b9ce7)
![ConsulParamAff](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/ef99596b-e845-40c8-aa2b-74f64277e8af)
### Utilisation de vault comme étant service qui permet de partager les secrets aux différents composants d’une application distribuée
#### Lors du demmarage vous copiez le Token pour s'authentifier a Vault
![vaultSignIn](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/0e9814be-3cc0-495d-9ecf-930db641d27a)
1) Creation des Params
![vaultCreateParam](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/96221c14-e7bd-4dfd-8668-d39f90eaa0c4)
![VaultParam](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/41e697bd-81ff-4272-b1c5-08a333dfa239)
![VaultParamAff](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/16339d80-b9e6-4150-b199-05db778c14c3)

2) envoyer les Params
![VaultParamC](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/2a1f8050-3e11-4a6f-9fb7-da17f1308d47)
visualiser les Params en tant que client
![VaultParam2](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/6ce3d93b-de77-43ac-860d-70e486d20735)

## Partie FrontEnd (Angular)
### Interaction avec la partie back end 
#### Récuperation des Produits :
![RecupererProduits](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/8d9752df-dc9d-4eb4-844a-3278fdcac502)
#### Récuperation des Commandes : 
![RecupererOrders](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/eec8c5ec-475b-4c5f-a121-d36b52c64e43)
#### Récuperation details des commandes : 
![RecupererDetailsOrders](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/b8d6c619-d43d-468a-8389-5d970611cf5b)
#### Exemple d'un Formulaire Html :
![ExempleFormulaire](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/48540161-6aed-4e33-9964-acb855e15d51)

## Captures de L'application :
![Capture1App](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/1cd30c52-32ad-4d1f-afb6-2bb7296dafba)
![Capture2App](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/7b32cb9e-d691-4f35-b176-a4edd13f0162)
![Capture3App](https://github.com/Bouchghel/Architectures-Micro-services-avec-Spring-Cloud/assets/93221225/9a144c68-cb56-4169-987c-29155aa2d7fb)
