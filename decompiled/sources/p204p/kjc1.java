package p204p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class kjc1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d */
    public static final HashMap f123305d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final WeakReference f123306a;

    /* JADX INFO: renamed from: b */
    public final Handler f123307b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f123308c = new AtomicBoolean(false);

    public kjc1(Activity activity) {
        this.f123306a = new WeakReference(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m56562a() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            rsz0 rsz0Var = new rsz0(this, 16);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                rsz0Var.run();
            } else {
                this.f123307b.post(rsz0Var);
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            m56562a();
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
