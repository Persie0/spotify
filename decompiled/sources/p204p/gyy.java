package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gyy {

    /* JADX INFO: renamed from: a */
    public final int f85789a;

    /* JADX INFO: renamed from: b */
    public final float f85790b;

    public gyy(int i, float f) {
        this.f85789a = i;
        this.f85790b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyy)) {
            return false;
        }
        gyy gyyVar = (gyy) obj;
        return this.f85789a == gyyVar.f85789a && Float.compare(this.f85790b, gyyVar.f85790b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85790b) + (edb.m38547C(this.f85789a) * 31);
    }
}
