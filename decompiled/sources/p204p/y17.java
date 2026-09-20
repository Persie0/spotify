package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y17 {

    /* JADX INFO: renamed from: a */
    public final String f268189a;

    /* JADX INFO: renamed from: b */
    public final x17 f268190b;

    public y17(String str, x17 x17Var) {
        this.f268189a = str;
        this.f268190b = x17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y17)) {
            return false;
        }
        y17 y17Var = (y17) obj;
        return wj50.m88271j(this.f268189a, y17Var.f268189a) && wj50.m88271j(this.f268190b, y17Var.f268190b);
    }

    public final int hashCode() {
        int iHashCode = this.f268189a.hashCode() * 31;
        x17 x17Var = this.f268190b;
        return iHashCode + (x17Var == null ? 0 : x17Var.hashCode());
    }
}
