package p204p;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes3.dex */
public final class nsd0 implements SurfaceHolder {

    /* JADX INFO: renamed from: a */
    public final Surface f157751a;

    /* JADX INFO: renamed from: b */
    public final Rect f157752b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolder.Callback f157753c;

    public nsd0(Surface surface) {
        this.f157752b = new Rect();
        this.f157751a = surface;
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.f157753c = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.f157751a;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.f157752b;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.f157753c == callback) {
            this.f157753c = null;
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        this.f157752b.set(0, 0, i, i2);
        SurfaceHolder.Callback callback = this.f157753c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i, i2);
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public nsd0(Surface surface, int i, int i2) {
        Rect rect = new Rect();
        this.f157752b = rect;
        this.f157751a = surface;
        rect.set(0, 0, i, i2);
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
