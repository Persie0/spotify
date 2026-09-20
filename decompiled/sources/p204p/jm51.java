package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jm51 implements km51 {

    /* JADX INFO: renamed from: a */
    public final String f113766a;

    /* JADX INFO: renamed from: b */
    public final String f113767b;

    public jm51(String str, String str2) {
        this.f113766a = str;
        this.f113767b = str2;
    }

    @Override // p204p.km51
    /* JADX INFO: renamed from: a */
    public final String mo51052a() {
        return this.f113767b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm51)) {
            return false;
        }
        jm51 jm51Var = (jm51) obj;
        return wj50.m88271j(this.f113766a, jm51Var.f113766a) && wj50.m88271j(this.f113767b, jm51Var.f113767b);
    }

    @Override // p204p.km51
    public final String getUri() {
        return this.f113766a;
    }

    public final int hashCode() {
        return this.f113767b.hashCode() + (this.f113766a.hashCode() * 31);
    }
}
