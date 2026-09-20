package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class zvp extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hfp f286751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvp(hfp hfpVar, int i) {
        super(4);
        this.f286750a = i;
        this.f286751b = hfpVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f286750a) {
            case 0:
                st91 st91Var = (st91) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                int i = ((kgl0) obj).f122418a;
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
                return new ikh0(oq40.m67586e(i2), numValueOf, null, hfp.m47355e(this.f286751b, i), st91Var);
            default:
                ikh0 ikh0Var = (ikh0) obj;
                kgl0 kgl0Var = (kgl0) obj2;
                if (awp.f20574a[((ngl0) obj4).ordinal()] == 1) {
                    return ikh0Var.m50949a(hfp.m47355e(this.f286751b, kgl0Var.f122418a));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
