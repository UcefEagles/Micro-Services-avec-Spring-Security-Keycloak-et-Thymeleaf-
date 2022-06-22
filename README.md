# SpringSecurity_Keycloack

# Mise en place du service de Sécurité avec Keycloak
    Mettre en place le serveur d’authentification OAuth2 Keycloak version 12.0.1 ,Création de Realm ,Création 
 les rôles (USER, ADMIN, PRODUCT_MANAGER, CUSTOMER_MANAGER et BILLING_MANAGER) et Affecter les rôles aux utilisateurs ...
 
 
 ![image](https://user-images.githubusercontent.com/97621443/173698572-7b5a208a-5382-412e-80fa-12eccbecb2d5.png)

 

![image](https://user-images.githubusercontent.com/97621443/173698587-951a84f6-5418-4977-b558-924918a2c5b6.png)


![image](https://user-images.githubusercontent.com/97621443/173698598-e460064f-6ba9-4f5d-863e-81d496c46207.png)


//

![image](https://user-images.githubusercontent.com/97621443/173701321-998bd1f3-f4b8-476c-b06f-f8570178048c.png)


En utilissant Advanced Rest Client:

      Acces_Token user1:
      
![image](https://user-images.githubusercontent.com/97621443/173701345-7c5a2a78-b787-4c0e-bcd4-2ff02641f97d.png)


      JWT:
      
![image](https://user-images.githubusercontent.com/97621443/173701529-80893a34-9057-419f-8ae2-80a3acdfce2f.png)


 #Customers:
 
 
         Partie d'implementation:
         
         
         
            Configuration:
            
            ![image](https://user-images.githubusercontent.com/97621443/173703729-60b81ab3-b4fa-46ed-bd74-d30c4df4289b.png)

            
            
            Class Adapter Config:
            
![image](https://user-images.githubusercontent.com/97621443/173703827-824d8f51-20fe-4b58-a635-73e8f367f24f.png)
            
            
            
            
 `          Class Keycloak Security Config:
 
 ![image](https://user-images.githubusercontent.com/97621443/173703968-e738be58-5ee0-4a4c-8b26-6d385534dd99.png)

            
            
 
         
Details de user:

![image](https://user-images.githubusercontent.com/97621443/173701579-9b13c5f3-a65f-422e-a555-e0eeb5676123.png)

Test (Echec) :

![image](https://user-images.githubusercontent.com/97621443/173701717-74db2ff0-242f-40c0-95e0-0bb1725d8ef7.png)


Test via acces tokens:


![image](https://user-images.githubusercontent.com/97621443/173701738-94319936-d2c3-4674-ba5e-bd781de8944d.png)


#Billing Service:

            Partie d'implementation:
         
            Configuration:
            
![image](https://user-images.githubusercontent.com/97621443/173703064-a43f08ce-b5b2-42df-9a3c-860ab019f2f5.png)

             Class Adapter Config:
             

![image](https://user-images.githubusercontent.com/97621443/173703125-06bc307c-b766-427c-8aba-f90eb0882f54.png)


             Class Keycloak Security Config:
             
 ![image](https://user-images.githubusercontent.com/97621443/173703387-dcb8e826-97d0-4679-aa17-767605283752.png)

             







![image](https://user-images.githubusercontent.com/97621443/173701859-e792c332-8fd4-4ada-aab8-2fc058e8628f.png)


Recuperation acces tokens:

![image](https://user-images.githubusercontent.com/97621443/173701894-d8724bdb-4170-42f7-b030-fd22db1a5803.png)

![image](https://user-images.githubusercontent.com/97621443/173701993-d1922fce-a2b4-487b-8818-f2d434e0e8fd.png)


![image](https://user-images.githubusercontent.com/97621443/173702039-89512add-f7a9-41b8-8e0f-a1063491ca3d.png)


![image](https://user-images.githubusercontent.com/97621443/173702079-d6fc97fd-7116-4cdc-977a-2d48b7d2415a.png)

la même chose pour /bills:


![image](https://user-images.githubusercontent.com/97621443/173702269-07ed7278-fa76-4d5e-8937-c3b975507cc6.png)



![image](https://user-images.githubusercontent.com/97621443/173702296-b8b3d314-2793-4cc1-805a-4b46095b9138.png)


# Front End

une application Web Front End qui permet de gérer les produits, les clients et les 
factures  en utilisant le Framework Spring MVC avec Thymeleaf et sécuriser par Keycloak:

Mise en place :

    #Thymeleaf:
            est un Java XML/XHTML/HTML5 Template Engine qui peut travailler à la fois dans des environnements Web (Servlet) et celui de non Web. Il est mieux adapté pour diffuser XHTML/HTML5 sur View (View Layer) des applications Web basées sur MVC. Mais il peut traiter n'importe quel fichier XML même dans des environnements hors ligne (offline). Il fournit une intégration complète de Spring Framework.
            

![image](https://user-images.githubusercontent.com/97621443/173706473-024ac3ca-0d0d-4e0b-8ac7-f3006613e8af.png)
 
 ![image](https://user-images.githubusercontent.com/97621443/173706668-28fc0f3d-f001-4425-93f7-2e4822619c92.png)
 
 Test:
 
 ![image](https://user-images.githubusercontent.com/97621443/173707294-f698e286-a4b7-48db-a339-837d8f0859d1.png)
 
 ![image](https://user-images.githubusercontent.com/97621443/173707345-5f9c8d82-4cb8-46fc-aed1-cb5bba907700.png)


![image](https://user-images.githubusercontent.com/97621443/173707543-a57a6521-7b8e-42ef-b2f5-dbcbdc7f22be.png)

![image](https://user-images.githubusercontent.com/97621443/173707591-62c40a40-296e-407b-828e-d410905a28ce.png)

Les Produits:


![image](https://user-images.githubusercontent.com/97621443/173707753-1f790694-22ce-40dd-b1a4-a4a0d60684d9.png)


















