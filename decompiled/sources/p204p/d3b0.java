package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d3b0 extends t5o0 implements s1i0, o6d0 {

    /* JADX INFO: renamed from: L0 */
    public cqi0 f44836L0;

    /* JADX INFO: renamed from: X */
    public boolean f44837X;

    /* JADX INFO: renamed from: Y */
    public final e3b0 f44838Y = new e3b0(this);

    /* JADX INFO: renamed from: Z */
    public bg30 f44839Z;

    /* JADX INFO: renamed from: f */
    public a3b0 f44840f;

    /* JADX INFO: renamed from: g */
    public gh00 f44841g;

    /* JADX INFO: renamed from: h */
    public v5o0 f44842h;

    /* JADX INFO: renamed from: i */
    public boolean f44843i;

    /* JADX INFO: renamed from: t */
    public boolean f44844t;

    /* JADX INFO: renamed from: D0 */
    public static void m34814D0(bnj0 bnj0Var) {
        mp70 mp70Var;
        bnj0 bnj0Var2 = bnj0Var.f28853P0;
        lp70 lp70Var = bnj0Var.f28850M0;
        if (!wj50.m88271j(bnj0Var2 != null ? bnj0Var2.f28850M0 : null, lp70Var)) {
            lp70Var.f135676d1.f179937p.f130322V0.m85097j();
            return;
        }
        wb3 wb3VarMo49589e = lp70Var.f135676d1.f179937p.mo49589e();
        if (wb3VarMo49589e == null || (mp70Var = ((l6d0) wb3VarMo49589e).f130322V0) == null) {
            return;
        }
        mp70Var.m85097j();
    }

    /* JADX INFO: renamed from: A0 */
    public final a3b0 m34815A0() {
        a3b0 a3b0Var = this.f44840f;
        if (a3b0Var != null) {
            return a3b0Var;
        }
        a3b0 a3b0Var2 = new a3b0(this);
        this.f44840f = a3b0Var2;
        return a3b0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public final void m34816E0(dqi0 dqi0Var) {
        lp70 lp70Var;
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
                    if ((255 & j) < 128 && (lp70Var = (lp70) ((yjd1) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo34819a0()) {
                            lp70Var.m59617S(false);
                        } else {
                            lp70Var.m59618U(false);
                        }
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

    @Override // p204p.o6d0
    /* JADX INFO: renamed from: G */
    public final n6d0 mo34817G(int i, int i2, Map map, gh00 gh00Var, gh00 gh00Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mt40.m62791c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new c3b0(i, i2, map, gh00Var, gh00Var2, this);
    }

    /* JADX INFO: renamed from: H0 */
    public abstract void mo29999H0();

    @Override // p204p.t5o0
    /* JADX INFO: renamed from: R */
    public final int mo34818R(pb3 pb3Var) {
        int iMo34822j0;
        if (mo30037r0() && (iMo34822j0 = mo34822j0(pb3Var)) != Integer.MIN_VALUE) {
            return iMo34822j0 + ((int) (pb3Var instanceof qfb1 ? this.f217326e >> 32 : this.f217326e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // p204p.rj50
    /* JADX INFO: renamed from: a0 */
    public boolean mo34819a0() {
        return false;
    }

    @Override // p204p.s1i0
    /* JADX INFO: renamed from: h */
    public final void mo34820h(boolean z) {
        d3b0 d3b0VarMo30048y0 = mo30048y0();
        lp70 lp70VarMo30041u0 = d3b0VarMo30048y0 != null ? d3b0VarMo30048y0.mo30041u0() : null;
        if (wj50.m88271j(lp70VarMo30041u0, mo30041u0())) {
            this.f44843i = z;
            return;
        }
        if ((lp70VarMo30041u0 != null ? lp70VarMo30041u0.f135676d1.f179925d : 0) != 3) {
            if ((lp70VarMo30041u0 != null ? lp70VarMo30041u0.f135676d1.f179925d : 0) != 4) {
                return;
            }
        }
        this.f44843i = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final void m34821i0(lp70 lp70Var, dux0 dux0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        cqi0 cqi0Var = this.f44836L0;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (cqi0Var != null) {
            Object[] objArr = cqi0Var.f40898c;
            long[] jArr3 = cqi0Var.f40896a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                dqi0 dqi0Var = (dqi0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = dqi0Var.f52019b;
                                long[] jArr4 = dqi0Var.f52018a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    lp70 lp70Var2 = (lp70) ((yjd1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (lp70Var2 != null) {
                                                        boolean zM59606H = lp70Var2.m59606H();
                                                        i4 = i8;
                                                        if (zM59606H) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    dqi0Var.m36654m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        cqi0 cqi0Var2 = this.f44836L0;
        if (cqi0Var2 != null) {
            long[] jArr5 = cqi0Var2.f40896a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((dqi0) cqi0Var2.f40898c[i18]).m36648g()) {
                                    cqi0Var2.m33628l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        cqi0 cqi0Var3 = this.f44836L0;
        if (cqi0Var3 == null) {
            cqi0Var3 = new cqi0();
            this.f44836L0 = cqi0Var3;
        }
        Object objM33623g = cqi0Var3.m33623g(dux0Var);
        if (objM33623g == null) {
            objM33623g = new dqi0();
            cqi0Var3.m33629m(dux0Var, objM33623g);
        }
        ((dqi0) objM33623g).m36651j(new yjd1(lp70Var));
    }

    /* JADX INFO: renamed from: j0 */
    public abstract int mo34822j0(pb3 pb3Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m34823k0(v5o0 v5o0Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        lp70 lp70Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        j2m0 snapshotObserver;
        cqi0 cqi0Var = this.f44836L0;
        bg30 bg30Var = this.f44839Z;
        if (bg30Var == null) {
            bg30Var = new bg30();
            this.f44839Z = bg30Var;
        }
        bg30 bg30Var2 = bg30Var;
        g2m0 g2m0Var = mo30041u0().f135652M0;
        if (g2m0Var != null && (snapshotObserver = ((oz3) g2m0Var).getSnapshotObserver()) != null) {
            snapshotObserver.f108103a.m61344d(v5o0Var, gpa0.f83124Q0, new b3b0(this, j, j2, v5o0Var));
        }
        boolean zMo34819a0 = mo34819a0();
        dqi0 dqi0Var = (dqi0) bg30Var2.f26824e;
        dqi0 dqi0Var2 = (dqi0) bg30Var2.f26825f;
        int i2 = bg30Var2.f26820a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) bg30Var2.f26823d)[i3];
            if (b == 3) {
                dux0 dux0Var = ((dux0[]) bg30Var2.f26821b)[i3];
                wj50.m88279p(dux0Var);
                dqi0Var2.m36651j(dux0Var);
            } else if (b != 0 && cqi0Var != null) {
                dux0 dux0Var2 = ((dux0[]) bg30Var2.f26821b)[i3];
                wj50.m88279p(dux0Var2);
                dqi0 dqi0Var3 = (dqi0) cqi0Var.m33627k(dux0Var2);
                if (dqi0Var3 != null) {
                    dqi0Var.m36652k(dqi0Var3);
                }
            }
        }
        int i4 = bg30Var2.f26820a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) bg30Var2.f26823d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                dux0[] dux0VarArr = (dux0[]) bg30Var2.f26821b;
                dux0VarArr[i6 - i5] = dux0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = bg30Var2.f26820a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((dux0[]) bg30Var2.f26821b)[i8] = null;
        }
        bg30Var2.f26820a -= i5;
        d3b0 d3b0VarMo30048y0 = mo30048y0();
        Object[] objArr = dqi0Var2.f52019b;
        long[] jArr = dqi0Var2.f52018a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            dux0 dux0Var3 = (dux0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            d3b0 d3b0Var = d3b0VarMo30048y0 == null ? this : d3b0VarMo30048y0;
                            i = i9;
                            d3b0 d3b0Var2 = d3b0Var;
                            while (true) {
                                bg30 bg30Var3 = d3b0Var2.f44839Z;
                                if (bg30Var3 != null) {
                                    z2 = zMo34819a0;
                                    if (bk5.m29621l0((dux0[]) bg30Var3.f26821b, dux0Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zMo34819a0;
                                d3b0 d3b0VarMo30048y1 = d3b0Var2.mo30048y0();
                                if (d3b0VarMo30048y1 == null) {
                                    break;
                                }
                                d3b0Var2 = d3b0VarMo30048y1;
                                zMo34819a0 = z2;
                            }
                            cqi0 cqi0Var2 = d3b0Var2.f44836L0;
                            dqi0 dqi0Var4 = cqi0Var2 != null ? (dqi0) cqi0Var2.m33627k(dux0Var3) : null;
                            if (dqi0Var4 != null) {
                                d3b0Var.m34816E0(dqi0Var4);
                            }
                        } else {
                            z2 = zMo34819a0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo34819a0 = z2;
                    }
                    z = zMo34819a0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo34819a0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo34819a0 = z;
                i9 = 8;
            }
        } else {
            z = zMo34819a0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        dqi0Var2.m36643b();
        Object[] objArr2 = dqi0Var.f52019b;
        long[] jArr2 = dqi0Var.f52018a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (lp70Var = (lp70) ((yjd1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                lp70Var.m59617S(false);
                            } else {
                                lp70Var.m59618U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        dqi0Var.m36643b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0056 A[EDGE_INSN: B:47:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    /* JADX INFO: renamed from: m0 */
    public final void m34824m0(n6d0 n6d0Var) {
        long j;
        long j2;
        cqi0 cqi0Var = this.f44836L0;
        if (!this.f44837X) {
            gh00 gh00VarMo31376e = n6d0Var.mo31376e();
            if (gh00VarMo31376e != null) {
                boolean z = this.f44841g != gh00VarMo31376e;
                if (z || !m34815A0().f11910a) {
                    j = 9223372034707292159L;
                    j2 = 0;
                } else {
                    jo70 jo70VarMo30034o0 = mo30034o0();
                    long jM45518N = grl0.m45518N(pwg1.m71290y(jo70VarMo30034o0));
                    long jMo30018b = jo70VarMo30034o0.mo30018b();
                    j = jM45518N;
                    j2 = jMo30018b;
                    z = (y350.m92729b(jM45518N, m34815A0().f11911b) && g450.m43520b(jMo30018b, m34815A0().f11912c)) ? false : true;
                }
                if (z) {
                    v5o0 v5o0Var = this.f44842h;
                    if (v5o0Var != null) {
                        v5o0Var.f237541a = n6d0Var;
                    } else {
                        v5o0Var = new v5o0(n6d0Var, this);
                        this.f44842h = v5o0Var;
                    }
                    m34823k0(v5o0Var, j, j2);
                    this.f44841g = n6d0Var.mo31376e();
                }
            } else if (cqi0Var != null) {
                Object[] objArr = cqi0Var.f40898c;
                long[] jArr = cqi0Var.f40896a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    m34816E0((dqi0) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
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
    }

    /* JADX INFO: renamed from: n0 */
    public abstract d3b0 mo30031n0();

    /* JADX INFO: renamed from: o0 */
    public abstract jo70 mo30034o0();

    /* JADX INFO: renamed from: r0 */
    public abstract boolean mo30037r0();

    /* JADX INFO: renamed from: u0 */
    public abstract lp70 mo30041u0();

    /* JADX INFO: renamed from: v0 */
    public abstract n6d0 mo30043v0();

    /* JADX INFO: renamed from: y0 */
    public abstract d3b0 mo30048y0();

    /* JADX INFO: renamed from: z0 */
    public abstract long mo30050z0();
}
