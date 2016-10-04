#Henge


## HTTPS:///api/pub/documentationedge


Henge - REST Endpoints



**Version** 0.9.1-SNAPSHOT

[**Terms of Service**]()












# APIs


## /v1/convenience/batch






### POST


<a id="batchInsert">Creates PropertyGroup, VersionSet and MappingGroup</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>yes</td>
    <td>Request body with PropertyGroup, VersionSet and MappingGroup</td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/Group">Group</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/files/current/{fileVersionName}


### GET

<a id="getCurrentVersion">Get the current version of a specific FileVersion.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/files/current/{fileVersionName}/{fileVersionVersion}




### PUT

<a id="setCurrentVersion">Set the current version of a specific FileVersion.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>fileVersionVersion</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |
















## /v1/files/update




### PUT

<a id="update">Update the file by FileVersion name and version. </a>









#### Request


**Content-Type: ** multipart/form-data

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/FileVersion">FileVersion</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |
















## /v1/files/upload






### POST


<a id="upload">Upload a File.</a>









#### Request


**Content-Type: ** multipart/form-data

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>multipart/form-data</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/files/{fileVersionName}


### GET

<a id="download">Download the latest version of a FileVersion by name.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/octet-stream


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/FileVersion">FileVersion</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |









### DELETE

<a id="delete">Delete all versions of a FileVersion by name.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/FileVersion">FileVersion</a>|
| 204    | SUCCESS | <a href="#/definitions/FileVersion">FileVersion</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/files/{fileVersionName}/versions


### GET

<a id="versions">Return a set of version numbers associated with a FileVersion by name.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/files/{fileVersionName}/versions/ceiling


### GET

<a id="readLatestVersionNumber">Read the latest version number of a FileVersion by name.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>plain/text</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** plain/text


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/FileVersion">FileVersion</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/files/{fileVersionName}/versions/{fileVersionVersion}


### GET

<a id="download">Download the file by FileVersion name and version. </a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>fileVersionVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/octet-stream


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/FileVersion">FileVersion</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |









### DELETE

<a id="delete">Delete a FileVersion by name and version.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>fileVersionName</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>fileVersionVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>fileVersionVersion</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/FileVersion">FileVersion</a>|
| 204    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/files/{versionSetName}/{versionSetVersion}/{fileName}


### GET

<a id="downloadFromVersionSet">Download the file by VersionSet name, VersionSet version and file name</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>versionSetVersion</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>fileName</th>
    <td>path</td>
    <td>yes</td>
    <td></td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/octet-stream


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| default    | successful operation |  - |


















## /v1/mapping


### GET

<a id="readAllMappings">Retrieves the list of all the Mapping entries.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="setMapping">Creates a new entry or updates an existing one in the Mapping of Scopes to VersionSetReferences.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>application</th>
    <td>query</td>
    <td>no</td>
    <td>application</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>scopeString</th>
    <td>query</td>
    <td>no</td>
    <td>scopeString</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/VersionSetReference">VersionSetReference</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 203    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="deleteMapping">Removes the entry from the Mapping of Scopes to VersionSetReferences.</a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>application</th>
    <td>query</td>
    <td>no</td>
    <td>application</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>scopeString</th>
    <td>query</td>
    <td>no</td>
    <td>scopeString</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response




| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 203    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/property-groups






### POST


<a id="create">Create a PropertyGroup.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PropertyGroup">PropertyGroup</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/property-groups/{propertyGroupName}




### PUT

<a id="update">Update a PropertyGroup by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/PropertyGroup">PropertyGroup</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 203    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a PropertyGroup by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 204    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/property-groups/{propertyGroupName}/versions


### GET

<a id="versions">Return a set of version numbers associated with a PropertyGroup by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/property-groups/{propertyGroupName}/versions/ceiling


### GET

<a id="readLatestVersionNumber">Gets the latest version number of a PropertyGroup by name. </a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>plain/text</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** plain/text


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/property-groups/{propertyGroupName}/versions/latest


### GET

<a id="readLatest">Get the latest PropertyGroup.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/property-groups/{propertyGroupName}/versions/{propertyGroupVersion}


### GET

<a id="read">Get a PropertyGroup by name and version. </a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>propertyGroupVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |









### DELETE

<a id="delete">Delete a PropertyGroup by name and version.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>propertyGroupName</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>propertyGroupVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupVersion</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/PropertyGroup">PropertyGroup</a>|
| 204    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/search/{application}


### GET

<a id="findMatches">Gets the Application properties and internal libraries properties within given precedence scopes. </a>









#### Request



##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>application</th>
    <td>path</td>
    <td>yes</td>
    <td>application</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>scopes</th>
    <td>query</td>
    <td>no</td>
    <td>scopes</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>libs</th>
    <td>query</td>
    <td>no</td>
    <td>libs</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** text/plain


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/Response">Response</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/version-sets






### POST


<a id="create">Create a VersionSet.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/VersionSet">VersionSet</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/version-sets/{versionSetName}


### GET

<a id="read">Read the latest version of a VersionSet by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="update">Update a VersionSet.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/VersionSet">VersionSet</a> 
    </td>

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/VersionSet">VersionSet</a>|
| 203    | SUCCESS |  - |
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a VersionSet.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/VersionSet">VersionSet</a>|
| 204    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/version-sets/{versionSetName}/versions


### GET

<a id="versions">Return a set of version numbers associated with a VersionSet by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/version-sets/{versionSetName}/versions/ceiling


### GET

<a id="readLatestVersionNumber">Read the latest version number of a VersionSet by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>plain/text</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** plain/text


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/version-sets/{versionSetName}/versions/{versionSetVersion}


