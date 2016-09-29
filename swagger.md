#Henge


## HTTPS:///api/pub/documentationedge


Henge - REST Endpoints



**Version** 0.0.1-SNAPSHOT

[**Terms of Service**]()












# APIs


## /v1/property-groups


### GET

<a id="search">Search for PropertyGroup(s).</a>









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
    <th>searchString</th>
    <td>query</td>
    <td>yes</td>
    <td>search string</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td>page size</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td>page number</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>sortColumns</th>
    <td>query</td>
    <td>no</td>
    <td>sort columns</td>
    <td> - </td>

    
            <td>Array[string] (csv)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/property-groups/${groupId}/versions


### GET

<a id="versions">Return a set of version numbers associated with a PropertyGroup based on a PropertyGroupId.</a>









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
    <th>groupId</th>
    <td>path</td>
    <td>yes</td>
    <td>groupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/property-groups/${groupId}/versions/${version}


### GET

<a id="exportPropertyGroup">Export a PropertyGroup which can be imported into another instance of Henge.</a>









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
    <th>groupId</th>
    <td>path</td>
    <td>yes</td>
    <td>groupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>version</th>
    <td>path</td>
    <td>yes</td>
    <td>version</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>includeScopeSchema</th>
    <td>query</td>
    <td>no</td>
    <td>includeScopeSchema</td>
    <td> - </td>

    
            <td>boolean </td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/property-groups/import






### POST


<a id="importPropertyGroup">Import a PropertyGroup which was exported from another instance of Henge.</a>









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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/property-groups/import-legacy






### POST


<a id="importLegacyPropertyGroup">Import a legacy PropertyGroup which was Exported from the legacy ConfigMiddle service.</a>









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
    
    <a href="#/definitions/LegacyPropertyGroup">LegacyPropertyGroup</a> 
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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/property-groups/{propertyGroupId}


### GET

<a id="read">Read a PropertyGroup based on PropertyGroupId.</a>









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
    <th>propertyGroupId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="update">Update a PropertyGroup.</a>









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
    <th>propertyGroupId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a PropertyGroup by PropertyGroupId.</a>









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
    <th>propertyGroupId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/property-groups/{propertyGroupId}/properties


### GET

<a id="search">Search for Property(s).</a>









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
    <th>searchString</th>
    <td>query</td>
    <td>yes</td>
    <td>search string</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td>page size</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td>page number</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>sortColumns</th>
    <td>query</td>
    <td>no</td>
    <td>sort columns</td>
    <td> - </td>

    
            <td>Array[string] (csv)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Property">Property</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### POST


<a id="create">Create a Property.</a>









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
    <th>propertyGroupId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/Property">Property</a> 
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
| 200    | SUCCESS | <a href="#/definitions/Property">Property</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/property-groups/{propertyGroupId}/properties/{propertyId}


### GET

<a id="read">Read a Property based on PropertyId.</a>









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
    <th>propertyId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Property">Property</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="update">Update a Property.</a>









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
    <th>propertyGroupId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyGroupId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>propertyId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/Property">Property</a> 
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
| 200    | SUCCESS | <a href="#/definitions/Property">Property</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a Property by PropertyId.</a>









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
    <th>propertyId</th>
    <td>path</td>
    <td>yes</td>
    <td>propertyId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Property">Property</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/scope-schemas


### GET

<a id="search">Search for ScopeSchema(s).</a>









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
    <th>searchString</th>
    <td>query</td>
    <td>no</td>
    <td>search string</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td>page size</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td>page number</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>sortColumns</th>
    <td>query</td>
    <td>no</td>
    <td>sort columns</td>
    <td> - </td>

    
            <td>Array[string] (csv)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/ScopeSchema">ScopeSchema</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### POST


<a id="create">Create a ScopeSchema.</a>









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
    
    <a href="#/definitions/ScopeSchema">ScopeSchema</a> 
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
| 200    | SUCCESS | <a href="#/definitions/ScopeSchema">ScopeSchema</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/scope-schemas/{scopeSchemaId}


### GET

<a id="read">Read a ScopeSchema based on ID.</a>









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
    <th>scopeSchemaId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeSchemaId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/ScopeSchema">ScopeSchema</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="update">Update a ScopeSchema.</a>









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
    <th>scopeSchemaId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeSchemaId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/ScopeSchema">ScopeSchema</a> 
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
| 200    | SUCCESS | <a href="#/definitions/ScopeSchema">ScopeSchema</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a ScopeSchema.</a>









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
    <th>scopeSchemaId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeSchemaId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/ScopeSchema">ScopeSchema</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/scope-schemas/{scopeSchemaId}/scopes


### GET

<a id="search">Search for Scope(s).</a>









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
    <th>searchString</th>
    <td>query</td>
    <td>yes</td>
    <td>search string</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td>page size</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td>page number</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>sortColumns</th>
    <td>query</td>
    <td>no</td>
    <td>sort columns</td>
    <td> - </td>

    
            <td>Array[string] (csv)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Scope">Scope</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### POST


<a id="create">Create a Scope.</a>









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
    <th>scopeSchemaId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeSchemaId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/Scope">Scope</a> 
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
| 200    | SUCCESS | <a href="#/definitions/Scope">Scope</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/scope-schemas/{scopeSchemaId}/scopes/{scopeId}


### GET

<a id="read">Read a Scope based on ID.</a>









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
    <th>scopeId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Scope">Scope</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |





### PUT

<a id="update">Update a Scope.</a>









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
    <th>scopeId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

