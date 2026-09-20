package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l10 {

    /* JADX INFO: renamed from: a */
    public final String f128555a;

    /* JADX INFO: renamed from: b */
    public final String f128556b;

    /* JADX INFO: renamed from: c */
    public final String f128557c;

    public l10(String str, String str2, String str3) {
        this.f128555a = str;
        this.f128556b = str2;
        this.f128557c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return wj50.m88271j(this.f128555a, l10Var.f128555a) && wj50.m88271j(this.f128556b, l10Var.f128556b) && wj50.m88271j(this.f128557c, l10Var.f128557c);
    }

    public final int hashCode() {
        return this.f128557c.hashCode() + s571.m77243b(this.f128555a.hashCode() * 31, 31, this.f128556b);
    }
}
