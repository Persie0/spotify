package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final long f204042a;

    public rz21(long j) {
        this.f204042a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz21) && this.f204042a == ((rz21) obj).f204042a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f204042a);
    }
}
