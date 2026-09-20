package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f24755a;

    /* JADX INFO: renamed from: b */
    public final boolean f24756b;

    /* JADX INFO: renamed from: c */
    public final boolean f24757c;

    /* JADX INFO: renamed from: d */
    public final boolean f24758d;

    /* JADX INFO: renamed from: e */
    public final boolean f24759e;

    /* JADX INFO: renamed from: f */
    public final boolean f24760f;

    /* JADX INFO: renamed from: g */
    public final fnk0 f24761g;

    /* JADX INFO: renamed from: h */
    public final bji f24762h;

    /* JADX INFO: renamed from: i */
    public final wg61 f24763i = new wg61(new f30(this, 15));

    /* JADX INFO: renamed from: j */
    public final wg61 f24764j = new wg61(new f74(this, 20));

    public b94(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, fnk0 fnk0Var, bji bjiVar) {
        this.f24755a = z;
        this.f24756b = z2;
        this.f24757c = z3;
        this.f24758d = z4;
        this.f24759e = z5;
        this.f24760f = z6;
        this.f24761g = fnk0Var;
        this.f24762h = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final b94 m28444a() {
        return (b94) this.f24764j.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28445b() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28445b() : this.f24755a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28446c() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28446c() : this.f24756b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28447d() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28447d() : this.f24759e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28448e() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28448e() : this.f24760f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28449f() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28449f() : this.f24757c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28450g() {
        b94 b94VarM28444a = m28444a();
        return b94VarM28444a != null ? b94VarM28444a.m28450g() : this.f24758d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_login_qr_code_url_decoration", "android-gen-alpha", m28445b()), new k8a("fma_upgrade_dialog_enabled", "android-gen-alpha", m28446c()), new k8a("is_managed_teen_account_parent_controls_enabled", "android-gen-alpha", m28449f()), new k8a("is_teen_graduation_enabled", "android-gen-alpha", m28450g()), new k8a("parent_details_enabled", "android-gen-alpha", m28447d()), new k8a("use_kids_view_get_children", "android-gen-alpha", m28448e()));
    }
}
