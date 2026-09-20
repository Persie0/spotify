package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class z44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f279115a;

    /* JADX INFO: renamed from: b */
    public final bji f279116b;

    /* JADX INFO: renamed from: c */
    public final wg61 f279117c;

    public z44(boolean z, bji bjiVar) {
        this.f279115a = z;
        this.f279116b = bjiVar;
        this.f279117c = new wg61(new y34(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95313a() {
        z44 z44Var = (z44) this.f279117c.getValue();
        return z44Var != null ? z44Var.m95313a() : this.f279115a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_free_on_demand_experiment", "android-feature-freeondemand", m95313a()));
    }

    public z44(bji bjiVar) {
        this(false, bjiVar);
    }
}
