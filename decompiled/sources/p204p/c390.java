package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c390 implements e390 {

    /* JADX INFO: renamed from: a */
    public final int f33610a;

    public c390(int i) {
        this.f33610a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c390) && this.f33610a == ((c390) obj).f33610a;
    }

    @Override // p204p.e390
    public final int getReason() {
        return this.f33610a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f33610a);
    }
}
