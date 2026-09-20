package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class udr0 {

    /* JADX INFO: renamed from: a */
    public final ax50 f229300a;

    public udr0(ax50 ax50Var) {
        this.f229300a = ax50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udr0) && wj50.m88271j(this.f229300a, ((udr0) obj).f229300a);
    }

    public final int hashCode() {
        ax50 ax50Var = this.f229300a;
        if (ax50Var == null) {
            return 0;
        }
        return ax50Var.hashCode();
    }
}
