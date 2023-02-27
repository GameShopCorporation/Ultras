package com.gameshopllc.ultras;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Matrix3f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;

/**
 * @author lyndenjayevans
 */
public class AppMain extends SimpleApplication {

    /**
     * Release Variable Is For Google Play Release.
     * False When Focusing On One Model.
     * */
    boolean release = true;
    LyndenJayEvans lyndenJayEvans;
    @Override
    public void simpleInitApp() {

        settings.setBitsPerPixel(32);
        settings.setSamples(32);
        settings.setFrameRate(60);
        settings.setVSync(true);
        settings.setStencilBits(8);
        settings.setDepthBits(32);
        viewPort.setBackgroundColor(ColorRGBA.White);
        //settings.setFrequency(120);


        if (release) {

        //BigCircle bigCircle = new BigCircle(this, ColorRGBA.Black)
           //BigArc bigArc = new BigArc(this, ColorRGBA.Black, new Vector3f(0, 0, 0), new Vector3f(5,0,0), new Vector3f (0f,-2.5f,0));

             lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(0,0,0));


            //lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(0,0,4));

//            lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(4,0,-2));
//
//
//            lyndenJayEvans = new LyndenJayEvans(this, new Vector3f(0,0,-2));
            } else {



        }
    }


    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        if (release) {


           // this.cam.lookAt(lyndenJayEvans.allCircles.get(0).vertices.get(0), Vector3f.UNIT_Y); Wrong Equation, Freezes Camera

            /*
You can interpolate rotations between two quaternions using spherical linear
interpolation (slerp).
*/



//            System.out.println(this.cam.getLocation());
           for (BigCircle circle: lyndenJayEvans.allCircles) {

              // circle.poly.geo.setLocalTranslation(4,0,0);
//
//
//                //circle.poly.geo.move(1,5,1);// lookAt(this.cam.getLocation(), new Vector3f(1f,1f,1f));
               circle.poly.geo.rotate(tpf, tpf, tpf);
            }
        } else {


        }
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code

        if (release) {

            lyndenJayEvans.updateRender();
        } else {

        }

    }
}