package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class r8x implements s8x {

    /* JADX INFO: renamed from: a */
    public final fk60 f196847a;

    public r8x(fk60 fk60Var) {
        this.f196847a = fk60Var;
    }

    @Override // p204p.s8x
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap mo72873a(String str) {
        if (str.length() == 0) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ql51 ql51Var = ql51.f189738a;
        Iterator it = ((Map) this.f196847a.m41880a(str, new pn80(ql51Var, new pn80(ql51Var, ois.Companion.serializer())))).entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Map.Entry) it.next()).getValue()).entrySet()) {
                String str2 = (String) entry.getKey();
                ois oisVar = (ois) entry.getValue();
                Object t8xVar = linkedHashMap.get(str2);
                if (t8xVar == null) {
                    t8xVar = new t8x();
                    linkedHashMap.put(str2, t8xVar);
                }
                LinkedHashMap linkedHashMap2 = q8x.f186420b;
                ois[] oisVarArr = ((t8x) t8xVar).f218148a;
                ois oisVar2 = oisVarArr[2];
                oisVar2.f165879a += oisVar.f165879a;
                oisVar2.f165880b += oisVar.f165880b;
                oisVarArr[2] = oisVar2;
            }
        }
        return linkedHashMap;
    }
}
