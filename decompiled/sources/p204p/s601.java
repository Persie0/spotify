package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s601 extends n0e1 {
    /* JADX INFO: renamed from: f0 */
    public static HashSet m77303f0(Object... objArr) {
        HashSet hashSet = new HashSet(c95.m31820L(objArr.length));
        bk5.m29608e1(objArr, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: g0 */
    public static LinkedHashSet m77304g0(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c95.m31820L(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && wj50.m88271j(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: h0 */
    public static Set m77305h0(Set set, Iterable iterable) {
        Collection<?> collectionM52565W = j6f.m52565W(iterable);
        if (collectionM52565W.isEmpty()) {
            return g6f.m43736n1(set);
        }
        if (!(collectionM52565W instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM52565W);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM52565W).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: i0 */
    public static Set m77306i0(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c95.m31820L(objArr.length));
        bk5.m29608e1(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Set m77307j0(Set set) {
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : Collections.singleton(set.iterator().next());
        }
        return gbu.f78413a;
    }

    /* JADX INFO: renamed from: k0 */
    public static LinkedHashSet m77308k0(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c95.m31820L(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: l0 */
    public static LinkedHashSet m77309l0(Set set, Iterable iterable) {
        int size;
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c95.m31820L(size));
        linkedHashSet.addAll(set);
        j6f.m52564V(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m0 */
    public static Set m77310m0(Object... objArr) {
        return bk5.m29624m1(objArr);
    }

    /* JADX INFO: renamed from: n0 */
    public static Set m77311n0(Object obj) {
        return obj != null ? Collections.singleton(obj) : gbu.f78413a;
    }

    /* JADX INFO: renamed from: o0 */
    public static Set m77312o0(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
