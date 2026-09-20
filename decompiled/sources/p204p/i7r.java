package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i7r implements j7r {

    /* JADX INFO: renamed from: a */
    public final Throwable f99610a;

    public i7r(Throwable th) {
        this.f99610a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7r) && wj50.m88271j(this.f99610a, ((i7r) obj).f99610a);
    }

    public final int hashCode() {
        return this.f99610a.hashCode();
    }
}
