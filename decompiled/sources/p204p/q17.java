package p204p;

import android.os.SystemClock;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class q17 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f184228b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xre f184229c;

    public /* synthetic */ q17(niz nizVar, xre xreVar, int i) {
        this.f184227a = i;
        this.f184228b = nizVar;
        this.f184229c = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        p17 p17Var;
        bcp0 bcp0Var;
        int i;
        Map mapMetadata;
        switch (this.f184227a) {
            case 0:
                if (fbkVar instanceof p17) {
                    p17Var = (p17) fbkVar;
                    int i2 = p17Var.f172962b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        p17Var.f172962b = i2 - Integer.MIN_VALUE;
                    } else {
                        p17Var = new p17(this, fbkVar);
                    }
                } else {
                    p17Var = new p17(this, fbkVar);
                }
                Object obj2 = p17Var.f172961a;
                int i3 = p17Var.f172962b;
                if (i3 == 0) {
                    bga.m29073P(obj2);
                    ((wy3) this.f184229c).getClass();
                    i17 i17Var = new i17((zgo0) obj, SystemClock.elapsedRealtime());
                    p17Var.f172962b = 1;
                    Object objEmit = this.f184228b.emit(i17Var, p17Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof bcp0) {
                    bcp0Var = (bcp0) fbkVar;
                    int i4 = bcp0Var.f25931b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bcp0Var.f25931b = i4 - Integer.MIN_VALUE;
                    } else {
                        bcp0Var = new bcp0(this, fbkVar);
                    }
                } else {
                    bcp0Var = new bcp0(this, fbkVar);
                }
                Object obj3 = bcp0Var.f25930a;
                int i5 = bcp0Var.f25931b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                    if (playerState.isPaused()) {
                        i = 2;
                    } else {
                        i = playerState.isPlaying() ? 1 : 3;
                    }
                    wy3 wy3Var = (wy3) this.f184229c;
                    wy3Var.getClass();
                    int iLongValue = (int) ((Number) playerState.position(System.currentTimeMillis()).mo49280e(new Long(0L))).longValue();
                    int iLongValue2 = (int) ((Number) playerState.duration().mo49280e(new Long(0L))).longValue();
                    wy3Var.getClass();
                    x3p0 x3p0Var = new x3p0(i, iLongValue, iLongValue2, SystemClock.elapsedRealtime(), (String) playerState.playbackId().mo49283h());
                    String strUri = contextTrack != null ? contextTrack.uri() : null;
                    String strContextUri = playerState.contextUri();
                    if (contextTrack == null || (mapMetadata = contextTrack.metadata()) == null) {
                        mapMetadata = nau.f152117a;
                    }
                    h6e1 h6e1Var = new h6e1(x3p0Var, new ie81(strUri, strContextUri, mapMetadata));
                    bcp0Var.f25931b = 1;
                    Object objEmit2 = this.f184228b.emit(h6e1Var, bcp0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
