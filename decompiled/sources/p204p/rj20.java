package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class rj20 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final rj20 f199693a = new rj20();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f199694b = gjg1.m44907F("HeaderDecorationPolicy", new ktz0[0]);

    /* JADX INFO: renamed from: a */
    public static yk60 m75636a(Object obj) {
        if (obj == null) {
            it40 it40Var = zk60.f283668a;
            return kl60.INSTANCE;
        }
        if (obj instanceof Boolean) {
            return zk60.m96299a((Boolean) obj);
        }
        if (obj instanceof Number) {
            return zk60.m96300b((Number) obj);
        }
        if (obj instanceof String) {
            return zk60.m96301c((String) obj);
        }
        if (obj instanceof yk60) {
            return (yk60) obj;
        }
        if (!(obj instanceof Map)) {
            return zk60.m96301c(obj.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
            }
        }
        return new nl60(linkedHashMap);
    }

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
            linkedHashMap2.put(entry2.getKey(), zk60.m96309k((yk60) entry2.getValue()));
        }
        return new pl11(arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f199694b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        pl11 pl11Var = (pl11) obj;
        if (!(deuVar instanceof dl60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = pl11Var.f178610b;
        if (list != null) {
            fk60 fk60VarMo36346d = ((dl60) deuVar).mo36346d();
            mj5 mj5Var = new mj5(e450.f55982a, 0);
            fk60VarMo36346d.getClass();
        }
        Map map = pl11Var.f178609a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
            }
        }
        ((dl60) deuVar).mo36345R(new nl60(linkedHashMap));
    }
}
