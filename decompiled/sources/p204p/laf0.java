package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class laf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final long f131339b;

    public laf0(long j) {
        super(false);
        this.f131339b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof laf0) && this.f131339b == ((laf0) obj).f131339b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131339b);
    }
}
