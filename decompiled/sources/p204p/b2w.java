package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b2w implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final b2w f22727a = new b2w();

    /* JADX INFO: renamed from: b */
    public static final Set f22728b = bk5.m29624m1(new String[]{"show", "extension"});

    /* JADX INFO: renamed from: c */
    public static final mtz0 f22729c = gjg1.m44907F("EpisodeDecorationPolicy", new ktz0[0]);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        av60 av60Var;
        ArrayList arrayList;
        if (!(froVar instanceof vk60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vk60 vk60Var = (vk60) froVar;
        nl60 nl60VarM96308j = zk60.m96308j(vk60Var.mo43785m());
        yk60 yk60Var = (yk60) nl60VarM96308j.get("show");
        if (yk60Var != null) {
            fk60 fk60VarMo43778d = vk60Var.mo43778d();
            bv60 bv60Var = bv60.f31294a;
            fk60VarMo43778d.getClass();
            av60Var = (av60) ex60.m40192z(fk60VarMo43778d, yk60Var, bv60Var);
        } else {
            av60Var = null;
        }
        yk60 yk60Var2 = (yk60) nl60VarM96308j.get("extension");
        if (yk60Var2 != null) {
            jk60 jk60VarM96307i = zk60.m96307i(yk60Var2);
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
            if (!f22728b.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(zk60.m96303e(zk60.m96309k((yk60) entry2.getValue()))));
        }
        return new a2w(av60Var, arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f22729c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        a2w a2wVar = (a2w) obj;
        if (!(deuVar instanceof dl60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        av60 av60Var = a2wVar.f11731a;
        if (av60Var != null) {
            fk60 fk60VarMo36346d = ((dl60) deuVar).mo36346d();
            bv60 bv60Var = bv60.f31294a;
            fk60VarMo36346d.getClass();
        }
        List list = a2wVar.f11732b;
        if (list != null) {
            fk60 fk60VarMo36346d2 = ((dl60) deuVar).mo36346d();
            mj5 mj5Var = new mj5(e450.f55982a, 0);
            fk60VarMo36346d2.getClass();
        }
        Map map = a2wVar.f11733c;
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
