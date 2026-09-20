package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bqx {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f29900a;

    public bqx(Set set) {
        Set set2 = set;
        u6x u6xVar = new u6x(set2, 2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itMo36148g = u6xVar.mo36148g();
        while (itMo36148g.hasNext()) {
            Object next = itMo36148g.next();
            Object objMo36147b = u6xVar.mo36147b(next);
            Object obj = linkedHashMap.get(objMo36147b);
            if (obj != null || linkedHashMap.containsKey(objMo36147b)) {
                String name = ((aqx) next).getClass().getName();
                String name2 = ((Class) objMo36147b).getName();
                Class<?> cls = ((aqx) obj).getClass();
                StringBuilder sbM38573v = edb.m38573v("ExtendedMetadataPlugin '", name, "' duplicates type '", name2, "' provided by ExtendedMetadataPlugin '");
                sbM38573v.append(cls);
                sbM38573v.append("'");
                throw new IllegalArgumentException(sbM38573v.toString());
            }
            linkedHashMap.put(objMo36147b, next);
        }
        this.f29900a = linkedHashMap;
        drw drwVar = new drw(set2, 3);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator itMo36148g2 = drwVar.mo36148g();
        while (itMo36148g2.hasNext()) {
            Object next2 = itMo36148g2.next();
            Object objMo36147b2 = drwVar.mo36147b(next2);
            Object obj2 = linkedHashMap2.get(objMo36147b2);
            if (obj2 != null || linkedHashMap2.containsKey(objMo36147b2)) {
                int iIntValue = ((Number) objMo36147b2).intValue();
                String name3 = ((aqx) next2).getClass().getName();
                Class<?> cls2 = ((aqx) obj2).getClass();
                StringBuilder sbM38571t = edb.m38571t(iIntValue, "ExtendedMetadataPlugin '", name3, "' duplicates Extension Kind '", "' provided by ExtendedMetadataPlugin '");
                sbM38571t.append(cls2);
                sbM38571t.append("'");
                throw new IllegalArgumentException(sbM38571t.toString());
            }
            linkedHashMap2.put(objMo36147b2, next2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final aqx m30280a(Class cls) {
        aqx aqxVar = (aqx) this.f29900a.get(cls);
        if (aqxVar != null) {
            return aqxVar;
        }
        na6.m63957e("No ExtendedMetadataPlugin registered for '" + cls.getName() + "'. Registered plugins:\n" + m30281b());
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m30281b() {
        Collection<aqx> collectionValues = this.f29900a.values();
        ArrayList arrayList = new ArrayList();
        for (aqx aqxVar : collectionValues) {
            String strM38565n = edb.m38565n(aqxVar.getClass().getName(), " for Extension Kind: ", aqxVar.mo26904b());
            if (strM38565n != null) {
                arrayList.add(strM38565n);
            }
        }
        return g6f.m43753y0(g6f.m43710X0(arrayList), "\n", "\t", null, null, 60);
    }
}
