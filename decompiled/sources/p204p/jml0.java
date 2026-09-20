package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jml0 {

    /* JADX INFO: renamed from: a */
    public final long f113904a;

    /* JADX INFO: renamed from: b */
    public final int f113905b;

    public jml0(int i, long j) {
        this.f113904a = j;
        this.f113905b = i;
    }

    /* JADX INFO: renamed from: a */
    public final long m53787a() {
        return this.f113904a;
    }

    /* JADX INFO: renamed from: b */
    public final int m53788b() {
        return this.f113905b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jml0)) {
            return false;
        }
        jml0 jml0Var = (jml0) obj;
        return this.f113904a == jml0Var.f113904a && this.f113905b == jml0Var.f113905b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113905b) + (Long.hashCode(this.f113904a) * 31);
    }
}
