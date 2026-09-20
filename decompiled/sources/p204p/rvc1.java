package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rvc1 implements uvc1 {

    /* JADX INFO: renamed from: a */
    public final long f203063a;

    public rvc1(long j) {
        this.f203063a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvc1) && this.f203063a == ((rvc1) obj).f203063a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f203063a);
    }
}
