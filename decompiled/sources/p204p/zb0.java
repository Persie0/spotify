package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class zb0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1790du f281196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb0(C1790du c1790du, int i) {
        super(4);
        this.f281195a = i;
        this.f281196b = c1790du;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f281195a) {
            case 0:
                vb0 vb0Var = (vb0) obj;
                ((Number) obj3).intValue();
                boolean z = vb0Var.f239350a.f265142g;
                C1790du c1790du = this.f281196b;
                return z ? C1790du.m36883x(c1790du, vb0Var) : C1790du.m36880u(c1790du, vb0Var);
            default:
                vb0 vb0Var2 = (vb0) obj2;
                if (!(((tb0) obj4) instanceof tb0)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z2 = vb0Var2.f239350a.f265142g;
                nau nauVar = nau.f152117a;
                C1790du c1790du2 = this.f281196b;
                if (z2) {
                    yt91 yt91VarM96903c = C1790du.m36883x(c1790du2, vb0Var2).f177330b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                yt91 yt91VarM96903c2 = C1790du.m36880u(c1790du2, vb0Var2).f177330b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
