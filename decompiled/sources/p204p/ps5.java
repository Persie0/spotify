package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ps5 {

    /* JADX INFO: renamed from: a */
    public final String f180749a;

    /* JADX INFO: renamed from: b */
    public final String f180750b;

    /* JADX INFO: renamed from: c */
    public final String f180751c;

    /* JADX INFO: renamed from: d */
    public final String f180752d;

    /* JADX INFO: renamed from: e */
    public final String f180753e;

    public ps5(String str, String str2, String str3, String str4, String str5) {
        this.f180749a = str;
        this.f180750b = str2;
        this.f180751c = str3;
        this.f180752d = str4;
        this.f180753e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps5)) {
            return false;
        }
        ps5 ps5Var = (ps5) obj;
        return wj50.m88271j(this.f180749a, ps5Var.f180749a) && wj50.m88271j(this.f180750b, ps5Var.f180750b) && wj50.m88271j(this.f180751c, ps5Var.f180751c) && wj50.m88271j(this.f180752d, ps5Var.f180752d) && wj50.m88271j(this.f180753e, ps5Var.f180753e);
    }

    public final int hashCode() {
        return this.f180753e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f180749a.hashCode() * 31, 31, this.f180750b), 31, this.f180751c), 31, this.f180752d);
    }
}
