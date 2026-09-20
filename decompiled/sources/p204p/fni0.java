package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class fni0 implements f7p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71302a = 0;

    /* JADX INFO: renamed from: b */
    public final ou8 f71303b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u190 f71304c;

    /* JADX INFO: renamed from: d */
    public final fiz f71305d;

    /* JADX INFO: renamed from: e */
    public final fiz f71306e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ml20 f71307f;

    public fni0(u190 u190Var, gni0 gni0Var) {
        this.f71304c = u190Var;
        this.f71307f = gni0Var;
        this.f71305d = new b7g0(u190Var.m82196b(), 4);
        this.f71306e = new b7g0(u190Var.m82196b(), 5);
        this.f71303b = u190Var.f225727h;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140 A[PHI: r1 r2 r5
      0x0140: PHI (r1v12 p.d850) = (r1v7 p.d850), (r1v15 p.d850) binds: [B:30:0x00da, B:57:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r2v22 boolean) = (r2v20 boolean), (r2v27 boolean) binds: [B:30:0x00da, B:57:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r5v8 boolean) = (r5v5 boolean), (r5v9 boolean) binds: [B:30:0x00da, B:57:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
    
        if (r7 == r12) goto L82;
     */
    @Override // p204p.f7p0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo40981a(d850 d850Var, fbk fbkVar) {
        eni0 eni0Var;
        yuk yukVar;
        ik41 ik41Var;
        boolean zBooleanValue;
        Object objM42226c;
        boolean z;
        boolean zBooleanValue2;
        qho qhoVarM25241r;
        oho ohoVar;
        cvb1 cvb1Var;
        int iOrdinal;
        boolean z2;
        Object objValueOf;
        d850 d850Var2;
        boolean z3;
        Object objM82200f;
        d850 d850Var3;
        boolean z4;
        Object objM59213a;
        boolean zBooleanValue3;
        Object obj;
        boolean z5;
        int i;
        boolean z6;
        int i2;
        Object objM81504c;
        boolean z7;
        lk41 lk41Var;
        boolean z8;
        Object obj2;
        mb80 mb80Var;
        kuf0 kuf0Var;
        boolean z9;
        api apiVarM77296c;
        boolean z10;
        d850 d850Var4 = d850Var;
        switch (this.f71302a) {
            case 0:
                if (fbkVar instanceof eni0) {
                    eni0Var = (eni0) fbkVar;
                    int i3 = eni0Var.f61167d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        eni0Var.f61167d = i3 - Integer.MIN_VALUE;
                    } else {
                        eni0Var = new eni0(this, (ibk) fbkVar);
                    }
                } else {
                    eni0Var = new eni0(this, (ibk) fbkVar);
                }
                Object objM82200f2 = eni0Var.f61165b;
                int i4 = eni0Var.f61167d;
                if (i4 == 0) {
                    bga.m29073P(objM82200f2);
                    eni0Var.f61164a = d850Var4;
                    eni0Var.f61167d = 1;
                    objM82200f2 = this.f71304c.m82200f(d850Var4, eni0Var);
                    yukVar = yuk.f276404a;
                    if (objM82200f2 != yukVar) {
                    }
                    Object obj3 = yukVar;
                    return obj3;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d850Var4 = eni0Var.f61164a;
                bga.m29073P(objM82200f2);
                Object obj4 = yukVar;
                Boolean bool = (Boolean) objM82200f2;
                boolean zBooleanValue4 = bool.booleanValue();
                obj4 = bool;
                if (zBooleanValue4) {
                    wek0.m87885d(((gni0) this.f71307f).f82719c, d850Var4.f46380a);
                    obj4 = bool;
                }
                Object obj5 = yukVar;
                return obj5;
            default:
                lk41 lk41Var2 = (lk41) this.f71307f;
                if (fbkVar instanceof ik41) {
                    ik41Var = (ik41) fbkVar;
                    int i5 = ik41Var.f103021t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ik41Var.f103021t = i5 - Integer.MIN_VALUE;
                    } else {
                        ik41Var = new ik41(this, (ibk) fbkVar);
                    }
                } else {
                    ik41Var = new ik41(this, (ibk) fbkVar);
                }
                Object objM59214b = ik41Var.f103019h;
                int i6 = ik41Var.f103021t;
                u190 u190Var = this.f71304c;
                Object obj6 = w2a1.f247311a;
                fbk fbkVar2 = null;
                Object obj7 = yuk.f276404a;
                switch (i6) {
                    case 0:
                        bga.m29073P(objM59214b);
                        ik41Var.f103012a = d850Var4;
                        ik41Var.f103021t = 1;
                        objM59214b = lk41.m59214b(lk41Var2, this, ik41Var);
                        if (objM59214b != obj7) {
                            zBooleanValue = ((Boolean) objM59214b).booleanValue();
                            ik41Var.f103012a = d850Var4;
                            ik41Var.f103015d = zBooleanValue;
                            ik41Var.f103021t = 2;
                            objM42226c = m42226c(ik41Var);
                            if (objM42226c != obj7) {
                                z = zBooleanValue;
                                objM59214b = objM42226c;
                                zBooleanValue2 = ((Boolean) objM59214b).booleanValue();
                                if (zBooleanValue2) {
                                    ik41Var.f103012a = d850Var4;
                                    ik41Var.f103015d = z;
                                    ik41Var.f103016e = zBooleanValue2;
                                    ik41Var.f103021t = 3;
                                    qhoVarM25241r = aag1.m25241r(lk41Var2.f134251b, lk41Var2.f134239M0, obj6);
                                    if (qhoVarM25241r instanceof oho) {
                                        ohoVar = (oho) qhoVarM25241r;
                                    } else {
                                        ohoVar = null;
                                    }
                                    if (ohoVar != null || (cvb1Var = (cvb1) ohoVar.f165512a) == null) {
                                        cvb1Var = cvb1.f42346a;
                                    }
                                    iOrdinal = cvb1Var.ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal == 1) {
                                            objValueOf = lk41Var2.m59215e(ik41Var);
                                        } else {
                                            if (iOrdinal != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            z2 = true;
                                        }
                                        if (objValueOf != obj7) {
                                            Object obj8 = objValueOf;
                                            d850Var2 = d850Var4;
                                            z3 = zBooleanValue2;
                                            objM59214b = obj8;
                                            if (((Boolean) objM59214b).booleanValue()) {
                                                ik41Var.f103012a = null;
                                                ik41Var.f103015d = z;
                                                ik41Var.f103016e = z3;
                                                ik41Var.f103021t = 4;
                                                objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                                if (objM59213a != obj7) {
                                                    return objM59213a;
                                                }
                                            } else {
                                                zBooleanValue2 = z3;
                                                d850Var4 = d850Var2;
                                                ik41Var.f103012a = d850Var4;
                                                ik41Var.f103015d = z;
                                                ik41Var.f103016e = zBooleanValue2;
                                                ik41Var.f103021t = 5;
                                                objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                                if (objM82200f != obj7) {
                                                    d850Var3 = d850Var4;
                                                    z4 = zBooleanValue2;
                                                    objM59214b = objM82200f;
                                                    zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                                    if (!zBooleanValue3 && z && z4) {
                                                        oge0 oge0Var = lk41Var2.f134254e;
                                                        ik41Var.f103012a = d850Var3;
                                                        ik41Var.f103013b = objM59214b;
                                                        ik41Var.f103014c = lk41Var2;
                                                        ik41Var.f103015d = z;
                                                        ik41Var.f103016e = z4;
                                                        ik41Var.f103017f = zBooleanValue3;
                                                        ik41Var.f103018g = 0;
                                                        ik41Var.f103021t = 6;
                                                        Object objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar2, 1), ik41Var);
                                                        if (objM56684z != obj7) {
                                                            obj = objM59214b;
                                                            objM59214b = objM56684z;
                                                            z5 = z;
                                                            z6 = z4;
                                                            i2 = 0;
                                                            if (((Boolean) objM59214b).booleanValue()) {
                                                                ik41Var.f103012a = null;
                                                                ik41Var.f103013b = obj;
                                                                ik41Var.f103014c = lk41Var2;
                                                                ik41Var.f103015d = z5;
                                                                ik41Var.f103016e = z6;
                                                                ik41Var.f103017f = zBooleanValue3;
                                                                ik41Var.f103018g = i2;
                                                                ik41Var.f103021t = 7;
                                                                objM81504c = lk41Var2.f134247X.m81504c(lk41Var2.f134253d, ltf0.f136771a, d850Var3, ik41Var);
                                                                if (objM81504c == obj7) {
                                                                    obj6 = objM81504c;
                                                                }
                                                            }
                                                            i = i2;
                                                            z7 = zBooleanValue3;
                                                            oge0 oge0Var2 = lk41Var2.f134254e;
                                                            ik41Var.f103012a = null;
                                                            ik41Var.f103013b = obj;
                                                            ik41Var.f103014c = lk41Var2;
                                                            ik41Var.f103015d = z5;
                                                            ik41Var.f103016e = z6;
                                                            ik41Var.f103017f = z7;
                                                            ik41Var.f103018g = i;
                                                            ik41Var.f103021t = 8;
                                                            objM59214b = kk40.m56684z(new cjf0(oge0Var2, fbkVar2, 0), ik41Var);
                                                            if (objM59214b != obj7) {
                                                                boolean z11 = z6;
                                                                lk41Var = lk41Var2;
                                                                z8 = z11;
                                                                obj2 = obj;
                                                                if (((Boolean) objM59214b).booleanValue()) {
                                                                    mb80Var = lk41Var.f134250a;
                                                                    kuf0Var = lk41Var.f134241O0;
                                                                    if (mb80Var.f141817b.current().getValue() != null) {
                                                                        z9 = true;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                    apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                                    if (apiVarM77296c != null) {
                                                                        z10 = !apiVarM77296c.mo26697m();
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                    if (z9) {
                                                                        kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                                    } else if (z10) {
                                                                        kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                                    }
                                                                }
                                                                Boolean bool2 = (Boolean) obj2;
                                                                bool2.getClass();
                                                                return bool2;
                                                            }
                                                        }
                                                    } else {
                                                        obj = objM59214b;
                                                        z5 = z;
                                                        i = 0;
                                                        z6 = z4;
                                                        z7 = zBooleanValue3;
                                                        oge0 oge0Var3 = lk41Var2.f134254e;
                                                        ik41Var.f103012a = null;
                                                        ik41Var.f103013b = obj;
                                                        ik41Var.f103014c = lk41Var2;
                                                        ik41Var.f103015d = z5;
                                                        ik41Var.f103016e = z6;
                                                        ik41Var.f103017f = z7;
                                                        ik41Var.f103018g = i;
                                                        ik41Var.f103021t = 8;
                                                        objM59214b = kk40.m56684z(new cjf0(oge0Var3, fbkVar2, 0), ik41Var);
                                                        if (objM59214b != obj7) {
                                                            boolean z12 = z6;
                                                            lk41Var = lk41Var2;
                                                            z8 = z12;
                                                            obj2 = obj;
                                                            if (((Boolean) objM59214b).booleanValue() && z7 && z8) {
                                                                mb80Var = lk41Var.f134250a;
                                                                kuf0Var = lk41Var.f134241O0;
                                                                if (mb80Var.f141817b.current().getValue() != null) {
                                                                    z9 = true;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                                if (apiVarM77296c != null) {
                                                                    z10 = !apiVarM77296c.mo26697m();
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                if (z9) {
                                                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                                } else if (z10) {
                                                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                                }
                                                            }
                                                            Boolean bool3 = (Boolean) obj2;
                                                            bool3.getClass();
                                                            return bool3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    objValueOf = Boolean.valueOf(z2);
                                    if (objValueOf != obj7) {
                                        Object obj9 = objValueOf;
                                        d850Var2 = d850Var4;
                                        z3 = zBooleanValue2;
                                        objM59214b = obj9;
                                        if (((Boolean) objM59214b).booleanValue()) {
                                            ik41Var.f103012a = null;
                                            ik41Var.f103015d = z;
                                            ik41Var.f103016e = z3;
                                            ik41Var.f103021t = 4;
                                            objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                            if (objM59213a != obj7) {
                                                return objM59213a;
                                            }
                                        } else {
                                            zBooleanValue2 = z3;
                                            d850Var4 = d850Var2;
                                            ik41Var.f103012a = d850Var4;
                                            ik41Var.f103015d = z;
                                            ik41Var.f103016e = zBooleanValue2;
                                            ik41Var.f103021t = 5;
                                            objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                            if (objM82200f != obj7) {
                                                d850Var3 = d850Var4;
                                                z4 = zBooleanValue2;
                                                objM59214b = objM82200f;
                                                zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                                if (!zBooleanValue3) {
                                                }
                                                obj = objM59214b;
                                                z5 = z;
                                                i = 0;
                                                z6 = z4;
                                                z7 = zBooleanValue3;
                                                oge0 oge0Var4 = lk41Var2.f134254e;
                                                ik41Var.f103012a = null;
                                                ik41Var.f103013b = obj;
                                                ik41Var.f103014c = lk41Var2;
                                                ik41Var.f103015d = z5;
                                                ik41Var.f103016e = z6;
                                                ik41Var.f103017f = z7;
                                                ik41Var.f103018g = i;
                                                ik41Var.f103021t = 8;
                                                objM59214b = kk40.m56684z(new cjf0(oge0Var4, fbkVar2, 0), ik41Var);
                                                if (objM59214b != obj7) {
                                                    boolean z13 = z6;
                                                    lk41Var = lk41Var2;
                                                    z8 = z13;
                                                    obj2 = obj;
                                                    if (((Boolean) objM59214b).booleanValue()) {
                                                        mb80Var = lk41Var.f134250a;
                                                        kuf0Var = lk41Var.f134241O0;
                                                        if (mb80Var.f141817b.current().getValue() != null) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                        if (apiVarM77296c != null) {
                                                            z10 = !apiVarM77296c.mo26697m();
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                        } else if (z10) {
                                                            kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                        }
                                                    }
                                                    Boolean bool4 = (Boolean) obj2;
                                                    bool4.getClass();
                                                    return bool4;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    ik41Var.f103012a = d850Var4;
                                    ik41Var.f103015d = z;
                                    ik41Var.f103016e = zBooleanValue2;
                                    ik41Var.f103021t = 5;
                                    objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                    if (objM82200f != obj7) {
                                        d850Var3 = d850Var4;
                                        z4 = zBooleanValue2;
                                        objM59214b = objM82200f;
                                        zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                        if (!zBooleanValue3) {
                                        }
                                        obj = objM59214b;
                                        z5 = z;
                                        i = 0;
                                        z6 = z4;
                                        z7 = zBooleanValue3;
                                        oge0 oge0Var5 = lk41Var2.f134254e;
                                        ik41Var.f103012a = null;
                                        ik41Var.f103013b = obj;
                                        ik41Var.f103014c = lk41Var2;
                                        ik41Var.f103015d = z5;
                                        ik41Var.f103016e = z6;
                                        ik41Var.f103017f = z7;
                                        ik41Var.f103018g = i;
                                        ik41Var.f103021t = 8;
                                        objM59214b = kk40.m56684z(new cjf0(oge0Var5, fbkVar2, 0), ik41Var);
                                        if (objM59214b != obj7) {
                                            boolean z14 = z6;
                                            lk41Var = lk41Var2;
                                            z8 = z14;
                                            obj2 = obj;
                                            if (((Boolean) objM59214b).booleanValue()) {
                                                mb80Var = lk41Var.f134250a;
                                                kuf0Var = lk41Var.f134241O0;
                                                if (mb80Var.f141817b.current().getValue() != null) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                if (apiVarM77296c != null) {
                                                    z10 = !apiVarM77296c.mo26697m();
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                } else if (z10) {
                                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                }
                                            }
                                            Boolean bool5 = (Boolean) obj2;
                                            bool5.getClass();
                                            return bool5;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return obj7;
                    case 1:
                        d850Var4 = ik41Var.f103012a;
                        bga.m29073P(objM59214b);
                        zBooleanValue = ((Boolean) objM59214b).booleanValue();
                        ik41Var.f103012a = d850Var4;
                        ik41Var.f103015d = zBooleanValue;
                        ik41Var.f103021t = 2;
                        objM42226c = m42226c(ik41Var);
                        if (objM42226c != obj7) {
                            z = zBooleanValue;
                            objM59214b = objM42226c;
                            zBooleanValue2 = ((Boolean) objM59214b).booleanValue();
                            if (zBooleanValue2) {
                                ik41Var.f103012a = d850Var4;
                                ik41Var.f103015d = z;
                                ik41Var.f103016e = zBooleanValue2;
                                ik41Var.f103021t = 3;
                                qhoVarM25241r = aag1.m25241r(lk41Var2.f134251b, lk41Var2.f134239M0, obj6);
                                if (qhoVarM25241r instanceof oho) {
                                    ohoVar = (oho) qhoVarM25241r;
                                } else {
                                    ohoVar = null;
                                }
                                if (ohoVar != null) {
                                    cvb1Var = cvb1.f42346a;
                                } else {
                                    cvb1Var = cvb1.f42346a;
                                }
                                iOrdinal = cvb1Var.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        objValueOf = lk41Var2.m59215e(ik41Var);
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        z2 = true;
                                    }
                                    if (objValueOf != obj7) {
                                        Object obj10 = objValueOf;
                                        d850Var2 = d850Var4;
                                        z3 = zBooleanValue2;
                                        objM59214b = obj10;
                                        if (((Boolean) objM59214b).booleanValue()) {
                                            ik41Var.f103012a = null;
                                            ik41Var.f103015d = z;
                                            ik41Var.f103016e = z3;
                                            ik41Var.f103021t = 4;
                                            objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                            if (objM59213a != obj7) {
                                                return objM59213a;
                                            }
                                        } else {
                                            zBooleanValue2 = z3;
                                            d850Var4 = d850Var2;
                                            ik41Var.f103012a = d850Var4;
                                            ik41Var.f103015d = z;
                                            ik41Var.f103016e = zBooleanValue2;
                                            ik41Var.f103021t = 5;
                                            objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                            if (objM82200f != obj7) {
                                                d850Var3 = d850Var4;
                                                z4 = zBooleanValue2;
                                                objM59214b = objM82200f;
                                                zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                                if (!zBooleanValue3) {
                                                }
                                                obj = objM59214b;
                                                z5 = z;
                                                i = 0;
                                                z6 = z4;
                                                z7 = zBooleanValue3;
                                                oge0 oge0Var6 = lk41Var2.f134254e;
                                                ik41Var.f103012a = null;
                                                ik41Var.f103013b = obj;
                                                ik41Var.f103014c = lk41Var2;
                                                ik41Var.f103015d = z5;
                                                ik41Var.f103016e = z6;
                                                ik41Var.f103017f = z7;
                                                ik41Var.f103018g = i;
                                                ik41Var.f103021t = 8;
                                                objM59214b = kk40.m56684z(new cjf0(oge0Var6, fbkVar2, 0), ik41Var);
                                                if (objM59214b != obj7) {
                                                    boolean z15 = z6;
                                                    lk41Var = lk41Var2;
                                                    z8 = z15;
                                                    obj2 = obj;
                                                    if (((Boolean) objM59214b).booleanValue()) {
                                                        mb80Var = lk41Var.f134250a;
                                                        kuf0Var = lk41Var.f134241O0;
                                                        if (mb80Var.f141817b.current().getValue() != null) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                        if (apiVarM77296c != null) {
                                                            z10 = !apiVarM77296c.mo26697m();
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                        } else if (z10) {
                                                            kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                        }
                                                    }
                                                    Boolean bool6 = (Boolean) obj2;
                                                    bool6.getClass();
                                                    return bool6;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z2 = false;
                                }
                                objValueOf = Boolean.valueOf(z2);
                                if (objValueOf != obj7) {
                                    Object obj11 = objValueOf;
                                    d850Var2 = d850Var4;
                                    z3 = zBooleanValue2;
                                    objM59214b = obj11;
                                    if (((Boolean) objM59214b).booleanValue()) {
                                        ik41Var.f103012a = null;
                                        ik41Var.f103015d = z;
                                        ik41Var.f103016e = z3;
                                        ik41Var.f103021t = 4;
                                        objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                        if (objM59213a != obj7) {
                                            return objM59213a;
                                        }
                                    } else {
                                        zBooleanValue2 = z3;
                                        d850Var4 = d850Var2;
                                        ik41Var.f103012a = d850Var4;
                                        ik41Var.f103015d = z;
                                        ik41Var.f103016e = zBooleanValue2;
                                        ik41Var.f103021t = 5;
                                        objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                        if (objM82200f != obj7) {
                                            d850Var3 = d850Var4;
                                            z4 = zBooleanValue2;
                                            objM59214b = objM82200f;
                                            zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                            if (!zBooleanValue3) {
                                            }
                                            obj = objM59214b;
                                            z5 = z;
                                            i = 0;
                                            z6 = z4;
                                            z7 = zBooleanValue3;
                                            oge0 oge0Var7 = lk41Var2.f134254e;
                                            ik41Var.f103012a = null;
                                            ik41Var.f103013b = obj;
                                            ik41Var.f103014c = lk41Var2;
                                            ik41Var.f103015d = z5;
                                            ik41Var.f103016e = z6;
                                            ik41Var.f103017f = z7;
                                            ik41Var.f103018g = i;
                                            ik41Var.f103021t = 8;
                                            objM59214b = kk40.m56684z(new cjf0(oge0Var7, fbkVar2, 0), ik41Var);
                                            if (objM59214b != obj7) {
                                                boolean z16 = z6;
                                                lk41Var = lk41Var2;
                                                z8 = z16;
                                                obj2 = obj;
                                                if (((Boolean) objM59214b).booleanValue()) {
                                                    mb80Var = lk41Var.f134250a;
                                                    kuf0Var = lk41Var.f134241O0;
                                                    if (mb80Var.f141817b.current().getValue() != null) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                    if (apiVarM77296c != null) {
                                                        z10 = !apiVarM77296c.mo26697m();
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                    } else if (z10) {
                                                        kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                    }
                                                }
                                                Boolean bool7 = (Boolean) obj2;
                                                bool7.getClass();
                                                return bool7;
                                            }
                                        }
                                    }
                                }
                            } else {
                                ik41Var.f103012a = d850Var4;
                                ik41Var.f103015d = z;
                                ik41Var.f103016e = zBooleanValue2;
                                ik41Var.f103021t = 5;
                                objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                if (objM82200f != obj7) {
                                    d850Var3 = d850Var4;
                                    z4 = zBooleanValue2;
                                    objM59214b = objM82200f;
                                    zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                    if (!zBooleanValue3) {
                                    }
                                    obj = objM59214b;
                                    z5 = z;
                                    i = 0;
                                    z6 = z4;
                                    z7 = zBooleanValue3;
                                    oge0 oge0Var8 = lk41Var2.f134254e;
                                    ik41Var.f103012a = null;
                                    ik41Var.f103013b = obj;
                                    ik41Var.f103014c = lk41Var2;
                                    ik41Var.f103015d = z5;
                                    ik41Var.f103016e = z6;
                                    ik41Var.f103017f = z7;
                                    ik41Var.f103018g = i;
                                    ik41Var.f103021t = 8;
                                    objM59214b = kk40.m56684z(new cjf0(oge0Var8, fbkVar2, 0), ik41Var);
                                    if (objM59214b != obj7) {
                                        boolean z17 = z6;
                                        lk41Var = lk41Var2;
                                        z8 = z17;
                                        obj2 = obj;
                                        if (((Boolean) objM59214b).booleanValue()) {
                                            mb80Var = lk41Var.f134250a;
                                            kuf0Var = lk41Var.f134241O0;
                                            if (mb80Var.f141817b.current().getValue() != null) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                            if (apiVarM77296c != null) {
                                                z10 = !apiVarM77296c.mo26697m();
                                            } else {
                                                z10 = false;
                                            }
                                            if (z9) {
                                                kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                            } else if (z10) {
                                                kuf0.m57390a(kuf0Var, huf0.f95398a);
                                            }
                                        }
                                        Boolean bool8 = (Boolean) obj2;
                                        bool8.getClass();
                                        return bool8;
                                    }
                                }
                            }
                        }
                        return obj7;
                    case 2:
                        boolean z18 = ik41Var.f103015d;
                        d850 d850Var5 = ik41Var.f103012a;
                        bga.m29073P(objM59214b);
                        z = z18;
                        d850Var4 = d850Var5;
                        zBooleanValue2 = ((Boolean) objM59214b).booleanValue();
                        if (zBooleanValue2) {
                            ik41Var.f103012a = d850Var4;
                            ik41Var.f103015d = z;
                            ik41Var.f103016e = zBooleanValue2;
                            ik41Var.f103021t = 3;
                            qhoVarM25241r = aag1.m25241r(lk41Var2.f134251b, lk41Var2.f134239M0, obj6);
                            if (qhoVarM25241r instanceof oho) {
                                ohoVar = (oho) qhoVarM25241r;
                            } else {
                                ohoVar = null;
                            }
                            if (ohoVar != null) {
                                cvb1Var = cvb1.f42346a;
                            } else {
                                cvb1Var = cvb1.f42346a;
                            }
                            iOrdinal = cvb1Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    objValueOf = lk41Var2.m59215e(ik41Var);
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z2 = true;
                                }
                                if (objValueOf != obj7) {
                                    Object obj12 = objValueOf;
                                    d850Var2 = d850Var4;
                                    z3 = zBooleanValue2;
                                    objM59214b = obj12;
                                    if (((Boolean) objM59214b).booleanValue()) {
                                        ik41Var.f103012a = null;
                                        ik41Var.f103015d = z;
                                        ik41Var.f103016e = z3;
                                        ik41Var.f103021t = 4;
                                        objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                        if (objM59213a != obj7) {
                                            return objM59213a;
                                        }
                                    } else {
                                        zBooleanValue2 = z3;
                                        d850Var4 = d850Var2;
                                        ik41Var.f103012a = d850Var4;
                                        ik41Var.f103015d = z;
                                        ik41Var.f103016e = zBooleanValue2;
                                        ik41Var.f103021t = 5;
                                        objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                        if (objM82200f != obj7) {
                                            d850Var3 = d850Var4;
                                            z4 = zBooleanValue2;
                                            objM59214b = objM82200f;
                                            zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                            if (!zBooleanValue3) {
                                            }
                                            obj = objM59214b;
                                            z5 = z;
                                            i = 0;
                                            z6 = z4;
                                            z7 = zBooleanValue3;
                                            oge0 oge0Var9 = lk41Var2.f134254e;
                                            ik41Var.f103012a = null;
                                            ik41Var.f103013b = obj;
                                            ik41Var.f103014c = lk41Var2;
                                            ik41Var.f103015d = z5;
                                            ik41Var.f103016e = z6;
                                            ik41Var.f103017f = z7;
                                            ik41Var.f103018g = i;
                                            ik41Var.f103021t = 8;
                                            objM59214b = kk40.m56684z(new cjf0(oge0Var9, fbkVar2, 0), ik41Var);
                                            if (objM59214b != obj7) {
                                                boolean z19 = z6;
                                                lk41Var = lk41Var2;
                                                z8 = z19;
                                                obj2 = obj;
                                                if (((Boolean) objM59214b).booleanValue()) {
                                                    mb80Var = lk41Var.f134250a;
                                                    kuf0Var = lk41Var.f134241O0;
                                                    if (mb80Var.f141817b.current().getValue() != null) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                    if (apiVarM77296c != null) {
                                                        z10 = !apiVarM77296c.mo26697m();
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                    } else if (z10) {
                                                        kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                    }
                                                }
                                                Boolean bool9 = (Boolean) obj2;
                                                bool9.getClass();
                                                return bool9;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z2 = false;
                            }
                            objValueOf = Boolean.valueOf(z2);
                            if (objValueOf != obj7) {
                                Object obj13 = objValueOf;
                                d850Var2 = d850Var4;
                                z3 = zBooleanValue2;
                                objM59214b = obj13;
                                if (((Boolean) objM59214b).booleanValue()) {
                                    ik41Var.f103012a = null;
                                    ik41Var.f103015d = z;
                                    ik41Var.f103016e = z3;
                                    ik41Var.f103021t = 4;
                                    objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                                    if (objM59213a != obj7) {
                                        return objM59213a;
                                    }
                                } else {
                                    zBooleanValue2 = z3;
                                    d850Var4 = d850Var2;
                                    ik41Var.f103012a = d850Var4;
                                    ik41Var.f103015d = z;
                                    ik41Var.f103016e = zBooleanValue2;
                                    ik41Var.f103021t = 5;
                                    objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                                    if (objM82200f != obj7) {
                                        d850Var3 = d850Var4;
                                        z4 = zBooleanValue2;
                                        objM59214b = objM82200f;
                                        zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                        if (!zBooleanValue3) {
                                        }
                                        obj = objM59214b;
                                        z5 = z;
                                        i = 0;
                                        z6 = z4;
                                        z7 = zBooleanValue3;
                                        oge0 oge0Var10 = lk41Var2.f134254e;
                                        ik41Var.f103012a = null;
                                        ik41Var.f103013b = obj;
                                        ik41Var.f103014c = lk41Var2;
                                        ik41Var.f103015d = z5;
                                        ik41Var.f103016e = z6;
                                        ik41Var.f103017f = z7;
                                        ik41Var.f103018g = i;
                                        ik41Var.f103021t = 8;
                                        objM59214b = kk40.m56684z(new cjf0(oge0Var10, fbkVar2, 0), ik41Var);
                                        if (objM59214b != obj7) {
                                            boolean z110 = z6;
                                            lk41Var = lk41Var2;
                                            z8 = z110;
                                            obj2 = obj;
                                            if (((Boolean) objM59214b).booleanValue()) {
                                                mb80Var = lk41Var.f134250a;
                                                kuf0Var = lk41Var.f134241O0;
                                                if (mb80Var.f141817b.current().getValue() != null) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                                if (apiVarM77296c != null) {
                                                    z10 = !apiVarM77296c.mo26697m();
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                                } else if (z10) {
                                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                                }
                                            }
                                            Boolean bool10 = (Boolean) obj2;
                                            bool10.getClass();
                                            return bool10;
                                        }
                                    }
                                }
                            }
                        } else {
                            ik41Var.f103012a = d850Var4;
                            ik41Var.f103015d = z;
                            ik41Var.f103016e = zBooleanValue2;
                            ik41Var.f103021t = 5;
                            objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                            if (objM82200f != obj7) {
                                d850Var3 = d850Var4;
                                z4 = zBooleanValue2;
                                objM59214b = objM82200f;
                                zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                if (!zBooleanValue3) {
                                }
                                obj = objM59214b;
                                z5 = z;
                                i = 0;
                                z6 = z4;
                                z7 = zBooleanValue3;
                                oge0 oge0Var11 = lk41Var2.f134254e;
                                ik41Var.f103012a = null;
                                ik41Var.f103013b = obj;
                                ik41Var.f103014c = lk41Var2;
                                ik41Var.f103015d = z5;
                                ik41Var.f103016e = z6;
                                ik41Var.f103017f = z7;
                                ik41Var.f103018g = i;
                                ik41Var.f103021t = 8;
                                objM59214b = kk40.m56684z(new cjf0(oge0Var11, fbkVar2, 0), ik41Var);
                                if (objM59214b != obj7) {
                                    boolean z111 = z6;
                                    lk41Var = lk41Var2;
                                    z8 = z111;
                                    obj2 = obj;
                                    if (((Boolean) objM59214b).booleanValue()) {
                                        mb80Var = lk41Var.f134250a;
                                        kuf0Var = lk41Var.f134241O0;
                                        if (mb80Var.f141817b.current().getValue() != null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                        if (apiVarM77296c != null) {
                                            z10 = !apiVarM77296c.mo26697m();
                                        } else {
                                            z10 = false;
                                        }
                                        if (z9) {
                                            kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                        } else if (z10) {
                                            kuf0.m57390a(kuf0Var, huf0.f95398a);
                                        }
                                    }
                                    Boolean bool11 = (Boolean) obj2;
                                    bool11.getClass();
                                    return bool11;
                                }
                            }
                        }
                        return obj7;
                    case 3:
                        z3 = ik41Var.f103016e;
                        z = ik41Var.f103015d;
                        d850Var2 = ik41Var.f103012a;
                        bga.m29073P(objM59214b);
                        if (((Boolean) objM59214b).booleanValue()) {
                            ik41Var.f103012a = null;
                            ik41Var.f103015d = z;
                            ik41Var.f103016e = z3;
                            ik41Var.f103021t = 4;
                            objM59213a = lk41.m59213a(lk41Var2, u190Var, d850Var2, ik41Var);
                            if (objM59213a != obj7) {
                                return objM59213a;
                            }
                        } else {
                            zBooleanValue2 = z3;
                            d850Var4 = d850Var2;
                            ik41Var.f103012a = d850Var4;
                            ik41Var.f103015d = z;
                            ik41Var.f103016e = zBooleanValue2;
                            ik41Var.f103021t = 5;
                            objM82200f = u190Var.m82200f(d850Var4, ik41Var);
                            if (objM82200f != obj7) {
                                d850Var3 = d850Var4;
                                z4 = zBooleanValue2;
                                objM59214b = objM82200f;
                                zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                                if (!zBooleanValue3) {
                                }
                                obj = objM59214b;
                                z5 = z;
                                i = 0;
                                z6 = z4;
                                z7 = zBooleanValue3;
                                oge0 oge0Var12 = lk41Var2.f134254e;
                                ik41Var.f103012a = null;
                                ik41Var.f103013b = obj;
                                ik41Var.f103014c = lk41Var2;
                                ik41Var.f103015d = z5;
                                ik41Var.f103016e = z6;
                                ik41Var.f103017f = z7;
                                ik41Var.f103018g = i;
                                ik41Var.f103021t = 8;
                                objM59214b = kk40.m56684z(new cjf0(oge0Var12, fbkVar2, 0), ik41Var);
                                if (objM59214b != obj7) {
                                    boolean z112 = z6;
                                    lk41Var = lk41Var2;
                                    z8 = z112;
                                    obj2 = obj;
                                    if (((Boolean) objM59214b).booleanValue()) {
                                        mb80Var = lk41Var.f134250a;
                                        kuf0Var = lk41Var.f134241O0;
                                        if (mb80Var.f141817b.current().getValue() != null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                        if (apiVarM77296c != null) {
                                            z10 = !apiVarM77296c.mo26697m();
                                        } else {
                                            z10 = false;
                                        }
                                        if (z9) {
                                            kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                        } else if (z10) {
                                            kuf0.m57390a(kuf0Var, huf0.f95398a);
                                        }
                                    }
                                    Boolean bool12 = (Boolean) obj2;
                                    bool12.getClass();
                                    return bool12;
                                }
                            }
                        }
                        return obj7;
                    case 4:
                        bga.m29073P(objM59214b);
                        return objM59214b;
                    case 5:
                        z4 = ik41Var.f103016e;
                        z = ik41Var.f103015d;
                        d850 d850Var6 = ik41Var.f103012a;
                        bga.m29073P(objM59214b);
                        d850Var3 = d850Var6;
                        zBooleanValue3 = ((Boolean) objM59214b).booleanValue();
                        if (!zBooleanValue3) {
                        }
                        obj = objM59214b;
                        z5 = z;
                        i = 0;
                        z6 = z4;
                        z7 = zBooleanValue3;
                        oge0 oge0Var13 = lk41Var2.f134254e;
                        ik41Var.f103012a = null;
                        ik41Var.f103013b = obj;
                        ik41Var.f103014c = lk41Var2;
                        ik41Var.f103015d = z5;
                        ik41Var.f103016e = z6;
                        ik41Var.f103017f = z7;
                        ik41Var.f103018g = i;
                        ik41Var.f103021t = 8;
                        objM59214b = kk40.m56684z(new cjf0(oge0Var13, fbkVar2, 0), ik41Var);
                        if (objM59214b != obj7) {
                            boolean z113 = z6;
                            lk41Var = lk41Var2;
                            z8 = z113;
                            obj2 = obj;
                            if (((Boolean) objM59214b).booleanValue()) {
                                mb80Var = lk41Var.f134250a;
                                kuf0Var = lk41Var.f134241O0;
                                if (mb80Var.f141817b.current().getValue() != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                if (apiVarM77296c != null) {
                                    z10 = !apiVarM77296c.mo26697m();
                                } else {
                                    z10 = false;
                                }
                                if (z9) {
                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                } else if (z10) {
                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                }
                            }
                            Boolean bool13 = (Boolean) obj2;
                            bool13.getClass();
                            return bool13;
                        }
                        return obj7;
                    case 6:
                        i2 = ik41Var.f103018g;
                        boolean z20 = ik41Var.f103017f;
                        z6 = ik41Var.f103016e;
                        boolean z21 = ik41Var.f103015d;
                        lk41 lk41Var3 = ik41Var.f103014c;
                        obj = ik41Var.f103013b;
                        d850Var3 = ik41Var.f103012a;
                        bga.m29073P(objM59214b);
                        zBooleanValue3 = z20;
                        lk41Var2 = lk41Var3;
                        z5 = z21;
                        if (((Boolean) objM59214b).booleanValue()) {
                            ik41Var.f103012a = null;
                            ik41Var.f103013b = obj;
                            ik41Var.f103014c = lk41Var2;
                            ik41Var.f103015d = z5;
                            ik41Var.f103016e = z6;
                            ik41Var.f103017f = zBooleanValue3;
                            ik41Var.f103018g = i2;
                            ik41Var.f103021t = 7;
                            objM81504c = lk41Var2.f134247X.m81504c(lk41Var2.f134253d, ltf0.f136771a, d850Var3, ik41Var);
                            if (objM81504c == obj7) {
                                obj6 = objM81504c;
                            }
                            break;
                        }
                        i = i2;
                        z7 = zBooleanValue3;
                        oge0 oge0Var14 = lk41Var2.f134254e;
                        ik41Var.f103012a = null;
                        ik41Var.f103013b = obj;
                        ik41Var.f103014c = lk41Var2;
                        ik41Var.f103015d = z5;
                        ik41Var.f103016e = z6;
                        ik41Var.f103017f = z7;
                        ik41Var.f103018g = i;
                        ik41Var.f103021t = 8;
                        objM59214b = kk40.m56684z(new cjf0(oge0Var14, fbkVar2, 0), ik41Var);
                        if (objM59214b != obj7) {
                            boolean z114 = z6;
                            lk41Var = lk41Var2;
                            z8 = z114;
                            obj2 = obj;
                            if (((Boolean) objM59214b).booleanValue()) {
                                mb80Var = lk41Var.f134250a;
                                kuf0Var = lk41Var.f134241O0;
                                if (mb80Var.f141817b.current().getValue() != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                if (apiVarM77296c != null) {
                                    z10 = !apiVarM77296c.mo26697m();
                                } else {
                                    z10 = false;
                                }
                                if (z9) {
                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                } else if (z10) {
                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                }
                            }
                            Boolean bool14 = (Boolean) obj2;
                            bool14.getClass();
                            return bool14;
                        }
                        return obj7;
                    case 7:
                        i2 = ik41Var.f103018g;
                        boolean z22 = ik41Var.f103017f;
                        z6 = ik41Var.f103016e;
                        boolean z23 = ik41Var.f103015d;
                        lk41 lk41Var4 = ik41Var.f103014c;
                        Object obj14 = ik41Var.f103013b;
                        bga.m29073P(objM59214b);
                        obj = obj14;
                        z5 = z23;
                        zBooleanValue3 = z22;
                        lk41Var2 = lk41Var4;
                        i = i2;
                        z7 = zBooleanValue3;
                        oge0 oge0Var15 = lk41Var2.f134254e;
                        ik41Var.f103012a = null;
                        ik41Var.f103013b = obj;
                        ik41Var.f103014c = lk41Var2;
                        ik41Var.f103015d = z5;
                        ik41Var.f103016e = z6;
                        ik41Var.f103017f = z7;
                        ik41Var.f103018g = i;
                        ik41Var.f103021t = 8;
                        objM59214b = kk40.m56684z(new cjf0(oge0Var15, fbkVar2, 0), ik41Var);
                        if (objM59214b != obj7) {
                            boolean z115 = z6;
                            lk41Var = lk41Var2;
                            z8 = z115;
                            obj2 = obj;
                            if (((Boolean) objM59214b).booleanValue()) {
                                mb80Var = lk41Var.f134250a;
                                kuf0Var = lk41Var.f134241O0;
                                if (mb80Var.f141817b.current().getValue() != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                                if (apiVarM77296c != null) {
                                    z10 = !apiVarM77296c.mo26697m();
                                } else {
                                    z10 = false;
                                }
                                if (z9) {
                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                } else if (z10) {
                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                }
                            }
                            Boolean bool15 = (Boolean) obj2;
                            bool15.getClass();
                            return bool15;
                        }
                        return obj7;
                    case 8:
                        z7 = ik41Var.f103017f;
                        z8 = ik41Var.f103016e;
                        lk41Var = ik41Var.f103014c;
                        obj2 = ik41Var.f103013b;
                        bga.m29073P(objM59214b);
                        if (((Boolean) objM59214b).booleanValue()) {
                            mb80Var = lk41Var.f134250a;
                            kuf0Var = lk41Var.f134241O0;
                            if (mb80Var.f141817b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            apiVarM77296c = ((s5p) lk41Var.f134256g).m77296c();
                            if (apiVarM77296c != null) {
                                z10 = !apiVarM77296c.mo26697m();
                            } else {
                                z10 = false;
                            }
                            if (z9) {
                                kuf0.m57390a(kuf0Var, iuf0.f105960a);
                            } else if (z10) {
                                kuf0.m57390a(kuf0Var, huf0.f95398a);
                            }
                        }
                        Boolean bool16 = (Boolean) obj2;
                        bool16.getClass();
                        return bool16;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: b */
    public final fiz mo40982b() {
        switch (this.f71302a) {
            case 0:
                break;
        }
        return this.f71303b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == r4) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m42226c(ibk ibkVar) {
        fk41 fk41Var;
        if (ibkVar instanceof fk41) {
            fk41Var = (fk41) ibkVar;
            int i = fk41Var.f70474c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk41Var.f70474c = i - Integer.MIN_VALUE;
            } else {
                fk41Var = new fk41(this, ibkVar);
            }
        } else {
            fk41Var = new fk41(this, ibkVar);
        }
        Object objM86755t = fk41Var.f70472a;
        int i2 = fk41Var.f70474c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            pox poxVarM76722t = ryf1.m76722t((be11) this.f71305d, 1);
            fk41Var.f70474c = 1;
            objM86755t = vyf1.m86755t(poxVarM76722t, fk41Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        boolean z = ((Boolean) objM86755t).booleanValue() ? false : true;
        return Boolean.valueOf(z);
        if (!((Boolean) objM86755t).booleanValue()) {
            pox poxVarM76722t2 = ryf1.m76722t((be11) this.f71306e, 1);
            fk41Var.f70474c = 2;
            objM86755t = vyf1.m86755t(poxVarM76722t2, fk41Var);
        }
        return Boolean.valueOf(z);
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: i */
    public final fiz mo40983i() {
        switch (this.f71302a) {
            case 0:
                return (b7g0) this.f71306e;
            default:
                return (be11) this.f71306e;
        }
    }

    @Override // p204p.f7p0
    public final fiz isActive() {
        switch (this.f71302a) {
            case 0:
                return (b7g0) this.f71305d;
            default:
                return (be11) this.f71305d;
        }
    }

    public fni0(u190 u190Var, lk41 lk41Var) {
        this.f71304c = u190Var;
        this.f71307f = lk41Var;
        this.f71305d = new be11(u190Var.m82196b(), 23);
        this.f71306e = new be11(u190Var.m82196b(), 24);
        this.f71303b = u190Var.f225727h;
    }
}
