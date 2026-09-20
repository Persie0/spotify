package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f80696a;

    /* JADX INFO: renamed from: b */
    public final bji f80697b;

    /* JADX INFO: renamed from: c */
    public final wg61 f80698c;

    public gk4(boolean z, bji bjiVar) {
        this.f80696a = z;
        this.f80697b = bjiVar;
        this.f80698c = new wg61(new si4(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45026a() {
        gk4 gk4Var = (gk4) this.f80698c.getValue();
        return gk4Var != null ? gk4Var.m45026a() : this.f80696a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("edge_to_edge_enabled_by_default_in_page_activity", "android-page-activity", m45026a()));
    }

    public gk4(bji bjiVar) {
        this(false, bjiVar);
    }
}
