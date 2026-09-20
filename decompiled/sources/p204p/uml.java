package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes6.dex */
public final class uml implements e0c1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d2j0 f231899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ scn f231900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wek0 f231901c;

    public uml(d2j0 d2j0Var, scn scnVar, wek0 wek0Var) {
        this.f231899a = d2j0Var;
        this.f231900b = scnVar;
        this.f231901c = wek0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83453a(String str, cvt cvtVar, ibk ibkVar) {
        tml tmlVar;
        LoggingParams loggingParamsBuild;
        if (ibkVar instanceof tml) {
            tmlVar = (tml) ibkVar;
            int i = tmlVar.f221749c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmlVar.f221749c = i - Integer.MIN_VALUE;
            } else {
                tmlVar = new tml(this, ibkVar);
            }
        } else {
            tmlVar = new tml(this, ibkVar);
        }
        Object obj = tmlVar.f221747a;
        int i2 = tmlVar.f221749c;
        if (i2 == 0) {
            bga.m29073P(obj);
            Context contextFromUri = Context.fromUri(str);
            if (cvtVar != null) {
                loggingParamsBuild = LoggingParams.builder().interactionId(m3h1.m60683w(cvtVar).f46380a.f279709a).build();
            } else {
                loggingParamsBuild = null;
            }
            PlayCommand.Builder builder = PlayCommand.builder(contextFromUri, this.f231899a.get());
            if (loggingParamsBuild != null) {
                builder.loggingParams(loggingParamsBuild);
            }
            Single singleM83821a = this.f231900b.m77810d().m83821a(builder.build());
            tmlVar.f221749c = 1;
            Object objM96567o = zn91.m96567o(singleM83821a, tmlVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f231901c.m87889c();
        return w2a1.f247311a;
    }
}
