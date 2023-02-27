package com.gameshopllc.ultras;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;

public class LyndenJayEvans extends CurrencyMesh{

    public ArrayList<BigCircle> allCircles;
    public LyndenJayEvans(SimpleApplication app, Vector3f position) {
        super(app);

        allCircles = new ArrayList<BigCircle>();

//        lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(8,0,8));
//
//        lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(0,0,16));
//
//
//        lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(-8,0,8));

        Vector3f archA;// = new Vector3f(0,0,0);
        Vector3f archB;// = new Vector3f(4,0,0);

        int cool = 60;
//        for (int i = 0; i < cool * archA.distance(archB); i++){
//
//            // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
////sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
//            //plus or minus
//            allCircles.add(new BigCircle(app, ColorRGBA.Black, new Vector3f((((archA.x +  ((((i * (archA.x + archB.x)) )/cool))))) , ( ((archA.y + ((i * (archA.y + archB.y)/cool))))),(((i * (archA.z + archB.z)/cool))))));
//
//        }


         archA = new Vector3f(position.x,position.y,position.z);
         archB = new Vector3f(position.x + 0.000001f,position.y,position.z);
         cool = 60;
        for (int i = 0; i < cool * archA.distance(archB); i++){

            // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
//sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
            //plus or minus
            allCircles.add(new BigCircle(app, ColorRGBA.Black, new Vector3f(((( ((((i)/cool)))))) + archB.x , ( (((((i/cool)))))) +archB.y,((((((i/cool))))) + archB.z)))) ;

        }

        archA = new Vector3f(position.x + 8,position.y,position.z + 8);
        archB = new Vector3f(position.x + 0.000001f + 8,position.y,position.z + 8);
        cool = 60;
        for (int i = 0; i < cool * archA.distance(archB); i++){

            // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
//sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
            //plus or minus
            allCircles.add(new BigCircle(app, ColorRGBA.Black, new Vector3f(((( ((((i)/cool)))))) + archB.x , ( (((((i/cool)))))) +archB.y,((((((i/cool))))) + archB.z)))) ;

        }

        archA = new Vector3f(position.x,position.y,position.z + 16);
        archB = new Vector3f(position.x + 0.000001f,position.y,position.z + 16);
        cool = 60;
        for (int i = 0; i < cool * archA.distance(archB); i++){

            // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
//sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
            //plus or minus
            allCircles.add(new BigCircle(app, ColorRGBA.Black, new Vector3f(((( ((((i)/cool)))))) + archB.x , ( (((((i/cool)))))) +archB.y,((((((i/cool))))) + archB.z)))) ;

        }

        archA = new Vector3f(position.x - 8,position.y,position.z + 8);
        archB = new Vector3f(position.x + 0.000001f - 8,position.y,position.z + 8);
        cool = 60;
        for (int i = 0; i < cool * archA.distance(archB); i++){

            // System.out.println(Math.sin(Math.toRadians((i * 1080)/1080)));  + (((archA.z + archB.z) / 2)
//sinitude+//((archA.y + archB.y) / 2) ((archA.x + archB.x) / 2) (sinitude.x) +
            //plus or minus
            allCircles.add(new BigCircle(app, ColorRGBA.Black, new Vector3f(((( ((((i)/cool)))))) + archB.x , ( (((((i/cool)))))) +archB.y,((((((i/cool))))) + archB.z)))) ;

        }
    }

    @Override
    public void updateRender(){

        //for (Poly poly: polys){
        for (BigCircle circle: allCircles) {
            circle.updateRender();
        }
        //  }
    }
}
