package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xm31 {

    /* JADX INFO: renamed from: a */
    public final String f263280a;

    /* JADX INFO: renamed from: b */
    public final String f263281b;

    /* JADX INFO: renamed from: c */
    public final n6f f263282c;

    public xm31(String str, String str2, n6f n6fVar) {
        this.f263280a = str;
        this.f263281b = str2;
        this.f263282c = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm31)) {
            return false;
        }
        xm31 xm31Var = (xm31) obj;
        return wj50.m88271j(this.f263280a, xm31Var.f263280a) && wj50.m88271j(this.f263281b, xm31Var.f263281b) && wj50.m88271j(this.f263282c, xm31Var.f263282c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f263280a.hashCode() * 31, 31, this.f263281b);
        n6f n6fVar = this.f263282c;
        return iM77243b + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a));
    }
}
