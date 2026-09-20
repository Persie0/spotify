package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f162460a;

    /* JADX INFO: renamed from: b */
    public final bji f162461b;

    /* JADX INFO: renamed from: c */
    public final wg61 f162462c = new wg61(new f74(this, 8));

    public o74(boolean z, bji bjiVar) {
        this.f162460a = z;
        this.f162461b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66374a() {
        o74 o74Var = (o74) this.f162462c.getValue();
        return o74Var != null ? o74Var.m66374a() : this.f162460a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_multi_pane", "android-feature-unboxing-hub-impl", m66374a()));
    }
}
