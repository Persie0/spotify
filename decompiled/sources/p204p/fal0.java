package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fal0 {

    /* JADX INFO: renamed from: a */
    public final v9l0 f67578a;

    /* JADX INFO: renamed from: b */
    public final vf91 f67579b;

    /* JADX INFO: renamed from: c */
    public final xre f67580c;

    /* JADX INFO: renamed from: d */
    public final nc4 f67581d;

    /* JADX INFO: renamed from: e */
    public final vmz f67582e;

    public fal0(v9l0 v9l0Var, vf91 vf91Var, xre xreVar, nc4 nc4Var, vmz vmzVar) {
        this.f67578a = v9l0Var;
        this.f67579b = vf91Var;
        this.f67580c = xreVar;
        this.f67581d = nc4Var;
        this.f67582e = vmzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m41181a(ibk ibkVar) {
        x9l0 x9l0Var;
        if (ibkVar instanceof x9l0) {
            x9l0Var = (x9l0) ibkVar;
            int i = x9l0Var.f259398c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9l0Var.f259398c = i - Integer.MIN_VALUE;
            } else {
                x9l0Var = new x9l0(this, ibkVar);
            }
        } else {
            x9l0Var = new x9l0(this, ibkVar);
        }
        Object objM76981v = x9l0Var.f259396a;
        int i2 = x9l0Var.f259398c;
        if (i2 == 0) {
            bga.m29073P(objM76981v);
            hvi0 hvi0Var = cks.f39079b;
            long jM54450E = jwg1.m54450E(10L, ils.SECONDS);
            l2i0 l2i0Var = new l2i0(this, null, 17);
            x9l0Var.f259398c = 1;
            objM76981v = s1h1.m76981v(jM54450E, l2i0Var, x9l0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76981v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76981v);
        }
        Boolean bool = (Boolean) objM76981v;
        return qyg1.m74178H(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3 A[PHI: r11
      0x00b3: PHI (r11v18 java.lang.Object) = (r11v17 java.lang.Object), (r11v1 java.lang.Object) binds: [B:47:0x00b0, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r11 == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        if (r11 == r8) goto L53;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41182b(ibk ibkVar) {
        z9l0 z9l0Var;
        pg91 pg91Var;
        if (ibkVar instanceof z9l0) {
            z9l0Var = (z9l0) ibkVar;
            int i = z9l0Var.f280827c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9l0Var.f280827c = i - Integer.MIN_VALUE;
            } else {
                z9l0Var = new z9l0(this, ibkVar);
            }
        } else {
            z9l0Var = new z9l0(this, ibkVar);
        }
        Object objM56317g = z9l0Var.f280825a;
        int i2 = z9l0Var.f280827c;
        boolean z = false;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56317g);
            nc4 nc4Var = this.f67581d;
            boolean zM64111c = nc4Var.m64111c();
            vf91 vf91Var = this.f67579b;
            if (zM64111c) {
                z9l0Var.f280827c = 1;
                objM56317g = ((kg91) vf91Var).m56317g(z9l0Var);
                if (objM56317g != obj) {
                    pg91Var = (pg91) objM56317g;
                    if (pg91Var.m69871c()) {
                        fiz fizVarM41188h = m41188h();
                        z9l0Var.f280827c = 2;
                        objM56317g = vyf1.m86755t(fizVarM41188h, z9l0Var);
                    }
                }
            } else if (nc4Var.m64113e() && nc4Var.m64109a()) {
                z9l0Var.f280827c = 3;
                objM56317g = ((kg91) vf91Var).m56317g(z9l0Var);
                if (objM56317g != obj) {
                    if (((pg91) objM56317g).m69871c()) {
                        z9l0Var.f280827c = 4;
                        objM56317g = m41186f(z9l0Var);
                        if (objM56317g != obj) {
                            if (!((Boolean) objM56317g).booleanValue()) {
                                fiz fizVarM41188h2 = m41188h();
                                z9l0Var.f280827c = 5;
                                objM56317g = vyf1.m86755t(fizVarM41188h2, z9l0Var);
                            }
                        }
                    }
                }
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM56317g);
            pg91Var = (pg91) objM56317g;
            if (pg91Var.m69871c() && !pg91Var.m69872d()) {
                fiz fizVarM41188h3 = m41188h();
                z9l0Var.f280827c = 2;
                objM56317g = vyf1.m86755t(fizVarM41188h3, z9l0Var);
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                bga.m29073P(objM56317g);
                if (((pg91) objM56317g).m69871c()) {
                    z9l0Var.f280827c = 4;
                    objM56317g = m41186f(z9l0Var);
                    if (objM56317g != obj) {
                        if (!((Boolean) objM56317g).booleanValue()) {
                            fiz fizVarM41188h4 = m41188h();
                            z9l0Var.f280827c = 5;
                            objM56317g = vyf1.m86755t(fizVarM41188h4, z9l0Var);
                        }
                    }
                    return obj;
                }
            } else if (i2 == 4) {
                bga.m29073P(objM56317g);
                if (!((Boolean) objM56317g).booleanValue()) {
                    fiz fizVarM41188h5 = m41188h();
                    z9l0Var.f280827c = 5;
                    objM56317g = vyf1.m86755t(fizVarM41188h5, z9l0Var);
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56317g);
            }
            if (!((Boolean) objM56317g).booleanValue()) {
                z = true;
            }
        } else {
            bga.m29073P(objM56317g);
        }
        if (!((Boolean) objM56317g).booleanValue()) {
            z = true;
        }
        return qyg1.m74178H(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m41183c(ibk ibkVar) {
        aal0 aal0Var;
        Object objM84970a;
        if (ibkVar instanceof aal0) {
            aal0Var = (aal0) ibkVar;
            int i = aal0Var.f13895c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aal0Var.f13895c = i - Integer.MIN_VALUE;
            } else {
                aal0Var = new aal0(this, ibkVar);
            }
        } else {
            aal0Var = new aal0(this, ibkVar);
        }
        Object obj = aal0Var.f13893a;
        int i2 = aal0Var.f13895c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (m41189i()) {
                aal0Var.f13895c = 1;
                objM84970a = this.f67578a.m84970a(aal0Var);
                if (objM84970a != yukVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        objM84970a = ((s6x0) obj).f206218a;
        if (objM84970a instanceof c6x0) {
            objM84970a = null;
        }
        qg91 qg91Var = (qg91) objM84970a;
        pg91 pg91Var = new pg91(qg91Var != null ? qg91Var.m72732b() : null, qg91Var != null ? qg91Var.m72733c() : null, qg91Var != null ? qg91Var.m72734d() : false, qg91Var != null ? qg91Var.m72731a() : false);
        aal0Var.f13895c = 2;
        return ((kg91) this.f67579b).m56323m(pg91Var, aal0Var) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX INFO: renamed from: d */
    public final long m41184d() {
        ((wy3) this.f67580c).getClass();
        z050 z050VarM95040p6 = z050.m95040p6(System.currentTimeMillis());
        gze1 gze1VarM46199p = gze1.m46199p();
        z050VarM95040p6.getClass();
        return pze1.m71734n6(z050VarM95040p6, gze1VarM46199p).f183683d.f131611d.toEpochDay();
    }

    /* JADX INFO: renamed from: e */
    public final fiz m41185e() {
        nc4 nc4Var = this.f67581d;
        boolean zM64111c = nc4Var.m64111c();
        fbk fbkVar = null;
        vmz vmzVar = this.f67582e;
        vf91 vf91Var = this.f67579b;
        if (zM64111c) {
            kg91 kg91Var = (kg91) vf91Var;
            return oyf1.m68486s(mvl0.m62953p(g0g1.m43299d(kyf1.m57709n(bzf1.m31020l(kg91Var.f122341d), new zf91(kg91Var, fbkVar, 1)), jsf1.m54238k(vmzVar), new jp0(this))), new th80(19));
        }
        if (!nc4Var.m64113e()) {
            return nxf1.m65834m(hcc0.f89751a);
        }
        kg91 kg91Var2 = (kg91) vf91Var;
        return oyf1.m68486s(mvl0.m62953p(g0g1.m43302g(kyf1.m57709n(bzf1.m31020l(kg91Var2.f122341d), new zf91(kg91Var2, fbkVar, 1)), new xif0(24, kyf1.m57709n(bzf1.m31020l(kg91Var2.f122342e), new zf91(kg91Var2, fbkVar, 0)), this), jsf1.m54238k(vmzVar), new C1898gi(this))), new th80(20));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m41186f(ibk ibkVar) {
        bal0 bal0Var;
        fal0 fal0Var;
        if (ibkVar instanceof bal0) {
            bal0Var = (bal0) ibkVar;
            int i = bal0Var.f25239d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bal0Var.f25239d = i - Integer.MIN_VALUE;
            } else {
                bal0Var = new bal0(this, ibkVar);
            }
        } else {
            bal0Var = new bal0(this, ibkVar);
        }
        Object objM56314c = bal0Var.f25237b;
        int i2 = bal0Var.f25239d;
        if (i2 == 0) {
            bga.m29073P(objM56314c);
            bal0Var.f25236a = this;
            bal0Var.f25239d = 1;
            objM56314c = ((kg91) this.f67579b).m56314c(bal0Var);
            yuk yukVar = yuk.f276404a;
            if (objM56314c == yukVar) {
                return yukVar;
            }
            fal0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fal0Var = bal0Var.f25236a;
            bga.m29073P(objM56314c);
        }
        return qyg1.m74178H(fal0Var.m41187g((List) objM56314c));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m41187g(List list) {
        long jM41184d = m41184d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() < jM41184d) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        nc4 nc4Var = this.f67581d;
        if (size >= nc4Var.m64116h()) {
            return false;
        }
        return arrayList.isEmpty() || jM41184d <= ((Number) g6f.m43741q0(arrayList)).longValue() + ((long) nc4Var.m64117i());
    }

    /* JADX INFO: renamed from: h */
    public final fiz m41188h() {
        return m41189i() ? (fiz) new vvk0(this, 8).invoke() : nxf1.m65834m(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m41189i() {
        nc4 nc4Var = this.f67581d;
        return nc4Var.m64111c() || nc4Var.m64113e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m41190j(ibk ibkVar) {
        eal0 eal0Var;
        if (ibkVar instanceof eal0) {
            eal0Var = (eal0) ibkVar;
            int i = eal0Var.f57698c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eal0Var.f57698c = i - Integer.MIN_VALUE;
            } else {
                eal0Var = new eal0(this, ibkVar);
            }
        } else {
            eal0Var = new eal0(this, ibkVar);
        }
        Object objM86757v = eal0Var.f57696a;
        int i2 = eal0Var.f57698c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            if (m41189i()) {
                fiz fizVarM41188h = m41188h();
                eal0Var.f57698c = 1;
                objM86757v = vyf1.m86757v(fizVarM41188h, eal0Var);
                if (objM86757v != yukVar) {
                }
                return yukVar;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
            return w2a1Var;
        }
        bga.m29073P(objM86757v);
        Boolean bool = (Boolean) objM86757v;
        if (bool != null ? bool.booleanValue() : false) {
            eal0Var.f57698c = 2;
            kg91 kg91Var = (kg91) this.f67579b;
            kg91Var.getClass();
            Object objM56323m = kg91Var.m56323m(new pg91(), eal0Var);
            if (objM56323m != yukVar) {
                objM56323m = w2a1Var;
            }
            if (objM56323m == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }
}
