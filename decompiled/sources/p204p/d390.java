package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d390 implements e390 {

    /* JADX INFO: renamed from: a */
    public final int f44814a;

    public d390(int i) {
        this.f44814a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d390) && this.f44814a == ((d390) obj).f44814a;
    }

    @Override // p204p.e390
    public final int getReason() {
        return this.f44814a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f44814a);
    }
}
