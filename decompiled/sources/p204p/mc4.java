package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f142028a;

    /* JADX INFO: renamed from: b */
    public final bji f142029b;

    /* JADX INFO: renamed from: c */
    public final wg61 f142030c = new wg61(new sb4(this, 16));

    public mc4(boolean z, bji bjiVar) {
        this.f142028a = z;
        this.f142029b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61440a() {
        mc4 mc4Var = (mc4) this.f142030c.getValue();
        return mc4Var != null ? mc4Var.m61440a() : this.f142028a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_on_demand_sharing", "android-libs-on-demand-sharing", m61440a()));
    }
}
