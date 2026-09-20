package com.google.crypto.tink.shaded.protobuf;

import androidx.car.app.model.Alert;
import p204p.nwe;
import p204p.w9h1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0152a extends nwe {

    /* JADX INFO: renamed from: d */
    public final byte[] f2341d;

    /* JADX INFO: renamed from: e */
    public int f2342e;

    /* JADX INFO: renamed from: f */
    public int f2343f;

    /* JADX INFO: renamed from: g */
    public int f2344g;

    /* JADX INFO: renamed from: h */
    public final int f2345h;

    /* JADX INFO: renamed from: i */
    public int f2346i;

    /* JADX INFO: renamed from: j */
    public int f2347j;

    public C0152a(byte[] bArr, int i, int i2, boolean z) {
        this.f159104b = 100;
        this.f2347j = Alert.DURATION_SHOW_INDEFINITELY;
        this.f2341d = bArr;
        this.f2342e = i2 + i;
        this.f2344g = i;
        this.f2345h = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m1680c() {
        return this.f2344g - this.f2345h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1681d() {
        return this.f2344g == this.f2342e;
    }

    /* JADX INFO: renamed from: e */
    public final int m1682e(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.m1676d();
        }
        int iM1680c = m1680c() + i;
        int i2 = this.f2347j;
        if (iM1680c > i2) {
            throw InvalidProtocolBufferException.m1678f();
        }
        this.f2347j = iM1680c;
        m1690m();
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1683f() {
        return m1687j() != 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m1684g() throws InvalidProtocolBufferException {
        int i = this.f2344g;
        if (this.f2342e - i < 4) {
            throw InvalidProtocolBufferException.m1678f();
        }
        this.f2344g = i + 4;
        byte[] bArr = this.f2341d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: h */
    public final long m1685h() throws InvalidProtocolBufferException {
        int i = this.f2344g;
        if (this.f2342e - i < 8) {
            throw InvalidProtocolBufferException.m1678f();
        }
        this.f2344g = i + 8;
        byte[] bArr = this.f2341d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: i */
    public final int m1686i() {
        int i;
        int i2 = this.f2344g;
        int i3 = this.f2342e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f2341d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f2344g = i4;
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
                this.f2344g = i5;
                return i;
            }
        }
        return (int) m1688k();
    }

    /* JADX INFO: renamed from: j */
    public final long m1687j() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f2344g;
        int i2 = this.f2342e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f2341d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f2344g = i3;
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
                this.f2344g = i4;
                return j;
            }
        }
        return m1688k();
    }

    /* JADX INFO: renamed from: k */
    public final long m1688k() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f2344g;
            if (i2 == this.f2342e) {
                throw InvalidProtocolBufferException.m1678f();
            }
            this.f2344g = i2 + 1;
            byte b = this.f2341d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m1675c();
    }

    /* JADX INFO: renamed from: l */
    public final int m1689l() throws InvalidProtocolBufferException {
        if (m1681d()) {
            this.f2346i = 0;
            return 0;
        }
        int iM1686i = m1686i();
        this.f2346i = iM1686i;
        if (w9h1.m87510q(iM1686i) != 0) {
            return this.f2346i;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: m */
    public final void m1690m() {
        int i = this.f2342e + this.f2343f;
        this.f2342e = i;
        int i2 = i - this.f2345h;
        int i3 = this.f2347j;
        if (i2 <= i3) {
            this.f2343f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f2343f = i4;
        this.f2342e = i - i4;
    }
}
