package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174555a;

    /* JADX INFO: renamed from: b */
    public final bji f174556b;

    /* JADX INFO: renamed from: c */
    public final wg61 f174557c = new wg61(new f74(this, 9));

    public p74(boolean z, bji bjiVar) {
        this.f174555a = z;
        this.f174556b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69248a() {
        p74 p74Var = (p74) this.f174557c.getValue();
        return p74Var != null ? p74Var.m69248a() : this.f174555a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("auto_open_on_first_eligible", "android-feature-unboxing-hub", m69248a()));
    }
}
