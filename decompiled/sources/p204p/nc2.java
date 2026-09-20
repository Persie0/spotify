package p204p;

import android.content.Context;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 {

    /* JADX INFO: renamed from: a */
    public final qwx0 f152397a;

    /* JADX INFO: renamed from: b */
    public final Context f152398b;

    /* JADX INFO: renamed from: c */
    public final er70 f152399c;

    /* JADX INFO: renamed from: d */
    public final xst f152400d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f152401e;

    /* JADX INFO: renamed from: f */
    public final CompositeDisposable f152402f = new CompositeDisposable();

    public nc2(qwx0 qwx0Var, Context context, er70 er70Var, xst xstVar, Scheduler scheduler) {
        this.f152397a = qwx0Var;
        this.f152398b = context;
        this.f152399c = er70Var;
        this.f152400d = xstVar;
        this.f152401e = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m64106a() {
        return ((rwx0) this.f152397a).f203428a.map(new fkr0(this)).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b */
    public final void m64107b(String str, String str2) {
        Single singleM91977A;
        if (str2 == null || (singleM91977A = Single.just(str2)) == null) {
            singleM91977A = this.f152400d.m91977A(str);
        }
        this.f152402f.mo23393b(singleM91977A.timeout(2L, TimeUnit.SECONDS, this.f152401e, Single.error(new TimeoutException())).observeOn(this.f152401e).onErrorResumeNext(zp7.f284989f).doFinally(new s12(this, 1)).subscribe(new mc2(this, str, 0), new mc2(this, str, 1)));
    }

    /* JADX INFO: renamed from: c */
    public final void m64108c(String str, String str2) {
        yg0 yg0Var = (yg0) this.f152399c.get();
        int i = AgeVerificationDialogActivity.f2739l1;
        yg0Var.mo35747a(f2h1.m40597l(this.f152398b, str, str2));
    }
}
