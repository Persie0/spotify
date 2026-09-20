package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sfm0 {

    /* JADX INFO: renamed from: a */
    public final rfm0 f208615a;

    /* JADX INFO: renamed from: b */
    public final String f208616b;

    /* JADX INFO: renamed from: c */
    public final ppr f208617c;

    public sfm0(rfm0 rfm0Var, String str, ppr pprVar) {
        this.f208615a = rfm0Var;
        this.f208616b = str;
        this.f208617c = pprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfm0)) {
            return false;
        }
        sfm0 sfm0Var = (sfm0) obj;
        return wj50.m88271j(this.f208615a, sfm0Var.f208615a) && wj50.m88271j(this.f208616b, sfm0Var.f208616b) && wj50.m88271j(this.f208617c, sfm0Var.f208617c);
    }

    public final int hashCode() {
        return this.f208617c.hashCode() + s571.m77243b(this.f208615a.hashCode() * 31, 31, this.f208616b);
    }
}
