package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class zw31 {

    /* JADX INFO: renamed from: a */
    public final vw31 f286904a;

    /* JADX INFO: renamed from: b */
    public final xzx f286905b;

    /* JADX INFO: renamed from: c */
    public final ac6 f286906c;

    /* JADX INFO: renamed from: d */
    public final v0w f286907d;

    /* JADX INFO: renamed from: e */
    public final am71 f286908e;

    /* JADX INFO: renamed from: f */
    public final luk f286909f;

    /* JADX INFO: renamed from: g */
    public final luk f286910g;

    /* JADX INFO: renamed from: h */
    public final luk f286911h;

    /* JADX INFO: renamed from: i */
    public final c9k f286912i;

    /* JADX INFO: renamed from: j */
    public di41 f286913j;

    public zw31(vw31 vw31Var, xzx xzxVar, ac6 ac6Var, v0w v0wVar, am71 am71Var, luk lukVar, luk lukVar2, luk lukVar3, c9k c9kVar) {
        this.f286904a = vw31Var;
        this.f286905b = xzxVar;
        this.f286906c = ac6Var;
        this.f286907d = v0wVar;
        this.f286908e = am71Var;
        this.f286909f = lukVar;
        this.f286910g = lukVar2;
        this.f286911h = lukVar3;
        this.f286912i = c9kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m97107a(zw31 zw31Var, Context context, sr4 sr4Var, ibk ibkVar) {
        xw31 xw31Var;
        am71 am71Var = zw31Var.f286908e;
        if (ibkVar instanceof xw31) {
            xw31Var = (xw31) ibkVar;
            int i = xw31Var.f266569d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw31Var.f266569d = i - Integer.MIN_VALUE;
            } else {
                xw31Var = new xw31(zw31Var, ibkVar);
            }
        } else {
            xw31Var = new xw31(zw31Var, ibkVar);
        }
        Object objM84413b = xw31Var.f266567b;
        int i2 = xw31Var.f266569d;
        if (i2 == 0) {
            bga.m29073P(objM84413b);
            v0w v0wVar = zw31Var.f286907d;
            String strUri = context.uri();
            xw31Var.f266566a = sr4Var;
            xw31Var.f266569d = 1;
            objM84413b = v0wVar.m84413b(strUri, xw31Var);
            yuk yukVar = yuk.f276404a;
            if (objM84413b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sr4Var = xw31Var.f266566a;
            bga.m29073P(objM84413b);
        }
        wcp0 wcp0Var = (wcp0) objM84413b;
        if (wj50.m88271j(wcp0Var, ucp0.f229095a)) {
            if (sr4Var != null) {
                sr4Var.m79016f(VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_PLAYER_START_TO_PLAYBACK_STARTED);
                sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, a831.m25009a(1));
                ((rr4) am71Var).m76276b(sr4Var.m79015d());
            }
        } else if (wj50.m88271j(wcp0Var, vcp0.f240243a)) {
            if (sr4Var != null) {
                sr4Var.m79016f(VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_PLAYER_START_TO_PLAYBACK_STARTED);
                sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, a831.m25009a(3));
                ((rr4) am71Var).m76276b(sr4Var.m79015d());
            }
        } else {
            if (!(wcp0Var instanceof tcp0)) {
                throw new NoWhenBranchMatchedException();
            }
            Logger.m3967c(((tcp0) wcp0Var).m80481a(), "Error observing player state", new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public static void m97108b(sr4 sr4Var, Integer num) {
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_REQUIRES_POLLING, num != null ? "true" : "false");
        if (num != null) {
            sr4Var.m79014b(VoiceAssistantsPerformance.METADATA_POLLING_RETRY_COUNT, String.valueOf(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m97109c(zw31 zw31Var, int i, String str, VoiceAssistantLoggingContext voiceAssistantLoggingContext, sr4 sr4Var, Exception exc, Integer num, int i2) {
        if ((i2 & 16) != 0) {
            exc = null;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        ac6 ac6Var = zw31Var.f286906c;
        if (sr4Var != null) {
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, a831.m25009a(i));
            sr4Var.m79016f(str);
            ((rr4) zw31Var.f286908e).m76276b(sr4Var.m79015d());
        }
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                if (exc == null) {
                    ac6Var.m25440c(voiceAssistantLoggingContext);
                    return;
                } else {
                    ac6Var.m25441d(exc, voiceAssistantLoggingContext);
                    return;
                }
            }
            if (iM38547C == 2) {
                ac6Var.f14269b.m95097c(new dc6(voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), edb.m38563l("Playlist was not generated within ", (num != null ? num.intValue() : 0) / 1000, " seconds"), voiceAssistantLoggingContext.getInteractionId(), 5, null, voiceAssistantLoggingContext.getUserId()));
                ac6Var.f14268a.m74357a(hps.f93844k);
            } else if (iM38547C != 3) {
                if (iM38547C != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ac6Var.m25438a(voiceAssistantLoggingContext, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m97110d(CommandPlayResponse commandPlayResponse, Context context, sr4 sr4Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, ibk ibkVar) throws Throwable {
        di41 di41Var = this.f286913j;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f286913j = x0h1.m89578u(this.f286912i, null, 0, new h431(this, context, sr4Var, fbkVar, 7), 3);
        if (sr4Var != null) {
            sr4Var.m79016f(VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START);
            sr4Var.m79019k(VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_PLAYER_START_TO_PLAYBACK_STARTED, null, (4 & 4) != 0);
        }
        Object objM89557A = x0h1.m89557A(this.f286909f, new gjw0(26, this, commandPlayResponse, context, voiceAssistantLoggingContext, sr4Var, null), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, p.zw31] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20, types: [p.sr4] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public final Object m97111e(Uri uri, String str, sr4 sr4Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, ibk ibkVar) {
        yw31 yw31Var;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext2;
        Exception exc;
        ?? r5;
        CommandPlayRequest commandPlayRequest;
        sr4 sr4Var2;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext3;
        Exception e;
        sr4 sr4Var3;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext4;
        CommandPlayResponse commandPlayResponse;
        CommandPlayRequest commandPlayRequest2;
        Context context;
        sr4 sr4Var4;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext5;
        sr4 sr4Var5;
        ?? r6;
        sr4 sr4Var6 = sr4Var;
        if (ibkVar instanceof yw31) {
            yw31Var = (yw31) ibkVar;
            int i = yw31Var.f276853f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yw31Var.f276853f = i - Integer.MIN_VALUE;
            } else {
                yw31Var = new yw31(this, ibkVar);
            }
        } else {
            yw31Var = new yw31(this, ibkVar);
        }
        yw31 yw31Var2 = yw31Var;
        Object obj = yw31Var2.f276851d;
        int i2 = yw31Var2.f276853f;
        int i3 = 2;
        w2a1 w2a1Var = w2a1.f247311a;
        ?? r7 = 2;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        CommandPlayRequest commandPlayRequest3 = yw31Var2.f276850c;
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext6 = yw31Var2.f276849b;
                        sr4 sr4Var7 = yw31Var2.f276848a;
                        try {
                            bga.m29073P(obj);
                            voiceAssistantLoggingContext2 = voiceAssistantLoggingContext6;
                            commandPlayRequest = commandPlayRequest3;
                            sr4Var6 = sr4Var7;
                        } catch (Exception e2) {
                            e = e2;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext6;
                            sr4Var2 = sr4Var7;
                            i3 = 2;
                            exc = e;
                            r6 = sr4Var2;
                            m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                            return w2a1Var;
                        }
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext7 = yw31Var2.f276849b;
                        sr4 sr4Var8 = yw31Var2.f276848a;
                        try {
                            bga.m29073P(obj);
                            return w2a1Var;
                        } catch (Exception e3) {
                            exc = e3;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext7;
                            sr4Var5 = sr4Var8;
                        }
                    }
                    i3 = 2;
                    r6 = sr4Var5;
                    m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                if (sr4Var6 != null) {
                    sr4Var6.m79019k(VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, null, (4 & 4) != 0);
                }
                CommandPlayRequest commandPlayRequest4 = new CommandPlayRequest(uri.toString(), str, true);
                try {
                    luk lukVar = this.f286911h;
                    ww31 ww31Var = new ww31(this, commandPlayRequest4, fbkVar, 1);
                    yw31Var2.f276848a = sr4Var6;
                    voiceAssistantLoggingContext2 = voiceAssistantLoggingContext;
                    try {
                        yw31Var2.f276849b = voiceAssistantLoggingContext2;
                        yw31Var2.f276850c = commandPlayRequest4;
                        yw31Var2.f276853f = 1;
                        Object objM89557A = x0h1.m89557A(lukVar, ww31Var, yw31Var2);
                        if (objM89557A != yukVar) {
                            commandPlayRequest = commandPlayRequest4;
                            obj = objM89557A;
                        }
                        return yukVar;
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        r5 = sr4Var6;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext2;
                        r6 = r5;
                        m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return w2a1Var;
                    }
                } catch (Exception e5) {
                    e = e5;
                    voiceAssistantLoggingContext2 = voiceAssistantLoggingContext;
                }
                if (!wj50.m88271j(commandPlayResponse.getPlaybackReadiness(), "IN_PROGRESS")) {
                    sr4 sr4Var9 = sr4Var6;
                    try {
                        if (!wj50.m88271j(commandPlayResponse.getPlaybackReadiness(), "READY") || context == null) {
                            VoiceAssistantLoggingContext voiceAssistantLoggingContext8 = voiceAssistantLoggingContext2;
                            try {
                                m97109c(this, 2, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext8, sr4Var9, null, null, 48);
                                return w2a1Var;
                            } catch (Exception e6) {
                                e = e6;
                                voiceAssistantLoggingContext4 = voiceAssistantLoggingContext8;
                                sr4Var3 = sr4Var9;
                                i3 = 2;
                                VoiceAssistantLoggingContext voiceAssistantLoggingContext9 = voiceAssistantLoggingContext4;
                                sr4Var2 = sr4Var3;
                                voiceAssistantLoggingContext3 = voiceAssistantLoggingContext9;
                                exc = e;
                                r6 = sr4Var2;
                                m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                                return w2a1Var;
                            }
                        }
                        if (sr4Var9 != null) {
                            sr4Var9.m79013a(VoiceAssistantsPerformance.DIMENSION_REQUIRES_POLLING, "false");
                        }
                        try {
                            yw31Var2.f276848a = sr4Var9;
                            yw31Var2.f276849b = voiceAssistantLoggingContext2;
                            yw31Var2.f276850c = null;
                            yw31Var2.f276853f = 3;
                            sr4Var4 = sr4Var9;
                            voiceAssistantLoggingContext5 = voiceAssistantLoggingContext2;
                            try {
                                if (m97110d(commandPlayResponse, context, sr4Var4, voiceAssistantLoggingContext5, yw31Var2) == yukVar) {
                                    return yukVar;
                                }
                                return w2a1Var;
                            } catch (Exception e7) {
                                e = e7;
                                VoiceAssistantLoggingContext voiceAssistantLoggingContext10 = voiceAssistantLoggingContext5;
                                sr4Var5 = sr4Var4;
                                voiceAssistantLoggingContext3 = voiceAssistantLoggingContext10;
                                exc = e;
                                i3 = 2;
                                r6 = sr4Var5;
                                m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                                return w2a1Var;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            sr4Var4 = sr4Var9;
                            voiceAssistantLoggingContext5 = voiceAssistantLoggingContext2;
                            VoiceAssistantLoggingContext voiceAssistantLoggingContext11 = voiceAssistantLoggingContext5;
                            sr4Var5 = sr4Var4;
                            voiceAssistantLoggingContext3 = voiceAssistantLoggingContext11;
                            exc = e;
                            i3 = 2;
                            r6 = sr4Var5;
                            m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                            return w2a1Var;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        sr4Var3 = sr4Var9;
                        i3 = 2;
                        voiceAssistantLoggingContext4 = voiceAssistantLoggingContext2;
                        VoiceAssistantLoggingContext voiceAssistantLoggingContext12 = voiceAssistantLoggingContext4;
                        sr4Var2 = sr4Var3;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext12;
                        exc = e;
                        r6 = sr4Var2;
                        m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return w2a1Var;
                    }
                }
                try {
                    Context context2 = commandPlayResponse.getContext();
                    List<Integer> retryDelayMs = commandPlayResponse.getRetryDelayMs();
                    yw31Var2.f276848a = sr4Var6;
                    yw31Var2.f276849b = voiceAssistantLoggingContext2;
                    yw31Var2.f276850c = null;
                    yw31Var2.f276853f = 2;
                    sr4 sr4Var10 = sr4Var6;
                    VoiceAssistantLoggingContext voiceAssistantLoggingContext13 = voiceAssistantLoggingContext2;
                    try {
                        Object objM56684z = kk40.m56684z(new wnb(this, commandPlayRequest2, retryDelayMs, sr4Var10, voiceAssistantLoggingContext13, context2, null, 7), yw31Var2);
                        if (objM56684z != yukVar) {
                            objM56684z = w2a1Var;
                        }
                        if (objM56684z == yukVar) {
                            return yukVar;
                        }
                        return w2a1Var;
                    } catch (Exception e10) {
                        e = e10;
                        voiceAssistantLoggingContext2 = voiceAssistantLoggingContext13;
                        r7 = sr4Var10;
                        exc = e;
                        r5 = r7;
                        voiceAssistantLoggingContext3 = voiceAssistantLoggingContext2;
                        r6 = r5;
                        m97109c(this, i3, VoiceAssistantsPerformance.MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START, voiceAssistantLoggingContext3, r6, exc, null, 32);
                        return w2a1Var;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r7 = sr4Var6;
                }
            } catch (Exception e12) {
                e = e12;
            }
            commandPlayResponse = (CommandPlayResponse) obj;
            commandPlayRequest2 = commandPlayRequest;
            context = commandPlayResponse.getContext();
        } catch (Exception e13) {
            e = e13;
            sr4Var3 = sr4Var6;
        }
    }
}
