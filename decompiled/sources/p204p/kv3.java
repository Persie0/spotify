package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kv3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f126767a;

    /* JADX INFO: renamed from: b */
    public final bji f126768b;

    /* JADX INFO: renamed from: c */
    public final wg61 f126769c = new wg61(new ju3(this, 18));

    public kv3(boolean z, bji bjiVar) {
        this.f126767a = z;
        this.f126768b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57435a() {
        kv3 kv3Var = (kv3) this.f126769c.getValue();
        return kv3Var != null ? kv3Var.m57435a() : this.f126767a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("feature_enabled", "android-audiobookpremium-listening-hours-request", m57435a()));
    }
}
