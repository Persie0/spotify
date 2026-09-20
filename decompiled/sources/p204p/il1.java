package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class il1 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103260a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f103261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f103262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il1(String str, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f103260a = i;
        this.f103262c = str;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f103260a) {
            case 0:
                il1 il1Var = new il1(this.f103262c, fbkVar, 0);
                il1Var.f103261b = th;
                w2a1 w2a1Var = w2a1.f247311a;
                il1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                il1 il1Var2 = new il1(this.f103262c, fbkVar, 1);
                il1Var2.f103261b = th;
                w2a1 w2a1Var2 = w2a1.f247311a;
                il1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                il1 il1Var3 = new il1(this.f103262c, fbkVar, 2);
                il1Var3.f103261b = th;
                w2a1 w2a1Var3 = w2a1.f247311a;
                il1Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            default:
                il1 il1Var4 = new il1(this.f103262c, fbkVar, 3);
                il1Var4.f103261b = th;
                il1Var4.invokeSuspend(w2a1.f247311a);
                throw null;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f103260a) {
            case 0:
                Throwable th = this.f103261b;
                bga.m29073P(obj);
                Logger.m3967c(th, s571.m77251j("Metadata loading failed for Uri: ", this.f103262c, "."), new Object[0]);
                return w2a1.f247311a;
            case 1:
                Throwable th2 = this.f103261b;
                bga.m29073P(obj);
                Logger.m3967c(th2, edb.m38564m("Chat stream failed for party ", this.f103262c), new Object[0]);
                return w2a1.f247311a;
            case 2:
                Throwable th3 = this.f103261b;
                bga.m29073P(obj);
                Logger.m3967c(th3, edb.m38564m("Failed to load party metadata for ", this.f103262c), new Object[0]);
                return w2a1.f247311a;
            default:
                Throwable th4 = this.f103261b;
                bga.m29073P(obj);
                throw new IllegalStateException("Error while receiving pubsub message for ident: ".concat(this.f103262c), th4);
        }
    }
}
