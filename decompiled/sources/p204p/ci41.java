package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ci41 implements bmo0 {

    /* JADX INFO: renamed from: g */
    public static final PreparePlayOptions f38206g;

    /* JADX INFO: renamed from: a */
    public final xre f38207a;

    /* JADX INFO: renamed from: b */
    public final zmh f38208b;

    /* JADX INFO: renamed from: c */
    public final ycc f38209c;

    /* JADX INFO: renamed from: d */
    public final nbm0 f38210d;

    /* JADX INFO: renamed from: e */
    public final uqw f38211e;

    /* JADX INFO: renamed from: f */
    public final hrw f38212f;

    static {
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().suppressions(Suppressions.create(Collections.singleton(Suppressions.Providers.MFT)));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        f38206g = builderSuppressions.playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build();
    }

    public ci41(xre xreVar, zmh zmhVar, ycc yccVar, nbm0 nbm0Var, uqw uqwVar, hrw hrwVar) {
        this.f38207a = xreVar;
        this.f38208b = zmhVar;
        this.f38209c = yccVar;
        this.f38210d = nbm0Var;
        this.f38211e = uqwVar;
        this.f38212f = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p204p.bmo0
    /* JADX INFO: renamed from: a */
    public final Object mo29884a(vlo0 vlo0Var, bso0 bso0Var, pv00 pv00Var, ctj ctjVar, d850 d850Var, r3g0 r3g0Var, boolean z, ibk ibkVar) throws Throwable {
        ai41 ai41Var;
        String str;
        String str2;
        d850 d850Var2;
        boolean z2;
        bso0 bso0Var2 = bso0Var;
        if (ibkVar instanceof ai41) {
            ai41Var = (ai41) ibkVar;
            int i = ai41Var.f15883g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ai41Var.f15883g = i - Integer.MIN_VALUE;
            } else {
                ai41Var = new ai41(this, ibkVar);
            }
        } else {
            ai41Var = new ai41(this, ibkVar);
        }
        Object objM96463j = ai41Var.f15881e;
        int i2 = ai41Var.f15883g;
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
                str = ((ulo0) vlo0Var).f231599a;
            }
            if (ctjVar instanceof atj) {
                atj atjVar = (atj) ctjVar;
                if (!atjVar.f19699b) {
                    ysj ysjVar = atjVar.f19698a;
                    ai41Var.f15877a = null;
                    ai41Var.f15878b = null;
                    ai41Var.f15879c = null;
                    ai41Var.f15880d = z;
                    ai41Var.f15883g = 1;
                    if (this.f38209c.m93346i(str, ysjVar, d850Var, ai41Var) == obj) {
                        return obj;
                    }
                    return w2a1Var;
                }
            }
            if (pv00Var instanceof mv00) {
                ai41Var.f15877a = bso0Var2;
                ai41Var.f15878b = d850Var;
                ai41Var.f15879c = str;
                ai41Var.f15880d = z;
                ai41Var.f15883g = 2;
                objM96463j = this.f38208b.m96463j(str, (mv00) pv00Var, d850Var, ai41Var);
                if (objM96463j != obj) {
                    str2 = str;
                    d850Var2 = d850Var;
                    z2 = z;
                }
            } else {
                z650 z650Var = d850Var.f46380a;
                ai41Var.f15877a = null;
                ai41Var.f15878b = null;
                ai41Var.f15879c = null;
                ai41Var.f15880d = z;
                ai41Var.f15883g = 4;
                if (m32868c(str, bso0Var2, z650Var, ai41Var) != obj) {
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
        z2 = ai41Var.f15880d;
        String str3 = ai41Var.f15879c;
        d850Var2 = ai41Var.f15878b;
        bso0 bso0Var3 = ai41Var.f15877a;
        bga.m29073P(objM96463j);
        str2 = str3;
        bso0Var2 = bso0Var3;
        if (((xv00) objM96463j) instanceof wv00) {
            z650 z650Var2 = d850Var2.f46380a;
            ai41Var.f15877a = null;
            ai41Var.f15878b = null;
            ai41Var.f15879c = null;
            ai41Var.f15880d = z2;
            ai41Var.f15883g = 3;
            if (m32868c(str2, bso0Var2, z650Var2, ai41Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m32868c(String str, bso0 bso0Var, z650 z650Var, ibk ibkVar) {
        bi41 bi41Var;
        if (ibkVar instanceof bi41) {
            bi41Var = (bi41) ibkVar;
            int i = bi41Var.f27334c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi41Var.f27334c = i - Integer.MIN_VALUE;
            } else {
                bi41Var = new bi41(this, ibkVar);
            }
        } else {
            bi41Var = new bi41(this, ibkVar);
        }
        Object obj = bi41Var.f27332a;
        int i2 = bi41Var.f27334c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        kbm0 kbm0Var = this.f38210d.get();
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null || str2.length() == 0) {
            na6.m63957e("StandaloneContextPlayIntentHandler: missing page instance ID");
            return w2a1Var;
        }
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(z650Var.f279709a);
        ((wy3) this.f38207a).getClass();
        LoggingParams loggingParamsBuild = builderInteractionId.commandInitiatedTime(new Long(System.currentTimeMillis())).pageInstanceId(str2).build();
        int iOrdinal = bso0Var.ordinal();
        hrw hrwVar = this.f38212f;
        yuk yukVar = yuk.f276404a;
        if (iOrdinal == 0) {
            Single singleMo48412a = hrwVar.mo48412a(new v7p0(PauseCommand.builder().loggingParams(loggingParamsBuild).pauseOrigin(PauseResumeOrigin.builder("context-play-handler").build()).build()));
            bi41Var.f27334c = 1;
            if (zn91.m96567o(singleMo48412a, bi41Var) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        if (iOrdinal == 1) {
            Single singleMo48412a2 = hrwVar.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(loggingParamsBuild).resumeOrigin(PauseResumeOrigin.builder("context-play-handler").build()).build()));
            bi41Var.f27334c = 2;
            if (zn91.m96567o(singleMo48412a2, bi41Var) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Completable completableIgnoreElement = this.f38211e.m83821a(PlayCommand.create(Context.builder(str).url("context://" + str).build(), PlayOrigin.builder("context-play-handler").build()).toBuilder().options(f38206g).loggingParams(loggingParamsBuild).build()).ignoreElement();
        bi41Var.f27334c = 3;
        if (zn91.m96565n(completableIgnoreElement, bi41Var) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }
}
