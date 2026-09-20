package p204p;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class f0h1 {

    /* JADX INFO: renamed from: c */
    public static final a0h1 f64653c = new a0h1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: d */
    public static final a0h1 f64654d = new a0h1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: a */
    public final wzg1 f64655a;

    /* JADX INFO: renamed from: b */
    public final Character f64656b;

    static {
        new f0h1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new f0h1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        int i = yzg1.f277804a;
        wzg1 wzg1Var = new wzg1("base16()", "0123456789ABCDEF".toCharArray());
        new f0h1(wzg1Var, (Character) null);
        char[] cArr = wzg1Var.f256593b;
        char[] cArr2 = new char[512];
        if (!(cArr.length == 16)) {
            throw new IllegalArgumentException();
        }
        for (int i2 = 0; i2 < 256; i2++) {
            cArr2[i2] = cArr[i2 >>> 4];
            cArr2[i2 | 256] = cArr[i2 & 15];
        }
    }

    public f0h1(wzg1 wzg1Var, Character ch) {
        this.f64655a = wzg1Var;
        if (ch != null && wzg1Var.f256598g[61] != -1) {
            throw new IllegalArgumentException(jsf1.m54246s("Padding character %s was already in alphabet", ch));
        }
        this.f64656b = ch;
    }

    /* JADX INFO: renamed from: e */
    public static a0h1 m40481e() {
        return f64653c;
    }

    /* JADX INFO: renamed from: f */
    public static a0h1 m40482f() {
        return f64654d;
    }

    /* JADX INFO: renamed from: a */
    public void mo24363a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        bnf1.m29987w(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.f64655a.f256597f;
            m40483b(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m40483b(int i, int i2, StringBuilder sb, byte[] bArr) {
        bnf1.m29987w(i, i + i2, bArr.length);
        wzg1 wzg1Var = this.f64655a;
        int i3 = wzg1Var.f256597f;
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = wzg1Var.f256595d;
        while (i4 < i2 * 8) {
            sb.append(wzg1Var.f256593b[wzg1Var.f256594c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.f64656b != null) {
            while (i4 < i3 * 8) {
                sb.append('=');
                i4 += i7;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m40484c(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f64656b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: renamed from: d */
    public final String m40485d(byte[] bArr, int i) {
        bnf1.m29987w(0, i, bArr.length);
        wzg1 wzg1Var = this.f64655a;
        int i2 = wzg1Var.f256597f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(wzg1Var.f256596e * stf1.m79259s(i, i2));
        try {
            mo24363a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0h1) {
            f0h1 f0h1Var = (f0h1) obj;
            if (this.f64655a.equals(f0h1Var.f64655a) && Objects.equals(this.f64656b, f0h1Var.f64656b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f64655a.hashCode() ^ Objects.hashCode(this.f64656b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        wzg1 wzg1Var = this.f64655a;
        sb.append(wzg1Var);
        if (8 % wzg1Var.f256595d != 0) {
            Character ch = this.f64656b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public f0h1(String str, String str2) {
        this(new wzg1(str, str2.toCharArray()), (Character) '=');
    }
}
