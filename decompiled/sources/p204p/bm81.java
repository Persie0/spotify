package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bm81 {

    /* JADX INFO: renamed from: a */
    public final long f28467a;

    /* JADX INFO: renamed from: b */
    public final long f28468b;

    public bm81(long j, long j2) {
        this.f28467a = j;
        this.f28468b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm81)) {
            return false;
        }
        bm81 bm81Var = (bm81) obj;
        return this.f28467a == bm81Var.f28467a && this.f28468b == bm81Var.f28468b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28468b) + (Long.hashCode(this.f28467a) * 31);
    }
}
