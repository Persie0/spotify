package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nb90 {

    /* JADX INFO: renamed from: a */
    public final String f152220a;

    /* JADX INFO: renamed from: b */
    public final mb90 f152221b;

    public nb90(String str, mb90 mb90Var) {
        this.f152220a = str;
        this.f152221b = mb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb90)) {
            return false;
        }
        nb90 nb90Var = (nb90) obj;
        return wj50.m88271j(this.f152220a, nb90Var.f152220a) && wj50.m88271j(this.f152221b, nb90Var.f152221b);
    }

    public final int hashCode() {
        int iHashCode = this.f152220a.hashCode() * 31;
        mb90 mb90Var = this.f152221b;
        return iHashCode + (mb90Var == null ? 0 : mb90Var.hashCode());
    }
}
