package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h66 {

    /* JADX INFO: renamed from: a */
    public final String f88010a;

    /* JADX INFO: renamed from: b */
    public final hvf1 f88011b;

    public h66(String str, hvf1 hvf1Var) {
        this.f88010a = str;
        this.f88011b = hvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h66)) {
            return false;
        }
        h66 h66Var = (h66) obj;
        return wj50.m88271j(this.f88010a, h66Var.f88010a) && wj50.m88271j(this.f88011b, h66Var.f88011b);
    }

    public final int hashCode() {
        String str = this.f88010a;
        return this.f88011b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public /* synthetic */ h66(String str) {
        this(str, b66.f23844d);
    }
}
