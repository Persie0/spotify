package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f66253a;

    /* JADX INFO: renamed from: b */
    public final bji f66254b;

    /* JADX INFO: renamed from: c */
    public final wg61 f66255c = new wg61(new o54(this, 14));

    public f64(boolean z, bji bjiVar) {
        this.f66253a = z;
        this.f66254b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40819a() {
        f64 f64Var = (f64) this.f66255c.getValue();
        return f64Var != null ? f64Var.m40819a() : this.f66253a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("esperanto_enabled", "android-feature-podcast-show-cosmos", m40819a()));
    }
}
