package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p204p.dva;
import p204p.edb;
import p204p.ge50;
import p204p.ptc;
import p204p.zza1;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0046c extends ptc {

    /* JADX INFO: renamed from: c */
    public final FileInputStream f838c;

    /* JADX INFO: renamed from: d */
    public final byte[] f839d;

    /* JADX INFO: renamed from: e */
    public int f840e;

    /* JADX INFO: renamed from: f */
    public int f841f;

    /* JADX INFO: renamed from: g */
    public int f842g;

    /* JADX INFO: renamed from: h */
    public int f843h;

    /* JADX INFO: renamed from: i */
    public int f844i;

    /* JADX INFO: renamed from: t */
    public int f845t = Alert.DURATION_SHOW_INDEFINITELY;

    public C0046c(FileInputStream fileInputStream) {
        Charset charset = ge50.f79023a;
        this.f838c = fileInputStream;
        this.f839d = new byte[4096];
        this.f840e = 0;
        this.f842g = 0;
        this.f844i = 0;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: B0 */
    public final boolean mo429B0() {
        return m466c1() != 0;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: C0 */
    public final dva mo430C0() throws IOException {
        int iM465b1 = m465b1();
        int i = this.f840e;
        int i2 = this.f842g;
        int i3 = i - i2;
        byte[] bArr = this.f839d;
        if (iM465b1 <= i3 && iM465b1 > 0) {
            dva dvaVarM37078a = dva.m37078a(i2, bArr, iM465b1);
            this.f842g += iM465b1;
            return dvaVarM37078a;
        }
        if (iM465b1 == 0) {
            return dva.f53402c;
        }
        byte[] bArrM461X0 = m461X0(iM465b1);
        if (bArrM461X0 != null) {
            return dva.m37078a(0, bArrM461X0, bArrM461X0.length);
        }
        int i4 = this.f842g;
        int i5 = this.f840e;
        int length = i5 - i4;
        this.f844i += i5;
        this.f842g = 0;
        this.f840e = 0;
        ArrayList<byte[]> arrayListM462Y0 = m462Y0(iM465b1 - length);
        byte[] bArr2 = new byte[iM465b1];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM462Y0) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        dva dvaVar = dva.f53402c;
        return new dva(bArr2);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: D0 */
    public final double mo431D0() {
        return Double.longBitsToDouble(m464a1());
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: E0 */
    public final int mo432E0() {
        return m465b1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: F0 */
    public final int mo433F0() {
        return m463Z0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: G0 */
    public final long mo434G0() {
        return m464a1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: H0 */
    public final float mo435H0() {
        return Float.intBitsToFloat(m463Z0());
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: I0 */
    public final int mo436I0() {
        return m465b1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: J0 */
    public final long mo437J0() {
        return m466c1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: K0 */
    public final int mo438K0() {
        return m463Z0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: L0 */
    public final long mo439L0() {
        return m464a1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: M0 */
    public final int mo440M0() {
        int iM465b1 = m465b1();
        return (-(iM465b1 & 1)) ^ (iM465b1 >>> 1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: N0 */
    public final long mo441N0() {
        long jM466c1 = m466c1();
        return (-(jM466c1 & 1)) ^ (jM466c1 >>> 1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: O0 */
    public final String mo442O0() throws InvalidProtocolBufferException {
        int iM465b1 = m465b1();
        byte[] bArr = this.f839d;
        if (iM465b1 > 0) {
            int i = this.f840e;
            int i2 = this.f842g;
            if (iM465b1 <= i - i2) {
                String str = new String(bArr, i2, iM465b1, ge50.f79023a);
                this.f842g += iM465b1;
                return str;
            }
        }
        if (iM465b1 == 0) {
            return "";
        }
        if (iM465b1 > this.f840e) {
            return new String(m460W0(iM465b1), ge50.f79023a);
        }
        m469f1(iM465b1);
        String str2 = new String(bArr, this.f842g, iM465b1, ge50.f79023a);
        this.f842g += iM465b1;
        return str2;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: P0 */
    public final String mo443P0() throws IOException {
        int iM465b1 = m465b1();
        int i = this.f842g;
        int i2 = this.f840e;
        int i3 = i2 - i;
        byte[] bArrM460W0 = this.f839d;
        if (iM465b1 <= i3 && iM465b1 > 0) {
            this.f842g = i + iM465b1;
        } else {
            if (iM465b1 == 0) {
                return "";
            }
            i = 0;
            if (iM465b1 <= i2) {
                m469f1(iM465b1);
                this.f842g = iM465b1;
            } else {
                bArrM460W0 = m460W0(iM465b1);
            }
        }
        return zza1.f287933a.mo68635g(i, bArrM460W0, iM465b1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: Q0 */
    public final int mo444Q0() throws InvalidProtocolBufferException {
        if (mo457p0()) {
            this.f843h = 0;
            return 0;
        }
        int iM465b1 = m465b1();
        this.f843h = iM465b1;
        if ((iM465b1 >>> 3) != 0) {
            return iM465b1;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: R0 */
    public final int mo445R0() {
        return m465b1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: S0 */
    public final long mo446S0() {
        return m466c1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: U0 */
    public final boolean mo447U0(int i) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f840e - this.f842g;
            byte[] bArr = this.f839d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f842g;
                    this.f842g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m421c();
            }
            while (i3 < 10) {
                if (this.f842g == this.f840e) {
                    m469f1(1);
                }
                int i6 = this.f842g;
                this.f842g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.m421c();
            return true;
        }
        if (i2 == 1) {
            m470g1(8);
            return true;
        }
        if (i2 == 2) {
            m470g1(m465b1());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m420b();
            }
            m470g1(4);
            return true;
        }
        do {
            iMo444Q0 = mo444Q0();
            if (iMo444Q0 == 0) {
                break;
            }
        } while (mo447U0(iMo444Q0));
        mo455k0(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: renamed from: W0 */
    public final byte[] m460W0(int i) throws IOException {
        byte[] bArrM461X0 = m461X0(i);
        if (bArrM461X0 != null) {
            return bArrM461X0;
        }
        int i2 = this.f842g;
        int i3 = this.f840e;
        int length = i3 - i2;
        this.f844i += i3;
        this.f842g = 0;
        this.f840e = 0;
        ArrayList<byte[]> arrayListM462Y0 = m462Y0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f839d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM462Y0) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: X0 */
    public final byte[] m461X0(int i) throws IOException {
        if (i == 0) {
            return ge50.f79024b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        int i2 = this.f844i;
        int i3 = this.f842g;
        int i4 = i2 + i3 + i;
        if (i4 - Alert.DURATION_SHOW_INDEFINITELY > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f845t;
        if (i4 > i5) {
            m470g1((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m424f();
        }
        int i6 = this.f840e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.f838c;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f839d, this.f842g, bArr, 0, i6);
        this.f844i += this.f840e;
        this.f842g = 0;
        this.f840e = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw InvalidProtocolBufferException.m424f();
            }
            this.f844i += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: Y0 */
    public final ArrayList m462Y0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f838c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m424f();
                }
                this.f844i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m463Z0() throws InvalidProtocolBufferException {
        int i = this.f842g;
        if (this.f840e - i < 4) {
            m469f1(4);
            i = this.f842g;
        }
        this.f842g = i + 4;
        byte[] bArr = this.f839d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: a1 */
    public final long m464a1() throws InvalidProtocolBufferException {
        int i = this.f842g;
        if (this.f840e - i < 8) {
            m469f1(8);
            i = this.f842g;
        }
        this.f842g = i + 8;
        byte[] bArr = this.f839d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: b1 */
    public final int m465b1() {
        int i;
        int i2 = this.f842g;
        int i3 = this.f840e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f839d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f842g = i4;
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
                this.f842g = i5;
                return i;
            }
        }
        return (int) m467d1();
    }

    /* JADX INFO: renamed from: c1 */
    public final long m466c1() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f842g;
        int i2 = this.f840e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f839d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f842g = i3;
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
                this.f842g = i4;
                return j;
            }
        }
        return m467d1();
    }

    /* JADX INFO: renamed from: d1 */
    public final long m467d1() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f842g == this.f840e) {
                m469f1(1);
            }
            int i2 = this.f842g;
            this.f842g = i2 + 1;
            byte b = this.f839d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m421c();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m468e1() {
        int i = this.f840e + this.f841f;
        this.f840e = i;
        int i2 = this.f844i + i;
        int i3 = this.f845t;
        if (i2 <= i3) {
            this.f841f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f841f = i4;
        this.f840e = i - i4;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m469f1(int i) throws InvalidProtocolBufferException {
        if (m471h1(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f844i) - this.f842g) {
            throw InvalidProtocolBufferException.m424f();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: g1 */
    public final void m470g1(int i) throws InvalidProtocolBufferException {
        int i2 = this.f840e;
        int i3 = this.f842g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f842g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f838c;
        if (i < 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        int i5 = this.f844i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f845t;
        if (i7 > i8) {
            m470g1((i8 - i5) - i3);
            throw InvalidProtocolBufferException.m424f();
        }
        this.f844i = i6;
        this.f840e = 0;
        this.f842g = 0;
        while (i4 < i) {
            long j = i - i4;
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
            } finally {
                this.f844i += i4;
                m468e1();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i9 = this.f840e;
        int i10 = i9 - this.f842g;
        this.f842g = i9;
        m469f1(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f840e;
            if (i11 <= i12) {
                this.f842g = i11;
                return;
            } else {
                i10 += i12;
                this.f842g = i12;
                m469f1(1);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m471h1(int i) throws IOException {
        int i2 = this.f842g;
        int i3 = i2 + i;
        int i4 = this.f840e;
        if (i3 <= i4) {
            throw new IllegalStateException(edb.m38563l("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.f844i;
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 && i5 + i2 + i <= this.f845t) {
            byte[] bArr = this.f839d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f844i += i2;
                this.f840e -= i2;
                this.f842g = 0;
            }
            int i6 = this.f840e;
            int iMin = Math.min(bArr.length - i6, (Alert.DURATION_SHOW_INDEFINITELY - this.f844i) - i6);
            FileInputStream fileInputStream = this.f838c;
            int i7 = fileInputStream.read(bArr, i6, iMin);
            if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 > 0) {
                this.f840e += i7;
                m468e1();
                if (this.f840e >= i) {
                    return true;
                }
                return m471h1(i);
            }
        }
        return false;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: k0 */
    public final void mo455k0(int i) throws InvalidProtocolBufferException {
        if (this.f843h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: o0 */
    public final int mo456o0() {
        return this.f844i + this.f842g;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: p0 */
    public final boolean mo457p0() {
        return this.f842g == this.f840e && !m471h1(1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: w0 */
    public final void mo458w0(int i) {
        this.f845t = i;
        m468e1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: z0 */
    public final int mo459z0(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        int i2 = this.f844i + this.f842g + i;
        int i3 = this.f845t;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m424f();
        }
        this.f845t = i2;
        m468e1();
        return i3;
    }
}
