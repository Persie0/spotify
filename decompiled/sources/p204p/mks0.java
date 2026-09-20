package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mks0 {

    /* JADX INFO: renamed from: a */
    public final iks0 f144668a;

    /* JADX INFO: renamed from: b */
    public final rw40 f144669b;

    /* JADX INFO: renamed from: c */
    public final String f144670c;

    /* JADX INFO: renamed from: d */
    public final String f144671d;

    /* JADX INFO: renamed from: e */
    public final boolean f144672e;

    /* JADX INFO: renamed from: f */
    public final ln20 f144673f;

    /* JADX INFO: renamed from: g */
    public final boolean f144674g;

    /* JADX INFO: renamed from: h */
    public final aw8 f144675h;

    /* JADX INFO: renamed from: i */
    public final uoe0 f144676i;

    /* JADX INFO: renamed from: j */
    public final boolean f144677j;

    /* JADX INFO: renamed from: k */
    public final int f144678k;

    /* JADX INFO: renamed from: l */
    public final boolean f144679l;

    /* JADX INFO: renamed from: m */
    public final rz60 f144680m;

    public mks0(iks0 iks0Var, rw40 rw40Var, String str, String str2, boolean z, ln20 ln20Var, boolean z2, aw8 aw8Var, uoe0 uoe0Var, boolean z3, int i, boolean z4, rz60 rz60Var) {
        this.f144668a = iks0Var;
        this.f144669b = rw40Var;
        this.f144670c = str;
        this.f144671d = str2;
        this.f144672e = z;
        this.f144673f = ln20Var;
        this.f144674g = z2;
        this.f144675h = aw8Var;
        this.f144676i = uoe0Var;
        this.f144677j = z3;
        this.f144678k = i;
        this.f144679l = z4;
        this.f144680m = rz60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mks0)) {
            return false;
        }
        mks0 mks0Var = (mks0) obj;
        return wj50.m88271j(this.f144668a, mks0Var.f144668a) && wj50.m88271j(this.f144669b, mks0Var.f144669b) && wj50.m88271j(this.f144670c, mks0Var.f144670c) && wj50.m88271j(this.f144671d, mks0Var.f144671d) && this.f144672e == mks0Var.f144672e && wj50.m88271j(this.f144673f, mks0Var.f144673f) && this.f144674g == mks0Var.f144674g && wj50.m88271j(this.f144675h, mks0Var.f144675h) && this.f144676i == mks0Var.f144676i && this.f144677j == mks0Var.f144677j && this.f144678k == mks0Var.f144678k && this.f144679l == mks0Var.f144679l && wj50.m88271j(this.f144680m, mks0Var.f144680m);
    }

    public final int hashCode() {
        int iHashCode = (this.f144669b.hashCode() + (this.f144668a.hashCode() * 31)) * 31;
        String str = this.f144670c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f144671d;
        int iM77245d = s571.m77245d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f144672e);
        ln20 ln20Var = this.f144673f;
        return this.f144680m.hashCode() + s571.m77245d(mt60.m62800g(this.f144678k, s571.m77245d((this.f144676i.hashCode() + ((this.f144675h.hashCode() + s571.m77245d((iM77245d + (ln20Var != null ? ln20Var.hashCode() : 0)) * 31, 31, this.f144674g)) * 31)) * 31, 31, this.f144677j), 31), 31, this.f144679l);
    }
}
