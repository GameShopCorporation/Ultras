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
        int cool = 60;
        for (int i = 0; i < cool * archA.distance(archB); i++){

           // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
//sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
            //plus or minus
            //bigCircles.add(new BigCircle(app, color, new Vector3f((float)(((  ((((i * (archA.x + archB.x)) )/cool)) - ((sinitude.x) * Math.cos(Math.toRadians((i * 1080)/1080)))))) + (float)(((  ((((i * (archA.y + archB.y)) )/cool)) + ((sinitude.y) * Math.sin(Math.toRadians((i * 1080)/1080))))))  , (float)( (( ((i * (archA.y + archB.y)/cool)) - (((sinitude.y) * Math.sin(Math.toRadians((i * 1080)/1080))))))),(((i * (archA.z + archB.z)/cool) * 1)))));

        }

    }
}
