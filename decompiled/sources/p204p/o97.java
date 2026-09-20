package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o97 implements p97 {

    /* JADX INFO: renamed from: a */
    public final long f162951a;

    public o97(long j) {
        this.f162951a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o97) && this.f162951a == ((o97) obj).f162951a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f162951a);
    }
}
