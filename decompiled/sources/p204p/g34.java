package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f76085a;

    /* JADX INFO: renamed from: b */
    public final boolean f76086b;

    /* JADX INFO: renamed from: c */
    public final boolean f76087c;

    /* JADX INFO: renamed from: d */
    public final boolean f76088d;

    /* JADX INFO: renamed from: e */
    public final boolean f76089e;

    /* JADX INFO: renamed from: f */
    public final boolean f76090f;

    /* JADX INFO: renamed from: g */
    public final boolean f76091g;

    /* JADX INFO: renamed from: h */
    public final boolean f76092h;

    /* JADX INFO: renamed from: i */
    public final boolean f76093i;

    /* JADX INFO: renamed from: j */
    public final bji f76094j;

    /* JADX INFO: renamed from: k */
    public final wg61 f76095k = new wg61(new u14(this, 16));

    public g34(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, bji bjiVar) {
        this.f76085a = z;
        this.f76086b = z2;
        this.f76087c = z3;
        this.f76088d = z4;
        this.f76089e = z5;
        this.f76090f = z6;
        this.f76091g = z7;
        this.f76092h = z8;
        this.f76093i = z9;
        this.f76094j = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43430a() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43430a() : this.f76085a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43431b() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43431b() : this.f76086b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43432c() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43432c() : this.f76087c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43433d() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43433d() : this.f76088d;
    }

    /* JADX INFO: renamed from: e */
    public final g34 m43434e() {
        return (g34) this.f76095k.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m43435f() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43435f() : this.f76089e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m43436g() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43436g() : this.f76090f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43437h() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43437h() : this.f76091g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m43438i() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43438i() : this.f76092h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m43439j() {
        g34 g34VarM43434e = m43434e();
        return g34VarM43434e != null ? g34VarM43434e.m43439j() : this.f76093i;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("audiobook_clips_enabled", "android-entity-segments", m43430a()), new k8a("clip_detail_sections_via_list_endpoint_enabled", "android-entity-segments", m43431b()), new k8a("clip_notes_enabled", "android-entity-segments", m43432c()), new k8a("creator_timeline_active_segment_enabled", "android-entity-segments", m43433d()), new k8a("enable_chapter_aware_episode_rows", "android-entity-segments", m43435f()), new k8a("enable_content_experience_trait_on_entity_page", "android-entity-segments", m43436g()), new k8a("enable_track_uris_for_episode_rows", "android-entity-segments", m43437h()), new k8a("music_clips_enabled", "android-entity-segments", m43438i()), new k8a("release_row_data_element_enabled", "android-entity-segments", m43439j()));
    }
}
