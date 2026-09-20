package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z6r0 extends c7r0 {

    /* JADX INFO: renamed from: a */
    public final String f279976a;

    /* JADX INFO: renamed from: b */
    public final boolean f279977b;

    /* JADX INFO: renamed from: c */
    public final boolean f279978c;

    /* JADX INFO: renamed from: d */
    public final long f279979d;

    public z6r0(long j, String str, boolean z, boolean z2) {
        this.f279976a = str;
        this.f279977b = z;
        this.f279978c = z2;
        this.f279979d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6r0)) {
            return false;
        }
        z6r0 z6r0Var = (z6r0) obj;
        return wj50.m88271j(this.f279976a, z6r0Var.f279976a) && this.f279977b == z6r0Var.f279977b && this.f279978c == z6r0Var.f279978c && this.f279979d == z6r0Var.f279979d;
    }

    public final int hashCode() {
        String str = this.f279976a;
        return Long.hashCode(this.f279979d) + s571.m77245d(s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f279977b), 31, this.f279978c);
    }
}
