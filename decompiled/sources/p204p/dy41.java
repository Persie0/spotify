package p204p;

import android.os.Handler;
import com.spotify.player.model.AdBreakContext;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.SleepTimer;
import com.spotify.player.model.command.SeekToCommand;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class dy41 {

    /* JADX INFO: renamed from: n */
    public static final long f54173n = TimeUnit.SECONDS.toMillis(3);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f54174o = 0;

    /* JADX INFO: renamed from: a */
    public final xre f54175a;

    /* JADX INFO: renamed from: b */
    public final by41 f54176b;

    /* JADX INFO: renamed from: c */
    public final cy41 f54177c;

    /* JADX INFO: renamed from: d */
    public final Handler f54178d;

    /* JADX INFO: renamed from: e */
    public boolean f54179e;

    /* JADX INFO: renamed from: f */
    public boolean f54180f;

    /* JADX INFO: renamed from: g */
    public boolean f54181g;

    /* JADX INFO: renamed from: h */
    public boolean f54182h;

    /* JADX INFO: renamed from: i */
    public PlayerState f54183i = PlayerState.EMPTY;

    /* JADX INFO: renamed from: j */
    public Runnable f54184j = new RunnableC2034k(13);

    /* JADX INFO: renamed from: k */
    public final BehaviorProcessor f54185k;

    /* JADX INFO: renamed from: l */
    public final FlowableRefCount f54186l;

    /* JADX INFO: renamed from: m */
    public final iwr f54187m;

    public dy41(FlowableObserveOn flowableObserveOn, xre xreVar, by41 by41Var, cy41 cy41Var, Handler handler) {
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.f54185k = behaviorProcessor;
        iwr iwrVar = new iwr();
        this.f54187m = iwrVar;
        this.f54186l = new FlowableRefCount(new FlowableDoFinally(behaviorProcessor.m23359w(new mb5(6, this, flowableObserveOn)), new vv2(iwrVar, 14)).m23336Q());
        this.f54175a = xreVar;
        this.f54176b = by41Var;
        this.f54177c = cy41Var;
        this.f54178d = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m37317a() {
        this.f54179e = true;
        m37323g(this.f54183i, 1, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m37318b() {
        m37323g(this.f54183i, 1, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m37319c() {
        this.f54179e = false;
        m37323g(this.f54183i, 1, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m37320d(boolean z) {
        this.f54180f = z;
        m37323g(this.f54183i, 1, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m37321e() {
        cy41 cy41Var = this.f54177c;
        if (cy41Var.f43160e.mo49279c() && cy41Var.f43163h + cy41Var.f43164i + 1 < cy41Var.f43162g.size()) {
            cy41Var.f43164i++;
            cy41Var.f43165j = new hzq0(dq60.m36607g((wy3) cy41Var.f43156a));
            cy41Var.m34338a();
        }
        m37323g(this.f54183i, 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    /* JADX INFO: renamed from: f */
    public final void m37322f(boolean z) {
        cy41 cy41Var;
        int i;
        int i2;
        if (z) {
            PlayerState playerState = this.f54183i;
            ((wy3) this.f54175a).getClass();
            if (((Long) playerState.position(System.currentTimeMillis()).mo49280e(0L)).longValue() >= f54173n) {
                this.f54176b.m30868b(0L, SeekToCommand.Relative.BEGINNING);
            } else {
                cy41Var = this.f54177c;
                if (cy41Var.f43160e.mo49279c()) {
                    i = cy41Var.f43163h;
                    i2 = cy41Var.f43164i;
                    if (i + i2 > 0) {
                        cy41Var.f43164i = i2 - 1;
                        cy41Var.f43165j = new hzq0(dq60.m36607g((wy3) cy41Var.f43156a));
                        cy41Var.m34338a();
                    }
                }
            }
        } else {
            cy41Var = this.f54177c;
            if (cy41Var.f43160e.mo49279c()) {
                i = cy41Var.f43163h;
                i2 = cy41Var.f43164i;
                if (i + i2 > 0) {
                    cy41Var.f43164i = i2 - 1;
                    cy41Var.f43165j = new hzq0(dq60.m36607g((wy3) cy41Var.f43156a));
                    cy41Var.m34338a();
                }
            }
        }
        m37323g(this.f54183i, 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX INFO: renamed from: g */
    public final void m37323g(PlayerState playerState, int i, boolean z) {
        boolean z2;
        by41 by41Var = this.f54176b;
        cy41 cy41Var = this.f54177c;
        xul0 xul0Var = C2244p5.f174033a;
        if (i == 2) {
            this.f54179e = playerState.isPaused();
            this.f54181g = playerState.options().repeatingTrack();
            this.f54182h = playerState.options().repeatingContext();
            this.f54180f = playerState.options().shufflingContext();
            if (!by41Var.f32072c.mo49279c() || by41Var.f32073d < playerState.timestamp()) {
                by41Var.f32071b = playerState;
                by41Var.f32072c = xul0Var;
                by41Var.f32073d = 0L;
            }
            if (!cy41Var.f43165j.mo49279c()) {
                pf40 pf40VarPrevTracks = playerState.prevTracks();
                xul0 xul0VarTrack = playerState.track();
                pf40 pf40VarNextTracks = playerState.nextTracks();
                ArrayList arrayList = new ArrayList(pf40VarNextTracks.size() + pf40VarPrevTracks.size() + 1);
                arrayList.addAll(pf40VarPrevTracks);
                arrayList.add((ContextTrack) xul0VarTrack.mo49283h());
                arrayList.addAll(pf40VarNextTracks);
                cy41Var.f43162g = arrayList;
                cy41Var.f43163h = playerState.prevTracks().size();
                cy41Var.f43164i = 0;
                cy41Var.f43165j = xul0Var;
                cy41Var.f43157b = playerState.playbackId();
                cy41Var.f43158c = playerState.index();
                cy41Var.m34338a();
            } else if (playerState.timestamp() >= ((Long) cy41Var.f43165j.mo49278b()).longValue()) {
                xul0 xul0VarTrack2 = playerState.track();
                String strUri = cy41Var.f43160e.mo49279c() ? ((ContextTrack) cy41Var.f43160e.mo49278b()).uri() : null;
                String strUri2 = xul0VarTrack2.mo49279c() ? ((ContextTrack) xul0VarTrack2.mo49278b()).uri() : "";
                xul0 xul0VarTrack3 = playerState.track();
                if (xul0VarTrack3.mo49279c()) {
                    String strProvider = ((ContextTrack) xul0VarTrack3.mo49278b()).provider();
                    if ("context".equals(strProvider) || "queue".equals(strProvider)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                if (z || strUri == null || strUri.equals(strUri2) || playerState.timestamp() >= ((Long) cy41Var.f43165j.mo49278b()).longValue() + 500 || z2) {
                    pf40 pf40VarPrevTracks2 = playerState.prevTracks();
                    xul0 xul0VarTrack4 = playerState.track();
                    pf40 pf40VarNextTracks2 = playerState.nextTracks();
                    ArrayList arrayList2 = new ArrayList(pf40VarNextTracks2.size() + pf40VarPrevTracks2.size() + 1);
                    arrayList2.addAll(pf40VarPrevTracks2);
                    arrayList2.add((ContextTrack) xul0VarTrack4.mo49283h());
                    arrayList2.addAll(pf40VarNextTracks2);
                    cy41Var.f43162g = arrayList2;
                    cy41Var.f43163h = playerState.prevTracks().size();
                    cy41Var.f43164i = 0;
                    cy41Var.f43165j = xul0Var;
                    cy41Var.f43157b = playerState.playbackId();
                    cy41Var.f43158c = playerState.index();
                    cy41Var.m34338a();
                }
            }
        }
        boolean zMo49279c = cy41Var.f43165j.mo49279c();
        Runnable runnable = this.f54184j;
        Handler handler = this.f54178d;
        handler.removeCallbacks(runnable);
        if (i == 2 && zMo49279c && !z) {
            scb scbVar = new scb(this, playerState, i, 13);
            this.f54184j = scbVar;
            handler.postDelayed(scbVar, 200L);
            return;
        }
        Double dValueOf = Double.valueOf(0.0d);
        ((wy3) this.f54175a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zMo49279c2 = cy41Var.f43165j.mo49279c();
        PlayerState.Builder builderOptions = PlayerState.builder().timestamp(jCurrentTimeMillis).contextUri(playerState.contextUri()).contextUrl(playerState.contextUrl()).contextRestrictions(playerState.contextRestrictions()).playOrigin(playerState.playOrigin()).isPlaying(playerState.isPlaying()).isPaused(this.f54179e).isBuffering(playerState.isBuffering()).isSystemInitiated(playerState.isSystemInitiated()).options(PlayerOptions.builder().shufflingContext(this.f54180f).repeatingContext(this.f54182h).repeatingTrack(this.f54181g).modes(playerState.options().modes()).build());
        Restrictions restrictions = playerState.restrictions();
        Restrictions.Builder builder = restrictions.toBuilder();
        HashSet hashSet = new HashSet(restrictions.disallowPausingReasons());
        if (this.f54179e) {
            hashSet.add("already_paused");
        } else {
            hashSet.remove("already_paused");
        }
        Restrictions.Builder builderDisallowPausingReasons = builder.disallowPausingReasons(hashSet);
        HashSet hashSet2 = new HashSet(restrictions.disallowResumingReasons());
        if (this.f54179e) {
            hashSet2.remove("not_paused");
        } else {
            hashSet2.add("not_paused");
        }
        PlayerState.Builder builderSignals = builderOptions.restrictions(builderDisallowPausingReasons.disallowResumingReasons(hashSet2).build()).suppressions(playerState.suppressions()).prevTracks(cy41Var.f43159d).nextTracks(cy41Var.f43161f).contextMetadata(playerState.contextMetadata()).pageMetadata(playerState.pageMetadata()).sessionId(playerState.sessionId()).queueRevision(playerState.queueRevision()).audioStream(playerState.audioStream()).signals(playerState.signals());
        xul0 xul0VarAdBreakContext = playerState.adBreakContext();
        if (xul0VarAdBreakContext.mo49279c()) {
            builderSignals.adBreakContext((AdBreakContext) xul0VarAdBreakContext.mo49278b());
        }
        xul0 xul0VarSleepTimer = playerState.sleepTimer();
        if (xul0VarSleepTimer.mo49279c()) {
            builderSignals.sleepTimer((SleepTimer) xul0VarSleepTimer.mo49278b());
        }
        xul0 xul0Var2 = cy41Var.f43160e;
        if (xul0Var2.mo49279c()) {
            builderSignals.track((ContextTrack) xul0Var2.mo49278b());
            xul0 xul0Var3 = !cy41Var.f43165j.mo49279c() ? cy41Var.f43157b : xul0Var;
            if (xul0Var3.mo49279c()) {
                builderSignals.playbackId((String) xul0Var3.mo49278b());
            }
            xul0 xul0VarPlaybackQuality = playerState.playbackQuality();
            if (xul0VarPlaybackQuality.mo49279c()) {
                builderSignals.playbackQuality((PlaybackQuality) xul0VarPlaybackQuality.mo49278b());
            }
            if (!cy41Var.f43165j.mo49279c()) {
                xul0Var = cy41Var.f43158c;
            }
            if (xul0Var.mo49279c()) {
                builderSignals.index((ContextIndex) xul0Var.mo49278b());
            }
        }
        if (!zMo49279c2) {
            xul0 xul0VarM30867a = by41Var.m30867a(jCurrentTimeMillis);
            if (xul0VarM30867a.mo49279c()) {
                builderSignals.positionAsOfTimestamp((Long) xul0VarM30867a.mo49278b());
            }
            xul0 xul0VarDuration = playerState.duration();
            if (xul0VarDuration.mo49279c()) {
                builderSignals.duration((Long) xul0VarDuration.mo49278b());
            }
            xul0 hzq0Var = (this.f54179e || !by41Var.f32071b.duration().mo49279c() || by41Var.f32072c.mo49279c()) ? new hzq0(dValueOf) : by41Var.f32071b.playbackSpeed();
            if (hzq0Var.mo49279c()) {
                builderSignals.playbackSpeed((Double) hzq0Var.mo49278b());
            }
        }
        PlayerState playerStateBuild = builderSignals.build();
        this.f54183i = playerStateBuild;
        this.f54185k.onNext(playerStateBuild);
    }
}
