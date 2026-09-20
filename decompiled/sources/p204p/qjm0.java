package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f189268a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f189269b;

    public qjm0(String str, gkm0 gkm0Var) {
        this.f189268a = str;
        this.f189269b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjm0)) {
            return false;
        }
        qjm0 qjm0Var = (qjm0) obj;
        return wj50.m88271j(this.f189268a, qjm0Var.f189268a) && wj50.m88271j(this.f189269b, qjm0Var.f189269b);
    }

    public final int hashCode() {
        return this.f189269b.hashCode() + (this.f189268a.hashCode() * 31);
    }
}
