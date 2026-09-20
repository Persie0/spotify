package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cdm0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f36910a;

    /* JADX INFO: renamed from: b */
    public final int f36911b;

    /* JADX INFO: renamed from: c */
    public final bji f36912c;

    /* JADX INFO: renamed from: d */
    public final wg61 f36913d;

    public cdm0(int i, bji bjiVar, boolean z) {
        this.f36910a = z;
        this.f36911b = i;
        this.f36912c = bjiVar;
        this.f36913d = new wg61(new vvk0(this, 26));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32437a() {
        cdm0 cdm0Var = (cdm0) this.f36913d.getValue();
        return cdm0Var != null ? cdm0Var.m32437a() : this.f36910a;
    }

    /* JADX INFO: renamed from: b */
    public final int m32438b() {
        cdm0 cdm0Var = (cdm0) this.f36913d.getValue();
        return cdm0Var != null ? cdm0Var.m32438b() : this.f36911b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("gradient_border_enabled", "page-match-entry-point", m32437a()), new k8a("gradient_border_max_event_count", "page-match-entry-point", m32438b(), 0, 1000));
    }

    public cdm0(bji bjiVar) {
        this(0, bjiVar, false);
    }
}
