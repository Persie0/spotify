package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class o971 {

    /* JADX INFO: renamed from: d */
    public static final t9y0 f162952d = new t9y0(new u9y0(12), new v9y0(6));

    /* JADX INFO: renamed from: a */
    public final j15 f162953a;

    /* JADX INFO: renamed from: b */
    public final long f162954b;

    /* JADX INFO: renamed from: c */
    public final ic71 f162955c;

    public o971(j15 j15Var, long j, ic71 ic71Var) {
        ic71 ic71Var2;
        this.f162953a = j15Var;
        this.f162954b = dvg1.m37114p(j15Var.f107641b.length(), j);
        if (ic71Var != null) {
            ic71Var2 = new ic71(dvg1.m37114p(j15Var.f107641b.length(), ic71Var.f100752a));
        } else {
            ic71Var2 = null;
        }
        this.f162955c = ic71Var2;
    }

    /* JADX INFO: renamed from: a */
    public static o971 m66453a(o971 o971Var, String str) {
        long j = o971Var.f162954b;
        ic71 ic71Var = o971Var.f162955c;
        o971Var.getClass();
        return new o971(new j15(str), j, ic71Var);
    }

    /* JADX INFO: renamed from: b */
    public static o971 m66454b(o971 o971Var, j15 j15Var, long j, int i) {
        if ((i & 1) != 0) {
            j15Var = o971Var.f162953a;
        }
        if ((i & 2) != 0) {
            j = o971Var.f162954b;
        }
        ic71 ic71Var = (i & 4) != 0 ? o971Var.f162955c : null;
        o971Var.getClass();
        return new o971(j15Var, j, ic71Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o971)) {
            return false;
        }
        o971 o971Var = (o971) obj;
        return ic71.m50235c(this.f162954b, o971Var.f162954b) && wj50.m88271j(this.f162955c, o971Var.f162955c) && wj50.m88271j(this.f162953a, o971Var.f162953a);
    }

    public final int hashCode() {
        int iHashCode = this.f162953a.hashCode() * 31;
        int i = ic71.f100751c;
        int iM36605e = dq60.m36605e(iHashCode, this.f162954b, 31);
        ic71 ic71Var = this.f162955c;
        return iM36605e + (ic71Var != null ? Long.hashCode(ic71Var.f100752a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f162953a) + "', selection=" + ((Object) ic71.m50241i(this.f162954b)) + ", composition=" + this.f162955c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o971(long j, int i, String str) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = ic71.f100751c;
            j = bvg1.m30601B();
        }
        this(new j15(str), j, (ic71) null);
    }
}
