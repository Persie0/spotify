package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kkc0 extends c95 {
    /* JADX INFO: renamed from: e0 */
    public static Object m56692e0(Object obj, Map map) {
        if (map instanceof epi0) {
            LinkedHashMap linkedHashMap = ((epi0) map).f61653a;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 != null || linkedHashMap.containsKey(obj)) {
                return obj2;
            }
            return 0;
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: f0 */
    public static HashMap m56693f0(pqm0... pqm0VarArr) {
        HashMap map = new HashMap(c95.m31820L(pqm0VarArr.length));
        m56703p0(map, pqm0VarArr);
        return map;
    }

    /* JADX INFO: renamed from: g0 */
    public static LinkedHashMap m56694g0(pqm0... pqm0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(pqm0VarArr.length));
        m56703p0(linkedHashMap, pqm0VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h0 */
    public static Map m56695h0(pqm0... pqm0VarArr) {
        if (pqm0VarArr.length <= 0) {
            return nau.f152117a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(pqm0VarArr.length));
        m56703p0(linkedHashMap, pqm0VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i0 */
    public static Map m56696i0(Object obj, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return m56699l0(linkedHashMap);
    }

    /* JADX INFO: renamed from: j0 */
    public static Map m56697j0(Map map, Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.keySet().removeAll(j6f.m52565W(iterable));
        return m56699l0(linkedHashMap);
    }

    /* JADX INFO: renamed from: k0 */
    public static LinkedHashMap m56698k0(pqm0... pqm0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(pqm0VarArr.length));
        m56703p0(linkedHashMap, pqm0VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Map m56699l0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return nau.f152117a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: m0 */
    public static LinkedHashMap m56700m0(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: n0 */
    public static Map m56701n0(Map map, pqm0 pqm0Var) {
        if (map.isEmpty()) {
            return c95.m31821M(pqm0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pqm0Var.f180350a, pqm0Var.f180351b);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m56702o0(LinkedHashMap linkedHashMap, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pqm0 pqm0Var = (pqm0) it.next();
            linkedHashMap.put(pqm0Var.f180350a, pqm0Var.f180351b);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m56703p0(Map map, pqm0[] pqm0VarArr) {
        for (pqm0 pqm0Var : pqm0VarArr) {
            map.put(pqm0Var.f180350a, pqm0Var.f180351b);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static List m56704q0(Map map) {
        int size = map.size();
        lau lauVar = lau.f131415a;
        if (size == 0) {
            return lauVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return lauVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return geg1.m44518y(new pqm0(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new pqm0(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new pqm0(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static Map m56705r0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m56702o0(linkedHashMap, iterable);
            return m56699l0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return nau.f152117a;
        }
        if (size == 1) {
            return c95.m31821M((pqm0) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(collection.size()));
        m56702o0(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: s0 */
    public static Map m56706s0(Map map) {
        int size = map.size();
        if (size == 0) {
            return nau.f152117a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: t0 */
    public static Map m56707t0(qsz0 qsz0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = qsz0Var.iterator();
        while (it.hasNext()) {
            pqm0 pqm0Var = (pqm0) it.next();
            linkedHashMap.put(pqm0Var.f180350a, pqm0Var.f180351b);
        }
        return m56699l0(linkedHashMap);
    }

    /* JADX INFO: renamed from: u0 */
    public static Map m56708u0(pqm0[] pqm0VarArr) {
        int length = pqm0VarArr.length;
        if (length == 0) {
            return nau.f152117a;
        }
        if (length == 1) {
            return c95.m31821M(pqm0VarArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(pqm0VarArr.length));
        m56703p0(linkedHashMap, pqm0VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: v0 */
    public static LinkedHashMap m56709v0(Map map) {
        return new LinkedHashMap(map);
    }
}
