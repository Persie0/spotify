package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: classes2.dex */
public final class e5p0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public int f56442a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ niz f56443b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Throwable f56444c;

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        e5p0 e5p0Var = new e5p0(3, (fbk) obj3);
        e5p0Var.f56443b = (niz) obj;
        e5p0Var.f56444c = (Throwable) obj2;
        return e5p0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        niz nizVar = this.f56443b;
        Throwable th = this.f56444c;
        int i = this.f56442a;
        if (i == 0) {
            bga.m29073P(obj);
            Logger.m3966b("Error observing player error", th);
            PlayerError playerErrorBuild = PlayerError.builder(ErrorType.UNKNOWN).build();
            this.f56443b = null;
            this.f56444c = null;
            this.f56442a = 1;
            Object objEmit = nizVar.emit(playerErrorBuild, this);
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
    }
}
