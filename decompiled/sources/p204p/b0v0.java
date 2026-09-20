package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b0v0 {

    /* JADX INFO: renamed from: a */
    public final int f22110a;

    /* JADX INFO: renamed from: b */
    public final String f22111b;

    /* JADX INFO: renamed from: c */
    public final long f22112c;

    public b0v0(long j, int i, String str) {
        this.f22110a = i;
        this.f22111b = str;
        this.f22112c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0v0)) {
            return false;
        }
        b0v0 b0v0Var = (b0v0) obj;
        return this.f22110a == b0v0Var.f22110a && wj50.m88271j(this.f22111b, b0v0Var.f22111b) && this.f22112c == b0v0Var.f22112c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22112c) + s571.m77243b(Integer.hashCode(this.f22110a) * 31, 31, this.f22111b);
    }
}
