package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mdm0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f142450a;

    /* JADX INFO: renamed from: b */
    public final boolean f142451b;

    /* JADX INFO: renamed from: c */
    public final boolean f142452c;

    /* JADX INFO: renamed from: d */
    public final boolean f142453d;

    /* JADX INFO: renamed from: e */
    public final bji f142454e;

    /* JADX INFO: renamed from: f */
    public final wg61 f142455f;

    public mdm0(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f142450a = z;
        this.f142451b = z2;
        this.f142452c = z3;
        this.f142453d = z4;
        this.f142454e = bjiVar;
        this.f142455f = new wg61(new vvk0(this, 28));
    }

    /* JADX INFO: renamed from: e */
    public static mdm0 m61522e(uys0 uys0Var) {
        return new mdm0(uys0Var.mo47707c("page-match:book_matching_enabled", false), uys0Var.mo47707c("page-match:landing_page_redesign_enabled", false), uys0Var.mo47707c("page-match:onboarding_redesign_enabled", false), uys0Var.mo47707c("page-match:outbound_improvements_enabled", false), null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61523a() {
        mdm0 mdm0Var = (mdm0) this.f142455f.getValue();
        return mdm0Var != null ? mdm0Var.m61523a() : this.f142450a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61524b() {
        mdm0 mdm0Var = (mdm0) this.f142455f.getValue();
        return mdm0Var != null ? mdm0Var.m61524b() : this.f142451b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61525c() {
        mdm0 mdm0Var = (mdm0) this.f142455f.getValue();
        return mdm0Var != null ? mdm0Var.m61525c() : this.f142452c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61526d() {
        mdm0 mdm0Var = (mdm0) this.f142455f.getValue();
        return mdm0Var != null ? mdm0Var.m61526d() : this.f142453d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("book_matching_enabled", "page-match", m61523a()), new k8a("landing_page_redesign_enabled", "page-match", m61524b()), new k8a("onboarding_redesign_enabled", "page-match", m61525c()), new k8a("outbound_improvements_enabled", "page-match", m61526d()));
    }

    public mdm0(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
