package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class fex implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68849a;

    /* JADX INFO: renamed from: b */
    public final Object f68850b;

    public /* synthetic */ fex(Object obj, int i) {
        this.f68849a = i;
        this.f68850b = obj;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a("EvoPage :: onCreate", new Object[0]);
                break;
            case 1:
                ((i700) this.f68850b).f99398g.m95393f();
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_CREATE);
                break;
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a("EvoPage :: onDestroy", new Object[0]);
                break;
            case 1:
                i700 i700Var = (i700) this.f68850b;
                i700Var.f99398g.m95394g();
                i700Var.f99399h.m66676g(ta80.ON_DESTROY);
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_DESTROY);
                break;
            default:
                ArrayDeque arrayDeque = ((xiy0) this.f68850b).f261965a;
                Iterator it = new ArrayDeque(arrayDeque).iterator();
                while (it.hasNext()) {
                    xiy0.m91164g((piy0) it.next(), true);
                }
                arrayDeque.clear();
                hc80Var.getLifecycle().mo31988d(this);
                break;
        }
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a("EvoPage :: onPause", new Object[0]);
                break;
            case 1:
                i700 i700Var = (i700) this.f68850b;
                i700Var.f99391Z = false;
                i700Var.f99398g.m95396j();
                i700Var.f99399h.m66676g(ta80.ON_PAUSE);
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_PAUSE);
                break;
            default:
                piy0 piy0Var = (piy0) ((xiy0) this.f68850b).f261965a.peek();
                if (piy0Var != null) {
                    piy0Var.m70119b(ta80.ON_PAUSE);
                    break;
                }
                break;
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a("EvoPage :: onResume", new Object[0]);
                break;
            case 1:
                i700 i700Var = (i700) this.f68850b;
                z4y z4yVar = i700Var.f99398g;
                bsa bsaVar = i700Var.f99401t;
                if (!bsaVar.f30266b) {
                    bsaVar.f30266b = true;
                    p4l0 p4l0Var = (p4l0) bsaVar.f30270f;
                    if (p4l0Var != null) {
                        ((cxi) bsaVar.f30269e).m69850c(p4l0Var.f173978b, p4l0Var.f173979c, (Intent) p4l0Var.f173980d);
                    }
                    bsaVar.f30270f = null;
                }
                z4yVar.m95409y();
                i700Var.f99391Z = true;
                z4yVar.m95400n();
                i700Var.f99399h.m66676g(ta80.ON_RESUME);
                z4yVar.m95397k();
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_RESUME);
                break;
            default:
                piy0 piy0Var = (piy0) ((xiy0) this.f68850b).f261965a.peek();
                if (piy0Var != null) {
                    piy0Var.m70119b(ta80.ON_RESUME);
                    break;
                }
                break;
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a(s571.m77246e(((Context) this.f68850b).getResources().getConfiguration().orientation, "EvoPage :: onStart - orientation: "), new Object[0]);
                break;
            case 1:
                i700 i700Var = (i700) this.f68850b;
                z4y z4yVar = i700Var.f99398g;
                z4yVar.m95409y();
                i700Var.f99387L0 = false;
                if (!i700Var.f99390Y) {
                    i700Var.f99390Y = true;
                    z4yVar.m95391c();
                }
                z4yVar.m95400n();
                i700Var.f99399h.m66676g(ta80.ON_START);
                z4yVar.m95398l();
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_START);
                break;
            default:
                piy0 piy0Var = (piy0) ((xiy0) this.f68850b).f261965a.peek();
                if (piy0Var != null) {
                    piy0Var.m70119b(ta80.ON_START);
                    break;
                }
                break;
        }
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        switch (this.f68849a) {
            case 0:
                Logger.m3965a(s571.m77246e(((Context) this.f68850b).getResources().getConfiguration().orientation, "EvoPage :: onStop - orientation: "), new Object[0]);
                break;
            case 1:
                i700 i700Var = (i700) this.f68850b;
                z4y z4yVar = i700Var.f99398g;
                i700Var.f99387L0 = true;
                while (i700.m49826a(z4yVar.m95407w())) {
                }
                z4yVar.m95399m();
                i700Var.f99399h.m66676g(ta80.ON_STOP);
                break;
            case 2:
                ((oc80) this.f68850b).m66676g(ta80.ON_STOP);
                break;
            default:
                piy0 piy0Var = (piy0) ((xiy0) this.f68850b).f261965a.peek();
                if (piy0Var != null) {
                    piy0Var.m70119b(ta80.ON_STOP);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m41488a(hc80 hc80Var) {
    }
}
