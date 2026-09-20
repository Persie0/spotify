package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import p204p.dva;
import p204p.ge50;
import p204p.ptc;
import p204p.zza1;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0045b extends ptc {

    /* JADX INFO: renamed from: c */
    public final byte[] f832c;

    /* JADX INFO: renamed from: d */
    public int f833d;

    /* JADX INFO: renamed from: e */
    public int f834e;

    /* JADX INFO: renamed from: g */
    public int f836g;

    /* JADX INFO: renamed from: h */
    public int f837h = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: f */
    public int f835f = 0;

    public C0045b(byte[] bArr, int i) {
        this.f832c = bArr;
        this.f833d = i;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: B0 */
    public final boolean mo429B0() {
        return m451Z0() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p204p.ptc
    /* JADX INFO: renamed from: C0 */
    public final dva mo430C0() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM450Y0 = m450Y0();
        byte[] bArr = this.f832c;
        if (iM450Y0 > 0) {
            int i = this.f833d;
            int i2 = this.f835f;
            if (iM450Y0 <= i - i2) {
                dva dvaVarM37078a = dva.m37078a(i2, bArr, iM450Y0);
                this.f835f += iM450Y0;
                return dvaVarM37078a;
            }
        }
        if (iM450Y0 == 0) {
            return dva.f53402c;
        }
        if (iM450Y0 > 0) {
            int i3 = this.f833d;
            int i4 = this.f835f;
            if (iM450Y0 <= i3 - i4) {
                int i5 = iM450Y0 + i4;
                this.f835f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM450Y0 <= 0) {
                    throw InvalidProtocolBufferException.m424f();
                }
                if (iM450Y0 == 0) {
                    throw InvalidProtocolBufferException.m422d();
                }
                bArrCopyOfRange = ge50.f79024b;
            }
        } else {
            if (iM450Y0 <= 0) {
                throw InvalidProtocolBufferException.m424f();
            }
            if (iM450Y0 == 0) {
                throw InvalidProtocolBufferException.m422d();
            }
            bArrCopyOfRange = ge50.f79024b;
        }
        dva dvaVar = dva.f53402c;
        return new dva(bArrCopyOfRange);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: D0 */
    public final double mo431D0() {
        return Double.longBitsToDouble(m449X0());
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: E0 */
    public final int mo432E0() {
        return m450Y0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: F0 */
    public final int mo433F0() {
        return m448W0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: G0 */
    public final long mo434G0() {
        return m449X0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: H0 */
    public final float mo435H0() {
        return Float.intBitsToFloat(m448W0());
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: I0 */
    public final int mo436I0() {
        return m450Y0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: J0 */
    public final long mo437J0() {
        return m451Z0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: K0 */
    public final int mo438K0() {
        return m448W0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: L0 */
    public final long mo439L0() {
        return m449X0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: M0 */
    public final int mo440M0() {
        int iM450Y0 = m450Y0();
        return (-(iM450Y0 & 1)) ^ (iM450Y0 >>> 1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: N0 */
    public final long mo441N0() {
        long jM451Z0 = m451Z0();
        return (-(jM451Z0 & 1)) ^ (jM451Z0 >>> 1);
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: O0 */
    public final String mo442O0() throws InvalidProtocolBufferException {
        int iM450Y0 = m450Y0();
        if (iM450Y0 > 0) {
            int i = this.f833d;
            int i2 = this.f835f;
            if (iM450Y0 <= i - i2) {
                String str = new String(this.f832c, i2, iM450Y0, ge50.f79023a);
                this.f835f += iM450Y0;
                return str;
            }
        }
        if (iM450Y0 == 0) {
            return "";
        }
        if (iM450Y0 < 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        throw InvalidProtocolBufferException.m424f();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: P0 */
    public final String mo443P0() throws InvalidProtocolBufferException {
        int iM450Y0 = m450Y0();
        if (iM450Y0 > 0) {
            int i = this.f833d;
            int i2 = this.f835f;
            if (iM450Y0 <= i - i2) {
                String strMo68635g = zza1.f287933a.mo68635g(i2, this.f832c, iM450Y0);
                this.f835f += iM450Y0;
                return strMo68635g;
            }
        }
        if (iM450Y0 == 0) {
            return "";
        }
        if (iM450Y0 <= 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        throw InvalidProtocolBufferException.m424f();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: Q0 */
    public final int mo444Q0() throws InvalidProtocolBufferException {
        if (mo457p0()) {
            this.f836g = 0;
            return 0;
        }
        int iM450Y0 = m450Y0();
        this.f836g = iM450Y0;
        if ((iM450Y0 >>> 3) != 0) {
            return iM450Y0;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: R0 */
    public final int mo445R0() {
        return m450Y0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: S0 */
    public final long mo446S0() {
        return m451Z0();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: U0 */
    public final boolean mo447U0(int i) throws InvalidProtocolBufferException {
        int iMo444Q0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f833d - this.f835f;
            byte[] bArr = this.f832c;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f835f;
                    this.f835f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m421c();
            }
            while (i3 < 10) {
                int i6 = this.f835f;
                if (i6 == this.f833d) {
                    throw InvalidProtocolBufferException.m424f();
                }
                this.f835f = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.m421c();
            return true;
        }
        if (i2 == 1) {
            m454c1(8);
            return true;
        }
        if (i2 == 2) {
            m454c1(m450Y0());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m420b();
            }
            m454c1(4);
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
    public final int m448W0() throws InvalidProtocolBufferException {
        int i = this.f835f;
        if (this.f833d - i < 4) {
            throw InvalidProtocolBufferException.m424f();
        }
        this.f835f = i + 4;
        byte[] bArr = this.f832c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: X0 */
    public final long m449X0() throws InvalidProtocolBufferException {
        int i = this.f835f;
        if (this.f833d - i < 8) {
            throw InvalidProtocolBufferException.m424f();
        }
        this.f835f = i + 8;
        byte[] bArr = this.f832c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m450Y0() {
        int i;
        int i2 = this.f835f;
        int i3 = this.f833d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f832c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f835f = i4;
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
                this.f835f = i5;
                return i;
            }
        }
        return (int) m452a1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final long m451Z0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f835f;
        int i2 = this.f833d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f832c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f835f = i3;
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
                this.f835f = i4;
                return j;
            }
        }
        return m452a1();
    }

    /* JADX INFO: renamed from: a1 */
    public final long m452a1() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f835f;
            if (i2 == this.f833d) {
                throw InvalidProtocolBufferException.m424f();
            }
            this.f835f = i2 + 1;
            byte b = this.f832c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m421c();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m453b1() {
        int i = this.f833d + this.f834e;
        this.f833d = i;
        int i2 = this.f837h;
        if (i <= i2) {
            this.f834e = 0;
            return;
        }
        int i3 = i - i2;
        this.f834e = i3;
        this.f833d = i - i3;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m454c1(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.f833d;
            int i3 = this.f835f;
            if (i <= i2 - i3) {
                this.f835f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.m424f();
        }
        throw InvalidProtocolBufferException.m422d();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: k0 */
    public final void mo455k0(int i) throws InvalidProtocolBufferException {
        if (this.f836g != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: o0 */
    public final int mo456o0() {
        return this.f835f;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: p0 */
    public final boolean mo457p0() {
        return this.f835f == this.f833d;
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: w0 */
    public final void mo458w0(int i) {
        this.f837h = i;
        m453b1();
    }

    @Override // p204p.ptc
    /* JADX INFO: renamed from: z0 */
    public final int mo459z0(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m422d();
        }
        int i2 = this.f835f + i;
        int i3 = this.f837h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m424f();
        }
        this.f837h = i2;
        m453b1();
        return i3;
    }
}
