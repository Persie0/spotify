package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class ont implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qpt f167357a;

    public ont(qpt qptVar) {
        this.f167357a = qptVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objM44622b;
        rht rhtVar = (rht) obj;
        vse vseVar = this.f167357a.f191376c;
        String str = rhtVar.f199339a;
        String strM88469S0 = wl51.m88469S0(str, "spotify:chat:");
        if (strM88469S0.equals(str) || strM88469S0.length() <= 0) {
            strM88469S0 = null;
        }
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        if (strM88469S0 != null && strM88469S0.length() != 0) {
            gfi0 gfi0Var = vseVar.f244415a;
            String strConcat = "spotify:listening-activity:group-details:".concat(strM88469S0);
            d850 d850Var = rhtVar.f199340b;
            n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
            if (strConcat == null) {
                throw new IllegalStateException("uri was not set!");
            }
            objM44622b = gfi0Var.m44622b(new p6j0(strConcat, "", false, false, 0, 0, false, null, null, n6j0Var), null, ibkVar);
            if (objM44622b != yukVar) {
            }
            if (objM44622b == yukVar) {
                return objM44622b;
            }
            return w2a1Var;
        }
        Logger.m3973i(s571.m77251j("GroupFeedActivityCarouselItem: cannot route to group details — invalid conversation URI '", rhtVar.f199339a, "'"), new Object[0]);
        objM44622b = w2a1Var;
        if (objM44622b == yukVar) {
            return objM44622b;
        }
        return w2a1Var;
    }
}
