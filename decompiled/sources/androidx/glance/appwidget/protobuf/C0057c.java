package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p204p.ava;
import p204p.ce50;
import p204p.edb;
import p204p.jua;
import p204p.wza1;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0057c extends jua {

    /* JADX INFO: renamed from: c */
    public final FileInputStream f902c;

    /* JADX INFO: renamed from: d */
    public final byte[] f903d;

    /* JADX INFO: renamed from: e */
    public int f904e;

    /* JADX INFO: renamed from: f */
    public int f905f;

    /* JADX INFO: renamed from: g */
    public int f906g;

    /* JADX INFO: renamed from: h */
    public int f907h;

    /* JADX INFO: renamed from: i */
    public int f908i;

    /* JADX INFO: renamed from: j */
    public int f909j = Alert.DURATION_SHOW_INDEFINITELY;

    public C0057c(FileInputStream fileInputStream) {
        Charset charset = ce50.f37010a;
        this.f902c = fileInputStream;
        this.f903d = new byte[4096];
        this.f904e = 0;
        this.f906g = 0;
        this.f908i = 0;
    }

    /* JADX INFO: renamed from: A */
    public final byte[] m631A(int i) throws IOException {
        if (i == 0) {
            return ce50.f37011b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m599c();
        }
        int i2 = this.f908i;
        int i3 = this.f906g;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f909j;
        if (i4 > i5) {
            m640J((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m600d();
        }
        int i6 = this.f904e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f902c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f894a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f903d, this.f906g, bArr, 0, i6);
        this.f908i += this.f904e;
        this.f906g = 0;
        this.f904e = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.m600d();
                }
                this.f908i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.f894a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: B */
    public final ArrayList m632B(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f902c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m600d();
                }
                this.f908i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public final int m633C() throws InvalidProtocolBufferException {
        int i = this.f906g;
        if (this.f904e - i < 4) {
            m639I(4);
            i = this.f906g;
        }
        this.f906g = i + 4;
        byte[] bArr = this.f903d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: D */
    public final long m634D() throws InvalidProtocolBufferException {
        int i = this.f906g;
        if (this.f904e - i < 8) {
            m639I(8);
            i = this.f906g;
        }
        this.f906g = i + 8;
        byte[] bArr = this.f903d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: E */
    public final int m635E() {
        int i;
        int i2 = this.f906g;
        int i3 = this.f904e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f903d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f906g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f906g = i5;
                return i;
            }
        }
        return (int) m637G();
    }

    /* JADX INFO: renamed from: F */
    public final long m636F() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f906g;
        int i2 = this.f904e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f903d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f906g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f906g = i4;
                return j;
            }
        }
        return m637G();
    }

    /* JADX INFO: renamed from: G */
    public final long m637G() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f906g == this.f904e) {
                m639I(1);
            }
            int i2 = this.f906g;
            this.f906g = i2 + 1;
            byte b = this.f903d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m598b();
    }

    /* JADX INFO: renamed from: H */
    public final void m638H() {
        int i = this.f904e + this.f905f;
        this.f904e = i;
        int i2 = this.f908i + i;
        int i3 = this.f909j;
        if (i2 <= i3) {
            this.f905f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f905f = i4;
        this.f904e = i - i4;
    }

    /* JADX INFO: renamed from: I */
    public final void m639I(int i) throws InvalidProtocolBufferException {
        if (m641K(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f908i) - this.f906g) {
            throw InvalidProtocolBufferException.m600d();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: J */
    public final void m640J(int i) throws InvalidProtocolBufferException {
        int i2 = this.f904e;
        int i3 = this.f906g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f906g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f902c;
        if (i < 0) {
            throw InvalidProtocolBufferException.m599c();
        }
        int i5 = this.f908i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f909j;
        if (i7 > i8) {
            m640J((i8 - i5) - i3);
            throw InvalidProtocolBufferException.m600d();
        }
        this.f908i = i6;
        this.f904e = 0;
        this.f906g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f894a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f908i += i4;
                m638H();
                throw th;
            }
        }
        this.f908i += i4;
        m638H();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f904e;
        int i10 = i9 - this.f906g;
        this.f906g = i9;
        m639I(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f904e;
            if (i11 <= i12) {
                this.f906g = i11;
                return;
            } else {
                i10 += i12;
                this.f906g = i12;
                m639I(1);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m641K(int i) throws IOException {
        FileInputStream fileInputStream = this.f902c;
        int i2 = this.f906g;
        int i3 = i2 + i;
        int i4 = this.f904e;
        if (i3 <= i4) {
            throw new IllegalStateException(edb.m38563l("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.f908i;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f909j) {
            byte[] bArr = this.f903d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f908i += i2;
                this.f904e -= i2;
                this.f906g = 0;
            }
            int i6 = this.f904e;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f908i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f904e += i7;
                    m638H();
                    if (this.f904e >= i) {
                        return true;
                    }
                    return m641K(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f894a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: a */
    public final void mo607a(int i) throws InvalidProtocolBufferException {
        if (this.f907h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: b */
    public final int mo608b() {
        return this.f908i + this.f906g;
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: c */
    public final boolean mo609c() {
        return this.f906g == this.f904e && !m641K(1);
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: d */
    public final void mo610d(int i) {
        this.f909j = i;
        m638H();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: e */
    public final int mo611e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m599c();
        }
        int i2 = this.f908i + this.f906g + i;
        if (i2 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i3 = this.f909j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m600d();
        }
        this.f909j = i2;
        m638H();
        return i3;
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: f */
    public final boolean mo612f() {
        return m636F() != 0;
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: g */
    public final ava mo613g() throws IOException {
        int iM635E = m635E();
        int i = this.f904e;
        int i2 = this.f906g;
        int i3 = i - i2;
        byte[] bArr = this.f903d;
        if (iM635E <= i3 && iM635E > 0) {
            ava avaVarM27230d = ava.m27230d(i2, bArr, iM635E);
            this.f906g += iM635E;
            return avaVarM27230d;
        }
        if (iM635E == 0) {
            return ava.f20130c;
        }
        if (iM635E < 0) {
            throw InvalidProtocolBufferException.m599c();
        }
        byte[] bArrM631A = m631A(iM635E);
        if (bArrM631A != null) {
            return ava.m27230d(0, bArrM631A, bArrM631A.length);
        }
        int i4 = this.f906g;
        int i5 = this.f904e;
        int length = i5 - i4;
        this.f908i += i5;
        this.f906g = 0;
        this.f904e = 0;
        ArrayList<byte[]> arrayListM632B = m632B(iM635E - length);
        byte[] bArr2 = new byte[iM635E];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM632B) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ava avaVar = ava.f20130c;
        return new ava(bArr2);
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: h */
    public final double mo614h() {
        return Double.longBitsToDouble(m634D());
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: i */
    public final int mo615i() {
        return m635E();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: j */
    public final int mo616j() {
        return m633C();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: k */
    public final long mo617k() {
        return m634D();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: l */
    public final float mo618l() {
        return Float.intBitsToFloat(m633C());
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: m */
    public final int mo619m() {
        return m635E();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: n */
    public final long mo620n() {
        return m636F();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: o */
    public final int mo621o() {
        return m633C();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: p */
    public final long mo622p() {
        return m634D();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: q */
    public final int mo623q() {
        int iM635E = m635E();
        return (-(iM635E & 1)) ^ (iM635E >>> 1);
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: r */
    public final long mo624r() {
        long jM636F = m636F();
        return (-(jM636F & 1)) ^ (jM636F >>> 1);
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: s */
    public final String mo625s() throws InvalidProtocolBufferException {
        int iM635E = m635E();
        byte[] bArr = this.f903d;
        if (iM635E > 0) {
            int i = this.f904e;
            int i2 = this.f906g;
            if (iM635E <= i - i2) {
                String str = new String(bArr, i2, iM635E, ce50.f37010a);
                this.f906g += iM635E;
                return str;
            }
        }
        if (iM635E == 0) {
            return "";
        }
        if (iM635E < 0) {
            throw InvalidProtocolBufferException.m599c();
        }
        if (iM635E > this.f904e) {
            return new String(m642z(iM635E), ce50.f37010a);
        }
        m639I(iM635E);
        String str2 = new String(bArr, this.f906g, iM635E, ce50.f37010a);
        this.f906g += iM635E;
        return str2;
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: t */
    public final String mo626t() throws IOException {
        int iM635E = m635E();
        int i = this.f906g;
        int i2 = this.f904e;
        int i3 = i2 - i;
        byte[] bArrM642z = this.f903d;
        if (iM635E <= i3 && iM635E > 0) {
            this.f906g = i + iM635E;
        } else {
            if (iM635E == 0) {
                return "";
            }
            if (iM635E < 0) {
                throw InvalidProtocolBufferException.m599c();
            }
            i = 0;
            if (iM635E <= i2) {
                m639I(iM635E);
                this.f906g = iM635E;
            } else {
                bArrM642z = m642z(iM635E);
            }
        }
        return wza1.f256549a.mo60297j(i, bArrM642z, iM635E);
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: u */
    public final int mo627u() throws InvalidProtocolBufferException {
        if (mo609c()) {
            this.f907h = 0;
            return 0;
        }
        int iM635E = m635E();
        this.f907h = iM635E;
        if ((iM635E >>> 3) != 0) {
            return iM635E;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: v */
    public final int mo628v() {
        return m635E();
    }

    @Override // p204p.jua
    /* JADX INFO: renamed from: w */
    public final long mo629w() {
        return m636F();
    }

    /* JADX INFO: renamed from: z */
    public final byte[] m642z(int i) throws IOException {
        byte[] bArrM631A = m631A(i);
        if (bArrM631A != null) {
            return bArrM631A;
        }
        int i2 = this.f906g;
        int i3 = this.f904e;
        int length = i3 - i2;
        this.f908i += i3;
        this.f906g = 0;
        this.f904e = 0;
        ArrayList<byte[]> arrayListM632B = m632B(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f903d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM632B) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
