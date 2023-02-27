package com.gameshopllc.ultras;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;


/**
 * 360 Degrees Is Preferred By Default.  360 Triangles, 1 Degree For Each Triangle.
 *
 * You Should Probably Not Delete The Axiomatic Method
 * */
public class BigCircle extends CurrencyMesh{

    public BigCircle (SimpleApplication app, ColorRGBA color, Vector3f coordinate){
        super(app);

        this.vertices.clear();

        for (int degrees = 0; degrees <= 1080; degrees++){

            vertices.add(new Vector3f( coordinate.x + (float) (1 * -Math.cos(Math.toRadians(degrees))), coordinate.y + (float) (1 * Math.sin(Math.toRadians(degrees))),coordinate.z));
            vertices.add(new Vector3f(coordinate.x + (float) (1 * -Math.cos(Math.toRadians(degrees + 1))),coordinate.y + (float) (1 * Math.sin(Math.toRadians(degrees + 1))),coordinate.z));

            vertices.add(new Vector3f(coordinate.x,coordinate.y,coordinate.z));

            indexes.add(0 + degrees);
            indexes.add(1 + degrees);
            indexes.add(2 + degrees);
        }

        //vertices.add(new Vector3f(8,2,0));


//        indexes.add(1);
//        indexes.add(3);
//        indexes.add(2);

        poly = new Poly(app, vertices, texCoord, indexes, color);

    }

    @Override
    public void updateRender(){

        //for (Poly poly: polys){
        poly.updateRender();
        //  }
    }
}
