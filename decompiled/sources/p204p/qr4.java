package p204p;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr4 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f191729a = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static void m73593a(Application application) {
        if (f191729a.getAndSet(true)) {
            return;
        }
        jb6 jb6Var = new jb6(application);
        if (oze1.f172258a.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!t3d1.m80001p(oze1.f172259b, jb6Var)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }
}
