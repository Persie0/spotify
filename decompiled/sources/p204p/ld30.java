package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ld30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final ro0 f132032a;

    /* JADX INFO: renamed from: b */
    public final String f132033b;

    /* JADX INFO: renamed from: c */
    public final String f132034c;

    /* JADX INFO: renamed from: d */
    public final int f132035d;

    /* JADX INFO: renamed from: e */
    public final int f132036e;

    /* JADX INFO: renamed from: f */
    public final int f132037f;

    /* JADX INFO: renamed from: g */
    public final int f132038g;

    /* JADX INFO: renamed from: h */
    public final Float f132039h;

    /* JADX INFO: renamed from: i */
    public final Float f132040i;

    public ld30(ro0 ro0Var, String str, String str2, int i, int i2, int i3, int i4, Float f, Float f2) {
        this.f132032a = ro0Var;
        this.f132033b = str;
        this.f132034c = str2;
        this.f132035d = i;
        this.f132036e = i2;
        this.f132037f = i3;
        this.f132038g = i4;
        this.f132039h = f;
        this.f132040i = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld30)) {
            return false;
        }
        ld30 ld30Var = (ld30) obj;
        return wj50.m88271j(this.f132032a, ld30Var.f132032a) && wj50.m88271j(this.f132033b, ld30Var.f132033b) && this.f132034c.equals(ld30Var.f132034c) && this.f132035d == ld30Var.f132035d && this.f132036e == ld30Var.f132036e && this.f132037f == ld30Var.f132037f && this.f132038g == ld30Var.f132038g && wj50.m88271j(this.f132039h, ld30Var.f132039h) && wj50.m88271j(this.f132040i, ld30Var.f132040i);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f132035d, s571.m77243b(s571.m77243b(this.f132032a.hashCode() * 31, 31, this.f132033b), 31, this.f132034c), 31);
        int i = this.f132036e;
        int iM40938f2 = f710.m40938f(this.f132038g, f710.m40938f(this.f132037f, (iM40938f + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31), 31);
        Float f = this.f132039h;
        int iHashCode = (iM40938f2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f132040i;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
