package p204p;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class zsc {

    /* JADX INFO: renamed from: a */
    public static final tjo f285916a = pag1.m69487w(new rko(xzk.f267695Z0, 1, rsc.f202265X, new pko(rsc.f202281i), rsc.f202267Y), rsc.f202282t);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m96828a(ago agoVar, String str, ibk ibkVar) {
        ysc yscVar;
        if (ibkVar instanceof ysc) {
            yscVar = (ysc) ibkVar;
            int i = yscVar.f275742d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yscVar.f275742d = i - Integer.MIN_VALUE;
            } else {
                yscVar = new ysc(this, ibkVar);
            }
        } else {
            yscVar = new ysc(this, ibkVar);
        }
        Object objM86756u = yscVar.f275740b;
        int i2 = yscVar.f275742d;
        Object obj = null;
        boolean z = false;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            ay7 ay7VarM41173v = fag1.m41173v(agoVar, f285916a, str);
            C2559x4 c2559x4 = new C2559x4(2, 16, z ? 1 : 0);
            yscVar.f275739a = str;
            yscVar.f275742d = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, c2559x4, yscVar);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = yscVar.f275739a;
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        if (!(qhoVar instanceof oho)) {
            if (qhoVar instanceof nho) {
                throw p271.m68891A(((nho) qhoVar).f154041a);
            }
            if (wj50.m88271j(qhoVar, pho.f177693a)) {
                throw new IllegalStateException("filtered above");
            }
            throw new NoWhenBranchMatchedException();
        }
        List<dx80> list = (List) ((oho) qhoVar).f165512a;
        ro80 ro80VarM44508o = geg1.m44508o();
        for (dx80 dx80Var : list) {
            Map map = dx80Var.f53902f;
            String str2 = dx80Var.f53899c;
            String str3 = (String) map.get("list_item_heading");
            if (str3 != null && !str3.equals(obj)) {
                obj = obj;
                obj = obj;
                ro80VarM44508o.add(new ctc(str3));
                obj = str3;
            }
            obj = obj;
            obj = obj;
            obj = obj;
            Set set = dd41.f47702f;
            if (r46.m74708A(str2, gn80.SHOW_EPISODE)) {
                ro80VarM44508o.add(new atc(str2, dx80Var.f53897a));
            }
        }
        return new dtc(str, opo.m67574x(geg1.m44506m(ro80VarM44508o)));
    }
}
