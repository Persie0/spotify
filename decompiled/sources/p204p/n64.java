package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class n64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f150677a;

    /* JADX INFO: renamed from: b */
    public final boolean f150678b;

    /* JADX INFO: renamed from: c */
    public final bji f150679c;

    /* JADX INFO: renamed from: d */
    public final wg61 f150680d;

    public n64(boolean z, boolean z2, bji bjiVar) {
        this.f150677a = z;
        this.f150678b = z2;
        this.f150679c = bjiVar;
        this.f150680d = new wg61(new o54(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63755a() {
        n64 n64Var = (n64) this.f150680d.getValue();
        return n64Var != null ? n64Var.m63755a() : this.f150677a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63756b() {
        n64 n64Var = (n64) this.f150680d.getValue();
        return n64Var != null ? n64Var.m63756b() : this.f150678b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_play_next", "android-feature-queue-contextmenuitems", m63755a()), new k8a("enable_play_next_album_or_playlist", "android-feature-queue-contextmenuitems", m63756b()));
    }

    public n64(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
