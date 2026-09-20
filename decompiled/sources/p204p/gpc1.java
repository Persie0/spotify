package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gpc1 implements g3u {

    /* JADX INFO: renamed from: a */
    public final fh0 f83168a;

    /* JADX INFO: renamed from: b */
    public final long f83169b;

    public gpc1(fh0 fh0Var, long j) {
        this.f83168a = fh0Var;
        this.f83169b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpc1)) {
            return false;
        }
        gpc1 gpc1Var = (gpc1) obj;
        return wj50.m88271j(this.f83168a, gpc1Var.f83168a) && g450.m43520b(this.f83169b, gpc1Var.f83169b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f83169b) + (this.f83168a.hashCode() * 31);
    }
}
