package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cqi0 {

    /* JADX INFO: renamed from: a */
    public long[] f40896a;

    /* JADX INFO: renamed from: b */
    public Object[] f40897b;

    /* JADX INFO: renamed from: c */
    public Object[] f40898c;

    /* JADX INFO: renamed from: d */
    public int f40899d;

    /* JADX INFO: renamed from: e */
    public int f40900e;

    /* JADX INFO: renamed from: f */
    public int f40901f;

    public cqi0(int i) {
        this.f40896a = rdy0.f198228a;
        Object[] objArr = fem.f68798c;
        this.f40897b = objArr;
        this.f40898c = objArr;
        if (i >= 0) {
            m33624h(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33617a() {
        this.f40900e = 0;
        long[] jArr = this.f40896a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f40896a;
            int i = this.f40899d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bk5.m29578A0(this.f40898c, null, 0, this.f40899d);
        bk5.m29578A0(this.f40897b, null, 0, this.f40899d);
        this.f40901f = rdy0.m75371a(this.f40899d) - this.f40900e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33618b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f40899d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f40896a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f40897b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX INFO: renamed from: c */
    public final boolean m33619c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f40899d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f40896a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f40897b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final boolean m33620d(Object obj) {
        Object[] objArr = this.f40898c;
        long[] jArr = this.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && wj50.m88271j(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m33621e(int i) {
        int i2 = this.f40899d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f40896a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cqi0)) {
            return false;
        }
        cqi0 cqi0Var = (cqi0) obj;
        if (cqi0Var.f40900e != this.f40900e) {
            return false;
        }
        Object[] objArr = this.f40897b;
        Object[] objArr2 = this.f40898c;
        long[] jArr = this.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (cqi0Var.m33623g(obj2) != null || !cqi0Var.m33619c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(cqi0Var.m33623g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m33622f(Object obj) {
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
        int i5 = this.f40899d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.f40896a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (wj50.m88271j(this.f40897b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM33621e = m33621e(i3);
                long j8 = 255;
                if (this.f40901f != 0 || ((this.f40896a[iM33621e >> 3] >> ((iM33621e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.f40899d;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compare((((long) this.f40900e) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f40896a;
                            int i15 = this.f40899d;
                            Object[] objArr2 = this.f40897b;
                            Object[] objArr3 = this.f40898c;
                            j3 = 128;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int length = jArr3.length;
                            int i19 = length - 1;
                            int i20 = length - 2;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i15) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr3[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM33621e2 = m33621e(i25);
                                    int i26 = i25 & i15;
                                    if (((iM33621e2 - i26) & i15) / i18 == ((i21 - i26) & i15) / i18) {
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i18 = i18;
                                    } else {
                                        int i27 = i18;
                                        int i28 = iM33621e2 >> 3;
                                        long j12 = jArr3[i28];
                                        int i29 = (iM33621e2 & 7) << 3;
                                        if (((j12 >> i29) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i28] = ((~(j << i29)) & j12) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM33621e2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iM33621e2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j12);
                                            Object obj3 = objArr[iM33621e2];
                                            objArr[iM33621e2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[iM33621e2];
                                            objArr3[iM33621e2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i18 = i27;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f40901f = rdy0.m75371a(this.f40899d) - this.f40900e;
                        }
                        iM33621e = m33621e(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM75372b = rdy0.m75372b(this.f40899d);
                    long[] jArr4 = this.f40896a;
                    Object[] objArr4 = this.f40897b;
                    Object[] objArr5 = this.f40898c;
                    int i30 = this.f40899d;
                    m33624h(iM75372b);
                    long[] jArr5 = this.f40896a;
                    Object[] objArr6 = this.f40897b;
                    Object[] objArr7 = this.f40898c;
                    int i31 = this.f40899d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i12;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM33621e3 = m33621e(i33 >>> 7);
                            jArr = jArr5;
                            long j13 = i33 & 127;
                            int i34 = iM33621e3 >> 3;
                            int i35 = (iM33621e3 & 7) << 3;
                            long j14 = (jArr[i34] & (~(255 << i35))) | (j13 << i35);
                            jArr[i34] = j14;
                            jArr[(((iM33621e3 - 7) & i31) + (i31 & 7)) >> 3] = j14;
                            objArr6[iM33621e3] = obj5;
                            objArr7[iM33621e3] = objArr5[i32];
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM33621e = m33621e(i3);
                }
                this.f40900e++;
                int i36 = this.f40901f;
                long[] jArr6 = this.f40896a;
                int i37 = iM33621e >> 3;
                long j15 = jArr6[i37];
                int i38 = (iM33621e & 7) << 3;
                this.f40901f = i36 - (((j15 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.f40899d;
                long j16 = (j15 & (~(j << i38))) | (j2 << i38);
                jArr6[i37] = j16;
                jArr6[(((iM33621e - 7) & i39) + (i39 & 7)) >> 3] = j16;
                return ~iM33621e;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m33623g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f40899d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f40896a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (wj50.m88271j(this.f40897b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f40898c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m33624h(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f40899d = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.f40896a = jArr;
        this.f40901f = rdy0.m75371a(this.f40899d) - this.f40900e;
        Object[] objArr = fem.f68798c;
        this.f40897b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f40898c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f40897b;
        Object[] objArr2 = this.f40898c;
        long[] jArr = this.f40896a;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX INFO: renamed from: i */
    public final boolean m33625i() {
        return this.f40900e == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33626j() {
        return this.f40900e != 0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m33627k(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f40899d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f40896a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (wj50.m88271j(this.f40897b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m33628l(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m33628l(int i) {
        this.f40900e--;
        long[] jArr = this.f40896a;
        int i2 = this.f40899d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f40897b[i] = null;
        Object[] objArr = this.f40898c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m33629m(Object obj, Object obj2) {
        int iM33622f = m33622f(obj);
        if (iM33622f < 0) {
            iM33622f = ~iM33622f;
        }
        this.f40897b[iM33622f] = obj;
        this.f40898c[iM33622f] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (m33625i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f40897b;
        Object[] objArr2 = this.f40898c;
        long[] jArr = this.f40896a;
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
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.f40900e) {
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

    public /* synthetic */ cqi0() {
        this(6);
    }
}
