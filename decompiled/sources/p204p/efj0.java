package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class efj0 {

    /* JADX INFO: renamed from: a */
    public final String f59058a;

    /* JADX INFO: renamed from: b */
    public final xul0 f59059b;

    public efj0(String str, xul0 xul0Var) {
        this.f59058a = str;
        this.f59059b = xul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efj0)) {
            return false;
        }
        efj0 efj0Var = (efj0) obj;
        return wj50.m88271j(this.f59058a, efj0Var.f59058a) && wj50.m88271j(this.f59059b, efj0Var.f59059b);
    }

    public final int hashCode() {
        return this.f59059b.hashCode() + (this.f59058a.hashCode() * 31);
    }
}
