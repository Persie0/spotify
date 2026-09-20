package p204p;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zgf1 implements Map, Serializable {

    /* JADX INFO: renamed from: h */
    public static final zgf1 f282627h;

    /* JADX INFO: renamed from: i */
    public static final zgf1 f282628i;

    /* JADX INFO: renamed from: t */
    public static final zgf1 f282629t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282630a;

    /* JADX INFO: renamed from: b */
    public final transient Object f282631b;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f282632c;

    /* JADX INFO: renamed from: d */
    public final transient int f282633d;

    /* JADX INFO: renamed from: e */
    public transient AbstractCollection f282634e;

    /* JADX INFO: renamed from: f */
    public transient AbstractCollection f282635f;

    /* JADX INFO: renamed from: g */
    public transient AbstractCollection f282636g;

    static {
        int i = 0;
        Object obj = null;
        f282627h = new zgf1(i, 0, obj, new Object[0]);
        f282628i = new zgf1(i, 1, obj, new Object[0]);
        f282629t = new zgf1(i, 2, obj, new Object[0]);
    }

    public /* synthetic */ zgf1(int i, int i2, Object obj, Object[] objArr) {
        this.f282630a = i2;
        this.f282631b = obj;
        this.f282632c = objArr;
        this.f282633d = i;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:818)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    /* JADX INFO: renamed from: a */
    public static void m96078a(java.util.Set r18) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zgf1.m96078a(java.util.Set):void");
    }

    /* JADX INFO: renamed from: b */
    public static void m96079b() {
        m96081d(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", hgg1.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", hgg1.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", hgg1.ALTERNATIVE_BILLING_ACTION}, null);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: c */
    public static zgf1 m96080c(int i, Object[] objArr, ob31 ob31Var) {
        int iHighestOneBit;
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        saf1 saf1Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return f282627h;
        }
        saf1 saf1Var2 = null;
        ?? r5 = 0;
        saf1 saf1Var3 = null;
        saf1 saf1Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new zgf1(i5, 0, saf1Var2, objArrCopyOf);
        }
        quf1.m73928t(i4, objArrCopyOf.length >> 1);
        char c3 = 2;
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i4 != 1) {
            int i6 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iM65844w = nxf1.m65844w(obj.hashCode());
                    while (true) {
                        int i11 = iM65844w & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj;
                                objArrCopyOf[i9 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            saf1 saf1Var5 = new saf1(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            saf1Var3 = saf1Var5;
                            break;
                        }
                        iM65844w = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    c = 2;
                    r3 = bArr;
                    r16 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = saf1Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM65844w2 = nxf1.m65844w(obj4.hashCode());
                        while (true) {
                            int i18 = iM65844w2 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj4;
                                    objArrCopyOf[i16 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i19 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                saf1 saf1Var6 = new saf1(obj4, obj5, obj6);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                saf1Var4 = saf1Var6;
                                break;
                            }
                            iM65844w2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), saf1Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM65844w3 = nxf1.m65844w(obj7.hashCode());
                        while (true) {
                            int i24 = iM65844w3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj7;
                                    objArrCopyOf[i22 ^ 1] = obj8;
                                }
                                i21++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj9 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj9);
                                saf1 saf1Var7 = new saf1(obj7, obj8, obj9);
                                objArrCopyOf[i26] = obj8;
                                saf1Var2 = saf1Var7;
                                break;
                            }
                            iM65844w3 = i24 + 1;
                            c3 = c2;
                        }
                        i20++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c] = saf1Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                saf1Var = (saf1) objArr2[c];
                if (ob31Var != null) {
                    throw saf1Var.m77622a();
                }
                ob31Var.f163530c = saf1Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new zgf1(i4, 0, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            saf1Var = (saf1) objArr2[c];
            if (ob31Var != null) {
                throw saf1Var.m77622a();
            }
            ob31Var.f163530c = saf1Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new zgf1(i4, 0, r4, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: d */
    public static zgf1 m96081d(int i, Object[] objArr, ob31 ob31Var) {
        int iHighestOneBit;
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        ylf1 ylf1Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return f282628i;
        }
        ylf1 ylf1Var2 = null;
        ?? r5 = 0;
        ylf1 ylf1Var3 = null;
        ylf1 ylf1Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new zgf1(i5, 1, ylf1Var2, objArrCopyOf);
        }
        p271.m68895E(i4, objArrCopyOf.length >> 1);
        char c3 = 2;
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i4 != 1) {
            int i6 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iM49328J = i091.m49328J(obj.hashCode());
                    while (true) {
                        int i11 = iM49328J & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj;
                                objArrCopyOf[i9 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            ylf1 ylf1Var5 = new ylf1(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            ylf1Var3 = ylf1Var5;
                            break;
                        }
                        iM49328J = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    c = 2;
                    r3 = bArr;
                    r16 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = ylf1Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM49328J2 = i091.m49328J(obj4.hashCode());
                        while (true) {
                            int i18 = iM49328J2 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj4;
                                    objArrCopyOf[i16 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i19 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                ylf1 ylf1Var6 = new ylf1(obj4, obj5, obj6);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                ylf1Var4 = ylf1Var6;
                                break;
                            }
                            iM49328J2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), ylf1Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM49328J3 = i091.m49328J(obj7.hashCode());
                        while (true) {
                            int i24 = iM49328J3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj7;
                                    objArrCopyOf[i22 ^ 1] = obj8;
                                }
                                i21++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj9 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj9);
                                ylf1 ylf1Var7 = new ylf1(obj7, obj8, obj9);
                                objArrCopyOf[i26] = obj8;
                                ylf1Var2 = ylf1Var7;
                                break;
                            }
                            iM49328J3 = i24 + 1;
                            c3 = c2;
                        }
                        i20++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c] = ylf1Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                ylf1Var = (ylf1) objArr2[c];
                if (ob31Var != null) {
                    throw ylf1Var.m94161a();
                }
                ob31Var.f163530c = ylf1Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new zgf1(i4, 1, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            ylf1Var = (ylf1) objArr2[c];
            if (ob31Var != null) {
                throw ylf1Var.m94161a();
            }
            ob31Var.f163530c = ylf1Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new zgf1(i4, 1, r4, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f282630a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f282630a) {
            case 0:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f282630a) {
            case 0:
                ugf1 ugf1Var = (ugf1) this.f282636g;
                if (ugf1Var == null) {
                    ugf1Var = new ugf1(1, this.f282633d, this.f282632c);
                    this.f282636g = ugf1Var;
                }
                return ugf1Var.contains(obj);
            case 1:
                eof1 eof1Var = (eof1) this.f282636g;
                if (eof1Var == null) {
                    eof1Var = new eof1(1, this.f282633d, this.f282632c);
                    this.f282636g = eof1Var;
                }
                return eof1Var.contains(obj);
            default:
                vcg1 vcg1Var = (vcg1) this.f282636g;
                if (vcg1Var == null) {
                    vcg1Var = new vcg1(1, this.f282633d, this.f282632c);
                    this.f282636g = vcg1Var;
                }
                return vcg1Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f282630a) {
            case 0:
                lgf1 lgf1Var = (lgf1) this.f282634e;
                if (lgf1Var != null) {
                    return lgf1Var;
                }
                lgf1 lgf1Var2 = new lgf1(this, this.f282632c, this.f282633d);
                this.f282634e = lgf1Var2;
                return lgf1Var2;
            case 1:
                wnf1 wnf1Var = (wnf1) this.f282634e;
                if (wnf1Var != null) {
                    return wnf1Var;
                }
                wnf1 wnf1Var2 = new wnf1(this, this.f282632c, this.f282633d);
                this.f282634e = wnf1Var2;
                return wnf1Var2;
            default:
                mcg1 mcg1Var = (mcg1) this.f282634e;
                if (mcg1Var != null) {
                    return mcg1Var;
                }
                mcg1 mcg1Var2 = new mcg1(this, this.f282632c, this.f282633d);
                this.f282634e = mcg1Var2;
                return mcg1Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f282630a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.f282630a) {
            case 0:
                if (obj == null) {
                    obj2 = null;
                } else {
                    int i = this.f282633d;
                    Object[] objArr = this.f282632c;
                    if (i == 1) {
                        Object obj5 = objArr[0];
                        Objects.requireNonNull(obj5);
                        if (obj5.equals(obj)) {
                            obj2 = objArr[1];
                            Objects.requireNonNull(obj2);
                        } else {
                            obj2 = null;
                        }
                    } else {
                        Object obj6 = this.f282631b;
                        if (obj6 == null) {
                            obj2 = null;
                        } else if (obj6 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj6;
                            int length = bArr.length - 1;
                            int iM65844w = nxf1.m65844w(obj.hashCode());
                            while (true) {
                                int i2 = iM65844w & length;
                                int i3 = bArr[i2] & 255;
                                if (i3 != 255) {
                                    if (obj.equals(objArr[i3])) {
                                        obj2 = objArr[i3 ^ 1];
                                    } else {
                                        iM65844w = i2 + 1;
                                    }
                                }
                            }
                            obj2 = null;
                        } else if (obj6 instanceof short[]) {
                            short[] sArr = (short[]) obj6;
                            int length2 = sArr.length - 1;
                            int iM65844w2 = nxf1.m65844w(obj.hashCode());
                            while (true) {
                                int i4 = iM65844w2 & length2;
                                char c = (char) sArr[i4];
                                if (c != 65535) {
                                    if (obj.equals(objArr[c])) {
                                        obj2 = objArr[c ^ 1];
                                    } else {
                                        iM65844w2 = i4 + 1;
                                    }
                                }
                            }
                            obj2 = null;
                        } else {
                            int[] iArr = (int[]) obj6;
                            int length3 = iArr.length - 1;
                            int iM65844w3 = nxf1.m65844w(obj.hashCode());
                            while (true) {
                                int i5 = iM65844w3 & length3;
                                int i6 = iArr[i5];
                                if (i6 != -1) {
                                    if (obj.equals(objArr[i6])) {
                                        obj2 = objArr[i6 ^ 1];
                                    } else {
                                        iM65844w3 = i5 + 1;
                                    }
                                }
                            }
                            obj2 = null;
                        }
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else {
                    int i7 = this.f282633d;
                    Object[] objArr2 = this.f282632c;
                    if (i7 == 1) {
                        Object obj7 = objArr2[0];
                        Objects.requireNonNull(obj7);
                        if (obj7.equals(obj)) {
                            obj3 = objArr2[1];
                            Objects.requireNonNull(obj3);
                        } else {
                            obj3 = null;
                        }
                    } else {
                        Object obj8 = this.f282631b;
                        if (obj8 == null) {
                            obj3 = null;
                        } else if (obj8 instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj8;
                            int length4 = bArr2.length - 1;
                            int iM49328J = i091.m49328J(obj.hashCode());
                            while (true) {
                                int i8 = iM49328J & length4;
                                int i9 = bArr2[i8] & 255;
                                if (i9 == 255) {
                                    obj3 = null;
                                } else if (obj.equals(objArr2[i9])) {
                                    obj3 = objArr2[i9 ^ 1];
                                } else {
                                    iM49328J = i8 + 1;
                                }
                            }
                        } else if (obj8 instanceof short[]) {
                            short[] sArr2 = (short[]) obj8;
                            int length5 = sArr2.length - 1;
                            int iM49328J2 = i091.m49328J(obj.hashCode());
                            while (true) {
                                int i10 = iM49328J2 & length5;
                                char c2 = (char) sArr2[i10];
                                if (c2 != 65535) {
                                    if (obj.equals(objArr2[c2])) {
                                        obj3 = objArr2[c2 ^ 1];
                                    } else {
                                        iM49328J2 = i10 + 1;
                                    }
                                }
                            }
                            obj3 = null;
                        } else {
                            int[] iArr2 = (int[]) obj8;
                            int length6 = iArr2.length - 1;
                            int iM49328J3 = i091.m49328J(obj.hashCode());
                            while (true) {
                                int i11 = iM49328J3 & length6;
                                int i12 = iArr2[i11];
                                if (i12 != -1) {
                                    if (obj.equals(objArr2[i12])) {
                                        obj3 = objArr2[i12 ^ 1];
                                    } else {
                                        iM49328J3 = i11 + 1;
                                    }
                                }
                            }
                            obj3 = null;
                        }
                    }
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            default:
                if (obj == null) {
                    obj4 = null;
                } else {
                    int i13 = this.f282633d;
                    Object[] objArr3 = this.f282632c;
                    if (i13 == 1) {
                        Object obj9 = objArr3[0];
                        Objects.requireNonNull(obj9);
                        if (obj9.equals(obj)) {
                            obj4 = objArr3[1];
                            Objects.requireNonNull(obj4);
                        } else {
                            obj4 = null;
                        }
                    } else {
                        Object obj10 = this.f282631b;
                        if (obj10 == null) {
                            obj4 = null;
                        } else if (obj10 instanceof byte[]) {
                            byte[] bArr3 = (byte[]) obj10;
                            int length7 = bArr3.length - 1;
                            int iM85775y = vjf1.m85775y(obj.hashCode());
                            while (true) {
                                int i14 = iM85775y & length7;
                                int i15 = bArr3[i14] & 255;
                                if (i15 != 255) {
                                    if (obj.equals(objArr3[i15])) {
                                        obj4 = objArr3[i15 ^ 1];
                                    } else {
                                        iM85775y = i14 + 1;
                                    }
                                }
                            }
                            obj4 = null;
                        } else if (obj10 instanceof short[]) {
                            short[] sArr3 = (short[]) obj10;
                            int length8 = sArr3.length - 1;
                            int iM85775y2 = vjf1.m85775y(obj.hashCode());
                            while (true) {
                                int i16 = iM85775y2 & length8;
                                char c3 = (char) sArr3[i16];
                                if (c3 == 65535) {
                                    obj4 = null;
                                } else if (obj.equals(objArr3[c3])) {
                                    obj4 = objArr3[c3 ^ 1];
                                } else {
                                    iM85775y2 = i16 + 1;
                                }
                            }
                        } else {
                            int[] iArr3 = (int[]) obj10;
                            int length9 = iArr3.length - 1;
                            int iM85775y3 = vjf1.m85775y(obj.hashCode());
                            while (true) {
                                int i17 = iM85775y3 & length9;
                                int i18 = iArr3[i17];
                                if (i18 != -1) {
                                    if (obj.equals(objArr3[i18])) {
                                        obj4 = objArr3[i18 ^ 1];
                                    } else {
                                        iM85775y3 = i17 + 1;
                                    }
                                }
                            }
                            obj4 = null;
                        }
                    }
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f282630a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f282630a) {
            case 0:
                lgf1 lgf1Var = (lgf1) this.f282634e;
                if (lgf1Var == null) {
                    lgf1Var = new lgf1(this, this.f282632c, this.f282633d);
                    this.f282634e = lgf1Var;
                }
                Iterator it = lgf1Var.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                wnf1 wnf1Var = (wnf1) this.f282634e;
                if (wnf1Var == null) {
                    wnf1Var = new wnf1(this, this.f282632c, this.f282633d);
                    this.f282634e = wnf1Var;
                }
                Iterator it2 = wnf1Var.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                mcg1 mcg1Var = (mcg1) this.f282634e;
                if (mcg1Var == null) {
                    mcg1Var = new mcg1(this, this.f282632c, this.f282633d);
                    this.f282634e = mcg1Var;
                }
                Iterator it3 = mcg1Var.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f282630a) {
            case 0:
                return size() == 0;
            case 1:
                return size() == 0;
            default:
                return size() == 0;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f282630a) {
            case 0:
                pgf1 pgf1Var = (pgf1) this.f282635f;
                if (pgf1Var != null) {
                    return pgf1Var;
                }
                pgf1 pgf1Var2 = new pgf1(this, new ugf1(0, this.f282633d, this.f282632c));
                this.f282635f = pgf1Var2;
                return pgf1Var2;
            case 1:
                aof1 aof1Var = (aof1) this.f282635f;
                if (aof1Var != null) {
                    return aof1Var;
                }
                aof1 aof1Var2 = new aof1(this, new eof1(0, this.f282633d, this.f282632c));
                this.f282635f = aof1Var2;
                return aof1Var2;
            default:
                rcg1 rcg1Var = (rcg1) this.f282635f;
                if (rcg1Var != null) {
                    return rcg1Var;
                }
                rcg1 rcg1Var2 = new rcg1(this, new vcg1(0, this.f282633d, this.f282632c));
                this.f282635f = rcg1Var2;
                return rcg1Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f282630a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f282630a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f282630a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f282630a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f282633d;
    }

    public final String toString() {
        switch (this.f282630a) {
            case 0:
                int i = this.f282633d;
                if (i < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i, "size cannot be negative but was: "));
                }
                StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
                sb.append('{');
                boolean z = true;
                for (Map.Entry entry : (lgf1) entrySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                int i2 = this.f282633d;
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i2, "size cannot be negative but was: "));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
                sb2.append('{');
                boolean z2 = true;
                for (Map.Entry entry2 : (wnf1) entrySet()) {
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                int i3 = this.f282633d;
                if (i3 < 0) {
                    throw new IllegalArgumentException(s571.m77248g(i3, "size cannot be negative but was: ", new StringBuilder(String.valueOf(i3).length() + 33)));
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
                sb3.append('{');
                boolean z3 = true;
                for (Map.Entry entry3 : (mcg1) entrySet()) {
                    if (!z3) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z3 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f282630a) {
            case 0:
                ugf1 ugf1Var = (ugf1) this.f282636g;
                if (ugf1Var != null) {
                    return ugf1Var;
                }
                ugf1 ugf1Var2 = new ugf1(1, this.f282633d, this.f282632c);
                this.f282636g = ugf1Var2;
                return ugf1Var2;
            case 1:
                eof1 eof1Var = (eof1) this.f282636g;
                if (eof1Var != null) {
                    return eof1Var;
                }
                eof1 eof1Var2 = new eof1(1, this.f282633d, this.f282632c);
                this.f282636g = eof1Var2;
                return eof1Var2;
            default:
                vcg1 vcg1Var = (vcg1) this.f282636g;
                if (vcg1Var != null) {
                    return vcg1Var;
                }
                vcg1 vcg1Var2 = new vcg1(1, this.f282633d, this.f282632c);
                this.f282636g = vcg1Var2;
                return vcg1Var2;
        }
    }
}
