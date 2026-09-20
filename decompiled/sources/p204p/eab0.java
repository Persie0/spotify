package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class eab0 {

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f57613e = Executors.newCachedThreadPool(new fab0());

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f57614a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f57615b;

    /* JADX INFO: renamed from: c */
    public final Handler f57616c;

    /* JADX INFO: renamed from: d */
    public volatile cab0 f57617d;

    public eab0(Callable callable) {
        this(callable, false);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m38280a(x9b0 x9b0Var) {
        Throwable th;
        try {
            cab0 cab0Var = this.f57617d;
            if (cab0Var != null && (th = cab0Var.f35792b) != null) {
                x9b0Var.onResult(th);
            }
            this.f57615b.add(x9b0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m38281b(x9b0 x9b0Var) {
        u8b0 u8b0Var;
        try {
            cab0 cab0Var = this.f57617d;
            if (cab0Var != null && (u8b0Var = cab0Var.f35791a) != null) {
                x9b0Var.onResult(u8b0Var);
            }
            this.f57614a.add(x9b0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m38282c() {
        cab0 cab0Var = this.f57617d;
        if (cab0Var == null) {
            return;
        }
        u8b0 u8b0Var = cab0Var.f35791a;
        if (u8b0Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f57614a).iterator();
                while (it.hasNext()) {
                    ((x9b0) it.next()).onResult(u8b0Var);
                }
            }
            return;
        }
        Throwable th = cab0Var.f35792b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f57615b);
            if (arrayList.isEmpty()) {
                sra0.m79110d("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((x9b0) it2.next()).onResult(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38283d(cab0 cab0Var) {
        if (this.f57617d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f57617d = cab0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m38282c();
        } else {
            this.f57616c.post(new ig10(this, 14));
        }
    }

    public eab0(u8b0 u8b0Var) {
        this.f57614a = new LinkedHashSet(1);
        this.f57615b = new LinkedHashSet(1);
        this.f57616c = new Handler(Looper.getMainLooper());
        this.f57617d = null;
        m38283d(new cab0(u8b0Var));
    }

    public eab0(Callable callable, boolean z) {
        this.f57614a = new LinkedHashSet(1);
        this.f57615b = new LinkedHashSet(1);
        this.f57616c = new Handler(Looper.getMainLooper());
        this.f57617d = null;
        if (z) {
            try {
                m38283d((cab0) callable.call());
                return;
            } catch (Throwable th) {
                m38283d(new cab0(th));
                return;
            }
        }
        ExecutorService executorService = f57613e;
        dab0 dab0Var = new dab0(callable);
        dab0Var.f47014b = this;
        executorService.execute(dab0Var);
    }
}
