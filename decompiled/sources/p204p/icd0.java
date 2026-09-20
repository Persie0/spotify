package p204p;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class icd0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jcd0 f100804a;

    public icd0(jcd0 jcd0Var) {
        this.f100804a = jcd0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f100804a.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f100804a.getClass();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f100804a.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        jcd0 jcd0Var = this.f100804a;
        if (jcd0Var.f111071A == surfaceHolder && jcd0Var.m52958p()) {
            if (jcd0Var.m52957o() >= 8) {
                jcd0Var.m52950g(new acd0(this, i2, i3, 3));
            }
            jcd0Var.m52963y(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        jcd0 jcd0Var = this.f100804a;
        if (jcd0Var.f111071A != surfaceHolder) {
            return;
        }
        jcd0Var.f111104z = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        jcd0Var.m52943K(jcd0Var.f111104z, surfaceFrame.width(), surfaceFrame.height());
        jcd0Var.m52963y(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        jcd0 jcd0Var = this.f100804a;
        if (jcd0Var.f111071A != surfaceHolder) {
            return;
        }
        jcd0Var.f111104z = null;
        jcd0Var.m52943K(null, 0, 0);
        jcd0Var.m52963y(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
