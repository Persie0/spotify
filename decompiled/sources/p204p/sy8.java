package p204p;

import com.google.common.p007io.BaseEncoding$DecodingException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sy8 {

    /* JADX INFO: renamed from: a */
    public final String f215177a;

    /* JADX INFO: renamed from: b */
    public final char[] f215178b;

    /* JADX INFO: renamed from: c */
    public final int f215179c;

    /* JADX INFO: renamed from: d */
    public final int f215180d;

    /* JADX INFO: renamed from: e */
    public final int f215181e;

    /* JADX INFO: renamed from: f */
    public final int f215182f;

    /* JADX INFO: renamed from: g */
    public final byte[] f215183g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f215184h;

    /* JADX INFO: renamed from: i */
    public final boolean f215185i;

    public sy8(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f215177a = str;
        cArr.getClass();
        this.f215178b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM72079J = q3d0.m72079J(length);
            this.f215180d = iM72079J;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM72079J);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f215181e = i;
            this.f215182f = iM72079J >> iNumberOfTrailingZeros;
            this.f215179c = cArr.length - 1;
            this.f215183g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f215182f; i2++) {
                int i3 = this.f215180d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[q3d0.m72110u(i2 * 8, i3)] = true;
            }
            this.f215184h = zArr;
            this.f215185i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m79676a(char c) throws BaseEncoding$DecodingException {
        if (c > 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.f215183g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new BaseEncoding$DecodingException(dq60.m36612l("Unrecognized character: ", c));
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sy8)) {
            return false;
        }
        sy8 sy8Var = (sy8) obj;
        return this.f215185i == sy8Var.f215185i && Arrays.equals(this.f215178b, sy8Var.f215178b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f215178b) + (this.f215185i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f215177a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sy8(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    throw new IllegalArgumentException(vie1.m85638t("Duplicate character: %s", Character.valueOf(c)));
                }
            } else {
                throw new IllegalArgumentException(vie1.m85638t("Non-ASCII character: %s", Character.valueOf(c)));
            }
        }
        this(str, cArr, bArr, false);
    }
}
