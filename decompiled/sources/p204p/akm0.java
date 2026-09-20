package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class akm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f16604a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f16605b;

    public akm0(String str, gkm0 gkm0Var) {
        this.f16604a = str;
        this.f16605b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akm0)) {
            return false;
        }
        akm0 akm0Var = (akm0) obj;
        return wj50.m88271j(this.f16604a, akm0Var.f16604a) && wj50.m88271j(this.f16605b, akm0Var.f16605b);
    }

    public final int hashCode() {
        return this.f16605b.hashCode() + (this.f16604a.hashCode() * 31);
    }
}
