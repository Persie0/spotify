package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ltd0 implements dtd0 {

    /* JADX INFO: renamed from: a */
    public final p1d0 f136759a;

    /* JADX INFO: renamed from: d */
    public int f136762d;

    /* JADX INFO: renamed from: e */
    public boolean f136763e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f136761c = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Object f136760b = new Object();

    public ltd0(wz8 wz8Var, boolean z) {
        this.f136759a = new p1d0(wz8Var, z);
    }

    @Override // p204p.dtd0
    /* JADX INFO: renamed from: a */
    public final qp71 mo36237a() {
        return this.f136759a.f173053M0;
    }

    /* JADX INFO: renamed from: b */
    public final void m59878b(int i) {
        this.f136762d = i;
        this.f136763e = false;
        this.f136761c.clear();
    }

    @Override // p204p.dtd0
    public final Object getUid() {
        return this.f136760b;
    }
}
