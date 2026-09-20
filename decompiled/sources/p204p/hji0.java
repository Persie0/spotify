package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hji0 implements kji0 {

    /* JADX INFO: renamed from: a */
    public final String f92059a;

    /* JADX INFO: renamed from: b */
    public final String f92060b;

    public hji0(String str, String str2) {
        this.f92059a = str;
        this.f92060b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hji0)) {
            return false;
        }
        hji0 hji0Var = (hji0) obj;
        return wj50.m88271j(this.f92059a, hji0Var.f92059a) && wj50.m88271j(this.f92060b, hji0Var.f92060b);
    }

    public final int hashCode() {
        return this.f92060b.hashCode() + (this.f92059a.hashCode() * 31);
    }
}
