package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g6w extends h6w {

    /* JADX INFO: renamed from: a */
    public final String f77126a;

    /* JADX INFO: renamed from: b */
    public final boolean f77127b;

    /* JADX INFO: renamed from: c */
    public final long f77128c;

    /* JADX INFO: renamed from: d */
    public final long f77129d;

    public g6w(long j, long j2, String str, boolean z) {
        this.f77126a = str;
        this.f77127b = z;
        this.f77128c = j;
        this.f77129d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6w)) {
            return false;
        }
        g6w g6wVar = (g6w) obj;
        return wj50.m88271j(this.f77126a, g6wVar.f77126a) && this.f77127b == g6wVar.f77127b && this.f77128c == g6wVar.f77128c && this.f77129d == g6wVar.f77129d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77129d) + dq60.m36605e(s571.m77245d(this.f77126a.hashCode() * 31, 31, this.f77127b), this.f77128c, 31);
    }
}