</tr>

<tr>
    <th>body</th>
    <td>body</td>
    <td>no</td>
    <td></td>
    <td> - </td>

    <td>
    
    <a href="#/definitions/Scope">Scope</a> 
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
| 200    | SUCCESS | <a href="#/definitions/Scope">Scope</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







### DELETE

<a id="delete">Delete a Scope.</a>









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
    <th>scopeId</th>
    <td>path</td>
    <td>yes</td>
    <td>scopeId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 200    | SUCCESS | <a href="#/definitions/Scope">Scope</a>|
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |












## /v1/version-sets


### GET

<a id="search">Search for VersionSet(s).</a>









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
    <th>searchString</th>
    <td>query</td>
    <td>yes</td>
    <td>search string</td>
    <td> - </td>

    
            <td>string </td>
    

</tr>

<tr>
    <th>pageSize</th>
    <td>query</td>
    <td>no</td>
    <td>page size</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>pageNumber</th>
    <td>query</td>
    <td>no</td>
    <td>page number</td>
    <td> - </td>

    
            <td>integer (int32)</td>
    

</tr>

<tr>
    <th>sortColumns</th>
    <td>query</td>
    <td>no</td>
    <td>sort columns</td>
    <td> - </td>

    
            <td>Array[string] (csv)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |







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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |















## /v1/version-sets/{id}


### GET

<a id="read">Read a VersionSet based on ID.</a>









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
    <th>versionSetId</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
| 409    | CONFLICT |  - |
| 500    | INTERNAL SERVER ERROR |  - |


















## /v1/version-sets/{versionSetId}




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
    <th>versionSetId</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
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
    <th>versionSetId</th>
    <td>path</td>
    <td>yes</td>
    <td>versionSetId</td>
    <td> - </td>

    
            <td>integer (int64)</td>
    

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
| 400    | BAD REQUEST |  - |
| 401    | UNAUTHORIZED |  - |
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

## <a name="/definitions/LegacyProperty">LegacyProperty</a>

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
            <td>description</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>type</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>legacyScopedPropertyValues</td>
            <td>
                
                
                    array[<a href="#/definitions/LegacyScopedPropertyValue">LegacyScopedPropertyValue</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/LegacyPropertyGroup">LegacyPropertyGroup</a>

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
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>type</td>
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
    
        <tr>
            <td>legacyProperties</td>
            <td>
                
                
                    array[<a href="#/definitions/LegacyProperty">LegacyProperty</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/LegacyScopedPropertyValue">LegacyScopedPropertyValue</a>

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
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>value</td>
            <td>
                
                    
                    string
                
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
            <td>nano</td>
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
            <td>chronology</td>
            <td>
                
                    <a href="#/definitions/Chronology">Chronology</a>
                    
                
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
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
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
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
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
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
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
            <td>properties</td>
            <td>
                
                
                    array[<a href="#/definitions/Property">Property</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>The property-group's associated properties.</td>
            <td></td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
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
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
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
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
        </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique scope name.</td>
            <td>environment</td>
        </tr>
    
        <tr>
            <td>ordinal</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>required</td>
            <td>The scopes position in the set of scopes.</td>
            <td>100</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/ScopeSchema">ScopeSchema</a>

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
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
        </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique scope-schema name.</td>
            <td>petstore-environments-scope-schema</td>
        </tr>
    
        <tr>
            <td>scopes</td>
            <td>
                
                
                    array[<a href="#/definitions/Scope">Scope</a>]
                
                
                
            </td>
            <td>optional</td>
            <td>Set of unique scopes associated with this scope-schema</td>
            <td>environment, stack, sub-env</td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>

## <a name="/definitions/Search">Search</a>

<table border="1">
    <tr>
        <th>name</th>
        <th>type</th>
        <th>required</th>
        <th>description</th>
        <th>example</th>
    </tr>
    
        <tr>
            <td>results</td>
            <td>
                
                
                array[object]
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>searchString</td>
            <td>
                
                    
                    string
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageSize</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>pageNumber</td>
            <td>
                
                    
                    integer (int32)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>totalCount</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
        <tr>
            <td>sortCols</td>
            <td>
                
                
                array[string]
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
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
            <td>id</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Unique identifier of this entity.</td>
            <td>111</td>
        </tr>
    
        <tr>
            <td>name</td>
            <td>
                
                    
                    string
                
            </td>
            <td>required</td>
            <td>Unique version-set name.</td>
            <td>pet-store-application-version-set</td>
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
            <td>scope</td>
            <td>
                
                    <a href="#/definitions/Scope">Scope</a>
                    
                
            </td>
            <td>required</td>
            <td>scope that this version-set is associated with.</td>
            <td>environment</td>
        </tr>
    
        <tr>
            <td>propertyGroups</td>
            <td>
                
                
                    array[<a href="#/definitions/PropertyGroup">PropertyGroup</a>]
                
                
                
            </td>
            <td>required</td>
            <td>The property-groups that are associated with this version-set.</td>
            <td></td>
        </tr>
    
        <tr>
            <td>version</td>
            <td>
                
                    
                    integer (int64)
                
            </td>
            <td>optional</td>
            <td>Revision number of this entity.</td>
            <td>1.1.0</td>
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
            <td>modifiedDate</td>
            <td>
                
                    <a href="#/definitions/LocalDateTime">LocalDateTime</a>
                    
                
            </td>
            <td>optional</td>
            <td>-</td>
            <td></td>
        </tr>
    
</table>


