package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rld1 {

    /* JADX INFO: renamed from: a */
    public final boolean f200294a;

    /* JADX INFO: renamed from: b */
    public final Integer f200295b;

    /* JADX INFO: renamed from: c */
    public final boolean f200296c;

    /* JADX INFO: renamed from: d */
    public final Integer f200297d;

    /* JADX INFO: renamed from: e */
    public final boolean f200298e;

    /* JADX INFO: renamed from: f */
    public final boolean f200299f;

    public rld1(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f200294a = z;
        this.f200295b = num;
        this.f200296c = z2;
        this.f200297d = num2;
        this.f200298e = z3;
        this.f200299f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rld1)) {
            return false;
        }
        rld1 rld1Var = (rld1) obj;
        return this.f200294a == rld1Var.f200294a && wj50.m88271j(this.f200295b, rld1Var.f200295b) && this.f200296c == rld1Var.f200296c && wj50.m88271j(this.f200297d, rld1Var.f200297d) && this.f200298e == rld1Var.f200298e && this.f200299f == rld1Var.f200299f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f200294a) * 31;
        Integer num = this.f200295b;
        int iM77245d = s571.m77245d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f200296c);
        Integer num2 = this.f200297d;
        return Boolean.hashCode(this.f200299f) + s571.m77245d((iM77245d + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f200298e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f200294a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f200295b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f200296c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f200297d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f200298e);
        sb.append(", unknownValues=");
        return s571.m77253l(sb, this.f200299f, ')');
    }
}
