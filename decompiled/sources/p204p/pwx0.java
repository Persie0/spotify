package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public final class pwx0 extends AbstractC2522w6 implements sir0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f182150f = AtomicIntegerFieldUpdater.newUpdater(pwx0.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;

    /* JADX INFO: renamed from: d */
    public final ObservableEmitter f182151d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f182152e;

    public pwx0(juk jukVar, ObservableEmitter observableEmitter) {
        super(jukVar, false, true);
        this.f182151d = observableEmitter;
        this.f182152e = msi0.m62770a();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m71313A0(Throwable th, boolean z) {
        lsi0 lsi0Var = this.f182152e;
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f182150f;
            if (atomicIntegerFieldUpdater.get(this) == -2) {
                return;
            }
            atomicIntegerFieldUpdater.set(this, -2);
            Throwable th2 = th != null ? th : null;
            juk jukVar = this.f248218c;
            ObservableEmitter observableEmitter = this.f182151d;
            if (th2 == null) {
                try {
                    observableEmitter.onComplete();
                } catch (Exception e) {
                    pp91.m70540u(e, jukVar);
                }
            } else if ((th2 instanceof UndeliverableException) && !z) {
                pp91.m70540u(th, jukVar);
            } else if (th2 != mo26603h() || !observableEmitter.isDisposed()) {
                try {
                    observableEmitter.onError(th);
                } catch (Exception e2) {
                    y85.m93061f(th, e2);
                    pp91.m70540u(th, jukVar);
                }
            }
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: B0 */
    public final void m71314B0() {
        boolean z;
        lsi0 lsi0Var = this.f182152e;
        lsi0Var.mo54249c(null);
        if (isActive() || !lsi0Var.m59837g()) {
            return;
        }
        Throwable thM38787Z = m38787Z();
        Object obj = eg60.f59229a.get(this);
        if (obj instanceof ruf) {
            z = ruf.f202837b.get((ruf) obj) == 1;
        }
        m71313A0(thM38787Z, z);
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: E */
    public final boolean mo30213E() {
        return !isActive();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.bqz0
    /* JADX INFO: renamed from: d */
    public final Object mo30229d(Object obj, fbk fbkVar) {
        owx0 owx0Var;
        if (fbkVar instanceof owx0) {
            owx0Var = (owx0) fbkVar;
            int i = owx0Var.f170801d;
            if ((i & Integer.MIN_VALUE) != 0) {
                owx0Var.f170801d = i - Integer.MIN_VALUE;
            } else {
                owx0Var = new owx0(this, fbkVar);
            }
        } else {
            owx0Var = new owx0(this, fbkVar);
        }
        Object obj2 = owx0Var.f170799b;
        int i2 = owx0Var.f170801d;
        if (i2 == 0) {
            bga.m29073P(obj2);
            owx0Var.f170798a = obj;
            owx0Var.f170801d = 1;
            Object objMo54248a = this.f182152e.mo54248a(owx0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = owx0Var.f170798a;
            bga.m29073P(obj2);
        }
        IllegalStateException illegalStateExceptionM71316z0 = m71316z0(obj);
        if (illegalStateExceptionM71316z0 == null) {
            return w2a1.f247311a;
        }
        throw illegalStateExceptionM71316z0;
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: j */
    public final Object mo30231j(Object obj) {
        if (!this.f182152e.m59837g()) {
            return unc.f232138b;
        }
        IllegalStateException illegalStateExceptionM71316z0 = m71316z0(obj);
        return illegalStateExceptionM71316z0 == null ? w2a1.f247311a : new snc(illegalStateExceptionM71316z0);
    }

    @Override // p204p.bqz0
    /* JADX INFO: renamed from: w */
    public final void mo30244w(gh00 gh00Var) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // p204p.AbstractC2522w6
    /* JADX INFO: renamed from: w0 */
    public final void mo65806w0(Throwable th, boolean z) {
        if (f182150f.compareAndSet(this, 0, -1) && this.f182152e.m59837g()) {
            m71313A0(th, z);
        }
    }

    @Override // p204p.AbstractC2522w6
    /* JADX INFO: renamed from: x0 */
    public final void mo65807x0(Object obj) {
        if (f182150f.compareAndSet(this, 0, -1) && this.f182152e.m59837g()) {
            m71313A0(null, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: z0 */
    public final IllegalStateException m71316z0(Object obj) {
        boolean z;
        if (!isActive()) {
            Throwable thM38787Z = m38787Z();
            Object obj2 = eg60.f59229a.get(this);
            if (obj2 instanceof ruf) {
                z = ruf.f202837b.get((ruf) obj2) == 1;
            }
            m71313A0(thM38787Z, z);
            return mo26603h();
        }
        try {
            this.f182151d.onNext(obj);
            m71314B0();
            return null;
        } catch (Throwable th) {
            UndeliverableException undeliverableException = new UndeliverableException(th);
            boolean zM38778Q = m38778Q(undeliverableException);
            m71314B0();
            if (zM38778Q) {
                return undeliverableException;
            }
            pp91.m70540u(undeliverableException, this.f248218c);
            return mo26603h();
        }
    }

    @Override // p204p.sir0
    /* JADX INFO: renamed from: c */
    public final bqz0 mo71315c() {
        return this;
    }
}
