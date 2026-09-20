package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cdj0 {

    /* JADX INFO: renamed from: a */
    public final int f36898a;

    /* JADX INFO: renamed from: b */
    public final String f36899b;

    /* JADX INFO: renamed from: c */
    public final String f36900c;

    /* JADX INFO: renamed from: d */
    public final boolean f36901d;

    /* JADX INFO: renamed from: e */
    public final taj0 f36902e;

    public cdj0(int i, String str, String str2, boolean z, taj0 taj0Var) {
        this.f36898a = i;
        this.f36899b = str;
        this.f36900c = str2;
        this.f36901d = z;
        this.f36902e = taj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdj0)) {
            return false;
        }
        cdj0 cdj0Var = (cdj0) obj;
        return this.f36898a == cdj0Var.f36898a && wj50.m88271j(this.f36899b, cdj0Var.f36899b) && wj50.m88271j(this.f36900c, cdj0Var.f36900c) && this.f36901d == cdj0Var.f36901d && wj50.m88271j(this.f36902e, cdj0Var.f36902e);
    }

    public final int hashCode() {
        return this.f36902e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(Integer.hashCode(this.f36898a) * 31, 31, this.f36899b), 31, this.f36900c), 31, this.f36901d);
    }
}
