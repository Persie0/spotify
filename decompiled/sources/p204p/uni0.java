package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uni0 {

    /* JADX INFO: renamed from: a */
    public final gcr0 f232176a;

    /* JADX INFO: renamed from: b */
    public final gcr0 f232177b;

    /* JADX INFO: renamed from: c */
    public final int f232178c;

    /* JADX INFO: renamed from: d */
    public final int f232179d;

    /* JADX INFO: renamed from: e */
    public final String f232180e;

    /* JADX INFO: renamed from: f */
    public final String f232181f;

    /* JADX INFO: renamed from: g */
    public final long f232182g;

    public uni0(gcr0 gcr0Var, gcr0 gcr0Var2, int i, int i2, String str, String str2, long j) {
        this.f232176a = gcr0Var;
        this.f232177b = gcr0Var2;
        this.f232178c = i;
        this.f232179d = i2;
        this.f232180e = str;
        this.f232181f = str2;
        this.f232182g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uni0)) {
            return false;
        }
        uni0 uni0Var = (uni0) obj;
        return wj50.m88271j(this.f232176a, uni0Var.f232176a) && wj50.m88271j(this.f232177b, uni0Var.f232177b) && this.f232178c == uni0Var.f232178c && this.f232179d == uni0Var.f232179d && wj50.m88271j(this.f232180e, uni0Var.f232180e) && wj50.m88271j(this.f232181f, uni0Var.f232181f) && this.f232182g == uni0Var.f232182g;
    }

    public final int hashCode() {
        gcr0 gcr0Var = this.f232176a;
        return Long.hashCode(this.f232182g) + s571.m77243b(s571.m77243b(mt60.m62800g(this.f232179d, mt60.m62800g(this.f232178c, (this.f232177b.hashCode() + ((gcr0Var == null ? 0 : gcr0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.f232180e), 31, this.f232181f);
    }
}
