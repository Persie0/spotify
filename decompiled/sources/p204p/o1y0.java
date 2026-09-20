package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class o1y0 implements f7p0 {

    /* JADX INFO: renamed from: a */
    public final xre f160883a;

    /* JADX INFO: renamed from: b */
    public final uqw f160884b;

    /* JADX INFO: renamed from: c */
    public final hrw f160885c;

    /* JADX INFO: renamed from: d */
    public final String f160886d;

    /* JADX INFO: renamed from: e */
    public final long f160887e;

    /* JADX INFO: renamed from: f */
    public final s7p0 f160888f;

    /* JADX INFO: renamed from: g */
    public final l1y0 f160889g;

    /* JADX INFO: renamed from: h */
    public final l1y0 f160890h;

    /* JADX INFO: renamed from: i */
    public final ysk f160891i;

    public o1y0(xre xreVar, uqw uqwVar, jdp0 jdp0Var, hrw hrwVar, String str, long j, s7p0 s7p0Var) {
        this.f160883a = xreVar;
        this.f160884b = uqwVar;
        this.f160885c = hrwVar;
        this.f160886d = str;
        this.f160887e = j;
        this.f160888f = s7p0Var;
        Flowable flowableMo53041b = jdp0Var.mo53041b();
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f160889g = new l1y0(new onc(flowableMo53041b), this, 0);
        this.f160890h = new l1y0(new onc(jdp0Var.mo53041b()), this, 1);
        this.f160891i = new ysk(Boolean.FALSE, 27);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.f7p0
    /* JADX INFO: renamed from: a */
    public final Object mo40981a(d850 d850Var, fbk fbkVar) {
        n1y0 n1y0Var;
        long jCurrentTimeMillis;
        z650 z650Var;
        if (fbkVar instanceof n1y0) {
            n1y0Var = (n1y0) fbkVar;
            int i = n1y0Var.f149564e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1y0Var.f149564e = i - Integer.MIN_VALUE;
            } else {
                n1y0Var = new n1y0(this, (ibk) fbkVar);
            }
        } else {
            n1y0Var = new n1y0(this, (ibk) fbkVar);
        }
        Object objM86755t = n1y0Var.f149562c;
        int i2 = n1y0Var.f149564e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            ((wy3) this.f160883a).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            z650Var = d850Var.f46380a;
            n1y0Var.f149560a = z650Var;
            n1y0Var.f149561b = jCurrentTimeMillis;
            n1y0Var.f149564e = 1;
            objM86755t = vyf1.m86755t(this.f160890h, n1y0Var);
            if (objM86755t != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM86755t);
                return objM86755t;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return objM86755t;
        }
        jCurrentTimeMillis = n1y0Var.f149561b;
        z650Var = n1y0Var.f149560a;
        bga.m29073P(objM86755t);
        if (((Boolean) objM86755t).booleanValue()) {
            String str = z650Var.f279709a;
            n1y0Var.f149560a = null;
            n1y0Var.f149561b = jCurrentTimeMillis;
            n1y0Var.f149564e = 2;
            Object objM66087c = m66087c(jCurrentTimeMillis, str, n1y0Var);
            if (objM66087c != obj) {
                return objM66087c;
            }
        } else {
            n1y0Var.f149560a = null;
            n1y0Var.f149561b = jCurrentTimeMillis;
            n1y0Var.f149564e = 3;
            Object objM66088d = m66088d(z650Var, jCurrentTimeMillis, n1y0Var);
            if (objM66088d != obj) {
                return objM66088d;
            }
        }
        return obj;
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: b */
    public final fiz mo40982b() {
        return this.f160891i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m66087c(long j, String str, ibk ibkVar) {
        h1y0 h1y0Var;
        if (ibkVar instanceof h1y0) {
            h1y0Var = (h1y0) ibkVar;
            int i = h1y0Var.f86777c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1y0Var.f86777c = i - Integer.MIN_VALUE;
            } else {
                h1y0Var = new h1y0(this, ibkVar);
            }
        } else {
            h1y0Var = new h1y0(this, ibkVar);
        }
        Object objM96567o = h1y0Var.f86775a;
        int i2 = h1y0Var.f86777c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = this.f160885c.mo48412a(new v7p0(PauseCommand.builder().loggingParams(LoggingParams.builder().interactionId(str).commandInitiatedTime(Long.valueOf(j)).build()).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("song-dna").build()).build()));
            h1y0Var.f86777c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, h1y0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return Boolean.valueOf(((lcf) objM96567o) instanceof icf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m66088d(z650 z650Var, long j, ibk ibkVar) {
        i1y0 i1y0Var;
        if (ibkVar instanceof i1y0) {
            i1y0Var = (i1y0) ibkVar;
            int i = i1y0Var.f97623c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1y0Var.f97623c = i - Integer.MIN_VALUE;
            } else {
                i1y0Var = new i1y0(this, ibkVar);
            }
        } else {
            i1y0Var = new i1y0(this, ibkVar);
        }
        Object objM96567o = i1y0Var.f97621a;
        int i2 = i1y0Var.f97623c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            s7p0 s7p0Var = this.f160888f;
            String str = s7p0Var.f206455b;
            if (str == null || wl51.m88460J0(str)) {
                str = null;
            }
            String str2 = this.f160886d;
            ContextTrack.Builder builder = ContextTrack.builder(str2);
            if (str != null) {
                builder = builder.metadata(Collections.singletonMap("custom_reporting_attribution", str));
            }
            Context.Builder builderPages = Context.builder(str2).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(builder.build())).build()));
            if (str != null) {
                builderPages = builderPages.metadata(Collections.singletonMap("custom_reporting_attribution", str));
            }
            Context contextBuild = builderPages.build();
            Single singleM83821a = this.f160884b.m83821a(PlayCommand.builder(contextBuild, PlayOrigin.builder("song-dna").referrerIdentifier(s7p0Var.f206454a).build()).options(PreparePlayOptions.builder().seekTo(new Long(this.f160887e)).build()).loggingParams(LoggingParams.builder().interactionId(z650Var.f279709a).commandInitiatedTime(Long.valueOf(j)).build()).build());
            i1y0Var.f97623c = 1;
            objM96567o = zn91.m96567o(singleM83821a, i1y0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return Boolean.valueOf(((lcf) objM96567o) instanceof icf);
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: i */
    public final fiz mo40983i() {
        return this.f160890h;
    }

    @Override // p204p.f7p0
    public final fiz isActive() {
        return this.f160889g;
    }
}
