package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ajm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f16289a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f16290b;

    public ajm0(String str, gkm0 gkm0Var) {
        this.f16289a = str;
        this.f16290b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajm0)) {
            return false;
        }
        ajm0 ajm0Var = (ajm0) obj;
        return wj50.m88271j(this.f16289a, ajm0Var.f16289a) && wj50.m88271j(this.f16290b, ajm0Var.f16290b);
    }

    public final int hashCode() {
        return this.f16290b.hashCode() + (this.f16289a.hashCode() * 31);
    }
}
