package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class cq11 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final cq11 f40700a = new cq11();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f40701b = gjg1.m44907F("ShowPolicy", new ktz0[0]);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ArrayList arrayList;
        if (!(froVar instanceof vk60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        nl60 nl60VarM96308j = zk60.m96308j(((vk60) froVar).mo43785m());
        yk60 yk60Var = (yk60) nl60VarM96308j.get("extension");
        if (yk60Var != null) {
            jk60 jk60VarM96307i = zk60.m96307i(yk60Var);
            arrayList = new ArrayList(i6f.m49804T(jk60VarM96307i, 10));
            Iterator it = jk60VarM96307i.f113228a.iterator();
            while (it.hasNext()) {
                Integer numM96306h = zk60.m96306h(zk60.m96309k((yk60) it.next()));
                arrayList.add(Integer.valueOf(numM96306h != null ? numM96306h.intValue() : 0));
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : nl60VarM96308j.f155012a.entrySet()) {
            if (!wj50.m88271j((String) entry.getKey(), "extension")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(zk60.m96303e(zk60.m96309k((yk60) entry2.getValue()))));
        }
        return new cso(arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f40701b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        cso csoVar = (cso) obj;
        List list = csoVar.f41662b;
        if (!(deuVar instanceof dl60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            fk60 fk60VarMo36346d = ((dl60) deuVar).mo36346d();
            mj5 mj5Var = new mj5(e450.f55982a, 0);
            fk60VarMo36346d.getClass();
        }
        Map map = csoVar.f41661a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Boolean bool = (Boolean) entry.getValue();
                bool.getClass();
            }
        }
        ((dl60) deuVar).mo36345R(new nl60(linkedHashMap));
    }
}
