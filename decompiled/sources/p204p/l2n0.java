package p204p;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class l2n0 {

    /* JADX INFO: renamed from: d */
    public static final char[] f129050d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f129051e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final hg40 f129052f = hg40.m47411w(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g */
    public static final AtomicReference f129053g = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public byte[] f129054a;

    /* JADX INFO: renamed from: b */
    public int f129055b;

    /* JADX INFO: renamed from: c */
    public int f129056c;

    public l2n0() {
        this.f129054a = h0b1.f86201b;
    }

    /* JADX INFO: renamed from: c */
    public static int m57910c(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return k0e1.m55000v((byte) 0, bga.m29095q(((i & 7) << 2) | ((i2 & 48) >> 4)), bga.m29095q(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), bga.m29095q(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    /* JADX INFO: renamed from: g */
    public static int m57911g(Charset charset) {
        c95.m31845k(f129052f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m57912h(byte b) {
        return (b & MessagePack.Code.NIL) == 128;
    }

    /* JADX INFO: renamed from: A */
    public final String m57913A(int i) {
        Boolean bool = (Boolean) f129053g.get();
        if ((bool != null ? bool.booleanValue() : k2n0.f118672a) && m57932a() < i) {
            StringBuilder sbM56838j = klh.m56838j(i, "bytesNeeded= ", ", bytesLeft=");
            sbM56838j.append(m57932a());
            throw new StringIndexOutOfBoundsException(sbM56838j.toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = this.f129055b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f129056c || this.f129054a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f129054a;
        String str = h0b1.f86200a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f129055b += i;
        return str2;
    }

    /* JADX INFO: renamed from: B */
    public final short m57914B() {
        m57938j(2);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f129055b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: C */
    public final String m57915C(int i, Charset charset) {
        Boolean bool = (Boolean) f129053g.get();
        if (!(bool != null ? bool.booleanValue() : k2n0.f118672a) || m57932a() >= i) {
            String str = new String(this.f129054a, this.f129055b, i, charset);
            this.f129055b += i;
            return str;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "bytesNeeded= ", ", bytesLeft=");
        sbM56838j.append(m57932a());
        throw new StringIndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: D */
    public final int m57916D() {
        return (m57917E() << 21) | (m57917E() << 14) | (m57917E() << 7) | m57917E();
    }

    /* JADX INFO: renamed from: E */
    public final int m57917E() {
        m57938j(1);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        this.f129055b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: F */
    public final int m57918F() {
        m57938j(4);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f129055b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f129055b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: G */
    public final long m57919G() {
        m57938j(4);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f129055b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f129055b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f129055b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: H */
    public final int m57920H() {
        m57938j(3);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f129055b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f129055b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: I */
    public final int m57921I() {
        int iM57945q = m57945q();
        if (iM57945q >= 0) {
            return iM57945q;
        }
        throw new IllegalStateException(s571.m77246e(iM57945q, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: J */
    public final int m57922J() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f129055b == this.f129056c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM57917E = m57917E();
            j |= (127 & jM57917E) << (i * 7);
            if ((jM57917E & 128) == 0) {
                break;
            }
        }
        return k0e1.m54992k(j);
    }

    /* JADX INFO: renamed from: K */
    public final long m57923K() {
        long jM57953y = m57953y();
        if (jM57953y >= 0) {
            return jM57953y;
        }
        throw new IllegalStateException(edb.m38561j(jM57953y, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: L */
    public final int m57924L() {
        m57938j(2);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f129055b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: M */
    public final long m57925M() {
        int i;
        m57938j(1);
        long j = this.f129054a[this.f129055b];
        int i2 = 7;
        while (true) {
            if (i2 >= 0) {
                int i3 = 1 << i2;
                if ((((long) i3) & j) == 0) {
                    if (i2 < 6) {
                        j &= (long) (i3 - 1);
                        i = 7 - i2;
                        break;
                    }
                    if (i2 == 7) {
                        i = 1;
                        break;
                    }
                } else {
                    i2--;
                }
            }
            i = 0;
            break;
        }
        if (i == 0) {
            throw new NumberFormatException(edb.m38561j(j, "Invalid UTF-8 sequence first byte: "));
        }
        m57938j(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.f129054a[this.f129055b + i4];
            if ((b & MessagePack.Code.NIL) != 128) {
                throw new NumberFormatException(edb.m38561j(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f129055b += i;
        return j;
    }

    /* JADX INFO: renamed from: N */
    public final Charset m57926N() {
        if (m57932a() >= 3) {
            byte[] bArr = this.f129054a;
            int i = this.f129055b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f129055b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m57932a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f129054a;
        int i2 = this.f129055b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f129055b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f129055b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: O */
    public final void m57927O(int i) {
        byte[] bArr = this.f129054a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m57928P(bArr, i);
    }

    /* JADX INFO: renamed from: P */
    public final void m57928P(byte[] bArr, int i) {
        this.f129054a = bArr;
        this.f129056c = i;
        this.f129055b = 0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m57929Q(int i) {
        c95.m31843i(i >= 0 && i <= this.f129054a.length);
        this.f129056c = i;
    }

    /* JADX INFO: renamed from: R */
    public final void m57930R(int i) {
        c95.m31843i(i >= 0 && i <= this.f129056c);
        this.f129055b = i;
    }

    /* JADX INFO: renamed from: S */
    public final void m57931S(int i) {
        m57930R(this.f129055b + i);
    }

    /* JADX INFO: renamed from: a */
    public final int m57932a() {
        return Math.max(this.f129056c - this.f129055b, 0);
    }

    /* JADX INFO: renamed from: b */
    public final int m57933b() {
        return this.f129054a.length;
    }

    /* JADX INFO: renamed from: d */
    public final void m57934d(int i) {
        byte[] bArr = this.f129054a;
        if (i > bArr.length) {
            this.f129054a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m57935e() {
        return this.f129054a;
    }

    /* JADX INFO: renamed from: f */
    public final int m57936f() {
        return this.f129055b;
    }

    /* JADX INFO: renamed from: i */
    public final int m57937i() {
        return this.f129056c;
    }

    /* JADX INFO: renamed from: j */
    public final void m57938j(int i) {
        Boolean bool = (Boolean) f129053g.get();
        if (!(bool != null ? bool.booleanValue() : k2n0.f118672a) || m57932a() >= i) {
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "bytesNeeded= ", ", bytesLeft=");
        sbM56838j.append(m57932a());
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: k */
    public final char m57939k(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        m57938j(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f129054a;
            int i2 = this.f129055b + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.f129054a;
            int i3 = this.f129055b + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: l */
    public final int m57940l(Charset charset) {
        int codePoint;
        int i;
        int iM57910c;
        c95.m31845k(f129052f.contains(charset), "Unsupported charset: %s", charset);
        if (m57932a() < m57911g(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f129055b + ", limit=" + this.f129056c);
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f129054a[this.f129055b];
            if ((b & 128) != 0) {
                return 0;
            }
            codePoint = b & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.f129054a[this.f129055b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & MessagePack.Code.NEGFIXINT_PREFIX) == 192 && m57932a() >= 2 && m57912h(this.f129054a[this.f129055b + 1])) {
                i = 2;
            } else if ((this.f129054a[this.f129055b] & 240) == 224 && m57932a() >= 3 && m57912h(this.f129054a[this.f129055b + 1]) && m57912h(this.f129054a[this.f129055b + 2])) {
                i = 3;
            } else {
                i = ((this.f129054a[this.f129055b] & 248) == 240 && m57932a() >= 4 && m57912h(this.f129054a[this.f129055b + 1]) && m57912h(this.f129054a[this.f129055b + 2]) && m57912h(this.f129054a[this.f129055b + 3])) ? 4 : 0;
            }
            if (i == 1) {
                iM57910c = this.f129054a[this.f129055b] & 255;
            } else if (i == 2) {
                byte[] bArr = this.f129054a;
                int i3 = this.f129055b;
                iM57910c = m57910c(0, 0, bArr[i3], bArr[i3 + 1]);
            } else if (i == 3) {
                byte[] bArr2 = this.f129054a;
                int i4 = this.f129055b;
                iM57910c = m57910c(0, bArr2[i4] & 15, bArr2[i4 + 1], bArr2[i4 + 2]);
            } else {
                if (i != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f129054a;
                int i5 = this.f129055b;
                iM57910c = m57910c(bArr3[i5], bArr3[i5 + 1], bArr3[i5 + 2], bArr3[i5 + 3]);
            }
            i2 = i;
            codePoint = iM57910c;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM57939k = m57939k(0, byteOrder);
            if (!Character.isHighSurrogate(cM57939k) || m57932a() < 4) {
                codePoint = cM57939k;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cM57939k, m57939k(2, byteOrder));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    /* JADX INFO: renamed from: m */
    public final int m57941m() {
        if (m57932a() >= 4) {
            int iM57945q = m57945q();
            this.f129055b -= 4;
            return iM57945q;
        }
        throw new IndexOutOfBoundsException("position=" + this.f129055b + ", limit=" + this.f129056c);
    }

    /* JADX INFO: renamed from: n */
    public final int m57942n() {
        m57938j(1);
        return this.f129054a[this.f129055b] & 255;
    }

    /* JADX INFO: renamed from: o */
    public final void m57943o(int i, byte[] bArr, int i2) {
        m57938j(i2);
        System.arraycopy(this.f129054a, this.f129055b, bArr, i, i2);
        this.f129055b += i2;
    }

    /* JADX INFO: renamed from: p */
    public final char m57944p(Charset charset, char[] cArr) {
        int iM57940l;
        if (m57932a() >= m57911g(charset) && (iM57940l = m57940l(charset)) != 0) {
            long j = iM57940l >>> 8;
            c95.m31840f(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                c95.m31840f(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f129055b = k0e1.m54992k(iM57940l & 255) + this.f129055b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: q */
    public final int m57945q() {
        m57938j(4);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f129055b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f129055b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f129055b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final String m57946r(Charset charset) {
        int i;
        byte[] bArr;
        c95.m31845k(f129052f.contains(charset), "Unsupported charset: %s", charset);
        if (m57932a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m57926N();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f129055b;
        while (true) {
            int i3 = this.f129056c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && h0b1.m46290R(this.f129054a[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f129054a;
                if (bArr2[i2] == 0 && h0b1.m46290R(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f129054a;
                    if (bArr[i2 + 1] == 0 && h0b1.m46290R(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f129054a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM57915C = m57915C(i2 - this.f129055b, charset);
        if (this.f129055b != this.f129056c && m57944p(charset, f129050d) == '\r') {
            m57944p(charset, f129051e);
        }
        return strM57915C;
    }

    /* JADX INFO: renamed from: s */
    public final int m57947s() {
        m57938j(4);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f129055b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f129055b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f129055b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: t */
    public final long m57948t() {
        m57938j(8);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f129055b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f129055b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f129055b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f129055b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f129055b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f129055b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f129055b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: u */
    public final short m57949u() {
        m57938j(2);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = bArr[i] & 255;
        this.f129055b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: v */
    public final long m57950v() {
        m57938j(4);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f129055b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f129055b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f129055b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: w */
    public final int m57951w() {
        int iM57947s = m57947s();
        if (iM57947s >= 0) {
            return iM57947s;
        }
        throw new IllegalStateException(s571.m77246e(iM57947s, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: x */
    public final int m57952x() {
        m57938j(2);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        int i3 = bArr[i] & 255;
        this.f129055b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: y */
    public final long m57953y() {
        m57938j(8);
        byte[] bArr = this.f129054a;
        int i = this.f129055b;
        int i2 = i + 1;
        this.f129055b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f129055b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f129055b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f129055b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f129055b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f129055b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f129055b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f129055b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: z */
    public final String m57954z() {
        if (m57932a() == 0) {
            return null;
        }
        int i = this.f129055b;
        while (i < this.f129056c && this.f129054a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f129054a;
        int i2 = this.f129055b;
        String str = h0b1.f86200a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f129055b = i;
        if (i < this.f129056c) {
            this.f129055b = i + 1;
        }
        return str2;
    }

    public l2n0(int i) {
        this.f129054a = new byte[i];
        this.f129056c = i;
    }

    public l2n0(byte[] bArr) {
        this.f129054a = bArr;
        this.f129056c = bArr.length;
    }

    public l2n0(byte[] bArr, int i) {
        this.f129054a = bArr;
        this.f129056c = i;
    }
}
