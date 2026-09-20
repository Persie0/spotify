package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ip51 implements pp51 {

    /* JADX INFO: renamed from: a */
    public final gp51 f104387a;

    /* JADX INFO: renamed from: b */
    public final gp51 f104388b;

    /* JADX INFO: renamed from: c */
    public final boolean f104389c;

    /* JADX INFO: renamed from: d */
    public final String f104390d;

    public ip51(gp51 gp51Var, gp51 gp51Var2, boolean z, String str) {
        this.f104387a = gp51Var;
        this.f104388b = gp51Var2;
        this.f104389c = z;
        this.f104390d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip51)) {
            return false;
        }
        ip51 ip51Var = (ip51) obj;
        return wj50.m88271j(this.f104387a, ip51Var.f104387a) && wj50.m88271j(this.f104388b, ip51Var.f104388b) && this.f104389c == ip51Var.f104389c && wj50.m88271j(this.f104390d, ip51Var.f104390d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f104388b.hashCode() + (this.f104387a.hashCode() * 31)) * 31, 31, this.f104389c);
        String str = this.f104390d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
