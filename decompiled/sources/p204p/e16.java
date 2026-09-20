package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public final class e16 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55122a;

    /* JADX INFO: renamed from: b */
    public final Object f55123b;

    public /* synthetic */ e16(Object obj, int i) {
        this.f55122a = i;
        this.f55123b = obj;
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        switch (this.f55122a) {
            case 0:
                ((f16) this.f55123b).mo34586e();
                break;
            case 1:
                ((xy3) ((oxe) this.f55123b)).m92397b("user_backgrounded");
                break;
            case 2:
                wpj wpjVar = (wpj) this.f55123b;
                di41 di41Var = wpjVar.f253776d;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                wpjVar.f253776d = null;
                lg21 lg21Var = wpjVar.f253775c;
                if (lg21Var != null) {
                    lg21Var.m58929h();
                }
                wpjVar.f253775c = null;
                s9p0 s9p0Var = wpjVar.f253777e;
                if (s9p0Var != null) {
                    wpjVar.f253773a.mo32674b(s9p0Var);
                }
                wpjVar.f253777e = null;
                wpjVar.f253778f.m97090l(null);
                wpjVar.f253780h.m97090l(null);
                break;
            case 3:
                ((ago) this.f55123b).m25872i();
                hc80Var.getLifecycle().mo31988d(this);
                break;
            case 4:
                ((pro) this.f55123b).f180652d.m27967b();
                break;
            case 5:
                kuo kuoVar = (kuo) this.f55123b;
                b8b b8bVar = new b8b(kuoVar, 19);
                ReentrantLock reentrantLock = kuoVar.f126647b;
                reentrantLock.lock();
                b8bVar.invoke();
                reentrantLock.unlock();
                break;
            case 6:
                yho yhoVar = (yho) this.f55123b;
                ((CompositeDisposable) yhoVar.f272931f).m23396g();
                yhoVar.m93678q();
                break;
            case 7:
                ((cl20) this.f55123b).f39168m.m60129c();
                break;
            case 8:
                ((b2q0) ((i780) this.f55123b).f99466c).m27967b();
                break;
            case 9:
                ((Disposable) this.f55123b).dispose();
                hc80Var.getLifecycle().mo31988d(this);
                break;
            case 10:
                ((s2o) this.f55123b).m77087n(lin0.f133827L0);
                break;
            case 11:
                zs0 zs0Var = (zs0) this.f55123b;
                if (!zs0Var.f285794a) {
                    zs0Var.m96808q("failure", "cancelled");
                } else {
                    zs0Var.m96808q("failure", "all-rows-failed");
                }
                break;
            default:
                ((dda1) this.f55123b).f47758b.m60129c();
                break;
        }
    }
}
