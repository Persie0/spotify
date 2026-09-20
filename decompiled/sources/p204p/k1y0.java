package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class k1y0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f118450b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o1y0 f118451c;

    public /* synthetic */ k1y0(niz nizVar, o1y0 o1y0Var, int i) {
        this.f118449a = i;
        this.f118450b = nizVar;
        this.f118451c = o1y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        j1y0 j1y0Var;
        m1y0 m1y0Var;
        switch (this.f118449a) {
            case 0:
                if (fbkVar instanceof j1y0) {
                    j1y0Var = (j1y0) fbkVar;
                    int i = j1y0Var.f107886b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j1y0Var.f107886b = i - Integer.MIN_VALUE;
                    } else {
                        j1y0Var = new j1y0(this, fbkVar);
                    }
                } else {
                    j1y0Var = new j1y0(this, fbkVar);
                }
                Object obj2 = j1y0Var.f107885a;
                int i2 = j1y0Var.f107886b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    PlayerState playerState = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                    String strUri = contextTrack != null ? contextTrack.uri() : null;
                    Boolean boolValueOf = Boolean.valueOf(strUri != null && strUri.equals(this.f118451c.f160886d) && playerState.isPlaying() && !playerState.isPaused());
                    j1y0Var.f107886b = 1;
                    Object objEmit = this.f118450b.emit(boolValueOf, j1y0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof m1y0) {
                    m1y0Var = (m1y0) fbkVar;
                    int i3 = m1y0Var.f139164b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        m1y0Var.f139164b = i3 - Integer.MIN_VALUE;
                    } else {
                        m1y0Var = new m1y0(this, fbkVar);
                    }
                } else {
                    m1y0Var = new m1y0(this, fbkVar);
                }
                Object obj3 = m1y0Var.f139163a;
                int i4 = m1y0Var.f139164b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState2 = (PlayerState) obj;
                    ContextTrack contextTrack2 = (ContextTrack) playerState2.track().mo49283h();
                    String strUri2 = contextTrack2 != null ? contextTrack2.uri() : null;
                    Boolean boolValueOf2 = Boolean.valueOf(strUri2 != null && strUri2.equals(this.f118451c.f160886d) && playerState2.isPlaying() && !playerState2.isPaused());
                    m1y0Var.f139164b = 1;
                    Object objEmit2 = this.f118450b.emit(boolValueOf2, m1y0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
