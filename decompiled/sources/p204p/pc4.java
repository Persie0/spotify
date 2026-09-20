package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f175946a;

    /* JADX INFO: renamed from: b */
    public final boolean f175947b;

    /* JADX INFO: renamed from: c */
    public final bji f175948c;

    /* JADX INFO: renamed from: d */
    public final wg61 f175949d = new wg61(new sb4(this, 19));

    public pc4(boolean z, boolean z2, bji bjiVar) {
        this.f175946a = z;
        this.f175947b = z2;
        this.f175948c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69541a() {
        pc4 pc4Var = (pc4) this.f175949d.getValue();
        return pc4Var != null ? pc4Var.m69541a() : this.f175946a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69542b() {
        pc4 pc4Var = (pc4) this.f175949d.getValue();
        return pc4Var != null ? pc4Var.m69542b() : this.f175947b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("always_show_windowed_tracks_in_playlists", "android-libs-playlist-endpoints", m69541a()), new k8a("use_traits_mapping", "android-libs-playlist-endpoints", m69542b()));
    }
}
