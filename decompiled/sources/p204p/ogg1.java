package p204p;

import com.google.android.recaptcha.internal.zzhg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ogg1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165153a = 1;

    /* JADX INFO: renamed from: b */
    public Object f165154b;

    /* JADX INFO: renamed from: c */
    public int f165155c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f165156d;

    /* JADX INFO: renamed from: e */
    public Object f165157e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f165158f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f165159g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f165160h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f165161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogg1(long j, String str, fbk fbkVar, dlr0 dlr0Var, dc31 dc31Var, fog1 fog1Var) {
        super(2, fbkVar);
        this.f165157e = dc31Var;
        this.f165158f = j;
        this.f165159g = str;
        this.f165160h = dlr0Var;
        this.f165161i = fog1Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f165153a) {
            case 0:
                ogg1 ogg1Var = new ogg1((dc31) this.f165157e, (log1) this.f165154b, this.f165159g, this.f165158f, (dlr0) this.f165160h, (fog1) this.f165161i, fbkVar);
                ogg1Var.f165156d = obj;
                return ogg1Var;
            case 1:
                dc31 dc31Var = (dc31) this.f165157e;
                ogg1 ogg1Var2 = new ogg1(this.f165158f, this.f165159g, fbkVar, (dlr0) this.f165160h, dc31Var, (fog1) this.f165161i);
                ogg1Var2.f165156d = obj;
                return ogg1Var2;
            default:
                ogg1 ogg1Var3 = new ogg1((fvd0) this.f165160h, (svd0) this.f165161i, this.f165158f, this.f165159g, fbkVar);
                ogg1Var3.f165156d = obj;
                return ogg1Var3;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f165153a) {
            case 0:
                return ((ogg1) create((smg1) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((ogg1) create((log1) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((ogg1) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r3v28, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        smg1 smg1Var;
        Object cog1Var;
        log1 log1Var;
        Object aog1Var;
        Object objM26589a;
        Object objInvoke;
        log1 log1Var2;
        Object cog1Var2;
        log1 log1Var3;
        log1 log1Var4;
        tjg1 tjg1VarM70755f;
        Object objMo26158a;
        log1 log1Var5;
        tjg1 tjg1Var;
        pjq pjqVarM89574q;
        Object objM38777P;
        nwd0 nwd0Var;
        Object objMo26597I;
        ArrayList arrayList;
        ?? arrayList2;
        erc1 erc1Var;
        int iM75429D;
        w240 w240Var;
        Integer numValueOf;
        ufu ufuVar;
        int i;
        switch (this.f165153a) {
            case 0:
                int i2 = this.f165155c;
                fbk fbkVar = null;
                yuk yukVar = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        log1Var = (log1) this.f165156d;
                        bga.m29073P(obj);
                        aog1Var = obj;
                        this.f165156d = null;
                        this.f165155c = 2;
                        objM26589a = ((aog1) aog1Var).m26589a(log1Var, this);
                        if (objM26589a == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                bga.m29073P(obj);
                                objInvoke = obj;
                            } else {
                                smg1Var = (smg1) this.f165156d;
                                bga.m29073P(obj);
                                cog1Var = obj;
                                this.f165156d = null;
                                this.f165155c = 4;
                                objInvoke = ((cog1) cog1Var).f40257a.invoke(smg1Var.f210653a, this);
                                if (objInvoke == yukVar) {
                                    return yukVar;
                                }
                            }
                            return (egg1) objInvoke;
                        }
                        bga.m29073P(obj);
                        objM26589a = obj;
                    }
                    return (egg1) objM26589a;
                }
                bga.m29073P(obj);
                smg1Var = (smg1) this.f165156d;
                dc31 dc31Var = (dc31) this.f165157e;
                egg1 egg1Var = (egg1) dc31Var.f47418e;
                if (egg1Var != null) {
                    log1Var = (log1) this.f165154b;
                    this.f165156d = log1Var;
                    this.f165155c = 1;
                    aog1Var = new aog1(45, new mbd1(egg1Var, this.f165159g, fbkVar, 13), null);
                    if (aog1Var == yukVar) {
                        return yukVar;
                    }
                    this.f165156d = null;
                    this.f165155c = 2;
                    objM26589a = ((aog1) aog1Var).m26589a(log1Var, this);
                    if (objM26589a == yukVar) {
                        return yukVar;
                    }
                    return (egg1) objM26589a;
                }
                dlr0 dlr0Var = (dlr0) this.f165160h;
                fog1 fog1Var = (fog1) this.f165161i;
                this.f165156d = smg1Var;
                this.f165155c = 3;
                cog1Var = new cog1(new ogg1(this.f165158f, this.f165159g, null, dlr0Var, dc31Var, fog1Var));
                if (cog1Var == yukVar) {
                    return yukVar;
                }
                this.f165156d = null;
                this.f165155c = 4;
                objInvoke = ((cog1) cog1Var).f40257a.invoke(smg1Var.f210653a, this);
                if (objInvoke == yukVar) {
                    return yukVar;
                }
                return (egg1) objInvoke;
            case 1:
                dc31 dc31Var2 = (dc31) this.f165157e;
                ps3 ps3Var = (ps3) dc31Var2.f47416c;
                int i3 = this.f165155c;
                fbk fbkVar2 = null;
                long j = this.f165158f;
                String str = this.f165159g;
                yuk yukVar2 = yuk.f276404a;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            log1Var2 = (log1) this.f165154b;
                            log1Var3 = (log1) this.f165156d;
                            bga.m29073P(obj);
                            cog1Var2 = obj;
                        } else if (i3 == 2) {
                            log1Var4 = (log1) this.f165156d;
                            bga.m29073P(obj);
                            tjg1VarM70755f = ps3Var.m70755f(str, (dlr0) this.f165160h);
                            this.f165156d = tjg1VarM70755f;
                            this.f165154b = log1Var4;
                            this.f165155c = 3;
                            objMo26158a = tjg1VarM70755f.mo26158a(j, this);
                            if (objMo26158a != yukVar2) {
                                return yukVar2;
                            }
                            log1Var5 = log1Var4;
                            tjg1Var = tjg1VarM70755f;
                            this.f165156d = tjg1Var;
                            this.f165154b = null;
                            this.f165155c = 4;
                            if (((cog1) objMo26158a).f40257a.invoke(log1Var5, this) == yukVar2) {
                                return yukVar2;
                            }
                        } else if (i3 != 3) {
                            tjg1Var = (tjg1) this.f165156d;
                            bga.m29073P(obj);
                        } else {
                            log1 log1Var6 = (log1) this.f165154b;
                            tjg1 tjg1Var2 = (tjg1) this.f165156d;
                            bga.m29073P(obj);
                            log1Var5 = log1Var6;
                            tjg1Var = tjg1Var2;
                            objMo26158a = obj;
                            this.f165156d = tjg1Var;
                            this.f165154b = null;
                            this.f165155c = 4;
                            if (((cog1) objMo26158a).f40257a.invoke(log1Var5, this) == yukVar2) {
                                return yukVar2;
                            }
                        }
                        egg1 egg1Var2 = new egg1(tjg1Var, str, (fog1) this.f165161i, (okj0) ps3Var.f180734k);
                        dc31Var2.f47418e = egg1Var2;
                        return egg1Var2;
                    }
                    bga.m29073P(obj);
                    log1Var2 = (log1) this.f165156d;
                    dc31.m35619y(dc31Var2, j, str);
                    w7g1 w7g1Var = (w7g1) ps3Var.f180733j;
                    this.f165156d = log1Var2;
                    this.f165154b = log1Var2;
                    this.f165155c = 1;
                    cog1Var2 = new cog1(new mbd1(w7g1Var, fbkVar2, 12));
                    if (cog1Var2 == yukVar2) {
                        return yukVar2;
                    }
                    log1Var3 = log1Var2;
                    this.f165156d = log1Var3;
                    this.f165154b = null;
                    this.f165155c = 2;
                    if (((cog1) cog1Var2).f40257a.invoke(log1Var2, this) == yukVar2) {
                        return yukVar2;
                    }
                    log1Var4 = log1Var3;
                    tjg1VarM70755f = ps3Var.m70755f(str, (dlr0) this.f165160h);
                    this.f165156d = tjg1VarM70755f;
                    this.f165154b = log1Var4;
                    this.f165155c = 3;
                    objMo26158a = tjg1VarM70755f.mo26158a(j, this);
                    if (objMo26158a != yukVar2) {
                        return yukVar2;
                    }
                    log1Var5 = log1Var4;
                    tjg1Var = tjg1VarM70755f;
                    this.f165156d = tjg1Var;
                    this.f165154b = null;
                    this.f165155c = 4;
                    if (((cog1) objMo26158a).f40257a.invoke(log1Var5, this) == yukVar2) {
                        return yukVar2;
                    }
                    egg1 egg1Var3 = new egg1(tjg1Var, str, (fog1) this.f165161i, (okj0) ps3Var.f180734k);
                    dc31Var2.f47418e = egg1Var3;
                    return egg1Var3;
                } catch (zzhg e) {
                    throw e;
                } catch (Exception e2) {
                    throw new zzhg(zz11.f287823d2, zz11.f287821d, e2.getMessage(), 8);
                }
            default:
                svd0 svd0Var = (svd0) this.f165161i;
                xuk xukVar = (xuk) this.f165156d;
                int i4 = this.f165155c;
                int i5 = 0;
                ?? r7 = 0;
                ?? r8 = 0;
                Object d171Var = yuk.f276404a;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    String str2 = this.f165159g;
                    pjq pjqVarM89574q2 = x0h1.m89574q(xukVar, null, 0, new mvd0(svd0Var, str2, r8 == true ? 1 : 0, 1), 3);
                    pjqVarM89574q = x0h1.m89574q(xukVar, null, 0, new mvd0(svd0Var, str2, r7 == true ? 1 : 0, 0), 3);
                    this.f165156d = null;
                    this.f165157e = pjqVarM89574q;
                    this.f165155c = 1;
                    objM38777P = pjqVarM89574q2.m38777P(this);
                    if (objM38777P != d171Var) {
                    }
                    return d171Var;
                }
                if (i4 == 1) {
                    pjqVarM89574q = (pjq) this.f165157e;
                    bga.m29073P(obj);
                    objM38777P = obj;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nwd0 nwd0Var2 = (nwd0) this.f165154b;
                    bga.m29073P(obj);
                    nwd0Var = nwd0Var2;
                    objMo26597I = obj;
                }
                List list = (List) objMo26597I;
                boolean z = nwd0Var.f159100b;
                arrayList = nwd0Var.f159101c;
                if (!arrayList.isEmpty() || list.isEmpty()) {
                    arrayList2 = lau.f131415a;
                } else {
                    List listM43711Y0 = g6f.m43711Y0(list, new fd11(15));
                    arrayList2 = new ArrayList();
                    int size = listM43711Y0.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size) {
                        doc docVar = (doc) listM43711Y0.get(i6);
                        int i8 = i6 + 1;
                        doc docVar2 = (doc) g6f.m43747t0(i8, listM43711Y0);
                        long j2 = docVar2 != null ? docVar2.f51008a : Long.MAX_VALUE;
                        int i9 = i6 == 0 ? i5 : i7;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                i = size;
                            }
                            i = size;
                            if (((jd71) arrayList.get(i7)).f111278a >= j2) {
                            }
                            i7++;
                            size = i;
                            break;
                            break;
                        }
                        arrayList2.add(new hrc(docVar, i9, i7));
                        size = i;
                        i6 = i8;
                        i5 = 0;
                    }
                }
                ?? r14 = arrayList2;
                erc1Var = ((fvd0) this.f165160h).f73759b;
                if (erc1Var == null) {
                    iM75429D = rfg1.m75429D(n6f.f150864d);
                } else {
                    w240Var = erc1Var.f62079a.f139525b;
                    if (w240Var != null || (ufuVar = w240Var.f247223b.f112823a) == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(rfg1.m75429D(ufuVar.f229876c));
                    }
                    if (numValueOf != null) {
                        iM75429D = numValueOf.intValue();
                    } else {
                        iM75429D = rfg1.m75429D(n6f.f150864d);
                    }
                }
                int i10 = iM75429D;
                mwd0 mwd0Var = nwd0Var.f159102d;
                d171Var = new d171(z, this.f165158f, arrayList, i10, r14, mwd0Var != null ? mwd0Var.f147770b : null);
                return d171Var;
                nwd0Var = (nwd0) objM38777P;
                if (nwd0Var == null) {
                    return null;
                }
                this.f165156d = null;
                this.f165157e = null;
                this.f165154b = nwd0Var;
                this.f165155c = 2;
                objMo26597I = pjqVarM89574q.mo26597I(this);
                if (objMo26597I != d171Var) {
                    List list2 = (List) objMo26597I;
                    boolean z2 = nwd0Var.f159100b;
                    arrayList = nwd0Var.f159101c;
                    if (arrayList.isEmpty()) {
                        arrayList2 = lau.f131415a;
                    } else {
                        arrayList2 = lau.f131415a;
                    }
                    ?? r15 = arrayList2;
                    erc1Var = ((fvd0) this.f165160h).f73759b;
                    if (erc1Var == null) {
                        iM75429D = rfg1.m75429D(n6f.f150864d);
                    } else {
                        w240Var = erc1Var.f62079a.f139525b;
                        if (w240Var != null) {
                            numValueOf = null;
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iM75429D = numValueOf.intValue();
                        } else {
                            iM75429D = rfg1.m75429D(n6f.f150864d);
                        }
                    }
                    int i11 = iM75429D;
                    mwd0 mwd0Var2 = nwd0Var.f159102d;
                    d171Var = new d171(z2, this.f165158f, arrayList, i11, r15, mwd0Var2 != null ? mwd0Var2.f147770b : null);
                }
                return d171Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogg1(fvd0 fvd0Var, svd0 svd0Var, long j, String str, fbk fbkVar) {
        super(2, fbkVar);
        this.f165160h = fvd0Var;
        this.f165161i = svd0Var;
        this.f165158f = j;
        this.f165159g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogg1(dc31 dc31Var, log1 log1Var, String str, long j, dlr0 dlr0Var, fog1 fog1Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f165157e = dc31Var;
        this.f165154b = log1Var;
        this.f165159g = str;
        this.f165158f = j;
        this.f165160h = dlr0Var;
        this.f165161i = fog1Var;
    }
}
