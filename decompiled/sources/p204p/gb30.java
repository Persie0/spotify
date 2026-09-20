package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gb30 {

    /* JADX INFO: renamed from: a */
    public final int f78180a;

    public gb30(int i) {
        this.f78180a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb30) && this.f78180a == ((gb30) obj).f78180a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f78180a);
    }
}
