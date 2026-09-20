package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ao4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f17554a;

    /* JADX INFO: renamed from: b */
    public final boolean f17555b;

    /* JADX INFO: renamed from: c */
    public final boolean f17556c;

    /* JADX INFO: renamed from: d */
    public final boolean f17557d;

    /* JADX INFO: renamed from: e */
    public final bji f17558e;

    /* JADX INFO: renamed from: f */
    public final wg61 f17559f;

    public ao4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f17554a = z;
        this.f17555b = z2;
        this.f17556c = z3;
        this.f17557d = z4;
        this.f17558e = bjiVar;
        this.f17559f = new wg61(new cn4(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26556a() {
        ao4 ao4Var = (ao4) this.f17559f.getValue();
        return ao4Var != null ? ao4Var.m26556a() : this.f17554a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26557b() {
        ao4 ao4Var = (ao4) this.f17559f.getValue();
        return ao4Var != null ? ao4Var.m26557b() : this.f17555b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26558c() {
        ao4 ao4Var = (ao4) this.f17559f.getValue();
        return ao4Var != null ? ao4Var.m26558c() : this.f17556c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26559d() {
        ao4 ao4Var = (ao4) this.f17559f.getValue();
        return ao4Var != null ? ao4Var.m26559d() : this.f17557d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("mftplus_enable_backskip", "android-reinvent-free-flags", m26556a()), new k8a("mftplus_enable_repeat", "android-reinvent-free-flags", m26557b()), new k8a("mftplus_enable_seeking", "android-reinvent-free-flags", m26558c()), new k8a("show_tooltip_on_skip_to_error", "android-reinvent-free-flags", m26559d()));
    }

    public ao4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
