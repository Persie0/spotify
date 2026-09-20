package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rdm implements u6m0 {

    /* JADX INFO: renamed from: a */
    public final qe70 f198166a;

    /* JADX INFO: renamed from: b */
    public final qe70 f198167b;

    /* JADX WARN: Multi-variable type inference failed */
    public rdm(th00 th00Var, vh00 vh00Var) {
        this.f198166a = (qe70) th00Var;
        this.f198167b = (qe70) vh00Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public sdm m75340a() {
        rdm rdmVar = this;
        wi61 wi61Var = new wi61();
        rdmVar.f198167b.invoke(wi61Var);
        n2b n2bVar = wi61Var.f251540b;
        xoi0 xoi0VarM77684w = n2bVar != null ? sam.m77684w((ck90) n2bVar.invoke(), ky51.f127673Z0) : new xoi0(0);
        l2b l2bVar = wi61Var.f251541c;
        tb61 tb61Var = l2bVar != null ? new tb61(l2bVar, 3) : null;
        int i = l2bVar != null ? l2bVar.f128961c : 0;
        ArrayList arrayList = wi61Var.f251539a;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            vi61 vi61Var = (vi61) it.next();
            ep80 ep80Var = (ep80) rdmVar.f198166a.invoke();
            vi61Var.f241630c.invoke(ep80Var);
            cp80 cp80VarM39637a = ep80Var.m39637a();
            tp80 tp80Var = (tp80) cp80VarM39637a.f40491a.invoke();
            LinkedHashMap linkedHashMap = cp80VarM39637a.f40493c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), new dxl(6, entry, tp80Var));
            }
            String str = vi61Var.f241628a;
            String str2 = vi61Var.f241629b;
            Map map = cp80VarM39637a.f40492b;
            hzd0 hzd0VarM77684w = sam.m77684w(vi61Var.f241631d, j3m.f108423S0);
            wh51 wh51Var = vi61Var.f241632e;
            arrayList2.add(new qdm(str, str2, tp80Var, linkedHashMap2, map, hzd0VarM77684w, new fw7(11, new zz11(((xhy0) wh51Var.f251262b).f261731a, 6), new zz11(((xhy0) wh51Var.f251263c).f261731a, 5)), vi61Var.f241633f, vi61Var.f241634g, vi61Var.f241635h));
            rdmVar = this;
        }
        return new sdm(arrayList2, xoi0VarM77684w, tb61Var, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.qe70, p.vh00] */
    @Override // p204p.u6m0
    /* JADX INFO: renamed from: k */
    public t6m0 mo34969k(dcm0 dcm0Var, Bundle bundle) {
        return new flw0(dcm0Var, bundle, (th00) this.f198166a, (vh00) this.f198167b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rdm(gh00 gh00Var, eh00 eh00Var) {
        this.f198166a = (qe70) eh00Var;
        this.f198167b = (qe70) gh00Var;
    }
}
