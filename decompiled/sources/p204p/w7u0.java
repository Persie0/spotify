package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class w7u0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e8u0 f248787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7u0(e8u0 e8u0Var, int i) {
        super(1);
        this.f248786a = i;
        this.f248787b = e8u0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        hwf d7u0Var;
        switch (this.f248786a) {
            case 0:
                return this.f248787b.f57269a;
            case 1:
                ((icp) obj).f100858d = new me80(this.f248787b, null, 1);
                return w2a1.f247311a;
            default:
                e8u0 e8u0Var = this.f248787b;
                ziu ziuVar = e8u0Var.f57270b;
                int iM38547C = edb.m38547C(e8u0Var.f57272d);
                if (iM38547C == 0) {
                    d7u0Var = c7u0.f35025a;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d7u0Var = new d7u0(false);
                }
                return ziuVar.mo26174a(d7u0Var);
        }
    }
}
