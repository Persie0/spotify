package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gsc0 implements isc0 {

    /* JADX INFO: renamed from: a */
    public final gtc0 f83935a;

    public gsc0(gtc0 gtc0Var) {
        this.f83935a = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsc0) && wj50.m88271j(this.f83935a, ((gsc0) obj).f83935a);
    }

    public final int hashCode() {
        gtc0 gtc0Var = this.f83935a;
        if (gtc0Var == null) {
            return 0;
        }
        return gtc0Var.hashCode();
    }
}
