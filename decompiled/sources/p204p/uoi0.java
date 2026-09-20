package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uoi0 {

    /* JADX INFO: renamed from: a */
    public long[] f232443a;

    /* JADX INFO: renamed from: b */
    public int[] f232444b;

    /* JADX INFO: renamed from: c */
    public int f232445c;

    /* JADX INFO: renamed from: d */
    public int f232446d;

    /* JADX INFO: renamed from: e */
    public int f232447e;

    public uoi0(int i) {
        this.f232443a = rdy0.f198228a;
        this.f232444b = f450.f65676a;
        if (i >= 0) {
            m83625f(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83620a(int i) {
        int i2 = this.f232446d;
        this.f232444b[m83623d(i)] = i;
        return this.f232446d != i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m83621b() {
        this.f232446d = 0;
        long[] jArr = this.f232443a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f232443a;
            int i = this.f232445c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f232447e = rdy0.m75371a(this.f232445c) - this.f232446d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83622c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f232445c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f232443a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f232444b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m83623d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f232445c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f232443a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.f232444b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM83624e = m83624e(i6);
                long j8 = 255;
                if (this.f232447e != 0 || ((this.f232443a[iM83624e >> 3] >> ((iM83624e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.f232445c;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.f232446d) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f232443a;
                            int i21 = this.f232445c;
                            int[] iArr2 = this.f232444b;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                char c2 = c;
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr3.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i24] = jArr3[i19];
                            int i26 = i19;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j11 = (jArr3[i27] >> i28) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i26]) * i18;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iM83624e2 = m83624e(i30);
                                    int i31 = i30 & i21;
                                    if (((iM83624e2 - i31) & i21) / 8 == ((i26 - i31) & i21) / 8) {
                                        long j12 = j10;
                                        jArr3[i27] = (((long) (i29 & 127)) << i28) | ((~(j << i28)) & jArr3[i27]);
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j12) | Long.MIN_VALUE;
                                        i26++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i32 = iM83624e2 >> 3;
                                        long j14 = jArr3[i32];
                                        int i33 = (iM83624e2 & 7) << 3;
                                        if (((j14 >> i33) & j) == 128) {
                                            iArr = iArr2;
                                            int i34 = i26;
                                            jArr3[i32] = ((~(j << i33)) & j14) | (((long) (i29 & 127)) << i33);
                                            jArr3[i27] = (jArr3[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[iM83624e2] = iArr[i34];
                                            iArr[i34] = i19;
                                            i3 = i34;
                                        } else {
                                            iArr = iArr2;
                                            int i35 = i26;
                                            jArr3[i32] = (((long) (i29 & 127)) << i33) | ((~(j << i33)) & j14);
                                            int i36 = iArr[iM83624e2];
                                            iArr[iM83624e2] = iArr[i35];
                                            iArr[i35] = i36;
                                            i3 = i35 - 1;
                                        }
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j13) | Long.MIN_VALUE;
                                        i26 = i3 + i13;
                                        i13 = i13;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i13;
                            this.f232447e = rdy0.m75371a(this.f232445c) - this.f232446d;
                        }
                        iM83624e = m83624e(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM75372b = rdy0.m75372b(this.f232445c);
                    long[] jArr4 = this.f232443a;
                    int[] iArr3 = this.f232444b;
                    int i37 = this.f232445c;
                    m83625f(iM75372b);
                    long[] jArr5 = this.f232443a;
                    int[] iArr4 = this.f232444b;
                    int i38 = this.f232445c;
                    int i39 = i19;
                    while (i39 < i37) {
                        if (((jArr4[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            int i40 = iArr3[i39];
                            int iHashCode3 = Integer.hashCode(i40) * i18;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM83624e3 = m83624e(i41 >>> 7);
                            long j15 = i41 & 127;
                            int i42 = iM83624e3 >> 3;
                            int i43 = (iM83624e3 & 7) << 3;
                            jArr = jArr5;
                            long j16 = (jArr5[i42] & (~(255 << i43))) | (j15 << i43);
                            jArr[i42] = j16;
                            jArr[(((iM83624e3 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                            iArr4[iM83624e3] = i40;
                        } else {
                            jArr = jArr5;
                        }
                        i39++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM83624e = m83624e(i6);
                }
                this.f232446d += i2;
                int i44 = this.f232447e;
                long[] jArr6 = this.f232443a;
                int i45 = iM83624e >> 3;
                long j17 = jArr6[i45];
                int i46 = (iM83624e & 7) << 3;
                if (((j17 >> i46) & j) != j3) {
                    i2 = i19;
                }
                this.f232447e = i44 - i2;
                int i47 = this.f232445c;
                long j18 = (j17 & (~(j << i46))) | (j2 << i46);
                jArr6[i45] = j18;
                jArr6[(((iM83624e - 7) & i47) + (i47 & 7)) >> 3] = j18;
                return iM83624e;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m83624e(int i) {
        int i2 = this.f232445c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f232443a;
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
        if (!(obj instanceof uoi0)) {
            return false;
        }
        uoi0 uoi0Var = (uoi0) obj;
        if (uoi0Var.f232446d != this.f232446d) {
            return false;
        }
        int[] iArr = this.f232444b;
        long[] jArr = this.f232443a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !uoi0Var.m83622c(iArr[(i << 3) + i3])) {
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
    public final void m83625f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f232445c = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f232443a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f232447e = rdy0.m75371a(this.f232445c) - this.f232446d;
        this.f232444b = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m83626g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f232445c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f232443a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f232444b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m83627h(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m83627h(int i) {
        this.f232446d--;
        long[] jArr = this.f232443a;
        int i2 = this.f232445c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f232444b;
        long[] jArr = this.f232443a;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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
        int[] iArr = this.f232444b;
        long[] jArr = this.f232443a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i5);
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

    public /* synthetic */ uoi0() {
        this(6);
    }
}
