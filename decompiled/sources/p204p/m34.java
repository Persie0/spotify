package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f139521a;

    /* JADX INFO: renamed from: b */
    public final bji f139522b;

    /* JADX INFO: renamed from: c */
    public final wg61 f139523c;

    public m34(boolean z, bji bjiVar) {
        this.f139521a = z;
        this.f139522b = bjiVar;
        this.f139523c = new wg61(new f30(this, 10));
    }

    /* JADX INFO: renamed from: c */
    public static m34 m60638c(uys0 uys0Var) {
        return new m34(uys0Var.mo47707c("android-ereader:enable_audiobook_hyde", false), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60639b() {
        m34 m34Var = (m34) this.f139523c.getValue();
        return m34Var != null ? m34Var.m60639b() : this.f139521a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_audiobook_hyde", "android-ereader", m60639b()));
    }

    public m34(bji bjiVar) {
        this(false, bjiVar);
    }
}
