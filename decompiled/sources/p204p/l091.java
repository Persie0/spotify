package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l091 implements n091 {

    /* JADX INFO: renamed from: a */
    public final long f128338a;

    public l091(long j) {
        this.f128338a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l091) && this.f128338a == ((l091) obj).f128338a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f128338a);
    }
}
