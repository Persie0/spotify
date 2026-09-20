package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ii4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f102430a;

    /* JADX INFO: renamed from: b */
    public final boolean f102431b;

    /* JADX INFO: renamed from: c */
    public final boolean f102432c;

    /* JADX INFO: renamed from: d */
    public final boolean f102433d;

    /* JADX INFO: renamed from: e */
    public final boolean f102434e;

    /* JADX INFO: renamed from: f */
    public final boolean f102435f;

    /* JADX INFO: renamed from: g */
    public final boolean f102436g;

    /* JADX INFO: renamed from: h */
    public final boolean f102437h;

    /* JADX INFO: renamed from: i */
    public final boolean f102438i;

    /* JADX INFO: renamed from: j */
    public final boolean f102439j;

    /* JADX INFO: renamed from: k */
    public final boolean f102440k;

    /* JADX INFO: renamed from: l */
    public final boolean f102441l;

    /* JADX INFO: renamed from: m */
    public final boolean f102442m;

    /* JADX INFO: renamed from: n */
    public final boolean f102443n;

    /* JADX INFO: renamed from: o */
    public final bji f102444o;

    /* JADX INFO: renamed from: p */
    public final wg61 f102445p;

    public ii4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, bji bjiVar) {
        this.f102430a = z;
        this.f102431b = z2;
        this.f102432c = z3;
        this.f102433d = z4;
        this.f102434e = z5;
        this.f102435f = z6;
        this.f102436g = z7;
        this.f102437h = z8;
        this.f102438i = z9;
        this.f102439j = z10;
        this.f102440k = z11;
        this.f102441l = z12;
        this.f102442m = z13;
        this.f102443n = z14;
        this.f102444o = bjiVar;
        this.f102445p = new wg61(new bh4(this, 21));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m50678a() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50678a() : this.f102430a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m50679b() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50679b() : this.f102431b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50680c() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50680c() : this.f102432c;
    }

    /* JADX INFO: renamed from: d */
    public final ii4 m50681d() {
        return (ii4) this.f102445p.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m50682e() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50682e() : this.f102433d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m50683f() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50683f() : this.f102434e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50684g() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50684g() : this.f102435f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m50685h() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50685h() : this.f102436g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m50686i() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50686i() : this.f102437h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m50687j() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50687j() : this.f102438i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m50688k() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50688k() : this.f102439j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m50689l() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50689l() : this.f102440k;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m50690m() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50690m() : this.f102441l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("add_to_button_saves_association", "android-music-videos-flags", m50678a()), new k8a("artist_autoplay_enabled", "android-music-videos-flags", m50679b()), new k8a("auto_play_silent_failure_check", "android-music-videos-flags", m50680c()), new k8a("deeplink_georestricted_play_association", "android-music-videos-flags", m50682e()), new k8a("disable_all_previews", "android-music-videos-flags", m50683f()), new k8a("disable_playback_over_connect_speakers", "android-music-videos-flags", m50684g()), new k8a("enable_download_header_on_music_video_playlist", "android-music-videos-flags", m50685h()), new k8a("enable_individual_music_video_download", "android-music-videos-flags", m50686i()), new k8a("enable_video_download_state_data_source", "android-music-videos-flags", m50687j()), new k8a("enable_video_selection_sheet", "android-music-videos-flags", m50688k()), new k8a("heart_button_saves_association", "android-music-videos-flags", m50689l()), new k8a("music_video_deeplink_on_free_enabled", "android-music-videos-flags", m50690m()), new k8a("new_autoplay_api_enabled", "android-music-videos-flags", m50691n()), new k8a("npv_autoplay_enabled", "android-music-videos-flags", m50692o()));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m50691n() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50691n() : this.f102442m;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m50692o() {
        ii4 ii4VarM50681d = m50681d();
        return ii4VarM50681d != null ? ii4VarM50681d.m50692o() : this.f102443n;
    }

    public ii4(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, bjiVar);
    }
}
