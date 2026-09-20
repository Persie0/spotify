package p204p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s0g1 {

    /* JADX INFO: renamed from: h */
    public static volatile s0g1 f204382h;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f204383a;

    /* JADX INFO: renamed from: b */
    public final AppMeasurementSdk f204384b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f204385c;

    /* JADX INFO: renamed from: d */
    public int f204386d;

    /* JADX INFO: renamed from: e */
    public boolean f204387e;

    /* JADX INFO: renamed from: f */
    public volatile rpf1 f204388f;

    /* JADX INFO: renamed from: g */
    public volatile long f204389g;

    public s0g1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new efb(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f204383a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f204384b = new AppMeasurementSdk(this);
        this.f204385c = new ArrayList();
        try {
            if (elf1.m39387z(context, ckf1.m33150A(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, s0g1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f204387e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        m76869a(new ouf1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new n0g1(this));
    }

    /* JADX INFO: renamed from: c */
    public static s0g1 m76868c(Context context, Bundle bundle) {
        ig31.m50506x(context);
        if (f204382h == null) {
            synchronized (s0g1.class) {
                try {
                    if (f204382h == null) {
                        f204382h = new s0g1(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f204382h;
    }

    /* JADX INFO: renamed from: a */
    public final void m76869a(zyf1 zyf1Var) {
        this.f204383a.execute(zyf1Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m76870b(Exception exc, boolean z, boolean z2) {
        this.f204387e |= z;
        if (!z && z2) {
            m76869a(new ptf1(this, exc));
        }
    }

    /* JADX INFO: renamed from: d */
    public final rpf1 m76871d(Context context, boolean z) {
        try {
            IBinder iBinderM26620b = aos.m26614c(context, z ? aos.f17749d : aos.f17748c, "com.google.android.gms.measurement.dynamite").m26620b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
            int i = ppf1.f180037l;
            if (iBinderM26620b == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM26620b.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
            return iInterfaceQueryLocalInterface instanceof rpf1 ? (rpf1) iInterfaceQueryLocalInterface : new ipf1(iBinderM26620b);
        } catch (DynamiteModule$LoadingException e) {
            m76870b(e, true, false);
            return null;
        }
    }
}
