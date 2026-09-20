package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class uqv {

    /* JADX INFO: renamed from: a */
    public final String f233121a;

    /* JADX INFO: renamed from: b */
    public final ri00 f233122b;

    /* JADX INFO: renamed from: c */
    public final frv f233123c;

    /* JADX INFO: renamed from: d */
    public final zuv f233124d;

    /* JADX INFO: renamed from: e */
    public final boolean f233125e;

    /* JADX INFO: renamed from: f */
    public final xre f233126f;

    /* JADX INFO: renamed from: g */
    public final wt80 f233127g;

    /* JADX INFO: renamed from: h */
    public final Flowable f233128h;

    /* JADX INFO: renamed from: i */
    public final epx f233129i;

    /* JADX INFO: renamed from: j */
    public final jup f233130j;

    /* JADX INFO: renamed from: k */
    public final wek0 f233131k;

    /* JADX INFO: renamed from: l */
    public final hrw f233132l;

    /* JADX INFO: renamed from: m */
    public final String f233133m;

    /* JADX WARN: Multi-variable type inference failed */
    public uqv(String str, gb80 gb80Var, th00 th00Var, frv frvVar, zuv zuvVar, boolean z, xre xreVar, wt80 wt80Var, k7p0 k7p0Var, Flowable flowable, epx epxVar, jup jupVar, wek0 wek0Var, nbm0 nbm0Var) {
        this.f233121a = str;
        this.f233122b = (ri00) th00Var;
        this.f233123c = frvVar;
        this.f233124d = zuvVar;
        this.f233125e = z;
        this.f233126f = xreVar;
        this.f233127g = wt80Var;
        this.f233128h = flowable;
        this.f233129i = epxVar;
        this.f233130j = jupVar;
        this.f233131k = wek0Var;
        this.f233132l = k7p0Var.m55694a(gb80Var).m77807a();
        kbm0 kbm0Var = nbm0Var.get();
        this.f233133m = kbm0Var != null ? kbm0Var.f121231a : null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83815a(PlayerState playerState, String str) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        return contextTrack != null && wj50.m88271j(contextTrack.uri(), str);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m83816b(String str, d850 d850Var, boolean z, ibk ibkVar) {
        pqv pqvVar;
        z650 z650Var;
        String str2;
        boolean z2;
        v140 v140Var;
        String str3;
        u140 u140Var;
        if (ibkVar instanceof pqv) {
            pqvVar = (pqv) ibkVar;
            int i = pqvVar.f180434g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqvVar.f180434g = i - Integer.MIN_VALUE;
            } else {
                pqvVar = new pqv(this, ibkVar);
            }
        } else {
            pqvVar = new pqv(this, ibkVar);
        }
        Object objMo34397a = pqvVar.f180432e;
        int i2 = pqvVar.f180434g;
        String str4 = this.f233121a;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo34397a);
            pqvVar.f180428a = str;
            pqvVar.f180429b = d850Var;
            pqvVar.f180431d = z;
            pqvVar.f180434g = 1;
            objMo34397a = this.f233123c.mo34397a(str4, d850Var, pqvVar);
            if (objMo34397a != obj) {
            }
        }
        if (i2 == 1) {
            z = pqvVar.f180431d;
            d850Var = pqvVar.f180429b;
            str = pqvVar.f180428a;
            bga.m29073P(objMo34397a);
        } else {
            if (i2 == 2) {
                bga.m29073P(objMo34397a);
                return w2a1Var;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objMo34397a);
                return w2a1Var;
            }
            z2 = pqvVar.f180431d;
            z650Var = pqvVar.f180430c;
            str2 = pqvVar.f180428a;
            bga.m29073P(objMo34397a);
        }
        v140Var = (v140) objMo34397a;
        if (v140Var != null || (u140Var = v140Var.f236247e) == null) {
            str3 = null;
        } else {
            str3 = u140Var.f225679b;
        }
        pqvVar.f180428a = null;
        pqvVar.f180429b = null;
        pqvVar.f180430c = null;
        pqvVar.f180431d = z2;
        pqvVar.f180434g = 4;
        return m83817c(str2, str3, z650Var, pqvVar) == obj ? obj : w2a1Var;
        if (!((Boolean) objMo34397a).booleanValue()) {
            z650Var = d850Var != null ? d850Var.f46380a : null;
            if (z) {
                pqvVar.f180428a = null;
                pqvVar.f180429b = null;
                pqvVar.f180430c = null;
                pqvVar.f180431d = z;
                pqvVar.f180434g = 2;
                if (m83820f(z650Var, pqvVar) == obj) {
                }
            } else {
                pqvVar.f180428a = str;
                pqvVar.f180429b = null;
                pqvVar.f180430c = z650Var;
                pqvVar.f180431d = z;
                pqvVar.f180434g = 3;
                objMo34397a = nug1.m65701m(this.f233129i, str4, pqvVar);
                if (objMo34397a != obj) {
                    boolean z3 = z;
                    str2 = str;
                    z2 = z3;
                    v140Var = (v140) objMo34397a;
                    if (v140Var != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    pqvVar.f180428a = null;
                    pqvVar.f180429b = null;
                    pqvVar.f180430c = null;
                    pqvVar.f180431d = z2;
                    pqvVar.f180434g = 4;
                    if (m83817c(str2, str3, z650Var, pqvVar) == obj) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[PHI: r1 r2 r3 r4 r6
      0x005a: PHI (r1v14 p.d410) = (r1v9 p.d410), (r1v21 p.d410) binds: [B:37:0x00e2, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r2v11 p.z650) = (r2v7 p.z650), (r2v20 p.z650) binds: [B:37:0x00e2, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r3v14 java.lang.String) = (r3v9 java.lang.String), (r3v19 java.lang.String) binds: [B:37:0x00e2, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r4v18 java.lang.Object) = (r4v15 java.lang.Object), (r4v1 java.lang.Object) binds: [B:37:0x00e2, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v10 java.lang.String) binds: [B:37:0x00e2, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0179  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r4 == r12) goto L69;
     */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.ri00, p.th00] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83817c(String str, String str2, z650 z650Var, ibk ibkVar) {
        qqv qqvVar;
        d410 b410Var;
        String str3;
        d410 d410Var;
        String str4;
        z650 z650Var2;
        String str5;
        d410 d410Var2;
        z650 z650Var3;
        PlayerState playerState;
        Object objM83818d;
        z650 z650Var4;
        d410 d410Var3;
        ContextTrack contextTrack;
        z650 z650Var5;
        xul0 xul0VarTrack;
        ContextTrack contextTrack2;
        xf40 xf40VarMetadata;
        uqv uqvVar = this;
        String str6 = str;
        String str7 = str2;
        z650 z650Var6 = z650Var;
        if (ibkVar instanceof qqv) {
            qqvVar = (qqv) ibkVar;
            int i = qqvVar.f191663g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqvVar.f191663g = i - Integer.MIN_VALUE;
            } else {
                qqvVar = new qqv(uqvVar, ibkVar);
            }
        } else {
            qqvVar = new qqv(uqvVar, ibkVar);
        }
        Object objM97078a = qqvVar.f191661e;
        int i2 = qqvVar.f191663g;
        Flowable flowable = uqvVar.f233128h;
        String str8 = uqvVar.f233121a;
        w2a1 w2a1Var = w2a1.f247311a;
        String str9 = null;
        yuk yukVar = yuk.f276404a;
        switch (i2) {
            case 0:
                bga.m29073P(objM97078a);
                if (!uqvVar.f233125e) {
                    qqvVar.f191657a = str6;
                    qqvVar.f191658b = str7;
                    qqvVar.f191659c = z650Var6;
                    qqvVar.f191663g = 2;
                    objM97078a = uqvVar.f233122b.invoke(str6, qqvVar);
                    break;
                } else {
                    try {
                        zuv zuvVar = uqvVar.f233124d;
                        qqvVar.f191657a = str6;
                        qqvVar.f191658b = str7;
                        qqvVar.f191659c = z650Var6;
                        qqvVar.f191663g = 1;
                        objM97078a = zuvVar.m97078a(str8, str6, qqvVar);
                        if (objM97078a != yukVar) {
                            mgz0 mgz0Var = ((ruv) objM97078a).f202916b;
                            b410Var = new b410(mgz0Var.f143675a, !mgz0Var.f143676b);
                            d410 d410Var4 = b410Var;
                            str3 = str6;
                            d410Var = d410Var4;
                            z650 z650Var7 = z650Var6;
                            str4 = str7;
                            z650Var2 = z650Var7;
                            qqvVar.f191657a = str3;
                            qqvVar.f191658b = str4;
                            qqvVar.f191659c = z650Var2;
                            qqvVar.f191660d = d410Var;
                            qqvVar.f191663g = 3;
                            objM97078a = kgg1.m56346i(flowable, 1, qqvVar);
                            if (objM97078a != yukVar) {
                                str5 = str4;
                                d410Var2 = d410Var;
                                Object obj = objM97078a;
                                z650Var3 = z650Var2;
                                playerState = (PlayerState) obj;
                                if (!m83815a(playerState, str8) && ((contextTrack = (ContextTrack) playerState.track().mo49283h()) == null || !e72.m37990X(contextTrack) || e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI) == null)) {
                                    if (d410Var2 instanceof b410) {
                                        b410 b410Var2 = (b410) d410Var2;
                                        long j = b410Var2.f23167a;
                                        boolean z = b410Var2.f23168b;
                                        qqvVar.f191657a = null;
                                        qqvVar.f191658b = null;
                                        qqvVar.f191659c = null;
                                        qqvVar.f191660d = null;
                                        qqvVar.f191663g = 4;
                                        if (uqvVar.m83819e(j, z650Var3, z, qqvVar) == yukVar) {
                                        }
                                    } else if (!(d410Var2 instanceof c410)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return w2a1Var;
                                }
                                qqvVar.f191657a = null;
                                qqvVar.f191658b = null;
                                qqvVar.f191659c = z650Var3;
                                qqvVar.f191660d = d410Var2;
                                qqvVar.f191663g = 5;
                                uqvVar = this;
                                objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                                if (objM83818d != yukVar) {
                                    z650Var4 = z650Var3;
                                    objM97078a = objM83818d;
                                    d410Var3 = d410Var2;
                                    if (((Boolean) objM97078a).booleanValue() && (d410Var3 instanceof b410)) {
                                        FlowableFilter flowableFilterM23360y = flowable.m23360y(new i2v(uqvVar, 2));
                                        qqvVar.f191657a = null;
                                        qqvVar.f191658b = null;
                                        qqvVar.f191659c = z650Var4;
                                        qqvVar.f191660d = null;
                                        qqvVar.f191663g = 6;
                                        objM97078a = kgg1.m56346i(flowableFilterM23360y, 1, qqvVar);
                                        if (objM97078a != yukVar) {
                                            z650Var5 = z650Var4;
                                            xul0VarTrack = ((PlayerState) objM97078a).track();
                                            if (xul0VarTrack != null && (contextTrack2 = (ContextTrack) xul0VarTrack.mo49283h()) != null && (xf40VarMetadata = contextTrack2.metadata()) != null) {
                                                str9 = (String) xf40VarMetadata.get("media.type");
                                            }
                                            if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true) && z650Var5 != null) {
                                                wek0.m87885d(uqvVar.f233131k, z650Var5);
                                            }
                                        }
                                    }
                                    return w2a1Var;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        qlg1.m73220y(qqvVar.getContext());
                        b410Var = c410.f33808a;
                    }
                }
                return yukVar;
            case 1:
                z650 z650Var8 = qqvVar.f191659c;
                str7 = qqvVar.f191658b;
                String str10 = qqvVar.f191657a;
                try {
                    bga.m29073P(objM97078a);
                    z650Var6 = z650Var8;
                    str6 = str10;
                    mgz0 mgz0Var2 = ((ruv) objM97078a).f202916b;
                    b410Var = new b410(mgz0Var2.f143675a, !mgz0Var2.f143676b);
                    break;
                } catch (Exception unused2) {
                    z650Var6 = z650Var8;
                    str6 = str10;
                    qlg1.m73220y(qqvVar.getContext());
                    b410Var = c410.f33808a;
                }
                d410 d410Var5 = b410Var;
                str3 = str6;
                d410Var = d410Var5;
                z650 z650Var9 = z650Var6;
                str4 = str7;
                z650Var2 = z650Var9;
                qqvVar.f191657a = str3;
                qqvVar.f191658b = str4;
                qqvVar.f191659c = z650Var2;
                qqvVar.f191660d = d410Var;
                qqvVar.f191663g = 3;
                objM97078a = kgg1.m56346i(flowable, 1, qqvVar);
                if (objM97078a != yukVar) {
                    str5 = str4;
                    d410Var2 = d410Var;
                    Object obj2 = objM97078a;
                    z650Var3 = z650Var2;
                    playerState = (PlayerState) obj2;
                    if (!m83815a(playerState, str8)) {
                        qqvVar.f191657a = null;
                        qqvVar.f191658b = null;
                        qqvVar.f191659c = z650Var3;
                        qqvVar.f191660d = d410Var2;
                        qqvVar.f191663g = 5;
                        uqvVar = this;
                        objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                        if (objM83818d != yukVar) {
                            z650Var4 = z650Var3;
                            objM97078a = objM83818d;
                            d410Var3 = d410Var2;
                            if (((Boolean) objM97078a).booleanValue()) {
                                FlowableFilter flowableFilterM23360y2 = flowable.m23360y(new i2v(uqvVar, 2));
                                qqvVar.f191657a = null;
                                qqvVar.f191658b = null;
                                qqvVar.f191659c = z650Var4;
                                qqvVar.f191660d = null;
                                qqvVar.f191663g = 6;
                                objM97078a = kgg1.m56346i(flowableFilterM23360y2, 1, qqvVar);
                                if (objM97078a != yukVar) {
                                    z650Var5 = z650Var4;
                                    xul0VarTrack = ((PlayerState) objM97078a).track();
                                    if (xul0VarTrack != null) {
                                        str9 = (String) xf40VarMetadata.get("media.type");
                                    }
                                    if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                        wek0.m87885d(uqvVar.f233131k, z650Var5);
                                    }
                                }
                            }
                        }
                    } else {
                        qqvVar.f191657a = null;
                        qqvVar.f191658b = null;
                        qqvVar.f191659c = z650Var3;
                        qqvVar.f191660d = d410Var2;
                        qqvVar.f191663g = 5;
                        uqvVar = this;
                        objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                        if (objM83818d != yukVar) {
                            z650Var4 = z650Var3;
                            objM97078a = objM83818d;
                            d410Var3 = d410Var2;
                            if (((Boolean) objM97078a).booleanValue()) {
                                FlowableFilter flowableFilterM23360y3 = flowable.m23360y(new i2v(uqvVar, 2));
                                qqvVar.f191657a = null;
                                qqvVar.f191658b = null;
                                qqvVar.f191659c = z650Var4;
                                qqvVar.f191660d = null;
                                qqvVar.f191663g = 6;
                                objM97078a = kgg1.m56346i(flowableFilterM23360y3, 1, qqvVar);
                                if (objM97078a != yukVar) {
                                    z650Var5 = z650Var4;
                                    xul0VarTrack = ((PlayerState) objM97078a).track();
                                    if (xul0VarTrack != null) {
                                        str9 = (String) xf40VarMetadata.get("media.type");
                                    }
                                    if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                        wek0.m87885d(uqvVar.f233131k, z650Var5);
                                    }
                                }
                            }
                        }
                    }
                    return w2a1Var;
                }
                return yukVar;
            case 2:
                z650 z650Var10 = qqvVar.f191659c;
                str7 = qqvVar.f191658b;
                String str11 = qqvVar.f191657a;
                bga.m29073P(objM97078a);
                z650Var6 = z650Var10;
                str6 = str11;
                z650 z650Var11 = z650Var6;
                str4 = str7;
                z650Var2 = z650Var11;
                str3 = str6;
                d410Var = (d410) objM97078a;
                qqvVar.f191657a = str3;
                qqvVar.f191658b = str4;
                qqvVar.f191659c = z650Var2;
                qqvVar.f191660d = d410Var;
                qqvVar.f191663g = 3;
                objM97078a = kgg1.m56346i(flowable, 1, qqvVar);
                if (objM97078a != yukVar) {
                    str5 = str4;
                    d410Var2 = d410Var;
                    Object obj3 = objM97078a;
                    z650Var3 = z650Var2;
                    playerState = (PlayerState) obj3;
                    if (!m83815a(playerState, str8)) {
                        qqvVar.f191657a = null;
                        qqvVar.f191658b = null;
                        qqvVar.f191659c = z650Var3;
                        qqvVar.f191660d = d410Var2;
                        qqvVar.f191663g = 5;
                        uqvVar = this;
                        objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                        if (objM83818d != yukVar) {
                            z650Var4 = z650Var3;
                            objM97078a = objM83818d;
                            d410Var3 = d410Var2;
                            if (((Boolean) objM97078a).booleanValue()) {
                                FlowableFilter flowableFilterM23360y4 = flowable.m23360y(new i2v(uqvVar, 2));
                                qqvVar.f191657a = null;
                                qqvVar.f191658b = null;
                                qqvVar.f191659c = z650Var4;
                                qqvVar.f191660d = null;
                                qqvVar.f191663g = 6;
                                objM97078a = kgg1.m56346i(flowableFilterM23360y4, 1, qqvVar);
                                if (objM97078a != yukVar) {
                                    z650Var5 = z650Var4;
                                    xul0VarTrack = ((PlayerState) objM97078a).track();
                                    if (xul0VarTrack != null) {
                                        str9 = (String) xf40VarMetadata.get("media.type");
                                    }
                                    if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                        wek0.m87885d(uqvVar.f233131k, z650Var5);
                                    }
                                }
                            }
                        }
                    } else {
                        qqvVar.f191657a = null;
                        qqvVar.f191658b = null;
                        qqvVar.f191659c = z650Var3;
                        qqvVar.f191660d = d410Var2;
                        qqvVar.f191663g = 5;
                        uqvVar = this;
                        objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                        if (objM83818d != yukVar) {
                            z650Var4 = z650Var3;
                            objM97078a = objM83818d;
                            d410Var3 = d410Var2;
                            if (((Boolean) objM97078a).booleanValue()) {
                                FlowableFilter flowableFilterM23360y5 = flowable.m23360y(new i2v(uqvVar, 2));
                                qqvVar.f191657a = null;
                                qqvVar.f191658b = null;
                                qqvVar.f191659c = z650Var4;
                                qqvVar.f191660d = null;
                                qqvVar.f191663g = 6;
                                objM97078a = kgg1.m56346i(flowableFilterM23360y5, 1, qqvVar);
                                if (objM97078a != yukVar) {
                                    z650Var5 = z650Var4;
                                    xul0VarTrack = ((PlayerState) objM97078a).track();
                                    if (xul0VarTrack != null) {
                                        str9 = (String) xf40VarMetadata.get("media.type");
                                    }
                                    if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                        wek0.m87885d(uqvVar.f233131k, z650Var5);
                                    }
                                }
                            }
                        }
                    }
                    return w2a1Var;
                }
                return yukVar;
            case 3:
                d410Var = qqvVar.f191660d;
                z650Var2 = qqvVar.f191659c;
                str4 = qqvVar.f191658b;
                str3 = qqvVar.f191657a;
                bga.m29073P(objM97078a);
                str5 = str4;
                d410Var2 = d410Var;
                Object obj4 = objM97078a;
                z650Var3 = z650Var2;
                playerState = (PlayerState) obj4;
                if (!m83815a(playerState, str8)) {
                    qqvVar.f191657a = null;
                    qqvVar.f191658b = null;
                    qqvVar.f191659c = z650Var3;
                    qqvVar.f191660d = d410Var2;
                    qqvVar.f191663g = 5;
                    uqvVar = this;
                    objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                    if (objM83818d != yukVar) {
                        z650Var4 = z650Var3;
                        objM97078a = objM83818d;
                        d410Var3 = d410Var2;
                        if (((Boolean) objM97078a).booleanValue()) {
                            FlowableFilter flowableFilterM23360y6 = flowable.m23360y(new i2v(uqvVar, 2));
                            qqvVar.f191657a = null;
                            qqvVar.f191658b = null;
                            qqvVar.f191659c = z650Var4;
                            qqvVar.f191660d = null;
                            qqvVar.f191663g = 6;
                            objM97078a = kgg1.m56346i(flowableFilterM23360y6, 1, qqvVar);
                            if (objM97078a != yukVar) {
                                z650Var5 = z650Var4;
                                xul0VarTrack = ((PlayerState) objM97078a).track();
                                if (xul0VarTrack != null) {
                                    str9 = (String) xf40VarMetadata.get("media.type");
                                }
                                if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                    wek0.m87885d(uqvVar.f233131k, z650Var5);
                                }
                            }
                        }
                    }
                    return yukVar;
                }
                qqvVar.f191657a = null;
                qqvVar.f191658b = null;
                qqvVar.f191659c = z650Var3;
                qqvVar.f191660d = d410Var2;
                qqvVar.f191663g = 5;
                uqvVar = this;
                objM83818d = uqvVar.m83818d(str5, str3, d410Var2, z650Var3, qqvVar);
                if (objM83818d != yukVar) {
                    z650Var4 = z650Var3;
                    objM97078a = objM83818d;
                    d410Var3 = d410Var2;
                    if (((Boolean) objM97078a).booleanValue()) {
                        FlowableFilter flowableFilterM23360y7 = flowable.m23360y(new i2v(uqvVar, 2));
                        qqvVar.f191657a = null;
                        qqvVar.f191658b = null;
                        qqvVar.f191659c = z650Var4;
                        qqvVar.f191660d = null;
                        qqvVar.f191663g = 6;
                        objM97078a = kgg1.m56346i(flowableFilterM23360y7, 1, qqvVar);
                        if (objM97078a != yukVar) {
                            z650Var5 = z650Var4;
                            xul0VarTrack = ((PlayerState) objM97078a).track();
                            if (xul0VarTrack != null) {
                                str9 = (String) xf40VarMetadata.get("media.type");
                            }
                            if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                                wek0.m87885d(uqvVar.f233131k, z650Var5);
                            }
                        }
                    }
                }
                return yukVar;
                return w2a1Var;
            case 4:
                bga.m29073P(objM97078a);
                return w2a1Var;
            case 5:
                d410Var3 = qqvVar.f191660d;
                z650Var4 = qqvVar.f191659c;
                bga.m29073P(objM97078a);
                if (((Boolean) objM97078a).booleanValue()) {
                    FlowableFilter flowableFilterM23360y8 = flowable.m23360y(new i2v(uqvVar, 2));
                    qqvVar.f191657a = null;
                    qqvVar.f191658b = null;
                    qqvVar.f191659c = z650Var4;
                    qqvVar.f191660d = null;
                    qqvVar.f191663g = 6;
                    objM97078a = kgg1.m56346i(flowableFilterM23360y8, 1, qqvVar);
                    if (objM97078a != yukVar) {
                        z650Var5 = z650Var4;
                        xul0VarTrack = ((PlayerState) objM97078a).track();
                        if (xul0VarTrack != null) {
                            str9 = (String) xf40VarMetadata.get("media.type");
                        }
                        if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                            wek0.m87885d(uqvVar.f233131k, z650Var5);
                        }
                    }
                    return yukVar;
                }
                return w2a1Var;
            case 6:
                z650Var5 = qqvVar.f191659c;
                bga.m29073P(objM97078a);
                xul0VarTrack = ((PlayerState) objM97078a).track();
                if (xul0VarTrack != null) {
                    str9 = (String) xf40VarMetadata.get("media.type");
                }
                if (bm51.m29797h0(str9, ContextTrack.MediaType.MIXED, true)) {
                    wek0.m87885d(uqvVar.f233131k, z650Var5);
                }
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: d */
    public final Object m83818d(String str, String str2, d410 d410Var, z650 z650Var, ibk ibkVar) {
        rqv rqvVar;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        if (ibkVar instanceof rqv) {
            rqvVar = (rqv) ibkVar;
            int i = rqvVar.f201894c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rqvVar.f201894c = i - Integer.MIN_VALUE;
            } else {
                rqvVar = new rqv(this, ibkVar);
            }
        } else {
            rqvVar = new rqv(this, ibkVar);
        }
        rqv rqvVar2 = rqvVar;
        Object objM88912b = rqvVar2.f201892a;
        int i2 = rqvVar2.f201894c;
        if (i2 == 0) {
            bga.m29073P(objM88912b);
            ((wy3) this.f233126f).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            boolean z3 = d410Var instanceof b410;
            String str5 = this.f233121a;
            if (z3) {
                if (str == null) {
                    Logger.m3966b("Could not initiate the playback, context uri is null", new Object[0]);
                    return Boolean.FALSE;
                }
                xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
                xowVarM18009u.m91569t(str5);
                onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
                b410 b410Var = (b410) d410Var;
                long j = b410Var.f23167a;
                if (b410Var.f23168b) {
                    onwVarM17830E.m67425A(String.valueOf(j));
                } else {
                    umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
                    umwVarM17777q.m83492m(j);
                    onwVarM17830E.m67440z((EsOptional$OptionalInt64) umwVarM17777q.build());
                }
                str3 = str;
            } else {
                if (!(d410Var instanceof c410)) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = str2;
            }
            if (this.f233130j.f116132d) {
                Set set = dd41.f47702f;
                z = !r46.m74709B(str5, gn80.TRACK, gn80.TRACK_AUTOPLAY);
            } else {
                z = true;
            }
            if (z) {
                onwVarM17830E.m67431q();
                njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
                tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o.m81146m(false);
                njwVarM17688r.m64643t((EsOptional$OptionalBoolean) tmwVarM17771o.build());
                tmw tmwVarM17771o2 = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o2.m81146m(false);
                njwVarM17688r.m64641r((EsOptional$OptionalBoolean) tmwVarM17771o2.build());
                tmw tmwVarM17771o3 = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o3.m81146m(false);
                njwVarM17688r.m64642s((EsOptional$OptionalBoolean) tmwVarM17771o3.build());
                onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
            }
            onwVarM17830E.m67429E(false);
            dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
            dnwVarM17804F.m36494s("entity-segments-playback");
            dnwVarM17804F.m36498w(str2);
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            ilwVarM17768t.m51044q(this.f233133m);
            if (z650Var == null || (str4 = z650Var.f279709a) == null) {
                str4 = "";
            }
            ilwVarM17768t.m51043m(str4);
            umw umwVarM17777q2 = EsOptional$OptionalInt64.m17777q();
            umwVarM17777q2.m83492m(jCurrentTimeMillis);
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q2.build());
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
            rqvVar2.f201894c = 1;
            String str6 = str3;
            z2 = false;
            objM88912b = wt80.m88912b(this.f233127g, str6, null, esPreparePlayOptions$PreparePlayOptions, esPlayOrigin$PlayOrigin, null, null, esLoggingParams$LoggingParams, null, rqvVar2, 178);
            yuk yukVar = yuk.f276404a;
            if (objM88912b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM88912b);
            z2 = false;
        }
        return Boolean.valueOf(((p2x0) objM88912b).m68970c() != null ? true : z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r12 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r12 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (r12 == r6) goto L41;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83819e(long j, z650 z650Var, boolean z, ibk ibkVar) {
        sqv sqvVar;
        boolean z2;
        boolean z3;
        String str;
        if (ibkVar instanceof sqv) {
            sqvVar = (sqv) ibkVar;
            int i = sqvVar.f213175f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqvVar.f213175f = i - Integer.MIN_VALUE;
            } else {
                sqvVar = new sqv(this, ibkVar);
            }
        } else {
            sqvVar = new sqv(this, ibkVar);
        }
        Object objM96567o = sqvVar.f213173d;
        int i2 = sqvVar.f213175f;
        hrw hrwVar = this.f233132l;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            if (z) {
                Single singleMo48412a = hrwVar.mo48412a(new a8p0(SeekToCommand.Builder.builder().creatorTimestampPositionMs(j).build()));
                sqvVar.f213171b = z650Var;
                sqvVar.f213170a = j;
                sqvVar.f213172c = z;
                sqvVar.f213175f = 1;
                objM96567o = zn91.m96567o(singleMo48412a, sqvVar);
            } else {
                Single singleMo48412a2 = hrwVar.mo48412a(new z7p0(j));
                sqvVar.f213171b = z650Var;
                sqvVar.f213170a = j;
                sqvVar.f213172c = z;
                sqvVar.f213175f = 2;
                objM96567o = zn91.m96567o(singleMo48412a2, sqvVar);
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = sqvVar.f213172c;
            j = sqvVar.f213170a;
            z650Var = sqvVar.f213171b;
            bga.m29073P(objM96567o);
            lcf lcfVar = (lcf) objM96567o;
            lcfVar.getClass();
            z2 = lcfVar instanceof icf;
        } else if (i2 == 2) {
            z = sqvVar.f213172c;
            j = sqvVar.f213170a;
            z650Var = sqvVar.f213171b;
            bga.m29073P(objM96567o);
            lcf lcfVar2 = (lcf) objM96567o;
            lcfVar2.getClass();
            z2 = lcfVar2 instanceof icf;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lcf lcfVar3 = (lcf) objM96567o;
        lcfVar3.getClass();
        z3 = lcfVar3 instanceof icf;
        return Boolean.valueOf(z3);
        z3 = false;
        if (z2) {
            ResumeCommand.Builder builder = ResumeCommand.builder();
            LoggingParams.Builder builder2 = LoggingParams.builder();
            if (z650Var == null || (str = z650Var.f279709a) == null) {
                str = "";
            }
            builder2.interactionId(str);
            String str2 = this.f233133m;
            Single singleMo48412a3 = hrwVar.mo48412a(new y7p0(builder.loggingParams(builder2.pageInstanceId(str2 != null ? str2 : "").build()).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("entity-segments-playback").build()).build()));
            sqvVar.f213171b = null;
            sqvVar.f213170a = j;
            sqvVar.f213172c = z;
            sqvVar.f213175f = 3;
            objM96567o = zn91.m96567o(singleMo48412a3, sqvVar);
        }
        return Boolean.valueOf(z3);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m83820f(z650 z650Var, ibk ibkVar) {
        tqv tqvVar;
        String str;
        String str2;
        if (ibkVar instanceof tqv) {
            tqvVar = (tqv) ibkVar;
            int i = tqvVar.f222897d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqvVar.f222897d = i - Integer.MIN_VALUE;
            } else {
                tqvVar = new tqv(this, ibkVar);
            }
        } else {
            tqvVar = new tqv(this, ibkVar);
        }
        Object objM56346i = tqvVar.f222895b;
        int i2 = tqvVar.f222897d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56346i);
            tqvVar.f222894a = z650Var;
            tqvVar.f222897d = 1;
            objM56346i = kgg1.m56346i(this.f233128h, 1, tqvVar);
            if (objM56346i != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM56346i);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56346i);
            return w2a1Var;
        }
        z650Var = tqvVar.f222894a;
        bga.m29073P(objM56346i);
        PlayerState playerState = (PlayerState) objM56346i;
        if (m83815a(playerState, this.f233121a)) {
            boolean zIsPaused = playerState.isPaused();
            String str3 = this.f233133m;
            hrw hrwVar = this.f233132l;
            if (zIsPaused) {
                ResumeCommand.Builder builder = ResumeCommand.builder();
                LoggingParams.Builder builder2 = LoggingParams.builder();
                if (z650Var == null || (str2 = z650Var.f279709a) == null) {
                    str2 = "";
                }
                builder2.interactionId(str2);
                if (str3 == null) {
                    str3 = "";
                }
                Single singleMo48412a = hrwVar.mo48412a(new y7p0(builder.loggingParams(builder2.pageInstanceId(str3).build()).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("entity-segments-playback").build()).build()));
                tqvVar.f222894a = null;
                tqvVar.f222897d = 2;
                if (zn91.m96567o(singleMo48412a, tqvVar) == yukVar) {
                    return yukVar;
                }
            } else {
                PauseCommand.Builder builder3 = PauseCommand.builder();
                LoggingParams.Builder builder4 = LoggingParams.builder();
                if (z650Var == null || (str = z650Var.f279709a) == null) {
                    str = "";
                }
                builder4.interactionId(str);
                if (str3 == null) {
                    str3 = "";
                }
                Single singleMo48412a2 = hrwVar.mo48412a(new v7p0(builder3.loggingParams(builder4.pageInstanceId(str3).build()).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("entity-segments-playback").build()).build()));
                tqvVar.f222894a = null;
                tqvVar.f222897d = 3;
                if (zn91.m96567o(singleMo48412a2, tqvVar) == yukVar) {
                    return yukVar;
                }
            }
        }
        return w2a1Var;
    }
}
