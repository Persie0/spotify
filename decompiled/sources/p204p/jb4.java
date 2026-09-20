package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f110636a;

    /* JADX INFO: renamed from: b */
    public final boolean f110637b;

    /* JADX INFO: renamed from: c */
    public final boolean f110638c;

    /* JADX INFO: renamed from: d */
    public final bji f110639d;

    /* JADX INFO: renamed from: e */
    public final wg61 f110640e = new wg61(new ga4(this, 21));

    public jb4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f110636a = z;
        this.f110637b = z2;
        this.f110638c = z3;
        this.f110639d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52865a() {
        jb4 jb4Var = (jb4) this.f110640e.getValue();
        return jb4Var != null ? jb4Var.m52865a() : this.f110636a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m52866b() {
        jb4 jb4Var = (jb4) this.f110640e.getValue();
        return jb4Var != null ? jb4Var.m52866b() : this.f110637b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m52867c() {
        jb4 jb4Var = (jb4) this.f110640e.getValue();
        return jb4Var != null ? jb4Var.m52867c() : this.f110638c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_bcp47_client_language", "android-libs-lyrics", m52865a()), new k8a("enable_common_capping", "android-libs-lyrics", m52866b()), new k8a("enable_v3_lyrics_endpoint", "android-libs-lyrics", m52867c()));
    }
}
