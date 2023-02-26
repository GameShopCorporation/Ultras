package com.gameshopllc.ultras;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;

public class BigArc extends CurrencyMesh{

    public ArrayList<BigCircle> bigCircles;

    /**
     * Nothing Is More Dangerous Than A Double Divisor.
     *
     * Do Not Divide By Zero.
     *
     * Do Not Create An F-ing Singularity.
     *
     * Sure You Shall.
     * */
    public BigArc(SimpleApplication app, ColorRGBA color, Vector3f archA, Vector3f archB, Vector3f sinitude) {
        super(app);

        bigCircles = new ArrayList<BigCircle>();


        System.out.println(archA.distance(archB));
        for (int i = 0; i < 22 * archA.distance(archB); i++){

            bigCircles.add(new BigCircle(app, color, new Vector3f((float)(((sinitude.x) + (((archA.x + archB.x) / 2) * ((i * (archA.x + archB.x)/22) * Math.cos(Math.toRadians((i / 1080)/1080)))))), (float)(((sinitude.y) + (((archA.y + archB.y) / 2) * ((i * (archA.y + archB.y)/22) * Math.sin(Math.toRadians((i / 1080)/1080)))))),(((sinitude.z)) + (((archA.z + archB.z) / 2) * ((i * (archA.z + archB.z)/22) * 1))))));

        }

    }
}
