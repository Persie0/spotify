package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gr11 {

    /* JADX INFO: renamed from: a */
    public final long f83599a;

    public gr11(long j) {
        this.f83599a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr11) && this.f83599a == ((gr11) obj).f83599a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f83599a);
    }
}
