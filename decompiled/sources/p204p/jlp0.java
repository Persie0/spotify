package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jlp0 {

    /* JADX INFO: renamed from: a */
    public final String f113663a;

    /* JADX INFO: renamed from: b */
    public final String f113664b;

    public jlp0(String str, String str2) {
        this.f113663a = str;
        this.f113664b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlp0)) {
            return false;
        }
        jlp0 jlp0Var = (jlp0) obj;
        return wj50.m88271j(this.f113663a, jlp0Var.f113663a) && wj50.m88271j(this.f113664b, jlp0Var.f113664b);
    }

    public final int hashCode() {
        return this.f113664b.hashCode() + (this.f113663a.hashCode() * 31);
    }
}
