package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qis implements s8x {

    /* JADX INFO: renamed from: a */
    public final fk60 f189060a;

    public qis(fk60 fk60Var) {
        this.f189060a = fk60Var;
    }

    @Override // p204p.s8x
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap mo72873a(String str) {
        if (str.length() == 0) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ql51 ql51Var = ql51.f189738a;
        Iterator it = ((Map) this.f189060a.m41880a(str, new pn80(ql51Var, new pn80(ql51Var, u2b0.f226058a)))).entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Map.Entry) it.next()).getValue()).entrySet()) {
                String str2 = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                Object t8xVar = linkedHashMap.get(str2);
                if (t8xVar == null) {
                    t8xVar = new t8x();
                    linkedHashMap.put(str2, t8xVar);
                }
                LinkedHashMap linkedHashMap2 = q8x.f186420b;
                ois[] oisVarArr = ((t8x) t8xVar).f218148a;
                ois oisVar = oisVarArr[2];
                oisVar.f165879a += jLongValue;
                oisVar.f165880b = oisVar.f165880b;
                oisVarArr[2] = oisVar;
            }
        }
        return linkedHashMap;
    }
}
