package p204p;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* JADX INFO: loaded from: classes6.dex */
public final class vte extends Surface {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f244616g = 0;

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture f244617a;

    /* JADX INFO: renamed from: b */
    public final EGLDisplay f244618b;

    /* JADX INFO: renamed from: c */
    public final EGLContext f244619c;

    /* JADX INFO: renamed from: d */
    public final EGLSurface f244620d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f244621e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f244622f;

    public vte(SurfaceTexture surfaceTexture, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, HandlerThread handlerThread) {
        super(surfaceTexture);
        this.f244617a = surfaceTexture;
        this.f244618b = eGLDisplay;
        this.f244619c = eGLContext;
        this.f244620d = eGLSurface;
        this.f244621e = handlerThread;
    }

    @Override // android.view.Surface
    public final void release() {
        if (this.f244622f) {
            return;
        }
        this.f244622f = true;
        super.release();
        new Handler(this.f244621e.getLooper()).post(new n10(this, 26));
    }
}
