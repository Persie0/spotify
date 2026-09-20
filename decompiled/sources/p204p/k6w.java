package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k6w implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final k6w f119850a = new k6w();

    /* JADX INFO: renamed from: b */
    public static final Set f119851b = bk5.m29624m1(new String[]{"show", "extension"});

    /* JADX INFO: renamed from: c */
    public static final mtz0 f119852c = gjg1.m44907F("EpisodePolicy", new ktz0[0]);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        if (!(froVar instanceof vk60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vk60 vk60Var = (vk60) froVar;
        nl60 nl60VarM96308j = zk60.m96308j(vk60Var.mo43785m());
        fk60 fk60VarMo43778d = vk60Var.mo43778d();
        rr60 rr60VarSerializer = s3f.Companion.serializer();
        Object obj = nl60VarM96308j.get("show");
        wj50.m88279p(obj);
        fk60VarMo43778d.getClass();
        s3f s3fVar = (s3f) ex60.m40192z(fk60VarMo43778d, (yk60) obj, rr60VarSerializer);
        Object obj2 = nl60VarM96308j.get("extension");
        wj50.m88279p(obj2);
        jk60 jk60VarM96307i = zk60.m96307i((yk60) obj2);
        ArrayList arrayList = new ArrayList(i6f.m49804T(jk60VarM96307i, 10));
        Iterator it = jk60VarM96307i.f113228a.iterator();
        while (it.hasNext()) {
            Integer numM96306h = zk60.m96306h(zk60.m96309k((yk60) it.next()));
            arrayList.add(Integer.valueOf(numM96306h != null ? numM96306h.intValue() : 0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : nl60VarM96308j.f155012a.entrySet()) {
            if (!f119851b.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(zk60.m96303e(zk60.m96309k((yk60) entry2.getValue()))));
        }
        return new n3f(linkedHashMap2, s3fVar, arrayList);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f119852c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        n3f n3fVar = (n3f) obj;
        if (!(deuVar instanceof dl60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dl60 dl60Var = (dl60) deuVar;
        fk60 fk60VarMo36346d = dl60Var.mo36346d();
        rr60 rr60VarSerializer = s3f.Companion.serializer();
        s3f s3fVar = n3fVar.f150046b;
        fk60VarMo36346d.getClass();
        fk60 fk60VarMo36346d2 = dl60Var.mo36346d();
        mj5 mj5Var = new mj5(e450.f55982a, 0);
        List list = n3fVar.f150047c;
        fk60VarMo36346d2.getClass();
        for (Map.Entry entry : n3fVar.f150045a.entrySet()) {
            String str = (String) entry.getKey();
            Boolean bool = (Boolean) entry.getValue();
            bool.getClass();
        }
        dl60Var.mo36345R(new nl60(linkedHashMap));
    }
}
