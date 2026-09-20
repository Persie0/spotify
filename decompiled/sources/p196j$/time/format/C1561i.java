package p196j$.time.format;

import p196j$.time.C1512b;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.format.i */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1561i implements InterfaceC1557e {

    /* JADX INFO: renamed from: d */
    public static final String[] f10721d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e */
    public static final C1561i f10722e = new C1561i("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f */
    public static final C1561i f10723f = new C1561i("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a */
    public final String f10724a;

    /* JADX INFO: renamed from: b */
    public final int f10725b;

    /* JADX INFO: renamed from: c */
    public final int f10726c;

    public C1561i(String str, String str2) {
        for (int i = 0; i < 22; i++) {
            if (f10721d[i].equals(str)) {
                this.f10725b = i;
                this.f10726c = i % 11;
                this.f10724a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m24069a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX INFO: renamed from: b */
    public static boolean m24070b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4 = iArr[0];
        if (i4 < 0) {
            return true;
        }
        if (!z || i == 1) {
            i2 = i4 + 2;
            if (i2 <= charSequence.length()) {
                int i5 = i4 + 1;
                cCharAt = charSequence.charAt(i4);
                cCharAt2 = charSequence.charAt(i5);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i3 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i3 >= 0 && i3 <= 59) {
                        iArr[i] = i3;
                        iArr[0] = i2;
                        return true;
                    }
                }
            }
        } else {
            int i6 = i4 + 1;
            if (i6 <= charSequence.length() && charSequence.charAt(i4) == ':') {
                i4 = i6;
                i2 = i4 + 2;
                if (i2 <= charSequence.length()) {
                    int i7 = i4 + 1;
                    cCharAt = charSequence.charAt(i4);
                    cCharAt2 = charSequence.charAt(i7);
                    if (cCharAt >= '0') {
                        i3 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i3 >= 0) {
                            iArr[i] = i3;
                            iArr[0] = i2;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m24071c(CharSequence charSequence, boolean z, int[] iArr) {
        if (!z) {
            m24073e(charSequence, 1, 2, iArr);
        } else {
            if (m24070b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m24072d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (m24070b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX INFO: renamed from: e */
    public static void m24073e(CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && (i3 = i4 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i4)) >= '0' && cCharAt <= '9') {
            cArr[i5] = cCharAt;
            i6++;
            i5++;
            i4 = i3;
        }
        if (i6 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: E */
    public final int mo24064E(C1570r c1570r, CharSequence charSequence, int i) {
        CharSequence charSequence2;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = charSequence.length();
        int length2 = this.f10724a.length();
        if (length2 == 0) {
            if (i == length) {
                return c1570r.m24098f(EnumC1592a.OFFSET_SECONDS, 0L, i, i);
            }
            charSequence2 = charSequence;
        } else {
            if (i == length) {
                return ~i;
            }
            charSequence2 = charSequence;
            if (c1570r.m24099g(charSequence2, i, this.f10724a, 0, length2)) {
                return c1570r.m24098f(EnumC1592a.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i6 = cCharAt == '-' ? -1 : 1;
            int i7 = this.f10726c;
            boolean z = i7 > 0 && i7 % 2 == 0;
            int i8 = this.f10725b;
            boolean z2 = i8 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!c1570r.f10754c) {
                if (z2) {
                    if (z || (i8 == 0 && length > (i5 = i + 3) && charSequence2.charAt(i5) == ':')) {
                        i8 = 10;
                        z = true;
                    } else {
                        i8 = 9;
                    }
                } else if (z || (i8 == 11 && length > (i4 = i + 3) && (charSequence2.charAt(i + 2) == ':' || charSequence2.charAt(i4) == ':'))) {
                    i8 = 21;
                    z = true;
                } else {
                    i8 = 20;
                }
            }
            switch (i8) {
                case 0:
                case 11:
                    m24071c(charSequence2, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    m24071c(charSequence2, z2, iArr);
                    m24072d(charSequence2, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    m24071c(charSequence2, z2, iArr);
                    m24072d(charSequence2, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    m24071c(charSequence2, z2, iArr);
                    m24072d(charSequence2, z, true, iArr);
                    m24070b(charSequence2, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    m24071c(charSequence2, z2, iArr);
                    m24072d(charSequence2, z, true, iArr);
                    if (!m24070b(charSequence2, z, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    m24071c(charSequence2, z2, iArr);
                    if (m24070b(charSequence2, z, 2, iArr)) {
                        m24070b(charSequence2, z, 3, iArr);
                    }
                    break;
                case 12:
                    m24073e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    m24073e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    m24073e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    m24073e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    m24073e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i9 = iArr[0];
            if (i9 > 0) {
                int i10 = iArr[1];
                if (i10 > 23 || (i2 = iArr[2]) > 59 || (i3 = iArr[3]) > 59) {
                    throw new C1512b("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c1570r.m24098f(EnumC1592a.OFFSET_SECONDS, ((((long) i2) * 60) + (((long) i10) * 3600) + ((long) i3)) * ((long) i6), i, i9);
            }
        }
        return length2 == 0 ? c1570r.m24098f(EnumC1592a.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    @Override // p196j$.time.format.InterfaceC1557e
    /* JADX INFO: renamed from: r */
    public final boolean mo24065r(C1571s c1571s, StringBuilder sb) {
        Long lM24100a = c1571s.m24100a(EnumC1592a.OFFSET_SECONDS);
        boolean z = false;
        if (lM24100a == null) {
            return false;
        }
        int intExact = Math.toIntExact(lM24100a.longValue());
        String str = this.f10724a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.f10725b >= 11 && iAbs < 10) {
            sb.append((char) (iAbs + 48));
        } else {
            m24069a(false, iAbs, sb);
        }
        int i = this.f10726c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            m24069a(i > 0 && i % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                }
                m24069a(z, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public final String toString() {
        String strReplace = this.f10724a.replace("'", "''");
        return "Offset(" + f10721d[this.f10725b] + ",'" + strReplace + "')";
    }
}
