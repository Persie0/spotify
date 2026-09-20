package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f24476a;

    /* JADX INFO: renamed from: b */
    public final boolean f24477b;

    /* JADX INFO: renamed from: c */
    public final bji f24478c;

    /* JADX INFO: renamed from: d */
    public final wg61 f24479d;

    public b84(boolean z, boolean z2, bji bjiVar) {
        this.f24476a = z;
        this.f24477b = z2;
        this.f24478c = bjiVar;
        this.f24479d = new wg61(new f74(this, 14));
    }

    /* JADX INFO: renamed from: c */
    public static b84 m28409c(uys0 uys0Var) {
        return new b84(uys0Var.mo47707c("android-fitness:capping_enabled", true), uys0Var.mo47707c("android-fitness:feature_enabled", false), null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28410a() {
        b84 b84Var = (b84) this.f24479d.getValue();
        return b84Var != null ? b84Var.m28410a() : this.f24476a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28411b() {
        b84 b84Var = (b84) this.f24479d.getValue();
        return b84Var != null ? b84Var.m28411b() : this.f24477b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("capping_enabled", "android-fitness", m28410a()), new k8a("feature_enabled", "android-fitness", m28411b()));
    }

    public b84(bji bjiVar) {
        this(true, false, bjiVar);
    }

    public b84() {
        this(true, false, null);
    }
}
