package p204p;

import com.google.android.recaptcha.internal.zzrt;

/* JADX INFO: loaded from: classes4.dex */
public final class a0h1 extends f0h1 {
    public a0h1(String str, String str2) {
        wzg1 wzg1Var = new wzg1(str, str2.toCharArray());
        super(wzg1Var, (Character) '=');
        if (wzg1Var.f256593b.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p204p.f0h1
    /* JADX INFO: renamed from: a */
    public final void mo24363a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        bnf1.m29987w(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.f64655a.f256593b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            m40483b(i2, i - i2, sb, bArr);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m24364g(byte[] bArr, CharSequence charSequence) throws zzrt {
        CharSequence charSequenceM40484c = m40484c(charSequence);
        int length = charSequenceM40484c.length();
        wzg1 wzg1Var = this.f64655a;
        if (!wzg1Var.f256599h[length % wzg1Var.f256596e]) {
            int length2 = charSequenceM40484c.length();
            throw new zzrt(s571.m77248g(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceM40484c.length()) {
            int i3 = i2 + 1;
            int iM89456a = (wzg1Var.m89456a(charSequenceM40484c.charAt(i + 1)) << 12) | (wzg1Var.m89456a(charSequenceM40484c.charAt(i)) << 18);
            bArr[i2] = (byte) (iM89456a >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceM40484c.length()) {
                int i5 = i + 3;
                int iM89456a2 = iM89456a | (wzg1Var.m89456a(charSequenceM40484c.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iM89456a2 >>> 8) & 255);
                if (i5 < charSequenceM40484c.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM89456a2 | wzg1Var.m89456a(charSequenceM40484c.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }
}
