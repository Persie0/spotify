package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class nxn0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oxn0 f159523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxn0(oxn0 oxn0Var, int i) {
        super(3);
        this.f159522a = i;
        this.f159523b = oxn0Var;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r2v6, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v7, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, p.gh00] */
    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f159522a) {
            case 0:
                lxn0 lxn0Var = (lxn0) obj2;
                boolean z = lxn0Var instanceof hxn0;
                oxn0 oxn0Var = this.f159523b;
                if (z) {
                    oxn0Var.f171468c.invoke(((hxn0) lxn0Var).f96249a);
                } else if (lxn0Var instanceof ixn0) {
                    ixn0 ixn0Var = (ixn0) lxn0Var;
                    oxn0Var.f171471f.invoke(ixn0Var.f106722a, Integer.valueOf(ixn0Var.f106723b));
                } else if (lxn0Var instanceof kxn0) {
                    oxn0Var.f171469d.invoke(Integer.valueOf(((kxn0) lxn0Var).f127526a));
                } else {
                    if (!lxn0Var.equals(jxn0.f117160a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oxn0Var.f171470e.invoke();
                }
                return w2a1.f247311a;
            default:
                mxn0 mxn0Var = (mxn0) obj2;
                lxn0 lxn0Var2 = (lxn0) obj3;
                if (lxn0Var2 instanceof hxn0) {
                    qag0 qag0Var = (qag0) this.f159523b.f171467b.invoke();
                    jyn0 jyn0Var = ((hxn0) lxn0Var2).f96249a;
                    int iIndexOf = mxn0Var.f148109a.indexOf(jyn0Var);
                    b221 b221Var = jyn0Var.f117441c;
                    boolean z2 = jyn0Var.f117442d;
                    int i = jyn0Var.f117440b;
                    boolean z3 = b221Var instanceof it8;
                    nau nauVar = nau.f152117a;
                    if (z3) {
                        Integer numValueOf = Integer.valueOf(i);
                        qag0Var.getClass();
                        yt91 yt91VarM96903c = qag0Var.f186874a.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("banner_section", null, numValueOf, null, null));
                        yt91VarM96903c.f276056j = true;
                        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                        Integer numValueOf2 = Integer.valueOf(iIndexOf);
                        String str = ((it8) b221Var).f105460a;
                        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("banner_button", null, numValueOf2, str, null));
                        yt91VarM96903c2.f276056j = true;
                        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                        return z2 ? new av91("", "", new dv91("hit", 1), new bv91("remove_interest", 1, nauVar), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("add_interest", 1, nauVar), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                    }
                    if (b221Var instanceof bej) {
                        Integer numValueOf3 = Integer.valueOf(i);
                        qag0Var.getClass();
                        yt91 yt91VarM96903c3 = qag0Var.f186874a.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("squircle_section", null, numValueOf3, null, null));
                        yt91VarM96903c3.f276056j = true;
                        zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                        Integer numValueOf4 = Integer.valueOf(iIndexOf);
                        String str2 = ((bej) b221Var).f26366a;
                        yt91 yt91VarM96903c4 = zt91VarM94607a3.m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("squircle_button", null, numValueOf4, str2, null));
                        yt91VarM96903c4.f276056j = true;
                        zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
                        return z2 ? new av91("", "", new dv91("hit", 1), new bv91("remove_interest", 1, nauVar), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("add_interest", 1, nauVar), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                    }
                    if (b221Var instanceof oyh0) {
                        Integer numValueOf5 = Integer.valueOf(i);
                        qag0Var.getClass();
                        yt91 yt91VarM96903c5 = qag0Var.f186874a.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("squircle_section", null, numValueOf5, null, null));
                        yt91VarM96903c5.f276056j = true;
                        zt91 zt91VarM94607a5 = yt91VarM96903c5.m94607a();
                        Integer numValueOf6 = Integer.valueOf(iIndexOf);
                        String str3 = ((oyh0) b221Var).f171767a;
                        yt91 yt91VarM96903c6 = zt91VarM94607a5.m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("squircle_button", null, numValueOf6, str3, null));
                        yt91VarM96903c6.f276056j = true;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                } else if (!(lxn0Var2 instanceof ixn0) && !(lxn0Var2 instanceof kxn0) && !lxn0Var2.equals(jxn0.f117160a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
        }
    }
}
