package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aa01 implements ca01 {

    /* JADX INFO: renamed from: a */
    public final qe70 f13701a;

    /* JADX INFO: renamed from: b */
    public final qe70 f13702b;

    /* JADX WARN: Multi-variable type inference failed */
    public aa01(gh00 gh00Var, th00 th00Var) {
        this.f13701a = (qe70) gh00Var;
        this.f13702b = (qe70) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa01)) {
            return false;
        }
        aa01 aa01Var = (aa01) obj;
        return this.f13701a.equals(aa01Var.f13701a) && this.f13702b.equals(aa01Var.f13702b);
    }

    public final int hashCode() {
        return this.f13702b.hashCode() + (this.f13701a.hashCode() * 31);
    }
}
