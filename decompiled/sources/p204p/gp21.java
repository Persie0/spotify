package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gp21 {

    /* JADX INFO: renamed from: a */
    public final lq21 f83065a;

    /* JADX INFO: renamed from: b */
    public final String f83066b;

    /* JADX INFO: renamed from: c */
    public final gh00 f83067c;

    public gp21(lq21 lq21Var, String str, gh00 gh00Var) {
        this.f83065a = lq21Var;
        this.f83066b = str;
        this.f83067c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp21)) {
            return false;
        }
        gp21 gp21Var = (gp21) obj;
        return wj50.m88271j(this.f83065a, gp21Var.f83065a) && wj50.m88271j(this.f83066b, gp21Var.f83066b) && wj50.m88271j(this.f83067c, gp21Var.f83067c);
    }

    public final int hashCode() {
        return this.f83067c.hashCode() + s571.m77243b(this.f83065a.hashCode() * 31, 31, this.f83066b);
    }
}
