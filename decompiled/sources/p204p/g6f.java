package p204p;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g6f extends j6f {
    /* JADX INFO: renamed from: A0 */
    public static Object m43687A0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(h6f.m46714K(list));
    }

    /* JADX INFO: renamed from: B0 */
    public static Object m43688B0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: C0 */
    public static Object m43689C0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: D0 */
    public static Comparable m43690D0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: E0 */
    public static Float m43691E0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: F0 */
    public static Comparable m43692F0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: G0 */
    public static Comparable m43693G0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: H0 */
    public static Float m43694H0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: I0 */
    public static Comparable m43695I0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: J0 */
    public static ArrayList m43696J0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && wj50.m88271j(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K0 */
    public static List m43697K0(Iterable iterable, Iterable iterable2) {
        Collection collectionM52565W = j6f.m52565W(iterable2);
        if (collectionM52565W.isEmpty()) {
            return m43728j1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionM52565W.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L0 */
    public static ArrayList m43698L0(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection) {
            return m43700N0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        j6f.m52564V(iterable, arrayList);
        j6f.m52564V(iterable2, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public static ArrayList m43699M0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m43701O0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        j6f.m52564V(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public static ArrayList m43700N0(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            j6f.m52564V(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: O0 */
    public static ArrayList m43701O0(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static Object m43702P0(Collection collection, w4u0 w4u0Var) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return m43733m0(w4u0Var.mo84665g(collection.size()), collection);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m43703Q0(List list) {
        Collections.reverse(list);
    }

    /* JADX INFO: renamed from: R0 */
    public static List m43704R0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m43728j1(iterable);
        }
        List listM43732l1 = m43732l1(iterable);
        m43703Q0(listM43732l1);
        return listM43732l1;
    }

    /* JADX INFO: renamed from: S0 */
    public static Object m43705S0(Iterable iterable) {
        if (iterable instanceof List) {
            return m43706T0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: T0 */
    public static Object m43706T0(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: U0 */
    public static Object m43707U0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: V0 */
    public static Object m43708V0(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: W0 */
    public static List m43709W0(List list, b450 b450Var) {
        return b450Var.isEmpty() ? lau.f131415a : m43728j1(list.subList(b450Var.f278778a, b450Var.f278779b + 1));
    }

    /* JADX INFO: renamed from: X0 */
    public static List m43710X0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listM43732l1 = m43732l1(iterable);
            if (((ArrayList) listM43732l1).size() > 1) {
                Collections.sort(listM43732l1);
            }
            return listM43732l1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m43728j1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        bk5.m29602Y0((Comparable[]) array);
        return bk5.m29611g0(array);
    }

    /* JADX INFO: renamed from: Y0 */
    public static List m43711Y0(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listM43732l1 = m43732l1(iterable);
            j6f.m52572d0(listM43732l1, comparator);
            return listM43732l1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m43728j1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        bk5.m29603Z0(array, comparator);
        return bk5.m29611g0(array);
    }

    /* JADX INFO: renamed from: Z0 */
    public static LinkedHashSet m43712Z0(Iterable iterable, Iterable iterable2) {
        Collection collectionM52565W = j6f.m52565W(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionM52565W.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: a1 */
    public static int m43713a1(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b1 */
    public static List m43714b1(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return lau.f131415a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m43728j1(iterable);
            }
            if (i == 1) {
                return geg1.m44518y(m43739p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return h6f.m46718O(arrayList);
    }

    /* JADX INFO: renamed from: c1 */
    public static List m43715c1(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return lau.f131415a;
        }
        int size = list.size();
        if (i >= size) {
            return m43728j1(list);
        }
        if (i == 1) {
            return geg1.m44518y(m43687A0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public static boolean[] m43716d1(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m43717e0(int i, List list) {
        if (i >= 0 && i <= h6f.m46714K(list)) {
            return h6f.m46714K(list) - i;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Element index ", " must be in range [");
        sbM56838j.append(new b450(0, h6f.m46714K(list), 1));
        sbM56838j.append("].");
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: e1 */
    public static byte[] m43718e1(List list) {
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m43719f0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Position index ", " must be in range [");
        sbM56838j.append(new b450(0, list.size(), 1));
        sbM56838j.append("].");
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: f1 */
    public static void m43720f1(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static double m43721g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                h6f.m46721R();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    /* JADX INFO: renamed from: g1 */
    public static float[] m43722g1(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: h0 */
    public static double m43723h0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) ((Number) it.next()).intValue();
            i++;
            if (i < 0) {
                h6f.m46721R();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    /* JADX INFO: renamed from: h1 */
    public static HashSet m43724h1(Iterable iterable) {
        HashSet hashSet = new HashSet(c95.m31820L(i6f.m49804T(iterable, 12)));
        m43720f1(iterable, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m43725i0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m43749u0(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: i1 */
    public static int[] m43726i1(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j0 */
    public static List m43727j0(Iterable iterable) {
        return m43728j1(m43734m1(iterable));
    }

    /* JADX INFO: renamed from: j1 */
    public static List m43728j1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return h6f.m46718O(m43732l1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return lau.f131415a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return geg1.m44518y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: k0 */
    public static List m43729k0(Iterable iterable, int i) {
        ArrayList arrayList;
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return m43728j1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return lau.f131415a;
            }
            if (size == 1) {
                return geg1.m44518y(m43754z0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return h6f.m46718O(arrayList);
    }

    /* JADX INFO: renamed from: k1 */
    public static long[] m43730k1(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m43731l0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return m43714b1(list, size);
    }

    /* JADX INFO: renamed from: l1 */
    public static final List m43732l1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m43720f1(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Object m43733m0(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        k6f k6fVar = new k6f(i, 0);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            k6fVar.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            k6fVar.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        k6fVar.invoke(Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: m1 */
    public static Set m43734m1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m43720f1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: n0 */
    public static ArrayList m43735n0(Iterable iterable, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n1 */
    public static Set m43736n1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m43720f1(iterable, linkedHashSet);
            return s601.m77307j0(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return gbu.f78413a;
        }
        if (size == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c95.m31820L(collection.size()));
        m43720f1(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: o0 */
    public static ArrayList m43737o0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o1 */
    public static Set m43738o1(Iterable iterable, Iterable iterable2) {
        Set setM43734m1 = m43734m1(iterable);
        j6f.m52564V(iterable2, setM43734m1);
        return setM43734m1;
    }

    /* JADX INFO: renamed from: p0 */
    public static Object m43739p0(Iterable iterable) {
        if (iterable instanceof List) {
            return m43741q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: p1 */
    public static ArrayList m43740p1(Iterable iterable, int i, int i2) {
        bga.m29094p(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM29076S = bga.m29076S(iterable.iterator(), i, i2, true, false);
            while (itM29076S.hasNext()) {
                arrayList.add((List) itM29076S.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m43741q0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: q1 */
    public static final ArrayList m43742q1(List list, int i, int i2, boolean z, gh00 gh00Var) {
        bga.m29094p(i, i2);
        if (!(list instanceof RandomAccess) || list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator itM29076S = bga.m29076S(list.iterator(), i, i2, z, true);
            while (itM29076S.hasNext()) {
                arrayList.add(gh00Var.invoke((List) itM29076S.next()));
            }
            return arrayList;
        }
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        C2117m7 c2117m7 = new C2117m7(list);
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (!z && i4 < i) {
                break;
            }
            c2117m7.m61037b(i3, i4 + i3);
            arrayList2.add(gh00Var.invoke(c2117m7));
            i3 += i2;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: r0 */
    public static Object m43743r0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: r1 */
    public static co40 m43744r1(Iterable iterable) {
        return new co40(new mo4(iterable, 10));
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m43745s0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: s1 */
    public static ArrayList m43746s1(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(i6f.m49804T(iterable, 10), i6f.m49804T(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(pft0.m69840u(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t0 */
    public static Object m43747t0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: t1 */
    public static List m43748t1(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(pft0.m69840u(next, next2));
            next = next2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u0 */
    public static int m43749u0(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            if (wj50.m88271j(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: v0 */
    public static LinkedHashSet m43750v0(Iterable iterable, Iterable iterable2) {
        Collection collectionM52565W = j6f.m52565W(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionM52565W.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m43751w0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, gh00 gh00Var) throws IOException {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                q0f1.m71839n(appendable, obj, gh00Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append("...");
        }
        appendable.append(charSequence3);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m43752x0(Iterable iterable, Appendable appendable, String str, String str2, String str3, gh00 gh00Var, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            gh00Var = null;
        }
        m43751w0(iterable, appendable, str4, str5, str6, -1, gh00Var);
    }

    /* JADX INFO: renamed from: y0 */
    public static String m43753y0(Iterable iterable, CharSequence charSequence, String str, String str2, gh00 gh00Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        int i2 = (i & 8) != 0 ? -1 : 3;
        if ((i & 32) != 0) {
            gh00Var = null;
        }
        StringBuilder sb = new StringBuilder();
        m43751w0(iterable, sb, charSequence2, str3, str4, i2, gh00Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: z0 */
    public static Object m43754z0(Iterable iterable) {
        if (iterable instanceof List) {
            return m43687A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
