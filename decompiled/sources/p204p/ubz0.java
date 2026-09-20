package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ubz0 {

    /* JADX INFO: renamed from: a */
    public final String f228906a;

    /* JADX INFO: renamed from: b */
    public final boolean f228907b;

    /* JADX INFO: renamed from: c */
    public final x431 f228908c;

    /* JADX INFO: renamed from: d */
    public final long f228909d;

    public ubz0(String str, boolean z, x431 x431Var, long j) {
        this.f228906a = str;
        this.f228907b = z;
        this.f228908c = x431Var;
        this.f228909d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubz0)) {
            return false;
        }
        ubz0 ubz0Var = (ubz0) obj;
        return wj50.m88271j(this.f228906a, ubz0Var.f228906a) && this.f228907b == ubz0Var.f228907b && wj50.m88271j(this.f228908c, ubz0Var.f228908c) && this.f228909d == ubz0Var.f228909d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f228909d) + ((this.f228908c.hashCode() + s571.m77245d(this.f228906a.hashCode() * 31, 31, this.f228907b)) * 31);
    }
}
