package p204p;

import android.util.Log;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vra0 implements xeg1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244124a;

    /* JADX INFO: renamed from: b */
    public int f244125b;

    /* JADX INFO: renamed from: c */
    public Serializable f244126c;

    /* JADX INFO: renamed from: d */
    public Object f244127d;

    /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.io.Serializable] */
    public vra0(mir mirVar) {
        this.f244124a = 3;
        this.f244125b = -1;
        this.f244126c = new byte[8];
        this.f244127d = mirVar;
    }

    @Override // p204p.xeg1
    /* JADX INFO: renamed from: a */
    public h6h1 mo74896a(h6h1 h6h1Var, int i, int i2) {
        if (i < 0 || i > i2 || i2 > h6h1Var.f88099a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr[i3] = mo74897c(h6h1Var, i);
            i++;
            i3++;
        }
        return h6h1.m46724e(bArr);
    }

    /* JADX INFO: renamed from: b */
    public void m86280b(String str, Object... objArr) {
        if (this.f244125b <= 3) {
            m86281d(str, objArr);
        }
    }

    @Override // p204p.xeg1
    /* JADX INFO: renamed from: c */
    public byte mo74897c(h6h1 h6h1Var, int i) {
        byte[] bArr = (byte[]) this.f244126c;
        int i2 = ((((~1959970879) & 1413655861) | 1940175766) + ((1959970879 & 625104105) | 2040877774)) - (-456070292);
        int i3 = 1544048623 % 665228399;
        int i4 = (((((~523465512) & 646269132) | 193241389) + ((523465512 & 1948338368) | 1538307385)) - (-2007873589)) ^ (1424627019 % 1376108019);
        int i5 = ((((~175821956) & 1754890507) | 1438001845) + ((175821956 & 672108874) | 394690288)) - (-1923654329);
        int i6 = 1178341976 % 1045251304;
        int i7 = i >>> i4;
        if (i7 != this.f244125b) {
            ((mir) this.f244127d).m61907k(bArr, i7);
            this.f244125b = i7;
        }
        int i8 = i5 ^ i6;
        return (byte) (((h6h1Var.m46727b(i) ^ bArr[i % (i2 ^ i3)]) << i8) >> i8);
    }

    /* JADX INFO: renamed from: d */
    public void m86281d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.f244127d).concat(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, long[]] */
    /* JADX INFO: renamed from: e */
    public void m86282e(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f244126c;
        int i8 = this.f244125b;
        int i9 = i8 + 3;
        this.f244125b = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f244126c = Arrays.copyOf(jArr, iMax);
            this.f244127d = Arrays.copyOf((long[]) this.f244127d, iMax);
        }
        long[] jArr2 = (long[]) this.f244126c;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (j & uiv0.f230822a) | (((long) Math.min((i8 - i11) / 3, 1023)) << 50);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public void m86283g(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f244126c;
        int i3 = this.f244125b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m86284h(int i, long j, int i2) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f244126c;
        long[] jArr2 = (long[]) this.f244127d;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f244125b : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (uiv0.f230823b & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m86285i(int i, xh00 xh00Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f244126c;
        int i3 = this.f244125b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                xh00Var.mo24818M(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: j */
    public void m86286j(Object obj, Object obj2) {
        int i = this.f244125b + 1;
        Object[] objArr = (Object[]) this.f244126c;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f244126c = Arrays.copyOf(objArr, qvg1.m74030b(length, i2));
        }
        nsf1.m65534t(obj, obj2);
        Object[] objArr2 = (Object[]) this.f244126c;
        int i3 = this.f244125b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f244125b = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: k */
    public cxg1 m86287k() {
        boolean z;
        int i;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i2;
        ?? r16;
        boolean z3;
        ?? r4;
        cxg1 cxg1Var;
        boolean z4;
        xug1 xug1Var = (xug1) this.f244127d;
        if (xug1Var != null) {
            throw xug1Var.m92193a();
        }
        int i3 = this.f244125b;
        Object[] objArrCopyOf = (Object[]) this.f244126c;
        if (i3 == 0) {
            cxg1Var = cxg1.f43031g;
        } else {
            xug1 xug1Var2 = null;
            ?? r5 = 0;
            xug1 xug1Var3 = null;
            xug1 xug1Var4 = null;
            boolean z5 = false;
            int i4 = 1;
            if (i3 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                cxg1Var = new cxg1(1, null, objArrCopyOf);
            } else {
                bnf1.m29986v(i3, objArrCopyOf.length >> 1);
                int iM81608j = tvg1.m81608j(i3);
                char c3 = 2;
                if (i3 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    z4 = false;
                    i3 = 1;
                    i = 1;
                } else {
                    int i5 = iM81608j - 1;
                    if (iM81608j <= 128) {
                        byte[] bArr = new byte[iM81608j];
                        Arrays.fill(bArr, (byte) -1);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i3) {
                            int i8 = i7 + i7;
                            int i9 = i6 + i6;
                            Object obj = objArrCopyOf[i9];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i9 ^ i4];
                            Objects.requireNonNull(obj2);
                            int iM39679O = epv0.m39679O(obj.hashCode());
                            while (true) {
                                int i10 = iM39679O & i5;
                                z2 = z5;
                                i2 = i4;
                                int i11 = bArr[i10] & 255;
                                if (i11 == 255) {
                                    bArr[i10] = (byte) i8;
                                    if (i7 < i6) {
                                        objArrCopyOf[i8] = obj;
                                        objArrCopyOf[i8 ^ 1] = obj2;
                                    }
                                    i7++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                                    int i12 = ~i11;
                                    Object obj3 = objArrCopyOf[i12 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    xug1 xug1Var5 = new xug1(obj, obj2, obj3);
                                    objArrCopyOf[i12 == true ? 1 : 0] = obj2;
                                    xug1Var3 = xug1Var5;
                                    break;
                                }
                                iM39679O = i10 + 1;
                                z5 = z2;
                                i4 = i2;
                            }
                            i6++;
                            z5 = z2;
                            i4 = i2;
                        }
                        z = z5;
                        i = i4;
                        if (i7 == i3) {
                            r5 = bArr;
                            z4 = z;
                        } else {
                            sArr = new Object[3];
                            sArr[z ? 1 : 0] = bArr;
                            sArr[i] = Integer.valueOf(i7);
                            sArr[2] = xug1Var3;
                            r5 = sArr;
                            z4 = z;
                        }
                    } else {
                        z = false;
                        i = 1;
                        if (iM81608j <= 32768) {
                            sArr = new short[iM81608j];
                            Arrays.fill(sArr, (short) -1);
                            int i13 = 0;
                            for (int i14 = 0; i14 < i3; i14++) {
                                int i15 = i13 + i13;
                                int i16 = i14 + i14;
                                Object obj4 = objArrCopyOf[i16];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i16 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iM39679O2 = epv0.m39679O(obj4.hashCode());
                                while (true) {
                                    int i17 = iM39679O2 & i5;
                                    char c4 = (char) sArr[i17];
                                    if (c4 == 65535) {
                                        sArr[i17] = (short) i15;
                                        if (i13 < i14) {
                                            objArrCopyOf[i15] = obj4;
                                            objArrCopyOf[i15 ^ 1] = obj5;
                                        }
                                        i13++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[c4])) {
                                        int i18 = c4 ^ 1;
                                        Object obj6 = objArrCopyOf[i18 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        xug1 xug1Var6 = new xug1(obj4, obj5, obj6);
                                        objArrCopyOf[i18 == true ? 1 : 0] = obj5;
                                        xug1Var4 = xug1Var6;
                                        break;
                                    }
                                    iM39679O2 = i17 + 1;
                                }
                            }
                            if (i13 == i3) {
                                r5 = sArr;
                                z4 = z;
                            } else {
                                r5 = new Object[]{sArr, Integer.valueOf(i13), xug1Var4};
                                z4 = z;
                            }
                        } else {
                            int[] iArr = new int[iM81608j];
                            Arrays.fill(iArr, -1);
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < i3) {
                                int i21 = i20 + i20;
                                int i22 = i19 + i19;
                                Object obj7 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i22 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iM39679O3 = epv0.m39679O(obj7.hashCode());
                                while (true) {
                                    int i23 = iM39679O3 & i5;
                                    int i24 = iArr[i23];
                                    if (i24 == -1) {
                                        iArr[i23] = i21;
                                        if (i20 < i19) {
                                            objArrCopyOf[i21] = obj7;
                                            objArrCopyOf[i21 ^ 1] = obj8;
                                        }
                                        i20++;
                                        c2 = c3;
                                        break;
                                    }
                                    c2 = c3;
                                    if (obj7.equals(objArrCopyOf[i24])) {
                                        int i25 = i24 ^ 1;
                                        Object obj9 = objArrCopyOf[i25];
                                        Objects.requireNonNull(obj9);
                                        xug1 xug1Var7 = new xug1(obj7, obj8, obj9);
                                        objArrCopyOf[i25] = obj8;
                                        xug1Var2 = xug1Var7;
                                        break;
                                    }
                                    iM39679O3 = i23 + 1;
                                    c3 = c2;
                                }
                                i19++;
                                c3 = c2;
                            }
                            c = c3;
                            if (i20 == i3) {
                                r3 = iArr;
                                r16 = z;
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = iArr;
                                objArr[1] = Integer.valueOf(i20);
                                objArr[c] = xug1Var2;
                                r3 = objArr;
                                r16 = z;
                            }
                        }
                    }
                    z3 = r3 instanceof Object[];
                    r4 = r3;
                    if (z3) {
                        Object[] objArr2 = (Object[]) r3;
                        this.f244127d = (xug1) objArr2[c];
                        Object obj10 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        r4 = obj10;
                        i3 = iIntValue;
                    }
                    cxg1Var = new cxg1(i3, r4, objArrCopyOf);
                }
                c = 2;
                r3 = r5;
                r16 = z4;
                z3 = r3 instanceof Object[];
                r4 = r3;
                if (z3) {
                    Object[] objArr3 = (Object[]) r3;
                    this.f244127d = (xug1) objArr3[c];
                    Object obj11 = objArr3[r16];
                    int iIntValue2 = ((Integer) objArr3[i]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                    r4 = obj11;
                    i3 = iIntValue2;
                }
                cxg1Var = new cxg1(i3, r4, objArrCopyOf);
            }
        }
        xug1 xug1Var8 = (xug1) this.f244127d;
        if (xug1Var8 == null) {
            return cxg1Var;
        }
        throw xug1Var8.m92193a();
    }

    public String toString() {
        switch (this.f244124a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((r3t0) this.f244127d) == r3t0.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f244125b);
                sb.append(' ');
                sb.append((String) this.f244126c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p204p.xeg1
    public /* bridge */ /* synthetic */ xeg1 zzc() {
        return new vra0((mir) this.f244127d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vra0(int i, byte b) {
        this(4);
        this.f244124a = i;
        switch (i) {
            case 4:
                break;
        }
    }

    public vra0(String str, String[] strArr) {
        String string;
        this.f244124a = 0;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f244127d = string;
        this.f244126c = str;
        ig31.m50499q(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.f244126c, i)) {
            i++;
        }
        this.f244125b = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public vra0(int i) {
        this.f244124a = 4;
        this.f244126c = new Object[i + i];
        this.f244125b = 0;
    }

    public vra0(r3t0 r3t0Var, int i, String str) {
        this.f244124a = 2;
        this.f244127d = r3t0Var;
        this.f244125b = i;
        this.f244126c = str;
    }
}
