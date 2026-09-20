package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dmh {

    /* JADX INFO: renamed from: a */
    public final int f50530a;

    /* JADX INFO: renamed from: b */
    public final int f50531b;

    public dmh(int i, int i2) {
        this.f50530a = i;
        this.f50531b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmh)) {
            return false;
        }
        dmh dmhVar = (dmh) obj;
        return this.f50530a == dmhVar.f50530a && this.f50531b == dmhVar.f50531b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50531b) + (Integer.hashCode(this.f50530a) * 31);
    }
}
