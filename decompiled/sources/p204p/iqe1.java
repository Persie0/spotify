package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iqe1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f104747a;

    /* JADX INFO: renamed from: b */
    public final boolean f104748b;

    /* JADX INFO: renamed from: c */
    public final boolean f104749c;

    /* JADX INFO: renamed from: d */
    public final boolean f104750d;

    /* JADX INFO: renamed from: e */
    public final boolean f104751e;

    /* JADX INFO: renamed from: f */
    public final bji f104752f;

    /* JADX INFO: renamed from: g */
    public final wg61 f104753g;

    public iqe1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f104747a = z;
        this.f104748b = z2;
        this.f104749c = z3;
        this.f104750d = z4;
        this.f104751e = z5;
        this.f104752f = bjiVar;
        this.f104753g = new wg61(new b4e1(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51356a() {
        iqe1 iqe1Var = (iqe1) this.f104753g.getValue();
        return iqe1Var != null ? iqe1Var.m51356a() : this.f104747a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51357b() {
        iqe1 iqe1Var = (iqe1) this.f104753g.getValue();
        return iqe1Var != null ? iqe1Var.m51357b() : this.f104748b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m51358c() {
        iqe1 iqe1Var = (iqe1) this.f104753g.getValue();
        return iqe1Var != null ? iqe1Var.m51358c() : this.f104749c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m51359d() {
        iqe1 iqe1Var = (iqe1) this.f104753g.getValue();
        return iqe1Var != null ? iqe1Var.m51359d() : this.f104750d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m51360e() {
        iqe1 iqe1Var = (iqe1) this.f104753g.getValue();
        return iqe1Var != null ? iqe1Var.m51360e() : this.f104751e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cold_start_enabled", "your-library", m51356a()), new k8a("filter_reordering_enabled", "your-library", m51357b()), new k8a("library_settings_enabled", "your-library", m51358c()), new k8a("remember_filter_state_enabled", "your-library", m51359d()), new k8a("select_items_enabled", "your-library", m51360e()));
    }

    public iqe1(bji bjiVar) {
        this(false, false, false, false, false, bjiVar);
    }
}
