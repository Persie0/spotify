package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fvl0 implements j4t0 {

    /* JADX INFO: renamed from: c */
    public static final zfs f73812c = new zfs(29);

    /* JADX INFO: renamed from: d */
    public static final dxf f73813d = new dxf(5);

    /* JADX INFO: renamed from: a */
    public njq f73814a;

    /* JADX INFO: renamed from: b */
    public volatile j4t0 f73815b;

    public fvl0(zfs zfsVar, j4t0 j4t0Var) {
        this.f73814a = zfsVar;
        this.f73815b = j4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m42878a(njq njqVar) {
        j4t0 j4t0Var;
        j4t0 j4t0Var2;
        j4t0 j4t0Var3 = this.f73815b;
        dxf dxfVar = f73813d;
        if (j4t0Var3 != dxfVar) {
            njqVar.mo40111e(j4t0Var3);
            return;
        }
        synchronized (this) {
            j4t0Var = this.f73815b;
            if (j4t0Var != dxfVar) {
                j4t0Var2 = j4t0Var;
            } else {
                this.f73814a = new evl0(this.f73814a, njqVar);
                j4t0Var2 = null;
            }
        }
        if (j4t0Var2 != null) {
            njqVar.mo40111e(j4t0Var);
        }
    }

    @Override // p204p.j4t0
    public final Object get() {
        return this.f73815b.get();
    }
}
