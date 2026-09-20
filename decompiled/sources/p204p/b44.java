package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class b44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f23215a;

    /* JADX INFO: renamed from: b */
    public final bji f23216b;

    /* JADX INFO: renamed from: c */
    public final wg61 f23217c = new wg61(new y34(this, 2));

    public b44(boolean z, bji bjiVar) {
        this.f23215a = z;
        this.f23216b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28069a() {
        b44 b44Var = (b44) this.f23217c.getValue();
        return b44Var != null ? b44Var.m28069a() : this.f23215a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("group_blends_enabled", "android-feature-blend-invitation", m28069a()));
    }
}
