package p204p;

import com.google.android.recaptcha.internal.zzhg;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147689a;

    /* JADX INFO: renamed from: b */
    public int f147690b;

    /* JADX INFO: renamed from: c */
    public Object f147691c;

    /* JADX INFO: renamed from: d */
    public Object f147692d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f147693e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f147694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw2(int i, Object obj, Object obj2, Object obj3, Object obj4, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = i;
        this.f147692d = obj;
        this.f147691c = obj2;
        this.f147693e = obj3;
        this.f147694f = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.hqi0, p.r9] */
    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f147689a) {
            case 0:
                return new mw2((kc5) this.f147694f, (String) this.f147693e, fbkVar);
            case 1:
                return new mw2((q3v) this.f147692d, (EsPlayOrigin$PlayOrigin) this.f147693e, (EsLoggingParams$LoggingParams) this.f147694f, (String) this.f147691c, fbkVar);
            case 2:
                return new mw2((if11) this.f147692d, (fiz) this.f147691c, (hqi0) this.f147693e, this.f147694f, fbkVar);
            case 3:
                return new mw2((lgq0) this.f147691c, (th00) this.f147693e, (u6l0) this.f147694f, fbkVar, 3);
            case 4:
                return new mw2(4, (izh) this.f147692d, (ContextTrack) this.f147691c, (PlayerState) this.f147693e, (zgw0) this.f147694f, fbkVar);
            case 5:
                mw2 mw2Var = new mw2((w861) this.f147693e, (th00) this.f147694f, fbkVar);
                mw2Var.f147691c = obj;
                return mw2Var;
            case 6:
                mw2 mw2Var2 = new mw2((x4b) this.f147693e, (yle) this.f147694f, (String) this.f147691c, fbkVar);
                mw2Var2.f147692d = obj;
                return mw2Var2;
            case 7:
                return new mw2(7, (x4b) this.f147692d, (xt60) this.f147691c, (C2148n1) this.f147693e, (C2401t5) this.f147694f, fbkVar);
            case 8:
                return new mw2(8, (qdp0) this.f147692d, (rv41) this.f147691c, (hvc1) this.f147693e, (gh00) this.f147694f, fbkVar);
            case 9:
                mw2 mw2Var3 = new mw2((mv81) this.f147691c, (mv31) this.f147693e, (fv31) this.f147694f, fbkVar, 9);
                mw2Var3.f147692d = obj;
                return mw2Var3;
            case 10:
                return new mw2((smg1) this.f147691c, (sof1) this.f147693e, (gef1) this.f147694f, fbkVar, 10);
            case 11:
                return new mw2((y0i0) this.f147691c, (smg1) this.f147693e, (fff1) this.f147694f, fbkVar, 11);
            case 12:
                mw2 mw2Var4 = new mw2((svf1) this.f147693e, (String) this.f147691c, (aef1) this.f147694f, fbkVar);
                mw2Var4.f147692d = obj;
                return mw2Var4;
            default:
                return new mw2((aef1) this.f147691c, (log1) this.f147693e, (u1g1) this.f147694f, fbkVar, 13);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f147689a) {
            case 0:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 3:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 4:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 5:
                return ((mw2) create((x121) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 6:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 7:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 8:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 9:
                return ((mw2) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 10:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 11:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 12:
                return ((mw2) create((log1) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((mw2) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x014c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [p.hqi0, p.niz, p.r9] */
    /* JADX WARN: Type inference failed for: r4v12, types: [p.mb61, p.th00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM89557A;
        Object objM55987b;
        ru00 ru00Var;
        String str;
        nlv0 nlv0Var;
        w861 w861Var;
        Object objInvoke;
        Object objM48594b;
        qdp0 qdp0Var;
        smg1 smg1Var;
        Object objMo72231a;
        rlv0 rlv0Var;
        Object objM76978s;
        zzhg zzhgVar;
        String strM40485d;
        log1 log1Var;
        Object cog1Var;
        s9f1 s9f1VarM25730x;
        Object objM33504a;
        switch (this.f147689a) {
            case 0:
                String str2 = (String) this.f147693e;
                kc5 kc5Var = (kc5) this.f147694f;
                int i = this.f147690b;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        bga.m29073P(obj);
                        objM89557A = obj;
                    } else if (i == 2) {
                        String str3 = (String) this.f147691c;
                        ru00 ru00Var2 = (ru00) this.f147692d;
                        bga.m29073P(obj);
                        str = str3;
                        ru00Var = ru00Var2;
                        objM55987b = obj;
                        ru00.m76408b(ru00Var, str, (String) objM55987b, null, null, 28);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                luk lukVarM55990e = kc5.m55990e(kc5Var);
                fa2 fa2Var = new fa2(kc5Var, str2, null, 8);
                this.f147690b = 1;
                objM89557A = x0h1.m89557A(lukVarM55990e, fa2Var, this);
                if (objM89557A == yukVar) {
                    return yukVar;
                }
                if (((Boolean) objM89557A).booleanValue()) {
                    ru00 ru00VarM55989d = kc5.m55989d(kc5Var);
                    String uri = kc5.m55992g(kc5Var).getUri();
                    e6a0 e6a0VarM55991f = kc5.m55991f(kc5Var);
                    this.f147692d = ru00VarM55989d;
                    this.f147691c = uri;
                    this.f147690b = 2;
                    objM55987b = kc5.m55987b(kc5Var, e6a0VarM55991f, this);
                    if (objM55987b == yukVar) {
                        return yukVar;
                    }
                    ru00Var = ru00VarM55989d;
                    str = uri;
                    ru00.m76408b(ru00Var, str, (String) objM55987b, null, null, 28);
                } else {
                    String uri2 = kc5.m55992g(kc5Var).getUri();
                    this.f147690b = 3;
                    if (kc5.m55994i(kc5Var, uri2, str2, this) == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f147690b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    wt80 wt80Var = ((q3v) this.f147692d).f184968b;
                    EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) this.f147693e;
                    wj50.m88279p(esPlayOrigin$PlayOrigin);
                    EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) this.f147694f;
                    wj50.m88279p(esLoggingParams$LoggingParams);
                    st80 st80Var = new st80(null, null, null, false, null, a5u0.f12598a, null, 0, null, 479);
                    String str4 = (String) this.f147691c;
                    this.f147690b = 1;
                    Object objM88912b = wt80.m88912b(wt80Var, str4, st80Var, null, esPlayOrigin$PlayOrigin, null, null, esLoggingParams$LoggingParams, null, this, 180);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM88912b == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                fiz fizVar = (fiz) this.f147691c;
                ?? r1 = (AbstractC2330r9) this.f147693e;
                int i3 = this.f147690b;
                yuk yukVar3 = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            bga.m29073P(obj);
                            this.f147690b = 3;
                            if (fizVar.collect(r1, this) == yukVar3) {
                                return yukVar3;
                            }
                        } else if (i3 != 3 && i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    bga.m29073P(obj);
                } else {
                    bga.m29073P(obj);
                    if11 if11Var = (if11) this.f147692d;
                    if (if11Var == hf11.f90581a) {
                        this.f147690b = 1;
                        if (fizVar.collect(r1, this) == yukVar3) {
                            return yukVar3;
                        }
                    } else if (if11Var == hf11.f90582b) {
                        du51 du51VarM75000j = r1.m75000j();
                        rqf rqfVar = new rqf(2);
                        this.f147690b = 2;
                        if (vyf1.m86756u(du51VarM75000j, rqfVar, this) == yukVar3) {
                            return yukVar3;
                        }
                        this.f147690b = 3;
                        if (fizVar.collect(r1, this) == yukVar3) {
                            return yukVar3;
                        }
                    } else {
                        fiz fizVarM62953p = mvl0.m62953p(if11Var.mo33756a(r1.m75000j()));
                        sqt sqtVar = new sqt(fizVar, (hqi0) r1, this.f147694f, (fbk) null);
                        this.f147690b = 4;
                        if (wxf1.m89250g(fizVarM62953p, sqtVar, this) == yukVar3) {
                            return yukVar3;
                        }
                    }
                }
                return w2a1.f247311a;
            case 3:
                int i4 = this.f147690b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    if (((lgq0) this.f147691c).f248420a) {
                        nlv0Var = new nlv0();
                        th00 th00Var = (th00) this.f147693e;
                        tjz tjzVarM57708m = kyf1.m57708m(rxf1.m76627l((bqa) ((u6l0) this.f147694f).f227383b), new zva0(nlv0Var, null, 1));
                        this.f147692d = nlv0Var;
                        this.f147690b = 1;
                        Object objInvoke2 = th00Var.invoke(tjzVarM57708m, this);
                        yuk yukVar4 = yuk.f276404a;
                        if (objInvoke2 == yukVar4) {
                            return yukVar4;
                        }
                    }
                    return w2a1.f247311a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nlv0Var = (nlv0) this.f147692d;
                bga.m29073P(obj);
                if (!nlv0Var.f155174a) {
                    throw new IllegalStateException("You must collect the progress flow");
                }
                return w2a1.f247311a;
            case 4:
                ContextTrack contextTrack = (ContextTrack) this.f147691c;
                int i5 = this.f147690b;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    h0p h0pVarM52017f = izh.m52017f((izh) this.f147692d);
                    String strUri = contextTrack.uri();
                    String strContextUri = ((PlayerState) this.f147693e).contextUri();
                    ((zgw0) this.f147694f).getClass();
                    d4t0 d4t0Var = new d4t0(contextTrack.provider());
                    this.f147690b = 1;
                    Object objM46364b = h0pVarM52017f.m46364b(strUri, strContextUri, true, d4t0Var, this);
                    yuk yukVar5 = yuk.f276404a;
                    if (objM46364b == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 5:
                x121 x121Var = (x121) this.f147691c;
                int i6 = this.f147690b;
                if (i6 == 0) {
                    bga.m29073P(obj);
                    w861Var = (w861) this.f147693e;
                    ?? r4 = (mb61) this.f147694f;
                    this.f147691c = null;
                    this.f147692d = w861Var;
                    this.f147690b = 1;
                    objInvoke = r4.invoke(x121Var, this);
                    yuk yukVar6 = yuk.f276404a;
                    if (objInvoke == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w861 w861Var2 = (w861) this.f147692d;
                    bga.m29073P(obj);
                    w861Var = w861Var2;
                    objInvoke = obj;
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return w861Var;
                }
                return null;
            case 6:
                int i7 = this.f147690b;
                try {
                    if (i7 == 0) {
                        bga.m29073P(obj);
                        x4b x4bVar = (x4b) this.f147693e;
                        yle yleVar = (yle) this.f147694f;
                        String str5 = (String) this.f147691c;
                        hu21 hu21Var = (hu21) x4bVar.f258037b;
                        String str6 = yleVar.f274003b;
                        this.f147692d = null;
                        this.f147690b = 1;
                        objM48594b = hu21Var.m48594b("", str6, str5, this);
                        yuk yukVar7 = yuk.f276404a;
                        if (objM48594b == yukVar7) {
                            return yukVar7;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                        objM48594b = obj;
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
                return w2a1.f247311a;
            case 7:
                Set set = ((xt60) this.f147691c).f265778d;
                int i8 = this.f147690b;
                try {
                    if (i8 == 0) {
                        bga.m29073P(obj);
                        fiz fizVarM89867k = ((x4b) this.f147692d).m89867k(set);
                        xld xldVar = new xld((C2401t5) this.f147694f, 22);
                        this.f147690b = 1;
                        Object objCollect = fizVarM89867k.collect(xldVar, this);
                        Object obj2 = yuk.f276404a;
                        set = obj2;
                        if (objCollect == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                        set = set;
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    ((C2148n1) this.f147693e).invoke(set, th);
                }
                return w2a1.f247311a;
            case 8:
                int i9 = this.f147690b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                lg21 lg21Var = (lg21) ((rv41) this.f147691c).getValue();
                if (lg21Var == null || (qdp0Var = (qdp0) this.f147692d) == null) {
                    return w2a1Var;
                }
                lg21Var.m58924b(new k7i0(qdp0Var.m72596b(), new j7i0(si51.f209361d, null, null, "voices_preview", null, null, 502), false, (i7i0) null, 0L, (h7i0) null, (String) null, false, 0, 1020));
                lg21.m58922g(lg21Var, null, null, null, null, 15);
                lg21Var.m58933l();
                fiz fizVarM62953p2 = mvl0.m62953p(new vj61(lg21Var.f133060f, (hvc1) this.f147693e, qdp0Var, 9));
                xaa1 xaa1Var = new xaa1(3, (gh00) this.f147694f);
                this.f147690b = 1;
                Object objCollect2 = fizVarM62953p2.collect(xaa1Var, this);
                yuk yukVar8 = yuk.f276404a;
                return objCollect2 == yukVar8 ? yukVar8 : w2a1Var;
            case 9:
                niz nizVar = (niz) this.f147692d;
                int i10 = this.f147690b;
                if (i10 == 0) {
                    bga.m29073P(obj);
                    Object objInvoke3 = ((mv81) this.f147691c).invoke(((mv31) this.f147693e).mo48706a((fv31) this.f147694f));
                    this.f147692d = null;
                    this.f147690b = 1;
                    Object objEmit = nizVar.emit(objInvoke3, this);
                    yuk yukVar9 = yuk.f276404a;
                    if (objEmit == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 10:
                int i11 = this.f147690b;
                yuk yukVar10 = yuk.f276404a;
                if (i11 == 0) {
                    bga.m29073P(obj);
                    smg1Var = (smg1) this.f147691c;
                    sof1 sof1Var = (sof1) this.f147693e;
                    gef1 gef1Var = (gef1) this.f147694f;
                    this.f147692d = smg1Var;
                    this.f147690b = 1;
                    objMo72231a = sof1Var.mo72231a(gef1Var);
                    if (objMo72231a != yukVar10) {
                    }
                    return yukVar10;
                }
                if (i11 != 1) {
                    bga.m29073P(obj);
                    return obj;
                }
                smg1Var = (smg1) this.f147692d;
                bga.m29073P(obj);
                objMo72231a = obj;
                this.f147692d = null;
                this.f147690b = 2;
                Object objM33504a2 = ((cog1) objMo72231a).m33504a(smg1Var.m78523a(), this);
                if (objM33504a2 != yukVar10) {
                    return objM33504a2;
                }
                return yukVar10;
            case 11:
                y0i0 y0i0Var = (y0i0) this.f147691c;
                try {
                    if (this.f147690b != 0) {
                        rlv0Var = (rlv0) this.f147692d;
                        try {
                            bga.m29073P(obj);
                            objM76978s = obj;
                        } catch (Exception e3) {
                            e = e3;
                            e.getMessage();
                            zzhgVar = (zzhg) rlv0Var.f200373a;
                            if (zzhgVar == null) {
                                throw y0i0.m92582n(y0i0Var, e);
                            }
                            throw zzhgVar;
                        }
                    } else {
                        rlv0 rlv0VarM36622v = dq60.m36622v(obj);
                        try {
                            zuf1 zuf1Var = new zuf1((smg1) this.f147693e, y0i0Var, (fff1) this.f147694f, rlv0VarM36622v, null);
                            this.f147692d = rlv0VarM36622v;
                            this.f147690b = 1;
                            objM76978s = s1h1.m76978s(10000L, new as8(zuf1Var, null, 7), this);
                            yuk yukVar11 = yuk.f276404a;
                            if (objM76978s == yukVar11) {
                                return yukVar11;
                            }
                            rlv0Var = rlv0VarM36622v;
                        } catch (Exception e4) {
                            e = e4;
                            rlv0Var = rlv0VarM36622v;
                            e.getMessage();
                            zzhgVar = (zzhg) rlv0Var.f200373a;
                            if (zzhgVar == null) {
                                throw y0i0.m92582n(y0i0Var, e);
                            }
                            throw zzhgVar;
                        }
                    }
                    return (gff1) objM76978s;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 12:
                int i12 = this.f147690b;
                bga.m29073P(obj);
                if (i12 != 0) {
                    return obj;
                }
                yh9 yh9Var = new yh9((svf1) this.f147693e, (String) this.f147691c, (log1) this.f147692d, (aef1) this.f147694f, (fbk) null);
                this.f147690b = 1;
                Object objM56684z = kk40.m56684z(yh9Var, this);
                yuk yukVar12 = yuk.f276404a;
                return objM56684z == yukVar12 ? yukVar12 : objM56684z;
            default:
                zz11 zz11Var = zz11.f287823d2;
                u1g1 u1g1Var = (u1g1) this.f147694f;
                int i13 = this.f147690b;
                fbk fbkVar = null;
                boolean z = false;
                yuk yukVar13 = yuk.f276404a;
                try {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            bga.m29073P(obj);
                            objM33504a = obj;
                        } else {
                            log1 log1Var2 = (log1) this.f147692d;
                            bga.m29073P(obj);
                            log1Var = log1Var2;
                            cog1Var = obj;
                        }
                        uff1 uff1VarM29124x = bgf1.m29124x();
                        vff1 vff1VarM25853w = agf1.m25853w();
                        vff1VarM25853w.m85362j((String) objM33504a);
                        uff1VarM29124x.m82995i((agf1) vff1VarM25853w.m52814g());
                        return q3d0.m72089T(u1g1Var, (bgf1) uff1VarM29124x.m52814g());
                    }
                    bga.m29073P(obj);
                    aef1 aef1Var = (aef1) this.f147691c;
                    if (aef1Var == null || (s9f1VarM25730x = aef1Var.m25730x()) == null) {
                        strM40485d = null;
                    } else {
                        a0h1 a0h1VarM40481e = f0h1.m40481e();
                        byte[] bArrM77584y = s9f1VarM25730x.m77584y();
                        String strM40485d2 = a0h1VarM40481e.m40485d(bArrM77584y, bArrM77584y.length);
                        szg1 szg1VarM97231a = zyg1.m97231a();
                        Charset charset = StandardCharsets.UTF_8;
                        byte[] bArrMo63197b = szg1VarM97231a.mo42626A(strM40485d2).mo63197b();
                        r9f1 r9f1VarM77580w = s9f1.m77580w(0, bArrMo63197b, bArrMo63197b.length);
                        a0h1 a0h1VarM40482f = f0h1.m40482f();
                        byte[] bArrM77584y2 = r9f1VarM77580w.m77584y();
                        strM40485d = a0h1VarM40482f.m40485d(bArrM77584y2, bArrM77584y2.length);
                    }
                    if (strM40485d == null || strM40485d.length() == 0) {
                        throw new zzhg(zz11Var, zz11.f287800U1, (String) (z ? 1 : 0), 12);
                    }
                    log1Var = (log1) this.f147693e;
                    c3g1 c3g1Var = u1g1Var.f225819a;
                    this.f147692d = log1Var;
                    this.f147690b = 1;
                    cog1Var = new cog1(new dnc(c3g1Var, strM40485d, fbkVar, 24));
                    if (cog1Var == yukVar13) {
                        return yukVar13;
                    }
                    this.f147692d = null;
                    this.f147690b = 2;
                    objM33504a = ((cog1) cog1Var).m33504a(log1Var, this);
                    if (objM33504a == yukVar13) {
                        return yukVar13;
                    }
                    uff1 uff1VarM29124x2 = bgf1.m29124x();
                    vff1 vff1VarM25853w2 = agf1.m25853w();
                    vff1VarM25853w2.m85362j((String) objM33504a);
                    uff1VarM29124x2.m82995i((agf1) vff1VarM25853w2.m52814g());
                    return q3d0.m72089T(u1g1Var, (bgf1) uff1VarM29124x2.m52814g());
                } catch (Exception e5) {
                    throw new zzhg(zz11Var, zz11.f287799U0, e5.getMessage(), e5);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw2(Object obj, Object obj2, Object obj3, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f147689a = i;
        this.f147691c = obj;
        this.f147693e = obj2;
        this.f147694f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(kc5 kc5Var, String str, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 0;
        this.f147694f = kc5Var;
        this.f147693e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(x4b x4bVar, yle yleVar, String str, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 6;
        this.f147693e = x4bVar;
        this.f147694f = yleVar;
        this.f147691c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(q3v q3vVar, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 1;
        this.f147692d = q3vVar;
        this.f147693e = esPlayOrigin$PlayOrigin;
        this.f147694f = esLoggingParams$LoggingParams;
        this.f147691c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mw2(if11 if11Var, fiz fizVar, hqi0 hqi0Var, Object obj, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 2;
        this.f147692d = if11Var;
        this.f147691c = fizVar;
        this.f147693e = (AbstractC2330r9) hqi0Var;
        this.f147694f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mw2(w861 w861Var, th00 th00Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 5;
        this.f147693e = w861Var;
        this.f147694f = (mb61) th00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(svf1 svf1Var, String str, aef1 aef1Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f147689a = 12;
        this.f147693e = svf1Var;
        this.f147691c = str;
        this.f147694f = aef1Var;
    }
}
