package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f113057a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f113058b;

    public jjm0(String str, gkm0 gkm0Var) {
        this.f113057a = str;
        this.f113058b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjm0)) {
            return false;
        }
        jjm0 jjm0Var = (jjm0) obj;
        return wj50.m88271j(this.f113057a, jjm0Var.f113057a) && wj50.m88271j(this.f113058b, jjm0Var.f113058b);
    }

    public final int hashCode() {
        return this.f113058b.hashCode() + (this.f113057a.hashCode() * 31);
    }
}
