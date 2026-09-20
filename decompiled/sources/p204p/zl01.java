package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zl01 implements am01 {

    /* JADX INFO: renamed from: a */
    public final long f283886a;

    public zl01(long j) {
        this.f283886a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl01) && this.f283886a == ((zl01) obj).f283886a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f283886a);
    }
}
