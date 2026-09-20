package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ztb1 {

    /* JADX INFO: renamed from: a */
    public final String f286132a;

    /* JADX INFO: renamed from: b */
    public final int f286133b;

    /* JADX INFO: renamed from: c */
    public final long f286134c;

    /* JADX INFO: renamed from: d */
    public final long f286135d;

    public ztb1(int i, long j, long j2, String str) {
        this.f286132a = str;
        this.f286133b = i;
        this.f286134c = j;
        this.f286135d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztb1)) {
            return false;
        }
        ztb1 ztb1Var = (ztb1) obj;
        return this.f286132a.equals(ztb1Var.f286132a) && this.f286133b == ztb1Var.f286133b && this.f286134c == ztb1Var.f286134c && this.f286135d == ztb1Var.f286135d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f286135d) + dq60.m36605e(f710.m40938f(this.f286133b, this.f286132a.hashCode() * 31, 31), this.f286134c, 31);
    }
}
