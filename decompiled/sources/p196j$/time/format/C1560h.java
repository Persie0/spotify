package p196j$.time.format;

import java.math.BigInteger;
import p196j$.time.C1512b;
import p196j$.time.temporal.InterfaceC1607p;

/* JADX INFO: renamed from: j$.time.format.h */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public class C1560h implements InterfaceC1557e {

    /* JADX INFO: renamed from: f */
    public static final long[] f10715f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a */
    public final InterfaceC1607p f10716a;

    /* JADX INFO: renamed from: b */
    public final int f10717b;

    /* JADX INFO: renamed from: c */
    public final int f10718c;

    /* JADX INFO: renamed from: d */
    public final EnumC1576x f10719d;

    /* JADX INFO: renamed from: e */
    public final int f10720e;

    public C1560h(InterfaceC1607p interfaceC1607p, int i, int i2, EnumC1576x enumC1576x) {
        this.f10716a = interfaceC1607p;
        this.f10717b = i;
        this.f10718c = i2;
        this.f10719d = enumC1576x;
        this.f10720e = 0;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        boolean z4;
        int i2;
        long j;
        int i3;
        int i4 = i;
        int length = charSequence.length();
        if (i4 == length) {
            return ~i4;
        }
        char cCharAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter = c1570r.f10752a;
        dateTimeFormatter.f10703c.getClass();
        int i5 = this.f10718c;
        EnumC1576x enumC1576x = this.f10719d;
        int i6 = this.f10717b;
        int i7 = 0;
        boolean z5 = true;
        if (cCharAt == '+') {
            boolean z6 = c1570r.f10754c;
            boolean z7 = i6 == i5;
            int iOrdinal = enumC1576x.ordinal();
            if (iOrdinal == 0 ? z6 : !(iOrdinal == 1 || iOrdinal == 4 || (!z6 && !z7))) {
                return ~i4;
            }
            i4++;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter.f10703c.getClass();
            if (cCharAt == '-') {
                boolean z8 = c1570r.f10754c;
                boolean z9 = i6 == i5;
                int iOrdinal2 = enumC1576x.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z8 || z9)) {
                    return ~i4;
                }
                i4++;
                z2 = false;
                z = true;
            } else {
                if (enumC1576x == EnumC1576x.ALWAYS && c1570r.f10754c) {
                    return ~i4;
                }
                z = false;
                z2 = false;
            }
        }
        int i8 = (c1570r.f10754c || mo24066a(c1570r)) ? i6 : 1;
        int i9 = i4 + i8;
        if (i9 > length) {
            return ~i4;
        }
        if (!c1570r.f10754c && !mo24066a(c1570r)) {
            i5 = 9;
        }
        int i10 = this.f10720e;
        int iMax = Math.max(i10, 0) + i5;
        while (true) {
            bigIntegerAdd = null;
            if (i7 >= 2) {
                z3 = z;
                z4 = z2;
                i2 = i4;
                j = 0;
                break;
            }
            int iMin = Math.min(i4 + iMax, length);
            boolean z10 = z5;
            long j2 = 0;
            int i11 = i4;
            while (true) {
                if (i11 >= iMin) {
                    i3 = length;
                    z3 = z;
                    break;
                }
                int i12 = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                i3 = length;
                dateTimeFormatter.f10703c.getClass();
                int i13 = cCharAt2 - '0';
                z3 = z;
                if (i13 < 0 || i13 > 9) {
                    i13 = -1;
                }
                if (i13 < 0) {
                    if (i11 >= i9) {
                        break;
                    }
                    return ~i4;
                }
                if (i12 - i4 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i13));
                } else {
                    j2 = (j2 * 10) + ((long) i13);
                }
                i11 = i12;
                z = z3;
                length = i3;
                dateTimeFormatter = dateTimeFormatter;
                z2 = z2;
            }
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            z4 = z2;
            if (i10 <= 0 || i7 != 0) {
                i2 = i11;
                j = j2;
                break;
            }
            int iMax2 = Math.max(i8, (i11 - i4) - i10);
            i7++;
            z5 = z10;
            z = z3;
            dateTimeFormatter = dateTimeFormatter2;
            z2 = z4;
            iMax = iMax2;
            length = i3;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && c1570r.f10754c) {
                    return ~(i4 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && c1570r.f10754c) {
                    return ~(i4 - 1);
                }
                j = -j;
            }
        } else if (enumC1576x == EnumC1576x.EXCEEDS_PAD && c1570r.f10754c) {
            int i14 = i2 - i4;
            if (z4) {
                if (i14 <= i6) {
                    return ~(i4 - 1);
                }
            } else if (i14 > i6) {
                return ~i4;
            }
        }
        if (bigIntegerDivide == null) {
            return c1570r.m24098f(this.f10716a, j, i4, i2);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i2--;
        }
        return c1570r.m24098f(this.f10716a, bigIntegerDivide.longValue(), i4, i2);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo24066a(C1570r c1570r) {
        int i = this.f10720e;
        if (i != -1) {
            return i > 0 && this.f10717b == this.f10718c && this.f10719d == EnumC1576x.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C1560h mo24067b() {
        if (this.f10720e == -1) {
            return this;
        }
        return new C1560h(this.f10716a, this.f10717b, this.f10718c, this.f10719d, -1);
    }

    /* JADX INFO: renamed from: c */
    public C1560h mo24068c(int i) {
        return new C1560h(this.f10716a, this.f10717b, this.f10718c, this.f10719d, this.f10720e + i);
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        InterfaceC1607p interfaceC1607p = this.f10716a;
        Long lM24100a = c1571s.m24100a(interfaceC1607p);
        if (lM24100a == null) {
            return false;
        }
        long jLongValue = lM24100a.longValue();
        C1573u c1573u = c1571s.f10757b.f10703c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.f10718c;
        if (length > i) {
            throw new C1512b("Field " + interfaceC1607p + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        c1573u.getClass();
        int i2 = this.f10717b;
        EnumC1576x enumC1576x = this.f10719d;
        if (jLongValue >= 0) {
            int i3 = AbstractC1554b.f10710a[enumC1576x.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jLongValue >= f10715f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC1554b.f10710a[enumC1576x.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C1512b("Field " + interfaceC1607p + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        int i = this.f10718c;
        InterfaceC1607p interfaceC1607p = this.f10716a;
        EnumC1576x enumC1576x = this.f10719d;
        int i2 = this.f10717b;
        if (i2 == 1 && i == 19 && enumC1576x == EnumC1576x.NORMAL) {
            return "Value(" + interfaceC1607p + ")";
        }
        if (i2 == i && enumC1576x == EnumC1576x.NOT_NEGATIVE) {
            return "Value(" + interfaceC1607p + "," + i2 + ")";
        }
        return "Value(" + interfaceC1607p + "," + i2 + "," + i + "," + enumC1576x + ")";
    }

    public C1560h(InterfaceC1607p interfaceC1607p, int i, int i2, EnumC1576x enumC1576x, int i3) {
        this.f10716a = interfaceC1607p;
        this.f10717b = i;
        this.f10718c = i2;
        this.f10719d = enumC1576x;
        this.f10720e = i3;
    }
}
