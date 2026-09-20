package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d2s0 {

    /* JADX INFO: renamed from: a */
    public final long f44666a;

    public d2s0(long j) {
        this.f44666a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2s0) && this.f44666a == ((d2s0) obj).f44666a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44666a);
    }
}
