package p204p;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lpf1 extends atf1 implements dsf1 {

    /* JADX INFO: renamed from: d */
    public static final Object f135755d = new Object();

    /* JADX INFO: renamed from: e */
    public static final zrf1 f135756e = new zrf1(wsf1.class);

    /* JADX INFO: renamed from: f */
    public static final boolean f135757f;

    /* JADX INFO: renamed from: g */
    public static final ufc1 f135758g;

    /* JADX INFO: renamed from: a */
    public volatile Object f135759a;

    /* JADX INFO: renamed from: b */
    public volatile yof1 f135760b;

    /* JADX INFO: renamed from: c */
    public volatile gpf1 f135761c;

    static {
        boolean z;
        ufc1 epf1Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f135757f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                epf1Var = new fpf1();
            } catch (Error | Exception e) {
                try {
                    epf1Var = new dpf1();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    epf1Var = new epf1();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                epf1Var = new dpf1();
            } catch (NoClassDefFoundError unused2) {
                epf1Var = new epf1();
            }
        }
        th = null;
        th2 = null;
        f135758g = epf1Var;
        if (th != null) {
            zrf1 zrf1Var = f135756e;
            Logger loggerM96765a = zrf1Var.m96765a();
            Level level = Level.SEVERE;
            loggerM96765a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zrf1Var.m96765a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m59669d(gpf1 gpf1Var) {
        gpf1Var.f83182a = null;
        while (true) {
            gpf1 gpf1Var2 = this.f135761c;
            if (gpf1Var2 != gpf1.f83181c) {
                gpf1 gpf1Var3 = null;
                while (gpf1Var2 != null) {
                    gpf1 gpf1Var4 = gpf1Var2.f83183b;
                    if (gpf1Var2.f83182a != null) {
                        gpf1Var3 = gpf1Var2;
                    } else if (gpf1Var3 != null) {
                        gpf1Var3.f83183b = gpf1Var4;
                        if (gpf1Var3.f83182a == null) {
                        }
                    } else if (!f135758g.mo36575D(this, gpf1Var2, gpf1Var4)) {
                    }
                    gpf1Var2 = gpf1Var4;
                }
                return;
            }
            return;
        }
    }
}
