package p204p;

import com.google.common.p007io.BaseEncoding$DecodingException;

/* JADX INFO: loaded from: classes.dex */
public final class uy8 extends vy8 {
    public uy8(String str, String str2) {
        this(new sy8(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p204p.vy8, p204p.wy8
    /* JADX INFO: renamed from: b */
    public final int mo81952b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceMo86711e = mo86711e(charSequence);
        int length = charSequenceMo86711e.length();
        sy8 sy8Var = this.f246000c;
        if (!sy8Var.f215184h[length % sy8Var.f215181e]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceMo86711e.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo86711e.length()) {
            int i3 = i + 2;
            int iM79676a = (sy8Var.m79676a(charSequenceMo86711e.charAt(i + 1)) << 12) | (sy8Var.m79676a(charSequenceMo86711e.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM79676a >>> 16);
            if (i3 < charSequenceMo86711e.length()) {
                int i5 = i + 3;
                int iM79676a2 = iM79676a | (sy8Var.m79676a(charSequenceMo86711e.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM79676a2 >>> 8) & 255);
                if (i5 < charSequenceMo86711e.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM79676a2 | sy8Var.m79676a(charSequenceMo86711e.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p204p.vy8, p204p.wy8
    /* JADX INFO: renamed from: d */
    public final void mo81953d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        c95.m31852r(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            sy8 sy8Var = this.f246000c;
            char[] cArr = sy8Var.f215178b;
            char[] cArr2 = sy8Var.f215178b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m86712f(i2, i - i2, sb, bArr);
        }
    }

    @Override // p204p.vy8
    /* JADX INFO: renamed from: h */
    public final wy8 mo81954h(sy8 sy8Var, Character ch) {
        return new uy8(sy8Var, ch);
    }

    public uy8(sy8 sy8Var, Character ch) {
        super(sy8Var, ch);
        c95.m31843i(sy8Var.f215178b.length == 64);
    }
}
