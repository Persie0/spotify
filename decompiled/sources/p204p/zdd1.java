package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zdd1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281684a;

    /* JADX INFO: renamed from: b */
    public final boolean f281685b;

    /* JADX INFO: renamed from: c */
    public final boolean f281686c;

    /* JADX INFO: renamed from: d */
    public final boolean f281687d;

    /* JADX INFO: renamed from: e */
    public final boolean f281688e;

    /* JADX INFO: renamed from: f */
    public final bji f281689f;

    /* JADX INFO: renamed from: g */
    public final wg61 f281690g;

    public zdd1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f281684a = z;
        this.f281685b = z2;
        this.f281686c = z3;
        this.f281687d = z4;
        this.f281688e = z5;
        this.f281689f = bjiVar;
        this.f281690g = new wg61(new ixb1(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95915a() {
        zdd1 zdd1Var = (zdd1) this.f281690g.getValue();
        return zdd1Var != null ? zdd1Var.m95915a() : this.f281684a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95916b() {
        zdd1 zdd1Var = (zdd1) this.f281690g.getValue();
        return zdd1Var != null ? zdd1Var.m95916b() : this.f281685b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95917c() {
        zdd1 zdd1Var = (zdd1) this.f281690g.getValue();
        return zdd1Var != null ? zdd1Var.m95917c() : this.f281686c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95918d() {
        zdd1 zdd1Var = (zdd1) this.f281690g.getValue();
        return zdd1Var != null ? zdd1Var.m95918d() : this.f281687d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95919e() {
        zdd1 zdd1Var = (zdd1) this.f281690g.getValue();
        return zdd1Var != null ? zdd1Var.m95919e() : this.f281688e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("spotify_playlist_check_enabled", "watch-feed-playlist-section", m95915a()), new k8a("watchfeed_discovery_section_enabled", "watch-feed-playlist-section", m95916b()), new k8a("watchfeed_entity_explorer_in_header_enabled", "watch-feed-playlist-section", m95917c()), new k8a("watchfeed_inline_entity_explorer_row_enabled", "watch-feed-playlist-section", m95918d()), new k8a("watchfeed_playlist_enabled", "watch-feed-playlist-section", m95919e()));
    }

    public zdd1(bji bjiVar) {
        this(true, false, true, true, false, bjiVar);
    }
}
