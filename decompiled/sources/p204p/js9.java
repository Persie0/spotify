package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class js9 {

    /* JADX INFO: renamed from: a */
    public final String f115448a;

    /* JADX INFO: renamed from: b */
    public final ls9 f115449b;

    public js9(String str, ls9 ls9Var) {
        this.f115448a = str;
        this.f115449b = ls9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js9)) {
            return false;
        }
        js9 js9Var = (js9) obj;
        return wj50.m88271j(this.f115448a, js9Var.f115448a) && wj50.m88271j(this.f115449b, js9Var.f115449b);
    }

    public final int hashCode() {
        return this.f115449b.hashCode() + (this.f115448a.hashCode() * 31);
    }
}
