package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vj9 {

    /* JADX INFO: renamed from: a */
    public final long f241922a;

    public vj9(long j) {
        this.f241922a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj9)) {
            return false;
        }
        long j = ((vj9) obj).f241922a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f241922a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f241922a);
    }
}
