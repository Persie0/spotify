package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes7.dex */
public final class l8k {

    /* JADX INFO: renamed from: a */
    public final xre f130881a;

    /* JADX INFO: renamed from: b */
    public final fiz f130882b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f130883c;

    /* JADX INFO: renamed from: d */
    public final p8p0 f130884d;

    /* JADX INFO: renamed from: e */
    public final r9k f130885e;

    public l8k(xre xreVar, fiz fizVar, nbm0 nbm0Var, String str, p8p0 p8p0Var) {
        this.f130881a = xreVar;
        this.f130882b = fizVar;
        this.f130883c = nbm0Var;
        this.f130884d = p8p0Var;
        this.f130885e = new r9k(str);
    }

    /* JADX INFO: renamed from: a */
    public final LoggingParams m58478a(String str) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str);
        ((wy3) this.f130881a).getClass();
        LoggingParams.Builder builderCommandInitiatedTime = builderInteractionId.commandInitiatedTime(Long.valueOf(System.currentTimeMillis()));
        kbm0 kbm0Var = this.f130883c.get();
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null) {
            str2 = "";
        }
        return builderCommandInitiatedTime.pageInstanceId(str2).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m58479b(String str, ibk ibkVar) {
        g8k g8kVar;
        if (ibkVar instanceof g8k) {
            g8kVar = (g8k) ibkVar;
            int i = g8kVar.f77543c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8kVar.f77543c = i - Integer.MIN_VALUE;
            } else {
                g8kVar = new g8k(this, ibkVar);
            }
        } else {
            g8kVar = new g8k(this, ibkVar);
        }
        Object obj = g8kVar.f77541a;
        int i2 = g8kVar.f77543c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = this.f130884d.mo48412a(new v7p0(PauseCommand.builder().loggingParams(m58478a(str)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("listux-contextplayerhandlerimpl").build()).build())).map(opg1.f167909R0);
        g8kVar.f77543c = 1;
        Object objM96567o = zn91.m96567o(map, g8kVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m58480c(String str, ibk ibkVar) {
        h8k h8kVar;
        if (ibkVar instanceof h8k) {
            h8kVar = (h8k) ibkVar;
            int i = h8kVar.f88722c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8kVar.f88722c = i - Integer.MIN_VALUE;
            } else {
                h8kVar = new h8k(this, ibkVar);
            }
        } else {
            h8kVar = new h8k(this, ibkVar);
        }
        Object obj = h8kVar.f88720a;
        int i2 = h8kVar.f88722c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = this.f130884d.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(m58478a(str)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("listux-contextplayerhandlerimpl").build()).build())).map(g2h1.f75939P0);
        h8kVar.f88722c = 1;
        Object objM96567o = zn91.m96567o(map, h8kVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r8 == r4) goto L29;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m58481d(String str, String str2, ibk ibkVar) {
        i8k i8kVar;
        if (ibkVar instanceof i8k) {
            i8kVar = (i8k) ibkVar;
            int i = i8kVar.f99803e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8kVar.f99803e = i - Integer.MIN_VALUE;
            } else {
                i8kVar = new i8k(this, ibkVar);
            }
        } else {
            i8kVar = new i8k(this, ibkVar);
        }
        Object objM86755t = i8kVar.f99801c;
        int i2 = i8kVar.f99803e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            i8kVar.f99799a = str;
            i8kVar.f99800b = str2;
            i8kVar.f99803e = 1;
            objM86755t = vyf1.m86755t(this.f130882b, i8kVar);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str2 = i8kVar.f99800b;
            str = i8kVar.f99799a;
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return w2a1.f247311a;
        PlayerState playerState = (PlayerState) objM86755t;
        if (th1.m80804f(playerState, this.f130885e).f278263a.m30587b() && playerState.track().mo49279c() && playerState.restrictions().disallowSkippingNextReasons().isEmpty() && wj50.m88271j(((ContextTrack) playerState.track().mo49278b()).uri(), str)) {
            Single singleMo48412a = this.f130884d.mo48412a(new d8p0(SkipToNextTrackCommand.builder().loggingParams(m58478a(str2)).build()));
            i8kVar.f99799a = null;
            i8kVar.f99800b = null;
            i8kVar.f99803e = 2;
            objM86755t = zn91.m96567o(singleMo48412a, i8kVar);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m58482e(String str, ibk ibkVar) {
        k8k k8kVar;
        l8k l8kVar;
        l8k l8kVar2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (ibkVar instanceof k8k) {
            k8kVar = (k8k) ibkVar;
            int i = k8kVar.f120384e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8kVar.f120384e = i - Integer.MIN_VALUE;
            } else {
                k8kVar = new k8k(this, ibkVar);
            }
        } else {
            k8kVar = new k8k(this, ibkVar);
        }
        Object objM86755t = k8kVar.f120382c;
        int i2 = k8kVar.f120384e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM62953p = mvl0.m62953p(new nzx0(new xvd(this.f130882b, fbkVar, this, 22)));
            k8kVar.f120380a = str;
            k8kVar.f120384e = 1;
            objM86755t = vyf1.m86755t(fizVarM62953p, k8kVar);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                l8kVar2 = k8kVar.f120381b;
                bga.m29073P(objM86755t);
                zBooleanValue = ((Boolean) objM86755t).booleanValue();
                l8kVar2.getClass();
                if (zBooleanValue) {
                    return Boolean.FALSE;
                }
                return null;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l8kVar = k8kVar.f120381b;
            bga.m29073P(objM86755t);
            zBooleanValue2 = ((Boolean) objM86755t).booleanValue();
            l8kVar.getClass();
            if (zBooleanValue2) {
                return Boolean.TRUE;
            }
            return null;
        }
        str = k8kVar.f120380a;
        bga.m29073P(objM86755t);
        z190 z190Var = (z190) objM86755t;
        if (!z190Var.f278263a.m30587b()) {
            if (z190Var.f278263a == bv41.f31275b) {
                k8kVar.f120380a = null;
                k8kVar.f120381b = this;
                k8kVar.f120384e = 3;
                objM86755t = m58480c(str, k8kVar);
                if (objM86755t != yukVar) {
                    l8kVar = this;
                    zBooleanValue2 = ((Boolean) objM86755t).booleanValue();
                    l8kVar.getClass();
                    if (zBooleanValue2) {
                        return Boolean.TRUE;
                    }
                }
            }
            return null;
        }
        k8kVar.f120380a = null;
        k8kVar.f120381b = this;
        k8kVar.f120384e = 2;
        objM86755t = m58479b(str, k8kVar);
        if (objM86755t != yukVar) {
            l8kVar2 = this;
            zBooleanValue = ((Boolean) objM86755t).booleanValue();
            l8kVar2.getClass();
            if (zBooleanValue) {
                return Boolean.FALSE;
            }
            return null;
        }
        return yukVar;
    }
}
