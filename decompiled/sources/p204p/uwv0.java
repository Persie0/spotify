package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uwv0 implements wwv0 {

    /* JADX INFO: renamed from: a */
    public final long f234742a;

    public uwv0(long j) {
        this.f234742a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwv0) && this.f234742a == ((uwv0) obj).f234742a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f234742a);
    }
}
