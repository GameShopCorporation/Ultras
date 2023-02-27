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

             lyndenJayEvans = new LyndenJayEvans(this);
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


            for (BigCircle circle: lyndenJayEvans.allCircles) {


//                Quaternion Xroll45 = new Quaternion();
//                Xroll45.fromAngleAxis(this.cam.getDirection().x * FastMath.DEG_TO_RAD, Vector3f.UNIT_X);
////
//                Quaternion Yroll45 = new Quaternion();
//                Yroll45.fromAngleAxis(this.cam.getDirection().y * FastMath.DEG_TO_RAD, Vector3f.UNIT_Y);
//
//                Quaternion Zroll45 = new Quaternion();
//                Zroll45.fromAngleAxis(this.cam.getDirection().z * FastMath.DEG_TO_RAD, Vector3f.UNIT_Y);
////
//
////the rotation half - way between these two
//
//                Quaternion halfBetweenXroll45Yroll45 = new Quaternion();
//
//                Quaternion halfBetweenYroll45Zroll45 = new Quaternion();
//
//                Quaternion halfBetweenZroll45Xroll45 = new Quaternion();
//
//                halfBetweenXroll45Yroll45.slerp(Xroll45, Yroll45, 0f);
//                halfBetweenYroll45Zroll45.slerp(Yroll45, Zroll45, 0f);
//                halfBetweenZroll45Xroll45.slerp(Zroll45, Xroll45, 0f);


                //rotate a spatial to face up ~45 degrees
//                Vector3f[] axes = new Vector3f[3];
//                axes[0] = new Vector3f(0, 0, 0); //left
//                axes[1] = new Vector3f(0, 0.0f, 0.0f); //up
//                axes[2] = new Vector3f(0, 0.0f, 0.0f); //dir

               // axes.getLocalRotation().fromAxes(axes);

                //rotate 1 radian on the x, 3 on the y and 0 on z
                float[] angles = {0, 1, 0};
                //.getLocalRotation().fromAngles(angles);

               // float theCoinFlip = this.cam.getDirection().y;
                circle.poly.geo.getLocalRotation().fromAngles(angles);
               // rotate(0, theCoinFlip - this.cam.getDirection().y, 0);

            }
        } else {
            //chessTileBase = new ChessTileBase(this);
            //chessTileBase.updateRender();
        }
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code

        if (release) {


        } else {

        }

    }
}