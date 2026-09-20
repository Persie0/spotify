package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tyo0 implements yyo0 {

    /* JADX INFO: renamed from: a */
    public final long f225014a;

    public tyo0(long j) {
        this.f225014a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m81999a() {
        return this.f225014a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyo0) && this.f225014a == ((tyo0) obj).f225014a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f225014a);
    }
}
