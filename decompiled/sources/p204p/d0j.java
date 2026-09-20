package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d0j {

    /* JADX INFO: renamed from: b */
    public static final Object f43902b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile d0j f43903c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f43904a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static d0j m34539a() {
        if (f43903c == null) {
            synchronized (f43902b) {
                try {
                    if (f43903c == null) {
                        f43903c = new d0j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d0j d0jVar = f43903c;
        ig31.m50506x(d0jVar);
        return d0jVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m34540b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof bsg1)) {
            ConcurrentHashMap concurrentHashMap = this.f43904a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m34541c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((ffe1.m41527a(context).f247445a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof bsg1) {
            if (executor == null) {
                executor = null;
            }
            return (!u1h1.m82226u() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f43904a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (!u1h1.m82226u() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
