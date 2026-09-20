package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fv70 {

    /* JADX INFO: renamed from: a */
    public final cqi0 f73715a;

    /* JADX INFO: renamed from: b */
    public zk1 f73716b;

    /* JADX INFO: renamed from: c */
    public int f73717c;

    /* JADX INFO: renamed from: d */
    public final dqi0 f73718d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f73719e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f73720f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f73721g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f73722h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f73723i;

    /* JADX INFO: renamed from: j */
    public cv70 f73724j;

    /* JADX INFO: renamed from: k */
    public final fxh0 f73725k;

    public fv70() {
        long[] jArr = rdy0.f198228a;
        this.f73715a = new cqi0();
        dqi0 dqi0Var = sdy0.f208112a;
        this.f73718d = new dqi0();
        this.f73719e = new ArrayList();
        this.f73720f = new ArrayList();
        this.f73721g = new ArrayList();
        this.f73722h = new ArrayList();
        this.f73723i = new ArrayList();
        this.f73725k = new bv70(this);
    }

    /* JADX INFO: renamed from: c */
    public static void m42764c(mv70 mv70Var, int i, dv70 dv70Var) {
        int i2 = 0;
        long jMo62911j = mv70Var.mo62911j(0);
        long jM92728a = mv70Var.mo62907f() ? y350.m92728a(jMo62911j, 0, i, 1) : y350.m92728a(jMo62911j, i, 0, 2);
        zu70[] zu70VarArr = dv70Var.f53381a;
        int length = zu70VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            zu70 zu70Var = zu70VarArr[i2];
            int i4 = i3 + 1;
            if (zu70Var != null) {
                zu70Var.f286376l = y350.m92731d(jM92728a, y350.m92730c(mv70Var.mo62911j(i3), jMo62911j));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m42765h(int[] iArr, mv70 mv70Var) {
        int iMo62912k = mv70Var.mo62912k();
        int iMo62905d = mv70Var.mo62905d() + iMo62912k;
        int iMax = 0;
        while (iMo62912k < iMo62905d) {
            int iMo62908g = mv70Var.mo62908g() + iArr[iMo62912k];
            iArr[iMo62912k] = iMo62908g;
            iMax = Math.max(iMax, iMo62908g);
            iMo62912k++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    public final zu70 m42766a(int i, Object obj) {
        dv70 dv70Var = (dv70) this.f73715a.m33623g(obj);
        if (dv70Var != null) {
            return dv70Var.f53381a[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final long m42767b() {
        ArrayList arrayList = this.f73723i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            zu70 zu70Var = (zu70) arrayList.get(i);
            rx10 rx10Var = zu70Var.f286378n;
            if (rx10Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (zu70Var.f286376l >> 32)) + ((int) (rx10Var.f203459u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (zu70Var.f286376l & 4294967295L)) + ((int) (rx10Var.f203459u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0384  */
    /* JADX WARN: Code duplicated, block: B:243:0x00ce A[EDGE_INSN: B:243:0x00ce->B:45:0x00ce BREAK  A[LOOP:2: B:32:0x0094->B:44:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[LOOP:2: B:32:0x0094->B:44:0x00cb, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final void m42768d(int i, int i2, int i3, ArrayList arrayList, zk1 zk1Var, AbstractC1806e9 abstractC1806e9, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, xuk xukVar, ox10 ox10Var) {
        cqi0 cqi0Var;
        long j;
        long j2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        dqi0 dqi0Var;
        cqi0 cqi0Var2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        zk1 zk1Var2;
        int[] iArr2;
        cqi0 cqi0Var3;
        int i7;
        int[] iArr3;
        int i8;
        dqi0 dqi0Var2;
        long j3;
        ArrayList arrayList7;
        cqi0 cqi0Var4;
        ArrayList arrayList8;
        zu70[] zu70VarArr;
        zu70 zu70Var;
        int i9;
        ArrayList arrayList9 = arrayList;
        int i10 = i4;
        zk1 zk1Var3 = this.f73716b;
        this.f73716b = zk1Var;
        int size = arrayList9.size();
        int i11 = 0;
        loop0: while (true) {
            cqi0Var = this.f73715a;
            if (i11 >= size) {
                if (!cqi0Var.m33625i()) {
                    break;
                }
                m42769e();
                return;
            }
            mv70 mv70Var = (mv70) arrayList9.get(i11);
            int iMo62903b = mv70Var.mo62903b();
            for (int i12 = 0; i12 < iMo62903b; i12++) {
                if (ihf1.m50625i(mv70Var.mo62909h(i12)) != null) {
                    break loop0;
                }
            }
            i11++;
        }
        int i13 = this.f73717c;
        mv70 mv70Var2 = (mv70) g6f.m43745s0(arrayList9);
        this.f73717c = mv70Var2 != null ? mv70Var2.getIndex() : 0;
        if (z) {
            j = 4294967295L;
            j2 = (((long) i) & 4294967295L) | (((long) 0) << 32);
        } else {
            j = 4294967295L;
            j2 = (((long) i) << 32) | (((long) 0) & 4294967295L);
        }
        boolean z4 = z2 || !z3;
        Object[] objArr = cqi0Var.f40897b;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        dqi0 dqi0Var3 = this.f73718d;
        boolean z5 = z4;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j4 = jArr[i14];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j4 & 255) < 128) {
                            dqi0Var3.m36642a(objArr[(i14 << 3) + i16]);
                        }
                        j4 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        int size2 = arrayList9.size();
        int i17 = 0;
        while (true) {
            arrayList2 = this.f73723i;
            arrayList3 = this.f73720f;
            arrayList4 = this.f73719e;
            if (i17 >= size2) {
                break;
            }
            mv70 mv70Var3 = (mv70) arrayList9.get(i17);
            int i18 = size2;
            dqi0Var3.m36653l(mv70Var3.getKey());
            int iMo62903b2 = mv70Var3.mo62903b();
            int i19 = i17;
            int i20 = 0;
            while (true) {
                if (i20 >= iMo62903b2) {
                    m42770f(mv70Var3.getKey());
                    break;
                }
                if (ihf1.m50625i(mv70Var3.mo62909h(i20)) != null) {
                    dv70 dv70Var = (dv70) cqi0Var.m33623g(mv70Var3.getKey());
                    int iM96294v = zk1Var3 != null ? zk1Var3.m96294v(mv70Var3.getKey()) : -1;
                    boolean z6 = iM96294v == -1 && zk1Var3 != null;
                    if (dv70Var != null) {
                        boolean z7 = z6;
                        if (!z5) {
                            break;
                        }
                        dv70.m37045b(dv70Var, mv70Var3, xukVar, ox10Var, i5, i6);
                        zu70[] zu70VarArr2 = dv70Var.f53381a;
                        int length2 = zu70VarArr2.length;
                        int i21 = 0;
                        while (i21 < length2) {
                            zu70[] zu70VarArr3 = zu70VarArr2;
                            zu70 zu70Var2 = zu70VarArr3[i21];
                            int i22 = length2;
                            int i23 = i21;
                            if (zu70Var2 != null) {
                                long j5 = zu70Var2.f286376l;
                                int i24 = zu70.f286364t;
                                fzg1.m43211n();
                                if (!y350.m92729b(j5, zu70.f286363s)) {
                                    zu70Var2.f286376l = y350.m92731d(zu70Var2.f286376l, j2);
                                }
                            }
                            i21 = i23 + 1;
                            zu70VarArr2 = zu70VarArr3;
                            length2 = i22;
                        }
                        if (z7) {
                            for (zu70 zu70Var3 : dv70Var.f53381a) {
                                if (zu70Var3 != null) {
                                    if (zu70Var3.m97006c()) {
                                        arrayList2.remove(zu70Var3);
                                        cv70 cv70Var = this.f73724j;
                                        if (cv70Var != null) {
                                            hvg1.m48859l(cv70Var);
                                        }
                                    }
                                    zu70Var3.m97004a();
                                }
                            }
                        }
                        m42771g(mv70Var3, false);
                        break;
                    }
                    dv70 dv70Var2 = new dv70(this);
                    dv70.m37045b(dv70Var2, mv70Var3, xukVar, ox10Var, i5, i6);
                    boolean z8 = z6;
                    cqi0Var.m33629m(mv70Var3.getKey(), dv70Var2);
                    if (mv70Var3.getIndex() != iM96294v && iM96294v != -1) {
                        if (iM96294v < i13) {
                            arrayList4.add(mv70Var3);
                            break;
                        } else {
                            arrayList3.add(mv70Var3);
                            break;
                        }
                    }
                    long jMo62911j = mv70Var3.mo62911j(0);
                    m42764c(mv70Var3, (int) (mv70Var3.mo62907f() ? jMo62911j & j : jMo62911j >> 32), dv70Var2);
                    if (!z8) {
                        break;
                    }
                    zu70[] zu70VarArr4 = dv70Var2.f53381a;
                    for (zu70 zu70Var4 : zu70VarArr4) {
                        if (zu70Var4 != null) {
                            zu70Var4.m97004a();
                        }
                    }
                    break;
                }
                i20++;
            }
            i17 = i19 + 1;
            arrayList9 = arrayList;
            size2 = i18;
        }
        int[] iArr4 = new int[i10];
        if (z5 && zk1Var3 != null) {
            if (arrayList4.isEmpty()) {
                i9 = 0;
            } else {
                if (arrayList4.size() > 1) {
                    j6f.m52572d0(arrayList4, new ev70(zk1Var3, 2));
                }
                int size3 = arrayList4.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    mv70 mv70Var4 = (mv70) arrayList4.get(i25);
                    int iM42765h = i5 - m42765h(iArr4, mv70Var4);
                    Object objM33623g = cqi0Var.m33623g(mv70Var4.getKey());
                    wj50.m88279p(objM33623g);
                    m42764c(mv70Var4, iM42765h, (dv70) objM33623g);
                    m42771g(mv70Var4, false);
                }
                i9 = 0;
                bk5.m29579B0(0, 0, 6, iArr4);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    j6f.m52572d0(arrayList3, new ev70(zk1Var3, i9));
                }
                int size4 = arrayList3.size();
                for (int i26 = 0; i26 < size4; i26++) {
                    mv70 mv70Var5 = (mv70) arrayList3.get(i26);
                    int iM42765h2 = (m42765h(iArr4, mv70Var5) + i6) - mv70Var5.mo62908g();
                    Object objM33623g2 = cqi0Var.m33623g(mv70Var5.getKey());
                    wj50.m88279p(objM33623g2);
                    m42764c(mv70Var5, iM42765h2, (dv70) objM33623g2);
                    m42771g(mv70Var5, false);
                }
                bk5.m29579B0(0, 0, 6, iArr4);
            }
        }
        Object[] objArr2 = dqi0Var3.f52019b;
        long[] jArr2 = dqi0Var3.f52018a;
        int length3 = jArr2.length - 2;
        ArrayList arrayList10 = this.f73722h;
        ArrayList arrayList11 = this.f73721g;
        if (length3 >= 0) {
            cqi0 cqi0Var5 = cqi0Var;
            int i27 = 0;
            while (true) {
                long j6 = jArr2[i27];
                Object[] objArr3 = objArr2;
                long[] jArr3 = jArr2;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j6 & 255) < 128) {
                            i8 = i29;
                            Object obj = objArr3[(i27 << 3) + i29];
                            dqi0Var2 = dqi0Var3;
                            cqi0 cqi0Var6 = cqi0Var5;
                            j3 = j6;
                            dv70 dv70Var3 = (dv70) cqi0Var6.m33623g(obj);
                            if (dv70Var3 == null) {
                                iArr3 = iArr4;
                                cqi0Var4 = cqi0Var6;
                                arrayList8 = arrayList3;
                                arrayList7 = arrayList4;
                            } else {
                                arrayList8 = arrayList3;
                                int iM96294v2 = zk1Var.m96294v(obj);
                                arrayList7 = arrayList4;
                                int iMin = Math.min(i10, dv70Var3.f53385e);
                                dv70Var3.f53385e = iMin;
                                dv70Var3.f53384d = Math.min(i10 - iMin, dv70Var3.f53384d);
                                if (iM96294v2 == -1) {
                                    zu70[] zu70VarArr5 = dv70Var3.f53381a;
                                    int length4 = zu70VarArr5.length;
                                    int i30 = 0;
                                    boolean z9 = false;
                                    int i31 = 0;
                                    while (i30 < length4) {
                                        int i32 = i30;
                                        zu70 zu70Var5 = zu70VarArr5[i32];
                                        int i33 = i31 + 1;
                                        if (zu70Var5 != null) {
                                            if (zu70Var5.m97006c()) {
                                                iArr4 = iArr4;
                                                cqi0Var6 = cqi0Var6;
                                                zu70VarArr = zu70VarArr5;
                                                length4 = length4;
                                            } else {
                                                zu70VarArr = zu70VarArr5;
                                                fbk fbkVar = null;
                                                if (((Boolean) zu70Var5.f286375k.getValue()).booleanValue()) {
                                                    zu70Var5.m97007d();
                                                    dv70Var3.f53381a[i31] = null;
                                                    arrayList2.remove(zu70Var5);
                                                    cv70 cv70Var2 = this.f73724j;
                                                    if (cv70Var2 != null) {
                                                        hvg1.m48859l(cv70Var2);
                                                    }
                                                } else {
                                                    rx10 rx10Var = zu70Var5.f286378n;
                                                    if (rx10Var != null) {
                                                        w9z w9zVar = zu70Var5.f286370f;
                                                        if (zu70Var5.m97006c() || w9zVar == null) {
                                                            zu70Var = null;
                                                        } else {
                                                            zu70Var5.m97009f(true);
                                                            zu70Var = null;
                                                            x0h1.m89578u(zu70Var5.f286365a, null, 0, new ty20(zu70Var5, w9zVar, rx10Var, fbkVar, 22), 3);
                                                        }
                                                    } else {
                                                        zu70Var = null;
                                                    }
                                                    if (zu70Var5.m97006c()) {
                                                        arrayList2.add(zu70Var5);
                                                        cv70 cv70Var3 = this.f73724j;
                                                        if (cv70Var3 != null) {
                                                            hvg1.m48859l(cv70Var3);
                                                        }
                                                    } else {
                                                        zu70Var5.m97007d();
                                                        dv70Var3.f53381a[i31] = zu70Var;
                                                    }
                                                }
                                                i30 = i32 + 1;
                                                i31 = i33;
                                                zu70VarArr5 = zu70VarArr;
                                                length4 = length4;
                                                iArr4 = iArr4;
                                                cqi0Var6 = cqi0Var6;
                                            }
                                            z9 = true;
                                            i30 = i32 + 1;
                                            i31 = i33;
                                            zu70VarArr5 = zu70VarArr;
                                            length4 = length4;
                                            iArr4 = iArr4;
                                            cqi0Var6 = cqi0Var6;
                                        } else {
                                            zu70VarArr = zu70VarArr5;
                                        }
                                        length4 = length4;
                                        i30 = i32 + 1;
                                        i31 = i33;
                                        zu70VarArr5 = zu70VarArr;
                                        length4 = length4;
                                        iArr4 = iArr4;
                                        cqi0Var6 = cqi0Var6;
                                    }
                                    iArr3 = iArr4;
                                    cqi0Var4 = cqi0Var6;
                                    if (!z9) {
                                        m42770f(obj);
                                    }
                                } else {
                                    iArr3 = iArr4;
                                    cqi0Var4 = cqi0Var6;
                                    b8j b8jVar = dv70Var3.f53382b;
                                    wj50.m88279p(b8jVar);
                                    mv70 mv70VarMo38157W0 = abstractC1806e9.mo38157W0(b8jVar.f24596a, iM96294v2, dv70Var3.f53384d, dv70Var3.f53385e);
                                    mv70VarMo38157W0.mo62910i();
                                    zu70[] zu70VarArr6 = dv70Var3.f53381a;
                                    int length5 = zu70VarArr6.length;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < length5) {
                                            zu70 zu70Var6 = zu70VarArr6[i34];
                                            if (zu70Var6 == null || !((Boolean) zu70Var6.f286372h.getValue()).booleanValue()) {
                                                i34++;
                                            }
                                        } else if (zk1Var3 != null && iM96294v2 == zk1Var3.m96294v(obj)) {
                                            m42770f(obj);
                                        }
                                        dv70Var3.m37046a(mv70VarMo38157W0, xukVar, ox10Var, i5, i6, dv70Var3.f53383c);
                                        if (iM96294v2 < this.f73717c) {
                                            arrayList11.add(mv70VarMo38157W0);
                                        } else {
                                            arrayList10.add(mv70VarMo38157W0);
                                        }
                                    }
                                }
                            }
                        } else {
                            iArr3 = iArr4;
                            i8 = i29;
                            dqi0Var2 = dqi0Var3;
                            j3 = j6;
                            arrayList7 = arrayList4;
                            cqi0Var4 = cqi0Var5;
                            arrayList8 = arrayList3;
                        }
                        j6 = j3 >> 8;
                        i29 = i8 + 1;
                        i10 = i4;
                        arrayList3 = arrayList8;
                        dqi0Var3 = dqi0Var2;
                        arrayList4 = arrayList7;
                        iArr4 = iArr3;
                        cqi0Var5 = cqi0Var4;
                    }
                    iArr = iArr4;
                    dqi0Var = dqi0Var3;
                    arrayList6 = arrayList4;
                    cqi0Var2 = cqi0Var5;
                    arrayList5 = arrayList3;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr4;
                    dqi0Var = dqi0Var3;
                    arrayList6 = arrayList4;
                    cqi0Var2 = cqi0Var5;
                    arrayList5 = arrayList3;
                }
                if (i27 == length3) {
                    break;
                }
                i27++;
                i10 = i4;
                arrayList3 = arrayList5;
                objArr2 = objArr3;
                jArr2 = jArr3;
                dqi0Var3 = dqi0Var;
                arrayList4 = arrayList6;
                iArr4 = iArr;
                cqi0Var5 = cqi0Var2;
            }
        } else {
            iArr = iArr4;
            dqi0Var = dqi0Var3;
            cqi0Var2 = cqi0Var;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
        }
        if (arrayList11.isEmpty()) {
            zk1Var2 = zk1Var;
            iArr2 = iArr;
            cqi0Var3 = cqi0Var2;
        } else {
            if (arrayList11.size() > 1) {
                zk1Var2 = zk1Var;
                j6f.m52572d0(arrayList11, new ev70(zk1Var2, 3));
            } else {
                zk1Var2 = zk1Var;
            }
            int size5 = arrayList11.size();
            int i35 = 0;
            while (i35 < size5) {
                mv70 mv70Var6 = (mv70) arrayList11.get(i35);
                cqi0 cqi0Var7 = cqi0Var2;
                Object objM33623g3 = cqi0Var7.m33623g(mv70Var6.getKey());
                wj50.m88279p(objM33623g3);
                dv70 dv70Var4 = (dv70) objM33623g3;
                int[] iArr5 = iArr;
                int iM42765h3 = m42765h(iArr5, mv70Var6);
                if (z2) {
                    mv70 mv70Var7 = (mv70) g6f.m43741q0(arrayList);
                    long jMo62911j2 = mv70Var7.mo62911j(0);
                    i7 = (int) (mv70Var7.mo62907f() ? jMo62911j2 & j : jMo62911j2 >> 32);
                } else {
                    i7 = dv70Var4.f53386f;
                }
                mv70Var6.mo62902a(i7 - iM42765h3, dv70Var4.f53383c, i2, i3);
                if (z5) {
                    m42771g(mv70Var6, true);
                }
                i35++;
                iArr = iArr5;
                cqi0Var2 = cqi0Var7;
            }
            iArr2 = iArr;
            cqi0Var3 = cqi0Var2;
            bk5.m29579B0(0, 0, 6, iArr2);
        }
        if (!arrayList10.isEmpty()) {
            int i36 = 1;
            if (arrayList10.size() > 1) {
                j6f.m52572d0(arrayList10, new ev70(zk1Var2, i36));
            }
            int size6 = arrayList10.size();
            for (int i37 = 0; i37 < size6; i37++) {
                mv70 mv70Var8 = (mv70) arrayList10.get(i37);
                Object objM33623g4 = cqi0Var3.m33623g(mv70Var8.getKey());
                wj50.m88279p(objM33623g4);
                dv70 dv70Var5 = (dv70) objM33623g4;
                mv70Var8.mo62902a((dv70Var5.f53387g - mv70Var8.mo62908g()) + m42765h(iArr2, mv70Var8), dv70Var5.f53383c, i2, i3);
                if (z5) {
                    m42771g(mv70Var8, true);
                }
            }
        }
        g6f.m43703Q0(arrayList11);
        arrayList.addAll(0, arrayList11);
        arrayList.addAll(arrayList10);
        arrayList6.clear();
        arrayList5.clear();
        arrayList11.clear();
        arrayList10.clear();
        dqi0Var.m36643b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m42769e() {
        cqi0 cqi0Var = this.f73715a;
        if (cqi0Var.m33626j()) {
            Object[] objArr = cqi0Var.f40898c;
            long[] jArr = cqi0Var.f40896a;
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
                                for (zu70 zu70Var : ((dv70) objArr[(i << 3) + i3]).f53381a) {
                                    if (zu70Var != null) {
                                        zu70Var.m97007d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            cqi0Var.m33617a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m42770f(Object obj) {
        zu70[] zu70VarArr;
        dv70 dv70Var = (dv70) this.f73715a.m33627k(obj);
        if (dv70Var == null || (zu70VarArr = dv70Var.f53381a) == null) {
            return;
        }
        for (zu70 zu70Var : zu70VarArr) {
            if (zu70Var != null) {
                zu70Var.m97007d();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m42771g(mv70 mv70Var, boolean z) {
        long j;
        Object objM33623g = this.f73715a.m33623g(mv70Var.getKey());
        wj50.m88279p(objM33623g);
        zu70[] zu70VarArr = ((dv70) objM33623g).f53381a;
        int length = zu70VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zu70 zu70Var = zu70VarArr[i];
            int i3 = i2 + 1;
            if (zu70Var != null) {
                long jMo62911j = mv70Var.mo62911j(i2);
                long j2 = zu70Var.f286376l;
                int i4 = zu70.f286364t;
                fzg1.m43211n();
                if (!y350.m92729b(j2, zu70.f286363s) && !y350.m92729b(j2, jMo62911j)) {
                    long jM92730c = y350.m92730c(jMo62911j, j2);
                    w9z w9zVar = zu70Var.f286369e;
                    if (w9zVar == null) {
                        j = jMo62911j;
                    } else {
                        long jM92730c2 = y350.m92730c(((y350) zu70Var.f286381q.getValue()).f268755a, jM92730c);
                        zu70Var.m97011h(jM92730c2);
                        zu70Var.m97010g(true);
                        zu70Var.f286371g = z;
                        j = jMo62911j;
                        x0h1.m89578u(zu70Var.f286365a, null, 0, new C2004j6(zu70Var, w9zVar, jM92730c2, (fbk) null, 10), 3);
                    }
                    jMo62911j = j;
                }
                zu70Var.f286376l = jMo62911j;
            }
            i++;
            i2 = i3;
        }
    }
}
