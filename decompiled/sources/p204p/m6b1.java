package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m6b1 {

    /* JADX INFO: renamed from: a */
    public final long f140457a;

    public m6b1(long j) {
        this.f140457a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6b1) && this.f140457a == ((m6b1) obj).f140457a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f140457a);
    }
}
