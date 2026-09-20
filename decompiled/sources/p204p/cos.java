package p204p;

import com.google.zxing.FormatException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cos extends j9g1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f40331e;

    public /* synthetic */ cos(int i) {
        this.f40331e = i;
    }

    @Override // p204p.j9g1
    /* JADX INFO: renamed from: i */
    public final boolean[] mo33506i(String str) {
        switch (this.f40331e) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = str + gs91.m45626r(str);
                    } catch (FormatException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    if (length != 13) {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    try {
                        if (!gs91.m45625q(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int i = bos.f29242j[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int iM52748f = j9g1.m52748f(zArr, 0, gs91.f83915e, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iM52748f += j9g1.m52748f(zArr, iM52748f, gs91.f83919i[iDigit], false);
                }
                int iM52748f2 = j9g1.m52748f(zArr, iM52748f, gs91.f83916f, false) + iM52748f;
                for (int i3 = 7; i3 <= 12; i3++) {
                    iM52748f2 += j9g1.m52748f(zArr, iM52748f2, gs91.f83918h[Character.digit(str.charAt(i3), 10)], true);
                }
                j9g1.m52748f(zArr, iM52748f2, gs91.f83915e, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = str + gs91.m45626r(str);
                    } catch (FormatException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    if (length2 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    try {
                        if (!gs91.m45625q(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused2) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int iM52748f3 = j9g1.m52748f(zArr2, 0, gs91.f83915e, true);
                for (int i4 = 0; i4 <= 3; i4++) {
                    iM52748f3 += j9g1.m52748f(zArr2, iM52748f3, gs91.f83918h[Character.digit(str.charAt(i4), 10)], false);
                }
                int iM52748f4 = j9g1.m52748f(zArr2, iM52748f3, gs91.f83916f, false) + iM52748f3;
                for (int i5 = 4; i5 <= 7; i5++) {
                    iM52748f4 += j9g1.m52748f(zArr2, iM52748f4, gs91.f83918h[Character.digit(str.charAt(i5), 10)], true);
                }
                j9g1.m52748f(zArr2, iM52748f4, gs91.f83915e, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = str + gs91.m45626r(bos.m30092s(str));
                    } catch (FormatException e3) {
                        throw new IllegalArgumentException(e3);
                    }
                } else {
                    if (length3 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    try {
                        if (!gs91.m45625q(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused3) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 != 0 && iDigit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i6 = bos.f29243k[iDigit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int iM52748f5 = j9g1.m52748f(zArr3, 0, gs91.f83915e, true);
                for (int i7 = 1; i7 <= 6; i7++) {
                    int iDigit3 = Character.digit(str.charAt(i7), 10);
                    if (((i6 >> (6 - i7)) & 1) == 1) {
                        iDigit3 += 10;
                    }
                    iM52748f5 += j9g1.m52748f(zArr3, iM52748f5, gs91.f83919i[iDigit3], false);
                }
                j9g1.m52748f(zArr3, iM52748f5, gs91.f83917g, false);
                return zArr3;
        }
    }

    @Override // p204p.j9g1
    /* JADX INFO: renamed from: j */
    public final int mo33507j() {
        return 9;
    }

    @Override // p204p.j9g1, p204p.pfe1
    /* JADX INFO: renamed from: n */
    public final fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        switch (this.f40331e) {
            case 0:
                if (i == 8) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(edb.m38548D(i)));
            case 1:
                if (i == 7) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(edb.m38548D(i)));
            default:
                if (i == 16) {
                    return super.mo33508n(str, i, 200, 200, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(edb.m38548D(i)));
        }
    }
}
