package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class w820 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li0 f248827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w820(li0 li0Var, int i) {
        super(4);
        this.f248826a = i;
        this.f248827b = li0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f248826a) {
            case 0:
                v820 v820Var = (v820) obj;
                ((Number) obj3).intValue();
                ucp ucpVar = (ucp) ((er70) this.f248827b.f133683e).get();
                int i = v820Var.f238357b;
                String str = ((t820) v820Var.f238356a.f275324j).f217947a;
                tgg0 tgg0Var = (tgg0) ucpVar.f229094a.get();
                tgg0Var.getClass();
                return new pgg0(2, Integer.valueOf(i), str, new s8g0(tgg0Var));
            default:
                v820 v820Var2 = (v820) obj2;
                if (!(((u820) obj4) instanceof u820)) {
                    throw new NoWhenBranchMatchedException();
                }
                ucp ucpVar2 = (ucp) ((er70) this.f248827b.f133683e).get();
                int i2 = v820Var2.f238357b;
                String str2 = ((t820) v820Var2.f238356a.f275324j).f217947a;
                tgg0 tgg0Var2 = (tgg0) ucpVar2.f229094a.get();
                tgg0Var2.getClass();
                yt91 yt91VarM96903c = tgg0Var2.f220188a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                Integer numValueOf = Integer.valueOf(i2);
                yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("groupable_device", null, numValueOf, str2, null));
                yt91VarM96903c2.f276056j = true;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
