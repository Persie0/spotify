package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetShuffleStateRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class bw11 {

    /* JADX INFO: renamed from: a */
    public final cbk f31494a;

    /* JADX INFO: renamed from: b */
    public final j331 f31495b;

    /* JADX INFO: renamed from: c */
    public final d3p0 f31496c;

    /* JADX INFO: renamed from: d */
    public final FlowableElementAtSingle f31497d;

    /* JADX INFO: renamed from: e */
    public final PublishSubject f31498e = new PublishSubject();

    /* JADX INFO: renamed from: f */
    public final PublishSubject f31499f = new PublishSubject();

    public bw11(cbk cbkVar, j331 j331Var, d3p0 d3p0Var, FlowableElementAtSingle flowableElementAtSingle) {
        this.f31494a = cbkVar;
        this.f31495b = j331Var;
        this.f31496c = d3p0Var;
        this.f31497d = flowableElementAtSingle;
    }

    /* JADX INFO: renamed from: a */
    public final CompletableAndThenCompletable m30655a(String str, boolean z, boolean z2, boolean z3) {
        Completable completableM23299p;
        if (z3) {
            d3p0 d3p0Var = this.f31496c;
            j2p0 j2p0Var = d3p0Var.f44962b;
            y2p0 y2p0VarM17604q = PlaybackSettingsEsperantoService$SetShuffleStateRequest.m17604q();
            d3p0Var.f44961a.getClass();
            y2p0VarM17604q.m92711q(tg1.m80723m(str) ? "spotify:collection:tracks" : str);
            y2p0VarM17604q.m92712r(z);
            y2p0VarM17604q.m92710m(z2 ? p2p0.RECOMMENDATION : p2p0.NOT_ENHANCED);
            completableM23299p = j2p0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetShuffleState", (PlaybackSettingsEsperantoService$SetShuffleStateRequest) y2p0VarM17604q.build()).map(dzx.f54779X0).ignoreElement().m23299p(Functions.f7232h);
        } else {
            completableM23299p = CompletableEmpty.f7437a;
        }
        return completableM23299p.m23292c(new CompletableFromAction(new aw11(this, str, z, z2)));
    }
}
