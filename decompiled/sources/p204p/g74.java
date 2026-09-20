package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77170a;

    /* JADX INFO: renamed from: b */
    public final bji f77171b;

    /* JADX INFO: renamed from: c */
    public final wg61 f77172c = new wg61(new f74(this, 0));

    public g74(boolean z, bji bjiVar) {
        this.f77170a = z;
        this.f77171b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43793a() {
        g74 g74Var = (g74) this.f77172c.getValue();
        return g74Var != null ? g74Var.m43793a() : this.f77170a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("spoton_feature_enabled", "android-feature-spoton", m43793a()));
    }
}
