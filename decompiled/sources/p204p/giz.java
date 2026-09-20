package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class giz extends vpc1 {

    /* JADX INFO: renamed from: e1 */
    public v7j[] f80299e1;

    /* JADX INFO: renamed from: H0 */
    public int f80276H0 = -1;

    /* JADX INFO: renamed from: I0 */
    public int f80277I0 = -1;

    /* JADX INFO: renamed from: J0 */
    public int f80278J0 = -1;

    /* JADX INFO: renamed from: K0 */
    public int f80279K0 = -1;

    /* JADX INFO: renamed from: L0 */
    public int f80280L0 = -1;

    /* JADX INFO: renamed from: M0 */
    public int f80281M0 = -1;

    /* JADX INFO: renamed from: N0 */
    public float f80282N0 = 0.5f;

    /* JADX INFO: renamed from: O0 */
    public float f80283O0 = 0.5f;

    /* JADX INFO: renamed from: P0 */
    public float f80284P0 = 0.5f;

    /* JADX INFO: renamed from: Q0 */
    public float f80285Q0 = 0.5f;

    /* JADX INFO: renamed from: R0 */
    public float f80286R0 = 0.5f;

    /* JADX INFO: renamed from: S0 */
    public float f80287S0 = 0.5f;

    /* JADX INFO: renamed from: T0 */
    public int f80288T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public int f80289U0 = 0;

    /* JADX INFO: renamed from: V0 */
    public int f80290V0 = 2;

    /* JADX INFO: renamed from: W0 */
    public int f80291W0 = 2;

    /* JADX INFO: renamed from: X0 */
    public int f80292X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    public int f80293Y0 = -1;

    /* JADX INFO: renamed from: Z0 */
    public int f80294Z0 = 0;

    /* JADX INFO: renamed from: a1 */
    public final ArrayList f80295a1 = new ArrayList();

    /* JADX INFO: renamed from: b1 */
    public v7j[] f80296b1 = null;

    /* JADX INFO: renamed from: c1 */
    public v7j[] f80297c1 = null;

    /* JADX INFO: renamed from: d1 */
    public int[] f80298d1 = null;

    /* JADX INFO: renamed from: f1 */
    public int f80300f1 = 0;

    /* JADX WARN: Code duplicated, block: B:405:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:406:0x06ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:407:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:408:0x06f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:413:0x0708  */
    /* JADX WARN: Code duplicated, block: B:414:0x070b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.vpc1
    /* JADX INFO: renamed from: Z */
    public final void mo35147Z(int i, int i2, int i3, int i4) {
        int i5;
        v7j[] v7jVarArr;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        eiz eizVar;
        char c;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int iCeil;
        int iCeil2;
        Object obj;
        v7j v7jVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f114775v0;
        u7j u7jVar = u7j.f227712c;
        u7j u7jVar2 = u7j.f227711b;
        if (i18 > 0) {
            v7j v7jVar2 = this.f238221V;
            c29 c29Var = v7jVar2 != null ? ((w7j) v7jVar2).f248712y0 : null;
            if (c29Var == null) {
                this.f243662D0 = 0;
                this.f243663E0 = 0;
                this.f243661C0 = false;
                return;
            }
            for (int i19 = 0; i19 < this.f114775v0; i19++) {
                v7j v7jVar3 = this.f114774u0[i19];
                if (v7jVar3 != null && !(v7jVar3 instanceof ka20)) {
                    u7j u7jVarM84881l = v7jVar3.m84881l(0);
                    u7j u7jVarM84881l2 = v7jVar3.m84881l(1);
                    if (u7jVarM84881l != u7jVar || v7jVar3.f238262s == 1 || u7jVarM84881l2 != u7jVar || v7jVar3.f238264t == 1) {
                        if (u7jVarM84881l == u7jVar) {
                            u7jVarM84881l = u7jVar2;
                        }
                        if (u7jVarM84881l2 == u7jVar) {
                            u7jVarM84881l2 = u7jVar2;
                        }
                        b29 b29Var = this.f243664F0;
                        b29Var.f22527a = u7jVarM84881l;
                        b29Var.f22528b = u7jVarM84881l2;
                        b29Var.f22529c = v7jVar3.m84886s();
                        b29Var.f22530d = v7jVar3.m84882m();
                        c29Var.mo31319b(v7jVar3, b29Var);
                        v7jVar3.m84872T(b29Var.f22531e);
                        v7jVar3.m84867O(b29Var.f22532f);
                        v7jVar3.m84863K(b29Var.f22533g);
                    }
                }
            }
        }
        int i20 = this.f243659A0;
        int i21 = this.f243660B0;
        int i22 = this.f243666w0;
        int i23 = this.f243667x0;
        int[] iArr2 = new int[2];
        int i24 = (i2 - i20) - i21;
        int i25 = this.f80294Z0;
        if (i25 == 1) {
            i24 = (i4 - i22) - i23;
        }
        int i26 = i24;
        if (i25 == 0) {
            if (this.f80276H0 == -1) {
                this.f80276H0 = 0;
            }
            if (this.f80277I0 == -1) {
                this.f80277I0 = 0;
            }
        } else {
            if (this.f80276H0 == -1) {
                this.f80276H0 = 0;
            }
            if (this.f80277I0 == -1) {
                this.f80277I0 = 0;
            }
        }
        v7j[] v7jVarArr2 = this.f114774u0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i5 = this.f114775v0;
            if (i27 >= i5) {
                break;
            }
            if (this.f114774u0[i27].f238243i0 == 8) {
                i28++;
            }
            i27++;
        }
        if (i28 > 0) {
            v7j[] v7jVarArr3 = new v7j[i5 - i28];
            int i30 = 0;
            i5 = 0;
            while (i30 < this.f114775v0) {
                v7j v7jVar4 = this.f114774u0[i30];
                int i31 = i20;
                v7j[] v7jVarArr4 = v7jVarArr3;
                if (v7jVar4.f238243i0 != 8) {
                    v7jVarArr4[i5] = v7jVar4;
                    i5++;
                }
                i30++;
                i20 = i31;
                v7jVarArr3 = v7jVarArr4;
            }
            v7jVarArr = v7jVarArr3;
        } else {
            v7jVarArr = v7jVarArr2;
        }
        int i32 = i20;
        this.f80299e1 = v7jVarArr;
        this.f80300f1 = i5;
        int i33 = this.f80292X0;
        ArrayList arrayList = this.f80295a1;
        if (i33 != 0) {
            c6j c6jVar = this.f238210K;
            c6j c6jVar2 = this.f238209J;
            c6j c6jVar3 = this.f238211L;
            c6j c6jVar4 = this.f238212M;
            if (i33 == 1) {
                i6 = i21;
                i7 = i22;
                i8 = i23;
                iArr = iArr2;
                i9 = i32;
                int i34 = this.f80294Z0;
                if (i5 != 0) {
                    arrayList.clear();
                    eiz eizVar2 = new eiz(this, i34, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                    arrayList.add(eizVar2);
                    if (i34 == 0) {
                        i11 = 0;
                        int i35 = 0;
                        int i36 = 0;
                        while (i36 < i5) {
                            v7j v7jVar5 = v7jVarArr[i36];
                            int iM44860c0 = m44860c0(v7jVar5, i26);
                            if (v7jVar5.f238220U[0] == u7jVar) {
                                i11++;
                            }
                            int i37 = i11;
                            boolean z2 = (i35 == i26 || (this.f80288T0 + i35) + iM44860c0 > i26) && eizVar2.f60068b != null;
                            if (!z2 && i36 > 0 && (i13 = this.f80293Y0) > 0 && i36 % i13 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                eizVar2 = new eiz(this, i34, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                                eizVar2.m39156h(i36);
                                arrayList.add(eizVar2);
                            } else {
                                if (i36 > 0) {
                                    i35 = this.f80288T0 + iM44860c0 + i35;
                                }
                                eizVar2.m39150b(v7jVar5);
                                i36++;
                                i11 = i37;
                            }
                            i35 = iM44860c0;
                            eizVar2.m39150b(v7jVar5);
                            i36++;
                            i11 = i37;
                        }
                    } else {
                        i11 = 0;
                        int i38 = 0;
                        int i39 = 0;
                        while (i39 < i5) {
                            v7j v7jVar6 = v7jVarArr[i39];
                            int iM44859b0 = m44859b0(v7jVar6, i26);
                            if (v7jVar6.f238220U[1] == u7jVar) {
                                i11++;
                            }
                            int i40 = i11;
                            boolean z3 = (i38 == i26 || (this.f80289U0 + i38) + iM44859b0 > i26) && eizVar2.f60068b != null;
                            if (!z3 && i39 > 0 && (i12 = this.f80293Y0) > 0 && i39 % i12 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                eizVar2 = new eiz(this, i34, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                                eizVar2.m39156h(i39);
                                arrayList.add(eizVar2);
                            } else {
                                if (i39 > 0) {
                                    i38 = this.f80289U0 + iM44859b0 + i38;
                                }
                                eizVar2.m39150b(v7jVar6);
                                i39++;
                                i11 = i40;
                            }
                            i38 = iM44859b0;
                            eizVar2.m39150b(v7jVar6);
                            i39++;
                            i11 = i40;
                        }
                    }
                    int size = arrayList.size();
                    int i41 = this.f243659A0;
                    int i42 = this.f243666w0;
                    int i43 = this.f243660B0;
                    int i44 = this.f243667x0;
                    u7j[] u7jVarArr = this.f238220U;
                    boolean z4 = u7jVarArr[0] == u7jVar2 || u7jVarArr[1] == u7jVar2;
                    if (i11 > 0 && z4) {
                        for (int i45 = 0; i45 < size; i45++) {
                            eiz eizVar3 = (eiz) arrayList.get(i45);
                            if (i34 == 0) {
                                eizVar3.m39155g(i26 - eizVar3.m39154f());
                            } else {
                                eizVar3.m39155g(i26 - eizVar3.m39153e());
                            }
                        }
                    }
                    int i46 = i41;
                    int i47 = i42;
                    int i48 = i43;
                    int i49 = i44;
                    c6j c6jVar5 = c6jVar;
                    c6j c6jVar6 = c6jVar2;
                    int iMax = 0;
                    int i50 = 0;
                    c6j c6jVar7 = c6jVar3;
                    c6j c6jVar8 = c6jVar4;
                    for (int i51 = 0; i51 < size; i51++) {
                        eiz eizVar4 = (eiz) arrayList.get(i51);
                        if (i34 == 0) {
                            if (i51 < size - 1) {
                                c6jVar8 = ((eiz) arrayList.get(i51 + 1)).f60068b.f238210K;
                                i49 = 0;
                            } else {
                                i49 = this.f243667x0;
                                c6jVar8 = c6jVar4;
                            }
                            c6j c6jVar9 = eizVar4.f60068b.f238212M;
                            eizVar4.m39157i(i34, c6jVar6, c6jVar5, c6jVar7, c6jVar8, i46, i47, i48, i49, i26);
                            iMax = Math.max(iMax, eizVar4.m39154f());
                            int iM39153e = eizVar4.m39153e() + i50;
                            if (i51 > 0) {
                                iM39153e += this.f80289U0;
                            }
                            c6jVar5 = c6jVar9;
                            i50 = iM39153e;
                            i47 = 0;
                        } else {
                            if (i51 < size - 1) {
                                c6jVar7 = ((eiz) arrayList.get(i51 + 1)).f60068b.f238209J;
                                i48 = 0;
                            } else {
                                i48 = this.f243660B0;
                                c6jVar7 = c6jVar3;
                            }
                            c6j c6jVar10 = eizVar4.f60068b.f238211L;
                            eizVar4.m39157i(i34, c6jVar6, c6jVar5, c6jVar7, c6jVar8, i46, i47, i48, i49, i26);
                            int iM39154f = eizVar4.m39154f() + iMax;
                            int iMax2 = Math.max(i50, eizVar4.m39153e());
                            if (i51 > 0) {
                                iM39154f += this.f80288T0;
                            }
                            i50 = iMax2;
                            c6jVar6 = c6jVar10;
                            iMax = iM39154f;
                            i46 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i50;
                }
            } else if (i33 == 2) {
                i6 = i21;
                i7 = i22;
                i8 = i23;
                iArr = iArr2;
                i9 = i32;
                int i52 = this.f80294Z0;
                if (i52 == 0) {
                    int i53 = this.f80293Y0;
                    if (i53 <= 0) {
                        int i54 = 0;
                        iCeil2 = 0;
                        for (int i55 = 0; i55 < i5; i55++) {
                            if (i55 > 0) {
                                i54 += this.f80288T0;
                            }
                            v7j v7jVar7 = v7jVarArr[i55];
                            if (v7jVar7 != null) {
                                int iM44860c1 = m44860c0(v7jVar7, i26) + i54;
                                if (iM44860c1 > i26) {
                                    break;
                                }
                                iCeil2++;
                                i54 = iM44860c1;
                            }
                        }
                    } else {
                        iCeil2 = i53;
                    }
                    iCeil = 0;
                } else {
                    iCeil = this.f80293Y0;
                    if (iCeil <= 0) {
                        int i56 = 0;
                        int i57 = 0;
                        for (int i58 = 0; i58 < i5; i58++) {
                            if (i58 > 0) {
                                i56 += this.f80289U0;
                            }
                            v7j v7jVar8 = v7jVarArr[i58];
                            if (v7jVar8 != null) {
                                int iM44859b1 = m44859b0(v7jVar8, i26) + i56;
                                if (iM44859b1 > i26) {
                                    break;
                                }
                                i57++;
                                i56 = iM44859b1;
                            }
                        }
                        iCeil = i57;
                    }
                    iCeil2 = 0;
                }
                if (this.f80298d1 == null) {
                    this.f80298d1 = new int[2];
                }
                boolean z5 = (iCeil == 0 && i52 == 1) || (iCeil2 == 0 && i52 == 0);
                while (!z5) {
                    if (i52 == 0) {
                        iCeil = (int) Math.ceil(i5 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i5 / iCeil);
                    }
                    v7j[] v7jVarArr5 = this.f80297c1;
                    if (v7jVarArr5 == null || v7jVarArr5.length < iCeil2) {
                        obj = null;
                        this.f80297c1 = new v7j[iCeil2];
                    } else {
                        obj = null;
                        Arrays.fill(v7jVarArr5, (Object) null);
                    }
                    v7j[] v7jVarArr6 = this.f80296b1;
                    if (v7jVarArr6 == null || v7jVarArr6.length < iCeil) {
                        this.f80296b1 = new v7j[iCeil];
                    } else {
                        Arrays.fill(v7jVarArr6, obj);
                    }
                    for (int i59 = 0; i59 < iCeil2; i59++) {
                        for (int i60 = 0; i60 < iCeil; i60++) {
                            int i61 = (i60 * iCeil2) + i59;
                            if (i52 == 1) {
                                i61 = (i59 * iCeil) + i60;
                            }
                            if (i61 < v7jVarArr.length && (v7jVar = v7jVarArr[i61]) != null) {
                                int iM44860c2 = m44860c0(v7jVar, i26);
                                v7j v7jVar9 = this.f80297c1[i59];
                                if (v7jVar9 == null || v7jVar9.m84886s() < iM44860c2) {
                                    this.f80297c1[i59] = v7jVar;
                                }
                                int iM44859b2 = m44859b0(v7jVar, i26);
                                v7j v7jVar10 = this.f80296b1[i60];
                                if (v7jVar10 == null || v7jVar10.m84882m() < iM44859b2) {
                                    this.f80296b1[i60] = v7jVar;
                                }
                            }
                        }
                    }
                    int iM44860c3 = 0;
                    for (int i62 = 0; i62 < iCeil2; i62++) {
                        v7j v7jVar11 = this.f80297c1[i62];
                        if (v7jVar11 != null) {
                            if (i62 > 0) {
                                iM44860c3 += this.f80288T0;
                            }
                            iM44860c3 = m44860c0(v7jVar11, i26) + iM44860c3;
                        }
                    }
                    int iM44859b3 = 0;
                    for (int i63 = 0; i63 < iCeil; i63++) {
                        v7j v7jVar12 = this.f80296b1[i63];
                        if (v7jVar12 != null) {
                            if (i63 > 0) {
                                iM44859b3 += this.f80289U0;
                            }
                            iM44859b3 = m44859b0(v7jVar12, i26) + iM44859b3;
                        }
                    }
                    iArr[0] = iM44860c3;
                    iArr[1] = iM44859b3;
                    if (i52 == 0) {
                        if (iM44860c3 <= i26 || iCeil2 <= 1) {
                            z5 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iM44859b3 <= i26 || iCeil <= 1) {
                        z5 = true;
                    } else {
                        iCeil--;
                    }
                }
                int[] iArr3 = this.f80298d1;
                iArr3[0] = iCeil2;
                iArr3[1] = iCeil;
                c = 1;
            } else if (i33 != 3) {
                i6 = i21;
                i7 = i22;
                i8 = i23;
                iArr = iArr2;
                i9 = i32;
            } else {
                int i64 = this.f80294Z0;
                if (i5 == 0) {
                    i6 = i21;
                    i7 = i22;
                    i8 = i23;
                    iArr = iArr2;
                    i9 = i32;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i8 = i23;
                    i9 = i32;
                    i6 = i21;
                    i7 = i22;
                    eiz eizVar5 = new eiz(this, i64, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                    arrayList.add(eizVar5);
                    if (i64 == 0) {
                        int i65 = 0;
                        int i66 = 0;
                        i14 = 0;
                        int i67 = 0;
                        while (i65 < i5) {
                            i66++;
                            v7j v7jVar13 = v7jVarArr[i65];
                            int iM44860c4 = m44860c0(v7jVar13, i26);
                            eiz eizVar6 = eizVar5;
                            if (v7jVar13.f238220U[0] == u7jVar) {
                                i14++;
                            }
                            int i68 = i14;
                            boolean z6 = (i67 == i26 || (this.f80288T0 + i67) + iM44860c4 > i26) && eizVar6.f60068b != null;
                            if (!z6 && i65 > 0 && (i17 = this.f80293Y0) > 0 && i66 > i17) {
                                z6 = true;
                            }
                            if (z6) {
                                i16 = i65;
                                eizVar5 = new eiz(this, i64, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                                eizVar5.m39156h(i16);
                                arrayList.add(eizVar5);
                                i67 = iM44860c4;
                                i66 = 1;
                            } else {
                                i16 = i65;
                                i67 = i16 > 0 ? this.f80288T0 + iM44860c4 + i67 : iM44860c4;
                                eizVar5 = eizVar6;
                            }
                            eizVar5.m39150b(v7jVar13);
                            i65 = i16 + 1;
                            i14 = i68;
                        }
                    } else {
                        int i69 = 0;
                        int i70 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        while (i72 < i5) {
                            i69++;
                            v7j v7jVar14 = v7jVarArr[i72];
                            int iM44859b4 = m44859b0(v7jVar14, i26);
                            if (v7jVar14.f238220U[1] == u7jVar) {
                                i70++;
                            }
                            int i73 = i70;
                            boolean z7 = (i71 == i26 || (this.f80289U0 + i71) + iM44859b4 > i26) && eizVar5.f60068b != null;
                            if (!z7 && i72 > 0 && (i15 = this.f80293Y0) > 0 && i69 > i15) {
                                z7 = true;
                            }
                            if (z7) {
                                eizVar5 = new eiz(this, i64, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                                eizVar5.m39156h(i72);
                                arrayList.add(eizVar5);
                                i71 = iM44859b4;
                                i69 = 1;
                            } else {
                                i71 = i72 > 0 ? this.f80289U0 + iM44859b4 + i71 : iM44859b4;
                            }
                            eizVar5.m39150b(v7jVar14);
                            i72++;
                            i70 = i73;
                        }
                        i14 = i70;
                    }
                    int size2 = arrayList.size();
                    int i74 = this.f243659A0;
                    int i75 = this.f243666w0;
                    int i76 = this.f243660B0;
                    int i77 = this.f243667x0;
                    u7j[] u7jVarArr2 = this.f238220U;
                    boolean z8 = u7jVarArr2[0] == u7jVar2 || u7jVarArr2[1] == u7jVar2;
                    if (i14 > 0 && z8) {
                        for (int i78 = 0; i78 < size2; i78++) {
                            eiz eizVar7 = (eiz) arrayList.get(i78);
                            if (i64 == 0) {
                                eizVar7.m39155g(i26 - eizVar7.m39154f());
                            } else {
                                eizVar7.m39155g(i26 - eizVar7.m39153e());
                            }
                        }
                    }
                    int i79 = i74;
                    int i80 = i75;
                    int i81 = i76;
                    int i82 = i77;
                    c6j c6jVar11 = c6jVar;
                    c6j c6jVar12 = c6jVar2;
                    int iMax3 = 0;
                    int i83 = 0;
                    c6j c6jVar13 = c6jVar3;
                    c6j c6jVar14 = c6jVar4;
                    for (int i84 = 0; i84 < size2; i84++) {
                        eiz eizVar8 = (eiz) arrayList.get(i84);
                        if (i64 == 0) {
                            if (i84 < size2 - 1) {
                                c6jVar14 = ((eiz) arrayList.get(i84 + 1)).f60068b.f238210K;
                                i82 = 0;
                            } else {
                                i82 = this.f243667x0;
                                c6jVar14 = c6jVar4;
                            }
                            c6j c6jVar15 = eizVar8.f60068b.f238212M;
                            eizVar8.m39157i(i64, c6jVar12, c6jVar11, c6jVar13, c6jVar14, i79, i80, i81, i82, i26);
                            iMax3 = Math.max(iMax3, eizVar8.m39154f());
                            int iM39153e2 = eizVar8.m39153e() + i83;
                            if (i84 > 0) {
                                iM39153e2 += this.f80289U0;
                            }
                            c6jVar11 = c6jVar15;
                            i83 = iM39153e2;
                            i80 = 0;
                        } else {
                            if (i84 < size2 - 1) {
                                c6jVar13 = ((eiz) arrayList.get(i84 + 1)).f60068b.f238209J;
                                i81 = 0;
                            } else {
                                i81 = this.f243660B0;
                                c6jVar13 = c6jVar3;
                            }
                            c6j c6jVar16 = eizVar8.f60068b.f238211L;
                            eizVar8.m39157i(i64, c6jVar12, c6jVar11, c6jVar13, c6jVar14, i79, i80, i81, i82, i26);
                            int iM39154f2 = eizVar8.m39154f() + iMax3;
                            int iMax4 = Math.max(i83, eizVar8.m39153e());
                            if (i84 > 0) {
                                iM39154f2 += this.f80288T0;
                            }
                            i83 = iMax4;
                            c6jVar12 = c6jVar16;
                            iMax3 = iM39154f2;
                            i79 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i83;
                }
            }
            c = 1;
        } else {
            i6 = i21;
            i7 = i22;
            i8 = i23;
            iArr = iArr2;
            i9 = i32;
            int i85 = this.f80294Z0;
            if (i5 == 0) {
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    eizVar = new eiz(this, i85, this.f238209J, this.f238210K, this.f238211L, this.f238212M, i26);
                    arrayList.add(eizVar);
                } else {
                    eiz eizVar9 = (eiz) arrayList.get(0);
                    eizVar9.m39151c();
                    eizVar9.m39157i(i85, this.f238209J, this.f238210K, this.f238211L, this.f238212M, this.f243659A0, this.f243666w0, this.f243660B0, this.f243667x0, i26);
                    eizVar = eizVar9;
                }
                for (int i86 = 0; i86 < i5; i86++) {
                    eizVar.m39150b(v7jVarArr[i86]);
                }
                i29 = 0;
                iArr[0] = eizVar.m39154f();
                c = 1;
                iArr[1] = eizVar.m39153e();
            }
        }
        int iMin = iArr[i29] + i9 + i6;
        int iMin2 = iArr[c] + i7 + i8;
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i10 = i3;
                if (i != 0) {
                    iMin = i29;
                }
            }
            if (i10 == 1073741824) {
                iMin2 = i4;
            } else if (i10 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i10 != 0) {
                iMin2 = i29;
            }
            this.f243662D0 = iMin;
            this.f243663E0 = iMin2;
            m84872T(iMin);
            m84867O(iMin2);
            if (this.f114775v0 > 0) {
                z = c;
            } else {
                z = i29;
            }
            this.f243661C0 = z;
        }
        iMin = i2;
        i10 = i3;
        if (i10 == 1073741824) {
            iMin2 = i4;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i10 != 0) {
            iMin2 = i29;
        }
        this.f243662D0 = iMin;
        this.f243663E0 = iMin2;
        m84872T(iMin);
        m84867O(iMin2);
        if (this.f114775v0 > 0) {
            z = c;
        } else {
            z = i29;
        }
        this.f243661C0 = z;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m44859b0(v7j v7jVar, int i) {
        v7j v7jVar2;
        if (v7jVar == null) {
            return 0;
        }
        if (v7jVar.f238220U[1] == u7j.f227712c) {
            int i2 = v7jVar.f238264t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (v7jVar.f238200A * i);
                if (i3 != v7jVar.m84882m()) {
                    v7jVar.f238238g = true;
                    m86121a0(v7jVar, v7jVar.f238220U[0], v7jVar.m84886s(), u7j.f227710a, i3);
                }
                return i3;
            }
            v7jVar2 = v7jVar;
            if (i2 == 1) {
                return v7jVar2.m84882m();
            }
            if (i2 == 3) {
                return (int) ((v7jVar2.m84886s() * v7jVar2.f238224Y) + 0.5f);
            }
        } else {
            v7jVar2 = v7jVar;
        }
        return v7jVar2.m84882m();
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: c */
    public final void mo35148c(kl80 kl80Var, boolean z) {
        v7j v7jVar;
        float f;
        int i;
        super.mo35148c(kl80Var, z);
        v7j v7jVar2 = this.f238221V;
        boolean z2 = v7jVar2 != null && ((w7j) v7jVar2).f248713z0;
        int i2 = this.f80292X0;
        ArrayList arrayList = this.f80295a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((eiz) arrayList.get(i3)).m39152d(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((eiz) arrayList.get(i4)).m39152d(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f80298d1 != null && this.f80297c1 != null && this.f80296b1 != null) {
                for (int i5 = 0; i5 < this.f80300f1; i5++) {
                    this.f80299e1[i5].m84860F();
                }
                int[] iArr = this.f80298d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f80282N0;
                v7j v7jVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f80282N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    v7j v7jVar4 = this.f80297c1[i];
                    if (v7jVar4 != null) {
                        c6j c6jVar = v7jVar4.f238209J;
                        if (v7jVar4.f238243i0 != 8) {
                            if (i8 == 0) {
                                v7jVar4.m84878g(c6jVar, this.f238209J, this.f243659A0);
                                v7jVar4.f238249l0 = this.f80276H0;
                                v7jVar4.f238237f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                v7jVar4.m84878g(v7jVar4.f238211L, this.f238211L, this.f243660B0);
                            }
                            if (i8 > 0 && v7jVar3 != null) {
                                c6j c6jVar2 = v7jVar3.f238211L;
                                v7jVar4.m84878g(c6jVar, c6jVar2, this.f80288T0);
                                v7jVar3.m84878g(c6jVar2, c6jVar, 0);
                            }
                            v7jVar3 = v7jVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    v7j v7jVar5 = this.f80296b1[i9];
                    if (v7jVar5 != null) {
                        c6j c6jVar3 = v7jVar5.f238210K;
                        if (v7jVar5.f238243i0 != 8) {
                            if (i9 == 0) {
                                v7jVar5.m84878g(c6jVar3, this.f238210K, this.f243666w0);
                                v7jVar5.f238251m0 = this.f80277I0;
                                v7jVar5.f238239g0 = this.f80283O0;
                            }
                            if (i9 == i7 - 1) {
                                v7jVar5.m84878g(v7jVar5.f238212M, this.f238212M, this.f243667x0);
                            }
                            if (i9 > 0 && v7jVar3 != null) {
                                c6j c6jVar4 = v7jVar3.f238212M;
                                v7jVar5.m84878g(c6jVar3, c6jVar4, this.f80289U0);
                                v7jVar3.m84878g(c6jVar4, c6jVar3, 0);
                            }
                            v7jVar3 = v7jVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f80294Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        v7j[] v7jVarArr = this.f80299e1;
                        if (i12 < v7jVarArr.length && (v7jVar = v7jVarArr[i12]) != null && v7jVar.f238243i0 != 8) {
                            v7j v7jVar6 = this.f80297c1[i10];
                            v7j v7jVar7 = this.f80296b1[i11];
                            if (v7jVar != v7jVar6) {
                                v7jVar.m84878g(v7jVar.f238209J, v7jVar6.f238209J, 0);
                                v7jVar.m84878g(v7jVar.f238211L, v7jVar6.f238211L, 0);
                            }
                            if (v7jVar != v7jVar7) {
                                v7jVar.m84878g(v7jVar.f238210K, v7jVar7.f238210K, 0);
                                v7jVar.m84878g(v7jVar.f238212M, v7jVar7.f238212M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((eiz) arrayList.get(0)).m39152d(0, z2, true);
        }
        this.f243661C0 = false;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m44860c0(v7j v7jVar, int i) {
        v7j v7jVar2;
        if (v7jVar == null) {
            return 0;
        }
        if (v7jVar.f238220U[0] == u7j.f227712c) {
            int i2 = v7jVar.f238262s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (v7jVar.f238269x * i);
                if (i3 != v7jVar.m84886s()) {
                    v7jVar.f238238g = true;
                    m86121a0(v7jVar, u7j.f227710a, i3, v7jVar.f238220U[1], v7jVar.m84882m());
                }
                return i3;
            }
            v7jVar2 = v7jVar;
            if (i2 == 1) {
                return v7jVar2.m84886s();
            }
            if (i2 == 3) {
                return (int) ((v7jVar2.m84882m() * v7jVar2.f238224Y) + 0.5f);
            }
        } else {
            v7jVar2 = v7jVar;
        }
        return v7jVar2.m84886s();
    }

    @Override // p204p.jq20, p204p.v7j
    /* JADX INFO: renamed from: h */
    public final void mo44861h(v7j v7jVar, HashMap map) {
        super.mo44861h(v7jVar, map);
        giz gizVar = (giz) v7jVar;
        this.f80276H0 = gizVar.f80276H0;
        this.f80277I0 = gizVar.f80277I0;
        this.f80278J0 = gizVar.f80278J0;
        this.f80279K0 = gizVar.f80279K0;
        this.f80280L0 = gizVar.f80280L0;
        this.f80281M0 = gizVar.f80281M0;
        this.f80282N0 = gizVar.f80282N0;
        this.f80283O0 = gizVar.f80283O0;
        this.f80284P0 = gizVar.f80284P0;
        this.f80285Q0 = gizVar.f80285Q0;
        this.f80286R0 = gizVar.f80286R0;
        this.f80287S0 = gizVar.f80287S0;
        this.f80288T0 = gizVar.f80288T0;
        this.f80289U0 = gizVar.f80289U0;
        this.f80290V0 = gizVar.f80290V0;
        this.f80291W0 = gizVar.f80291W0;
        this.f80292X0 = gizVar.f80292X0;
        this.f80293Y0 = gizVar.f80293Y0;
        this.f80294Z0 = gizVar.f80294Z0;
    }
}
