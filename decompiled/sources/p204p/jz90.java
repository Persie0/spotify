package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class jz90 {

    /* JADX INFO: renamed from: a */
    public final pgo f117634a;

    /* JADX INFO: renamed from: b */
    public final tjo f117635b;

    public jz90(pgo pgoVar, int i) {
        switch (i) {
            case 1:
                this.f117634a = pgoVar;
                this.f117635b = pag1.m69487w(new rko(xzk.f267695Z0, 1, avz0.f20313Z, new pko(avz0.f20309X), avz0.f20297L0), avz0.f20311Y);
                break;
            default:
                this.f117634a = pgoVar;
                jqv0 jqv0Var = qpv0.f191387a;
                this.f117635b = pag1.m69482r(new rko(new jqx(jqv0Var.mo54112b(k69.class)), 2, rt90.f202530X, new pko(rt90.f202542e), rt90.f202532Y), new rko(new jqx(jqv0Var.mo54112b(k69.class)), 2, rt90.f202534Z, new pko(rt90.f202543f), rt90.f202518L0), new rko(new jqx(jqv0Var.mo54112b(daj.class)), 1, rt90.f202523Q0, new pko(rt90.f202544g), rt90.f202524R0), new rko(new jqx(jqv0Var.mo54112b(daj.class)), 1, rt90.f202525S0, new pko(rt90.f202545h), rt90.f202526T0), new rko(new jqx(jqv0Var.mo54112b(zs6.class)), 2, rt90.f202519M0, new pko(rt90.f202546i), rt90.f202520N0), new rko(new jqx(jqv0Var.mo54112b(zs6.class)), 2, rt90.f202521O0, new pko(rt90.f202547t), rt90.f202522P0), axg.f20862g);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public void m54853a(niz nizVar, ulf0 ulf0Var, ibk ibkVar) {
        iz90 iz90Var;
        if (ibkVar instanceof iz90) {
            iz90Var = (iz90) ibkVar;
            int i = iz90Var.f107176c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz90Var.f107176c = i - Integer.MIN_VALUE;
            } else {
                iz90Var = new iz90(this, ibkVar);
            }
        } else {
            iz90Var = new iz90(this, ibkVar);
        }
        Object obj = iz90Var.f107174a;
        int i2 = iz90Var.f107176c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        ay7 ay7VarM41173v = fag1.m41173v(this.f117634a, this.f117635b, new pqm0(ulf0Var.f231553a, ulf0Var.f231554b));
        qb90 qb90Var = new qb90(nizVar, 17);
        iz90Var.f107176c = 1;
        ay7VarM41173v.collect(qb90Var, iz90Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m54854b(String str, ibk ibkVar) {
        fvz0 fvz0Var;
        if (ibkVar instanceof fvz0) {
            fvz0Var = (fvz0) ibkVar;
            int i = fvz0Var.f73909d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvz0Var.f73909d = i - Integer.MIN_VALUE;
            } else {
                fvz0Var = new fvz0(this, ibkVar);
            }
        } else {
            fvz0Var = new fvz0(this, ibkVar);
        }
        Object objM86756u = fvz0Var.f73907b;
        int i2 = fvz0Var.f73909d;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            ay7 ay7VarM41173v = fag1.m41173v(this.f117634a, this.f117635b, str);
            f6n0 f6n0Var = new f6n0(2, 29, null);
            fvz0Var.f73906a = str;
            fvz0Var.f73909d = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, f6n0Var, fvz0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = fvz0Var.f73906a;
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        if (!(qhoVar instanceof oho)) {
            if (qhoVar instanceof nho) {
                throw new IOException(((nho) qhoVar).f154041a.getMessage());
            }
            if (wj50.m88271j(qhoVar, pho.f177693a)) {
                throw new IllegalStateException("filtered above");
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = (List) ((oho) qhoVar).f165512a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new suz0(((dx80) it.next()).f53899c));
        }
        return new gvz0(str, arrayList);
    }
}
