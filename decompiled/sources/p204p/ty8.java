package p204p;

import com.google.common.p007io.BaseEncoding$DecodingException;

/* JADX INFO: loaded from: classes.dex */
public final class ty8 extends vy8 {

    /* JADX INFO: renamed from: f */
    public final char[] f224871f;

    public ty8(sy8 sy8Var) {
        super(sy8Var, (Character) null);
        this.f224871f = new char[512];
        char[] cArr = sy8Var.f215178b;
        c95.m31843i(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f224871f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p204p.vy8, p204p.wy8
    /* JADX INFO: renamed from: b */
    public final int mo81952b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            sy8 sy8Var = this.f246000c;
            bArr[i2] = (byte) ((sy8Var.m79676a(cCharAt) << 4) | sy8Var.m79676a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p204p.vy8, p204p.wy8
    /* JADX INFO: renamed from: d */
    public final void mo81953d(StringBuilder sb, byte[] bArr, int i) {
        c95.m31852r(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f224871f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // p204p.vy8
    /* JADX INFO: renamed from: h */
    public final wy8 mo81954h(sy8 sy8Var, Character ch) {
        return new ty8(sy8Var);
    }
}
