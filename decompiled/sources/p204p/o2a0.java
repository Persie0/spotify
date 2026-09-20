package p204p;

import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.Event;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class o2a0 implements k2a0 {

    /* JADX INFO: renamed from: a */
    public final k530 f161007a;

    /* JADX INFO: renamed from: b */
    public final n7m f161008b;

    /* JADX INFO: renamed from: c */
    public final ax7 f161009c;

    public o2a0(k530 k530Var, n7m n7mVar, ax7 ax7Var) {
        this.f161007a = k530Var;
        this.f161008b = n7mVar;
        this.f161009c = ax7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r8 == r5) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m66106a(Effect.LoadMoreHomeStructure loadMoreHomeStructure, ibk ibkVar) {
        l2a0 l2a0Var;
        Object c6x0Var;
        Throwable thM77348a;
        if (ibkVar instanceof l2a0) {
            l2a0Var = (l2a0) ibkVar;
            int i = l2a0Var.f128958d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2a0Var.f128958d = i - Integer.MIN_VALUE;
            } else {
                l2a0Var = new l2a0(this, ibkVar);
            }
        } else {
            l2a0Var = new l2a0(this, ibkVar);
        }
        Object objM96571q = l2a0Var.f128956b;
        int i2 = l2a0Var.f128958d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96571q);
                n2a0 n2a0Var = new n2a0(this, loadMoreHomeStructure, null);
                l2a0Var.f128955a = null;
                l2a0Var.f128958d = 1;
                objM96571q = kk40.m56684z(n2a0Var, l2a0Var);
                if (objM96571q == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM96571q);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                thM77348a = l2a0Var.f128955a;
                bga.m29073P(objM96571q);
            }
            return new Event.FailedToLoadMoreHomeStructure(thM77348a, this.f161008b.f151186a, ((Boolean) objM96571q).booleanValue());
            c6x0Var = (pqm0) objM96571q;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null) {
            pqm0 pqm0Var = (pqm0) c6x0Var;
            return vj50.m85713A((x9c) pqm0Var.f180351b, ((Boolean) pqm0Var.f180350a).booleanValue());
        }
        Observable observable = this.f161009c.f20779b;
        l2a0Var.f128955a = thM77348a;
        l2a0Var.f128958d = 2;
        objM96571q = zn91.m96571q(observable, 1, null, l2a0Var);
    }
}
