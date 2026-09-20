package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class g6n0 implements kra0 {

    /* JADX INFO: renamed from: a */
    public final r55 f77072a;

    /* JADX INFO: renamed from: b */
    public final fiz f77073b;

    /* JADX INFO: renamed from: c */
    public final r3n0 f77074c;

    /* JADX INFO: renamed from: d */
    public final ik40 f77075d;

    /* JADX INFO: renamed from: e */
    public final s2y0 f77076e;

    /* JADX INFO: renamed from: f */
    public final n95 f77077f;

    /* JADX INFO: renamed from: g */
    public final z83 f77078g;

    /* JADX INFO: renamed from: h */
    public final C1668ai f77079h;

    /* JADX INFO: renamed from: i */
    public final mc7 f77080i;

    /* JADX INFO: renamed from: j */
    public final i6n0 f77081j;

    /* JADX INFO: renamed from: k */
    public final luk f77082k;

    /* JADX INFO: renamed from: l */
    public final luk f77083l;

    /* JADX INFO: renamed from: m */
    public c9k f77084m;

    public g6n0(r55 r55Var, fiz fizVar, r3n0 r3n0Var, ik40 ik40Var, s2y0 s2y0Var, n95 n95Var, z83 z83Var, C1668ai c1668ai, mc7 mc7Var, i6n0 i6n0Var, luk lukVar, luk lukVar2) {
        this.f77072a = r55Var;
        this.f77073b = fizVar;
        this.f77074c = r3n0Var;
        this.f77075d = ik40Var;
        this.f77076e = s2y0Var;
        this.f77077f = n95Var;
        this.f77078g = z83Var;
        this.f77079h = c1668ai;
        this.f77080i = mc7Var;
        this.f77081j = i6n0Var;
        this.f77082k = lukVar;
        this.f77083l = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[PHI: r9
      0x0090: PHI (r9v11 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:24:0x008c, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[PHI: r9
      0x00a5: PHI (r9v16 java.lang.Object) = (r9v15 java.lang.Object), (r9v1 java.lang.Object) binds: [B:30:0x00a2, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[PHI: r9
      0x00d7: PHI (r9v23 java.lang.Object) = (r9v21 java.lang.Object), (r9v1 java.lang.Object) binds: [B:41:0x00d4, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m43759c(g6n0 g6n0Var, ibk ibkVar) throws Throwable {
        e6n0 e6n0Var;
        Object objM89557A;
        Object objM89557A2;
        luk lukVar = g6n0Var.f77082k;
        if (ibkVar instanceof e6n0) {
            e6n0Var = (e6n0) ibkVar;
            int i = e6n0Var.f56672c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e6n0Var.f56672c = i - Integer.MIN_VALUE;
            } else {
                e6n0Var = new e6n0(g6n0Var, ibkVar);
            }
        } else {
            e6n0Var = new e6n0(g6n0Var, ibkVar);
        }
        Object objM86756u = e6n0Var.f56670a;
        int i2 = e6n0Var.f56672c;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        switch (i2) {
            case 0:
                bga.m29073P(objM86756u);
                fiz fizVar = g6n0Var.f77073b;
                f6n0 f6n0Var = new f6n0(0);
                e6n0Var.f56672c = 1;
                objM86756u = vyf1.m86756u(fizVar, f6n0Var, e6n0Var);
                if (objM86756u != yukVar) {
                    String str = ((e301) objM86756u).f55571a;
                    s2y0 s2y0Var = g6n0Var.f77076e;
                    s2y0Var.f205098c = xul0.m92201d(s2y0Var.f205096a.mo35842b(s2y0Var.f205097b, str));
                    y83 y83Var = (y83) g6n0Var.f77078g;
                    y83Var.f270185c = y83Var.f270183a.mo35842b(y83Var.f270184b, str);
                    Single singleM74691l = g6n0Var.f77074c.m74691l();
                    e6n0Var.f56672c = 2;
                    objM86756u = zn91.m96567o(singleM74691l, e6n0Var);
                    if (objM86756u != yukVar) {
                        if (((Boolean) objM86756u).booleanValue()) {
                            mc7 mc7Var = g6n0Var.f77080i;
                            e6n0Var.f56672c = 3;
                            objM86756u = mc7Var.m61453q(e6n0Var);
                            if (objM86756u != yukVar) {
                                if (((Boolean) objM86756u).booleanValue()) {
                                    bya0 bya0Var = new bya0(g6n0Var, fbkVar, 12);
                                    e6n0Var.f56672c = 4;
                                    objM89557A = x0h1.m89557A(lukVar, new d2n0(g6n0Var, bya0Var, (fbk) null), e6n0Var);
                                    if (objM89557A != yukVar) {
                                        objM89557A = w2a1Var;
                                    }
                                    if (objM89557A != yukVar) {
                                    }
                                } else {
                                    Single singleM50907I = g6n0Var.f77075d.m50907I();
                                    e6n0Var.f56672c = 5;
                                    objM86756u = zn91.m96567o(singleM50907I, e6n0Var);
                                    if (objM86756u != yukVar) {
                                        if (((Boolean) objM86756u).booleanValue()) {
                                            aqh aqhVar = new aqh(g6n0Var, fbkVar, 12);
                                            e6n0Var.f56672c = 6;
                                            objM89557A2 = x0h1.m89557A(lukVar, new d2n0(g6n0Var, aqhVar, (fbk) null), e6n0Var);
                                            if (objM89557A2 != yukVar) {
                                                objM89557A2 = w2a1Var;
                                            }
                                            if (objM89557A2 == yukVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 1:
                bga.m29073P(objM86756u);
                String str2 = ((e301) objM86756u).f55571a;
                s2y0 s2y0Var2 = g6n0Var.f77076e;
                s2y0Var2.f205098c = xul0.m92201d(s2y0Var2.f205096a.mo35842b(s2y0Var2.f205097b, str2));
                y83 y83Var2 = (y83) g6n0Var.f77078g;
                y83Var2.f270185c = y83Var2.f270183a.mo35842b(y83Var2.f270184b, str2);
                Single singleM74691l2 = g6n0Var.f77074c.m74691l();
                e6n0Var.f56672c = 2;
                objM86756u = zn91.m96567o(singleM74691l2, e6n0Var);
                if (objM86756u != yukVar) {
                    if (((Boolean) objM86756u).booleanValue()) {
                        mc7 mc7Var2 = g6n0Var.f77080i;
                        e6n0Var.f56672c = 3;
                        objM86756u = mc7Var2.m61453q(e6n0Var);
                        if (objM86756u != yukVar) {
                            if (((Boolean) objM86756u).booleanValue()) {
                                bya0 bya0Var2 = new bya0(g6n0Var, fbkVar, 12);
                                e6n0Var.f56672c = 4;
                                objM89557A = x0h1.m89557A(lukVar, new d2n0(g6n0Var, bya0Var2, (fbk) null), e6n0Var);
                                if (objM89557A != yukVar) {
                                    objM89557A = w2a1Var;
                                }
                                if (objM89557A != yukVar) {
                                }
                            } else {
                                Single singleM50907I2 = g6n0Var.f77075d.m50907I();
                                e6n0Var.f56672c = 5;
                                objM86756u = zn91.m96567o(singleM50907I2, e6n0Var);
                                if (objM86756u != yukVar) {
                                    if (((Boolean) objM86756u).booleanValue()) {
                                        aqh aqhVar2 = new aqh(g6n0Var, fbkVar, 12);
                                        e6n0Var.f56672c = 6;
                                        objM89557A2 = x0h1.m89557A(lukVar, new d2n0(g6n0Var, aqhVar2, (fbk) null), e6n0Var);
                                        if (objM89557A2 != yukVar) {
                                            objM89557A2 = w2a1Var;
                                        }
                                        if (objM89557A2 == yukVar) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return w2a1Var;
                }
                return yukVar;
            case 2:
                bga.m29073P(objM86756u);
                if (((Boolean) objM86756u).booleanValue()) {
                    mc7 mc7Var3 = g6n0Var.f77080i;
                    e6n0Var.f56672c = 3;
                    objM86756u = mc7Var3.m61453q(e6n0Var);
                    if (objM86756u != yukVar) {
                        if (((Boolean) objM86756u).booleanValue()) {
                            bya0 bya0Var3 = new bya0(g6n0Var, fbkVar, 12);
                            e6n0Var.f56672c = 4;
                            objM89557A = x0h1.m89557A(lukVar, new d2n0(g6n0Var, bya0Var3, (fbk) null), e6n0Var);
                            if (objM89557A != yukVar) {
                                objM89557A = w2a1Var;
                            }
                            if (objM89557A != yukVar) {
                            }
                        } else {
                            Single singleM50907I3 = g6n0Var.f77075d.m50907I();
                            e6n0Var.f56672c = 5;
                            objM86756u = zn91.m96567o(singleM50907I3, e6n0Var);
                            if (objM86756u != yukVar) {
                                if (((Boolean) objM86756u).booleanValue()) {
                                    aqh aqhVar3 = new aqh(g6n0Var, fbkVar, 12);
                                    e6n0Var.f56672c = 6;
                                    objM89557A2 = x0h1.m89557A(lukVar, new d2n0(g6n0Var, aqhVar3, (fbk) null), e6n0Var);
                                    if (objM89557A2 != yukVar) {
                                        objM89557A2 = w2a1Var;
                                    }
                                    if (objM89557A2 == yukVar) {
                                    }
                                }
                            }
                        }
                    }
                    return yukVar;
                }
                return w2a1Var;
            case 3:
                bga.m29073P(objM86756u);
                if (((Boolean) objM86756u).booleanValue()) {
                    bya0 bya0Var4 = new bya0(g6n0Var, fbkVar, 12);
                    e6n0Var.f56672c = 4;
                    objM89557A = x0h1.m89557A(lukVar, new d2n0(g6n0Var, bya0Var4, (fbk) null), e6n0Var);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                    if (objM89557A != yukVar) {
                        return w2a1Var;
                    }
                } else {
                    Single singleM50907I4 = g6n0Var.f77075d.m50907I();
                    e6n0Var.f56672c = 5;
                    objM86756u = zn91.m96567o(singleM50907I4, e6n0Var);
                    if (objM86756u != yukVar) {
                        if (((Boolean) objM86756u).booleanValue()) {
                            aqh aqhVar4 = new aqh(g6n0Var, fbkVar, 12);
                            e6n0Var.f56672c = 6;
                            objM89557A2 = x0h1.m89557A(lukVar, new d2n0(g6n0Var, aqhVar4, (fbk) null), e6n0Var);
                            if (objM89557A2 != yukVar) {
                                objM89557A2 = w2a1Var;
                            }
                            if (objM89557A2 == yukVar) {
                            }
                        }
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 4:
                bga.m29073P(objM86756u);
                return w2a1Var;
            case 5:
                bga.m29073P(objM86756u);
                if (((Boolean) objM86756u).booleanValue()) {
                    aqh aqhVar5 = new aqh(g6n0Var, fbkVar, 12);
                    e6n0Var.f56672c = 6;
                    objM89557A2 = x0h1.m89557A(lukVar, new d2n0(g6n0Var, aqhVar5, (fbk) null), e6n0Var);
                    if (objM89557A2 != yukVar) {
                        objM89557A2 = w2a1Var;
                    }
                    if (objM89557A2 == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            case 6:
                bga.m29073P(objM86756u);
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: a */
    public final void mo43760a() {
        c9k c9kVar = this.f77084m;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        this.f77084m = null;
    }

    @Override // p204p.kra0
    /* JADX INFO: renamed from: b */
    public final void mo43761b() {
        c9k c9kVar = this.f77084m;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(njg1.m64613f(), this.f77083l));
        this.f77084m = c9kVarM56661c;
        x0h1.m89578u(c9kVarM56661c, null, 0, new onm0(this, (fbk) null, 2), 3);
    }
}
