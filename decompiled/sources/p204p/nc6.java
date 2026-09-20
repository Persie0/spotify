package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nc6 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152439a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f152440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f152441c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f152442d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f152443e;

    public nc6(niz nizVar, e3p e3pVar, String str, int i) {
        this.f152441c = nizVar;
        this.f152442d = e3pVar;
        this.f152443e = str;
        this.f152440b = i;
    }

    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        n2p n2pVar;
        Object obj2;
        niz nizVar;
        int i;
        int i2;
        niz nizVar2;
        s6x0 s6x0Var;
        switch (this.f152439a) {
            case 0:
                yk91 yk91Var = (yk91) obj;
                nlv0 nlv0Var = (nlv0) this.f152442d;
                int iIntValue = ((Number) yk91Var.f273650a).intValue();
                boolean zBooleanValue = ((Boolean) yk91Var.f273651b).booleanValue();
                int iIntValue2 = ((Number) yk91Var.f273652c).intValue();
                plv0 plv0Var = (plv0) this.f152441c;
                if (iIntValue != plv0Var.f178796a) {
                    plv0Var.f178796a = iIntValue;
                    nlv0Var.f155174a = false;
                }
                if (!nlv0Var.f155174a && iIntValue != 0 && iIntValue2 >= 0 && zBooleanValue && iIntValue2 + this.f152440b >= iIntValue - 1) {
                    ((eh00) this.f152443e).invoke();
                    nlv0Var.f155174a = true;
                }
                return w2a1.f247311a;
            default:
                e3p e3pVar = (e3p) this.f152442d;
                if (fbkVar instanceof n2p) {
                    n2pVar = (n2p) fbkVar;
                    int i3 = n2pVar.f149806b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        n2pVar.f149806b = i3 - Integer.MIN_VALUE;
                    } else {
                        n2pVar = new n2p(this, fbkVar);
                    }
                } else {
                    n2pVar = new n2p(this, fbkVar);
                }
                Object objM31894r = n2pVar.f149805a;
                int i4 = n2pVar.f149806b;
                yuk yukVar = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        int i5 = n2pVar.f149810f;
                        int i6 = n2pVar.f149808d;
                        nizVar = n2pVar.f149807c;
                        bga.m29073P(objM31894r);
                        Object obj3 = ((s6x0) objM31894r).f206218a;
                        i2 = i5;
                        i = i6;
                        obj2 = obj3;
                    } else if (i4 == 2) {
                        i = n2pVar.f149808d;
                        nizVar2 = n2pVar.f149807c;
                        bga.m29073P(objM31894r);
                        obj2 = (rvc) objM31894r;
                        nizVar = nizVar2;
                        s6x0Var = new s6x0(obj2);
                        n2pVar.f149807c = null;
                        n2pVar.f149808d = i;
                        n2pVar.f149806b = 3;
                        if (nizVar.emit(s6x0Var, n2pVar) == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM31894r);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM31894r);
                niz nizVar3 = (niz) this.f152441c;
                String str = (String) this.f152443e;
                n2pVar.f149807c = nizVar3;
                n2pVar.f149808d = 0;
                n2pVar.f149810f = 0;
                n2pVar.f149806b = 1;
                Object objM37653a = e3p.m37653a(e3pVar, str, this.f152440b, n2pVar);
                if (objM37653a == yukVar) {
                    return yukVar;
                }
                obj2 = objM37653a;
                nizVar = nizVar3;
                i = 0;
                i2 = 0;
                if (!(obj2 instanceof c6x0)) {
                    c97 c97Var = e3pVar.f55840a;
                    n2pVar.f149807c = nizVar;
                    n2pVar.f149808d = i;
                    n2pVar.f149810f = i2;
                    n2pVar.f149806b = 2;
                    objM31894r = c97Var.m31894r((rvc) obj2, false, n2pVar);
                    if (objM31894r == yukVar) {
                        return yukVar;
                    }
                    nizVar2 = nizVar;
                    obj2 = (rvc) objM31894r;
                    nizVar = nizVar2;
                }
                s6x0Var = new s6x0(obj2);
                n2pVar.f149807c = null;
                n2pVar.f149808d = i;
                n2pVar.f149806b = 3;
                if (nizVar.emit(s6x0Var, n2pVar) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
        }
    }

    public nc6(plv0 plv0Var, nlv0 nlv0Var, int i, eh00 eh00Var) {
        this.f152441c = plv0Var;
        this.f152442d = nlv0Var;
        this.f152440b = i;
        this.f152443e = eh00Var;
    }
}
