package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f187248a;

    /* JADX INFO: renamed from: b */
    public final boolean f187249b;

    /* JADX INFO: renamed from: c */
    public final bji f187250c;

    /* JADX INFO: renamed from: d */
    public final wg61 f187251d = new wg61(new sb4(this, 20));

    public qc4(boolean z, boolean z2, bji bjiVar) {
        this.f187248a = z;
        this.f187249b = z2;
        this.f187250c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72513a() {
        qc4 qc4Var = (qc4) this.f187251d.getValue();
        return qc4Var != null ? qc4Var.m72513a() : this.f187248a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72514b() {
        qc4 qc4Var = (qc4) this.f187251d.getValue();
        return qc4Var != null ? qc4Var.m72514b() : this.f187249b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("do_not_exclude_banned_artists_for_managed_account", "android-libs-playlist-entity-configuration", m72513a()), new k8a("respect_shows_collection_flag_in_playlist_for_including_episodes", "android-libs-playlist-entity-configuration", m72514b()));
    }
}
