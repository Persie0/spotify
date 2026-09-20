package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class pck0 implements lbk0 {

    /* JADX INFO: renamed from: a */
    public final m500 f176157a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f176158b;

    /* JADX INFO: renamed from: c */
    public final pfm0 f176159c;

    public pck0(m500 m500Var, z9j0 z9j0Var, pfm0 pfm0Var) {
        this.f176157a = m500Var;
        this.f176158b = z9j0Var;
        this.f176159c = pfm0Var;
    }

    @Override // p204p.lbk0
    /* JADX INFO: renamed from: a */
    public final void mo58664a() {
        this.f176158b.mo47345e();
    }

    @Override // p204p.lbk0
    /* JADX INFO: renamed from: c */
    public final void mo58666c(bwl0 bwl0Var, boolean z) {
        int iOrdinal = bwl0Var.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 4;
            }
        }
        this.f176159c.m69810a(new i200(i));
    }

    @Override // p204p.lbk0
    public final void close() {
        this.f176158b.mo47345e();
    }

    @Override // p204p.lbk0
    /* JADX INFO: renamed from: d */
    public final void mo58667d(ugr ugrVar, String str) {
        c700 c700VarMo15683g0 = this.f176157a.mo15683g0();
        if (c700VarMo15683g0.m31611T()) {
            return;
        }
        ugrVar.mo63162p1(c700VarMo15683g0, str);
    }

    @Override // p204p.lbk0
    /* JADX INFO: renamed from: b */
    public final void mo58665b(z650 z650Var) {
    }
}
