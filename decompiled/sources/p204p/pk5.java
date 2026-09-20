package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pk5 implements qk5 {

    /* JADX INFO: renamed from: a */
    public final String f178387a;

    /* JADX INFO: renamed from: b */
    public final String f178388b;

    /* JADX INFO: renamed from: c */
    public final String f178389c;

    public pk5(String str, String str2, String str3) {
        this.f178387a = str;
        this.f178388b = str2;
        this.f178389c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk5)) {
            return false;
        }
        pk5 pk5Var = (pk5) obj;
        return wj50.m88271j(this.f178387a, pk5Var.f178387a) && wj50.m88271j(this.f178388b, pk5Var.f178388b) && wj50.m88271j(this.f178389c, pk5Var.f178389c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f178387a.hashCode() * 31, 31, this.f178388b);
        String str = this.f178389c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
