package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l1a implements n1a {

    /* JADX INFO: renamed from: a */
    public final int f128663a;

    public l1a(int i) {
        this.f128663a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1a) && this.f128663a == ((l1a) obj).f128663a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f128663a);
    }
}
