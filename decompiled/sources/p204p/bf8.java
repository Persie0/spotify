package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class bf8 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f26622a;

    /* JADX INFO: renamed from: b */
    public final og8 f26623b;

    /* JADX INFO: renamed from: c */
    public final xre f26624c;

    /* JADX INFO: renamed from: d */
    public final zd8 f26625d;

    /* JADX INFO: renamed from: e */
    public final ae8 f26626e;

    /* JADX INFO: renamed from: f */
    public final er70 f26627f;

    /* JADX INFO: renamed from: g */
    public final kc8 f26628g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f26629h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f26630i;

    /* JADX INFO: renamed from: j */
    public final CompositeDisposable f26631j;

    /* JADX INFO: renamed from: k */
    public final fw7 f26632k;

    /* JADX INFO: renamed from: l */
    public final mg8 f26633l;

    /* JADX INFO: renamed from: m */
    public final PublishSubject f26634m;

    /* JADX INFO: renamed from: n */
    public final PublishSubject f26635n;

    /* JADX INFO: renamed from: o */
    public final ConcurrentHashMap f26636o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap f26637p;

    public bf8(Scheduler scheduler, og8 og8Var, xre xreVar, zd8 zd8Var, ae8 ae8Var, er70 er70Var, kc8 kc8Var, fw7 fw7Var, mg8 mg8Var) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f26622a = scheduler;
        this.f26623b = og8Var;
        this.f26624c = xreVar;
        this.f26625d = zd8Var;
        this.f26626e = ae8Var;
        this.f26627f = er70Var;
        this.f26628g = kc8Var;
        this.f26629h = concurrentHashMap;
        this.f26630i = concurrentHashMap2;
        this.f26631j = compositeDisposable;
        this.f26632k = fw7Var;
        this.f26633l = mg8Var;
        this.f26634m = new PublishSubject();
        this.f26635n = new PublishSubject();
        this.f26636o = new ConcurrentHashMap();
        this.f26637p = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static we8 m28999c(we8 we8Var, gh00 gh00Var) {
        if (we8Var instanceof ve8) {
            return (we8) gh00Var.invoke(((ve8) we8Var).m85297a());
        }
        if (we8Var instanceof ue8) {
            return we8Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static we8 m29000d(Object obj, re8 re8Var) {
        return obj != null ? new ve8(obj) : new ue8(re8Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m29001a(String str) {
        m29002b(new gf8(str));
    }

    /* JADX INFO: renamed from: b */
    public final void m29002b(pf8 pf8Var) {
        yf8 yf8Var = (yf8) this.f26627f.get();
        yf8Var.getClass();
        yf8Var.m93544a(new rf8(pf8Var));
    }

    /* JADX INFO: renamed from: e */
    public final void m29003e(pf8 pf8Var) {
        yf8 yf8Var = (yf8) this.f26627f.get();
        yf8Var.getClass();
        yf8Var.m93544a(new uf8(pf8Var));
    }
}
