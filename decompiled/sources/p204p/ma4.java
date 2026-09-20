package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ma4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f141452a;

    /* JADX INFO: renamed from: b */
    public final boolean f141453b;

    /* JADX INFO: renamed from: c */
    public final boolean f141454c;

    /* JADX INFO: renamed from: d */
    public final boolean f141455d;

    /* JADX INFO: renamed from: e */
    public final boolean f141456e;

    /* JADX INFO: renamed from: f */
    public final boolean f141457f;

    /* JADX INFO: renamed from: g */
    public final boolean f141458g;

    /* JADX INFO: renamed from: h */
    public final bji f141459h;

    /* JADX INFO: renamed from: i */
    public final wg61 f141460i;

    public ma4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f141452a = z;
        this.f141453b = z2;
        this.f141454c = z3;
        this.f141455d = z4;
        this.f141456e = z5;
        this.f141457f = z6;
        this.f141458g = z7;
        this.f141459h = bjiVar;
        this.f141460i = new wg61(new ga4(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61246a() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61246a() : this.f141452a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61247b() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61247b() : this.f141453b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61248c() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61248c() : this.f141454c;
    }

    /* JADX INFO: renamed from: d */
    public final ma4 m61249d() {
        return (ma4) this.f141460i.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m61250e() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61250e() : this.f141455d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m61251f() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61251f() : this.f141456e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61252g() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61252g() : this.f141457f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61253h() {
        ma4 ma4VarM61249d = m61249d();
        return ma4VarM61249d != null ? ma4VarM61249d.m61253h() : this.f141458g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("carousel_use_elements_ui", "android-libs-allboarding", m61246a()), new k8a("contentpicker_use_element_ui", "android-libs-allboarding", m61247b()), new k8a("contextualaudio_use_element_ui", "android-libs-allboarding", m61248c()), new k8a("notification_permission_use_element_ui", "android-libs-allboarding", m61250e()), new k8a("search_use_element_ui", "android-libs-allboarding", m61251f()), new k8a("use_content_stack", "android-libs-allboarding", m61252g()), new k8a("use_page_api_flow", "android-libs-allboarding", m61253h()));
    }

    public ma4(bji bjiVar) {
        this(false, false, false, false, false, false, false, bjiVar);
    }
}
