package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class roi0 {

    /* JADX INFO: renamed from: a */
    public long[] f201270a;

    /* JADX INFO: renamed from: b */
    public int[] f201271b;

    /* JADX INFO: renamed from: c */
    public int[] f201272c;

    /* JADX INFO: renamed from: d */
    public int f201273d;

    /* JADX INFO: renamed from: e */
    public int f201274e;

    /* JADX INFO: renamed from: f */
    public int f201275f;

    public roi0(int i) {
        this.f201270a = rdy0.f198228a;
        int[] iArr = f450.f65676a;
        this.f201271b = iArr;
        this.f201272c = iArr;
        if (i >= 0) {
            m76058e(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76054a() {
        this.f201274e = 0;
        long[] jArr = this.f201270a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f201270a;
            int i = this.f201273d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f201275f = rdy0.m75371a(this.f201273d) - this.f201274e;
    }

    /* JADX INFO: renamed from: b */
    public final int m76055b(int i) {
        int i2 = this.f201273d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f201270a;
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

    /* JADX INFO: renamed from: c */
    public final int m76056c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f201273d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f201270a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f201271b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m76057d(int i, int i2) {
        int iM76056c = m76056c(i);
        return iM76056c >= 0 ? this.f201272c[iM76056c] : i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m76058e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f201273d = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f201270a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f201275f = rdy0.m75371a(this.f201273d) - this.f201274e;
        this.f201271b = new int[iMax];
        this.f201272c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof roi0)) {
            return false;
        }
        roi0 roi0Var = (roi0) obj;
        if (roi0Var.f201274e != this.f201274e) {
            return false;
        }
        int[] iArr = this.f201271b;
        int[] iArr2 = this.f201272c;
        long[] jArr = this.f201270a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int iM76056c = roi0Var.m76056c(i5);
                        if (iM76056c < 0 || i6 != roi0Var.f201272c[iM76056c]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                    i3++;
                    z2 = z2;
                }
                z = z2;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z2;
            }
            if (i == length) {
                return z;
            }
            i++;
            z2 = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m76059f(int i, int i2) {
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i5 = i;
        int i6 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f201273d;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f201270a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j4 = (((-i14) >> 63) & (jArr2[i13 + 1] << (64 - i14))) | (jArr2[i13] >>> i14);
            long j5 = i9;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i11) & i10;
                int i18 = i6;
                if (this.f201271b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iM76055b = m76055b(i8);
                long j8 = 255;
                if (this.f201275f != 0 || ((this.f201270a[iM76055b >> 3] >> ((iM76055b & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    j3 = 128;
                } else {
                    int i20 = this.f201273d;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.f201274e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f201270a;
                            int i21 = this.f201273d;
                            int[] iArr3 = this.f201271b;
                            int[] iArr4 = this.f201272c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int length = jArr3.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i24] = jArr3[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j10 = (jArr3[i27] >> i28) & j2;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i26]) * i19;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iM76055b2 = m76055b(i30);
                                    int i31 = i30 & i21;
                                    char c2 = c;
                                    if (((iM76055b2 - i31) & i21) / 8 == ((i26 - i31) & i21) / 8) {
                                        int i32 = i17;
                                        jArr3[i27] = (((long) (i29 & 127)) << i28) | (jArr3[i27] & (~(j2 << i28)));
                                        jArr3[jArr3.length - 1] = (jArr3[i32] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i15 = i15;
                                        c = c2;
                                        i17 = i32;
                                    } else {
                                        int i33 = i15;
                                        int i34 = i17;
                                        int i35 = iM76055b2 >> 3;
                                        long j11 = jArr3[i35];
                                        int i36 = (iM76055b2 & 7) << 3;
                                        if (((j11 >> i36) & j2) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i35] = ((~(j2 << i36)) & j11) | (((long) (i29 & 127)) << i36);
                                            jArr3[i27] = (jArr3[i27] & (~(j2 << i28))) | (128 << i28);
                                            iArr[iM76055b2] = iArr[i26];
                                            iArr[i26] = i34;
                                            iArr2[iM76055b2] = iArr2[i26];
                                            iArr2[i26] = i34;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i35] = (((long) (i29 & 127)) << i36) | ((~(j2 << i36)) & j11);
                                            int i37 = iArr[iM76055b2];
                                            iArr[iM76055b2] = iArr[i26];
                                            iArr[i26] = i37;
                                            int i38 = iArr2[iM76055b2];
                                            iArr2[iM76055b2] = iArr2[i26];
                                            iArr2[i26] = i38;
                                            i26--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i34] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i15 = i33;
                                        c = c2;
                                        i17 = i34;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i3 = i15;
                            i4 = i17;
                            this.f201275f = rdy0.m75371a(this.f201273d) - this.f201274e;
                        }
                        iM76055b = m76055b(i8);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    int iM75372b = rdy0.m75372b(this.f201273d);
                    long[] jArr4 = this.f201270a;
                    int[] iArr5 = this.f201271b;
                    int[] iArr6 = this.f201272c;
                    int i39 = this.f201273d;
                    m76058e(iM75372b);
                    long[] jArr5 = this.f201270a;
                    int[] iArr7 = this.f201271b;
                    int[] iArr8 = this.f201272c;
                    int i40 = this.f201273d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr4[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j3) {
                            int i42 = iArr5[i41];
                            int iHashCode3 = Integer.hashCode(i42) * i19;
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM76055b3 = m76055b(i43 >>> 7);
                            jArr = jArr5;
                            long j12 = i43 & 127;
                            int i44 = iM76055b3 >> 3;
                            int i45 = (iM76055b3 & 7) << 3;
                            long j13 = (jArr[i44] & (~(255 << i45))) | (j12 << i45);
                            jArr[i44] = j13;
                            jArr[(((iM76055b3 - 7) & i40) + (i40 & 7)) >> 3] = j13;
                            iArr7[iM76055b3] = i42;
                            iArr8[iM76055b3] = iArr6[i41];
                        } else {
                            jArr = jArr5;
                        }
                        i41++;
                        jArr5 = jArr;
                    }
                    iM76055b = m76055b(i8);
                }
                this.f201274e++;
                int i46 = this.f201275f;
                long[] jArr6 = this.f201270a;
                int i47 = iM76055b >> 3;
                long j14 = jArr6[i47];
                int i48 = (iM76055b & 7) << 3;
                if (((j14 >> i48) & j2) == j3) {
                    i4 = i3;
                }
                this.f201275f = i46 - i4;
                int i49 = this.f201273d;
                long j15 = (j14 & (~(j2 << i48))) | (j << i48);
                jArr6[i47] = j15;
                jArr6[(((iM76055b - 7) & i49) + (i49 & 7)) >> 3] = j15;
                iNumberOfTrailingZeros = ~iM76055b;
                break;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i5 = i;
            i6 = i19;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f201271b[iNumberOfTrailingZeros] = i;
        this.f201272c[iNumberOfTrailingZeros] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f201271b;
        int[] iArr2 = this.f201272c;
        long[] jArr = this.f201270a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f201274e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f201271b;
        int[] iArr2 = this.f201272c;
        long[] jArr = this.f201270a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.f201274e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ roi0() {
        this(6);
    }
}
