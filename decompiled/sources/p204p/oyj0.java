package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oyj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f171779a;

    /* JADX INFO: renamed from: b */
    public final String f171780b;

    /* JADX INFO: renamed from: c */
    public final gyj0 f171781c;

    public oyj0(boolean z, String str, gyj0 gyj0Var) {
        this.f171779a = z;
        this.f171780b = str;
        this.f171781c = gyj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyj0)) {
            return false;
        }
        oyj0 oyj0Var = (oyj0) obj;
        return this.f171779a == oyj0Var.f171779a && wj50.m88271j(this.f171780b, oyj0Var.f171780b) && this.f171781c == oyj0Var.f171781c;
    }

    public final int hashCode() {
        return this.f171781c.hashCode() + s571.m77243b(Boolean.hashCode(this.f171779a) * 31, 31, this.f171780b);
    }
}
