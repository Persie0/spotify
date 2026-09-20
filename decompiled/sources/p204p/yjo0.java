package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* JADX INFO: loaded from: classes7.dex */
public final class yjo0 implements kj30 {

    /* JADX INFO: renamed from: a */
    public final uqw f273415a;

    /* JADX INFO: renamed from: b */
    public final C1668ai f273416b;

    /* JADX INFO: renamed from: c */
    public final csy f273417c;

    /* JADX INFO: renamed from: d */
    public final kv91 f273418d;

    /* JADX INFO: renamed from: e */
    public final nbm0 f273419e;

    /* JADX INFO: renamed from: f */
    public final PlayOrigin f273420f;

    /* JADX INFO: renamed from: g */
    public final lwr f273421g = new lwr();

    public yjo0(uqw uqwVar, C1668ai c1668ai, csy csyVar, kv91 kv91Var, hc80 hc80Var, nbm0 nbm0Var, PlayOrigin playOrigin) {
        this.f273415a = uqwVar;
        this.f273416b = c1668ai;
        this.f273417c = csyVar;
        this.f273418d = kv91Var;
        this.f273419e = nbm0Var;
        this.f273420f = playOrigin;
        hc80Var.getLifecycle().mo31986a(new xjo0(this, hc80Var));
    }

    @Override // p204p.kj30
    /* JADX INFO: renamed from: a */
    public final void mo44172a(mj30 mj30Var, zj30 zj30Var) {
        fk30 fk30Var = zj30Var.f283345b;
        Context contextM79161s = srz.m79161s(mj30Var.data());
        if (contextM79161s != null) {
            String strString = mj30Var.data().string("uri");
            if (strString == null) {
                strString = "";
            }
            PreparePlayOptions preparePlayOptionsM79162t = srz.m79162t(mj30Var.data());
            boolean z = false;
            boolean zBooleanValue = (preparePlayOptionsM79162t != null && preparePlayOptionsM79162t.playerOptionsOverride().mo49279c() && ((PlayerOptionOverrides) preparePlayOptionsM79162t.playerOptionsOverride().mo49278b()).shufflingContext().mo49279c()) ? ((Boolean) ((PlayerOptionOverrides) preparePlayOptionsM79162t.playerOptionsOverride().mo49278b()).shufflingContext().mo49278b()).booleanValue() : false;
            csy csyVar = this.f273417c;
            String str = this.f273418d.mo57453r(zBooleanValue ? csyVar.m33789E(zj30Var).m91838r(strString) : csyVar.m33789E(zj30Var).m91835o(strString), null).f46380a.f279709a;
            xul0 xul0VarTrackUri = (preparePlayOptionsM79162t == null || !preparePlayOptionsM79162t.skipTo().mo49279c()) ? C2244p5.f174033a : ((SkipToTrack) preparePlayOptionsM79162t.skipTo().mo49278b()).trackUri();
            boolean zBoolValue = fk30Var.metadata().boolValue("explicit", false);
            C1668ai c1668ai = this.f273416b;
            if (c1668ai.f15839b && zBoolValue) {
                z = true;
            }
            if (z && xul0VarTrackUri.mo49279c()) {
                String str2 = (String) xul0VarTrackUri.mo49278b();
                contextM79161s.uri();
                ((emx) c1668ai.f15840c).m39465a(str2);
            } else {
                kbm0 kbm0Var = this.f273419e.get();
                PlayCommand.Builder builderLoggingParams = PlayCommand.builder(contextM79161s, this.f273420f).loggingParams(LoggingParams.builder().interactionId(str).pageInstanceId(kbm0Var != null ? kbm0Var.f121231a : "").build());
                if (preparePlayOptionsM79162t != null) {
                    builderLoggingParams.options(preparePlayOptionsM79162t);
                }
                this.f273421g.m60127a(this.f273415a.m83821a(builderLoggingParams.build()).subscribe());
            }
        }
    }
}
