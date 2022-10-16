# Requirements

## Index

* [Problem Description](#Item0)
* [Main objective](#Item1)
* [User Profile](#Item2)
* [Scope and limitations of the project](#Item3)
* [Functional Requirements](#Item4)
* [Requerimientos No Funcionales](#Item5)

## Problem Description
Suarez Agency has been active for the last 30 years having the documentation required for the departure of commercial fishing vessels. 
Problem is, with each license that is processed, official documentation is accumulated regarding the vessels, composed by: Certificado Nacional de Seguridad Marítima, Certificado Nacional de Matricula, Permisos de Pesca, as well as the official documentations of the crew. 

Due to this, the time it takes to process the documentation, which is also computed manually on a template, is quite long. Furthermore, most of the documents are valid, therefore, a verification step is required, which ends up lengthening the process. 

This opportunity was discovered by one of the team members, who is a close relative of the head of the Agency, and this made it easier for us to approach them in order to help solve these problems.

## Main objective 

Our project’s main goal is to help the Agency streamline the documentation process and alleviate the burden, both physical and virtual. All to optimize times in the processing of documents. For this, a system will be developed in which the user can store the required information and documentation. To be able to access them, update them and export them to a template that will be generated automatically. 

<a name="Item2"></a>

## User Profile 

The beneficiary of this program will be the Head of the Suarez Agency, Civil Engineer Luis Andrés Suárez Quezada, 62 years old, a service provider with authorization of the SEMAR (Secretaría de Marina), Shipping Agent.

<a name="Item3"></a>

## Scope and limitations of the project 

### Scope 

1.The Software will save data of the official documentation that will be shown in the final documentation
   
2.The Software can show user the saved data

3.The Software can edit the saved data

4.The Software can display a notification in the menú when any data expires
   
### Limitations 

1.The data will be stored locally, either on the device or on some external memory.

2.The Software cannot create new fields

3.The Software can only edit, delete and create a on documentation at a time
 

## User Stories

| US_1 ||
|----------|-------------|
| Priority | High |
| User story | As a Shipping Agent, I want a button to add new ship/client so that I can record the information included in the official documents |
| Acceptance Criteria | - Display ‘New ship/client’ button on the right upper corner of the main area. <br /> - 'New ship/client' button takes the user to the 'Register' area. <br /> - 'Register' area includes empty boxes (or fields) that describe the information they should carry. <br /> - User should be able to type the information in each text box after clicking on it. <br /> - Display 'Save' button on the right bottom corner of the 'Register' area. <br /> User can click on 'Save' button to save the information. <br /> - 'Save' button should be inactive until all boxes are full. <br /> - 'Save' button becomes active when all boxes are full. <br /> - A notification pop ups notifying that the information bas been registered. <br /> - Notification display 'Back' and 'Kepp editing' button. <br /> - 'Back' button takes the user to the main area <br /> - 'Keep editing' button returns the user to the current 'Register' area. ||

| US_2 ||
|----------|-------------|
| Priority | High |
| User story | As a Shipping Agent, I want a searching bar so that I can find any ship/client from the system. |
| Acceptance Criteria | - Display a search bar on the left upper corner of the main area. <br /> - User should be able to type the name of the ship/client on the searching box after clicking on it. <br /> - Display a 'Search' button next to the search bar box. <br /> - User can click on the 'Search' button or type Enter to command the searching. <br /> - 'Search' button/Enter takes the user to the 'Results' area. <br /> - 'Results' area shows coincidences between the user input and ship/client from system. <br /> - User can click on any result. This action takes the user to the 'Register' area of that ship/client. <br /> - Display 'Back' button on the right bottom corner of the 'Results' area. <br /> - 'Back' button takes the user to the main area. ||

| US_3 ||
|----------|-------------|
| Priority | Medium |
| User Story | As a Shipping Agent, I want a button to edit the information of the selected ship so that I can update the information of it. |
| Acceptance Criteria | - User can select the ship/client that he wants to edit. This action will take the user to the 'Register' area of that client/ship. <br /> - User should be able to edit the information inside of the boxes. <br /> - User can save the updated information following the same steps from the US_1. ||

| US_4 ||
|----------|-------------|
| Priority | Medium |
| User Story | As a Shipping Agent, I want a button to show the expired validities so that I know which information needs to be updated. |
| Acceptance Criteria | - Display 'Expired Validities' button below the main area. <br /> -'Expired Validities' button takes the user to the 'Expired' area. <br /> - 'Expired' area display a list of the ships which have expired documents. <br /> - User should be able to select a ship to know which documents were expired. <br /> - 'Expired' area display 'Back' button on the left botton corner. <br /> - 'Back' button takes the user to the main area. ||

| US_4 ||
|-----------|------------|
| Priority | Medium |
| User Story | As a Shipping Agent, I want a button to delete so that I can remove all the information of the selected ship/client |
| Acceptance Criteria | - User can select the ship/client that he wants to remove. This action will take the user to the 'Register' area of that client/ship. <br /> - Display a 'Delete' button on the left bottom corner of the 'Register' area. <br /> - 'Delete' button summons a confirm dialog. <br /> - Confirm dialog display 'Cancel' and 'OK' buttons. <br /> - User should be able to select 'Cancel' or 'OK'. <br /> -'Cancel' button cancels the action and closes the confirm dialog. <br /> -'Delete' button removes all the ship/client information and takes the user to the main area. ||

| US_5 ||
|-----------|------------|
| Priority | Low |
| User Story | As a Shipping Agent, I want a 'Recycle bin' button so that I can restore or permanently delete information |
| Acceptance Criteria | -Display 'Recycle bin' button below the main area. <br /> -'Recycle bin' button takes the user to the 'Recycle' area. <br /> -'Recycle' area display list of the deleted clients/ships. <br /> - Each element of the list displays 'Delete permanently' and 'Restore' buttons. <br /> -'Delete permanently' button permanently delete the information. <br /> - 'Restore' button restores the information to the system. <br /> -Displays a 'Back' button on the left bottom corner of the 'Recycle' area. <br /> -'Back' button takes the user to the main area. ||

## Functional Requirements

| FR_01 ||
|----------| ------ | 
| Priority | High  |
| Description | A client list must be generated when the program is launched, it should display the basic information of each one like the name, creation date, last modification date, and the number of assigned watercraft. |

| FR_02 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will have an option to add or delete clients from the system. |

| FR_03 ||
|----------| ------ | 
| Priority | Medium  |
| Description | The program will have a search bar for finding any client from the system. |

| FR_04 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will have an option to add or delete any watercraft for each client that is registered in the system, it would also have an option to modify the information of existing watercrafts. |

| FR_05 ||
|----------| ------ | 
| Priority | Medium  |
| Description | The program will have an option to show all the expired documents and to which watercraft it belongs. |

| FR_06 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will have an option to generate a PDF document of the exit permit or the clearance stamp for each watercraft using the information they have registered in the system. |

| FR_07 ||
|----------| ------ | 
| Priority | Low |
| Description | The program will have an option to access the recently deleted elements (clients or watercrafts) for restoring them or deleting them permanently. |

## No Functional Requirements

| NFR_01 ||
|----------| ------ | 
| Priority | Medium  |
| Description | The program will be safe and secure, avoiding all the situations that could endanger the information of the user such as information deletion. |

| NFR_02 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will be scalable, allowing for any modification that the stakeholder requires. |

| NFR_03 ||
|----------| ------ | 
| Priority | Medium  |
| Description | The program will be intuitive and easy to use, primarily focused on the use of elderly people. |

| NFR_04 ||
|----------| ------ | 
| Priority | Medium  |
| Description | The program will be highly efficient with the use of data and general performance, assuring a time response of less than 3s for each action done like storing data. |

| NFR_05 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will be reliable with the use of data, avoiding any discrepancies and having continuity whit the data stored. |

| NFR_06 ||
|----------| ------ | 
| Priority | High  |
| Description | The program will be integral, fulfilling all the functions and avoiding having useless characteristics considering the whole purpose of the program. |

## Diagram Use case
![Diagram](/Media/UseCaseDiagramBarquis.png)
