package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f223491a;

    /* JADX INFO: renamed from: b */
    public final bji f223492b;

    /* JADX INFO: renamed from: c */
    public final wg61 f223493c = new wg61(new w62(this, 20));

    public tt3(boolean z, bji bjiVar) {
        this.f223491a = z;
        this.f223492b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81492a() {
        tt3 tt3Var = (tt3) this.f223493c.getValue();
        return tt3Var != null ? tt3Var.m81492a() : this.f223491a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("prototype_entrypoint_enabled", "android-account-management-platform", m81492a()));
    }
}
