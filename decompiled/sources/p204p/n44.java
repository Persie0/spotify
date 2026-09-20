package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class n44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f150190a;

    /* JADX INFO: renamed from: b */
    public final bji f150191b;

    /* JADX INFO: renamed from: c */
    public final wg61 f150192c = new wg61(new y34(this, 12));

    public n44(boolean z, bji bjiVar) {
        this.f150190a = z;
        this.f150191b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63652a() {
        n44 n44Var = (n44) this.f150192c.getValue();
        return n44Var != null ? n44Var.m63652a() : this.f150190a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_work_page", "android-feature-container-root-page", m63652a()));
    }
}
