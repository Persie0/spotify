package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h6f extends geg1 {
    /* JADX INFO: renamed from: G */
    public static ArrayList m46710G(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new cj5(objArr, true));
    }

    /* JADX INFO: renamed from: H */
    public static int m46711H(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        m46719P(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iM53703m = jlg1.m53703m((Comparable) arrayList.get(i3), comparable);
            if (iM53703m < 0) {
                i2 = i3 + 1;
            } else {
                if (iM53703m <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: I */
    public static int m46712I(List list, gh00 gh00Var) {
        int size = list.size();
        m46719P(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iIntValue = ((Number) gh00Var.invoke(list.get(i3))).intValue();
            if (iIntValue < 0) {
                i2 = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: J */
    public static b450 m46713J(Collection collection) {
        return new b450(0, collection.size() - 1, 1);
    }

    /* JADX INFO: renamed from: K */
    public static int m46714K(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: L */
    public static List m46715L(Object... objArr) {
        return objArr.length > 0 ? bk5.m29611g0(objArr) : lau.f131415a;
    }

    /* JADX INFO: renamed from: M */
    public static List m46716M(Object obj) {
        return obj != null ? geg1.m44518y(obj) : lau.f131415a;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList m46717N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new cj5(objArr, true));
    }

    /* JADX INFO: renamed from: O */
    public static final List m46718O(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : geg1.m44518y(list.get(0));
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: P */
    public static final void m46719P(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(edb.m38563l("fromIndex (0) is greater than toIndex (", i2, ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(edb.m38560i(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static List m46720Q(Iterable iterable, w4u0 w4u0Var) {
        List listM43732l1 = g6f.m43732l1(iterable);
        for (int iM46714K = m46714K(listM43732l1); iM46714K > 0; iM46714K--) {
            int iMo84665g = w4u0Var.mo84665g(iM46714K + 1);
            ArrayList arrayList = (ArrayList) listM43732l1;
            arrayList.set(iMo84665g, arrayList.set(iM46714K, arrayList.get(iMo84665g)));
        }
        return listM43732l1;
    }

    /* JADX INFO: renamed from: R */
    public static void m46721R() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: S */
    public static void m46722S() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
