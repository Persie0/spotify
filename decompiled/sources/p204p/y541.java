package p204p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y541 extends GLSurfaceView {

    /* JADX INFO: renamed from: L0 */
    public boolean f269338L0;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f269339a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f269340b;

    /* JADX INFO: renamed from: c */
    public final Sensor f269341c;

    /* JADX INFO: renamed from: d */
    public final awl0 f269342d;

    /* JADX INFO: renamed from: e */
    public final Handler f269343e;

    /* JADX INFO: renamed from: f */
    public final eey0 f269344f;

    /* JADX INFO: renamed from: g */
    public SurfaceTexture f269345g;

    /* JADX INFO: renamed from: h */
    public Surface f269346h;

    /* JADX INFO: renamed from: i */
    public boolean f269347i;

    /* JADX INFO: renamed from: t */
    public boolean f269348t;

    public y541(Context context) {
        super(context, null);
        this.f269339a = new CopyOnWriteArrayList();
        this.f269343e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f269340b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f269341c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        eey0 eey0Var = new eey0();
        this.f269344f = eey0Var;
        x541 x541Var = new x541(this, eey0Var);
        View.OnTouchListener ha81Var = new ha81(context, x541Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f269342d = new awl0(windowManager.getDefaultDisplay(), ha81Var, x541Var);
        this.f269347i = true;
        setEGLContextClientVersion(2);
        setRenderer(x541Var);
        setOnTouchListener(ha81Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m92838a() {
        boolean z = this.f269347i && this.f269348t;
        Sensor sensor = this.f269341c;
        if (sensor == null || z == this.f269338L0) {
            return;
        }
        awl0 awl0Var = this.f269342d;
        SensorManager sensorManager = this.f269340b;
        if (z) {
            sensorManager.registerListener(awl0Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(awl0Var);
        }
        this.f269338L0 = z;
    }

    public dgb getCameraMotionListener() {
        return this.f269344f;
    }

    public oxb1 getVideoFrameMetadataListener() {
        return this.f269344f;
    }

    public Surface getVideoSurface() {
        return this.f269346h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f269343e.post(new rsz0(this, 8));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f269348t = false;
        m92838a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f269348t = true;
        m92838a();
    }

    public void setDefaultStereoMode(int i) {
        this.f269344f.f58879X = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f269347i = z;
        m92838a();
    }
}
