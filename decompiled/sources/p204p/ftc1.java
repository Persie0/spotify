package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ftc1 {

    /* JADX INFO: renamed from: a */
    public final jtc1 f73183a;

    /* JADX INFO: renamed from: b */
    public final boolean f73184b;

    /* JADX INFO: renamed from: c */
    public final boolean f73185c;

    public ftc1(jtc1 jtc1Var, boolean z, boolean z2) {
        this.f73183a = jtc1Var;
        this.f73184b = z;
        this.f73185c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static ftc1 m42596a(ftc1 ftc1Var, boolean z, boolean z2, int i) {
        jtc1 jtc1Var = (i & 1) != 0 ? ftc1Var.f73183a : itc1.f105514a;
        if ((i & 2) != 0) {
            z = ftc1Var.f73184b;
        }
        if ((i & 4) != 0) {
            z2 = ftc1Var.f73185c;
        }
        ftc1Var.getClass();
        return new ftc1(jtc1Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftc1)) {
            return false;
        }
        ftc1 ftc1Var = (ftc1) obj;
        return wj50.m88271j(this.f73183a, ftc1Var.f73183a) && this.f73184b == ftc1Var.f73184b && this.f73185c == ftc1Var.f73185c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73185c) + s571.m77245d(this.f73183a.hashCode() * 31, 31, this.f73184b);
    }
}
