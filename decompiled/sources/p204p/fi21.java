package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fi21 {

    /* JADX INFO: renamed from: a */
    public final gw4 f69759a;

    /* JADX INFO: renamed from: b */
    public long f69760b;

    public fi21(gw4 gw4Var, long j) {
        this.f69759a = gw4Var;
        this.f69760b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi21)) {
            return false;
        }
        fi21 fi21Var = (fi21) obj;
        return this.f69759a.equals(fi21Var.f69759a) && g450.m43520b(this.f69760b, fi21Var.f69760b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f69760b) + (this.f69759a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f69759a + ", startSize=" + ((Object) g450.m43521c(this.f69760b)) + ')';
    }
}
