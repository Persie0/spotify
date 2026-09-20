package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ci4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f38202a;

    /* JADX INFO: renamed from: b */
    public final int f38203b;

    /* JADX INFO: renamed from: c */
    public final bji f38204c;

    /* JADX INFO: renamed from: d */
    public final wg61 f38205d = new wg61(new bh4(this, 17));

    public ci4(int i, bji bjiVar, boolean z) {
        this.f38202a = z;
        this.f38203b = i;
        this.f38204c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32866a() {
        ci4 ci4Var = (ci4) this.f38205d.getValue();
        return ci4Var != null ? ci4Var.m32866a() : this.f38202a;
    }

    /* JADX INFO: renamed from: b */
    public final int m32867b() {
        ci4 ci4Var = (ci4) this.f38205d.getValue();
        return ci4Var != null ? ci4Var.m32867b() : this.f38203b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("po_banner_enabled", "android-music-libs-po-session-counter", m32866a()), new k8a("po_max_sessions", "android-music-libs-po-session-counter", m32867b(), 0, 100));
    }
}
