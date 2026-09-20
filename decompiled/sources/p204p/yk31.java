package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yk31 {

    /* JADX INFO: renamed from: a */
    public final xk31 f273562a;

    /* JADX INFO: renamed from: b */
    public final String f273563b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2524w8 f273564c;

    public yk31(xk31 xk31Var, String str, AbstractC2524w8 abstractC2524w8) {
        this.f273562a = xk31Var;
        this.f273563b = str;
        this.f273564c = abstractC2524w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk31)) {
            return false;
        }
        yk31 yk31Var = (yk31) obj;
        return wj50.m88271j(this.f273562a, yk31Var.f273562a) && wj50.m88271j(this.f273563b, yk31Var.f273563b) && wj50.m88271j(this.f273564c, yk31Var.f273564c);
    }

    public final int hashCode() {
        int iHashCode = this.f273562a.hashCode() * 31;
        String str = this.f273563b;
        return this.f273564c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
