package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class meb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final String f142648a;

    /* JADX INFO: renamed from: b */
    public final String f142649b;

    /* JADX INFO: renamed from: c */
    public final String f142650c;

    /* JADX INFO: renamed from: d */
    public final String f142651d;

    /* JADX INFO: renamed from: e */
    public final eta1 f142652e;

    public meb0(String str, String str2, String str3, String str4, eta1 eta1Var) {
        this.f142648a = str;
        this.f142649b = str2;
        this.f142650c = str3;
        this.f142651d = str4;
        this.f142652e = eta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meb0)) {
            return false;
        }
        meb0 meb0Var = (meb0) obj;
        return wj50.m88271j(this.f142648a, meb0Var.f142648a) && wj50.m88271j(this.f142649b, meb0Var.f142649b) && wj50.m88271j(this.f142650c, meb0Var.f142650c) && wj50.m88271j(this.f142651d, meb0Var.f142651d) && wj50.m88271j(this.f142652e, meb0Var.f142652e);
    }

    public final int hashCode() {
        return this.f142652e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f142648a.hashCode() * 31, 31, this.f142649b), 31, this.f142650c), 31, this.f142651d);
    }
}
