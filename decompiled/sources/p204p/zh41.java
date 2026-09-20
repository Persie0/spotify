package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class zh41 implements bmo0 {

    /* JADX INFO: renamed from: a */
    public final zmh f282797a;

    /* JADX INFO: renamed from: b */
    public final ycc f282798b;

    /* JADX INFO: renamed from: c */
    public final wt80 f282799c;

    /* JADX INFO: renamed from: d */
    public final nbm0 f282800d;

    /* JADX INFO: renamed from: e */
    public final a9i0 f282801e;

    /* JADX INFO: renamed from: f */
    public final hrw f282802f;

    public zh41(zmh zmhVar, ycc yccVar, wt80 wt80Var, nbm0 nbm0Var, a9i0 a9i0Var, hrw hrwVar) {
        this.f282797a = zmhVar;
        this.f282798b = yccVar;
        this.f282799c = wt80Var;
        this.f282800d = nbm0Var;
        this.f282801e = a9i0Var;
        this.f282802f = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p204p.bmo0
    /* JADX INFO: renamed from: a */
    public final Object mo29884a(vlo0 vlo0Var, bso0 bso0Var, pv00 pv00Var, ctj ctjVar, d850 d850Var, r3g0 r3g0Var, boolean z, ibk ibkVar) throws Throwable {
        xh41 xh41Var;
        String str;
        String str2;
        d850 d850Var2;
        boolean z2;
        bso0 bso0Var2 = bso0Var;
        if (ibkVar instanceof xh41) {
            xh41Var = (xh41) ibkVar;
            int i = xh41Var.f261444g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xh41Var.f261444g = i - Integer.MIN_VALUE;
            } else {
                xh41Var = new xh41(this, ibkVar);
            }
        } else {
            xh41Var = new xh41(this, ibkVar);
        }
        Object objM96463j = xh41Var.f261442e;
        int i2 = xh41Var.f261444g;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96463j);
            if (vlo0Var instanceof tlo0) {
                str = ((tlo0) vlo0Var).f221497a;
            } else {
                if (!(vlo0Var instanceof ulo0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ulo0) vlo0Var).f231600b;
            }
            if (ctjVar instanceof atj) {
                atj atjVar = (atj) ctjVar;
                if (!atjVar.f19699b) {
                    ysj ysjVar = atjVar.f19698a;
                    xh41Var.f261438a = null;
                    xh41Var.f261439b = null;
                    xh41Var.f261440c = null;
                    xh41Var.f261441d = z;
                    xh41Var.f261444g = 1;
                    if (this.f282798b.m93346i(str, ysjVar, d850Var, xh41Var) == obj) {
                        return obj;
                    }
                    return w2a1Var;
                }
            }
            if (pv00Var instanceof mv00) {
                xh41Var.f261438a = bso0Var2;
                xh41Var.f261439b = d850Var;
                xh41Var.f261440c = str;
                xh41Var.f261441d = z;
                xh41Var.f261444g = 2;
                objM96463j = this.f282797a.m96463j(str, (mv00) pv00Var, d850Var, xh41Var);
                if (objM96463j != obj) {
                    str2 = str;
                    d850Var2 = d850Var;
                    z2 = z;
                }
            } else {
                z650 z650Var = d850Var.f46380a;
                xh41Var.f261438a = null;
                xh41Var.f261439b = null;
                xh41Var.f261440c = null;
                xh41Var.f261441d = z;
                xh41Var.f261444g = 4;
                if (m96114c(str, bso0Var2, z650Var, xh41Var) != obj) {
                    return w2a1Var;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM96463j);
            return w2a1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                bga.m29073P(objM96463j);
                return w2a1Var;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96463j);
            return w2a1Var;
        }
        z2 = xh41Var.f261441d;
        String str3 = xh41Var.f261440c;
        d850Var2 = xh41Var.f261439b;
        bso0 bso0Var3 = xh41Var.f261438a;
        bga.m29073P(objM96463j);
        str2 = str3;
        bso0Var2 = bso0Var3;
        if (((xv00) objM96463j) instanceof wv00) {
            z650 z650Var2 = d850Var2.f46380a;
            xh41Var.f261438a = null;
            xh41Var.f261439b = null;
            xh41Var.f261440c = null;
            xh41Var.f261441d = z2;
            xh41Var.f261444g = 3;
            if (m96114c(str2, bso0Var2, z650Var2, xh41Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0114, code lost:
    
        if (r18.f282801e.m25137s(r1, r4, r13) == r3) goto L38;
     */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.String, p.z650] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m96114c(String str, bso0 bso0Var, z650 z650Var, ibk ibkVar) {
        yh41 yh41Var;
        ?? r2;
        yuk yukVar;
        z650 z650Var2;
        String str2;
        if (ibkVar instanceof yh41) {
            yh41Var = (yh41) ibkVar;
            int i = yh41Var.f272730e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yh41Var.f272730e = i - Integer.MIN_VALUE;
            } else {
                yh41Var = new yh41(this, ibkVar);
            }
        } else {
            yh41Var = new yh41(this, ibkVar);
        }
        yh41 yh41Var2 = yh41Var;
        Object obj = yh41Var2.f272728c;
        int i2 = yh41Var2.f272730e;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            kbm0 kbm0Var = this.f282800d.get();
            String str3 = kbm0Var != null ? kbm0Var.f121231a : null;
            if (str3 == null || str3.length() == 0) {
                na6.m63957e("StandaloneClipPlayIntentHandler: missing page instance ID");
                return w2a1Var;
            }
            LoggingParams loggingParamsBuild = LoggingParams.builder().interactionId(z650Var.f279709a).pageInstanceId(str3).build();
            int iOrdinal = bso0Var.ordinal();
            hrw hrwVar = this.f282802f;
            if (iOrdinal == 0) {
                Single singleMo48412a = hrwVar.mo48412a(new v7p0(PauseCommand.builder().loggingParams(loggingParamsBuild).pauseOrigin(PauseResumeOrigin.builder("clip-playback-handler").build()).build()));
                yh41Var2.f272726a = null;
                yh41Var2.f272727b = null;
                yh41Var2.f272730e = 1;
                if (zn91.m96567o(singleMo48412a, yh41Var2) == yukVar2) {
                    return yukVar2;
                }
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
                    dnwVarM17804F.m36494s("clip-playback-handler");
                    EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
                    Map mapSingletonMap = Collections.singletonMap("pointer.npv_mode", "standalone");
                    ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
                    ilwVarM17768t.m51044q(str3);
                    ilwVarM17768t.m51043m(z650Var.f279709a);
                    EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
                    onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
                    onwVarM17830E.m67431q();
                    njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
                    tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
                    tmwVarM17771o.m81146m(true);
                    njwVarM17688r.m64642s((EsOptional$OptionalBoolean) tmwVarM17771o.build());
                    onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
                    EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
                    yh41Var2.f272726a = str;
                    yh41Var2.f272727b = z650Var;
                    yh41Var2.f272730e = 3;
                    r2 = 0;
                    yukVar = yukVar2;
                    if (wt80.m88912b(this.f282799c, str, null, esPreparePlayOptions$PreparePlayOptions, esPlayOrigin$PlayOrigin, null, mapSingletonMap, esLoggingParams$LoggingParams, null, yh41Var2, 146) != yukVar) {
                        z650Var2 = z650Var;
                        str2 = str;
                    }
                    return yukVar;
                }
                Single singleMo48412a2 = hrwVar.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(loggingParamsBuild).resumeOrigin(PauseResumeOrigin.builder("clip-playback-handler").build()).build()));
                yh41Var2.f272726a = null;
                yh41Var2.f272727b = null;
                yh41Var2.f272730e = 2;
                if (zn91.m96567o(singleMo48412a2, yh41Var2) == yukVar2) {
                    return yukVar2;
                }
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i2 == 2) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        z650 z650Var3 = yh41Var2.f272727b;
        String str4 = yh41Var2.f272726a;
        bga.m29073P(obj);
        z650Var2 = z650Var3;
        str2 = str4;
        r2 = 0;
        yukVar = yukVar2;
        yh41Var2.f272726a = r2;
        yh41Var2.f272727b = r2;
        yh41Var2.f272730e = 4;
    }
}
