package p204p;

import com.spotify.searchview.proto.AudioEpisode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95242a;

    /* JADX INFO: renamed from: b */
    public final boolean f95243b;

    /* JADX INFO: renamed from: c */
    public final boolean f95244c;

    /* JADX INFO: renamed from: d */
    public final boolean f95245d;

    /* JADX INFO: renamed from: e */
    public final int f95246e;

    /* JADX INFO: renamed from: f */
    public final boolean f95247f;

    /* JADX INFO: renamed from: g */
    public final boolean f95248g;

    /* JADX INFO: renamed from: h */
    public final bji f95249h;

    /* JADX INFO: renamed from: i */
    public final wg61 f95250i;

    public hu3(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bji bjiVar) {
        this.f95242a = z;
        this.f95243b = z2;
        this.f95244c = z3;
        this.f95245d = z4;
        this.f95246e = i;
        this.f95247f = z5;
        this.f95248g = z6;
        this.f95249h = bjiVar;
        this.f95250i = new wg61(new w62(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final hu3 m48595a() {
        return (hu3) this.f95250i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m48596b() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48596b() : this.f95242a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m48597c() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48597c() : this.f95243b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m48598d() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48598d() : this.f95244c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m48599e() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48599e() : this.f95245d;
    }

    /* JADX INFO: renamed from: f */
    public final int m48600f() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48600f() : this.f95246e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m48601g() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48601g() : this.f95247f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48602h() {
        hu3 hu3VarM48595a = m48595a();
        return hu3VarM48595a != null ? hu3VarM48595a.m48602h() : this.f95248g;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("embedded_ad_html_element_enabled", "android-adsdisplay-embeddedad", m48596b()), new k8a("foreground_enabled", "android-adsdisplay-embeddedad", m48597c()), new k8a("music_track_change_enabled", "android-adsdisplay-embeddedad", m48598d()), new k8a("prioritize_canvas", "android-adsdisplay-embeddedad", m48599e()), new k8a("render_delay_ms", "android-adsdisplay-embeddedad", m48600f(), 0, 9999999), new k8a("tablet_supported", "android-adsdisplay-embeddedad", m48601g()), new k8a("updated_canvas_transitions", "android-adsdisplay-embeddedad", m48602h()));
    }

    public hu3(bji bjiVar) {
        this(AudioEpisode.SHOW_URI_FIELD_NUMBER, false, false, false, true, false, false, bjiVar);
    }
}
