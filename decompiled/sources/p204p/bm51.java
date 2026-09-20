package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bm51 extends am51 {
    /* JADX INFO: renamed from: e0 */
    public static boolean m29794e0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public static String m29795f0(int i, byte[] bArr, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bga.m29091m(i, i2, bArr.length);
        return new String(bArr, i, i2 - i, vuc.f244913a);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m29796g0(String str, String str2, boolean z) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m29797h0(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX INFO: renamed from: i0 */
    public static final boolean m29798i0(String str) {
        char c;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        String str2;
        boolean z4;
        boolean z5 = true;
        int length = str.length() - 1;
        int i2 = 0;
        while (true) {
            c = ' ';
            if (i2 > length || str.charAt(i2) > ' ') {
                break;
            }
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) != '0') {
            z = true;
            z2 = false;
        } else {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ' ') == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (true) {
                    if (i5 > length) {
                        z = z5;
                        break;
                    }
                    char cCharAt = str.charAt(i5);
                    z = z5;
                    if (((cCharAt - '0') & AudioDriver.SPOTIFY_MAX_VOLUME) >= 10 && (((cCharAt | ' ') - 97) & AudioDriver.SPOTIFY_MAX_VOLUME) >= 6) {
                        break;
                    }
                    i5++;
                    z5 = z;
                }
                boolean z6 = i4 != i5 ? z : false;
                if (i5 <= length) {
                    if (str.charAt(i5) == '.') {
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 <= length) {
                            char cCharAt2 = str.charAt(i7);
                            char c2 = c;
                            if (((cCharAt2 - '0') & AudioDriver.SPOTIFY_MAX_VOLUME) >= 10 && (((cCharAt2 | ' ') - 97) & AudioDriver.SPOTIFY_MAX_VOLUME) >= 6) {
                                break;
                            }
                            i7++;
                            c = c2;
                        }
                        z4 = i6 != i7 ? z : false;
                        i5 = i7;
                    } else {
                        z4 = false;
                    }
                    if (z6 || z4) {
                        i2 = i5;
                    }
                    if (i2 != -1 || i2 > length) {
                        return false;
                    }
                    z2 = z;
                }
                i2 = -1;
                if (i2 != -1) {
                }
                return false;
            }
            z = true;
            z2 = false;
        }
        if (!z2) {
            int i8 = i2;
            while (i8 <= length && ((str.charAt(i8) - '0') & AudioDriver.SPOTIFY_MAX_VOLUME) < 10) {
                i8++;
            }
            boolean z7 = i2 != i8 ? z : false;
            if (i8 > length) {
                i2 = i8;
            } else {
                if (str.charAt(i8) == '.') {
                    int i9 = i8 + 1;
                    i = i9;
                    while (i <= length && ((str.charAt(i) - '0') & AudioDriver.SPOTIFY_MAX_VOLUME) < 10) {
                        i++;
                    }
                    if (i9 != i) {
                        z3 = z;
                    }
                    if (!z7 || z3) {
                        i2 = i;
                    } else {
                        if (length == i + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i + 7 ? "Infinity" : null;
                        }
                        i2 = (str2 != null && wl51.m88455E0(i, str, str2, false) == i) ? length + 1 : -1;
                    }
                } else {
                    i = i8;
                }
                z3 = false;
                if (z7) {
                    i2 = i;
                } else {
                    i2 = i;
                }
            }
            if (i2 == -1) {
                return false;
            }
            if (i2 > length) {
                return z;
            }
        }
        int i10 = i2 + 1;
        int iCharAt = str.charAt(i2) | ' ';
        if (iCharAt != (z2 ? ContentType.LONG_FORM_ON_DEMAND : 101)) {
            if (z2 || (!(iCharAt == 102 || iCharAt == 100) || i10 <= length)) {
                return false;
            }
            return z;
        }
        if (i10 > length) {
            return false;
        }
        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
            return false;
        }
        while (i10 <= length && ((str.charAt(i10) - '0') & AudioDriver.SPOTIFY_MAX_VOLUME) < 10) {
            i10++;
        }
        if (i10 > length) {
            return z;
        }
        if (i10 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i10) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m29799j0(String str) {
        throw new NumberFormatException(dq60.m36608h('\'', "Invalid number format: '", str));
    }

    /* JADX INFO: renamed from: k0 */
    public static String m29800k0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(dq60.m36613m("Count 'n' must be non-negative, but was ", i, '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: l0 */
    public static String m29801l0(String str, String str2, String str3) {
        int iM88455E0 = wl51.m88455E0(0, str, str2, false);
        if (iM88455E0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM88455E0);
            sb.append(str3);
            i2 = iM88455E0 + length;
            if (iM88455E0 >= str.length()) {
                break;
            }
            iM88455E0 = wl51.m88455E0(iM88455E0 + i, str, str2, false);
        } while (iM88455E0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static String m29802m0(String str, String str2, String str3) {
        int iM88458H0 = wl51.m88458H0(str, str2, 0, false, 2);
        return iM88458H0 < 0 ? str : wl51.m88473W0(str, iM88458H0, str2.length() + iM88458H0, str3).toString();
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m29803n0(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }

    /* JADX INFO: renamed from: p0 */
    public static Double m29805p0(String str) {
        try {
            if (m29798i0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public static Float m29806q0(String str) {
        try {
            if (m29798i0(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static Integer m29807r0(String str) {
        boolean z;
        int i;
        int i2;
        zn91.m96584x(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (wj50.m88282u(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iM96513A = zn91.m96513A(str.charAt(i), 10);
            if (iM96513A < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iM96513A) {
                return null;
            }
            i3 = i2 - iM96513A;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* JADX INFO: renamed from: s0 */
    public static Long m29808s0(int i, String str) {
        boolean z;
        zn91.m96584x(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (wj50.m88282u(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int iM96513A = zn91.m96513A(str.charAt(i2), i);
            if (iM96513A < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) i);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) i);
            long j5 = iM96513A;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
