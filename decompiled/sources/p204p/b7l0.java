package p204p;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b7l0 {

    /* JADX INFO: renamed from: a */
    public final Runnable f24308a;

    /* JADX INFO: renamed from: b */
    public final hj5 f24309b = new hj5();

    /* JADX INFO: renamed from: c */
    public w6l0 f24310c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f24311d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f24312e;

    /* JADX INFO: renamed from: f */
    public boolean f24313f;

    /* JADX INFO: renamed from: g */
    public boolean f24314g;

    public b7l0(Runnable runnable) {
        this.f24308a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f24311d = i >= 34 ? yjf1.m93897o(new gfx(this, 25), new f0l0(this, 7), new nzk0(this, 4), new jah(this, 1)) : AbstractC2254pf.m69760c(new jah(this, 2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m28385a(hc80 hc80Var, w6l0 w6l0Var) {
        gb80 lifecycle = hc80Var.getLifecycle();
        if (lifecycle.mo31987b() == fb80.f67750a) {
            return;
        }
        w6l0Var.f248421b.add(new z6l0(this, lifecycle, w6l0Var));
        m28390f();
        w6l0Var.f248422c = new rkk0(this, 24);
    }

    /* JADX INFO: renamed from: b */
    public final a7l0 m28386b(w6l0 w6l0Var) {
        this.f24309b.addLast(w6l0Var);
        a7l0 a7l0Var = new a7l0(this, w6l0Var);
        w6l0Var.f248421b.add(a7l0Var);
        m28390f();
        w6l0Var.f248422c = new rkk0(this, 25);
        return a7l0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m28387c() {
        Object objPrevious;
        w6l0 w6l0Var = this.f24310c;
        if (w6l0Var == null) {
            hj5 hj5Var = this.f24309b;
            ListIterator<E> listIterator = hj5Var.listIterator(hj5Var.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((w6l0) objPrevious).f248420a);
            w6l0Var = (w6l0) objPrevious;
        }
        this.f24310c = null;
        if (w6l0Var != null) {
            w6l0Var.mo42560a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m28388d() {
        Object objPrevious;
        w6l0 w6l0Var = this.f24310c;
        if (w6l0Var == null) {
            hj5 hj5Var = this.f24309b;
            ListIterator listIterator = hj5Var.listIterator(hj5Var.mo47661a());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((w6l0) objPrevious).f248420a);
            w6l0Var = (w6l0) objPrevious;
        }
        this.f24310c = null;
        if (w6l0Var != null) {
            w6l0Var.mo42561b();
            return;
        }
        Runnable runnable = this.f24308a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m28389e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f24312e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f24311d) == null) {
            return;
        }
        if (z && !this.f24313f) {
            AbstractC2254pf.m69750G(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f24313f = true;
        } else {
            if (z || !this.f24313f) {
                return;
            }
            AbstractC2254pf.m69757N(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f24313f = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m28390f() {
        boolean z = this.f24314g;
        boolean z2 = false;
        hj5 hj5Var = this.f24309b;
        if (hj5Var == null || !hj5Var.isEmpty()) {
            Iterator it = hj5Var.iterator();
            while (it.hasNext()) {
                if (((w6l0) it.next()).f248420a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f24314g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m28389e(z2);
    }
}
