package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class djf implements ejf {

    /* JADX INFO: renamed from: a */
    public final int f49679a;

    /* JADX INFO: renamed from: b */
    public final int f49680b;

    public djf(int i, int i2) {
        this.f49679a = i;
        this.f49680b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djf)) {
            return false;
        }
        djf djfVar = (djf) obj;
        return this.f49679a == djfVar.f49679a && this.f49680b == djfVar.f49680b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49680b) + (Integer.hashCode(this.f49679a) * 31);
    }
}
