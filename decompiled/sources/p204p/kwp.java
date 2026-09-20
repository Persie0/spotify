package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class kwp extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjb0 f127139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwp(hjb0 hjb0Var, int i) {
        super(4);
        this.f127138a = i;
        this.f127139b = hjb0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f127138a) {
            case 0:
                st91 st91Var = (st91) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                int i = ((oll0) obj).f166859a;
                int iM38547C = edb.m38547C(i);
                int i2 = 1;
                if (iM38547C != 0) {
                    if (iM38547C == 1) {
                        i2 = 2;
                    } else if (iM38547C == 2) {
                        i2 = 11;
                    } else {
                        if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 12;
                    }
                }
                return new ikh0(oq40.m67586e(i2), numValueOf, null, hjb0.m47677f(this.f127139b, i), st91Var);
            default:
                ikh0 ikh0Var = (ikh0) obj;
                oll0 oll0Var = (oll0) obj2;
                if (lwp.f137614a[((tll0) obj4).ordinal()] == 1) {
                    return ikh0Var.m50949a(hjb0.m47677f(this.f127139b, oll0Var.f166859a));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
