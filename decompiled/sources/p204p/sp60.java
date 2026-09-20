package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sp60 {

    /* JADX INFO: renamed from: i */
    public static final sp60 f212742i;

    /* JADX INFO: renamed from: a */
    public final wr70 f212743a;

    /* JADX INFO: renamed from: b */
    public final zr60 f212744b;

    /* JADX INFO: renamed from: c */
    public final int f212745c;

    /* JADX INFO: renamed from: d */
    public final boolean f212746d;

    /* JADX INFO: renamed from: e */
    public final boolean f212747e;

    /* JADX INFO: renamed from: f */
    public final boolean f212748f;

    /* JADX INFO: renamed from: g */
    public final boolean f212749g;

    /* JADX INFO: renamed from: h */
    public final boolean f212750h;

    static {
        zr60 zr60Var = zr60.f285551b;
        uqg1.m83798t();
        f212742i = new sp60(null, zr60.f285551b, 0, false, false, false, false, false);
    }

    public sp60(wr70 wr70Var, zr60 zr60Var, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f212743a = wr70Var;
        this.f212744b = zr60Var;
        this.f212745c = i;
        this.f212746d = z;
        this.f212747e = z2;
        this.f212748f = z3;
        this.f212749g = z4;
        this.f212750h = z5;
    }

    /* JADX INFO: renamed from: a */
    public static sp60 m78860a(sp60 sp60Var, wr70 wr70Var, zr60 zr60Var, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            wr70Var = sp60Var.f212743a;
        }
        wr70 wr70Var2 = wr70Var;
        if ((i2 & 2) != 0) {
            zr60Var = sp60Var.f212744b;
        }
        zr60 zr60Var2 = zr60Var;
        if ((i2 & 4) != 0) {
            i = sp60Var.f212745c;
        }
        int i3 = i;
        boolean z5 = (i2 & 8) != 0 ? sp60Var.f212746d : true;
        if ((i2 & 16) != 0) {
            z = sp60Var.f212747e;
        }
        boolean z6 = z;
        if ((i2 & 32) != 0) {
            z2 = sp60Var.f212748f;
        }
        boolean z7 = z2;
        if ((i2 & 64) != 0) {
            z3 = sp60Var.f212749g;
        }
        boolean z8 = z3;
        boolean z9 = (i2 & 128) != 0 ? sp60Var.f212750h : z4;
        sp60Var.getClass();
        return new sp60(wr70Var2, zr60Var2, i3, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp60)) {
            return false;
        }
        sp60 sp60Var = (sp60) obj;
        return wj50.m88271j(this.f212743a, sp60Var.f212743a) && wj50.m88271j(this.f212744b, sp60Var.f212744b) && this.f212745c == sp60Var.f212745c && this.f212746d == sp60Var.f212746d && this.f212747e == sp60Var.f212747e && this.f212748f == sp60Var.f212748f && this.f212749g == sp60Var.f212749g && this.f212750h == sp60Var.f212750h;
    }

    public final int hashCode() {
        wr70 wr70Var = this.f212743a;
        int iHashCode = (this.f212744b.hashCode() + ((wr70Var == null ? 0 : wr70Var.hashCode()) * 31)) * 31;
        int i = this.f212745c;
        return Boolean.hashCode(this.f212750h) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (i != 0 ? edb.m38547C(i) : 0)) * 31, 31, this.f212746d), 31, this.f212747e), 31, this.f212748f), 31, this.f212749g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.f212743a);
        sb.append(", typeSubstitutor=");
        sb.append(this.f212744b);
        sb.append(", modality=");
        sb.append(rkh0.m75739m(this.f212745c));
        sb.append(", isFakeOverride=");
        sb.append(this.f212746d);
        sb.append(", forceIsExternal=");
        sb.append(this.f212747e);
        sb.append(", forceIsOperator=");
        sb.append(this.f212748f);
        sb.append(", forceIsInfix=");
        sb.append(this.f212749g);
        sb.append(", forceIsInline=");
        return s571.m77253l(sb, this.f212750h, ')');
    }
}
