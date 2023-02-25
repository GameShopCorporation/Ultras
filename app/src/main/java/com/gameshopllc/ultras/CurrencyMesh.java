package com.gameshopllc.ultras;
import com.jme3.app.SimpleApplication;
import com.jme3.bounding.BoundingVolume;
import com.jme3.collision.Collidable;
import com.jme3.collision.CollisionResults;
import com.jme3.collision.UnsupportedCollisionException;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.scene.SceneGraphVisitor;
import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author lyndenjayevans
 */
public class CurrencyMesh {

    public SimpleApplication app;

    public ArrayList<Vector3f> vertices;
    //public ArrayList<ArrayList<Vector3f>> vertices;
    public ArrayList<Vector2f> texCoord;
    public ArrayList<Integer> indexes;
    public Poly poly;

    public Node node;

    public CurrencyMesh (SimpleApplication app){

        this.app = app;

        //vertices = new ArrayList<ArrayList<Vector3f>>();

        vertices = new ArrayList<Vector3f>();
        texCoord = new ArrayList<Vector2f>();
        indexes = new ArrayList<Integer>();
        //poly = new Poly();//new ArrayList<Poly>();

        node = new Node("node");

        texCoord.add(new Vector2f(0,0));
        texCoord.add(new Vector2f(1,0));
        texCoord.add(new Vector2f(0,1));
        texCoord.add(new Vector2f(1,1));



        //Poly poly = new Poly(app, vertices, texCoord, indexes);


    }

    public void updateRender(){

        //for (Poly poly: polys){
        poly.updateRender();
        //  }
    }

}

