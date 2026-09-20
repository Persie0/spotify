package p204p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes6.dex */
public final class ute implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EGLDisplay f233899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EGLSurface f233900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EGLContext f233901c;

    public ute(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
        this.f233899a = eGLDisplay;
        this.f233900b = eGLSurface;
        this.f233901c = eGLContext;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        EGLSurface eGLSurface = this.f233900b;
        EGL14.eglMakeCurrent(this.f233899a, eGLSurface, eGLSurface, this.f233901c);
        surfaceTexture.updateTexImage();
    }
}
