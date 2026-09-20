package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z99 {

    /* JADX INFO: renamed from: a */
    public final String f280721a;

    /* JADX INFO: renamed from: b */
    public final int f280722b;

    public z99(String str, int i) {
        this.f280721a = str;
        this.f280722b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z99)) {
            return false;
        }
        z99 z99Var = (z99) obj;
        return wj50.m88271j(this.f280721a, z99Var.f280721a) && this.f280722b == z99Var.f280722b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280722b) + (this.f280721a.hashCode() * 31);
    }
}
