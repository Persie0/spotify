package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class mqv implements bmo0 {

    /* JADX INFO: renamed from: a */
    public final uqv f146360a;

    public mqv(uqv uqvVar) {
        this.f146360a = uqvVar;
    }

    @Override // p204p.bmo0
    /* JADX INFO: renamed from: a */
    public final Object mo29884a(vlo0 vlo0Var, bso0 bso0Var, pv00 pv00Var, ctj ctjVar, d850 d850Var, r3g0 r3g0Var, boolean z, ibk ibkVar) {
        String str;
        if (vlo0Var instanceof tlo0) {
            str = ((tlo0) vlo0Var).f221497a;
        } else {
            if (!(vlo0Var instanceof ulo0)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((ulo0) vlo0Var).f231600b;
        }
        Object objM83816b = this.f146360a.m83816b(str, d850Var, bso0Var != bso0.f30364c, ibkVar);
        return objM83816b == yuk.f276404a ? objM83816b : w2a1.f247311a;
    }
}
