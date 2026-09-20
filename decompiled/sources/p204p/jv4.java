package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f116241a;

    /* JADX INFO: renamed from: b */
    public final iv4 f116242b;

    /* JADX INFO: renamed from: c */
    public final boolean f116243c;

    /* JADX INFO: renamed from: d */
    public final boolean f116244d;

    /* JADX INFO: renamed from: e */
    public final boolean f116245e;

    /* JADX INFO: renamed from: f */
    public final boolean f116246f;

    /* JADX INFO: renamed from: g */
    public final boolean f116247g;

    /* JADX INFO: renamed from: h */
    public final boolean f116248h;

    /* JADX INFO: renamed from: i */
    public final boolean f116249i;

    /* JADX INFO: renamed from: j */
    public final bji f116250j;

    /* JADX INFO: renamed from: k */
    public final wg61 f116251k = new wg61(new uu4(this, 9));

    public jv4(boolean z, iv4 iv4Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bji bjiVar) {
        this.f116241a = z;
        this.f116242b = iv4Var;
        this.f116243c = z2;
        this.f116244d = z3;
        this.f116245e = z4;
        this.f116246f = z5;
        this.f116247g = z6;
        this.f116248h = z7;
        this.f116249i = z8;
        this.f116250j = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m54361a() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54361a() : this.f116241a;
    }

    /* JADX INFO: renamed from: b */
    public final jv4 m54362b() {
        return (jv4) this.f116251k.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final iv4 m54363c() {
        iv4 iv4VarM54363c;
        jv4 jv4VarM54362b = m54362b();
        return (jv4VarM54362b == null || (iv4VarM54363c = jv4VarM54362b.m54363c()) == null) ? this.f116242b : iv4VarM54363c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54364d() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54364d() : this.f116243c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54365e() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54365e() : this.f116244d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m54366f() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54366f() : this.f116245e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m54367g() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54367g() : this.f116246f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m54368h() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54368h() : this.f116247g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m54369i() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54369i() : this.f116248h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m54370j() {
        jv4 jv4VarM54362b = m54362b();
        return jv4VarM54362b != null ? jv4VarM54362b.m54370j() : this.f116249i;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("customizable_widget", "android-widgets-npvwidget", m54361a());
        String str = m54363c().f106115a;
        iv4[] iv4VarArrValues = iv4.values();
        ArrayList arrayList = new ArrayList(iv4VarArrValues.length);
        for (iv4 iv4Var : iv4VarArrValues) {
            arrayList.add(iv4Var.f106115a);
        }
        return h6f.m46715L(k8aVar, new k8a("entity_click_behaviour", "android-widgets-npvwidget", str, arrayList), new k8a("fetch_traits_metadata", "android-widgets-npvwidget", m54364d()), new k8a("hide_skip_buttons_in_compact_format", "android-widgets-npvwidget", m54365e()), new k8a("launcher_logging", "android-widgets-npvwidget", m54366f()), new k8a("recommendations_cache", "android-widgets-npvwidget", m54367g()), new k8a("save_action", "android-widgets-npvwidget", m54368h()), new k8a("use_loader_with_cross_profile", "android-widgets-npvwidget", m54369i()), new k8a("wrapped_campaign_enabled", "android-widgets-npvwidget", m54370j()));
    }
}
