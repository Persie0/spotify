package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f64534a;

    /* JADX INFO: renamed from: b */
    public final bji f64535b;

    /* JADX INFO: renamed from: c */
    public final wg61 f64536c;

    public f04(boolean z, bji bjiVar) {
        this.f64534a = z;
        this.f64535b = bjiVar;
        this.f64536c = new wg61(new ey3(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40437a() {
        f04 f04Var = (f04) this.f64536c.getValue();
        return f04Var != null ? f04Var.m40437a() : this.f64534a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("observe_on_computation_scheduler", "android-connectivity-productstateesperanto", m40437a()));
    }

    public f04(bji bjiVar) {
        this(false, bjiVar);
    }
}
