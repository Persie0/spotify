package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rcc1 implements xcc1 {

    /* JADX INFO: renamed from: a */
    public final long f197846a;

    public rcc1(long j) {
        this.f197846a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcc1) && this.f197846a == ((rcc1) obj).f197846a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f197846a);
    }
}
