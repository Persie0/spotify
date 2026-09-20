package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ccz0 implements dcz0 {

    /* JADX INFO: renamed from: a */
    public final long f36687a;

    public ccz0(long j) {
        this.f36687a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccz0) && this.f36687a == ((ccz0) obj).f36687a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36687a);
    }
}
