package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class uc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f228935a;

    /* JADX INFO: renamed from: b */
    public final boolean f228936b;

    /* JADX INFO: renamed from: c */
    public final bji f228937c;

    /* JADX INFO: renamed from: d */
    public final wg61 f228938d = new wg61(new sb4(this, 24));

    public uc4(boolean z, boolean z2, bji bjiVar) {
        this.f228935a = z;
        this.f228936b = z2;
        this.f228937c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82731a() {
        uc4 uc4Var = (uc4) this.f228938d.getValue();
        return uc4Var != null ? uc4Var.m82731a() : this.f228935a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m82732b() {
        uc4 uc4Var = (uc4) this.f228938d.getValue();
        return uc4Var != null ? uc4Var.m82732b() : this.f228936b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("use_queue_on_free", "android-libs-podcast-episode-row", m82731a()), new k8a("vodcast_auto_opens_npv", "android-libs-podcast-episode-row", m82732b()));
    }
}
