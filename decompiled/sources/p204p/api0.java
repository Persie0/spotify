package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class api0 {

    /* JADX INFO: renamed from: a */
    public long[] f17953a = rdy0.f198228a;

    /* JADX INFO: renamed from: b */
    public long[] f17954b = v2b0.f236599a;

    /* JADX INFO: renamed from: c */
    public int f17955c;

    /* JADX INFO: renamed from: d */
    public int f17956d;

    /* JADX INFO: renamed from: e */
    public int f17957e;

    public api0(int i) {
        if (i >= 0) {
            m26713c(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26711a(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f17955c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f17953a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f17954b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m26712b(int i) {
        int i2 = this.f17955c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f17953a;
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
    public final void m26713c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f17955c = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f17953a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f17957e = rdy0.m75371a(this.f17955c) - this.f17956d;
        this.f17954b = new long[iMax];
    }

    /* JADX INFO: renamed from: d */
    public final void m26714d(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f17955c;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f17953a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j5 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j6 = i7;
            int i14 = i10;
            int i15 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                int i16 = i4;
                if (this.f17954b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iM26712b = m26712b(i6);
                long j9 = 255;
                if (this.f17957e != 0 || ((this.f17953a[iM26712b >> 3] >> ((iM26712b & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.f17955c;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compare((((long) this.f17956d) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f17953a;
                            int i19 = this.f17955c;
                            long[] jArr4 = this.f17954b;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = j9;
                                long j11 = jArr3[i21] & (-9187201950435737472L);
                                jArr3[i21] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i21++;
                                j6 = j6;
                                j9 = j10;
                            }
                            j2 = j9;
                            j3 = j6;
                            char c = 7;
                            int length = jArr3.length;
                            int i22 = length - 1;
                            int i23 = length - 2;
                            long j12 = 72057594037927935L;
                            jArr3[i23] = (jArr3[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i22] = jArr3[0];
                            int i24 = 0;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j13 = (jArr3[i25] >> i26) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i24]) * i17;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iM26712b2 = m26712b(i28);
                                    int i29 = i28 & i19;
                                    long j14 = j12;
                                    if (((iM26712b2 - i29) & i19) / 8 == ((i24 - i29) & i19) / 8) {
                                        int i30 = i15;
                                        jArr3[i25] = (((long) (i27 & 127)) << i26) | (jArr3[i25] & (~(j2 << i26)));
                                        jArr3[jArr3.length - i13] = (jArr3[i30] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        c = c;
                                        j12 = j14;
                                        i15 = i30;
                                    } else {
                                        char c2 = c;
                                        int i31 = i15;
                                        int i32 = iM26712b2 >> 3;
                                        long j15 = jArr3[i32];
                                        int i33 = (iM26712b2 & 7) << 3;
                                        if (((j15 >> i33) & j2) == 128) {
                                            i3 = i13;
                                            jArr3[i32] = (j15 & (~(j2 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr3[i25] = (jArr3[i25] & (~(j2 << i26))) | (128 << i26);
                                            jArr4[iM26712b2] = jArr4[i24];
                                            jArr4[i24] = 0;
                                        } else {
                                            i3 = i13;
                                            jArr3[i32] = (((long) (i27 & 127)) << i33) | (j15 & (~(j2 << i33)));
                                            long j16 = jArr4[iM26712b2];
                                            jArr4[iM26712b2] = jArr4[i24];
                                            jArr4[i24] = j16;
                                            i24--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i31] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        c = c2;
                                        j12 = j14;
                                        i15 = i31;
                                        i13 = i3;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i = i15;
                            i2 = i13;
                            this.f17957e = rdy0.m75371a(this.f17955c) - this.f17956d;
                        }
                        iM26712b = m26712b(i6);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iM75372b = rdy0.m75372b(this.f17955c);
                    long[] jArr5 = this.f17953a;
                    long[] jArr6 = this.f17954b;
                    int i34 = this.f17955c;
                    m26713c(iM75372b);
                    long[] jArr7 = this.f17953a;
                    long[] jArr8 = this.f17954b;
                    int i35 = this.f17955c;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j17 = jArr6[i36];
                            int iHashCode3 = Long.hashCode(j17) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM26712b3 = m26712b(i37 >>> 7);
                            long j18 = i37 & 127;
                            int i38 = iM26712b3 >> 3;
                            int i39 = (iM26712b3 & 7) << 3;
                            jArr = jArr7;
                            long j19 = (jArr7[i38] & (~(255 << i39))) | (j18 << i39);
                            jArr[i38] = j19;
                            jArr[(((iM26712b3 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            jArr8[iM26712b3] = j17;
                        } else {
                            jArr = jArr7;
                        }
                        i36++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iM26712b = m26712b(i6);
                }
                iNumberOfTrailingZeros = iM26712b;
                this.f17956d++;
                int i40 = this.f17957e;
                long[] jArr9 = this.f17953a;
                int i41 = iNumberOfTrailingZeros >> 3;
                long j20 = jArr9[i41];
                int i42 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j20 >> i42) & j2) == j4) {
                    i = i2;
                }
                this.f17957e = i40 - i;
                int i43 = this.f17955c;
                long j21 = (j20 & (~(j2 << i42))) | (j3 << i42);
                jArr9[i41] = j21;
                jArr9[(((iNumberOfTrailingZeros - 7) & i43) + (i43 & 7)) >> 3] = j21;
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
        this.f17954b[iNumberOfTrailingZeros] = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m26715e(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f17955c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f17953a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f17954b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i5 += 8;
                i4 = (i4 + i5) & i3;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.f17956d--;
            long[] jArr2 = this.f17953a;
            int i8 = this.f17955c;
            int i9 = iNumberOfTrailingZeros >> 3;
            int i10 = (iNumberOfTrailingZeros & 7) << 3;
            long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
            jArr2[i9] = j5;
            jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof api0)) {
            return false;
        }
        api0 api0Var = (api0) obj;
        if (api0Var.f17956d != this.f17956d) {
            return false;
        }
        long[] jArr = this.f17954b;
        long[] jArr2 = this.f17953a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !api0Var.m26711a(jArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        long[] jArr = this.f17954b;
        long[] jArr2 = this.f17953a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f17954b;
        long[] jArr2 = this.f17953a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j2);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
