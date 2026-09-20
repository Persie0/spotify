package p204p;

import androidx.car.app.model.Alert;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class mpi0 {

    /* JADX INFO: renamed from: a */
    public long[] f146031a = rdy0.f198228a;

    /* JADX INFO: renamed from: b */
    public Object[] f146032b = fem.f68798c;

    /* JADX INFO: renamed from: c */
    public long[] f146033c = c9g1.f35554a;

    /* JADX INFO: renamed from: d */
    public int f146034d = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: e */
    public int f146035e = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: f */
    public int f146036f;

    /* JADX INFO: renamed from: g */
    public int f146037g;

    /* JADX INFO: renamed from: h */
    public int f146038h;

    public mpi0(int i) {
        if (i >= 0) {
            m62490f(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62485a(Object obj) {
        int i = this.f146037g;
        int iM62488d = m62488d(obj);
        this.f146032b[iM62488d] = obj;
        long[] jArr = this.f146033c;
        int i2 = this.f146034d;
        jArr[iM62488d] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM62488d) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.f146034d = iM62488d;
        if (this.f146035e == Integer.MAX_VALUE) {
            this.f146035e = iM62488d;
        }
        return this.f146037g != i;
    }

    /* JADX INFO: renamed from: b */
    public final void m62486b() {
        this.f146037g = 0;
        long[] jArr = this.f146031a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f146031a;
            int i = this.f146036f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bk5.m29578A0(this.f146032b, null, 0, this.f146036f);
        bk5.m29580C0(this.f146033c, 4611686018427387903L);
        this.f146034d = Alert.DURATION_SHOW_INDEFINITELY;
        this.f146035e = Alert.DURATION_SHOW_INDEFINITELY;
        this.f146038h = rdy0.m75371a(this.f146036f) - this.f146037g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m62487c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f146036f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f146031a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f146032b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m62488d(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f146036f;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.f146031a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j8) >> 3)) & i5;
                int i11 = i;
                if (wj50.m88271j(this.f146032b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM62489e = m62489e(i3);
                if (this.f146038h != 0 || ((this.f146031a[iM62489e >> 3] >> ((iM62489e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.f146036f;
                    if (i13 <= 8 || Long.compare((((long) this.f146037g) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) > 0) {
                        j = 255;
                        j2 = j5;
                        j3 = 128;
                        int iM75372b = rdy0.m75372b(this.f146036f);
                        long[] jArr3 = this.f146031a;
                        Object[] objArr2 = this.f146032b;
                        long[] jArr4 = this.f146033c;
                        int i14 = this.f146036f;
                        int[] iArr = new int[i14];
                        m62490f(iM75372b);
                        long[] jArr5 = this.f146031a;
                        Object[] objArr3 = this.f146032b;
                        long[] jArr6 = this.f146033c;
                        int i15 = this.f146036f;
                        int i16 = 0;
                        while (i16 < i14) {
                            if (((jArr3[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i16];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                int i17 = iHashCode2 ^ (iHashCode2 << 16);
                                int iM62489e2 = m62489e(i17 >>> 7);
                                jArr = jArr5;
                                long j9 = i17 & 127;
                                int i18 = iM62489e2 >> 3;
                                int i19 = (iM62489e2 & 7) << 3;
                                long j10 = (jArr[i18] & (~(255 << i19))) | (j9 << i19);
                                jArr[i18] = j10;
                                jArr[(((iM62489e2 - 7) & i15) + (i15 & 7)) >> 3] = j10;
                                objArr3[iM62489e2] = obj2;
                                jArr6[iM62489e2] = jArr4[i16];
                                iArr[i16] = iM62489e2;
                            } else {
                                jArr = jArr5;
                            }
                            i16++;
                            jArr3 = jArr3;
                            jArr5 = jArr;
                        }
                        long[] jArr7 = this.f146033c;
                        int length = jArr7.length;
                        for (int i20 = 0; i20 < length; i20++) {
                            long j11 = jArr7[i20];
                            int i21 = (int) ((j11 >> 31) & 2147483647L);
                            int i22 = (int) (j11 & 2147483647L);
                            jArr7[i20] = (((j11 & (-4611686018427387904L)) | ((long) (i21 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i21]))) << 31) | ((long) (i22 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i22]));
                        }
                        int i23 = this.f146034d;
                        if (i23 != Integer.MAX_VALUE) {
                            this.f146034d = iArr[i23];
                        }
                        int i24 = this.f146035e;
                        if (i24 != Integer.MAX_VALUE) {
                            this.f146035e = iArr[i24];
                        }
                    } else {
                        long[] jArr8 = this.f146031a;
                        if (jArr8 == null) {
                            j = 255;
                            j2 = j5;
                            j3 = 128;
                        } else {
                            int i25 = this.f146036f;
                            Object[] objArr4 = this.f146032b;
                            long[] jArr9 = this.f146033c;
                            j3 = 128;
                            long[] jArr10 = new long[i25];
                            bk5.m29641z0(jArr10, i25);
                            int i26 = (i25 + 7) >> 3;
                            j = 255;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j12 = j7;
                                long j13 = jArr8[i27] & j12;
                                jArr8[i27] = ((~j13) + (j13 >>> 7)) & (-72340172838076674L);
                                i27++;
                                j5 = j5;
                                j7 = j12;
                            }
                            j2 = j5;
                            int length2 = jArr8.length;
                            int i28 = length2 - 1;
                            int i29 = length2 - 2;
                            jArr8[i29] = (jArr8[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr8[i28] = jArr8[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j14 = (jArr8[i31] >> i32) & 255;
                                if (j14 != 128 && j14 == 254) {
                                    Object obj3 = objArr4[i30];
                                    int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i12;
                                    int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i34 = i33 >>> 7;
                                    int iM62489e3 = m62489e(i34);
                                    int i35 = i34 & i25;
                                    if (((iM62489e3 - i35) & i25) / 8 == ((i30 - i35) & i25) / 8) {
                                        jArr8[i31] = (((long) (i33 & 127)) << i32) | (jArr8[i31] & (~(255 << i32)));
                                        if (jArr10[i30] == 9223372034707292159L) {
                                            long j15 = i30;
                                            jArr10[i30] = j15 | (j15 << 32);
                                        }
                                        jArr8[jArr8.length - 1] = jArr8[0];
                                    } else {
                                        int i36 = iM62489e3 >> 3;
                                        long j16 = jArr8[i36];
                                        int i37 = (iM62489e3 & 7) << 3;
                                        if (((j16 >> i37) & 255) == 128) {
                                            objArr = objArr4;
                                            jArr8[i36] = ((~(255 << i37)) & j16) | (((long) (i33 & 127)) << i37);
                                            jArr8[i31] = (jArr8[i31] & (~(255 << i32))) | (128 << i32);
                                            objArr[iM62489e3] = objArr[i30];
                                            objArr[i30] = null;
                                            jArr9[iM62489e3] = jArr9[i30];
                                            jArr9[i30] = 4611686018427387903L;
                                            int i38 = (int) ((jArr10[i30] >> 32) & 4294967295L);
                                            if (i38 != Integer.MAX_VALUE) {
                                                jArr10[i38] = (jArr10[i38] & (-4294967296L)) | ((long) iM62489e3);
                                                jArr10[i30] = (jArr10[i30] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr10[i30] = (((long) Alert.DURATION_SHOW_INDEFINITELY) << 32) | ((long) iM62489e3);
                                            }
                                            jArr10[iM62489e3] = (((long) i30) << 32) | ((long) Alert.DURATION_SHOW_INDEFINITELY);
                                        } else {
                                            objArr = objArr4;
                                            jArr8[i36] = ((~(255 << i37)) & j16) | (((long) (i33 & 127)) << i37);
                                            Object obj4 = objArr[iM62489e3];
                                            objArr[iM62489e3] = objArr[i30];
                                            objArr[i30] = obj4;
                                            long j17 = jArr9[iM62489e3];
                                            jArr9[iM62489e3] = jArr9[i30];
                                            jArr9[i30] = j17;
                                            int i39 = (int) ((jArr10[i30] >> 32) & 4294967295L);
                                            if (i39 != Integer.MAX_VALUE) {
                                                long j18 = iM62489e3;
                                                jArr10[i39] = (jArr10[i39] & (-4294967296L)) | j18;
                                                jArr10[i30] = (jArr10[i30] & 4294967295L) | (j18 << 32);
                                            } else {
                                                long j19 = iM62489e3;
                                                jArr10[i30] = j19 | (j19 << 32);
                                                i39 = i30;
                                            }
                                            jArr10[iM62489e3] = (((long) i39) << 32) | ((long) i30);
                                            i30--;
                                        }
                                        jArr8[jArr8.length - 1] = jArr8[0];
                                        i30++;
                                        i25 = i25;
                                        objArr4 = objArr;
                                    }
                                }
                                i30++;
                            }
                            this.f146038h = rdy0.m75371a(this.f146036f) - this.f146037g;
                            long[] jArr11 = this.f146033c;
                            int length3 = jArr11.length;
                            for (int i40 = 0; i40 < length3; i40++) {
                                long j20 = jArr11[i40];
                                int i41 = (int) ((j20 >> 31) & 2147483647L);
                                int i42 = (int) (j20 & 2147483647L);
                                jArr11[i40] = (((j20 & (-4611686018427387904L)) | ((long) (i41 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr10[i41] & 4294967295L)))) << 31) | ((long) (i42 == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : (int) (jArr10[i42] & 4294967295L)));
                            }
                            int i43 = this.f146034d;
                            if (i43 != Integer.MAX_VALUE) {
                                this.f146034d = (int) (jArr10[i43] & 4294967295L);
                            }
                            int i44 = this.f146035e;
                            if (i44 != Integer.MAX_VALUE) {
                                this.f146035e = (int) (jArr10[i44] & 4294967295L);
                            }
                        }
                    }
                    iM62489e = m62489e(i3);
                }
                this.f146037g++;
                int i45 = this.f146038h;
                long[] jArr12 = this.f146031a;
                int i46 = iM62489e >> 3;
                long j21 = jArr12[i46];
                int i47 = (iM62489e & 7) << 3;
                this.f146038h = i45 - (((j21 >> i47) & j) == j3 ? 1 : 0);
                int i48 = this.f146036f;
                long j22 = (j21 & (~(j << i47))) | (j2 << i47);
                jArr12[i46] = j22;
                jArr12[(((iM62489e - 7) & i48) + (i48 & 7)) >> 3] = j22;
                return iM62489e;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m62489e(int i) {
        int i2 = this.f146036f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f146031a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpi0)) {
            return false;
        }
        mpi0 mpi0Var = (mpi0) obj;
        if (mpi0Var.f146037g != this.f146037g) {
            return false;
        }
        Object[] objArr = this.f146032b;
        long[] jArr = this.f146031a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !mpi0Var.m62487c(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m62490f(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f146036f = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f146031a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f146038h = rdy0.m75371a(this.f146036f) - this.f146037g;
        this.f146032b = iMax == 0 ? fem.f68798c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = c9g1.f35554a;
        } else {
            jArr2 = new long[iMax];
            bk5.m29580C0(jArr2, 4611686018427387903L);
        }
        this.f146033c = jArr2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m62491g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f146036f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f146031a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f146032b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m62492h(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m62492h(int i) {
        this.f146037g--;
        long[] jArr = this.f146031a;
        int i2 = this.f146036f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f146032b[i] = null;
        long[] jArr2 = this.f146033c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.f146034d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.f146035e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f146036f * 31) + this.f146037g;
        Object[] objArr = this.f146032b;
        long[] jArr = this.f146031a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!wj50.m88271j(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000f->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000f->B:17:0x004e], SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final boolean m62493i(Collection collection) {
        Object[] objArr = this.f146032b;
        int i = this.f146037g;
        long[] jArr = this.f146031a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!g6f.m43725i0(collection, objArr[i5])) {
                                m62492h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.f146037g;
    }

    public final String toString() {
        f0l0 f0l0Var = new f0l0(this, 16);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f146032b;
        long[] jArr = this.f146033c;
        int i = this.f146035e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) f0l0Var.invoke(obj));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
