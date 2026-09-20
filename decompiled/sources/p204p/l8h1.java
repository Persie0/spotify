package p204p;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l8h1 extends axf1 implements u790 {

    /* JADX INFO: renamed from: M0 */
    public static final boolean f130868M0;

    /* JADX INFO: renamed from: N0 */
    public static final wvf1 f130869N0;

    /* JADX INFO: renamed from: X */
    public volatile c8h1 f130871X;

    /* JADX INFO: renamed from: Y */
    public volatile k8h1 f130872Y;

    /* JADX INFO: renamed from: t */
    public volatile Object f130873t;

    /* JADX INFO: renamed from: Z */
    public static final Object f130870Z = new Object();

    /* JADX INFO: renamed from: L0 */
    public static final zrf1 f130867L0 = new zrf1(2);

    static {
        boolean z;
        wvf1 f8h1Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f130868M0 = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                f8h1Var = new j8h1();
            } catch (Error | Exception e) {
                try {
                    f8h1Var = new e8h1();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    f8h1Var = new f8h1();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                f8h1Var = new e8h1();
            } catch (NoClassDefFoundError unused2) {
                f8h1Var = new f8h1();
            }
        }
        th = null;
        th2 = null;
        f130869N0 = f8h1Var;
        if (th != null) {
            zrf1 zrf1Var = f130867L0;
            Logger loggerM96765a = zrf1Var.m96765a();
            Level level = Level.SEVERE;
            loggerM96765a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zrf1Var.m96765a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m58473E(k8h1 k8h1Var) {
        k8h1Var.f120371a = null;
        while (true) {
            k8h1 k8h1Var2 = this.f130872Y;
            if (k8h1Var2 != k8h1.f120370c) {
                k8h1 k8h1Var3 = null;
                while (k8h1Var2 != null) {
                    k8h1 k8h1Var4 = k8h1Var2.f120372b;
                    if (k8h1Var2.f120371a != null) {
                        k8h1Var3 = k8h1Var2;
                    } else if (k8h1Var3 != null) {
                        k8h1Var3.f120372b = k8h1Var4;
                        if (k8h1Var3.f120371a == null) {
                        }
                    } else if (!f130869N0.mo38104K(this, k8h1Var2, k8h1Var4)) {
                    }
                    k8h1Var2 = k8h1Var4;
                }
                return;
            }
            return;
        }
    }
}
