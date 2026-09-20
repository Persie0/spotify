package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ijo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final k3w f102857a;

    /* JADX INFO: renamed from: b */
    public final boolean f102858b;

    /* JADX INFO: renamed from: c */
    public final long f102859c;

    public ijo0(k3w k3wVar, boolean z, long j) {
        this.f102857a = k3wVar;
        this.f102858b = z;
        this.f102859c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijo0)) {
            return false;
        }
        ijo0 ijo0Var = (ijo0) obj;
        return wj50.m88271j(this.f102857a, ijo0Var.f102857a) && this.f102858b == ijo0Var.f102858b && this.f102859c == ijo0Var.f102859c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f102859c) + s571.m77245d(this.f102857a.hashCode() * 31, 31, this.f102858b);
    }
}
