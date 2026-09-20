package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wl51 extends bm51 {
    /* JADX INFO: renamed from: A0 */
    public static boolean m88451A0(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? bm51.m29796g0((String) charSequence, (String) charSequence2, false) : m88468R0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    /* JADX INFO: renamed from: B0 */
    public static char m88452B0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: C0 */
    public static int m88453C0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: D0 */
    public static Character m88454D0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: E0 */
    public static int m88455E0(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? m88456F0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: F0 */
    public static final int m88456F0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        z350 z350VarM43304i;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM88453C0 = m88453C0(charSequence);
            if (i3 > iM88453C0) {
                i3 = iM88453C0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            z350VarM43304i = g0g1.m43304i(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            z350VarM43304i = new b450(i3, i4, 1);
        }
        int i5 = z350VarM43304i.f278780c;
        int i6 = z350VarM43304i.f278779b;
        int i7 = z350VarM43304i.f278778a;
        if ((charSequence instanceof String) && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m88468R0(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G0 */
    public static int m88457G0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m88459I0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ int m88458H0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m88455E0(i, charSequence, str, z);
    }

    /* JADX INFO: renamed from: I0 */
    public static final int m88459I0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM88453C0 = m88453C0(charSequence);
        if (i > iM88453C0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (zn91.m96517E(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM88453C0) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static boolean m88460J0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!zn91.m96537Y(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public static char m88461K0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(m88453C0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: L0 */
    public static int m88462L0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m88453C0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iM88453C0 = m88453C0(charSequence);
        if (i > iM88453C0) {
            i = iM88453C0;
        }
        while (-1 < i) {
            if (zn91.m96517E(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: M0 */
    public static int m88463M0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m88453C0(charSequence);
        }
        int i3 = i;
        return !(charSequence instanceof String) ? m88456F0(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* JADX INFO: renamed from: N0 */
    public static ek5 m88464N0(String str) {
        return new ek5(str, 7);
    }

    /* JADX INFO: renamed from: O0 */
    public static List m88465O0(String str) {
        ql80 ql80Var = new ql80(str);
        if (!ql80Var.hasNext()) {
            return lau.f131415a;
        }
        Object next = ql80Var.next();
        if (!ql80Var.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (ql80Var.hasNext()) {
            arrayList.add(ql80Var.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static String m88466P0(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: Q0 */
    public static String m88467Q0(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: R0 */
    public static final boolean m88468R0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!zn91.m96517E(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public static String m88469S0(String str, String str2) {
        return m88479c1(str, str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: T0 */
    public static String m88470T0(String str, String str2) {
        return m88451A0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX INFO: renamed from: U0 */
    public static String m88471U0(String str) {
        return m88472V0(str, "\"", "\"");
    }

    /* JADX INFO: renamed from: V0 */
    public static String m88472V0(String str, String str2, String str3) {
        return (str.length() >= str3.length() + str2.length() && m88479c1(str, str2) && m88451A0(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    /* JADX INFO: renamed from: W0 */
    public static StringBuilder m88473W0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(edb.m38560i(i2, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: X0 */
    public static final void m88474X0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "Limit must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static final List m88475Y0(int i, CharSequence charSequence, String str, boolean z) {
        m88474X0(i);
        int length = 0;
        int iM88455E0 = m88455E0(0, charSequence, str, z);
        if (iM88455E0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iM88455E0).toString());
            length = str.length() + iM88455E0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM88455E0 = m88455E0(length, charSequence, str, z);
        } while (iM88455E0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: Z0 */
    public static List m88476Z0(CharSequence charSequence, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (cArr.length == 1) {
            return m88475Y0(i2, charSequence, String.valueOf(cArr[0]), false);
        }
        m88474X0(i2);
        xpq<b450> xpqVar = new xpq(charSequence, i2, new nk4(cArr, 20));
        ArrayList arrayList = new ArrayList(i6f.m49804T(new dk5(xpqVar, 2), 10));
        for (b450 b450Var : xpqVar) {
            arrayList.add(charSequence.subSequence(b450Var.f278778a, b450Var.f278779b + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a1 */
    public static List m88477a1(CharSequence charSequence, String[] strArr, int i, int i2) {
        boolean z = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m88475Y0(i, charSequence, str, z);
            }
        }
        m88474X0(i);
        xpq<b450> xpqVar = new xpq(charSequence, i, new mtk(Arrays.asList(strArr), z, 3));
        ArrayList arrayList = new ArrayList(i6f.m49804T(new dk5(xpqVar, 2), 10));
        for (b450 b450Var : xpqVar) {
            arrayList.add(charSequence.subSequence(b450Var.f278778a, b450Var.f278779b + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b1 */
    public static boolean m88478b1(String str, char c) {
        return str.length() > 0 && zn91.m96517E(str.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: c1 */
    public static boolean m88479c1(String str, CharSequence charSequence) {
        return (str == null || !(charSequence instanceof String)) ? m88468R0(str, 0, charSequence, 0, charSequence.length(), false) : bm51.m29803n0(str, (String) charSequence, false);
    }

    /* JADX INFO: renamed from: d1 */
    public static String m88480d1(char c, String str, String str2) {
        int iM88457G0 = m88457G0(str, c, 0, 6);
        return iM88457G0 == -1 ? str2 : str.substring(iM88457G0 + 1, str.length());
    }

    /* JADX INFO: renamed from: e1 */
    public static String m88481e1(String str, String str2, String str3) {
        int iM88458H0 = m88458H0(str, str2, 0, false, 6);
        return iM88458H0 == -1 ? str3 : str.substring(str2.length() + iM88458H0, str.length());
    }

    /* JADX INFO: renamed from: f1 */
    public static String m88482f1(char c, String str, String str2) {
        int iM88462L0 = m88462L0(str, c, 0, 6);
        return iM88462L0 == -1 ? str2 : str.substring(iM88462L0 + 1, str.length());
    }

    /* JADX INFO: renamed from: h1 */
    public static String m88484h1(String str, String str2) {
        int iM88463M0 = m88463M0(str, str2, 0, 6);
        return iM88463M0 == -1 ? str : str.substring(str2.length() + iM88463M0, str.length());
    }

    /* JADX INFO: renamed from: i1 */
    public static String m88485i1(String str, char c) {
        int iM88457G0 = m88457G0(str, c, 0, 6);
        return iM88457G0 == -1 ? str : str.substring(0, iM88457G0);
    }

    /* JADX INFO: renamed from: j1 */
    public static String m88486j1(String str, String str2) {
        int iM88458H0 = m88458H0(str, str2, 0, false, 6);
        return iM88458H0 == -1 ? str : str.substring(0, iM88458H0);
    }

    /* JADX INFO: renamed from: k1 */
    public static String m88487k1(String str, char c) {
        int iM88462L0 = m88462L0(str, c, 0, 6);
        return iM88462L0 == -1 ? str : str.substring(0, iM88462L0);
    }

    /* JADX INFO: renamed from: l1 */
    public static CharSequence m88488l1(int i, CharSequence charSequence) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested character count ", i, " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX INFO: renamed from: m1 */
    public static String m88489m1(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: n1 */
    public static Boolean m88490n1(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public static CharSequence m88491o1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM96537Y = zn91.m96537Y(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM96537Y) {
                    break;
                }
                length--;
            } else if (zM96537Y) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: p1 */
    public static String m88492p1(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM29617j0 = bk5.m29617j0(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zM29617j0) {
                    break;
                }
                length--;
            } else if (zM29617j0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    /* JADX INFO: renamed from: q1 */
    public static CharSequence m88493q1(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!zn91.m96537Y(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static String m88494r1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!bk5.m29617j0(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: s1 */
    public static String m88495s1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!bk5.m29617j0(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m88496t0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m88458H0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m88456F0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m88497u0(CharSequence charSequence, char c) {
        return m88457G0(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: w0 */
    public static final boolean m88499w0(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("wrapped-share");
        }
        if (str != "wrapped-share") {
            if (str != null && str.length() == 13) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (zn91.m96517E(str.charAt(i), "wrapped-share".charAt(i), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static String m88500x0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: y0 */
    public static String m88501y0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m88489m1(length, str);
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m88502z0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && zn91.m96517E(charSequence.charAt(m88453C0(charSequence)), c, false);
    }
}
