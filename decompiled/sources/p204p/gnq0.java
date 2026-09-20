package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gnq0 implements nnq0 {

    /* JADX INFO: renamed from: a */
    public final String f82768a;

    /* JADX INFO: renamed from: b */
    public final String f82769b;

    /* JADX INFO: renamed from: c */
    public final boolean f82770c;

    /* JADX INFO: renamed from: d */
    public final x9r0 f82771d;

    public gnq0(String str, String str2, x9r0 x9r0Var, boolean z) {
        this.f82768a = str;
        this.f82769b = str2;
        this.f82770c = z;
        this.f82771d = x9r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnq0)) {
            return false;
        }
        gnq0 gnq0Var = (gnq0) obj;
        return wj50.m88271j(this.f82768a, gnq0Var.f82768a) && wj50.m88271j(this.f82769b, gnq0Var.f82769b) && this.f82770c == gnq0Var.f82770c && wj50.m88271j(this.f82771d, gnq0Var.f82771d);
    }

    public final int hashCode() {
        String str = this.f82768a;
        int iM77245d = s571.m77245d(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 961, this.f82769b), 31, this.f82770c);
        x9r0 x9r0Var = this.f82771d;
        return iM77245d + (x9r0Var != null ? x9r0Var.hashCode() : 0);
    }
}
