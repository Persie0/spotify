package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes8.dex */
public final class n8p0 implements k8p0 {

    /* JADX INFO: renamed from: a */
    public final nbm0 f151576a;

    /* JADX INFO: renamed from: b */
    public final p8p0 f151577b;

    /* JADX INFO: renamed from: c */
    public final Flowable f151578c;

    /* JADX INFO: renamed from: d */
    public final uqw f151579d;

    public n8p0(scn scnVar, nbm0 nbm0Var, p8p0 p8p0Var, Flowable flowable) {
        this.f151576a = nbm0Var;
        this.f151577b = p8p0Var;
        this.f151578c = flowable;
        this.f151579d = scnVar.m77810d();
    }

    /* JADX INFO: renamed from: a */
    public final yab m63849a() {
        return k0e1.m54985d(new ObservableFromPublisher(this.f151578c.m23331J(new phn0(this, 6))));
    }

    /* JADX INFO: renamed from: b */
    public final LoggingParams m63850b(z650 z650Var) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(z650Var.f279709a);
        kbm0 kbm0Var = this.f151576a.get();
        String str = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str == null) {
            str = "";
        }
        return builderInteractionId.pageInstanceId(str).build();
    }

    /* JADX INFO: renamed from: c */
    public final Object m63851c(d850 d850Var, mb61 mb61Var) {
        Object objM96565n = zn91.m96565n(this.f151577b.mo48412a(new v7p0(PauseCommand.builder().loggingParams(m63850b(d850Var.f46380a)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("concerts-entity").build()).build())).ignoreElement(), mb61Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m63852d(String str, d850 d850Var, mb61 mb61Var) {
        Object objM96565n = zn91.m96565n(this.f151579d.m83821a(PlayCommand.builder(Context.fromUri(str), PlayOrigin.builder("concerts-entity").build()).loggingParams(m63850b(d850Var.f46380a)).build()).ignoreElement(), mb61Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m63853e(d850 d850Var, mb61 mb61Var) {
        Object objM96565n = zn91.m96565n(this.f151577b.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(m63850b(d850Var.f46380a)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("concerts-entity").build()).build())).ignoreElement(), mb61Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }
}
