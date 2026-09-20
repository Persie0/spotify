package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class rr9 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sr9 f201989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr9(sr9 sr9Var, int i) {
        super(4);
        this.f201988a = i;
        this.f201989b = sr9Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        av91 av91Var2;
        switch (this.f201988a) {
            case 0:
                ((Number) obj3).intValue();
                return this.f201989b.f213258a;
            case 1:
                pr9 pr9Var = (pr9) obj4;
                zt91 zt91Var = ((bqg0) obj).f29812a;
                boolean z = pr9Var instanceof nr9;
                sr9 sr9Var = this.f201989b;
                nau nauVar = nau.f152117a;
                if (z) {
                    int iM79103e = sr9.m79103e(sr9Var, ((nr9) pr9Var).f157477a);
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("filter_chip", spg0.m78889h(iM79103e), null, null, null));
                    yt91VarM96903c.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("filter", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (pr9Var instanceof mr9) {
                    int iM79103e2 = sr9.m79103e(sr9Var, ((mr9) pr9Var).f146452a);
                    yt91 yt91VarM96903c2 = zt91Var.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("filter_chip", spg0.m78889h(iM79103e2), null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("clear_filter", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                } else {
                    if (!pr9Var.equals(or9.f168512a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c3 = zt91Var.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("filter_chip", "none", null, null, null));
                    yt91VarM96903c3.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("clear_filter", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
            case 2:
                ((Number) obj3).intValue();
                return this.f201989b.f213259b;
            default:
                hqg0 hqg0Var = (hqg0) obj;
                pr9 pr9Var2 = (pr9) obj4;
                zt91 zt91Var2 = hqg0Var.f94179b;
                boolean z2 = pr9Var2 instanceof nr9;
                sr9 sr9Var2 = this.f201989b;
                nau nauVar2 = nau.f152117a;
                if (z2) {
                    int iM79104f = sr9.m79104f(sr9Var2, ((nr9) pr9Var2).f157477a);
                    yt91 yt91VarM96903c4 = zt91Var2.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("filter_chip", spg0.m78890i(iM79104f), null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("filter", 1, nauVar2), yt91VarM96903c4.m94607a(), hqg0Var.f94178a, System.currentTimeMillis());
                }
                if (pr9Var2 instanceof mr9) {
                    int iM79104f2 = sr9.m79104f(sr9Var2, ((mr9) pr9Var2).f146452a);
                    yt91 yt91VarM96903c5 = zt91Var2.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("filter_chip", spg0.m78890i(iM79104f2), null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("clear_filter", 1, nauVar2), yt91VarM96903c5.m94607a(), hqg0Var.f94178a, System.currentTimeMillis());
                } else {
                    if (!pr9Var2.equals(or9.f168512a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c6 = zt91Var2.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("filter_chip", "none", null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("clear_filter", 1, nauVar2), yt91VarM96903c6.m94607a(), hqg0Var.f94178a, System.currentTimeMillis());
                }
                return av91Var2;
        }
    }
}
