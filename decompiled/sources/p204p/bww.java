package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bww implements w1x {

    /* JADX INFO: renamed from: a */
    public final int f31737a;

    /* JADX INFO: renamed from: b */
    public final float f31738b;

    public bww(int i, float f) {
        this.f31737a = i;
        this.f31738b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bww)) {
            return false;
        }
        bww bwwVar = (bww) obj;
        return this.f31737a == bwwVar.f31737a && Float.compare(this.f31738b, bwwVar.f31738b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31738b) + (edb.m38547C(this.f31737a) * 31);
    }
}
