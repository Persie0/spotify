package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kmo0 implements lmo0 {

    /* JADX INFO: renamed from: a */
    public final long f124189a;

    public kmo0(long j) {
        this.f124189a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmo0)) {
            return false;
        }
        long j = ((kmo0) obj).f124189a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f124189a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f124189a);
    }
}
