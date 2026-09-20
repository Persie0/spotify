package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f50112a;

    /* JADX INFO: renamed from: b */
    public final bji f50113b;

    /* JADX INFO: renamed from: c */
    public final wg61 f50114c;

    public dl4(boolean z, bji bjiVar) {
        this.f50112a = z;
        this.f50113b = bjiVar;
        this.f50114c = new wg61(new jk4(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36343a() {
        dl4 dl4Var = (dl4) this.f50114c.getValue();
        return dl4Var != null ? dl4Var.m36343a() : this.f50112a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("show_permissions_enabled", "android-permissions-permissionsesperanto", m36343a()));
    }

    public dl4(bji bjiVar) {
        this(false, bjiVar);
    }
}
