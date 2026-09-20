package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pq61 extends rq61 {

    /* JADX INFO: renamed from: a */
    public final int f180202a;

    public pq61(int i) {
        this.f180202a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq61) && this.f180202a == ((pq61) obj).f180202a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180202a);
    }
}
