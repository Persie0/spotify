package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n010 {

    /* JADX INFO: renamed from: a */
    public final String f148855a;

    /* JADX INFO: renamed from: b */
    public final k590 f148856b;

    public n010(String str, k590 k590Var) {
        this.f148855a = str;
        this.f148856b = k590Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n010)) {
            return false;
        }
        n010 n010Var = (n010) obj;
        return wj50.m88271j(this.f148855a, n010Var.f148855a) && this.f148856b == n010Var.f148856b;
    }

    public final int hashCode() {
        String str = this.f148855a;
        return this.f148856b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
