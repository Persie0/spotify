package p204p;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zgb implements nu61 {

    /* JADX INFO: renamed from: a */
    public final jvl0 f282574a;

    /* JADX INFO: renamed from: b */
    public static final sy7 f282565b = new sy7("camerax.core.appConfig.cameraFactoryProvider", pdb.class, null);

    /* JADX INFO: renamed from: c */
    public static final sy7 f282566c = new sy7("camerax.core.appConfig.deviceSurfaceManagerProvider", qdb.class, null);

    /* JADX INFO: renamed from: d */
    public static final sy7 f282567d = new sy7("camerax.core.appConfig.useCaseConfigFactoryProvider", rdb.class, null);

    /* JADX INFO: renamed from: e */
    public static final sy7 f282568e = new sy7("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: f */
    public static final sy7 f282569f = new sy7("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: g */
    public static final sy7 f282570g = new sy7("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: h */
    public static final sy7 f282571h = new sy7("camerax.core.appConfig.availableCamerasLimiter", pgb.class, null);

    /* JADX INFO: renamed from: i */
    public static final sy7 f282572i = new sy7("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* JADX INFO: renamed from: t */
    public static final sy7 f282573t = new sy7("camerax.core.appConfig.cameraProviderInitRetryPolicy", scx0.class, null);

    /* JADX INFO: renamed from: X */
    public static final sy7 f282564X = new sy7("camerax.core.appConfig.quirksSettings", owt0.class, null);

    public zgb(jvl0 jvl0Var) {
        this.f282574a = jvl0Var;
    }

    /* JADX INFO: renamed from: e */
    public final pgb m96053e() {
        Object objMo39828c;
        try {
            objMo39828c = this.f282574a.mo39828c(f282571h);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        return (pgb) objMo39828c;
    }

    /* JADX INFO: renamed from: j */
    public final pdb m96054j() {
        Object objMo39828c;
        try {
            objMo39828c = this.f282574a.mo39828c(f282565b);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        return (pdb) objMo39828c;
    }

    @Override // p204p.eru0
    /* JADX INFO: renamed from: k */
    public final phi mo39834k() {
        return this.f282574a;
    }

    /* JADX INFO: renamed from: t */
    public final long m96055t() {
        sy7 sy7Var = f282572i;
        Object objMo39828c = -1L;
        jvl0 jvl0Var = this.f282574a;
        jvl0Var.getClass();
        try {
            objMo39828c = jvl0Var.mo39828c(sy7Var);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objMo39828c).longValue();
    }

    /* JADX INFO: renamed from: u */
    public final qdb m96056u() {
        Object objMo39828c;
        try {
            objMo39828c = this.f282574a.mo39828c(f282566c);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        return (qdb) objMo39828c;
    }

    /* JADX INFO: renamed from: v */
    public final rdb m96057v() {
        Object objMo39828c;
        try {
            objMo39828c = this.f282574a.mo39828c(f282567d);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        return (rdb) objMo39828c;
    }
}
