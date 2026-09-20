package p204p;

import androidx.car.app.model.Alert;
import com.google.android.recaptcha.internal.zzagk;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class t9f1 extends v9f1 {

    /* JADX INFO: renamed from: d */
    public final byte[] f218283d;

    /* JADX INFO: renamed from: e */
    public final int f218284e;

    /* JADX INFO: renamed from: f */
    public int f218285f;

    /* JADX INFO: renamed from: g */
    public int f218286g;

    /* JADX INFO: renamed from: h */
    public final int f218287h;

    /* JADX INFO: renamed from: i */
    public int f218288i;

    /* JADX INFO: renamed from: j */
    public int f218289j = Alert.DURATION_SHOW_INDEFINITELY;

    public /* synthetic */ t9f1(byte[] bArr, int i, int i2) {
        this.f218283d = bArr;
        int i3 = i2 + i;
        this.f218284e = i3;
        this.f218285f = i3;
        this.f218286g = i;
        this.f218287h = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m80282A() {
        int i;
        int i2 = this.f218286g;
        int i3 = this.f218285f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f218283d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f218286g = i4;
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
                this.f218286g = i5;
                return i;
            }
        }
        return (int) m80284C();
    }

    /* JADX INFO: renamed from: B */
    public final long m80283B() {
        long j;
        long j2;
        long j3;
        int i = this.f218286g;
        int i2 = this.f218285f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f218283d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f218286g = i3;
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
                this.f218286g = i4;
                return j;
            }
        }
        return m80284C();
    }

    /* JADX INFO: renamed from: C */
    public final long m80284C() throws zzagk {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f218286g;
            if (i2 == this.f218285f) {
                throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f218286g = i2 + 1;
            byte b = this.f218283d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new zzagk("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: D */
    public final int m80285D() throws zzagk {
        int i = this.f218286g;
        if (this.f218285f - i < 4) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f218286g = i + 4;
        byte[] bArr = this.f218283d;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: E */
    public final long m80286E() throws zzagk {
        int i = this.f218286g;
        if (this.f218285f - i < 8) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f218286g = i + 8;
        byte[] bArr = this.f218283d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: a */
    public final int mo80287a(int i) throws zzagk {
        if (i < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f218286g;
        int i3 = i2 + i;
        if (i3 < 0) {
            int i4 = i2 - this.f218287h;
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - i4) {
                throw new zzagk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i5 = this.f218289j;
        if (i3 > i5) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f218289j = i3;
        int i6 = this.f218284e;
        if (i3 > i6) {
            i3 = i6;
        }
        this.f218285f = i3;
        return i5;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: b */
    public final void mo80288b(int i) {
        this.f218289j = i;
        int i2 = this.f218284e;
        if (i > i2) {
            i = i2;
        }
        this.f218285f = i;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: c */
    public final boolean mo80289c() {
        return this.f218286g == this.f218285f;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: d */
    public final int mo80290d() {
        return this.f218286g - this.f218287h;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: h */
    public final int mo80291h() throws zzagk {
        if (mo80289c()) {
            this.f218288i = 0;
            return 0;
        }
        int iM80282A = m80282A();
        this.f218288i = iM80282A;
        if ((iM80282A >>> 3) != 0) {
            return iM80282A;
        }
        throw new zzagk("Protocol message contained an invalid tag (zero).");
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: i */
    public final void mo80292i() throws zzagk {
        if (this.f218288i != 0) {
            throw new zzagk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: j */
    public final double mo80293j() {
        return Double.longBitsToDouble(m80286E());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: k */
    public final float mo80294k() {
        return Float.intBitsToFloat(m80285D());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: l */
    public final long mo80295l() {
        return m80283B();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: m */
    public final long mo80296m() {
        return m80283B();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: n */
    public final int mo80297n() {
        return m80282A();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: o */
    public final long mo80298o() {
        return m80286E();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: p */
    public final int mo80299p() {
        return m80285D();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: q */
    public final boolean mo80300q() {
        return m80283B() != 0;
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: r */
    public final String mo80301r() throws zzagk {
        int iM80282A = m80282A();
        if (iM80282A > 0) {
            int i = this.f218285f;
            int i2 = this.f218286g;
            if (iM80282A <= i - i2) {
                String str = new String(this.f218283d, i2, iM80282A, StandardCharsets.UTF_8);
                this.f218286g += iM80282A;
                return str;
            }
        }
        if (iM80282A == 0) {
            return "";
        }
        if (iM80282A < 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: s */
    public final String mo80302s() throws zzagk {
        int iM80282A = m80282A();
        if (iM80282A > 0) {
            int i = this.f218285f;
            int i2 = this.f218286g;
            if (iM80282A <= i - i2) {
                String strM58710c = lcf1.m58710c(i2, this.f218283d, iM80282A);
                this.f218286g += iM80282A;
                return strM58710c;
            }
        }
        if (iM80282A == 0) {
            return "";
        }
        if (iM80282A <= 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: t */
    public final r9f1 mo80303t() throws zzagk {
        int iM80282A = m80282A();
        byte[] bArr = this.f218283d;
        if (iM80282A > 0) {
            int i = this.f218285f;
            int i2 = this.f218286g;
            if (iM80282A <= i - i2) {
                r9f1 r9f1VarM77581x = s9f1.m77581x(i2, bArr, iM80282A);
                this.f218286g += iM80282A;
                return r9f1VarM77581x;
            }
        }
        if (iM80282A == 0) {
            return s9f1.f206952b;
        }
        if (iM80282A > 0) {
            int i3 = this.f218285f;
            int i4 = this.f218286g;
            if (iM80282A <= i3 - i4) {
                int i5 = iM80282A + i4;
                this.f218286g = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                r9f1 r9f1Var = s9f1.f206952b;
                return bArrCopyOfRange.length == 0 ? s9f1.f206952b : new r9f1(bArrCopyOfRange);
            }
        }
        if (iM80282A <= 0) {
            throw new zzagk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: u */
    public final int mo80304u() {
        return m80282A();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: v */
    public final int mo80305v() {
        return m80282A();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: w */
    public final int mo80306w() {
        return m80285D();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: x */
    public final long mo80307x() {
        return m80286E();
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: y */
    public final int mo80308y() {
        return v9f1.m84964f(m80282A());
    }

    @Override // p204p.v9f1
    /* JADX INFO: renamed from: z */
    public final long mo80309z() {
        return v9f1.m84965g(m80283B());
    }
}
