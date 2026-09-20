package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final int f226887a;

    public u530(int i) {
        this.f226887a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m82378a() {
        return this.f226887a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u530) && this.f226887a == ((u530) obj).f226887a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f226887a);
    }
}
