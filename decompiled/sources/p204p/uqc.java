package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class uqc {

    /* JADX INFO: renamed from: a */
    public static final tjo f232975a = pag1.m69486v(new rko(qyq0.f194012h, 1, tec.f219655Y0, new pko(tec.f219651W0), tec.f219657Z0), new rko(xzk.f267695Z0, 1, tec.f219658a1, new pko(tec.f219653X0), tec.f219660b1), f4c.f65740Z);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83761a(ago agoVar, String str, String str2, ibk ibkVar) {
        tqc tqcVar;
        int i;
        if (ibkVar instanceof tqc) {
            tqcVar = (tqc) ibkVar;
            int i2 = tqcVar.f222789e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqcVar.f222789e = i2 - Integer.MIN_VALUE;
            } else {
                tqcVar = new tqc(this, ibkVar);
            }
        } else {
            tqcVar = new tqc(this, ibkVar);
        }
        Object objM86756u = tqcVar.f222787c;
        int i3 = tqcVar.f222789e;
        if (i3 == 0) {
            bga.m29073P(objM86756u);
            ay7 ay7VarM41173v = fag1.m41173v(agoVar, f232975a, str);
            C2559x4 c2559x4 = new C2559x4(2, 15, null);
            tqcVar.f222785a = str;
            tqcVar.f222786b = str2;
            tqcVar.f222789e = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, c2559x4, tqcVar);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = tqcVar.f222786b;
            str = tqcVar.f222785a;
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        if (!(qhoVar instanceof oho)) {
            if (qhoVar instanceof nho) {
                throw nhz0.m64542t(((nho) qhoVar).f154041a);
            }
            if (wj50.m88271j(qhoVar, pho.f177693a)) {
                throw new IllegalStateException("filtered above");
            }
            throw new NoWhenBranchMatchedException();
        }
        pqm0 pqm0Var = (pqm0) ((oho) qhoVar).f165512a;
        r8x0 r8x0Var = (r8x0) pqm0Var.f180350a;
        List list = (List) pqm0Var.f180351b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dx80) it.next()).f53899c);
        }
        int iIndexOf = arrayList.indexOf(str2);
        int iIndexOf2 = arrayList.indexOf(r8x0Var.f196848a);
        List listSubList = lau.f131415a;
        if (iIndexOf > iIndexOf2) {
            if (iIndexOf > 0) {
                listSubList = arrayList.subList(0, iIndexOf);
            }
            return new wqc(str, listSubList, str2);
        }
        if (iIndexOf >= 0 && (i = iIndexOf + 1) < arrayList.size()) {
            listSubList = arrayList.subList(i, arrayList.size());
        }
        return new vqc(str, listSubList, str2);
    }
}
