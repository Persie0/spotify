package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class n920 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o920 f151685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n920(o920 o920Var, int i) {
        super(4);
        this.f151684a = i;
        this.f151685b = o920Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        switch (this.f151684a) {
            case 0:
                l920 l920Var = (l920) obj;
                ((Number) obj3).intValue();
                return ((ucp) this.f151685b.f162914b.get()).m82790b(l920Var.f130987b, ((g920) l920Var.f130986a.f275324j).f77644a);
            default:
                l920 l920Var2 = (l920) obj2;
                k920 k920Var = (k920) obj4;
                er70 er70Var = this.f151685b.f162914b;
                Object obj5 = l920Var2.f130986a.f275324j;
                int i = l920Var2.f130987b;
                boolean zEquals = k920Var.equals(j920.f110079a);
                nau nauVar = nau.f152117a;
                if (zEquals) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_deselect", 1, nauVar), ((ucp) er70Var.get()).m82790b(i, ((g920) obj5).f77644a).f177330b, st91.f213865b, System.currentTimeMillis());
                }
                if (k920Var.equals(h920.f88861a)) {
                    yt91 yt91VarM96903c = ((ucp) er70Var.get()).m82790b(i, ((g920) obj5).f77644a).f177330b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("end_group_dialog", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("no_action", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis());
                } else {
                    if (!k920Var.equals(i920.f99890a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c2 = ((ucp) er70Var.get()).m82790b(i, ((g920) obj5).f77644a).f177330b.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("end_group_dialog", null, null, null, null));
                    yt91VarM96903c2.f276056j = true;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
        }
    }
}
