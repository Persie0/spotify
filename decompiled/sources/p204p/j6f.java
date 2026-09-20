package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j6f extends i6f {
    /* JADX INFO: renamed from: V */
    public static void m52564V(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: W */
    public static final Collection m52565W(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : g6f.m43728j1(iterable);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m52566X(Iterable iterable, gh00 gh00Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) gh00Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m52567Y(List list, gh00 gh00Var) {
        int i;
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof pq60) || (list instanceof qq60)) {
                return m52566X(list, gh00Var, true);
            }
            zn91.m96572q0(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int iM46714K = h6f.m46714K(list);
        if (iM46714K >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) gh00Var.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iM46714K) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iM46714K2 = h6f.m46714K(list);
        if (i <= iM46714K2) {
            while (true) {
                list.remove(iM46714K2);
                if (iM46714K2 == i) {
                    break;
                }
                iM46714K2--;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public static Object m52568Z(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: a0 */
    public static Object m52569a0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: b0 */
    public static Object m52570b0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(h6f.m46714K(list));
    }

    /* JADX INFO: renamed from: c0 */
    public static Object m52571c0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(h6f.m46714K(list));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m52572d0(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
