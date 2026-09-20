package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nj9 {

    /* JADX INFO: renamed from: a */
    public final long f154529a;

    public nj9(long j) {
        this.f154529a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj9)) {
            return false;
        }
        long j = ((nj9) obj).f154529a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f154529a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f154529a);
    }
}
