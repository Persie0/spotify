package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hc00 {

    /* JADX INFO: renamed from: a */
    public final int f89651a;

    public hc00(int i) {
        this.f89651a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc00) && this.f89651a == ((hc00) obj).f89651a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f89651a);
    }
}
