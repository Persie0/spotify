package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f200053a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f200054b;

    public rkd(String str, xcl0 xcl0Var) {
        this.f200053a = str;
        this.f200054b = xcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkd)) {
            return false;
        }
        rkd rkdVar = (rkd) obj;
        return wj50.m88271j(this.f200053a, rkdVar.f200053a) && wj50.m88271j(this.f200054b, rkdVar.f200054b);
    }

    public final int hashCode() {
        return this.f200054b.hashCode() + (this.f200053a.hashCode() * 31);
    }
}
