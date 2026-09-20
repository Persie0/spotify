package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class b920 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ba0 f24748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b920(ba0 ba0Var, int i) {
        super(4);
        this.f24747a = i;
        this.f24748b = ba0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f24747a) {
            case 0:
                ((Number) obj3).intValue();
                tgg0 tgg0Var = (tgg0) ((ucp) this.f24748b.f25056b.get()).f229094a.get();
                tgg0Var.getClass();
                return new pgg0(new s8g0(tgg0Var));
            default:
                a920 a920Var = (a920) obj2;
                if (!(((z820) obj4) instanceof z820)) {
                    throw new NoWhenBranchMatchedException();
                }
                ucp ucpVar = (ucp) this.f24748b.f25056b.get();
                boolean z = a920Var.f13456a;
                tgg0 tgg0Var2 = (tgg0) ucpVar.f229094a.get();
                tgg0Var2.getClass();
                yt91 yt91VarM96903c = tgg0Var2.f220188a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("groupable_devices_toggle", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                nau nauVar = nau.f152117a;
                return z ? new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
    }
}
