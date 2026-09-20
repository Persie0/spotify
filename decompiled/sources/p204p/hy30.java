package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class hy30 extends j9g1 {

    /* JADX INFO: renamed from: f */
    public static final int[] f96448f = {1, 1, 1, 1};

    /* JADX INFO: renamed from: g */
    public static final int[] f96449g = {3, 1, 1};

    /* JADX INFO: renamed from: h */
    public static final int[][] f96450h = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f96451e;

    public /* synthetic */ hy30(int i) {
        this.f96451e = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m49113s(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m49114t(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* JADX INFO: renamed from: u */
    public static int m49115u(int i, String str) {
        char cCharAt;
        int length = str.length();
        if (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == 241) {
                return 4;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (cCharAt = str.charAt(i2)) >= '0' && cCharAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: v */
    public static void m49116v(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m49117w(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x029e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7 A[LOOP:4: B:82:0x01c5->B:83:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8 A[LOOP:5: B:86:0x01e6->B:87:0x01e8, LOOP_END] */
    @Override // p204p.j9g1
    /* JADX INFO: renamed from: i */
    public final boolean[] mo33506i(String str) {
        int i;
        int iM49115u;
        char cCharAt;
        int i2;
        int iCharAt;
        int[] iArr;
        int i3;
        int i4;
        boolean[] zArr;
        int[] iArr2;
        int iM52748f;
        int i5;
        int i6;
        String string = str;
        switch (this.f96451e) {
            case 0:
                int length = string.length();
                if (length % 2 != 0) {
                    throw new IllegalArgumentException("The length of the input should be even");
                }
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                boolean[] zArr2 = new boolean[(length * 9) + 9];
                int iM52748f2 = j9g1.m52748f(zArr2, 0, f96448f, true);
                for (int i7 = 0; i7 < length; i7 += 2) {
                    int iDigit = Character.digit(string.charAt(i7), 10);
                    int iDigit2 = Character.digit(string.charAt(i7 + 1), 10);
                    int[] iArr3 = new int[10];
                    for (int i8 = 0; i8 < 5; i8++) {
                        int i9 = i8 * 2;
                        int[][] iArr4 = f96450h;
                        iArr3[i9] = iArr4[iDigit][i8];
                        iArr3[i9 + 1] = iArr4[iDigit2][i8];
                    }
                    iM52748f2 += j9g1.m52748f(zArr2, iM52748f2, iArr3, true);
                }
                j9g1.m52748f(zArr2, iM52748f2, f96449g, true);
                return zArr2;
            case 1:
                int[][] iArr5 = awe.f20490e;
                int length2 = string.length();
                if (length2 <= 0 || length2 > 80) {
                    throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                }
                for (int i10 = 0; i10 < length2; i10++) {
                    char cCharAt2 = string.charAt(i10);
                    switch (cCharAt2) {
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                            break;
                        default:
                            if (cCharAt2 > 127) {
                                throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                            }
                            break;
                            break;
                    }
                }
                ArrayList<int[]> arrayList = new ArrayList();
                int i11 = 1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < length2) {
                    int iM49115u2 = m49115u(i12, string);
                    if (iM49115u2 == 2) {
                        i = 100;
                    } else if (iM49115u2 != 1) {
                        i = 99;
                        if (i14 != 99) {
                            if (i14 == 100) {
                                if (iM49115u2 != 4 && (iM49115u = m49115u(i12 + 2, string)) != 1 && iM49115u != 2) {
                                    if (iM49115u != 4) {
                                        int i15 = i12 + 4;
                                        while (true) {
                                            int iM49115u3 = m49115u(i15, string);
                                            if (iM49115u3 == 3) {
                                                i15 += 2;
                                            } else if (iM49115u3 != 2) {
                                                i = 99;
                                            }
                                        }
                                    } else if (m49115u(i12 + 3, string) == 3) {
                                        i = 99;
                                    }
                                }
                                i = 100;
                            } else {
                                if (iM49115u2 == 4) {
                                    iM49115u2 = m49115u(i12 + 1, string);
                                }
                                if (iM49115u2 == 3) {
                                    i = 99;
                                } else {
                                    i = 100;
                                }
                            }
                        }
                    } else if (i12 >= string.length() || ((cCharAt = string.charAt(i12)) >= ' ' && (i14 != 101 || cCharAt >= '`'))) {
                        i = 100;
                    } else {
                        i = 101;
                    }
                    if (i == i14) {
                        switch (string.charAt(i12)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                iCharAt = i14 == 101 ? 101 : 100;
                                break;
                            default:
                                if (i14 == 100) {
                                    iCharAt = string.charAt(i12) - ' ';
                                } else if (i14 != 101) {
                                    iCharAt = Integer.parseInt(string.substring(i12, i12 + 2));
                                    i12++;
                                } else {
                                    char cCharAt3 = string.charAt(i12);
                                    iCharAt = cCharAt3 - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt3 + '@';
                                    }
                                }
                                break;
                        }
                        i12++;
                    } else {
                        if (i14 != 0) {
                            i2 = i;
                        } else if (i != 100) {
                            i2 = i != 101 ? 105 : 103;
                        } else {
                            i2 = 104;
                        }
                        i14 = i;
                        iCharAt = i2;
                    }
                    arrayList.add(iArr5[iCharAt]);
                    i13 += iCharAt * i11;
                    if (i12 != 0) {
                        i11++;
                    }
                }
                arrayList.add(iArr5[i13 % 103]);
                arrayList.add(iArr5[106]);
                int i16 = 0;
                for (int[] iArr6 : arrayList) {
                    for (int i17 : iArr6) {
                        i16 += i17;
                    }
                }
                boolean[] zArr3 = new boolean[i16];
                Iterator it = arrayList.iterator();
                int iM52748f3 = 0;
                while (it.hasNext()) {
                    iM52748f3 += j9g1.m52748f(zArr3, iM52748f3, (int[]) it.next(), true);
                }
                return zArr3;
            case 2:
                int[] iArr7 = awe.f20491f;
                int length3 = string.length();
                if (length3 > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                }
                for (int i18 = 0; i18 < length3; i18++) {
                    if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i18)) < 0) {
                        int length4 = string.length();
                        StringBuilder sb = new StringBuilder();
                        for (int i19 = 0; i19 < length4; i19++) {
                            char cCharAt4 = string.charAt(i19);
                            if (cCharAt4 == 0) {
                                sb.append("%U");
                            } else if (cCharAt4 == ' ') {
                                sb.append(cCharAt4);
                            } else if (cCharAt4 == '@') {
                                sb.append("%V");
                            } else if (cCharAt4 == '`') {
                                sb.append("%W");
                            } else if (cCharAt4 == '-' || cCharAt4 == '.') {
                                sb.append(cCharAt4);
                            } else if (cCharAt4 <= 26) {
                                sb.append('$');
                                sb.append((char) (cCharAt4 + '@'));
                            } else if (cCharAt4 < ' ') {
                                sb.append('%');
                                sb.append((char) (cCharAt4 + '&'));
                            } else if (cCharAt4 <= ',' || cCharAt4 == '/' || cCharAt4 == ':') {
                                sb.append('/');
                                sb.append((char) (cCharAt4 + ' '));
                            } else if (cCharAt4 <= '9') {
                                sb.append(cCharAt4);
                            } else if (cCharAt4 <= '?') {
                                sb.append('%');
                                sb.append((char) (cCharAt4 + 11));
                            } else if (cCharAt4 <= 'Z') {
                                sb.append(cCharAt4);
                            } else if (cCharAt4 <= '_') {
                                sb.append('%');
                                sb.append((char) (cCharAt4 - 16));
                            } else if (cCharAt4 <= 'z') {
                                sb.append('+');
                                sb.append((char) (cCharAt4 - ' '));
                            } else {
                                if (cCharAt4 > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + string.charAt(i19) + "'");
                                }
                                sb.append('%');
                                sb.append((char) (cCharAt4 - '+'));
                            }
                        }
                        string = sb.toString();
                        length3 = string.length();
                        if (length3 > 80) {
                            throw new IllegalArgumentException(edb.m38563l("Requested contents should be less than 80 digits long, but got ", length3, " (extended full ASCII mode)"));
                        }
                        iArr = new int[9];
                        i3 = length3 + 25;
                        for (i4 = 0; i4 < length3; i4++) {
                            m49116v(iArr, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i4))]);
                            for (i6 = 0; i6 < 9; i6++) {
                                i3 += iArr[i6];
                            }
                        }
                        zArr = new boolean[i3];
                        m49116v(iArr, 148);
                        int iM52748f4 = j9g1.m52748f(zArr, 0, iArr, true);
                        iArr2 = new int[]{1};
                        iM52748f = j9g1.m52748f(zArr, iM52748f4, iArr2, false) + iM52748f4;
                        for (i5 = 0; i5 < length3; i5++) {
                            m49116v(iArr, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i5))]);
                            int iM52748f5 = j9g1.m52748f(zArr, iM52748f, iArr, true) + iM52748f;
                            iM52748f = j9g1.m52748f(zArr, iM52748f5, iArr2, false) + iM52748f5;
                        }
                        m49116v(iArr, 148);
                        j9g1.m52748f(zArr, iM52748f, iArr, true);
                        return zArr;
                    }
                }
                iArr = new int[9];
                i3 = length3 + 25;
                while (i4 < length3) {
                    m49116v(iArr, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i4))]);
                    while (i6 < 9) {
                        i3 += iArr[i6];
                    }
                }
                zArr = new boolean[i3];
                m49116v(iArr, 148);
                int iM52748f6 = j9g1.m52748f(zArr, 0, iArr, true);
                iArr2 = new int[]{1};
                iM52748f = j9g1.m52748f(zArr, iM52748f6, iArr2, false) + iM52748f6;
                while (i5 < length3) {
                    m49116v(iArr, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i5))]);
                    int iM52748f7 = j9g1.m52748f(zArr, iM52748f, iArr, true) + iM52748f;
                    iM52748f = j9g1.m52748f(zArr, iM52748f7, iArr2, false) + iM52748f7;
                }
                m49116v(iArr, 148);
                j9g1.m52748f(zArr, iM52748f, iArr, true);
                return zArr;
            default:
                int length5 = string.length();
                if (length5 > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                }
                int i20 = 9;
                int[] iArr8 = new int[9];
                int length6 = ((string.length() + 4) * 9) + 1;
                m49117w(iArr8, bwe.f31641e[47]);
                boolean[] zArr4 = new boolean[length6];
                m49113s(zArr4, 0, iArr8);
                for (int i21 = 0; i21 < length5; i21++) {
                    m49117w(iArr8, bwe.f31641e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(i21))]);
                    m49113s(zArr4, i20, iArr8);
                    i20 += 9;
                }
                int iM49114t = m49114t(20, string);
                int[] iArr9 = bwe.f31641e;
                m49117w(iArr8, iArr9[iM49114t]);
                m49113s(zArr4, i20, iArr8);
                StringBuilder sbM36620t = dq60.m36620t(string);
                sbM36620t.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM49114t));
                m49117w(iArr8, iArr9[m49114t(15, sbM36620t.toString())]);
                m49113s(zArr4, i20 + 9, iArr8);
                m49117w(iArr8, iArr9[47]);
                m49113s(zArr4, i20 + 18, iArr8);
                zArr4[i20 + 27] = true;
                return zArr4;
        }
    }

    @Override // p204p.j9g1, p204p.pfe1
    /* JADX INFO: renamed from: n */
    public final fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        switch (this.f96451e) {
            case 0:
                if (i == 9) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode ITF, but got ".concat(edb.m38548D(i)));
            case 1:
                if (i == 5) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(edb.m38548D(i)));
            case 2:
                if (i == 3) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(edb.m38548D(i)));
            default:
                if (i == 4) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(edb.m38548D(i)));
        }
    }
}
