package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x79 {

    /* JADX INFO: renamed from: a */
    public final String f258854a;

    /* JADX INFO: renamed from: b */
    public final String f258855b;

    /* JADX INFO: renamed from: c */
    public final String f258856c;

    /* JADX INFO: renamed from: d */
    public final String f258857d;

    /* JADX INFO: renamed from: e */
    public final String f258858e;

    public x79(String str, String str2, String str3, String str4, String str5) {
        this.f258854a = str;
        this.f258855b = str2;
        this.f258856c = str3;
        this.f258857d = str4;
        this.f258858e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x79)) {
            return false;
        }
        x79 x79Var = (x79) obj;
        return wj50.m88271j(this.f258854a, x79Var.f258854a) && wj50.m88271j(this.f258855b, x79Var.f258855b) && wj50.m88271j(this.f258856c, x79Var.f258856c) && wj50.m88271j(this.f258857d, x79Var.f258857d) && wj50.m88271j(this.f258858e, x79Var.f258858e);
    }

    public final int hashCode() {
        return this.f258858e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f258854a.hashCode() * 31, 31, this.f258855b), 31, this.f258856c), 31, this.f258857d);
    }
}
