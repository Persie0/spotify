package p204p;

import com.spotify.player.model.Context;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class i620 extends mb61 implements th00 {

    /* JADX INFO: renamed from: X */
    public Object f99079X;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99080a = 2;

    /* JADX INFO: renamed from: b */
    public int f99081b;

    /* JADX INFO: renamed from: c */
    public int f99082c;

    /* JADX INFO: renamed from: d */
    public Object f99083d;

    /* JADX INFO: renamed from: e */
    public Object f99084e;

    /* JADX INFO: renamed from: f */
    public Object f99085f;

    /* JADX INFO: renamed from: g */
    public Object f99086g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f99087h;

    /* JADX INFO: renamed from: i */
    public Object f99088i;

    /* JADX INFO: renamed from: t */
    public Object f99089t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i620(Object obj, fbk fbkVar, sn0 sn0Var, luk lukVar, ynb ynbVar, e3p e3pVar, c7l0 c7l0Var) {
        super(2, fbkVar);
        this.f99084e = obj;
        this.f99085f = sn0Var;
        this.f99086g = lukVar;
        this.f99087h = ynbVar;
        this.f99088i = e3pVar;
        this.f99089t = c7l0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f99080a) {
            case 0:
                i620 i620Var = new i620(this.f99084e, fbkVar, (sn0) this.f99085f, (luk) this.f99086g, (ynb) this.f99087h, (e3p) this.f99088i, (c7l0) this.f99089t);
                i620Var.f99083d = obj;
                return i620Var;
            case 1:
                i620 i620Var2 = new i620((C2065kt) this.f99087h, (uns0) this.f99088i, (gh00) this.f99089t, (pns0) this.f99079X, fbkVar);
                i620Var2.f99083d = obj;
                return i620Var2;
            case 2:
                i620 i620Var3 = new i620(this.f99084e, fbkVar, (rlv0) this.f99085f, (rlv0) this.f99086g, (hf21) this.f99087h);
                i620Var3.f99083d = obj;
                return i620Var3;
            default:
                return new i620((List) this.f99084e, (zw31) this.f99085f, (ijq) this.f99086g, (ijq) this.f99087h, (sr4) this.f99088i, (VoiceAssistantLoggingContext) this.f99089t, (CommandPlayRequest) this.f99079X, fbkVar);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99080a) {
            case 0:
                return ((i620) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((i620) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((i620) create((niz) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((i620) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0325  */
    /* JADX WARN: Code duplicated, block: B:120:0x0338  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[PHI: r1 r12
      0x007c: PHI (r1v9 java.util.Iterator) = (r1v11 java.util.Iterator), (r1v14 java.util.Iterator) binds: [B:18:0x0077, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r12v8 int) = (r12v12 int), (r12v17 int) binds: [B:18:0x0077, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[PHI: r12
      0x00b6: PHI (r12v5 com.spotify.voiceassistants.playermodels.CommandPlayResponse) = 
      (r12v9 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
      (r12v14 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
      (r12v14 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
     binds: [B:16:0x0059, B:24:0x00a7, B:26:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0272, code lost:
    
        if (p204p.wxf1.m89250g(r7, r8, r17) == r14) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0099 -> B:23:0x009c). Please report as a decompilation issue!!! */
    @Override // p204p.ly8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        niz nizVar;
        int i;
        Object c6x0Var;
        u620 u620Var;
        Object c6x0Var2;
        Object q4n0Var;
        pns0 pns0Var;
        uns0 uns0Var;
        int i2;
        gh00 gh00Var;
        niz nizVar2;
        int i3;
        Object objM48221p;
        Iterator it;
        CommandPlayResponse commandPlayResponse;
        CommandPlayResponse commandPlayResponse2;
        int iM43713a1;
        sr4 sr4Var;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext;
        int i4;
        Object objM97110d;
        int iIntValue;
        Object objM89557A;
        luk lukVar;
        y7y0 y7y0Var;
        switch (this.f99080a) {
            case 0:
                sn0 sn0Var = (sn0) this.f99085f;
                int i5 = this.f99081b;
                w2a1 w2a1Var = w2a1.f247311a;
                fbk fbkVar = null;
                yuk yukVar = yuk.f276404a;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    niz nizVar3 = (niz) this.f99083d;
                    uft uftVar = (uft) this.f99084e;
                    sn0Var.invoke(Boolean.TRUE);
                    try {
                        luk lukVar2 = (luk) this.f99086g;
                        dbz dbzVar = new dbz((ynb) this.f99087h, (e3p) this.f99088i, uftVar, fbkVar, 22);
                        this.f99083d = null;
                        this.f99079X = nizVar3;
                        this.f99082c = 0;
                        this.f99081b = 1;
                        if (x0h1.m89557A(lukVar2, dbzVar, this) != yukVar) {
                            nizVar = nizVar3;
                            i = 0;
                            c6x0Var = w2a1Var;
                            if (s6x0.m77348a(c6x0Var) == null) {
                                sn0Var.invoke(Boolean.FALSE);
                                ((c7l0) this.f99089t).mo31751N().m28388d();
                                return w2a1Var;
                            }
                            sn0Var.invoke(Boolean.FALSE);
                            qlg1.m73220y(getContext());
                            u620Var = new u620(2);
                            this.f99083d = null;
                            this.f99079X = null;
                            this.f99082c = i;
                            this.f99081b = 2;
                            if (nizVar.emit(u620Var, this) != yukVar) {
                                return w2a1Var;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        nizVar = nizVar3;
                        i = 0;
                        c6x0Var = new c6x0(th);
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                        return w2a1Var;
                    }
                    i = this.f99082c;
                    nizVar = (niz) this.f99079X;
                    try {
                        bga.m29073P(obj);
                        c6x0Var = w2a1Var;
                    } catch (Throwable th2) {
                        th = th2;
                        c6x0Var = new c6x0(th);
                    }
                    if (s6x0.m77348a(c6x0Var) == null) {
                        sn0Var.invoke(Boolean.FALSE);
                        ((c7l0) this.f99089t).mo31751N().m28388d();
                        return w2a1Var;
                    }
                    sn0Var.invoke(Boolean.FALSE);
                    qlg1.m73220y(getContext());
                    u620Var = new u620(2);
                    this.f99083d = null;
                    this.f99079X = null;
                    this.f99082c = i;
                    this.f99081b = 2;
                    if (nizVar.emit(u620Var, this) != yukVar) {
                        return w2a1Var;
                    }
                }
                return yukVar;
            case 1:
                pns0 pns0Var2 = (pns0) this.f99079X;
                gh00 gh00Var2 = (gh00) this.f99089t;
                uns0 uns0Var2 = (uns0) this.f99088i;
                int i6 = this.f99082c;
                w2a1 w2a1Var2 = w2a1.f247311a;
                fbk fbkVar2 = null;
                yuk yukVar2 = yuk.f276404a;
                try {
                    if (i6 == 0) {
                        bga.m29073P(obj);
                        vyr0 vyr0Var = (vyr0) ((C2065kt) this.f99087h).f126081d;
                        String strMo73361c = uns0Var2.mo73361c();
                        this.f99083d = null;
                        this.f99084e = uns0Var2;
                        this.f99085f = gh00Var2;
                        this.f99086g = pns0Var2;
                        this.f99081b = 0;
                        this.f99082c = 1;
                        q4n0Var = new q4n0(((mu80) ((wt80) vyr0Var.f246313b)).m62846k(strMo73361c, (st80) vyr0Var.f246316e), vyr0Var, 22);
                        if (q4n0Var != yukVar2) {
                            pns0Var = pns0Var2;
                            uns0Var = uns0Var2;
                            i2 = 0;
                            gh00Var = gh00Var2;
                        }
                        return yukVar2;
                    }
                    if (i6 == 1) {
                        i2 = this.f99081b;
                        pns0 pns0Var3 = (pns0) this.f99086g;
                        gh00 gh00Var3 = (gh00) this.f99085f;
                        uns0 uns0Var3 = (uns0) this.f99084e;
                        bga.m29073P(obj);
                        pns0Var = pns0Var3;
                        uns0Var = uns0Var3;
                        gh00Var = gh00Var3;
                        q4n0Var = obj;
                    } else {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    c6x0Var2 = w2a1Var2;
                    Throwable thM77348a = s6x0.m77348a(c6x0Var2);
                    if (thM77348a == null) {
                        return w2a1Var2;
                    }
                    na6.m63972t("PromptableSectionElement: Error fetching promptable section for listUri=" + uns0Var2.mo73361c(), thM77348a);
                    gh00Var2.invoke(new tns0(pns0Var2.f179526b, pns0Var2.f179527c, pns0Var2.f179525a));
                    return w2a1Var2;
                    fiz fizVar = (fiz) q4n0Var;
                    kbi0 kbi0Var = new kbi0(gh00Var, uns0Var, pns0Var, fbkVar2, 11);
                    this.f99083d = null;
                    this.f99084e = null;
                    this.f99085f = null;
                    this.f99086g = null;
                    this.f99081b = i2;
                    this.f99082c = 2;
                } catch (Throwable th3) {
                    c6x0Var2 = new c6x0(th3);
                }
                break;
            case 2:
                rlv0 rlv0Var = (rlv0) this.f99085f;
                int i7 = this.f99081b;
                yuk yukVar3 = yuk.f276404a;
                if (i7 == 0) {
                    bga.m29073P(obj);
                    nizVar2 = (niz) this.f99083d;
                    Set setM43736n1 = g6f.m43736n1(((jf21) this.f99084e).f111807a);
                    if (!setM43736n1.equals(rlv0Var.f200373a)) {
                        rlv0Var.f200373a = setM43736n1;
                        this.f99083d = null;
                        this.f99079X = nizVar2;
                        this.f99088i = setM43736n1;
                        this.f99089t = this;
                        i3 = 0;
                        this.f99082c = 0;
                        this.f99081b = 1;
                        hqb hqbVar = new hqb(1, seg1.m77914f(this));
                        hqbVar.m48222q();
                        ki5.m56473e().m42761b(new qk8(hqbVar, (rlv0) this.f99086g, setM43736n1, (hf21) this.f99087h, 15));
                        objM48221p = hqbVar.m48221p();
                        if (objM48221p == yukVar3) {
                            return yukVar3;
                        }
                        this.f99083d = null;
                        this.f99079X = null;
                        this.f99088i = null;
                        this.f99089t = null;
                        this.f99082c = i3;
                        this.f99081b = 2;
                        if (nizVar2.emit((mf21) objM48221p, this) == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else if (i7 == 1) {
                    i3 = this.f99082c;
                    nizVar2 = (niz) this.f99079X;
                    bga.m29073P(obj);
                    objM48221p = obj;
                    this.f99083d = null;
                    this.f99079X = null;
                    this.f99088i = null;
                    this.f99089t = null;
                    this.f99082c = i3;
                    this.f99081b = 2;
                    if (nizVar2.emit((mf21) objM48221p, this) == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                List list = (List) this.f99084e;
                zw31 zw31Var = (zw31) this.f99085f;
                int i8 = this.f99082c;
                w2a1 w2a1Var3 = w2a1.f247311a;
                int i9 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                yuk yukVar4 = yuk.f276404a;
                if (i8 == 0) {
                    bga.m29073P(obj);
                    it = list.iterator();
                    commandPlayResponse = null;
                    if (it.hasNext()) {
                        iIntValue = ((Number) it.next()).intValue();
                        lukVar = zw31Var.f286910g;
                        y7y0Var = new y7y0(iIntValue, 1, objArr2 == true ? 1 : 0);
                        this.f99083d = it;
                        this.f99081b = iIntValue;
                        this.f99082c = i9;
                        if (x0h1.m89557A(lukVar, y7y0Var, this) != yukVar4) {
                            ((ijq) this.f99086g).invoke();
                            luk lukVar3 = zw31Var.f286911h;
                            ww31 ww31Var = new ww31(zw31Var, (CommandPlayRequest) this.f99079X, objArr == true ? 1 : 0, 0);
                            this.f99083d = it;
                            this.f99081b = iIntValue;
                            this.f99082c = 2;
                            objM89557A = x0h1.m89557A(lukVar3, ww31Var, this);
                            if (objM89557A != yukVar4) {
                            }
                        }
                    } else {
                        commandPlayResponse2 = commandPlayResponse;
                        ((ijq) this.f99087h).invoke();
                        iM43713a1 = g6f.m43713a1(list);
                        sr4Var = (sr4) this.f99088i;
                        voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f99089t;
                        this.f99083d = null;
                        this.f99082c = 3;
                        zw31Var.getClass();
                        i4 = commandPlayResponse2 != null ? wj50.m88271j(commandPlayResponse2.getPlaybackReadiness(), "FAILED") ? 2 : 3 : 2;
                        Context context = commandPlayResponse2 != null ? commandPlayResponse2.getContext() : null;
                        if (commandPlayResponse2 == null && wj50.m88271j(commandPlayResponse2.getPlaybackReadiness(), "READY") && context != null) {
                            objM97110d = zw31Var.m97110d(commandPlayResponse2, context, sr4Var, voiceAssistantLoggingContext, this);
                            if (objM97110d != yukVar4) {
                            }
                            if (objM97110d != yukVar4) {
                                return w2a1Var3;
                            }
                        } else {
                            zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                        }
                        objM97110d = w2a1Var3;
                        if (objM97110d != yukVar4) {
                            return w2a1Var3;
                        }
                    }
                    return yukVar4;
                }
                if (i8 == 1) {
                    int i10 = this.f99081b;
                    Iterator it2 = (Iterator) this.f99083d;
                    bga.m29073P(obj);
                    iIntValue = i10;
                    it = it2;
                    ((ijq) this.f99086g).invoke();
                    luk lukVar4 = zw31Var.f286911h;
                    ww31 ww31Var2 = new ww31(zw31Var, (CommandPlayRequest) this.f99079X, objArr == true ? 1 : 0, 0);
                    this.f99083d = it;
                    this.f99081b = iIntValue;
                    this.f99082c = 2;
                    objM89557A = x0h1.m89557A(lukVar4, ww31Var2, this);
                    if (objM89557A != yukVar4) {
                    }
                    return yukVar4;
                }
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var3;
                }
                it = (Iterator) this.f99083d;
                bga.m29073P(obj);
                objM89557A = obj;
                commandPlayResponse = (CommandPlayResponse) objM89557A;
                if (!wj50.m88271j(commandPlayResponse.getPlaybackReadiness(), "READY") || wj50.m88271j(commandPlayResponse.getPlaybackReadiness(), "FAILED")) {
                    commandPlayResponse2 = commandPlayResponse;
                    ((ijq) this.f99087h).invoke();
                    iM43713a1 = g6f.m43713a1(list);
                    sr4Var = (sr4) this.f99088i;
                    voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f99089t;
                    this.f99083d = null;
                    this.f99082c = 3;
                    zw31Var.getClass();
                    if (commandPlayResponse2 != null) {
                    }
                    if (commandPlayResponse2 != null) {
                    }
                    if (commandPlayResponse2 == null) {
                        zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                        objM97110d = w2a1Var3;
                    } else {
                        zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                        objM97110d = w2a1Var3;
                    }
                    if (objM97110d != yukVar4) {
                        return w2a1Var3;
                    }
                } else {
                    i9 = 1;
                    if (it.hasNext()) {
                        iIntValue = ((Number) it.next()).intValue();
                        lukVar = zw31Var.f286910g;
                        y7y0Var = new y7y0(iIntValue, 1, objArr2 == true ? 1 : 0);
                        this.f99083d = it;
                        this.f99081b = iIntValue;
                        this.f99082c = i9;
                        if (x0h1.m89557A(lukVar, y7y0Var, this) != yukVar4) {
                            ((ijq) this.f99086g).invoke();
                            luk lukVar5 = zw31Var.f286911h;
                            ww31 ww31Var3 = new ww31(zw31Var, (CommandPlayRequest) this.f99079X, objArr == true ? 1 : 0, 0);
                            this.f99083d = it;
                            this.f99081b = iIntValue;
                            this.f99082c = 2;
                            objM89557A = x0h1.m89557A(lukVar5, ww31Var3, this);
                            if (objM89557A != yukVar4) {
                                commandPlayResponse = (CommandPlayResponse) objM89557A;
                                if (wj50.m88271j(commandPlayResponse.getPlaybackReadiness(), "READY")) {
                                }
                                commandPlayResponse2 = commandPlayResponse;
                                ((ijq) this.f99087h).invoke();
                                iM43713a1 = g6f.m43713a1(list);
                                sr4Var = (sr4) this.f99088i;
                                voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f99089t;
                                this.f99083d = null;
                                this.f99082c = 3;
                                zw31Var.getClass();
                                if (commandPlayResponse2 != null) {
                                }
                                if (commandPlayResponse2 != null) {
                                }
                                if (commandPlayResponse2 == null) {
                                    zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                                    objM97110d = w2a1Var3;
                                } else {
                                    zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                                    objM97110d = w2a1Var3;
                                }
                                if (objM97110d != yukVar4) {
                                    return w2a1Var3;
                                }
                            }
                        }
                    } else {
                        commandPlayResponse2 = commandPlayResponse;
                        ((ijq) this.f99087h).invoke();
                        iM43713a1 = g6f.m43713a1(list);
                        sr4Var = (sr4) this.f99088i;
                        voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.f99089t;
                        this.f99083d = null;
                        this.f99082c = 3;
                        zw31Var.getClass();
                        if (commandPlayResponse2 != null) {
                        }
                        if (commandPlayResponse2 != null) {
                        }
                        if (commandPlayResponse2 == null) {
                            zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                            objM97110d = w2a1Var3;
                        } else {
                            zw31.m97109c(zw31Var, i4, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext, sr4Var, null, new Integer(iM43713a1), 16);
                            objM97110d = w2a1Var3;
                        }
                        if (objM97110d != yukVar4) {
                            return w2a1Var3;
                        }
                    }
                }
                return yukVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i620(Object obj, fbk fbkVar, rlv0 rlv0Var, rlv0 rlv0Var2, hf21 hf21Var) {
        super(2, fbkVar);
        this.f99084e = obj;
        this.f99085f = rlv0Var;
        this.f99086g = rlv0Var2;
        this.f99087h = hf21Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i620(List list, zw31 zw31Var, ijq ijqVar, ijq ijqVar2, sr4 sr4Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, CommandPlayRequest commandPlayRequest, fbk fbkVar) {
        super(2, fbkVar);
        this.f99084e = list;
        this.f99085f = zw31Var;
        this.f99086g = ijqVar;
        this.f99087h = ijqVar2;
        this.f99088i = sr4Var;
        this.f99089t = voiceAssistantLoggingContext;
        this.f99079X = commandPlayRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i620(C2065kt c2065kt, uns0 uns0Var, gh00 gh00Var, pns0 pns0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f99087h = c2065kt;
        this.f99088i = uns0Var;
        this.f99089t = gh00Var;
        this.f99079X = pns0Var;
    }
}
