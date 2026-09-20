package p204p;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class tvg1 extends oug1 implements Set {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f224160c = 0;

    /* JADX INFO: renamed from: b */
    public transient vug1 f224161b;

    /* JADX INFO: renamed from: j */
    public static int m81608j(int i) {
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

    /* JADX INFO: renamed from: n */
    public static tvg1 m81609n(int i, Object... objArr) {
        if (i == 0) {
            return fxg1.f74370t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new kxg1(obj);
        }
        int iM81608j = m81608j(i);
        Object[] objArr2 = new Object[iM81608j];
        int i2 = iM81608j - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            vsf1.m86314D(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iM39679O = epv0.m39679O(iHashCode);
            while (true) {
                int i6 = iM39679O & i2;
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
                iM39679O++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new kxg1(obj4);
        }
        if (m81608j(i4) < iM81608j / 2) {
            return m81609n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new fxg1(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tvg1) && (this instanceof fxg1) && (((tvg1) obj) instanceof fxg1) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zsf1.m96840K(this);
    }

    /* JADX INFO: renamed from: l */
    public final vug1 m81610l() {
        vug1 vug1Var = this.f224161b;
        if (vug1Var != null) {
            return vug1Var;
        }
        vug1 vug1VarMo43020m = mo43020m();
        this.f224161b = vug1VarMo43020m;
        return vug1VarMo43020m;
    }

    /* JADX INFO: renamed from: m */
    public vug1 mo43020m() {
        Object[] array = toArray(oug1.f170288a);
        rug1 rug1Var = vug1.f244947b;
        return vug1.m86422l(array.length, array);
    }
}
