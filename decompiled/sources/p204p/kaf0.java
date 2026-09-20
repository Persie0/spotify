package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kaf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final long f120893b;

    public kaf0(long j) {
        super(false);
        this.f120893b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kaf0) && this.f120893b == ((kaf0) obj).f120893b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f120893b);
    }
}
