package p204p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.TextureView;

/* JADX INFO: loaded from: classes9.dex */
public final class ly4 extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public final gy4 f137950a;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f137951b;

    /* JADX INFO: renamed from: c */
    public EGLContext f137952c;

    /* JADX INFO: renamed from: d */
    public EGLSurface f137953d;

    /* JADX INFO: renamed from: e */
    public HandlerThread f137954e;

    /* JADX INFO: renamed from: f */
    public Handler f137955f;

    public ly4(Context context) {
        super(context);
        this.f137950a = new gy4();
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: a */
    public static final void m60215a(ly4 ly4Var) {
        EGLSurface eGLSurface;
        int i;
        EGLDisplay eGLDisplay = ly4Var.f137951b;
        if (eGLDisplay == null || (eGLSurface = ly4Var.f137953d) == null) {
            return;
        }
        gy4 gy4Var = ly4Var.f137950a;
        float[] fArr = gy4Var.f85438e;
        GLES20.glClear(16384);
        if (gy4Var.f85437d != 0 && (i = gy4Var.f85436c) != 0) {
            GLES20.glBindBuffer(34962, i);
            GLES20.glUseProgram(gy4Var.f85434a);
            GLES20.glUniformMatrix4fv(gy4Var.f85439f, 1, false, fArr, 0);
            GLES20.glUniform1f(gy4Var.f85440g, gy4Var.f85426B);
            GLES20.glUniform3f(gy4Var.f85441h, gy4Var.f85427C, gy4Var.f85428D, gy4Var.f85429E);
            GLES20.glUniform1f(gy4Var.f85442i, gy4Var.f85430F);
            GLES20.glEnableVertexAttribArray(gy4Var.f85443j);
            GLES20.glVertexAttribPointer(gy4Var.f85443j, 2, 5126, false, 16, 0);
            GLES20.glEnableVertexAttribArray(gy4Var.f85444k);
            GLES20.glVertexAttribPointer(gy4Var.f85444k, 1, 5126, false, 16, 8);
            GLES20.glEnableVertexAttribArray(gy4Var.f85445l);
            GLES20.glVertexAttribPointer(gy4Var.f85445l, 1, 5126, false, 16, 12);
            GLES20.glDrawArrays(5, 0, gy4Var.f85437d);
            GLES20.glDisableVertexAttribArray(gy4Var.f85443j);
            GLES20.glDisableVertexAttribArray(gy4Var.f85444k);
            GLES20.glDisableVertexAttribArray(gy4Var.f85445l);
            GLES20.glUseProgram(gy4Var.f85435b);
            GLES20.glUniformMatrix4fv(gy4Var.f85446m, 1, false, fArr, 0);
            GLES20.glUniform1f(gy4Var.f85453t, gy4Var.f85426B);
            GLES20.glUniform1f(gy4Var.f85447n, gy4Var.f85458y);
            GLES20.glUniform1f(gy4Var.f85448o, gy4Var.f85459z);
            GLES20.glUniform1f(gy4Var.f85449p, 0.3f);
            GLES20.glUniform1f(gy4Var.f85450q, gy4Var.f85425A);
            GLES20.glUniform1f(gy4Var.f85451r, 0.4f);
            GLES20.glUniform1f(gy4Var.f85452s, 0.6f);
            GLES20.glUniform3f(gy4Var.f85454u, gy4Var.f85431G, gy4Var.f85432H, gy4Var.f85433I);
            GLES20.glEnableVertexAttribArray(gy4Var.f85455v);
            GLES20.glVertexAttribPointer(gy4Var.f85455v, 2, 5126, false, 16, 0);
            GLES20.glEnableVertexAttribArray(gy4Var.f85456w);
            GLES20.glVertexAttribPointer(gy4Var.f85456w, 1, 5126, false, 16, 8);
            GLES20.glEnableVertexAttribArray(gy4Var.f85457x);
            GLES20.glVertexAttribPointer(gy4Var.f85457x, 1, 5126, false, 16, 12);
            GLES20.glDrawArrays(5, 0, gy4Var.f85437d);
            GLES20.glDisableVertexAttribArray(gy4Var.f85455v);
            GLES20.glDisableVertexAttribArray(gy4Var.f85456w);
            GLES20.glDisableVertexAttribArray(gy4Var.f85457x);
            GLES20.glBindBuffer(34962, 0);
        }
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f137955f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread("GLRenderThread");
        handlerThread.start();
        this.f137954e = handlerThread;
        HandlerThread handlerThread2 = this.f137954e;
        wj50.m88279p(handlerThread2);
        Handler handler = new Handler(handlerThread2.getLooper());
        this.f137955f = handler;
        handler.post(new hy4(this, surfaceTexture, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Handler handler = this.f137955f;
        if (handler != null) {
            handler.post(new n10(this, 6));
        }
        try {
            HandlerThread handlerThread = this.f137954e;
            if (handlerThread != null) {
                handlerThread.join(1000L);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f137954e = null;
        this.f137955f = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler = this.f137955f;
        if (handler != null) {
            handler.post(new vt81(this, i, i2, 2));
        }
    }

    public final void setContourPath(vbn0 vbn0Var) {
        Handler handler = this.f137955f;
        if (handler != null) {
            handler.post(new uqf1(3, this, vbn0Var));
        }
    }

    public final void setStrokeWidth(float f) {
        Handler handler = this.f137955f;
        if (handler != null) {
            handler.post(new jy4(this, f, 0));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
