package com.gameshopllc.ultras;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
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

            for (BigCircle circle: lyndenJayEvans.allCircles) {
                circle.poly.geo.rotate(0, 0.05f, 0);
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