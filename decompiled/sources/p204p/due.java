package p204p;

import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class due implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eue f53048a;

    public due(eue eueVar) {
        this.f53048a = eueVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ln9 ln9Var = this.f53048a.f62957d;
        if (ln9Var != null) {
            Surface surface = surfaceHolder.getSurface();
            if (!surface.isValid()) {
                surface = null;
            }
            ln9Var.m59488s(surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ln9 ln9Var = this.f53048a.f62957d;
        if (ln9Var != null) {
            Surface surface = surfaceHolder.getSurface();
            if (!surface.isValid()) {
                surface = null;
            }
            ln9Var.m59488s(surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ln9 ln9Var = this.f53048a.f62957d;
        if (ln9Var != null) {
            ln9Var.m59488s(null);
        }
    }
}
