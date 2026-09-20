package p204p;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yvf implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a */
    public final long f276655a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b */
    public Runnable f276656b;

    /* JADX INFO: renamed from: c */
    public boolean f276657c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cwf f276658d;

    public yvf(cwf cwfVar) {
        this.f276658d = cwfVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m94694a(View view) {
        if (this.f276657c) {
            return;
        }
        this.f276657c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f276656b = runnable;
        View decorView = this.f276658d.getWindow().getDecorView();
        if (!this.f276657c) {
            decorView.postOnAnimation(new RunnableC2210od(this, 24));
        } else if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f276656b;
        cwf cwfVar = this.f276658d;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f276655a) {
                this.f276657c = false;
                cwfVar.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f276656b = null;
        if (((dh00) cwfVar.f42743g.getValue()).m35956b()) {
            this.f276657c = false;
            cwfVar.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f276658d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
