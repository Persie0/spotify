package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: classes8.dex */
public final class nbj0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f152279a;

    /* JADX INFO: renamed from: b */
    public final i8g0 f152280b;

    /* JADX INFO: renamed from: c */
    public final kbj0 f152281c;

    /* JADX INFO: renamed from: d */
    public final vcj0 f152282d;

    /* JADX INFO: renamed from: e */
    public final b9v0 f152283e;

    /* JADX INFO: renamed from: f */
    public fbj0 f152284f;

    /* JADX INFO: renamed from: g */
    public final CompositeDisposable f152285g = new CompositeDisposable();

    /* JADX INFO: renamed from: h */
    public sbj0 f152286h = sbj0.f207519a;

    public nbj0(kv91 kv91Var, i8g0 i8g0Var, kbj0 kbj0Var, vcj0 vcj0Var, b9v0 b9v0Var) {
        this.f152279a = kv91Var;
        this.f152280b = i8g0Var;
        this.f152281c = kbj0Var;
        this.f152282d = vcj0Var;
        this.f152283e = b9v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m64078a(boolean z) {
        this.f152286h = sbj0.f207520b;
        if (!z) {
            this.f152285g.mo23393b(this.f152281c.m55945a().subscribe(new ebj0(this, 1)));
        }
        fbj0 fbj0Var = this.f152284f;
        if (fbj0Var == null) {
            wj50.m88260d0("view");
            throw null;
        }
        kcj0 kcj0VarMo25508h1 = fbj0Var.mo25508h1();
        a500 a500Var = fbj0Var.f67845C1;
        if (a500Var != null) {
            fbj0Var.f67844B1.mo23393b(kcj0VarMo25508h1.m56083X(a500Var).skip(z ? 1L : 0L).take(1L).subscribe(new sgb0(fbj0Var, 29)));
        } else {
            wj50.m88260d0("launcher");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m64079b() {
        this.f152286h = sbj0.f207521c;
        fbj0 fbj0Var = this.f152284f;
        if (fbj0Var == null) {
            wj50.m88260d0("view");
            throw null;
        }
        nbj0 nbj0VarMo25509i1 = ((ad21) fbj0Var).mo25509i1();
        kbj0 kbj0Var = nbj0VarMo25509i1.f152281c;
        nbj0VarMo25509i1.f152285g.mo23393b(kbj0Var.m55946b().flatMapCompletable(new k0a0(kbj0Var, 14)).m23292c(new CompletableFromAction(new mbj0(nbj0VarMo25509i1, 3))).subscribe());
    }
}
