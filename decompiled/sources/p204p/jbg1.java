package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jbg1 extends h0f1 implements Set {

    /* JADX INFO: renamed from: g */
    public transient yag1 f110798g;

    /* JADX INFO: renamed from: p */
    public static bdg1 m52904p() {
        return bdg1.f26099L0;
    }

    /* JADX INFO: renamed from: q */
    public static int m52905q(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: r */
    public static jbg1 m52906r(LinkedHashSet linkedHashSet) {
        Object[] array = linkedHashSet.toArray();
        return m52907s(array.length, array);
    }

    /* JADX INFO: renamed from: s */
    public static jbg1 m52907s(int i, Object... objArr) {
        if (i == 0) {
            return bdg1.f26099L0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new gdg1(obj);
        }
        int iM52905q = m52905q(i);
        Object[] objArr2 = new Object[iM52905q];
        int i2 = iM52905q - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            qkf1.m73079G(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iM85775y = vjf1.m85775y(iHashCode);
            while (true) {
                int i6 = iM85775y & i2;
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
                iM85775y++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new gdg1(obj4);
        }
        if (m52905q(i4) < iM52905q / 2) {
            return m52907s(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new bdg1(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jbg1) && (this instanceof bdg1) && (((jbg1) obj) instanceof bdg1) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
