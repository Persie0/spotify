package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tad1 {

    /* JADX INFO: renamed from: a */
    public final String f218556a;

    /* JADX INFO: renamed from: b */
    public final String f218557b;

    /* JADX INFO: renamed from: c */
    public final String f218558c;

    public tad1(String str, String str2, String str3) {
        this.f218556a = str;
        this.f218557b = str2;
        this.f218558c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tad1)) {
            return false;
        }
        tad1 tad1Var = (tad1) obj;
        return wj50.m88271j(this.f218556a, tad1Var.f218556a) && wj50.m88271j(this.f218557b, tad1Var.f218557b) && wj50.m88271j(this.f218558c, tad1Var.f218558c);
    }

    public final int hashCode() {
        return this.f218558c.hashCode() + s571.m77243b(this.f218556a.hashCode() * 31, 31, this.f218557b);
    }
}
