package p204p;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes8.dex */
public final class vt81 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f244573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f244574c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f244575d;

    public /* synthetic */ vt81(Object obj, int i, int i2, int i3) {
        this.f244572a = i3;
        this.f244573b = obj;
        this.f244574c = i;
        this.f244575d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f244572a) {
            case 0:
                ((wt81) this.f244573b).m47715k(this.f244574c, this.f244575d);
                break;
            case 1:
                ((wt81) this.f244573b).m47716l(this.f244574c, this.f244575d);
                break;
            default:
                ly4 ly4Var = (ly4) this.f244573b;
                gy4 gy4Var = ly4Var.f137950a;
                gy4Var.getClass();
                int i = this.f244574c;
                int i2 = this.f244575d;
                GLES20.glViewport(0, 0, i, i2);
                Matrix.orthoM(gy4Var.f85438e, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
                ly4.m60215a(ly4Var);
                break;
        }
    }
}
