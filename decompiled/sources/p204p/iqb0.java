package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class iqb0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f104709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Scheduler f104710c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xre f104711d;

    public /* synthetic */ iqb0(long j, Scheduler scheduler, xre xreVar, int i) {
        this.f104708a = i;
        this.f104709b = j;
        this.f104710c = scheduler;
        this.f104711d = xreVar;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        xf40 xf40VarMetadata;
        String str;
        Double dM29805p0;
        Flowable flowableM23313I;
        switch (this.f104708a) {
            case 0:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                double dDoubleValue = (contextTrack == null || (xf40VarMetadata = contextTrack.metadata()) == null || (str = (String) xf40VarMetadata.get("item.speed")) == null || (dM29805p0 = bm51.m29805p0(str)) == null) ? 1.0d : dM29805p0.doubleValue();
                boolean zIsPlaying = playerState.isPlaying();
                xre xreVar = this.f104711d;
                return (!zIsPlaying || playerState.isPaused()) ? Flowable.m23313I(Long.valueOf(bjg1.m29415B(playerState, dDoubleValue, xreVar))) : Flowable.m23312H(0L, this.f104709b, TimeUnit.MILLISECONDS, this.f104710c).m23331J(new hqb0(playerState, dDoubleValue, xreVar));
            default:
                PlayerState playerState2 = (PlayerState) obj;
                boolean zIsPlaying2 = playerState2.isPlaying();
                xre xreVar2 = this.f104711d;
                if (!zIsPlaying2 || playerState2.isPaused()) {
                    ((wy3) xreVar2).getClass();
                    flowableM23313I = Flowable.m23313I(playerState2.position(System.currentTimeMillis()));
                } else {
                    FlowableJust flowableJustM23313I = Flowable.m23313I(playerState2);
                    boolean z = s071.f204315a;
                    long j = this.f104709b;
                    flowableM23313I = Flowable.m23322h(flowableJustM23313I, new FlowableOnBackpressureLatest(Flowable.m23312H(0L, (!z || j >= 500) ? j : 500L, TimeUnit.MILLISECONDS, this.f104710c)), ily.f103537Y0).m23331J(new h9w(xreVar2));
                }
                return flowableM23313I.m23331J(new ezk0(playerState2, 16));
        }
    }
}
