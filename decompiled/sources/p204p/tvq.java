package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tvq extends dpv0 {

    /* JADX INFO: renamed from: b */
    public final sp60 f224209b;

    /* JADX INFO: renamed from: c */
    public final lpv0 f224210c = kgg1.m56357t(null, new wul(this, 1));

    /* JADX INFO: renamed from: d */
    public final lpv0 f224211d = kgg1.m56357t(null, new rvq(this, 0));

    /* JADX INFO: renamed from: e */
    public final lpv0 f224212e = kgg1.m56357t(null, new rvq(this, 1));

    /* JADX INFO: renamed from: f */
    public final lpv0 f224213f = kgg1.m56357t(null, new rvq(this, 2));

    /* JADX INFO: renamed from: g */
    public final lpv0 f224214g = kgg1.m56357t(null, new rvq(this, 3));

    public tvq(sp60 sp60Var) {
        this.f224209b = sp60Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX INFO: renamed from: A */
    public final ArrayList m81614A(boolean z) {
        pqm0 pqm0VarM69840u;
        Collection collection;
        eab eabVarMo54484I = mo54484I();
        ArrayList arrayList = new ArrayList();
        if (z) {
            wr70 wr70VarM52048g = j0b1.m52048g(this);
            if (wr70VarM52048g != null) {
                arrayList.add(new fwq(this, arrayList.size(), 1, new svq(wr70VarM52048g, 0)));
            }
            if (eabVarMo54484I instanceof ryq) {
                ryq ryqVar = (ryq) eabVarMo54484I;
                pqm0VarM69840u = pft0.m69840u(ryqVar.mo54802L(), ryqVar.m76736W1().m71864n());
            } else if (eabVarMo54484I instanceof qyq) {
                qyq qyqVar = (qyq) eabVarMo54484I;
                pqm0VarM69840u = pft0.m69840u(qyqVar.mo54802L(), qyqVar.m74217P1().m92601n());
            } else if (eabVarMo54484I instanceof kys0) {
                nys0 nys0VarM60266H1 = ((lys0) ((kys0) eabVarMo54484I)).m60266H1();
                qyq qyqVar2 = nys0VarM60266H1 instanceof qyq ? (qyq) nys0VarM60266H1 : null;
                if (qyqVar2 != null) {
                    pqm0VarM69840u = pft0.m69840u(qyqVar2.mo54802L(), qyqVar2.m74217P1().m92601n());
                } else {
                    pqm0VarM69840u = null;
                }
            } else {
                pqm0VarM69840u = null;
            }
            if (pqm0VarM69840u == null) {
                collection = lau.f131415a;
            } else {
                pui0 pui0Var = (pui0) pqm0VarM69840u.f180350a;
                List list = (List) pqm0VarM69840u.f180351b;
                List listMo32018n0 = eabVarMo54484I.mo32018n0();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listMo32018n0, 10));
                int i = 0;
                for (Object obj : listMo32018n0) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    wr70 wr70Var = (wr70) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new s3b1(eabVarMo54484I, null, i, wr70Var.getAnnotations(), qti0.m73840d(pui0Var.getString(((r1t0) list.get(i)).m74490n())), wr70Var.getType(), false, false, false, null, du31.f52959o0));
                    arrayList2 = arrayList3;
                    i = i2;
                    list = list;
                    pui0Var = pui0Var;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new fwq(this, arrayList.size(), 2, new rpk(collection, i3, 1)));
            }
            wr70 wr70VarMo32017Q = eabVarMo54484I.mo32017Q();
            if (wr70VarMo32017Q != null) {
                arrayList.add(new fwq(this, arrayList.size(), 3, new svq(wr70VarMo32017Q, 1)));
            }
        }
        int size2 = eabVarMo54484I.mo32015K().size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(new fwq(this, arrayList.size(), 4, new rpk(eabVarMo54484I, i4, 2)));
        }
        if (epv0.m39705y(this) && (eabVarMo54484I instanceof ad60) && arrayList.size() > 1) {
            j6f.m52572d0(arrayList, new hwd(23));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public abstract zwq mo54483G();

    /* JADX INFO: renamed from: I */
    public abstract eab mo54484I();

    /* JADX INFO: renamed from: O */
    public abstract tvq mo30697O(sp60 sp60Var);

    @Override // p204p.rp60
    /* JADX INFO: renamed from: e */
    public final List mo25528e() {
        return (List) this.f224212e.invoke();
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        return (List) this.f224210c.invoke();
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: i */
    public final sr60 mo25530i() {
        return (sr60) this.f224213f.invoke();
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: k */
    public final List mo25531k() {
        return (List) this.f224211d.invoke();
    }
}
