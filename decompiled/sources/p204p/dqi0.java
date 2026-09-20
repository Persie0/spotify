package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dqi0 {

    /* JADX INFO: renamed from: a */
    public long[] f52018a;

    /* JADX INFO: renamed from: b */
    public Object[] f52019b;

    /* JADX INFO: renamed from: c */
    public int f52020c;

    /* JADX INFO: renamed from: d */
    public int f52021d;

    /* JADX INFO: renamed from: e */
    public int f52022e;

    public dqi0(int i) {
        this.f52018a = rdy0.f198228a;
        this.f52019b = fem.f68798c;
        if (i >= 0) {
            m36647f(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36642a(Object obj) {
        int i = this.f52021d;
        this.f52019b[m36645d(obj)] = obj;
        return this.f52021d != i;
    }

    /* JADX INFO: renamed from: b */
    public final void m36643b() {
        this.f52021d = 0;
        long[] jArr = this.f52018a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f52018a;
            int i = this.f52020c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bk5.m29578A0(this.f52019b, null, 0, this.f52020c);
        this.f52022e = rdy0.m75371a(this.f52020c) - this.f52021d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36644c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f52020c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f52018a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f52019b[iNumberOfTrailingZeros], obj)) {
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
    public final int m36645d(Object obj) {
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
        int i5 = this.f52020c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.f52018a;
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
                if (wj50.m88271j(this.f52019b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM36646e = m36646e(i3);
                long j8 = 255;
                if (this.f52022e != 0 || ((this.f52018a[iM36646e >> 3] >> ((iM36646e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.f52020c;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compare((((long) this.f52021d) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f52018a;
                            int i15 = this.f52020c;
                            Object[] objArr2 = this.f52019b;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            j3 = 128;
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
                            long j11 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i15) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM36646e2 = m36646e(i25);
                                    int i26 = i25 & i15;
                                    if (((iM36646e2 - i26) & i15) / i18 == ((i21 - i26) & i15) / i18) {
                                        long j13 = j11;
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | ((~(j << i23)) & jArr3[i22]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = iM36646e2 >> 3;
                                        long j15 = jArr3[i27];
                                        int i28 = (iM36646e2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(j << i28)) & j15) | (((long) (i24 & 127)) << i28);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM36646e2] = objArr[i21];
                                            objArr[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = (((long) (i24 & 127)) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[iM36646e2];
                                            objArr[iM36646e2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j14;
                                        i18 = i18;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f52022e = rdy0.m75371a(this.f52020c) - this.f52021d;
                        }
                        iM36646e = m36646e(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM75372b = rdy0.m75372b(this.f52020c);
                    long[] jArr4 = this.f52018a;
                    Object[] objArr3 = this.f52019b;
                    int i29 = this.f52020c;
                    m36647f(iM75372b);
                    long[] jArr5 = this.f52018a;
                    Object[] objArr4 = this.f52019b;
                    int i30 = this.f52020c;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr4[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM36646e3 = m36646e(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = iM36646e3 >> 3;
                            int i34 = (iM36646e3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((iM36646e3 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[iM36646e3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i31++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM36646e = m36646e(i3);
                }
                this.f52021d++;
                int i35 = this.f52022e;
                long[] jArr6 = this.f52018a;
                int i36 = iM36646e >> 3;
                long j18 = jArr6[i36];
                int i37 = (iM36646e & 7) << 3;
                this.f52022e = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.f52020c;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr6[i36] = j19;
                jArr6[(((iM36646e - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return iM36646e;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m36646e(int i) {
        int i2 = this.f52020c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f52018a;
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
        if (!(obj instanceof dqi0)) {
            return false;
        }
        dqi0 dqi0Var = (dqi0) obj;
        if (dqi0Var.f52021d != this.f52021d) {
            return false;
        }
        Object[] objArr = this.f52019b;
        long[] jArr = this.f52018a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !dqi0Var.m36644c(objArr[(i << 3) + i3])) {
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
    public final void m36647f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f52020c = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f52018a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f52022e = rdy0.m75371a(this.f52020c) - this.f52021d;
        this.f52019b = iMax == 0 ? fem.f68798c : new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36648g() {
        return this.f52021d == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m36649h() {
        return this.f52021d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f52020c * 31) + this.f52021d;
        Object[] objArr = this.f52019b;
        long[] jArr = this.f52018a;
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

    /* JADX INFO: renamed from: i */
    public final void m36650i(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f52020c;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f52018a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (wj50.m88271j(this.f52019b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m36654m(iNumberOfTrailingZeros);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m36651j(Object obj) {
        this.f52019b[m36645d(obj)] = obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m36652k(dqi0 dqi0Var) {
        Object[] objArr = dqi0Var.f52019b;
        long[] jArr = dqi0Var.f52018a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        m36651j(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m36653l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f52020c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f52018a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (wj50.m88271j(this.f52019b[iNumberOfTrailingZeros], obj)) {
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
            m36654m(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final void m36654m(int i) {
        this.f52021d--;
        long[] jArr = this.f52018a;
        int i2 = this.f52020c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f52019b[i] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[DONT_INVERT, PHI: r8
      0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[LOOP:0: B:5:0x001c->B:20:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[SYNTHETIC] */
    public final String toString() {
        snx0 snx0Var = new snx0(this, 9);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f52019b;
        long[] jArr = this.f52018a;
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
                        Object obj = objArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) snx0Var.invoke(obj));
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

    public /* synthetic */ dqi0() {
        this(6);
    }
}
