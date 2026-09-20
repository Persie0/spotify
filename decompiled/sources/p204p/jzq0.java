package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jzq0 implements kzq0 {

    /* JADX INFO: renamed from: a */
    public final kl70 f117777a;

    /* JADX INFO: renamed from: b */
    public final String f117778b;

    public jzq0(kl70 kl70Var, String str) {
        this.f117777a = kl70Var;
        this.f117778b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzq0)) {
            return false;
        }
        jzq0 jzq0Var = (jzq0) obj;
        return wj50.m88271j(this.f117777a, jzq0Var.f117777a) && wj50.m88271j(this.f117778b, jzq0Var.f117778b);
    }

    @Override // p204p.kzq0
    public final String getUri() {
        return this.f117778b;
    }

    public final int hashCode() {
        return this.f117778b.hashCode() + (this.f117777a.hashCode() * 31);
    }
}
