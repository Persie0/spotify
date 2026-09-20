package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f278750a;

    /* JADX INFO: renamed from: b */
    public final boolean f278751b;

    /* JADX INFO: renamed from: c */
    public final boolean f278752c;

    /* JADX INFO: renamed from: d */
    public final boolean f278753d;

    /* JADX INFO: renamed from: e */
    public final boolean f278754e;

    /* JADX INFO: renamed from: f */
    public final boolean f278755f;

    /* JADX INFO: renamed from: g */
    public final int f278756g;

    /* JADX INFO: renamed from: h */
    public final boolean f278757h;

    /* JADX INFO: renamed from: i */
    public final boolean f278758i;

    /* JADX INFO: renamed from: j */
    public final boolean f278759j;

    /* JADX INFO: renamed from: k */
    public final boolean f278760k;

    /* JADX INFO: renamed from: l */
    public final bji f278761l;

    /* JADX INFO: renamed from: m */
    public final wg61 f278762m;

    public z34(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, boolean z8, boolean z9, boolean z10, bji bjiVar) {
        this.f278750a = z;
        this.f278751b = z2;
        this.f278752c = z3;
        this.f278753d = z4;
        this.f278754e = z5;
        this.f278755f = z6;
        this.f278756g = i;
        this.f278757h = z7;
        this.f278758i = z8;
        this.f278759j = z9;
        this.f278760k = z10;
        this.f278761l = bjiVar;
        this.f278762m = new wg61(new y34(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95248a() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95248a() : this.f278750a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95249b() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95249b() : this.f278751b;
    }

    /* JADX INFO: renamed from: c */
    public final z34 m95250c() {
        return (z34) this.f278762m.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95251d() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95251d() : this.f278752c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95252e() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95252e() : this.f278753d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95253f() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95253f() : this.f278754e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95254g() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95254g() : this.f278755f;
    }

    /* JADX INFO: renamed from: h */
    public final int m95255h() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95255h() : this.f278756g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95256i() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95256i() : this.f278757h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m95257j() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95257j() : this.f278758i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m95258k() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95258k() : this.f278759j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m95259l() {
        z34 z34VarM95250c = m95250c();
        return z34VarM95250c != null ? z34VarM95250c.m95259l() : this.f278760k;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("age_assurance_permission_enabled", "android-feature-album-page", m95248a()), new k8a("context_menu_in_toolbar_trailing_action", "android-feature-album-page", m95249b()), new k8a("enable_album_cwp_page", "android-feature-album-page", m95251d()), new k8a("enable_omni_play_button", "android-feature-album-page", m95252e()), new k8a("preload_watch_feed_cdp", "android-feature-album-page", m95253f()), new k8a("prerelease_in_cwp_enabled", "android-feature-album-page", m95254g()), new k8a("redirect_to_cdp_timeout", "android-feature-album-page", m95255h(), 0, 3000), new k8a("share_in_action_row_enabled", "android-feature-album-page", m95256i()), new k8a("should_use_compose_encore_list_row", "android-feature-album-page", m95257j()), new k8a("use_curation_state_api_for_banned_state", "android-feature-album-page", m95258k()), new k8a("use_mdc_carousel", "android-feature-album-page", m95259l()));
    }

    public z34(bji bjiVar) {
        this(false, false, false, false, false, false, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, false, false, false, false, bjiVar);
    }
}
