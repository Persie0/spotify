package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zoi0 {

    /* JADX INFO: renamed from: a */
    public long[] f284795a = rdy0.f198228a;

    /* JADX INFO: renamed from: b */
    public long[] f284796b = v2b0.f236599a;

    /* JADX INFO: renamed from: c */
    public Object[] f284797c = fem.f68798c;

    /* JADX INFO: renamed from: d */
    public int f284798d;

    /* JADX INFO: renamed from: e */
    public int f284799e;

    /* JADX INFO: renamed from: f */
    public int f284800f;

    public zoi0(int i) {
        if (i >= 0) {
            m96624e(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m96620a() {
        this.f284799e = 0;
        long[] jArr = this.f284795a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f284795a;
            int i = this.f284798d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bk5.m29578A0(this.f284797c, null, 0, this.f284798d);
        this.f284800f = rdy0.m75371a(this.f284798d) - this.f284799e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96621b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f284798d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f284795a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f284796b[iNumberOfTrailingZeros] == j) {
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

    /* JADX INFO: renamed from: c */
    public final int m96622c(int i) {
        int i2 = this.f284798d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f284795a;
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

    /* JADX INFO: renamed from: d */
    public final Object m96623d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f284798d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f284795a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f284796b[iNumberOfTrailingZeros] == j) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f284797c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m96624e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f284798d = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f284795a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f284800f = rdy0.m75371a(this.f284798d) - this.f284799e;
        this.f284796b = new long[iMax];
        this.f284797c = new Object[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoi0)) {
            return false;
        }
        zoi0 zoi0Var = (zoi0) obj;
        if (zoi0Var.f284799e != this.f284799e) {
            return false;
        }
        long[] jArr3 = this.f284796b;
        Object[] objArr = this.f284797c;
        long[] jArr4 = this.f284795a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr4[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        z2 = z3;
                        jArr2 = jArr3;
                        long j2 = jArr2[i4];
                        Object obj2 = objArr[i4];
                        if (obj2 == null) {
                            if (zoi0Var.m96623d(j2) != null || !zoi0Var.m96621b(j2)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(zoi0Var.m96623d(j2))) {
                            return false;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                    jArr3 = jArr2;
                }
                z = z3;
                jArr = jArr3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
            jArr3 = jArr;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m96625f(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f284798d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f284795a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f284796b[iNumberOfTrailingZeros] == j) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f284799e--;
        long[] jArr2 = this.f284795a;
        int i8 = this.f284798d;
        int i9 = iNumberOfTrailingZeros >> 3;
        int i10 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
        jArr2[i9] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        Object[] objArr = this.f284797c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m96626g(long j, Object obj) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i3 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f284798d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f284795a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j5 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j6 = i6;
            int i13 = i9;
            int i14 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                int i15 = i3;
                if (this.f284796b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iM96622c = m96622c(i5);
                if (this.f284800f != 0 || ((this.f284795a[iM96622c >> 3] >> ((iM96622c & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i17 = this.f284798d;
                    if (i17 > 8) {
                        j4 = 128;
                        if (Long.compare((((long) this.f284799e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f284795a;
                            int i18 = this.f284798d;
                            long[] jArr5 = this.f284796b;
                            Object[] objArr2 = this.f284797c;
                            int i19 = (i18 + 7) >> 3;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j9 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i20++;
                                i12 = i12;
                                i14 = i14;
                                j6 = j6;
                            }
                            j3 = j6;
                            i = i14;
                            int i21 = i12;
                            char c = 7;
                            int length = jArr4.length;
                            int i22 = length - 1;
                            int i23 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i22] = jArr4[i];
                            int i24 = i;
                            while (i24 != i18) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j11 = (jArr4[i25] >> i26) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i24]) * i16;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iM96622c2 = m96622c(i28);
                                    int i29 = i28 & i18;
                                    char c2 = c;
                                    if (((iM96622c2 - i29) & i18) / 8 == ((i24 - i29) & i18) / 8) {
                                        int i30 = i21;
                                        long j12 = j10;
                                        jArr4[i25] = (((long) (i27 & 127)) << i26) | (jArr4[i25] & (~(255 << i26)));
                                        jArr4[jArr4.length - i30] = (jArr4[i] & j12) | Long.MIN_VALUE;
                                        i24++;
                                        i21 = i30;
                                        c = c2;
                                        j10 = j12;
                                    } else {
                                        int i31 = i21;
                                        long j13 = j10;
                                        int i32 = iM96622c2 >> 3;
                                        long j14 = jArr4[i32];
                                        int i33 = (iM96622c2 & 7) << 3;
                                        if (((j14 >> i33) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i32] = (j14 & (~(255 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr2[iM96622c2] = jArr2[i24];
                                            jArr2[i24] = 0;
                                            objArr[iM96622c2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i32] = (((long) (i27 & 127)) << i33) | (j14 & (~(255 << i33)));
                                            long j15 = jArr2[iM96622c2];
                                            jArr2[iM96622c2] = jArr2[i24];
                                            jArr2[i24] = j15;
                                            Object obj2 = objArr[iM96622c2];
                                            objArr[iM96622c2] = objArr[i24];
                                            objArr[i24] = obj2;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j13) | Long.MIN_VALUE;
                                        i24++;
                                        jArr5 = jArr2;
                                        i21 = i31;
                                        c = c2;
                                        j10 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i21;
                            this.f284800f = rdy0.m75371a(this.f284798d) - this.f284799e;
                        }
                        iM96622c = m96622c(i5);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iM75372b = rdy0.m75372b(this.f284798d);
                    long[] jArr6 = this.f284795a;
                    long[] jArr7 = this.f284796b;
                    Object[] objArr3 = this.f284797c;
                    int i34 = this.f284798d;
                    m96624e(iM75372b);
                    long[] jArr8 = this.f284795a;
                    long[] jArr9 = this.f284796b;
                    Object[] objArr4 = this.f284797c;
                    int i35 = this.f284798d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr6[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr7[i36];
                            int iHashCode3 = Long.hashCode(j16) * i16;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM96622c3 = m96622c(i37 >>> 7);
                            jArr = jArr8;
                            long j17 = i37 & 127;
                            int i38 = iM96622c3 >> 3;
                            int i39 = (iM96622c3 & 7) << 3;
                            long j18 = (jArr[i38] & (~(255 << i39))) | (j17 << i39);
                            jArr[i38] = j18;
                            jArr[(((iM96622c3 - 7) & i35) + (i35 & 7)) >> 3] = j18;
                            jArr9[iM96622c3] = j16;
                            objArr4[iM96622c3] = objArr3[i36];
                        } else {
                            jArr = jArr8;
                        }
                        i36++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iM96622c = m96622c(i5);
                }
                iNumberOfTrailingZeros = iM96622c;
                this.f284799e++;
                int i40 = this.f284800f;
                long[] jArr10 = this.f284795a;
                int i41 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr10[i41];
                int i42 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j19 >> i42) & j2) != j4) {
                    i2 = i;
                }
                this.f284800f = i40 - i2;
                int i43 = this.f284798d;
                long j20 = (j19 & (~(j2 << i42))) | (j3 << i42);
                jArr10[i41] = j20;
                jArr10[(((iNumberOfTrailingZeros - 7) & i43) + (i43 & 7)) >> 3] = j20;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
        this.f284796b[iNumberOfTrailingZeros] = j;
        this.f284797c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f284796b;
        Object[] objArr = this.f284797c;
        long[] jArr2 = this.f284795a;
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
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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

    public final String toString() {
        int i;
        int i2;
        if (this.f284799e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f284796b;
        Object[] objArr = this.f284797c;
        long[] jArr2 = this.f284795a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f284799e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
