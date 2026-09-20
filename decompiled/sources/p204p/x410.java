package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x410 {

    /* JADX INFO: renamed from: a */
    public final long f257927a;

    public x410(long j) {
        this.f257927a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x410) && this.f257927a == ((x410) obj).f257927a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257927a);
    }
}
