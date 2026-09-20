package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oem0 implements pem0 {

    /* JADX INFO: renamed from: a */
    public final afm0 f164476a;

    public oem0(afm0 afm0Var) {
        this.f164476a = afm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oem0) && wj50.m88271j(this.f164476a, ((oem0) obj).f164476a);
    }

    public final int hashCode() {
        afm0 afm0Var = this.f164476a;
        if (afm0Var == null) {
            return 0;
        }
        return afm0Var.hashCode();
    }
}
