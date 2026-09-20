package p204p;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class f7f1 extends i5h1 {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f66671g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f66672a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f66673b;

    /* JADX INFO: renamed from: c */
    public final d7f1 f66674c;

    /* JADX INFO: renamed from: d */
    public final c7f1 f66675d;

    /* JADX INFO: renamed from: e */
    public final c7f1 f66676e;

    /* JADX INFO: renamed from: f */
    public final int f66677f;

    public f7f1(int i, BigInteger bigInteger, d7f1 d7f1Var, c7f1 c7f1Var, c7f1 c7f1Var2, int i2) {
        this.f66672a = i;
        this.f66673b = bigInteger;
        this.f66674c = d7f1Var;
        this.f66675d = c7f1Var;
        this.f66676e = c7f1Var2;
        this.f66677f = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f7f1)) {
            return false;
        }
        f7f1 f7f1Var = (f7f1) obj;
        return f7f1Var.f66672a == this.f66672a && Objects.equals(f7f1Var.f66673b, this.f66673b) && Objects.equals(f7f1Var.f66674c, this.f66674c) && Objects.equals(f7f1Var.f66675d, this.f66675d) && Objects.equals(f7f1Var.f66676e, this.f66676e) && f7f1Var.f66677f == this.f66677f;
    }

    public final int hashCode() {
        return Objects.hash(f7f1.class, Integer.valueOf(this.f66672a), this.f66673b, this.f66674c, this.f66675d, this.f66676e, Integer.valueOf(this.f66677f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f66674c);
        String strValueOf2 = String.valueOf(this.f66675d);
        String strValueOf3 = String.valueOf(this.f66676e);
        String strValueOf4 = String.valueOf(this.f66673b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f66677f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i2 = this.f66672a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        klh.m56844p(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
