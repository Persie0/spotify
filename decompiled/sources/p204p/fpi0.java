package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fpi0 {

    /* JADX INFO: renamed from: a */
    public long[] f71877a;

    /* JADX INFO: renamed from: b */
    public Object[] f71878b;

    /* JADX INFO: renamed from: c */
    public int[] f71879c;

    /* JADX INFO: renamed from: d */
    public int f71880d;

    /* JADX INFO: renamed from: e */
    public int f71881e;

    /* JADX INFO: renamed from: f */
    public int f71882f;

    public fpi0(int i) {
        this.f71877a = rdy0.f198228a;
        this.f71878b = fem.f68798c;
        this.f71879c = f450.f65676a;
        if (i >= 0) {
            m42377f(rdy0.m75374d(i));
        } else {
            epv0.m39674J("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m42372a() {
        this.f71881e = 0;
        long[] jArr = this.f71877a;
        if (jArr != rdy0.f198228a) {
            bk5.m29580C0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f71877a;
            int i = this.f71880d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        bk5.m29578A0(this.f71878b, null, 0, this.f71880d);
        this.f71882f = rdy0.m75371a(this.f71880d) - this.f71881e;
    }

    /* JADX INFO: renamed from: b */
    public final int m42373b(int i) {
        int i2 = this.f71880d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f71877a;
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
    public final int m42374c(Object obj) {
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
        int i5 = this.f71880d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.f71877a;
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
                if (wj50.m88271j(this.f71878b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM42373b = m42373b(i3);
                long j8 = 255;
                if (this.f71882f != 0 || ((this.f71877a[iM42373b >> 3] >> ((iM42373b & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.f71880d;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compare((((long) this.f71881e) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f71877a;
                            int i15 = this.f71880d;
                            Object[] objArr2 = this.f71878b;
                            int[] iArr = this.f71879c;
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
                                    int iM42373b2 = m42373b(i25);
                                    int i26 = i25 & i15;
                                    long j13 = j11;
                                    if (((iM42373b2 - i26) & i15) / 8 == ((i21 - i26) & i15) / i18) {
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i18 = i18;
                                        j11 = j13;
                                    } else {
                                        int i27 = i18;
                                        int i28 = iM42373b2 >> 3;
                                        long j14 = jArr3[i28];
                                        int i29 = (iM42373b2 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i28] = ((~(j << i29)) & j14) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM42373b2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iM42373b2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[iM42373b2];
                                            objArr[iM42373b2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i30 = iArr[iM42373b2];
                                            iArr[iM42373b2] = iArr[i21];
                                            iArr[i21] = i30;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i15 = i15;
                                        i18 = i27;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f71882f = rdy0.m75371a(this.f71880d) - this.f71881e;
                        }
                        iM42373b = m42373b(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM75372b = rdy0.m75372b(this.f71880d);
                    long[] jArr4 = this.f71877a;
                    Object[] objArr3 = this.f71878b;
                    int[] iArr2 = this.f71879c;
                    int i31 = this.f71880d;
                    m42377f(iM75372b);
                    long[] jArr5 = this.f71877a;
                    Object[] objArr4 = this.f71878b;
                    int[] iArr3 = this.f71879c;
                    int i32 = this.f71880d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr4[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM42373b3 = m42373b(i34 >>> 7);
                            jArr = jArr5;
                            long j15 = i34 & 127;
                            int i35 = iM42373b3 >> 3;
                            int i36 = (iM42373b3 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((iM42373b3 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[iM42373b3] = obj4;
                            iArr3[iM42373b3] = iArr2[i33];
                        } else {
                            jArr = jArr5;
                        }
                        i33++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM42373b = m42373b(i3);
                }
                this.f71881e++;
                int i37 = this.f71882f;
                long[] jArr6 = this.f71877a;
                int i38 = iM42373b >> 3;
                long j17 = jArr6[i38];
                int i39 = (iM42373b & 7) << 3;
                this.f71882f = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.f71880d;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr6[i38] = j18;
                jArr6[(((iM42373b - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~iM42373b;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m42375d(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f71880d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f71877a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (wj50.m88271j(this.f71878b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m42376e(Object obj) {
        int iM42375d = m42375d(obj);
        if (iM42375d >= 0) {
            return this.f71879c[iM42375d];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fpi0)) {
            return false;
        }
        fpi0 fpi0Var = (fpi0) obj;
        if (fpi0Var.f71881e != this.f71881e) {
            return false;
        }
        Object[] objArr = this.f71878b;
        int[] iArr = this.f71879c;
        long[] jArr = this.f71877a;
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
                        Object obj2 = objArr[i4];
                        int i5 = iArr[i4];
                        int iM42375d = fpi0Var.m42375d(obj2);
                        if (iM42375d < 0 || i5 != fpi0Var.f71879c[iM42375d]) {
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
    public final void m42377f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, rdy0.m75373c(i)) : 0;
        this.f71880d = iMax;
        if (iMax == 0) {
            jArr = rdy0.f198228a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            bk5.m29580C0(jArr, -9187201950435737472L);
        }
        this.f71877a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f71882f = rdy0.m75371a(this.f71880d) - this.f71881e;
        this.f71878b = new Object[iMax];
        this.f71879c = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final void m42378g(int i) {
        this.f71881e--;
        long[] jArr = this.f71877a;
        int i2 = this.f71880d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f71878b[i] = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m42379h(int i, Object obj) {
        int iM42374c = m42374c(obj);
        if (iM42374c < 0) {
            iM42374c = ~iM42374c;
        }
        this.f71878b[iM42374c] = obj;
        this.f71879c[iM42374c] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.f71878b;
        int[] iArr = this.f71879c;
        long[] jArr = this.f71877a;
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
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f71881e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f71878b;
        int[] iArr = this.f71879c;
        long[] jArr = this.f71877a;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.f71881e) {
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

    public /* synthetic */ fpi0() {
        this(6);
    }
}
