package p204p;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class kth extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator[] f126293a;

    public kth(dua duaVar, dua duaVar2) {
        this.f126293a = new Comparator[]{duaVar, duaVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f126293a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kth) {
            return Arrays.equals(this.f126293a, ((kth) obj).f126293a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f126293a);
    }

    public final String toString() {
        return dq60.m36616p(Arrays.toString(this.f126293a), ")", new StringBuilder("Ordering.compound("));
    }
}
