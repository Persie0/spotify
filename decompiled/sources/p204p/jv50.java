package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class jv50 {

    /* JADX INFO: renamed from: a */
    public jxf f116262a = jxf.f117122a;

    /* JADX INFO: renamed from: b */
    public final x461 f116263b;

    /* JADX INFO: renamed from: c */
    public final hb11 f116264c;

    /* JADX INFO: renamed from: d */
    public final lwf f116265d;

    public jv50(luk lukVar, ae41 ae41Var, u150 u150Var, vwf vwfVar, k1p0 k1p0Var) {
        gej gejVarMo44314c;
        bxo0 bxo0Var;
        x461 x461VarM64613f = njg1.m64613f();
        this.f116263b = x461VarM64613f;
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(x461VarM64613f, lukVar));
        hb11 hb11VarM52091s = j0g1.m52091s(3, 5, 2);
        this.f116264c = hb11VarM52091s;
        pcd1 pcd1Var = vwfVar instanceof pcd1 ? (pcd1) vwfVar : null;
        if (pcd1Var != null) {
            gejVarMo44314c = pcd1Var.mo44314c();
            bxo0Var = null;
        } else {
            gejVarMo44314c = null;
            bxo0Var = null;
        }
        this.f116265d = new lwf(c9kVarM56661c, hb11VarM52091s, new kwf(gejVarMo44314c != null ? gejVarMo44314c.mo39773h() : bxo0Var, k1p0Var), ae41Var, u150Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m54371a(jxf jxfVar) {
        hb11 hb11Var;
        jxf jxfVar2 = this.f116262a;
        if (jxfVar2 != jxfVar) {
            jxf jxfVar3 = jxf.f117122a;
            Iterable iterable = lau.f131415a;
            if (jxfVar2 == jxfVar) {
                List list = wc80.f249980a;
            } else {
                List list2 = wc80.f249980a;
                int iIndexOf = jxfVar2 != null ? list2.indexOf(jxfVar2) : -1;
                int iIndexOf2 = list2.indexOf(jxfVar);
                if (iIndexOf2 != -1) {
                    List<jxf> listSubList = iIndexOf == -1 ? list2.subList(0, iIndexOf2 + 1) : iIndexOf < iIndexOf2 || iIndexOf == -1 ? list2.subList(iIndexOf, iIndexOf2 + 1) : g6f.m43704R0(list2.subList(iIndexOf2, iIndexOf + 1));
                    jxf jxfVar4 = jxf.f117124c;
                    if (listSubList.contains(jxfVar4) && g6f.m43741q0(listSubList) != jxfVar4 && g6f.m43687A0(listSubList) != jxfVar4) {
                        listSubList = g6f.m43696J0(listSubList, jxfVar4);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (jxfVar2 == null) {
                        jxfVar2 = jxfVar3;
                    }
                    for (jxf jxfVar5 : listSubList) {
                        arrayList.add(new pqm0(jxfVar2, jxfVar5));
                        jxfVar2 = jxfVar5;
                    }
                    iterable = arrayList;
                }
            }
            List listM43729k0 = g6f.m43729k0(iterable, 1);
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43729k0, 10));
            Iterator it = listM43729k0.iterator();
            while (it.hasNext()) {
                arrayList2.add((jxf) ((pqm0) it.next()).f180351b);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                hb11Var = this.f116264c;
                if (!zHasNext) {
                    break;
                } else {
                    hb11Var.mo46962a((jxf) it2.next());
                }
            }
            this.f116262a = jxfVar;
            if (jxfVar == jxfVar3) {
                hb11Var.mo46963e();
                qlg1.m73216u(this.f116263b);
            }
        }
    }
}
