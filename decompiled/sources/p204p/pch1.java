package p204p;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class pch1 extends i5h1 {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f176107e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f176108a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f176109b;

    /* JADX INFO: renamed from: c */
    public final nch1 f176110c;

    /* JADX INFO: renamed from: d */
    public final mch1 f176111d;

    public pch1(int i, BigInteger bigInteger, nch1 nch1Var, mch1 mch1Var) {
        this.f176108a = i;
        this.f176109b = bigInteger;
        this.f176110c = nch1Var;
        this.f176111d = mch1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pch1)) {
            return false;
        }
        pch1 pch1Var = (pch1) obj;
        return pch1Var.f176108a == this.f176108a && Objects.equals(pch1Var.f176109b, this.f176109b) && pch1Var.f176110c == this.f176110c && pch1Var.f176111d == this.f176111d;
    }

    public final int hashCode() {
        return Objects.hash(pch1.class, Integer.valueOf(this.f176108a), this.f176109b, this.f176110c, this.f176111d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f176110c);
        String strValueOf2 = String.valueOf(this.f176111d);
        String strValueOf3 = String.valueOf(this.f176109b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f176108a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        klh.m56844p(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
