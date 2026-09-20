package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class clm0 implements elm0 {

    /* JADX INFO: renamed from: a */
    public final long f39318a;

    public clm0(long j) {
        this.f39318a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clm0)) {
            return false;
        }
        long j = ((clm0) obj).f39318a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f39318a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f39318a);
    }
}
