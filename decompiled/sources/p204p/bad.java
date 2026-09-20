package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bad implements lad {

    /* JADX INFO: renamed from: a */
    public final ocl0 f25174a;

    /* JADX INFO: renamed from: b */
    public final long f25175b;

    public bad(ocl0 ocl0Var, long j) {
        this.f25174a = ocl0Var;
        this.f25175b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bad)) {
            return false;
        }
        bad badVar = (bad) obj;
        return wj50.m88271j(this.f25174a, badVar.f25174a) && this.f25175b == badVar.f25175b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25175b) + (this.f25174a.hashCode() * 31);
    }
}
