package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes.dex */
public final class rtq extends ww41 implements rv41 {

    /* JADX INFO: renamed from: b */
    public final eh00 f202625b;

    /* JADX INFO: renamed from: c */
    public final cb31 f202626c;

    /* JADX INFO: renamed from: d */
    public qtq f202627d = new qtq(ua31.m82674j().mo28818g());

    public rtq(eh00 eh00Var, cb31 cb31Var) {
        this.f202625b = eh00Var;
        this.f202626c = cb31Var;
    }

    @Override // p204p.rv41
    public final Object getValue() {
        gh00 gh00VarMo28816e = lb5.m58609h().mo28816e();
        if (gh00VarMo28816e != null) {
            gh00VarMo28816e.invoke(this);
        }
        oa31 oa31VarM58609h = lb5.m58609h();
        return m76399v((qtq) ua31.m82673i(this.f202627d, oa31VarM58609h), oa31VarM58609h, true, this.f202625b).f192441f;
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f202627d;
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f202627d = (qtq) ax41Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        qtq qtqVar = (qtq) ua31.m82672h(this.f202627d);
        sb.append(qtqVar.m73848d(this, lb5.m58609h()) ? String.valueOf(qtqVar.f192441f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a3 A[EDGE_INSN: B:101:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #2 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:95:0x0023 }] */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.ptq] */
    /* JADX INFO: renamed from: v */
    public final qtq m76399v(qtq qtqVar, oa31 oa31Var, boolean z, eh00 eh00Var) {
        cb31 cb31Var;
        int i;
        qtq qtqVar2 = qtqVar;
        if (qtqVar2.m73848d(this, oa31Var)) {
            if (z) {
                qqi0 qqi0VarM77673l = sam.m77673l();
                Object[] objArr = qqi0VarM77673l.f191608a;
                int i2 = qqi0VarM77673l.f191610c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((stq) objArr[i3]).start();
                }
                try {
                    fpi0 fpi0Var = qtqVar2.f192440e;
                    ay21 ay21Var = eb31.f57802a;
                    d450 d450Var = (d450) ay21Var.m27471g();
                    if (d450Var == null) {
                        d450Var = new d450();
                        ay21Var.m27480p(d450Var);
                    }
                    int i4 = d450Var.f45087a;
                    Object[] objArr2 = fpi0Var.f71878b;
                    int[] iArr = fpi0Var.f71879c;
                    long[] jArr = fpi0Var.f71877a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        vw41 vw41Var = (vw41) objArr2[i9];
                                        d450Var.f45087a = i4 + iArr[i9];
                                        gh00 gh00VarMo28816e = oa31Var.mo28816e();
                                        if (gh00VarMo28816e != null) {
                                            gh00VarMo28816e.invoke(vw41Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    d450Var.f45087a = i4;
                } finally {
                    Object[] objArr3 = qqi0VarM77673l.f191608a;
                    int i10 = qqi0VarM77673l.f191610c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((stq) objArr3[i11]).mo55926a();
                    }
                }
            }
            return qtqVar2;
        }
        final fpi0 fpi0Var2 = new fpi0();
        ay21 ay21Var2 = eb31.f57802a;
        final d450 d450Var2 = (d450) ay21Var2.m27471g();
        if (d450Var2 == null) {
            d450Var2 = new d450();
            ay21Var2.m27480p(d450Var2);
        }
        final int i12 = d450Var2.f45087a;
        qqi0 qqi0VarM77673l2 = sam.m77673l();
        Object[] objArr4 = qqi0VarM77673l2.f191608a;
        int i13 = qqi0VarM77673l2.f191610c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((stq) objArr4[i14]).start();
        }
        try {
            d450Var2.f45087a = i12 + 1;
            Object objM58613l = lb5.m58613l(new gh00() { // from class: p.ptq
                @Override // p204p.gh00
                public final Object invoke(Object obj) {
                    if (obj == this.f181227a) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof vw41) {
                        int i15 = d450Var2.f45087a - i12;
                        fpi0 fpi0Var3 = fpi0Var2;
                        int iM42375d = fpi0Var3.m42375d(obj);
                        fpi0Var3.m42379h(Math.min(i15, iM42375d >= 0 ? fpi0Var3.f71879c[iM42375d] : Alert.DURATION_SHOW_INDEFINITELY), obj);
                    }
                    return w2a1.f247311a;
                }
            }, eh00Var);
            d450Var2.f45087a = i12;
            Object[] objArr5 = qqi0VarM77673l2.f191608a;
            int i15 = qqi0VarM77673l2.f191610c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((stq) objArr5[i16]).mo55926a();
            }
            Object obj = ua31.f228351c;
            synchronized (obj) {
                try {
                    oa31 oa31VarM58609h = lb5.m58609h();
                    Object obj2 = qtqVar2.f192441f;
                    if (obj2 == qtq.f192437h || (cb31Var = this.f202626c) == null || !cb31Var.mo32148p(objM58613l, obj2)) {
                        qtq qtqVar3 = this.f202627d;
                        synchronized (obj) {
                            ax41 ax41VarM82677m = ua31.m82677m(qtqVar3, this);
                            ax41VarM82677m.mo27359a(qtqVar3);
                            ax41VarM82677m.f20763a = oa31VarM58609h.mo28818g();
                            qtqVar2 = (qtq) ax41VarM82677m;
                            qtqVar2.f192440e = fpi0Var2;
                            qtqVar2.f192442g = qtqVar2.m73849e(this, oa31VarM58609h);
                            qtqVar2.f192441f = objM58613l;
                        }
                        return qtqVar2;
                    }
                    qtqVar2.f192440e = fpi0Var2;
                    qtqVar2.f192442g = qtqVar2.m73849e(this, oa31VarM58609h);
                } catch (Throwable th) {
                    throw th;
                }
            }
            d450 d450Var3 = (d450) eb31.f57802a.m27471g();
            if (d450Var3 == null || d450Var3.f45087a != 0) {
                return qtqVar2;
            }
            lb5.m58612k();
            synchronized (obj) {
                oa31 oa31VarM58609h2 = lb5.m58609h();
                qtqVar2.f192438c = oa31VarM58609h2.mo28818g();
                qtqVar2.f192439d = oa31VarM58609h2.mo28819h();
                return qtqVar2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = qqi0VarM77673l2.f191608a;
            int i17 = qqi0VarM77673l2.f191610c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((stq) objArr6[i18]).mo55926a();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final qtq m76400w() {
        oa31 oa31VarM58609h = lb5.m58609h();
        return m76399v((qtq) ua31.m82673i(this.f202627d, oa31VarM58609h), oa31VarM58609h, false, this.f202625b);
    }
}
