package p204p;

import androidx.car.app.model.Alert;
import com.google.android.recaptcha.internal.zzagk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u9f1 extends v9f1 {

    /* JADX INFO: renamed from: d */
    public final bbf1 f228154d;

    /* JADX INFO: renamed from: g */
    public int f228157g;

    /* JADX INFO: renamed from: i */
    public int f228159i;

    /* JADX INFO: renamed from: k */
    public int f228161k = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: e */
    public final byte[] f228155e = new byte[4096];

    /* JADX INFO: renamed from: f */
    public int f228156f = 0;

    /* JADX INFO: renamed from: h */
    public int f228158h = 0;

    /* JADX INFO: renamed from: j */
    public int f228160j = 0;

    public /* synthetic */ u9f1(bbf1 bbf1Var) {
        this.f228154d = bbf1Var;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m82605F(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    /* JADX INFO: renamed from: A */
    public final void m82606A(int i) throws zzagk {
        if (m82607B(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.f228160j) - this.f228158h) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzagk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m82607B(int i) throws zzagk {
        bbf1 bbf1Var = this.f228154d;
        int i2 = this.f228158h;
        int i3 = i2 + i;
        int i4 = this.f228156f;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.f228160j;
        int i6 = i5 + i2;
        if (!m82605F(i6, i, Alert.DURATION_SHOW_INDEFINITELY) && !m82605F(i6, i, this.f228161k)) {
            byte[] bArr = this.f228155e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f228160j + i2;
                this.f228160j = i5;
                i4 = this.f228156f - i2;
                this.f228156f = i4;
                this.f228158h = 0;
            }
            try {
                int i7 = bbf1Var.read(bArr, i4, Math.min(4096 - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
                if (i7 == 0 || i7 < -1 || i7 > 4096) {
                    String strValueOf = String.valueOf(bbf1.class);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + strValueOf.length() + 39 + 41);
                    sb2.append(strValueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(i7);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
                if (i7 > 0) {
                    this.f228156f += i7;
                    m82617M();
                    if (this.f228156f >= i || m82607B(i)) {
                        return true;
                    }
                }
            } catch (zzagk e) {
                e.f2333a = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final byte[] m82608C(int i) throws zzagk {
        byte[] bArrM82609D = m82609D(i);
        if (bArrM82609D != null) {
            return bArrM82609D;
        }
        int i2 = this.f228158h;
        int i3 = this.f228156f;
        int i4 = i3 - i2;
        this.f228160j += i3;
        this.f228158h = 0;
        this.f228156f = 0;
        ArrayList<byte[]> arrayListM82610E = m82610E(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f228155e, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListM82610E) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: D */
    public final byte[] m82609D(int i) throws zzagk {
        if (i == 0) {
            return abf1.f14107a;
        }
        int i2 = this.f228160j;
        int i3 = this.f228158h;
        int i4 = i2 + i3;
        if (m82605F(i4, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            throw new zzagk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.f228161k;
        if (m82605F(i4, i, i5)) {
            if (i5 >= i4) {
                m82616L(i5 - i4);
            }
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.f228156f - i3;
        int i7 = i - i6;
        bbf1 bbf1Var = this.f228154d;
        if (i7 >= 4096) {
            try {
                if (i7 > bbf1Var.available()) {
                    return null;
                }
            } catch (zzagk e) {
                e.f2333a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f228155e, this.f228158h, bArr, 0, i6);
        this.f228160j += this.f228156f;
        this.f228158h = 0;
        this.f228156f = 0;
        while (i6 < i) {
            try {
                int i8 = bbf1Var.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f228160j += i8;
                i6 += i8;
            } catch (zzagk e2) {
                e2.f2333a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: E */
    public final ArrayList m82610E(int i) throws zzagk {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f228154d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f228160j += i3;
                    i2 += i3;
                } catch (zzagk e) {
                    e.f2333a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public final int m82611G() {
        int i;
        int i2 = this.f228158h;
        int i3 = this.f228156f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f228155e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f228158h = i4;
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
                this.f228158h = i5;
                return i;
            }
        }
        return (int) m82613I();
    }

    /* JADX INFO: renamed from: H */
    public final long m82612H() {
        long j;
        long j2;
        long j3;
        int i = this.f228158h;
        int i2 = this.f228156f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f228155e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f228158h = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.f228158h = i4;
                return j;
            }
        }
        return m82613I();
    }

    /* JADX INFO: renamed from: I */
    public final long m82613I() throws zzagk {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f228158h == this.f228156f) {
                m82606A(1);
            }
            int i2 = this.f228158h;
            this.f228158h = i2 + 1;
            byte b = this.f228155e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new zzagk("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: J */
    public final int m82614J() throws zzagk {
        int i = this.f228158h;
        if (this.f228156f - i < 4) {
            m82606A(4);
            i = this.f228158h;
        }
        this.f228158h = i + 4;
        byte[] bArr = this.f228155e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: K */
    public final long m82615K() throws zzagk {
        int i = this.f228158h;
        if (this.f228156f - i < 8) {
            m82606A(8);
            i = this.f228158h;
        }
        this.f228158h = i + 8;
        byte[] bArr = this.f228155e;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: L */
    public final void m82616L(int i) throws zzagk {
        bbf1 bbf1Var = this.f228154d;
        int i2 = this.f228156f;
        int i3 = this.f228158h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f228158h = i3 + i;
            return;
        }
        if (i < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f228160j + i3;
        if (m82605F(i5, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            throw new zzagk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f228161k;
        if (m82605F(i5, i, i6)) {
            if (i6 >= i5) {
                m82616L(i6 - i5);
            }
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f228160j = i5;
        this.f228156f = 0;
        this.f228158h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = bbf1Var.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(bbf1.class);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzagk e) {
                    e.f2333a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f228160j += i4;
                m82617M();
                throw th;
            }
        }
        this.f228160j += i4;
        m82617M();
        if (i4 >= i) {
            return;
        }
        int i7 = this.f228156f;
        int i8 = i7 - this.f228158h;
        this.f228158h = i7;
        m82606A(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.f228156f;
            if (i9 <= i10) {
                this.f228158h = i9;
                return;
            } else {
                i8 += i10;
                this.f228158h = i10;
                m82606A(1);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m82617M() {
        int i = this.f228156f + this.f228157g;
        this.f228156f = i;
        int i2 = this.f228160j + i;
        int i3 = this.f228161k;
        if (i2 <= i3) {
            this.f228157g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f228157g = i4;
        this.f228156f = i - i4;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: a */
    public final int mo80287a(int i) throws zzagk {
        if (i < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f228160j + this.f228158h;
        if (i > Alert.DURATION_SHOW_INDEFINITELY - i2) {
            throw new zzagk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.f228161k;
        if (m82605F(i2, i, i3)) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f228161k = i2 + i;
        m82617M();
        return i3;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: b */
    public final void mo80288b(int i) {
        this.f228161k = i;
        m82617M();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: c */
    public final boolean mo80289c() {
        return this.f228158h == this.f228156f && !m82607B(1);
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: d */
    public final int mo80290d() {
        return this.f228160j + this.f228158h;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: h */
    public final int mo80291h() throws zzagk {
        if (mo80289c()) {
            this.f228159i = 0;
            return 0;
        }
        int iM82611G = m82611G();
        this.f228159i = iM82611G;
        if ((iM82611G >>> 3) != 0) {
            return iM82611G;
        }
        throw new zzagk("Protocol message contained an invalid tag (zero).");
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: i */
    public final void mo80292i() throws zzagk {
        if (this.f228159i != 0) {
            throw new zzagk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: j */
    public final double mo80293j() {
        return Double.longBitsToDouble(m82615K());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: k */
    public final float mo80294k() {
        return Float.intBitsToFloat(m82614J());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: l */
    public final long mo80295l() {
        return m82612H();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: m */
    public final long mo80296m() {
        return m82612H();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: n */
    public final int mo80297n() {
        return m82611G();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: o */
    public final long mo80298o() {
        return m82615K();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: p */
    public final int mo80299p() {
        return m82614J();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: q */
    public final boolean mo80300q() {
        return m82612H() != 0;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: r */
    public final String mo80301r() throws zzagk {
        int iM82611G = m82611G();
        byte[] bArr = this.f228155e;
        if (iM82611G > 0) {
            int i = this.f228156f;
            int i2 = this.f228158h;
            if (iM82611G <= i - i2) {
                String str = new String(bArr, i2, iM82611G, StandardCharsets.UTF_8);
                this.f228158h += iM82611G;
                return str;
            }
        }
        if (iM82611G == 0) {
            return "";
        }
        if (iM82611G < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iM82611G > this.f228156f) {
            return new String(m82608C(iM82611G), StandardCharsets.UTF_8);
        }
        m82606A(iM82611G);
        String str2 = new String(bArr, this.f228158h, iM82611G, StandardCharsets.UTF_8);
        this.f228158h += iM82611G;
        return str2;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: s */
    public final String mo80302s() throws zzagk {
        int iM82611G = m82611G();
        int i = this.f228158h;
        int i2 = this.f228156f;
        int i3 = i2 - i;
        byte[] bArrM82608C = this.f228155e;
        if (iM82611G <= i3 && iM82611G > 0) {
            this.f228158h = i + iM82611G;
        } else {
            if (iM82611G == 0) {
                return "";
            }
            if (iM82611G < 0) {
                throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iM82611G <= i2) {
                m82606A(iM82611G);
                this.f228158h = iM82611G;
            } else {
                bArrM82608C = m82608C(iM82611G);
            }
        }
        return lcf1.m58710c(i, bArrM82608C, iM82611G);
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: t */
    public final r9f1 mo80303t() throws zzagk {
        int iM82611G = m82611G();
        int i = this.f228156f;
        int i2 = this.f228158h;
        int i3 = i - i2;
        byte[] bArr = this.f228155e;
        if (iM82611G <= i3 && iM82611G > 0) {
            r9f1 r9f1VarM77581x = s9f1.m77581x(i2, bArr, iM82611G);
            this.f228158h += iM82611G;
            return r9f1VarM77581x;
        }
        if (iM82611G == 0) {
            return s9f1.f206952b;
        }
        if (iM82611G < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrM82609D = m82609D(iM82611G);
        if (bArrM82609D != null) {
            return s9f1.m77581x(0, bArrM82609D, bArrM82609D.length);
        }
        int i4 = this.f228158h;
        int i5 = this.f228156f;
        int i6 = i5 - i4;
        this.f228160j += i5;
        this.f228158h = 0;
        this.f228156f = 0;
        ArrayList<byte[]> arrayListM82610E = m82610E(iM82611G - i6);
        byte[] bArr2 = new byte[iM82611G];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListM82610E) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            return iM82611G == 0 ? s9f1.f206952b : new r9f1(bArr2);
        } catch (zzagk e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: u */
    public final int mo80304u() {
        return m82611G();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: v */
    public final int mo80305v() {
        return m82611G();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: w */
    public final int mo80306w() {
        return m82614J();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: x */
    public final long mo80307x() {
        return m82615K();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: y */
    public final int mo80308y() {
        return v9f1.m84964f(m82611G());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: z */
    public final long mo80309z() {
        return v9f1.m84965g(m82612H());
    }
}
