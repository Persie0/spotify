package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jte1 {

    /* JADX INFO: renamed from: a */
    public final int f115853a;

    /* JADX INFO: renamed from: b */
    public final String f115854b;

    public jte1(int i, String str) {
        this.f115853a = i;
        this.f115854b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jte1)) {
            return false;
        }
        jte1 jte1Var = (jte1) obj;
        return this.f115853a == jte1Var.f115853a && wj50.m88271j(this.f115854b, jte1Var.f115854b);
    }

    public final int hashCode() {
        return this.f115854b.hashCode() + (Integer.hashCode(this.f115853a) * 31);
    }
}
