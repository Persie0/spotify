package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class mw80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nw80 f147738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw80(int i, nw80 nw80Var) {
        super(0);
        this.f147737a = i;
        this.f147738b = nw80Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        boolean zM29803n0;
        boolean zM29803n1;
        switch (this.f147737a) {
            case 0:
                nw80 nw80Var = this.f147738b;
                j7f0 j7f0Var = nw80Var.f159061o;
                if (j7f0Var instanceof f7f0) {
                    zM29803n0 = bm51.m29803n0(nw80Var.f159049c, "spotify:kallax", false);
                } else if (j7f0Var instanceof ib81) {
                    zM29803n0 = ((ib81) j7f0Var).f100476f;
                } else {
                    if (!(j7f0Var instanceof f0w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zM29803n0 = ((f0w) j7f0Var).f64729g;
                }
                return Boolean.valueOf(zM29803n0);
            case 1:
                j7f0 j7f0Var2 = this.f147738b.f159061o;
                boolean z = false;
                if (!(j7f0Var2 instanceof f0w) && !(j7f0Var2 instanceof f7f0)) {
                    if (!(j7f0Var2 instanceof ib81)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((ib81) j7f0Var2).f100473c;
                }
                return Boolean.valueOf(z);
            case 2:
                nw80 nw80Var2 = this.f147738b;
                j7f0 j7f0Var3 = nw80Var2.f159061o;
                if (j7f0Var3 instanceof f7f0) {
                    zM29803n1 = bm51.m29803n0(nw80Var2.f159049c, "spotify:kallax", false);
                } else if (j7f0Var3 instanceof ib81) {
                    zM29803n1 = ((ib81) j7f0Var3).f100474d;
                } else {
                    if (!(j7f0Var3 instanceof f0w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zM29803n1 = ((f0w) j7f0Var3).f64727e;
                }
                return Boolean.valueOf(zM29803n1);
            case 3:
                j7f0 j7f0Var4 = this.f147738b.f159061o;
                if (j7f0Var4 instanceof f7f0) {
                    return hto0.f95099a;
                }
                if (j7f0Var4 instanceof ib81) {
                    return ((ib81) j7f0Var4).f100475e;
                }
                if (j7f0Var4 instanceof f0w) {
                    return ((f0w) j7f0Var4).f64728f;
                }
                throw new NoWhenBranchMatchedException();
            default:
                j7f0 j7f0Var5 = this.f147738b.f159061o;
                if (j7f0Var5 instanceof f7f0) {
                    return null;
                }
                if (j7f0Var5 instanceof ib81) {
                    return ((ib81) j7f0Var5).f100479i;
                }
                if (j7f0Var5 instanceof f0w) {
                    return ((f0w) j7f0Var5).f64725c;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
