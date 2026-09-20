package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kcq0 {

    /* JADX INFO: renamed from: a */
    public final String f121535a;

    /* JADX INFO: renamed from: b */
    public final String f121536b;

    public kcq0(String str, String str2) {
        this.f121535a = str;
        this.f121536b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcq0)) {
            return false;
        }
        kcq0 kcq0Var = (kcq0) obj;
        return wj50.m88271j(this.f121535a, kcq0Var.f121535a) && wj50.m88271j(this.f121536b, kcq0Var.f121536b);
    }

    public final int hashCode() {
        return this.f121536b.hashCode() + (this.f121535a.hashCode() * 31);
    }
}
