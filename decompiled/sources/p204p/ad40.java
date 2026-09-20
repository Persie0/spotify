package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ad40 {

    /* JADX INFO: renamed from: a */
    public final String f14515a;

    /* JADX INFO: renamed from: b */
    public final int f14516b;

    /* JADX INFO: renamed from: c */
    public final int f14517c;

    public ad40(String str, int i, int i2) {
        this.f14515a = str;
        this.f14516b = i;
        this.f14517c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad40)) {
            return false;
        }
        ad40 ad40Var = (ad40) obj;
        return wj50.m88271j(this.f14515a, ad40Var.f14515a) && this.f14516b == ad40Var.f14516b && this.f14517c == ad40Var.f14517c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14517c) + mt60.m62800g(this.f14516b, this.f14515a.hashCode() * 31, 31);
    }
}
