package p196j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;
import p196j$.time.AbstractC1513c;
import p196j$.time.temporal.C1610s;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.f */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1558f extends C1560h {

    /* JADX INFO: renamed from: g */
    public final boolean f10714g;

    public C1558f(InterfaceC1607p interfaceC1607p) {
        this(interfaceC1607p, 0, 9, true, 0);
        Objects.requireNonNull(interfaceC1607p, "field");
        C1610s c1610sRange = interfaceC1607p.range();
        if (c1610sRange.f10841a != c1610sRange.f10842b || c1610sRange.f10843c != c1610sRange.f10844d) {
            throw new IllegalArgumentException(AbstractC1513c.m23991a("Field must have a fixed set of values: ", interfaceC1607p));
        }
    }

    @Override // p196j$.time.format.C1560h, p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        boolean z = c1570r.f10754c;
        DateTimeFormatter dateTimeFormatter = c1570r.f10752a;
        int i2 = (z || mo24066a(c1570r)) ? this.f10717b : 0;
        int i3 = (c1570r.f10754c || mo24066a(c1570r)) ? this.f10718c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.f10714g) {
                char cCharAt = charSequence.charAt(i);
                dateTimeFormatter.f10703c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                char cCharAt2 = charSequence.charAt(i7);
                dateTimeFormatter.f10703c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + i9;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            C1610s c1610sRange = this.f10716a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1610sRange.f10841a);
            return c1570r.m24098f(this.f10716a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c1610sRange.f10844d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // p196j$.time.format.C1560h
    /* JADX INFO: renamed from: a */
    public final boolean mo24066a(C1570r c1570r) {
        return c1570r.f10754c && this.f10717b == this.f10718c && !this.f10714g;
    }

    @Override // p196j$.time.format.C1560h
    /* JADX INFO: renamed from: b */
    public final C1560h mo24067b() {
        if (this.f10720e == -1) {
            return this;
        }
        return new C1558f(this.f10716a, this.f10717b, this.f10718c, this.f10714g, -1);
    }

    @Override // p196j$.time.format.C1560h
    /* JADX INFO: renamed from: c */
    public final C1560h mo24068c(int i) {
        return new C1558f(this.f10716a, this.f10717b, this.f10718c, this.f10714g, this.f10720e + i);
    }

    @Override // p196j$.time.format.C1560h, p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        InterfaceC1607p interfaceC1607p = this.f10716a;
        Long lM24100a = c1571s.m24100a(interfaceC1607p);
        if (lM24100a == null) {
            return false;
        }
        C1573u c1573u = c1571s.f10757b.f10703c;
        long jLongValue = lM24100a.longValue();
        C1610s c1610sRange = interfaceC1607p.range();
        c1610sRange.m24176b(jLongValue, interfaceC1607p);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1610sRange.f10841a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c1610sRange.f10844d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.f10714g;
        int i = this.f10717b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f10718c), roundingMode).toPlainString().substring(2);
            c1573u.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c1573u.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c1573u.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // p196j$.time.format.C1560h
    public final String toString() {
        return "Fraction(" + this.f10716a + "," + this.f10717b + "," + this.f10718c + (this.f10714g ? ",DecimalPoint" : "") + ")";
    }

    public C1558f(InterfaceC1607p interfaceC1607p, int i, int i2, boolean z, int i3) {
        super(interfaceC1607p, i, i2, EnumC1576x.NOT_NEGATIVE, i3);
        this.f10714g = z;
    }
}
