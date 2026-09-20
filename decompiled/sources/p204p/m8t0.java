package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m8t0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f141124a;

    /* JADX INFO: renamed from: b */
    public final bji f141125b;

    /* JADX INFO: renamed from: c */
    public final wg61 f141126c;

    public m8t0(boolean z, bji bjiVar) {
        this.f141124a = z;
        this.f141125b = bjiVar;
        this.f141126c = new wg61(new nzk0(this, 21));
    }

    /* JADX INFO: renamed from: c */
    public static m8t0 m61136c(uys0 uys0Var) {
        return new m8t0(uys0Var.mo47707c("puffin-core:allow_externalization", false), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61137b() {
        m8t0 m8t0Var = (m8t0) this.f141126c.getValue();
        return m8t0Var != null ? m8t0Var.m61137b() : this.f141124a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("allow_externalization", "puffin-core", m61137b()));
    }

    public m8t0(bji bjiVar) {
        this(false, bjiVar);
    }
}
