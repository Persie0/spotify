package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gpx0 {

    /* JADX INFO: renamed from: a */
    public final epx0 f83263a;

    /* JADX INFO: renamed from: b */
    public final String f83264b;

    /* JADX INFO: renamed from: c */
    public final boolean f83265c;

    /* JADX INFO: renamed from: d */
    public final int f83266d;

    /* JADX INFO: renamed from: e */
    public final m9r0 f83267e;

    public gpx0(epx0 epx0Var, String str, boolean z, int i, m9r0 m9r0Var) {
        this.f83263a = epx0Var;
        this.f83264b = str;
        this.f83265c = z;
        this.f83266d = i;
        this.f83267e = m9r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpx0)) {
            return false;
        }
        gpx0 gpx0Var = (gpx0) obj;
        return wj50.m88271j(this.f83263a, gpx0Var.f83263a) && wj50.m88271j(this.f83264b, gpx0Var.f83264b) && this.f83265c == gpx0Var.f83265c && this.f83266d == gpx0Var.f83266d && wj50.m88271j(this.f83267e, gpx0Var.f83267e);
    }

    public final int hashCode() {
        int iHashCode = this.f83263a.hashCode() * 31;
        String str = this.f83264b;
        return this.f83267e.hashCode() + f710.m40938f(this.f83266d, s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83265c), 31);
    }
}
