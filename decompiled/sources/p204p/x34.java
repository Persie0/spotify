package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class x34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f257668a;

    /* JADX INFO: renamed from: b */
    public final bji f257669b;

    /* JADX INFO: renamed from: c */
    public final wg61 f257670c;

    public x34(boolean z, bji bjiVar) {
        this.f257668a = z;
        this.f257669b = bjiVar;
        this.f257670c = new wg61(new u14(this, 29));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89773a() {
        x34 x34Var = (x34) this.f257670c.getValue();
        return x34Var != null ? x34Var.m89773a() : this.f257668a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_visual_identity_trait", "android-feature-album-context-menu", m89773a()));
    }

    public x34(bji bjiVar) {
        this(false, bjiVar);
    }
}
