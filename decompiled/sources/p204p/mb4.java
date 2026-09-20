package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f141790a;

    /* JADX INFO: renamed from: b */
    public final boolean f141791b;

    /* JADX INFO: renamed from: c */
    public final boolean f141792c;

    /* JADX INFO: renamed from: d */
    public final bji f141793d;

    /* JADX INFO: renamed from: e */
    public final wg61 f141794e;

    public mb4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f141790a = z;
        this.f141791b = z2;
        this.f141792c = z3;
        this.f141793d = bjiVar;
        this.f141794e = new wg61(new ga4(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61345a() {
        mb4 mb4Var = (mb4) this.f141794e.getValue();
        return mb4Var != null ? mb4Var.m61345a() : this.f141790a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61346b() {
        mb4 mb4Var = (mb4) this.f141794e.getValue();
        return mb4Var != null ? mb4Var.m61346b() : this.f141791b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61347c() {
        mb4 mb4Var = (mb4) this.f141794e.getValue();
        return mb4Var != null ? mb4Var.m61347c() : this.f141792c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_audio_uri_for_saves_association", "android-libs-music-video-playlists", m61345a()), new k8a("enable_music_video_playlist", "android-libs-music-video-playlists", m61346b()), new k8a("exclude_artist_music_videos", "android-libs-music-video-playlists", m61347c()));
    }

    public mb4(bji bjiVar) {
        this(false, true, true, bjiVar);
    }
}
