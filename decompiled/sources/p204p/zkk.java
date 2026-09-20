package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zkk implements clk {

    /* JADX INFO: renamed from: a */
    public final String f283777a;

    /* JADX INFO: renamed from: b */
    public final qf40 f283778b;

    public zkk(String str, qf40 qf40Var) {
        this.f283777a = str;
        this.f283778b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkk)) {
            return false;
        }
        zkk zkkVar = (zkk) obj;
        return wj50.m88271j(this.f283777a, zkkVar.f283777a) && wj50.m88271j(this.f283778b, zkkVar.f283778b);
    }

    public final int hashCode() {
        return this.f283778b.hashCode() + (this.f283777a.hashCode() * 31);
    }
}
