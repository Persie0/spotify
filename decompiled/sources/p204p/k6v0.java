package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k6v0 extends o6v0 {

    /* JADX INFO: renamed from: a */
    public final int f119848a;

    /* JADX INFO: renamed from: b */
    public final pxj f119849b;

    public k6v0(int i, pxj pxjVar) {
        this.f119848a = i;
        this.f119849b = pxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6v0)) {
            return false;
        }
        k6v0 k6v0Var = (k6v0) obj;
        return this.f119848a == k6v0Var.f119848a && this.f119849b == k6v0Var.f119849b;
    }

    public final int hashCode() {
        return this.f119849b.hashCode() + (Integer.hashCode(this.f119848a) * 31);
    }
}
