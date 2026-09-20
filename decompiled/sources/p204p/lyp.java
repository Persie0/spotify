package p204p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes6.dex */
public final class lyp {

    /* JADX INFO: renamed from: a */
    public final uqw f138083a;

    /* JADX INFO: renamed from: b */
    public final bho0 f138084b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f138085c;

    /* JADX INFO: renamed from: d */
    public final yxp f138086d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f138087e;

    public lyp(uqw uqwVar, bho0 bho0Var, nbm0 nbm0Var, yxp yxpVar, Scheduler scheduler) {
        this.f138083a = uqwVar;
        this.f138084b = bho0Var;
        this.f138085c = nbm0Var;
        this.f138086d = yxpVar;
        this.f138087e = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final LoggingParams m60261a(String str) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str);
        kbm0 kbm0Var = this.f138085c.get();
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null) {
            str2 = "";
        }
        return builderInteractionId.pageInstanceId(str2).build();
    }
}
