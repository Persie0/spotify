package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f89977a;

    /* JADX INFO: renamed from: b */
    public final boolean f89978b;

    /* JADX INFO: renamed from: c */
    public final boolean f89979c;

    /* JADX INFO: renamed from: d */
    public final boolean f89980d;

    /* JADX INFO: renamed from: e */
    public final boolean f89981e;

    /* JADX INFO: renamed from: f */
    public final boolean f89982f;

    /* JADX INFO: renamed from: g */
    public final boolean f89983g;

    /* JADX INFO: renamed from: h */
    public final boolean f89984h;

    /* JADX INFO: renamed from: i */
    public final boolean f89985i;

    /* JADX INFO: renamed from: j */
    public final bji f89986j;

    /* JADX INFO: renamed from: k */
    public final wg61 f89987k = new wg61(new dd4(this, 2));

    public hd4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, bji bjiVar) {
        this.f89977a = z;
        this.f89978b = z2;
        this.f89979c = z3;
        this.f89980d = z4;
        this.f89981e = z5;
        this.f89982f = z6;
        this.f89983g = z7;
        this.f89984h = z8;
        this.f89985i = z9;
        this.f89986j = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47154a() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47154a() : this.f89977a;
    }

    /* JADX INFO: renamed from: b */
    public final hd4 m47155b() {
        return (hd4) this.f89987k.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m47156c() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47156c() : this.f89978b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m47157d() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47157d() : this.f89979c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m47158e() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47158e() : this.f89980d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m47159f() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47159f() : this.f89981e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m47160g() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47160g() : this.f89982f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m47161h() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47161h() : this.f89983g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47162i() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47162i() : this.f89984h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m47163j() {
        hd4 hd4VarM47155b = m47155b();
        return hd4VarM47155b != null ? hd4VarM47155b.m47163j() : this.f89985i;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("content_filter_stacking_enabled", "android-libs-your-episodes-flags", m47154a()), new k8a("enable_inline_sort_order", "android-libs-your-episodes-flags", m47156c()), new k8a("enable_sortby_recently_played", "android-libs-your-episodes-flags", m47157d()), new k8a("enable_sortby_show_name", "android-libs-your-episodes-flags", m47158e()), new k8a("remove_played_hint_card_enabled", "android-libs-your-episodes-flags", m47159f()), new k8a("remove_unplayed_settings_enabled", "android-libs-your-episodes-flags", m47160g()), new k8a("reordering_enabled", "android-libs-your-episodes-flags", m47161h()), new k8a("sort_order_enabled", "android-libs-your-episodes-flags", m47162i()), new k8a("text_filter_and_sort_options_enabled", "android-libs-your-episodes-flags", m47163j()));
    }
}
