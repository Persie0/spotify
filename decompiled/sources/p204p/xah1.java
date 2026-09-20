package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xah1 extends i5h1 {

    /* JADX INFO: renamed from: a */
    public final vah1 f259691a;

    /* JADX INFO: renamed from: b */
    public final tah1 f259692b;

    /* JADX INFO: renamed from: c */
    public final aqs f259693c;

    /* JADX INFO: renamed from: d */
    public final wah1 f259694d;

    public xah1(vah1 vah1Var, tah1 tah1Var, aqs aqsVar, wah1 wah1Var) {
        this.f259691a = vah1Var;
        this.f259692b = tah1Var;
        this.f259693c = aqsVar;
        this.f259694d = wah1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xah1)) {
            return false;
        }
        xah1 xah1Var = (xah1) obj;
        return xah1Var.f259691a == this.f259691a && xah1Var.f259692b == this.f259692b && xah1Var.f259693c == this.f259693c && xah1Var.f259694d == this.f259694d;
    }

    public final int hashCode() {
        return Objects.hash(xah1.class, this.f259691a, this.f259692b, this.f259693c, this.f259694d);
    }

    public final String toString() {
        String str = this.f259694d.f249536b;
        int length = str.length();
        String str2 = this.f259693c.f18776b;
        int length2 = str2.length();
        String str3 = this.f259691a.f239278b;
        int length3 = str3.length();
        String str4 = this.f259692b.f218614a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        klh.m56844p(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        klh.m56844p(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
