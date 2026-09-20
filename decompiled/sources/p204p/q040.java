package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q040 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final zam0 f183901a;

    /* JADX INFO: renamed from: b */
    public final voc1 f183902b;

    /* JADX INFO: renamed from: c */
    public final afm0 f183903c;

    public q040(zam0 zam0Var, voc1 voc1Var, afm0 afm0Var) {
        this.f183901a = zam0Var;
        this.f183902b = voc1Var;
        this.f183903c = afm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q040)) {
            return false;
        }
        q040 q040Var = (q040) obj;
        return wj50.m88271j(this.f183901a, q040Var.f183901a) && wj50.m88271j(this.f183902b, q040Var.f183902b) && wj50.m88271j(this.f183903c, q040Var.f183903c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f183901a.hashCode() * 31, 31, this.f183902b.f243453a);
        afm0 afm0Var = this.f183903c;
        return iM77243b + (afm0Var == null ? 0 : afm0Var.hashCode());
    }
}
