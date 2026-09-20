package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bai extends nai {

    /* JADX INFO: renamed from: a */
    public final long f25204a;

    public bai(long j) {
        this.f25204a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bai) && this.f25204a == ((bai) obj).f25204a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25204a);
    }
}
