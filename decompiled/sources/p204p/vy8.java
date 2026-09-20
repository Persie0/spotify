package p204p;

import com.google.common.p007io.BaseEncoding$DecodingException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class vy8 extends wy8 {

    /* JADX INFO: renamed from: c */
    public final sy8 f246000c;

    /* JADX INFO: renamed from: d */
    public final Character f246001d;

    /* JADX INFO: renamed from: e */
    public volatile wy8 f246002e;

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public vy8(sy8 sy8Var, Character ch) {
        boolean z;
        sy8Var.getClass();
        this.f246000c = sy8Var;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = sy8Var.f215183g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        c95.m31845k(z, "Padding character %s was already in alphabet", ch);
        this.f246001d = ch;
    }

    @Override // p204p.wy8
    /* JADX INFO: renamed from: b */
    public int mo81952b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceMo86711e = mo86711e(charSequence);
        int length = charSequenceMo86711e.length();
        sy8 sy8Var = this.f246000c;
        boolean[] zArr = sy8Var.f215184h;
        int i = sy8Var.f215180d;
        int i2 = sy8Var.f215181e;
        if (!zArr[length % i2]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceMo86711e.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceMo86711e.length(); i4 += i2) {
            long jM79676a = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM79676a <<= i;
                if (i4 + i6 < charSequenceMo86711e.length()) {
                    jM79676a |= (long) sy8Var.m79676a(charSequenceMo86711e.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = sy8Var.f215182f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM79676a >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // p204p.wy8
    /* JADX INFO: renamed from: d */
    public void mo81953d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        c95.m31852r(0, i, bArr.length);
        while (i2 < i) {
            sy8 sy8Var = this.f246000c;
            m86712f(i2, Math.min(sy8Var.f215182f, i - i2), sb, bArr);
            i2 += sy8Var.f215182f;
        }
    }

    @Override // p204p.wy8
    /* JADX INFO: renamed from: e */
    public final CharSequence mo86711e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f246001d;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vy8) {
            vy8 vy8Var = (vy8) obj;
            if (this.f246000c.equals(vy8Var.f246000c) && Objects.equals(this.f246001d, vy8Var.f246001d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m86712f(int i, int i2, StringBuilder sb, byte[] bArr) {
        c95.m31852r(i, i + i2, bArr.length);
        sy8 sy8Var = this.f246000c;
        int i3 = sy8Var.f215182f;
        int i4 = sy8Var.f215180d;
        int i5 = 0;
        c95.m31843i(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(sy8Var.f215178b[((int) (j >>> (i7 - i5))) & sy8Var.f215179c]);
            i5 += i4;
        }
        Character ch = this.f246001d;
        if (ch != null) {
            while (i5 < sy8Var.f215182f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[EDGE_INSN: B:46:0x00b6->B:48:0x00bc BREAK  A[LOOP:0: B:5:0x000b->B:47:0x00b8]] */
    /* JADX INFO: renamed from: g */
    public final wy8 m86713g() {
        boolean z;
        wy8 wy8VarMo81954h = this.f246002e;
        if (wy8VarMo81954h == null) {
            sy8 sy8Var = this.f246000c;
            char[] cArr = sy8Var.f215178b;
            for (char c : cArr) {
                if (vie1.m85635q(c)) {
                    int length = cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    c95.m31856v(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c3 = cArr[i2];
                        if (vie1.m85635q(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i2] = c3;
                    }
                    sy8 sy8Var2 = new sy8(dq60.m36616p(sy8Var.f215177a, ".lowerCase()", new StringBuilder()), cArr2);
                    if (!sy8Var.f215185i) {
                        sy8Var = sy8Var2;
                        break;
                    }
                    byte[] bArr = sy8Var2.f215183g;
                    if (!sy8Var2.f215185i) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i3 = 65; i3 <= 90; i3++) {
                            int i4 = i3 | 32;
                            byte b = bArr[i3];
                            byte b2 = bArr[i4];
                            if (b == -1) {
                                bArrCopyOf[i3] = b2;
                            } else {
                                char c4 = (char) i3;
                                char c5 = (char) i4;
                                if (!(b2 == -1)) {
                                    throw new IllegalStateException(vie1.m85638t("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                }
                                bArrCopyOf[i4] = b;
                            }
                        }
                        sy8Var = new sy8(dq60.m36616p(sy8Var2.f215177a, ".ignoreCase()", new StringBuilder()), sy8Var2.f215178b, bArrCopyOf, true);
                        break;
                    }
                    sy8Var = sy8Var2;
                    break;
                }
            }
            wy8VarMo81954h = sy8Var == this.f246000c ? this : mo81954h(sy8Var, this.f246001d);
            this.f246002e = wy8VarMo81954h;
        }
        return wy8VarMo81954h;
    }

    /* JADX INFO: renamed from: h */
    public wy8 mo81954h(sy8 sy8Var, Character ch) {
        return new vy8(sy8Var, ch);
    }

    public final int hashCode() {
        return this.f246000c.hashCode() ^ Objects.hashCode(this.f246001d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sy8 sy8Var = this.f246000c;
        sb.append(sy8Var);
        if (8 % sy8Var.f215180d != 0) {
            Character ch = this.f246001d;
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

    public vy8(String str, String str2) {
        this(new sy8(str, str2.toCharArray()), (Character) '=');
    }
}
