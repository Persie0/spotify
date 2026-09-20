package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f276268a;

    /* JADX INFO: renamed from: b */
    public final boolean f276269b;

    /* JADX INFO: renamed from: c */
    public final bji f276270c;

    /* JADX INFO: renamed from: d */
    public final wg61 f276271d = new wg61(new ju3(this, 11));

    public yu3(boolean z, boolean z2, bji bjiVar) {
        this.f276268a = z;
        this.f276269b = z2;
        this.f276270c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94647a() {
        yu3 yu3Var = (yu3) this.f276271d.getValue();
        return yu3Var != null ? yu3Var.m94647a() : this.f276268a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94648b() {
        yu3 yu3Var = (yu3) this.f276271d.getValue();
        return yu3Var != null ? yu3Var.m94648b() : this.f276269b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("show_locked_album_ui", "android-artist-releases", m94647a()), new k8a("use_platform_release_row", "android-artist-releases", m94648b()));
    }
}
