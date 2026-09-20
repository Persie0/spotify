package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vib implements cjb {

    /* JADX INFO: renamed from: a */
    public final int f241662a;

    /* JADX INFO: renamed from: b */
    public final long f241663b;

    /* JADX INFO: renamed from: c */
    public final long f241664c;

    /* JADX INFO: renamed from: d */
    public final boolean f241665d;

    public vib(long j, long j2, boolean z, int i) {
        this.f241662a = i;
        this.f241663b = j;
        this.f241664c = j2;
        this.f241665d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vib)) {
            return false;
        }
        vib vibVar = (vib) obj;
        return this.f241662a == vibVar.f241662a && this.f241663b == vibVar.f241663b && this.f241664c == vibVar.f241664c && this.f241665d == vibVar.f241665d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241665d) + dq60.m36605e(dq60.m36605e(Integer.hashCode(this.f241662a) * 31, this.f241663b, 31), this.f241664c, 31);
    }
}
