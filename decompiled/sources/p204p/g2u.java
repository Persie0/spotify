package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g2u extends th1 {

    /* JADX INFO: renamed from: h */
    public final int f76008h;

    public g2u(int i) {
        this.f76008h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2u) && this.f76008h == ((g2u) obj).f76008h;
    }

    public final int hashCode() {
        return edb.m38547C(this.f76008h);
    }
}
