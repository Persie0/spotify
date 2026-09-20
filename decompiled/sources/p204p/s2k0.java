package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s2k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final String f205025a;

    /* JADX INFO: renamed from: b */
    public final iz50 f205026b;

    public s2k0(String str, iz50 iz50Var) {
        this.f205025a = str;
        this.f205026b = iz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2k0)) {
            return false;
        }
        s2k0 s2k0Var = (s2k0) obj;
        return wj50.m88271j(this.f205025a, s2k0Var.f205025a) && this.f205026b == s2k0Var.f205026b;
    }

    public final int hashCode() {
        return this.f205026b.hashCode() + (this.f205025a.hashCode() * 31);
    }
}
