package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ix51 {
    public static final hx51 Companion = new hx51();

    /* JADX INFO: renamed from: g */
    public static final fr70[] f106599g = {null, null, null, q3d0.m72078I(2, uv51.f234368e), q3d0.m72078I(2, uv51.f234369f), q3d0.m72078I(2, uv51.f234370g)};

    /* JADX INFO: renamed from: a */
    public final String f106600a;

    /* JADX INFO: renamed from: b */
    public final String f106601b;

    /* JADX INFO: renamed from: c */
    public final boolean f106602c;

    /* JADX INFO: renamed from: d */
    public final ex51 f106603d;

    /* JADX INFO: renamed from: e */
    public final sw51 f106604e;

    /* JADX INFO: renamed from: f */
    public final wv51 f106605f;

    public /* synthetic */ ix51(int i, String str, String str2, boolean z, ex51 ex51Var, sw51 sw51Var, wv51 wv51Var) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, gx51.f85188a.getDescriptor());
            throw null;
        }
        this.f106600a = str;
        this.f106601b = str2;
        this.f106602c = z;
        if ((i & 8) == 0) {
            this.f106603d = null;
        } else {
            this.f106603d = ex51Var;
        }
        if ((i & 16) == 0) {
            this.f106604e = null;
        } else {
            this.f106604e = sw51Var;
        }
        if ((i & 32) == 0) {
            this.f106605f = null;
        } else {
            this.f106605f = wv51Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix51)) {
            return false;
        }
        ix51 ix51Var = (ix51) obj;
        return wj50.m88271j(this.f106600a, ix51Var.f106600a) && wj50.m88271j(this.f106601b, ix51Var.f106601b) && this.f106602c == ix51Var.f106602c && this.f106603d == ix51Var.f106603d && this.f106604e == ix51Var.f106604e && this.f106605f == ix51Var.f106605f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f106600a.hashCode() * 31, 31, this.f106601b), 31, this.f106602c);
        ex51 ex51Var = this.f106603d;
        int iHashCode = (iM77245d + (ex51Var == null ? 0 : ex51Var.hashCode())) * 31;
        sw51 sw51Var = this.f106604e;
        int iHashCode2 = (iHashCode + (sw51Var == null ? 0 : sw51Var.hashCode())) * 31;
        wv51 wv51Var = this.f106605f;
        return iHashCode2 + (wv51Var != null ? wv51Var.hashCode() : 0);
    }

    public ix51(String str, String str2, boolean z) {
        this.f106600a = str;
        this.f106601b = str2;
        this.f106602c = z;
        this.f106603d = null;
        this.f106604e = null;
        this.f106605f = null;
    }
}
