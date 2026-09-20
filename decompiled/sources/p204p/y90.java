package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y90 {

    /* JADX INFO: renamed from: a */
    public final String f270454a;

    /* JADX INFO: renamed from: b */
    public final String f270455b;

    /* JADX INFO: renamed from: c */
    public final int f270456c;

    /* JADX INFO: renamed from: d */
    public final boolean f270457d;

    /* JADX INFO: renamed from: e */
    public final eh00 f270458e;

    public y90(int i, String str, String str2, eh00 eh00Var, boolean z) {
        this.f270454a = str;
        this.f270455b = str2;
        this.f270456c = i;
        this.f270457d = z;
        this.f270458e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return wj50.m88271j(this.f270454a, y90Var.f270454a) && wj50.m88271j(this.f270455b, y90Var.f270455b) && this.f270456c == y90Var.f270456c && this.f270457d == y90Var.f270457d && wj50.m88271j(this.f270458e, y90Var.f270458e);
    }

    public final int hashCode() {
        return this.f270458e.hashCode() + s571.m77245d(mt60.m62800g(this.f270456c, s571.m77243b(this.f270454a.hashCode() * 31, 31, this.f270455b), 31), 31, this.f270457d);
    }
}
