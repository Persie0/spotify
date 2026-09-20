package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes2.dex */
public final class npa implements gqa, fqa, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public gfz0 f156903a;

    /* JADX INFO: renamed from: b */
    public long f156904b;

    @Override // p204p.gqa
    /* JADX INFO: renamed from: A0 */
    public final void mo45414A0(long j) throws EOFException {
        if (this.f156904b < j) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: B */
    public final iva m65294B() {
        long j = this.f156904b;
        if (j <= 2147483647L) {
            return m65295D((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f156904b).toString());
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: B0 */
    public final /* bridge */ /* synthetic */ fqa mo42403B0(long j) {
        m65299K(j);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final iva m65295D(int i) {
        if (i == 0) {
            return iva.f106177d;
        }
        dul.m37008k(this.f156904b, 0L, i);
        gfz0 gfz0Var = this.f156903a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            wj50.m88279p(gfz0Var);
            int i5 = gfz0Var.f79491c;
            int i6 = gfz0Var.f79490b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            gfz0Var = gfz0Var.f79494f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        gfz0 gfz0Var2 = this.f156903a;
        int i7 = 0;
        while (i2 < i) {
            wj50.m88279p(gfz0Var2);
            bArr[i7] = gfz0Var2.f79489a;
            i2 += gfz0Var2.f79491c - gfz0Var2.f79490b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = gfz0Var2.f79490b;
            gfz0Var2.f79492d = true;
            i7++;
            gfz0Var2 = gfz0Var2.f79494f;
        }
        return new zgz0(bArr, iArr);
    }

    /* JADX INFO: renamed from: G */
    public final gfz0 m65296G(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            gfz0 gfz0VarM56375b = kgz0.m56375b();
            this.f156903a = gfz0VarM56375b;
            gfz0VarM56375b.f79495g = gfz0VarM56375b;
            gfz0VarM56375b.f79494f = gfz0VarM56375b;
            return gfz0VarM56375b;
        }
        gfz0 gfz0Var2 = gfz0Var.f79495g;
        wj50.m88279p(gfz0Var2);
        if (gfz0Var2.f79491c + i <= 8192 && gfz0Var2.f79493e) {
            return gfz0Var2;
        }
        gfz0 gfz0VarM56375b2 = kgz0.m56375b();
        gfz0Var2.m44641b(gfz0VarM56375b2);
        return gfz0VarM56375b2;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: H */
    public final long mo42404H(wt31 wt31Var) {
        long j = 0;
        while (true) {
            long jMo27348g1 = wt31Var.mo27348g1(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo27348g1 == -1) {
                return j;
            }
            j += jMo27348g1;
        }
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: H0 */
    public final int mo45415H0(hvl0 hvl0Var) throws EOFException {
        int iM27710d = AbstractC1686b.m27710d(this, hvl0Var, false);
        if (iM27710d == -1) {
            return -1;
        }
        skip(hvl0Var.f95747a[iM27710d].mo51747d());
        return iM27710d;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: H1 */
    public final InputStream mo45416H1() {
        return new mpa(this);
    }

    /* JADX INFO: renamed from: I */
    public final void m65297I(iva ivaVar) {
        ivaVar.mo51760s(this, ivaVar.mo51747d());
    }

    /* JADX INFO: renamed from: J */
    public final void m65298J(int i) {
        gfz0 gfz0VarM65296G = m65296G(1);
        byte[] bArr = gfz0VarM65296G.f79489a;
        int i2 = gfz0VarM65296G.f79491c;
        gfz0VarM65296G.f79491c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f156904b++;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: J0 */
    public final iva mo45417J0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount: ").toString());
        }
        if (this.f156904b < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new iva(m65314t(j));
        }
        iva ivaVarM65295D = m65295D((int) j);
        skip(j);
        return ivaVarM65295D;
    }

    /* JADX INFO: renamed from: K */
    public final void m65299K(long j) {
        boolean z;
        if (j == 0) {
            m65298J(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m65303P(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC1686b.f21714a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC1686b.f21715b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        gfz0 gfz0VarM65296G = m65296G(i);
        byte[] bArr2 = gfz0VarM65296G.f79489a;
        int i2 = gfz0VarM65296G.f79491c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = AbstractC1686b.f21714a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        gfz0VarM65296G.f79491c += i;
        this.f156904b += (long) i;
    }

    /* JADX INFO: renamed from: L */
    public final void m65300L(long j) {
        if (j == 0) {
            m65298J(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        gfz0 gfz0VarM65296G = m65296G(i);
        byte[] bArr = gfz0VarM65296G.f79489a;
        int i2 = gfz0VarM65296G.f79491c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC1686b.f21714a[(int) (15 & j)];
            j >>>= 4;
        }
        gfz0VarM65296G.f79491c += i;
        this.f156904b += (long) i;
    }

    /* JADX INFO: renamed from: M */
    public final void m65301M(int i) {
        gfz0 gfz0VarM65296G = m65296G(4);
        byte[] bArr = gfz0VarM65296G.f79489a;
        int i2 = gfz0VarM65296G.f79491c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        gfz0VarM65296G.f79491c = i2 + 4;
        this.f156904b += 4;
    }

    /* JADX INFO: renamed from: N */
    public final void m65302N(int i) {
        gfz0 gfz0VarM65296G = m65296G(2);
        byte[] bArr = gfz0VarM65296G.f79489a;
        int i2 = gfz0VarM65296G.f79491c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        gfz0VarM65296G.f79491c = i2 + 2;
        this.f156904b += 2;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: O0 */
    public final void mo45418O0(npa npaVar, long j) throws EOFException {
        long j2 = this.f156904b;
        if (j2 >= j) {
            npaVar.mo25160U0(this, j);
        } else {
            npaVar.mo25160U0(this, j2);
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m65303P(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(s571.m77247f(i2, "endIndex < beginIndex: ", i, " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM56838j = klh.m56838j(i2, "endIndex > string.length: ", " > ");
            sbM56838j.append(str.length());
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                gfz0 gfz0VarM65296G = m65296G(1);
                byte[] bArr = gfz0VarM65296G.f79489a;
                int i3 = gfz0VarM65296G.f79491c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = gfz0VarM65296G.f79491c;
                int i6 = (i3 + i) - i5;
                gfz0VarM65296G.f79491c = i5 + i6;
                this.f156904b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    gfz0 gfz0VarM65296G2 = m65296G(2);
                    byte[] bArr2 = gfz0VarM65296G2.f79489a;
                    int i7 = gfz0VarM65296G2.f79491c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    gfz0VarM65296G2.f79491c = i7 + 2;
                    this.f156904b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    gfz0 gfz0VarM65296G3 = m65296G(3);
                    byte[] bArr3 = gfz0VarM65296G3.f79489a;
                    int i8 = gfz0VarM65296G3.f79491c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    gfz0VarM65296G3.f79491c = i8 + 3;
                    this.f156904b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m65298J(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        gfz0 gfz0VarM65296G4 = m65296G(4);
                        byte[] bArr4 = gfz0VarM65296G4.f79489a;
                        int i11 = gfz0VarM65296G4.f79491c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        gfz0VarM65296G4.f79491c = i11 + 4;
                        this.f156904b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: P0 */
    public final byte[] mo45419P0() {
        return m65314t(this.f156904b);
    }

    /* JADX INFO: renamed from: Q */
    public final void m65304Q(String str) {
        m65303P(0, str.length(), str);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: R0 */
    public final boolean mo45420R0() {
        return this.f156904b == 0;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: S */
    public final String mo45421S(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM65310i = m65310i((byte) 10, 0L, j2);
        if (jM65310i != -1) {
            return AbstractC1686b.m27709c(this, jM65310i);
        }
        if (j2 < this.f156904b && m65309h(j2 - 1) == 13 && m65309h(j2) == 10) {
            return AbstractC1686b.m27709c(this, j2);
        }
        npa npaVar = new npa();
        m65308g(npaVar, 0L, Math.min(32, this.f156904b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f156904b, j) + " content=" + npaVar.mo45417J0(npaVar.f156904b).mo51748e() + (char) 8230);
    }

    /* JADX INFO: renamed from: U */
    public final void m65305U(int i) {
        if (i < 128) {
            m65298J(i);
            return;
        }
        if (i < 2048) {
            gfz0 gfz0VarM65296G = m65296G(2);
            byte[] bArr = gfz0VarM65296G.f79489a;
            int i2 = gfz0VarM65296G.f79491c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            gfz0VarM65296G.f79491c = i2 + 2;
            this.f156904b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m65298J(63);
            return;
        }
        if (i < 65536) {
            gfz0 gfz0VarM65296G2 = m65296G(3);
            byte[] bArr2 = gfz0VarM65296G2.f79489a;
            int i3 = gfz0VarM65296G2.f79491c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            gfz0VarM65296G2.f79491c = i3 + 3;
            this.f156904b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(dul.m36997G(i)));
        }
        gfz0 gfz0VarM65296G3 = m65296G(4);
        byte[] bArr3 = gfz0VarM65296G3.f79489a;
        int i4 = gfz0VarM65296G3.f79491c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        gfz0VarM65296G3.f79491c = i4 + 4;
        this.f156904b += 4;
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: U0 */
    public final void mo25160U0(npa npaVar, long j) {
        gfz0 gfz0VarM56375b;
        if (npaVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        dul.m37008k(npaVar.f156904b, 0L, j);
        while (j > 0) {
            gfz0 gfz0Var = npaVar.f156903a;
            wj50.m88279p(gfz0Var);
            int i = gfz0Var.f79491c;
            gfz0 gfz0Var2 = npaVar.f156903a;
            wj50.m88279p(gfz0Var2);
            long j2 = i - gfz0Var2.f79490b;
            int i2 = 0;
            if (j < j2) {
                gfz0 gfz0Var3 = this.f156903a;
                gfz0 gfz0Var4 = gfz0Var3 != null ? gfz0Var3.f79495g : null;
                if (gfz0Var4 != null && gfz0Var4.f79493e) {
                    if ((((long) gfz0Var4.f79491c) + j) - ((long) (gfz0Var4.f79492d ? 0 : gfz0Var4.f79490b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        gfz0 gfz0Var5 = npaVar.f156903a;
                        wj50.m88279p(gfz0Var5);
                        gfz0Var5.m44643d(gfz0Var4, (int) j);
                        npaVar.f156904b -= j;
                        this.f156904b += j;
                        return;
                    }
                }
                gfz0 gfz0Var6 = npaVar.f156903a;
                wj50.m88279p(gfz0Var6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > gfz0Var6.f79491c - gfz0Var6.f79490b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    gfz0VarM56375b = gfz0Var6.m44642c();
                } else {
                    gfz0VarM56375b = kgz0.m56375b();
                    byte[] bArr = gfz0Var6.f79489a;
                    byte[] bArr2 = gfz0VarM56375b.f79489a;
                    int i4 = gfz0Var6.f79490b;
                    bk5.m29634s0(i4, i4 + i3, 2, bArr, bArr2);
                }
                gfz0VarM56375b.f79491c = gfz0VarM56375b.f79490b + i3;
                gfz0Var6.f79490b += i3;
                gfz0 gfz0Var7 = gfz0Var6.f79495g;
                wj50.m88279p(gfz0Var7);
                gfz0Var7.m44641b(gfz0VarM56375b);
                npaVar.f156903a = gfz0VarM56375b;
            }
            gfz0 gfz0Var8 = npaVar.f156903a;
            wj50.m88279p(gfz0Var8);
            long j3 = gfz0Var8.f79491c - gfz0Var8.f79490b;
            npaVar.f156903a = gfz0Var8.m44640a();
            gfz0 gfz0Var9 = this.f156903a;
            if (gfz0Var9 == null) {
                this.f156903a = gfz0Var8;
                gfz0Var8.f79495g = gfz0Var8;
                gfz0Var8.f79494f = gfz0Var8;
            } else {
                gfz0 gfz0Var10 = gfz0Var9.f79495g;
                wj50.m88279p(gfz0Var10);
                gfz0Var10.m44641b(gfz0Var8);
                gfz0 gfz0Var11 = gfz0Var8.f79495g;
                if (gfz0Var11 == gfz0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                wj50.m88279p(gfz0Var11);
                if (gfz0Var11.f79493e) {
                    int i5 = gfz0Var8.f79491c - gfz0Var8.f79490b;
                    gfz0 gfz0Var12 = gfz0Var8.f79495g;
                    wj50.m88279p(gfz0Var12);
                    int i6 = 8192 - gfz0Var12.f79491c;
                    gfz0 gfz0Var13 = gfz0Var8.f79495g;
                    wj50.m88279p(gfz0Var13);
                    if (!gfz0Var13.f79492d) {
                        gfz0 gfz0Var14 = gfz0Var8.f79495g;
                        wj50.m88279p(gfz0Var14);
                        i2 = gfz0Var14.f79490b;
                    }
                    if (i5 <= i6 + i2) {
                        gfz0 gfz0Var15 = gfz0Var8.f79495g;
                        wj50.m88279p(gfz0Var15);
                        gfz0Var8.m44643d(gfz0Var15, i5);
                        gfz0Var8.m44640a();
                        kgz0.m56374a(gfz0Var8);
                    }
                }
            }
            npaVar.f156904b -= j3;
            this.f156904b += j3;
            j -= j3;
        }
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: Z */
    public final fqa mo42405Z(vuu0 vuu0Var, long j) throws EOFException {
        while (j > 0) {
            long jMo27348g1 = vuu0Var.mo27348g1(this, j);
            if (jMo27348g1 == -1) {
                throw new EOFException();
            }
            j -= jMo27348g1;
        }
        return this;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: b0 */
    public final /* bridge */ /* synthetic */ fqa mo42406b0(String str) {
        m65304Q(str);
        return this;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: b1 */
    public final String mo45422b1(Charset charset) {
        return m65317z(this.f156904b, charset);
    }

    /* JADX INFO: renamed from: c */
    public final void m65306c() throws EOFException {
        skip(this.f156904b);
    }

    public final Object clone() {
        npa npaVar = new npa();
        if (this.f156904b == 0) {
            return npaVar;
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        gfz0 gfz0VarM44642c = gfz0Var.m44642c();
        npaVar.f156903a = gfz0VarM44642c;
        gfz0VarM44642c.f79495g = gfz0VarM44642c;
        gfz0VarM44642c.f79494f = gfz0VarM44642c;
        for (gfz0 gfz0Var2 = gfz0Var.f79494f; gfz0Var2 != gfz0Var; gfz0Var2 = gfz0Var2.f79494f) {
            gfz0 gfz0Var3 = gfz0VarM44642c.f79495g;
            wj50.m88279p(gfz0Var3);
            wj50.m88279p(gfz0Var2);
            gfz0Var3.m44641b(gfz0Var2.m44642c());
        }
        npaVar.f156904b = this.f156904b;
        return npaVar;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: d1 */
    public final int mo45423d1() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f156904b == 0) {
            throw new EOFException();
        }
        byte bM65309h = m65309h(0L);
        if ((bM65309h & 128) == 0) {
            i = bM65309h & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bM65309h & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
            i = bM65309h & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM65309h & 240) == 224) {
            i = bM65309h & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM65309h & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM65309h & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f156904b < j) {
            StringBuilder sbM56838j = klh.m56838j(i2, "size < ", ": ");
            sbM56838j.append(this.f156904b);
            sbM56838j.append(" (to read code point prefixed 0x");
            sbM56838j.append(dul.m36996F(bM65309h));
            sbM56838j.append(')');
            throw new EOFException(sbM56838j.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM65309h2 = m65309h(j2);
            if ((bM65309h2 & MessagePack.Code.NIL) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bM65309h2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    /* JADX INFO: renamed from: e */
    public final long m65307e() {
        long j = this.f156904b;
        if (j == 0) {
            return 0L;
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        gfz0 gfz0Var2 = gfz0Var.f79495g;
        wj50.m88279p(gfz0Var2);
        int i = gfz0Var2.f79491c;
        return (i >= 8192 || !gfz0Var2.f79493e) ? j : j - ((long) (i - gfz0Var2.f79490b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npa)) {
            return false;
        }
        long j = this.f156904b;
        npa npaVar = (npa) obj;
        if (j != npaVar.f156904b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        gfz0 gfz0Var2 = npaVar.f156903a;
        wj50.m88279p(gfz0Var2);
        int i = gfz0Var.f79490b;
        int i2 = gfz0Var2.f79490b;
        long j2 = 0;
        while (j2 < this.f156904b) {
            long jMin = Math.min(gfz0Var.f79491c - i, gfz0Var2.f79491c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (gfz0Var.f79489a[i] != gfz0Var2.f79489a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == gfz0Var.f79491c) {
                gfz0Var = gfz0Var.f79494f;
                wj50.m88279p(gfz0Var);
                i = gfz0Var.f79490b;
            }
            if (i2 == gfz0Var2.f79491c) {
                gfz0Var2 = gfz0Var2.f79494f;
                wj50.m88279p(gfz0Var2);
                i2 = gfz0Var2.f79490b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m65308g(npa npaVar, long j, long j2) {
        long j3 = j;
        dul.m37008k(this.f156904b, j3, j2);
        if (j2 == 0) {
            return;
        }
        npaVar.f156904b += j2;
        gfz0 gfz0Var = this.f156903a;
        while (true) {
            wj50.m88279p(gfz0Var);
            long j4 = gfz0Var.f79491c - gfz0Var.f79490b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            gfz0Var = gfz0Var.f79494f;
        }
        gfz0 gfz0Var2 = gfz0Var;
        long j5 = j2;
        while (j5 > 0) {
            wj50.m88279p(gfz0Var2);
            gfz0 gfz0VarM44642c = gfz0Var2.m44642c();
            int i = gfz0VarM44642c.f79490b + ((int) j3);
            gfz0VarM44642c.f79490b = i;
            gfz0VarM44642c.f79491c = Math.min(i + ((int) j5), gfz0VarM44642c.f79491c);
            gfz0 gfz0Var3 = npaVar.f156903a;
            if (gfz0Var3 == null) {
                gfz0VarM44642c.f79495g = gfz0VarM44642c;
                gfz0VarM44642c.f79494f = gfz0VarM44642c;
                npaVar.f156903a = gfz0VarM44642c;
            } else {
                gfz0 gfz0Var4 = gfz0Var3.f79495g;
                wj50.m88279p(gfz0Var4);
                gfz0Var4.m44641b(gfz0VarM44642c);
            }
            j5 -= (long) (gfz0VarM44642c.f79491c - gfz0VarM44642c.f79490b);
            gfz0Var2 = gfz0Var2.f79494f;
            j3 = 0;
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f156904b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        npaVar.mo25160U0(this, j);
        return j;
    }

    /* JADX INFO: renamed from: h */
    public final byte m65309h(long j) {
        dul.m37008k(this.f156904b, j, 1L);
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            wj50.m88279p(null);
            throw null;
        }
        long j2 = this.f156904b;
        if (j2 - j < j) {
            while (j2 > j) {
                gfz0Var = gfz0Var.f79495g;
                wj50.m88279p(gfz0Var);
                j2 -= (long) (gfz0Var.f79491c - gfz0Var.f79490b);
            }
            return gfz0Var.f79489a[(int) ((((long) gfz0Var.f79490b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = gfz0Var.f79491c;
            int i2 = gfz0Var.f79490b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return gfz0Var.f79489a[(int) ((((long) i2) + j) - j3)];
            }
            gfz0Var = gfz0Var.f79494f;
            wj50.m88279p(gfz0Var);
            j3 = j4;
        }
    }

    public final int hashCode() {
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = gfz0Var.f79491c;
            for (int i3 = gfz0Var.f79490b; i3 < i2; i3++) {
                i = (i * 31) + gfz0Var.f79489a[i3];
            }
            gfz0Var = gfz0Var.f79494f;
            wj50.m88279p(gfz0Var);
        } while (gfz0Var != this.f156903a);
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final long m65310i(byte b, long j, long j2) {
        gfz0 gfz0Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f156904b + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f156904b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (gfz0Var = this.f156903a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                gfz0Var = gfz0Var.f79495g;
                wj50.m88279p(gfz0Var);
                j6 -= (long) (gfz0Var.f79491c - gfz0Var.f79490b);
            }
            while (j6 < j4) {
                byte[] bArr = gfz0Var.f79489a;
                long j8 = j7;
                int iMin = (int) Math.min(gfz0Var.f79491c, (((long) gfz0Var.f79490b) + j4) - j6);
                for (int i = (int) ((((long) gfz0Var.f79490b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - gfz0Var.f79490b)) + j6;
                    }
                }
                j6 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
                gfz0Var = gfz0Var.f79494f;
                wj50.m88279p(gfz0Var);
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (gfz0Var.f79491c - gfz0Var.f79490b)) + j5;
            if (j9 > j3) {
                break;
            }
            gfz0Var = gfz0Var.f79494f;
            wj50.m88279p(gfz0Var);
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = gfz0Var.f79489a;
            int iMin2 = (int) Math.min(gfz0Var.f79491c, (((long) gfz0Var.f79490b) + j4) - j5);
            for (int i2 = (int) ((((long) gfz0Var.f79490b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - gfz0Var.f79490b)) + j5;
                }
            }
            j5 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
            gfz0Var = gfz0Var.f79494f;
            wj50.m88279p(gfz0Var);
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: j1 */
    public final /* bridge */ /* synthetic */ fqa mo42407j1(int i, int i2, String str) {
        m65303P(i, i2, str);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final long m65311k(long j, iva ivaVar) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "fromIndex < 0: ").toString());
        }
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            return -1L;
        }
        long j3 = this.f156904b;
        if (j3 - j < j) {
            while (j3 > j) {
                gfz0Var = gfz0Var.f79495g;
                wj50.m88279p(gfz0Var);
                j3 -= (long) (gfz0Var.f79491c - gfz0Var.f79490b);
            }
            if (ivaVar.mo51747d() == 2) {
                byte bMo51751i = ivaVar.mo51751i(0);
                byte bMo51751i2 = ivaVar.mo51751i(1);
                while (j3 < this.f156904b) {
                    byte[] bArr = gfz0Var.f79489a;
                    int i = gfz0Var.f79491c;
                    for (int i2 = (int) ((((long) gfz0Var.f79490b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bMo51751i || b == bMo51751i2) {
                            return ((long) (i2 - gfz0Var.f79490b)) + j3;
                        }
                    }
                    j3 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
                    gfz0Var = gfz0Var.f79494f;
                    wj50.m88279p(gfz0Var);
                    j = j3;
                }
            } else {
                byte[] bArrMo51750h = ivaVar.mo51750h();
                while (j3 < this.f156904b) {
                    byte[] bArr2 = gfz0Var.f79489a;
                    int i3 = gfz0Var.f79491c;
                    for (int i4 = (int) ((((long) gfz0Var.f79490b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrMo51750h) {
                            if (b2 == b3) {
                                return ((long) (i4 - gfz0Var.f79490b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
                    gfz0Var = gfz0Var.f79494f;
                    wj50.m88279p(gfz0Var);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (gfz0Var.f79491c - gfz0Var.f79490b)) + j2;
            if (j4 > j) {
                break;
            }
            gfz0Var = gfz0Var.f79494f;
            wj50.m88279p(gfz0Var);
            j2 = j4;
        }
        if (ivaVar.mo51747d() == 2) {
            byte bMo51751i3 = ivaVar.mo51751i(0);
            byte bMo51751i4 = ivaVar.mo51751i(1);
            while (j2 < this.f156904b) {
                byte[] bArr3 = gfz0Var.f79489a;
                int i5 = gfz0Var.f79491c;
                for (int i6 = (int) ((((long) gfz0Var.f79490b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bMo51751i3 || b4 == bMo51751i4) {
                        return ((long) (i6 - gfz0Var.f79490b)) + j2;
                    }
                }
                j2 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
                gfz0Var = gfz0Var.f79494f;
                wj50.m88279p(gfz0Var);
                j = j2;
            }
        } else {
            byte[] bArrMo51750h2 = ivaVar.mo51750h();
            while (j2 < this.f156904b) {
                byte[] bArr4 = gfz0Var.f79489a;
                int i7 = gfz0Var.f79491c;
                for (int i8 = (int) ((((long) gfz0Var.f79490b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrMo51750h2) {
                        if (b5 == b6) {
                            return ((long) (i8 - gfz0Var.f79490b)) + j2;
                        }
                    }
                }
                j2 += (long) (gfz0Var.f79491c - gfz0Var.f79490b);
                gfz0Var = gfz0Var.f79494f;
                wj50.m88279p(gfz0Var);
                j = j2;
            }
        }
        return -1L;
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return au71.f19881d;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: o0 */
    public final long mo45424o0(iva ivaVar) {
        return m65311k(0L, ivaVar);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: o1 */
    public final long mo45425o1(iva ivaVar) {
        byte[] bArr = AbstractC1686b.f21714a;
        return AbstractC1686b.m27707a(this, ivaVar, 0L, Long.MAX_VALUE, ivaVar.mo51747d());
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: p1 */
    public final int mo45426p1() {
        return dul.m36992B(readInt());
    }

    @Override // p204p.gqa
    public final vuu0 peek() {
        return kif1.m56500i(new lhn0(this));
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: q1 */
    public final /* bridge */ /* synthetic */ fqa mo42409q1(iva ivaVar) {
        m65297I(ivaVar);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m65312r(int i, long j, iva ivaVar) {
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.f156904b && i <= ivaVar.mo51747d()) {
            return i == 0 || AbstractC1686b.m27707a(this, ivaVar, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), gfz0Var.f79491c - gfz0Var.f79490b);
        byteBuffer.put(gfz0Var.f79489a, gfz0Var.f79490b, iMin);
        int i = gfz0Var.f79490b + iMin;
        gfz0Var.f79490b = i;
        this.f156904b -= (long) iMin;
        if (i == gfz0Var.f79491c) {
            this.f156903a = gfz0Var.m44640a();
            kgz0.m56374a(gfz0Var);
        }
        return iMin;
    }

    @Override // p204p.gqa
    public final byte readByte() throws EOFException {
        if (this.f156904b == 0) {
            throw new EOFException();
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        int i = gfz0Var.f79490b;
        int i2 = gfz0Var.f79491c;
        int i3 = i + 1;
        byte b = gfz0Var.f79489a[i];
        this.f156904b--;
        if (i3 != i2) {
            gfz0Var.f79490b = i3;
            return b;
        }
        this.f156903a = gfz0Var.m44640a();
        kgz0.m56374a(gfz0Var);
        return b;
    }

    @Override // p204p.gqa
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p204p.gqa
    public final int readInt() throws EOFException {
        if (this.f156904b < 4) {
            throw new EOFException();
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        int i = gfz0Var.f79490b;
        int i2 = gfz0Var.f79491c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = gfz0Var.f79489a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f156904b -= 4;
        if (i5 != i2) {
            gfz0Var.f79490b = i5;
            return i6;
        }
        this.f156903a = gfz0Var.m44640a();
        kgz0.m56374a(gfz0Var);
        return i6;
    }

    @Override // p204p.gqa
    public final long readLong() throws EOFException {
        if (this.f156904b < 8) {
            throw new EOFException();
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        int i = gfz0Var.f79490b;
        int i2 = gfz0Var.f79491c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = gfz0Var.f79489a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.f156904b -= 8;
        if (i4 != i2) {
            gfz0Var.f79490b = i4;
            return j2;
        }
        this.f156903a = gfz0Var.m44640a();
        kgz0.m56374a(gfz0Var);
        return j2;
    }

    @Override // p204p.gqa
    public final short readShort() throws EOFException {
        if (this.f156904b < 2) {
            throw new EOFException();
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        int i = gfz0Var.f79490b;
        int i2 = gfz0Var.f79491c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = gfz0Var.f79489a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f156904b -= 2;
        if (i5 == i2) {
            this.f156903a = gfz0Var.m44640a();
            kgz0.m56374a(gfz0Var);
        } else {
            gfz0Var.f79490b = i5;
        }
        return (short) i6;
    }

    @Override // p204p.gqa
    public final boolean request(long j) {
        return this.f156904b >= j;
    }

    /* JADX INFO: renamed from: s */
    public final lpa m65313s(lpa lpaVar) {
        byte[] bArr = AbstractC1686b.f21714a;
        lpa lpaVarM36991A = dul.m36991A(lpaVar);
        if (lpaVarM36991A.f135705a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        lpaVarM36991A.f135705a = this;
        lpaVarM36991A.f135706b = true;
        return lpaVarM36991A;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: s0 */
    public final short mo45427s0() {
        return dul.m36994D(readShort());
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: s1 */
    public final String mo45428s1() {
        return m65317z(this.f156904b, vuc.f244913a);
    }

    @Override // p204p.gqa
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            gfz0 gfz0Var = this.f156903a;
            if (gfz0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, gfz0Var.f79491c - gfz0Var.f79490b);
            long j2 = iMin;
            this.f156904b -= j2;
            j -= j2;
            int i = gfz0Var.f79490b + iMin;
            gfz0Var.f79490b = i;
            if (i == gfz0Var.f79491c) {
                this.f156903a = gfz0Var.m44640a();
                kgz0.m56374a(gfz0Var);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m65314t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount: ").toString());
        }
        if (this.f156904b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final String toString() {
        return m65294B().toString();
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: v0 */
    public final /* bridge */ /* synthetic */ fqa mo42410v0(int i, byte[] bArr, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: w1 */
    public final long mo45429w1(fqa fqaVar) {
        long j = this.f156904b;
        if (j > 0) {
            fqaVar.mo25160U0(this, j);
        }
        return j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            gfz0 gfz0VarM65296G = m65296G(1);
            int iMin = Math.min(i, 8192 - gfz0VarM65296G.f79491c);
            byteBuffer.get(gfz0VarM65296G.f79489a, gfz0VarM65296G.f79491c, iMin);
            i -= iMin;
            gfz0VarM65296G.f79491c += iMin;
        }
        this.f156904b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p204p.fqa
    public final /* bridge */ /* synthetic */ fqa writeByte(int i) {
        m65298J(i);
        return this;
    }

    @Override // p204p.fqa
    public final /* bridge */ /* synthetic */ fqa writeInt(int i) {
        m65301M(i);
        return this;
    }

    @Override // p204p.fqa
    public final /* bridge */ /* synthetic */ fqa writeShort(int i) {
        m65302N(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final long m65315x() {
        long j;
        byte b;
        long j2 = 0;
        if (this.f156904b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            gfz0 gfz0Var = this.f156903a;
            wj50.m88279p(gfz0Var);
            byte[] bArr = gfz0Var.f79489a;
            int i2 = gfz0Var.f79490b;
            int i3 = gfz0Var.f79491c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.f156903a = gfz0Var.m44640a();
                kgz0.m56374a(gfz0Var);
            } else {
                gfz0Var.f79490b = i2;
            }
            if (z2 || this.f156903a == null) {
                long j5 = this.f156904b - ((long) i);
                this.f156904b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbM75191i = rbz.m75191i(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbM75191i.append(dul.m36996F(m65309h(j)));
                throw new NumberFormatException(sbM75191i.toString());
            }
            j2 = j;
        }
        npa npaVar = new npa();
        npaVar.m65299K(j3);
        npaVar.m65298J(b);
        if (!z) {
            npaVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(npaVar.mo45428s1()));
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: x0 */
    public final boolean mo45430x0(long j, iva ivaVar) {
        return m65312r(ivaVar.mo51747d(), j, ivaVar);
    }

    /* JADX INFO: renamed from: y */
    public final long m65316y() throws EOFException {
        int i;
        if (this.f156904b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            gfz0 gfz0Var = this.f156903a;
            wj50.m88279p(gfz0Var);
            byte[] bArr = gfz0Var.f79489a;
            int i3 = gfz0Var.f79490b;
            int i4 = gfz0Var.f79491c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b + MessagePack.Code.INT8;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(dul.m36996F(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b + MessagePack.Code.EXT32;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    npa npaVar = new npa();
                    npaVar.m65300L(j);
                    npaVar.m65298J(b);
                    throw new NumberFormatException("Number too large: ".concat(npaVar.mo45428s1()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f156903a = gfz0Var.m44640a();
                kgz0.m56374a(gfz0Var);
            } else {
                gfz0Var.f79490b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f156903a != null);
        this.f156904b -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: z */
    public final String m65317z(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount: ").toString());
        }
        if (this.f156904b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        gfz0 gfz0Var = this.f156903a;
        wj50.m88279p(gfz0Var);
        int i = gfz0Var.f79490b;
        if (((long) i) + j > gfz0Var.f79491c) {
            return new String(m65314t(j), charset);
        }
        int i2 = (int) j;
        String str = new String(gfz0Var.f79489a, i, i2, charset);
        int i3 = gfz0Var.f79490b + i2;
        gfz0Var.f79490b = i3;
        this.f156904b -= j;
        if (i3 == gfz0Var.f79491c) {
            this.f156903a = gfz0Var.m44640a();
            kgz0.m56374a(gfz0Var);
        }
        return str;
    }

    @Override // p204p.fqa
    public final fqa write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        dul.m37008k(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            gfz0 gfz0VarM65296G = m65296G(1);
            int iMin = Math.min(i3 - i, 8192 - gfz0VarM65296G.f79491c);
            int i4 = i + iMin;
            bk5.m29625n0(gfz0VarM65296G.f79491c, i, i4, bArr, gfz0VarM65296G.f79489a);
            gfz0VarM65296G.f79491c += iMin;
            i = i4;
        }
        this.f156904b += j;
    }

    @Override // p204p.gqa
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        dul.m37008k(bArr.length, i, i2);
        gfz0 gfz0Var = this.f156903a;
        if (gfz0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, gfz0Var.f79491c - gfz0Var.f79490b);
        byte[] bArr2 = gfz0Var.f79489a;
        int i3 = gfz0Var.f79490b;
        bk5.m29625n0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = gfz0Var.f79490b + iMin;
        gfz0Var.f79490b = i4;
        this.f156904b -= (long) iMin;
        if (i4 == gfz0Var.f79491c) {
            this.f156903a = gfz0Var.m44640a();
            kgz0.m56374a(gfz0Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p204p.ai21
    public final void close() {
    }

    @Override // p204p.fqa, p204p.ai21, java.io.Flushable
    public final void flush() {
    }

    @Override // p204p.gqa, p204p.fqa
    /* JADX INFO: renamed from: l */
    public final npa mo42408l() {
        return this;
    }
}
