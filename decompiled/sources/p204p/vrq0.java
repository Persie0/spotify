package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vrq0 {

    /* JADX INFO: renamed from: a */
    public final String f244240a;

    /* JADX INFO: renamed from: b */
    public final String f244241b;

    /* JADX INFO: renamed from: c */
    public final String f244242c;

    public vrq0(String str, String str2, String str3) {
        this.f244240a = str;
        this.f244241b = str2;
        this.f244242c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrq0)) {
            return false;
        }
        vrq0 vrq0Var = (vrq0) obj;
        return wj50.m88271j(this.f244240a, vrq0Var.f244240a) && wj50.m88271j(this.f244241b, vrq0Var.f244241b) && wj50.m88271j(this.f244242c, vrq0Var.f244242c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f244240a.hashCode() * 31, 31, this.f244241b);
        String str = this.f244242c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
