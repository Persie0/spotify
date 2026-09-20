package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140353a;

    /* JADX INFO: renamed from: b */
    public final boolean f140354b;

    /* JADX INFO: renamed from: c */
    public final boolean f140355c;

    /* JADX INFO: renamed from: d */
    public final boolean f140356d;

    /* JADX INFO: renamed from: e */
    public final boolean f140357e;

    /* JADX INFO: renamed from: f */
    public final boolean f140358f;

    /* JADX INFO: renamed from: g */
    public final boolean f140359g;

    /* JADX INFO: renamed from: h */
    public final bji f140360h;

    /* JADX INFO: renamed from: i */
    public final wg61 f140361i;

    public m64(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f140353a = z;
        this.f140354b = z2;
        this.f140355c = z3;
        this.f140356d = z4;
        this.f140357e = z5;
        this.f140358f = z6;
        this.f140359g = z7;
        this.f140360h = bjiVar;
        this.f140361i = new wg61(new o54(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final m64 m60938a() {
        return (m64) this.f140361i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60939b() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60939b() : this.f140353a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60940c() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60940c() : this.f140354b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m60941d() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60941d() : this.f140355c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60942e() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60942e() : this.f140356d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m60943f() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60943f() : this.f140357e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m60944g() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60944g() : this.f140358f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m60945h() {
        m64 m64VarM60938a = m60938a();
        return m64VarM60938a != null ? m64VarM60938a.m60945h() : this.f140359g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("disclosure_sheet_enabled", "android-feature-prompted-playlists", m60939b()), new k8a("edit_ucp_prompt_page_enabled", "android-feature-prompted-playlists", m60940c()), new k8a("mixing_enabled", "android-feature-prompted-playlists", m60941d()), new k8a("overdue_refresh_enabled", "android-feature-prompted-playlists", m60942e()), new k8a("prompt_cancelled_cmp_trigger_enabled", "android-feature-prompted-playlists", m60943f()), new k8a("refining_enabled", "android-feature-prompted-playlists", m60944g()), new k8a("user_header_plugins_instead_of_custom_header", "android-feature-prompted-playlists", m60945h()));
    }

    public m64(bji bjiVar) {
        this(false, false, false, false, false, false, false, bjiVar);
    }
}
