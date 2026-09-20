package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg40 extends ef40 implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f91023c = 0;

    /* JADX INFO: renamed from: b */
    public transient pf40 f91024b;

    /* JADX INFO: renamed from: l */
    public static fg40 m47402l(int i) {
        ddg1.m35736g(i, "expectedSize");
        fg40 fg40Var = new fg40(i);
        fg40Var.f69215d = new Object[m47403m(i)];
        return fg40Var;
    }

    /* JADX INFO: renamed from: m */
    public static int m47403m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            c95.m31844j(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: n */
    public static hg40 m47404n(int i, Object... objArr) {
        if (i == 0) {
            return ftv0.f73317t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zh21(obj);
        }
        int iM47403m = m47403m(i);
        Object[] objArr2 = new Object[iM47403m];
        int i2 = iM47403m - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            jhl0.m53414h(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iM30840q = bxg1.m30840q(iHashCode);
            while (true) {
                int i6 = iM30840q & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM30840q++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zh21(obj4);
        }
        if (m47403m(i4) < iM47403m / 2) {
            return m47404n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ftv0(i3, i2, i4, objArr, objArr2);
    }

    /* JADX INFO: renamed from: o */
    public static hg40 m47405o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m47406p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return ftv0.f73317t;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new zh21(next);
        }
        fg40 fg40Var = new fg40(4);
        fg40Var.m41574g(next);
        while (it.hasNext()) {
            fg40Var.m41574g(it.next());
        }
        return fg40Var.m41576i();
    }

    /* JADX INFO: renamed from: p */
    public static hg40 m47406p(Collection collection) {
        if ((collection instanceof hg40) && !(collection instanceof SortedSet)) {
            hg40 hg40Var = (hg40) collection;
            if (!hg40Var.mo1672i()) {
                return hg40Var;
            }
        }
        Object[] array = collection.toArray();
        return m47404n(array.length, array);
    }

    /* JADX INFO: renamed from: q */
    public static hg40 m47407q(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m47404n(objArr.length, (Object[]) objArr.clone()) : new zh21(objArr[0]);
        }
        return ftv0.f73317t;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: t */
    public static hg40 m47408t(Object obj, Object obj2) {
        return m47404n(2, obj, obj2);
    }

    /* JADX INFO: renamed from: u */
    public static hg40 m47409u(Object obj, Object obj2, Object obj3) {
        return m47404n(3, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: v */
    public static hg40 m47410v(Object obj, Object obj2, Object obj3, Object obj4) {
        return m47404n(4, obj, obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: w */
    public static hg40 m47411w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m47404n(5, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: renamed from: x */
    public static hg40 m47412x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        c95.m31844j(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m47404n(length, objArr2);
    }

    /* JADX INFO: renamed from: y */
    public static zh21 m47413y(lz9 lz9Var) {
        return new zh21(lz9Var);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: a */
    public pf40 mo38714a() {
        pf40 pf40Var = this.f91024b;
        if (pf40Var != null) {
            return pf40Var;
        }
        pf40 pf40VarMo42688r = mo42688r();
        this.f91024b = pf40VarMo42688r;
        return pf40VarMo42688r;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hg40) && m47414s() && ((hg40) obj).m47414s() && hashCode() != obj.hashCode()) {
            return false;
        }
        return gmg1.m45259u(obj, this);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return gmg1.m45263y(this);
    }

    /* JADX INFO: renamed from: r */
    public pf40 mo42688r() {
        Object[] array = toArray(ef40.f58934a);
        kf40 kf40Var = pf40.f176960b;
        return pf40.m69787l(array.length, array);
    }

    /* JADX INFO: renamed from: s */
    public boolean m47414s() {
        return this instanceof ftv0;
    }

    @Override // p204p.ef40
    public Object writeReplace() {
        return new gg40(toArray(ef40.f58934a));
    }
}
