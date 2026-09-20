package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lko {

    /* JADX INFO: renamed from: a */
    public static final tjo f134395a = pag1.m69486v(new rko(haz.f89316T0, 2, iko.f103152N0, new pko(iko.f103150L0), iko.f103153O0), new rko(new jqx(qpv0.f191387a.mo54112b(g0w.class)), 2, iko.f103154P0, new pko(iko.f103151M0), iko.f103155Q0), bxl.f31901X0);

    /* JADX INFO: renamed from: b */
    public static final qu60 f134396b;

    /* JADX INFO: renamed from: c */
    public static final qu60 f134397c;

    static {
        qu60 qu60Var = x140.f257061a;
        f134396b = qu60Var;
        List list = qu60Var.f192575a;
        f134397c = new qu60(g6f.m43700N0(list, list));
    }

    /* JADX INFO: renamed from: a */
    public static final glr m59284a(pob pobVar, boolean z, boolean z2) {
        int i = pobVar.f179665c;
        ArrayList arrayList = pobVar.f179667e;
        if (i == 3 || arrayList.contains(b5x0.f23780a) || arrayList.contains(b5x0.f23782c)) {
            return flr.f70857a;
        }
        return ((!z || z2) && (pobVar.f179664b || !(arrayList.contains(b5x0.f23781b) || arrayList.contains(b5x0.f23784e)))) ? clr.f39347a : elr.f60743a;
    }

    /* JADX INFO: renamed from: b */
    public static final tjo m59285b(String str, boolean z) {
        haz hazVar = haz.f89316T0;
        qu60 qu60Var = f134397c;
        qu60 qu60Var2 = f134396b;
        if (!z) {
            rko rkoVar = new rko(hazVar, 2, zjo.f283491X, new pko(eko.f60480L0), zjo.f283494Y0);
            jqv0 jqv0Var = qpv0.f191387a;
            return pag1.m69484t(rkoVar, new rko(new jqx(jqv0Var.mo54112b(g0w.class)), 2, zjo.f283499b1, new pko(eko.f60483O0), eko.f60501c), new rko(new jqx(jqv0Var.mo54112b(byv.class)), 2, eko.f60504e, new qko(eko.f60485Q0, qu60Var2), eko.f60505f), new rko(new jqx(jqv0Var.mo54112b(ok11.class)), 2, eko.f60506g, new qko(eko.f60486R0, qu60Var), eko.f60507h), kvl.f126881S0);
        }
        Set set = dd41.f47702f;
        boolean zM74709B = r46.m74709B(str, gn80.TRACK, gn80.TRACK_AUTOPLAY);
        rko rkoVar2 = new rko(hazVar, 2, eko.f60508i, new pko(eko.f60487S0), zjo.f283508t);
        jqv0 jqv0Var2 = qpv0.f191387a;
        rko rkoVar3 = new rko(new jqx(jqv0Var2.mo54112b(g0w.class)), 2, zjo.f283493Y, new pko(eko.f60488T0), zjo.f283479L0);
        a7j0 a7j0Var = a7j0.f13082i;
        rko rkoVar4 = new rko(a7j0Var, 2, zjo.f283480M0, new pko(eko.f60489U0), zjo.f283481N0);
        rko rkoVar5 = new rko(a7j0Var, 2, zjo.f283482O0, new pko(eko.f60490V0), zjo.f283483P0);
        rko rkoVar6 = new rko(a7j0Var, 2, zjo.f283484Q0, new pko(eko.f60509t), zjo.f283485R0);
        rko rkoVar7 = new rko(new jqx(jqv0Var2.mo54112b(byv.class)), 2, zjo.f283486S0, new qko(eko.f60492X, qu60Var2), zjo.f283488U0);
        rko rkoVar8 = new rko(new jqx(jqv0Var2.mo54112b(ok11.class)), 2, zjo.f283489V0, new qko(eko.f60496Z, qu60Var), zjo.f283492X0);
        return new tjo(h6f.m46715L(rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8), new rg1(new fko(zM74709B), rkoVar2, rkoVar3, rkoVar4, rkoVar5, rkoVar6, rkoVar7, rkoVar8));
    }
}
