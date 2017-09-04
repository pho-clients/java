package org.phonetworks;

import org.ApiException;
import io.swagger.client.model.Edge;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.Node;
import io.swagger.client.model.NodeEdge;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * updates (or creates) an attribute
     *
     * Works with all entities, including nodes and edges. Given its key, updates an  attribute value, or creates it, if it doesn&#39;t yet exist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAttributeTest() throws ApiException {
        String value = null;
        // InlineResponse2004 response = api.addAttribute(value);

        // TODO: test validations
    }
    
    /**
     * deletes an attribute
     *
     * Works with all entities, including nodes and edges. Given its key, deletes an  attribute. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delAttributeTest() throws ApiException {
        // InlineResponse2004 response = api.delAttribute();

        // TODO: test validations
    }
    
    /**
     * deletes an entity
     *
     * Works with all entities, including nodes and edges.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delEntityTest() throws ApiException {
        // api.delEntity();

        // TODO: test validations
    }
    
    /**
     * retrieves the edges of a node
     *
     * By passing in a node ID, you can fetch all the edges of the node in question; including incoming and outgoing. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEdgesTest() throws ApiException {
        String uuid = null;
        // InlineResponse2003 response = api.getAllEdges(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves the value of an entity attribute
     *
     * Attribute key must be case-sensitive. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributeTest() throws ApiException {
        String uuid = null;
        String key = null;
        // String response = api.getAttribute(uuid, key);

        // TODO: test validations
    }
    
    /**
     * retrieves the existing attribute keys of an entity (edge or node)
     *
     * Attribute keys are case-sensitive, and they will be listed in an array. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        String uuid = null;
        // List<String> response = api.getAttributes(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves an edge
     *
     * By passing in an ID, you can search for available edges in the system.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdgeTest() throws ApiException {
        String uuid = null;
        // Edge response = api.getEdge(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves the edge getter methods of a node
     *
     * By passing in a node UUID that exists in the database, you can fetch  the edge getter methods of the node in question. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdgeGettersTest() throws ApiException {
        String uuid = null;
        // List<String> response = api.getEdgeGetters(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves the edge setter methods of a node
     *
     * By passing in a node UUID that exists in the database, you can fetch  the edge setter methods of the node in question. These setters may or  may not be formative. If they are formative, a new node is created in result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdgeSettersTest() throws ApiException {
        String uuid = null;
        // List<String> response = api.getEdgeSetters(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves the Graph Founder
     *
     * The Founder must be a \\Pho\\Framework\\Actor object.  This method returns the object type as well as object ID. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFounderTest() throws ApiException {
        // InlineResponse200 response = api.getFounder();

        // TODO: test validations
    }
    
    /**
     * retrieves the main Graph
     *
     * The Graph must be a \\Pho\\Lib\\Graph\\SubGraph and \\Pho\\Framework\\Graph object.  This method returns the object type as well as object ID. The Graph contains all nodes and edges in the system.  Though it is contained by Space, its one and only container. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGraphTest() throws ApiException {
        // InlineResponse2001 response = api.getGraph();

        // TODO: test validations
    }
    
    /**
     * retrieves the incoming edges of a node
     *
     * By passing in a node ID, you can fetch  the incoming edges of the node in question. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncomingEdgesTest() throws ApiException {
        String uuid = null;
        // List<NodeEdge> response = api.getIncomingEdges(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves a node
     *
     * By passing in an ID, you can search for available nodes in the system. Please note, this function will not return edges. This method  is  reserved for nodes only.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String uuid = null;
        // Node response = api.getNode(uuid);

        // TODO: test validations
    }
    
    /**
     * edge getter
     *
     * Fetches edge results, whether as edge IDs or node IDs, depending on edge&#39;s characteristics.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeEdgeTest() throws ApiException {
        String uuid = null;
        String edge = null;
        // List<String> response = api.getNodeEdge(uuid, edge);

        // TODO: test validations
    }
    
    /**
     * retrieves the outgoing edges of a node
     *
     * By passing in a node ID, you can fetch  the outgoing edges of the node in question. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutgoingEdgesTest() throws ApiException {
        String uuid = null;
        // List<NodeEdge> response = api.getOutgoingEdges(uuid);

        // TODO: test validations
    }
    
    /**
     * retrieves the Space
     *
     * The Space must be a \\Pho\\Lib\\Graph\\Graph object.  This method returns the object type as well as object uuid. Space always comes with the nil ID;  00000000000000000000000000000000, and under normal circumstances its class is always Pho\\Kernel\\Standards\\Space 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpaceTest() throws ApiException {
        // InlineResponse2002 response = api.getSpace();

        // TODO: test validations
    }
    
    /**
     * fetches entity type
     *
     * Possible values are; \&quot;Space\&quot;, \&quot;Node\&quot;, \&quot;Graph Node\&quot;, \&quot;Graph\&quot;, \&quot;Actor Node\&quot; \&quot;Object Node\&quot;, \&quot;Edge\&quot;, \&quot;Read Edge\&quot;, \&quot;Write Edge\&quot;, \&quot;Subscribe Edge\&quot;, \&quot;Mention Edge\&quot;, \&quot;Unidentified\&quot;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTypeTest() throws ApiException {
        String uuid = null;
        // String response = api.getType(uuid);

        // TODO: test validations
    }
    
    /**
     * creates an Actor object
     *
     * Fetches whatever set as \&quot;default_object\&quot;&#x3D;&gt;\&quot;actor\&quot; while determining what Actor object to construct. If it doesn&#39;t exist, uses \&quot;default_object\&quot;&#x3D;&gt;\&quot;founder\&quot; class. Otherwise fails. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void makeActorTest() throws ApiException {
        String param1 = null;
        // String response = api.makeActor(param1);

        // TODO: test validations
    }
    
    /**
     * creates an edge
     *
     * Used to set new edges. If the edge is formative, then a node is also formed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void makeEdgeTest() throws ApiException {
        String param1 = null;
        // String response = api.makeEdge(param1);

        // TODO: test validations
    }
    
    /**
     * updates (or creates) an attribute
     *
     * Works with all entities, including nodes and edges. Given its key, updates an  attribute value, or creates it, if it doesn&#39;t yet exist. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setAttributeTest() throws ApiException {
        String value = null;
        // InlineResponse2004 response = api.setAttribute(value);

        // TODO: test validations
    }
    
}
