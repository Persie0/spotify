package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ksc0 implements msc0 {

    /* JADX INFO: renamed from: a */
    public final gtc0 f125929a;

    public ksc0(gtc0 gtc0Var) {
        this.f125929a = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksc0) && wj50.m88271j(this.f125929a, ((ksc0) obj).f125929a);
    }

    public final int hashCode() {
        gtc0 gtc0Var = this.f125929a;
        if (gtc0Var == null) {
            return 0;
        }
        return gtc0Var.hashCode();
    }
}
