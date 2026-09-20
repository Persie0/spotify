package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pi1 {

    /* JADX INFO: renamed from: a */
    public final qi1 f177809a;

    /* JADX INFO: renamed from: b */
    public final boolean f177810b;

    /* JADX INFO: renamed from: c */
    public final String f177811c;

    /* JADX INFO: renamed from: d */
    public final String f177812d;

    /* JADX INFO: renamed from: e */
    public final exg1 f177813e;

    public pi1(qi1 qi1Var, boolean z, String str, String str2, exg1 exg1Var) {
        this.f177809a = qi1Var;
        this.f177810b = z;
        this.f177811c = str;
        this.f177812d = str2;
        this.f177813e = exg1Var;
    }

    /* JADX INFO: renamed from: a */
    public static pi1 m70066a(pi1 pi1Var, qi1 qi1Var, exg1 exg1Var, int i) {
        if ((i & 1) != 0) {
            qi1Var = pi1Var.f177809a;
        }
        qi1 qi1Var2 = qi1Var;
        boolean z = pi1Var.f177810b;
        String str = pi1Var.f177811c;
        String str2 = pi1Var.f177812d;
        if ((i & 16) != 0) {
            exg1Var = pi1Var.f177813e;
        }
        pi1Var.getClass();
        return new pi1(qi1Var2, z, str, str2, exg1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi1)) {
            return false;
        }
        pi1 pi1Var = (pi1) obj;
        return this.f177809a == pi1Var.f177809a && this.f177810b == pi1Var.f177810b && wj50.m88271j(this.f177811c, pi1Var.f177811c) && wj50.m88271j(this.f177812d, pi1Var.f177812d) && wj50.m88271j(this.f177813e, pi1Var.f177813e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f177809a.hashCode() * 31, 31, this.f177810b);
        String str = this.f177811c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f177812d;
        return this.f177813e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ pi1(qi1 qi1Var, boolean z, String str, String str2, exg1 exg1Var, int i) {
        this(qi1Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? si1.f209309b : exg1Var);
    }
}
