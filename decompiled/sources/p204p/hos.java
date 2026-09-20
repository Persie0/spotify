package p204p;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class hos implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f93592g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f93593a;

    /* JADX INFO: renamed from: b */
    public final int[] f93594b = new int[1];

    /* JADX INFO: renamed from: c */
    public EGLDisplay f93595c;

    /* JADX INFO: renamed from: d */
    public EGLContext f93596d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f93597e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f93598f;

    public hos(Handler handler) {
        this.f93593a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f93593a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f93598f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
