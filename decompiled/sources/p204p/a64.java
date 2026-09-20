package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12686a;

    /* JADX INFO: renamed from: b */
    public final boolean f12687b;

    /* JADX INFO: renamed from: c */
    public final bji f12688c;

    /* JADX INFO: renamed from: d */
    public final wg61 f12689d = new wg61(new o54(this, 9));

    public a64(boolean z, boolean z2, bji bjiVar) {
        this.f12686a = z;
        this.f12687b = z2;
        this.f12688c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24836a() {
        a64 a64Var = (a64) this.f12689d.getValue();
        return a64Var != null ? a64Var.m24836a() : this.f12686a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24837b() {
        a64 a64Var = (a64) this.f12689d.getValue();
        return a64Var != null ? a64Var.m24837b() : this.f12687b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("pip_end_message", "android-feature-pip", m24836a()), new k8a("pip_start_message", "android-feature-pip", m24837b()));
    }
}
