package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pa7 {

    /* JADX INFO: renamed from: a */
    public final boolean f175405a;

    /* JADX INFO: renamed from: b */
    public final int f175406b;

    /* JADX INFO: renamed from: c */
    public final boolean f175407c;

    /* JADX INFO: renamed from: d */
    public final String f175408d;

    /* JADX INFO: renamed from: e */
    public final ta7 f175409e;

    public pa7(boolean z, int i, boolean z2, String str, ta7 ta7Var) {
        this.f175405a = z;
        this.f175406b = i;
        this.f175407c = z2;
        this.f175408d = str;
        this.f175409e = ta7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa7)) {
            return false;
        }
        pa7 pa7Var = (pa7) obj;
        return this.f175405a == pa7Var.f175405a && this.f175406b == pa7Var.f175406b && this.f175407c == pa7Var.f175407c && wj50.m88271j(this.f175408d, pa7Var.f175408d) && wj50.m88271j(this.f175409e, pa7Var.f175409e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f175405a) * 31;
        int i = this.f175406b;
        int iM77243b = s571.m77243b(s571.m77245d((iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f175407c), 31, this.f175408d);
        ta7 ta7Var = this.f175409e;
        return iM77243b + (ta7Var != null ? ta7Var.hashCode() : 0);
    }
}
