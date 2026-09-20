package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f226266a;

    /* JADX INFO: renamed from: b */
    public final bji f226267b;

    /* JADX INFO: renamed from: c */
    public final wg61 f226268c = new wg61(new u14(this, 26));

    public u34(boolean z, bji bjiVar) {
        this.f226266a = z;
        this.f226267b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82266a() {
        u34 u34Var = (u34) this.f226268c.getValue();
        return u34Var != null ? u34Var.m82266a() : this.f226266a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_ai_attribution", "android-feature-agent-row", m82266a()));
    }
}
