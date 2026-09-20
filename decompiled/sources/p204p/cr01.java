package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cr01 {

    /* JADX INFO: renamed from: a */
    public final ae41 f41138a;

    /* JADX INFO: renamed from: b */
    public final opx f41139b;

    /* JADX INFO: renamed from: c */
    public final tjo f41140c = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(y511.class)), 1, mo01.f145539t, new pko(i401.f98387e), mo01.f145522X), mo01.f145538i);

    public cr01(ae41 ae41Var, opx opxVar) {
        this.f41138a = ae41Var;
        this.f41139b = opxVar;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m33699b(ifo ifoVar) {
        if (ifoVar instanceof gfo) {
            return ((gfo) ifoVar).f79415b instanceof ijo;
        }
        if (!(ifoVar instanceof efo)) {
            return false;
        }
        List list = ((efo) ifoVar).f59082a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m33699b((ifo) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m33700a(String str, ibk ibkVar) {
        br01 br01Var;
        if (ibkVar instanceof br01) {
            br01Var = (br01) ibkVar;
            int i = br01Var.f29929c;
            if ((i & Integer.MIN_VALUE) != 0) {
                br01Var.f29929c = i - Integer.MIN_VALUE;
            } else {
                br01Var = new br01(this, ibkVar);
            }
        } else {
            br01Var = new br01(this, ibkVar);
        }
        Object objM86756u = br01Var.f29927a;
        int i2 = br01Var.f29929c;
        boolean z = true;
        z = true;
        z = true;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            Set set = dd41.f47702f;
            int iOrdinal = r46.m74726U(str).f47709c.ordinal();
            if (iOrdinal != 845 && iOrdinal != 861) {
                return qyg1.m74178H(true);
            }
            ojo ojoVar = ago.f15436t;
            ay7 ay7VarM41173v = fag1.m41173v(g9g1.m44033i(this.f41139b), this.f41140c, str);
            ro01 ro01Var = new ro01(z ? 1 : 0);
            br01Var.f29929c = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, ro01Var, br01Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        if (!(qhoVar instanceof oho) && (qhoVar instanceof nho) && m33699b(((nho) qhoVar).f154041a)) {
            z = false;
        }
        return qyg1.m74178H(z);
    }
}
