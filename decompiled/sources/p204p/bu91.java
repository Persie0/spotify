package p204p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bu91 implements f2b1, Serializable {

    /* JADX INFO: renamed from: f */
    public static final bu91 f31063f;

    /* JADX INFO: renamed from: a */
    public final String f31064a;

    /* JADX INFO: renamed from: b */
    public final String f31065b;

    /* JADX INFO: renamed from: c */
    public final String f31066c;

    /* JADX INFO: renamed from: d */
    public final Integer f31067d;

    /* JADX INFO: renamed from: e */
    public final String f31068e;

    static {
        new ti5(29);
        f31063f = new bu91("", null, null, null, null);
    }

    public bu91(String str, String str2, Integer num, String str3, String str4) {
        this.f31064a = str;
        this.f31065b = str2;
        this.f31066c = str3;
        this.f31067d = num;
        this.f31068e = str4;
    }

    @Override // p204p.f2b1
    /* JADX INFO: renamed from: a */
    public final List mo30507a() {
        return this.f31064a.length() == 0 ? geg1.m44518y("empty path node name") : lau.f131415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bu91.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        bu91 bu91Var = (bu91) obj;
        return wj50.m88271j(this.f31064a, bu91Var.f31064a) && wj50.m88271j(this.f31065b, bu91Var.f31065b) && wj50.m88271j(this.f31066c, bu91Var.f31066c) && wj50.m88271j(this.f31067d, bu91Var.f31067d) && wj50.m88271j(this.f31068e, bu91Var.f31068e);
    }

    public final int hashCode() {
        int iHashCode = this.f31064a.hashCode() * 31;
        String str = this.f31065b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f31066c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f31067d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str3 = this.f31068e;
        return iIntValue + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f31064a;
        String str2 = this.f31068e;
        Integer num = this.f31067d;
        String str3 = this.f31066c;
        String str4 = this.f31065b;
        if (str4 == null && str3 == null && num == null && str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("(");
        boolean zM80906m = ti5.m80906m(sb, "id", str4, false);
        boolean zM80906m2 = zM80906m & ti5.m80906m(sb, "uri", str3, zM80906m);
        ti5.m80906m(sb, "reason", str2, zM80906m2 & ti5.m80906m(sb, "pos", num, zM80906m2));
        sb.append(")");
        String string = sb.toString();
        wj50.m88279p(string);
        return string;
    }
}
