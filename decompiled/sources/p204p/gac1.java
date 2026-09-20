package p204p;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class gac1 {

    /* JADX INFO: renamed from: a */
    public final SurfaceHolder f78028a;

    /* JADX INFO: renamed from: b */
    public final hac1 f78029b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f78030c;

    public gac1(SurfaceHolder surfaceHolder, hac1 hac1Var, boolean z) {
        this.f78028a = surfaceHolder;
        this.f78029b = hac1Var;
        this.f78030c = z;
    }

    /* JADX INFO: renamed from: a */
    public final SurfaceHolder.Callback m44153a() {
        return this.f78029b;
    }

    /* JADX INFO: renamed from: b */
    public final SurfaceHolder m44154b() {
        return this.f78028a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44155c() {
        return this.f78030c;
    }

    /* JADX INFO: renamed from: d */
    public final void m44156d(boolean z) {
        this.f78030c = z;
    }
}