### GET

<a id="read">Get a VersionSet by name and version. </a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>versionSetVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |









### DELETE

<a id="delete">Delete a VersionSet by name.</a>









#### Request


**Content-Type: ** application/json

##### Parameters

<table border="1">
    <tr>
        <th>Name</th>
        <th>Located in</th>
        <th>Required</th>
        <th>Description</th>
        <th>Default</th>
        <th>Schema</th>
    </tr>



<tr>
    <th>versionSetName</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetName</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>versionSetVersion</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetVersion</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>ACCEPT</th>
    <td>header</td>
    <td>yes</td>
    <td>ACCEPT</td>
    <td>application/json</td>

    
            <td>string </td>
    

</tr>


</table>



#### Response

**Content-Type: ** application/json


| Status Code | Reason      | Response Model |
|-------------|-------------|----------------|
| 200    | successful operation | <a href="#/definitions/VersionSet">VersionSet</a>|
| 204    | SUCCESS | <a href="#/definitions/VersionSet">VersionSet</a>|
| 400    | INVALID REQUEST |  - |
| 401    | UNAUTHENTICATED |  - |
| 403    | UNAUTHORIZED |  - |
| 404    | NOT FOUND |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |













# Definitions

## <a name="/definitions/Chronology">Chronology</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>id</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>calendarType</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/FileVersion">FileVersion</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique property-group name.</td>
            <td>pet-store-edge</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
        </tr>
    
        <tr>
            <td>description</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>File description.</td>
            <td>Attached csv format file on property group.</td>
        </tr>
    
        <tr>
            <td>content</td>
            <td>
                
                
                array[string]
                
            </td>
            <td>required</td>
            <td>The content file in bytes.</td>
            <td></td>
        </tr>
    
        <tr>
            <td>filename</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>createdDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/FileVersionReference">FileVersionReference</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Group">Group</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>versionSetList</td>
            <td>
                
                
                    array[<a href="#/definitions/VersionSet">VersionSet</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>propertyGroupList</td>
            <td>
                
                
                    array[<a href="#/definitions/PropertyGroup">PropertyGroup</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>mappingList</td>
            <td>
                
                
                    array[<a href="#/definitions/MappingGroup">MappingGroup</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/LocalDateTime">LocalDateTime</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>dayOfYear</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>dayOfWeek</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>month</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>dayOfMonth</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>year</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>monthValue</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>hour</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>minute</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>second</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>nano</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>chronology</td>
            <td>
                
                    <a href="#/definitions/Chronology">Chronology</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/MappingGroup">MappingGroup</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>application</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>scopeString</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>vsReference</td>
            <td>
                
                    <a href="#/definitions/VersionSetReference">VersionSetReference</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Property">Property</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique property name.</td>
            <td>pet-store-application-name</td>
        </tr>
    
        <tr>
            <td>description</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>property description.</td>
            <td>The name of the pet-store application.</td>
        </tr>
    
        <tr>
            <td>defaultValue</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>property's default value.</td>
            <td>Default-PetStore application.</td>
        </tr>
    
        <tr>
            <td>propertyScopedValues</td>
            <td>
                
                
                    array[<a href="#/definitions/PropertyScopedValue">PropertyScopedValue</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>Set of unique property-scoped-values associated with this property.</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PropertyGroup">PropertyGroup</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique property-group name.</td>
            <td>pet-store-edge</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
        </tr>
    
        <tr>
            <td>description</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>property-group description.</td>
            <td>Property group for the pet-store-edge&#x27;s service properties.</td>
        </tr>
    
        <tr>
            <td>type</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>property-group type.</td>
            <td>APP</td>
        </tr>
    
        <tr>
            <td>active</td>
            <td>
                
                    
                    boolean
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>createdDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>properties</td>
            <td>
                
                
                    array[<a href="#/definitions/Property">Property</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>The property-group's associated properties.</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PropertyGroupReference">PropertyGroupReference</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/PropertyScopedValue">PropertyScopedValue</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>value</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>A property-scoped-value's value.</td>
            <td>Development-PetStore application.</td>
        </tr>
    
        <tr>
            <td>scopeSet</td>
            <td>
                
                
                    array[<a href="#/definitions/Scope">Scope</a>]
                
                
                
            </td>
            <td>required</td>
            <td>Set of unique scopes that identify when this value should be used to evaluate the property.</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Response">Response</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>status</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>entity</td>
            <td>
                
                    
                    object
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>metadata</td>
            <td>
                
                    
                    object
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Scope">Scope</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>key</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>A single scope key.</td>
            <td>env</td>
        </tr>
    
        <tr>
            <td>value</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>A single scope value.</td>
            <td>dev</td>
        </tr>
    
</table>

## <a name="/definitions/VersionSet">VersionSet</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique property-group name.</td>
            <td>pet-store-edge</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
        </tr>
    
        <tr>
            <td>description</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>version-set description.</td>
            <td>This version-set contains all the versioned property-groups for the pet-store application.</td>
        </tr>
    
        <tr>
            <td>createdDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>propertyGroupReferences</td>
            <td>
                
                
                    array[<a href="#/definitions/PropertyGroupReference">PropertyGroupReference</a>]
                
                
                
            </td>
            <td>required</td>
            <td>The property-group references that are associated with this version-set.</td>
            <td></td>
        </tr>
    
        <tr>
            <td>fileVersionReferences</td>
            <td>
                
                
                    array[<a href="#/definitions/FileVersionReference">FileVersionReference</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>The file version references that are associated with this version-set.</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/VersionSetReference">VersionSetReference</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>


