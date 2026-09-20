package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final axc1 f234626a;

    /* JADX INFO: renamed from: b */
    public final String f234627b;

    public uwc1(axc1 axc1Var, String str) {
        this.f234626a = axc1Var;
        this.f234627b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwc1)) {
            return false;
        }
        uwc1 uwc1Var = (uwc1) obj;
        return wj50.m88271j(this.f234626a, uwc1Var.f234626a) && wj50.m88271j(this.f234627b, uwc1Var.f234627b);
    }

    public final int hashCode() {
        return this.f234627b.hashCode() + (this.f234626a.hashCode() * 31);
    }
}
