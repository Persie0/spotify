package p204p;

import com.google.common.p007io.BaseEncoding$DecodingException;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class wy8 {

    /* JADX INFO: renamed from: a */
    public static final uy8 f256229a = new uy8("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: b */
    public static final ty8 f256230b;

    static {
        new uy8("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new vy8("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new vy8("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f256230b = new ty8(new sy8("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m89349a(String str) {
        try {
            CharSequence charSequenceMo86711e = mo86711e(str);
            int length = (int) (((((long) ((vy8) this).f246000c.f215180d) * ((long) charSequenceMo86711e.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo81952b = mo81952b(bArr, charSequenceMo86711e);
            if (iMo81952b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo81952b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo81952b);
            return bArr2;
        } catch (BaseEncoding$DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo81952b(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: c */
    public final String m89350c(byte[] bArr, int i) {
        c95.m31852r(0, i, bArr.length);
        sy8 sy8Var = ((vy8) this).f246000c;
        int i2 = sy8Var.f215181e;
        int i3 = sy8Var.f215182f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(q3d0.m72110u(i, i3) * i2);
        try {
            mo81953d(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo81953d(StringBuilder sb, byte[] bArr, int i);

    /* JADX INFO: renamed from: e */
    public abstract CharSequence mo86711e(CharSequence charSequence);
}
