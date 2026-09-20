package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class w84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248840a;

    /* JADX INFO: renamed from: b */
    public final boolean f248841b;

    /* JADX INFO: renamed from: c */
    public final boolean f248842c;

    /* JADX INFO: renamed from: d */
    public final boolean f248843d;

    /* JADX INFO: renamed from: e */
    public final boolean f248844e;

    /* JADX INFO: renamed from: f */
    public final boolean f248845f;

    /* JADX INFO: renamed from: g */
    public final boolean f248846g;

    /* JADX INFO: renamed from: h */
    public final fnk0 f248847h;

    /* JADX INFO: renamed from: i */
    public final bji f248848i;

    /* JADX INFO: renamed from: j */
    public final wg61 f248849j;

    /* JADX INFO: renamed from: k */
    public final wg61 f248850k;

    public w84(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, fnk0 fnk0Var, bji bjiVar) {
        this.f248840a = z;
        this.f248841b = z2;
        this.f248842c = z3;
        this.f248843d = z4;
        this.f248844e = z5;
        this.f248845f = z6;
        this.f248846g = z7;
        this.f248847h = fnk0Var;
        this.f248848i = bjiVar;
        this.f248849j = new wg61(new u84(this, 1));
        this.f248850k = new wg61(new u84(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final w84 m87439a() {
        return (w84) this.f248850k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87440b() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87440b() : this.f248840a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87441c() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87441c() : this.f248841b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m87442d() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87442d() : this.f248843d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m87443e() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87443e() : this.f248844e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87444f() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87444f() : this.f248845f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m87445g() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87445g() : this.f248846g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m87446h() {
        w84 w84VarM87439a = m87439a();
        return w84VarM87439a != null ? w84VarM87439a.m87446h() : this.f248842c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_compose", "android-gen-alpha-account-creation", m87440b()), new k8a("invite_members_parental_consent_flow_enabled", "android-gen-alpha-account-creation", m87441c()), new k8a("is_member_details_parent_consent_flow_enabled", "android-gen-alpha-account-creation", m87446h()), new k8a("parental_consent_flow_enabled", "android-gen-alpha-account-creation", m87442d()), new k8a("parental_controls_transition_entry_point_enabled", "android-gen-alpha-account-creation", m87443e()), new k8a("teen_initiated_link_enabled", "android-gen-alpha-account-creation", m87444f()), new k8a("teen_link_enabled", "android-gen-alpha-account-creation", m87445g()));
    }

    public w84(fnk0 fnk0Var, bji bjiVar) {
        this(false, false, false, false, false, false, false, fnk0Var, bjiVar);
    }
}
