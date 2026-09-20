package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w1i {

    /* JADX INFO: renamed from: a */
    public final long f247103a;

    public w1i(long j) {
        this.f247103a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1i) && this.f247103a == ((w1i) obj).f247103a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f247103a);
    }
}
