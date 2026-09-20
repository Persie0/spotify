package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dl21 implements ohl {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50105a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f50106b;

    /* JADX INFO: renamed from: c */
    public final Object f50107c;

    public dl21(dl21 dl21Var, jl21 jl21Var) {
        this.f50106b = dl21Var;
        this.f50107c = jl21Var;
    }

    @Override // p204p.ohl
    /* JADX INFO: renamed from: a */
    public final fiz mo34952a() {
        switch (this.f50105a) {
            case 0:
                return (fiz) ((dl21) this.f50106b).f50107c;
            default:
                return (fiz) this.f50107c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // p204p.ohl
    /* JADX INFO: renamed from: c */
    public final Object mo34953c(String str, String str2, js3 js3Var, fbk fbkVar) throws Throwable {
        cl21 cl21Var;
        j851 j851Var;
        js3 js3Var2;
        int i;
        int i2;
        switch (this.f50105a) {
            case 0:
                if (fbkVar instanceof cl21) {
                    cl21Var = (cl21) fbkVar;
                    int i3 = cl21Var.f39172c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cl21Var.f39172c = i3 - Integer.MIN_VALUE;
                    } else {
                        cl21Var = new cl21(this, (ibk) fbkVar);
                    }
                } else {
                    cl21Var = new cl21(this, (ibk) fbkVar);
                }
                Object objM53648b = cl21Var.f39170a;
                int i4 = cl21Var.f39172c;
                if (i4 == 0) {
                    bga.m29073P(objM53648b);
                    jl21 jl21Var = (jl21) this.f50107c;
                    qi2 qi2Var = new qi2(7, this, str, str2, js3Var, null);
                    cl21Var.f39172c = 1;
                    objM53648b = jl21Var.m53648b(str, qi2Var, cl21Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM53648b == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM53648b);
                }
                return Boolean.valueOf(!((Boolean) objM53648b).booleanValue());
            default:
                if (fbkVar instanceof j851) {
                    j851Var = (j851) fbkVar;
                    int i5 = j851Var.f109798e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j851Var.f109798e = i5 - Integer.MIN_VALUE;
                    } else {
                        j851Var = new j851(this, (ibk) fbkVar);
                    }
                } else {
                    j851Var = new j851(this, (ibk) fbkVar);
                }
                Object objM76980u = j851Var.f109796c;
                int i6 = j851Var.f109798e;
                fbk fbkVar2 = null;
                yuk yukVar2 = yuk.f276404a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        js3 js3Var3 = j851Var.f109794a;
                        bga.m29073P(objM76980u);
                        js3Var2 = js3Var3;
                    } else {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = j851Var.f109795b;
                        bga.m29073P(objM76980u);
                    }
                    i = i2;
                    return Boolean.valueOf(i != 0);
                }
                bga.m29073P(objM76980u);
                c851 c851Var = (c851) this.f50106b;
                nau nauVar = nau.f152117a;
                ((a951) c851Var).m25075e(new vgl(str, str2, null, new dhl(nauVar, nauVar), false));
                i851 i851Var = new i851(this, fbkVar2, 1);
                js3Var2 = js3Var;
                j851Var.f109794a = js3Var2;
                j851Var.f109798e = 1;
                objM76980u = s1h1.m76980u(2000L, i851Var, j851Var);
                if (objM76980u == yukVar2) {
                    return yukVar2;
                }
                i = ((nhl) objM76980u) != null ? 1 : 0;
                if (i != 0 && js3Var2 != null) {
                    j851Var.f109794a = null;
                    j851Var.f109795b = i;
                    j851Var.f109798e = 2;
                    if (js3Var2.invoke(j851Var) == yukVar2) {
                        return yukVar2;
                    }
                    i2 = i;
                    i = i2;
                }
                return Boolean.valueOf(i != 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.ohl
    /* JADX INFO: renamed from: d */
    public final Object mo34954d(String str, String str2, fbk fbkVar) {
        h851 h851Var;
        switch (this.f50105a) {
            case 0:
                return ((dl21) this.f50106b).mo34954d(str, str2, fbkVar);
            default:
                if (fbkVar instanceof h851) {
                    h851Var = (h851) fbkVar;
                    int i = h851Var.f88637c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h851Var.f88637c = i - Integer.MIN_VALUE;
                    } else {
                        h851Var = new h851(this, (ibk) fbkVar);
                    }
                } else {
                    h851Var = new h851(this, (ibk) fbkVar);
                }
                Object objM76980u = h851Var.f88635a;
                int i2 = h851Var.f88637c;
                if (i2 == 0) {
                    bga.m29073P(objM76980u);
                    ((a951) ((c851) this.f50106b)).m25075e(new ugl(str, str2, null));
                    i851 i851Var = new i851(this, null, 0);
                    h851Var.f88637c = 1;
                    objM76980u = s1h1.m76980u(2000L, i851Var, h851Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76980u);
                }
                return Boolean.valueOf(((nhl) objM76980u) != null);
        }
    }

    public dl21(c851 c851Var) {
        this.f50106b = c851Var;
        pqm0 pqm0VarM25077g = ((a951) c851Var).m25077g(nhl.class);
        this.f50107c = z8g1.m95590j(cyf1.m34381q((ck90) pqm0VarM25077g.f180350a, pqm0VarM25077g.f180351b));
    }
}
