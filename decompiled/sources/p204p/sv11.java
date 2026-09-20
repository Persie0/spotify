package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class sv11 implements rv11 {

    /* JADX INFO: renamed from: a */
    public final scn f214295a;

    /* JADX INFO: renamed from: b */
    public final nbm0 f214296b;

    /* JADX INFO: renamed from: c */
    public final lwr f214297c = new lwr();

    public sv11(scn scnVar, nbm0 nbm0Var) {
        this.f214295a = scnVar;
        this.f214296b = nbm0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m79422b(String str, String str2, String str3) {
        LoggingParams.Builder builder = LoggingParams.builder();
        kbm0 kbm0Var = this.f214296b.get();
        String str4 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str4 == null) {
            str4 = "";
        }
        LoggingParams loggingParamsBuild = builder.pageInstanceId(str4).interactionId("").build();
        if ((wl51.m88496t0(str, "spotify:search", false) || wl51.m88496t0(str3, "spotify:search", false)) && str2.length() > 0) {
            str = str2;
        }
        this.f214297c.m60127a(this.f214295a.m77810d().m83821a(PlayCommand.builder(Context.fromUri(str), PlayOrigin.create("pick-and-shuffle-cap")).options(PreparePlayOptions.builder().alwaysPlaySomething(true).initiallyPaused(false).build()).loggingParams(loggingParamsBuild).build()).subscribe(hyx0.f96711T0, hyx0.f96712U0));
    }
}
