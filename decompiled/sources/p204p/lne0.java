package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lne0 implements nne0 {

    /* JADX INFO: renamed from: a */
    public final long f135153a;

    public lne0(long j) {
        this.f135153a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lne0) && this.f135153a == ((lne0) obj).f135153a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135153a);
    }
}
