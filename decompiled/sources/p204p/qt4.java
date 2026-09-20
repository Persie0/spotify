package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qt4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f192280a;

    /* JADX INFO: renamed from: b */
    public final boolean f192281b;

    /* JADX INFO: renamed from: c */
    public final boolean f192282c;

    /* JADX INFO: renamed from: d */
    public final boolean f192283d;

    /* JADX INFO: renamed from: e */
    public final boolean f192284e;

    /* JADX INFO: renamed from: f */
    public final boolean f192285f;

    /* JADX INFO: renamed from: g */
    public final boolean f192286g;

    /* JADX INFO: renamed from: h */
    public final boolean f192287h;

    /* JADX INFO: renamed from: i */
    public final bji f192288i;

    /* JADX INFO: renamed from: j */
    public final wg61 f192289j;

    public qt4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bji bjiVar) {
        this.f192280a = z;
        this.f192281b = z2;
        this.f192282c = z3;
        this.f192283d = z4;
        this.f192284e = z5;
        this.f192285f = z6;
        this.f192286g = z7;
        this.f192287h = z8;
        this.f192288i = bjiVar;
        this.f192289j = new wg61(new zr4(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73793a() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73793a() : this.f192280a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73794b() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73794b() : this.f192281b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m73795c() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73795c() : this.f192282c;
    }

    /* JADX INFO: renamed from: d */
    public final qt4 m73796d() {
        return (qt4) this.f192289j.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m73797e() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73797e() : this.f192283d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m73798f() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73798f() : this.f192284e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73799g() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73799g() : this.f192285f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m73800h() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73800h() : this.f192286g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m73801i() {
        qt4 qt4VarM73796d = m73796d();
        return qt4VarM73796d != null ? qt4VarM73796d.m73801i() : this.f192287h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cn_element_carousel_for_nova_scroll_enabled", "android-video-preview-flags", m73793a()), new k8a("cn_element_carousel_play_entire_podcast_video_enabled", "android-video-preview-flags", m73794b()), new k8a("cn_element_carousel_use_common_trait_for_preview_playback", "android-video-preview-flags", m73795c()), new k8a("disable_all_previews", "android-video-preview-flags", m73797e()), new k8a("element_videos_carousel_enabled", "android-video-preview-flags", m73798f()), new k8a("enable_duration_label_video_preview_carousel", "android-video-preview-flags", m73799g()), new k8a("multiplayer_stream_reporting_enabled", "android-video-preview-flags", m73800h()), new k8a("use_compose_video_card_ui", "android-video-preview-flags", m73801i()));
    }

    public qt4(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, bjiVar);
    }
}
