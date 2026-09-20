package p204p;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class kfz {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f122246a;

    public kfz(SparseBooleanArray sparseBooleanArray) {
        this.f122246a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56305a(int... iArr) {
        for (int i : iArr) {
            if (this.f122246a.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m56306b(int i) {
        SparseBooleanArray sparseBooleanArray = this.f122246a;
        c95.m31847m(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kfz) {
            return this.f122246a.equals(((kfz) obj).f122246a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f122246a.hashCode();
    }
}
