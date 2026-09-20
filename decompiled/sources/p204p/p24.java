package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f173235a;

    /* JADX INFO: renamed from: b */
    public final bji f173236b;

    /* JADX INFO: renamed from: c */
    public final wg61 f173237c = new wg61(new u14(this, 9));

    public p24(boolean z, bji bjiVar) {
        this.f173235a = z;
        this.f173236b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68879a() {
        p24 p24Var = (p24) this.f173237c.getValue();
        return p24Var != null ? p24Var.m68879a() : this.f173235a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("beta_badge_enabled", "android-djcard-flags", m68879a()));
    }
}
