package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes.dex */
public final class d43 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45050a;

    /* JADX INFO: renamed from: b */
    public int f45051b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ niz f45052c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Throwable f45053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d43(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f45050a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        niz nizVar = (niz) obj;
        Throwable th = (Throwable) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f45050a) {
            case 0:
                d43 d43Var = new d43(3, 0, fbkVar);
                d43Var.f45052c = nizVar;
                d43Var.f45053d = th;
                return d43Var.invokeSuspend(w2a1.f247311a);
            default:
                d43 d43Var2 = new d43(3, 1, fbkVar);
                d43Var2.f45052c = nizVar;
                d43Var2.f45053d = th;
                return d43Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f45050a) {
            case 0:
                niz nizVar = this.f45052c;
                Throwable th = this.f45053d;
                int i = this.f45051b;
                if (i == 0) {
                    bga.m29073P(obj);
                    s6x0 s6x0Var = new s6x0(new c6x0(th));
                    this.f45052c = null;
                    this.f45053d = null;
                    this.f45051b = 1;
                    Object objEmit = nizVar.emit(s6x0Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                niz nizVar2 = this.f45052c;
                Throwable th2 = this.f45053d;
                int i2 = this.f45051b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Logger.m3966b("Error observing playerState", th2);
                    PlayerState playerState = PlayerState.EMPTY;
                    this.f45052c = null;
                    this.f45053d = null;
                    this.f45051b = 1;
                    Object objEmit2 = nizVar2.emit(playerState, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
