package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class tn31 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pk0 f221877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn31(pk0 pk0Var, int i) {
        super(4);
        this.f221876a = i;
        this.f221877b = pk0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f221876a) {
            case 0:
                ((Number) obj3).intValue();
                st91 st91Var = (st91) obj4;
                this.f221877b.f178342t = st91Var;
                return new nrg0(5, null, st91Var);
            default:
                nrg0 nrg0Var = (nrg0) obj;
                rn31 rn31Var = (rn31) obj2;
                qn31 qn31Var = (qn31) obj4;
                if (!qn31Var.equals(pn31.f179300b)) {
                    if (qn31Var.equals(pn31.f179299a)) {
                        return nrg0Var.m65479a("spotify:internal:songdna:about");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (pk0.m70170q(this.f221877b, rn31Var) == null) {
                    return nrg0Var.m65480h();
                }
                String str = rn31Var.f200719e;
                if (str != null) {
                    return nrg0Var.m65479a(str);
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
