package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m410 {

    /* JADX INFO: renamed from: a */
    public final long f139791a;

    public m410(long j) {
        this.f139791a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m410) && this.f139791a == ((m410) obj).f139791a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f139791a);
    }
}
