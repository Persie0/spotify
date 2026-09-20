package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pu4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f181323a;

    /* JADX INFO: renamed from: b */
    public final boolean f181324b;

    /* JADX INFO: renamed from: c */
    public final boolean f181325c;

    /* JADX INFO: renamed from: d */
    public final boolean f181326d;

    /* JADX INFO: renamed from: e */
    public final boolean f181327e;

    /* JADX INFO: renamed from: f */
    public final boolean f181328f;

    /* JADX INFO: renamed from: g */
    public final boolean f181329g;

    /* JADX INFO: renamed from: h */
    public final bji f181330h;

    /* JADX INFO: renamed from: i */
    public final wg61 f181331i;

    public pu4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f181323a = z;
        this.f181324b = z2;
        this.f181325c = z3;
        this.f181326d = z4;
        this.f181327e = z5;
        this.f181328f = z6;
        this.f181329g = z7;
        this.f181330h = bjiVar;
        this.f181331i = new wg61(new zr4(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71058a() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71058a() : this.f181323a;
    }

    /* JADX INFO: renamed from: b */
    public final pu4 m71059b() {
        return (pu4) this.f181331i.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m71060c() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71060c() : this.f181324b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m71061d() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71061d() : this.f181325c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m71062e() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71062e() : this.f181326d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m71063f() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71063f() : this.f181327e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m71064g() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71064g() : this.f181328f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m71065h() {
        pu4 pu4VarM71059b = m71059b();
        return pu4VarM71059b != null ? pu4VarM71059b.m71065h() : this.f181329g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("boxed_entity_row_playlist_cache_sync_enabled", "android-watch-feed-components", m71058a()), new k8a("disable_adaptive_content_prewarming", "android-watch-feed-components", m71060c()), new k8a("disable_progressive_content_prewarming", "android-watch-feed-components", m71061d()), new k8a("enable_surface_view", "android-watch-feed-components", m71062e()), new k8a("replace_explore_button_with_search_bar", "android-watch-feed-components", m71063f()), new k8a("skip_aligned_curation_dialog_on_remove", "android-watch-feed-components", m71064g()), new k8a("tap_to_mute_gesture_enabled", "android-watch-feed-components", m71065h()));
    }

    public pu4(bji bjiVar) {
        this(true, false, false, false, false, false, false, bjiVar);
    }
}
