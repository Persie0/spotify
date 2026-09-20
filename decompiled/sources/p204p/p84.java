package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174858a;

    /* JADX INFO: renamed from: b */
    public final bji f174859b;

    /* JADX INFO: renamed from: c */
    public final wg61 f174860c = new wg61(new f74(this, 16));

    public p84(boolean z, bji bjiVar) {
        this.f174858a = z;
        this.f174859b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69332a() {
        p84 p84Var = (p84) this.f174860c.getValue();
        return p84Var != null ? p84Var.m69332a() : this.f174858a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("explanation_banner_enabled", "android-free-day-employee", m69332a()));
    }
}
