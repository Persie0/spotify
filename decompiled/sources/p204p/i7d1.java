package p204p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class i7d1 {

    /* JADX INFO: renamed from: n */
    public static final long f99494n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o */
    public static volatile ScheduledExecutorService f99495o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f99496p = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f99497a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f99498b;

    /* JADX INFO: renamed from: c */
    public int f99499c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f99500d;

    /* JADX INFO: renamed from: e */
    public long f99501e;

    /* JADX INFO: renamed from: f */
    public final HashSet f99502f;

    /* JADX INFO: renamed from: g */
    public boolean f99503g;

    /* JADX INFO: renamed from: h */
    public pif1 f99504h;

    /* JADX INFO: renamed from: i */
    public final e8f f99505i;

    /* JADX INFO: renamed from: j */
    public final String f99506j;

    /* JADX INFO: renamed from: k */
    public final HashMap f99507k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f99508l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f99509m;

    public i7d1(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f99497a = new Object();
        this.f99499c = 0;
        this.f99502f = new HashSet();
        this.f99503g = true;
        this.f99505i = e8f.f57164S0;
        this.f99507k = new HashMap();
        this.f99508l = new AtomicInteger(0);
        ig31.m50503u("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f99504h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f99506j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f99506j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f99498b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f1e1.f64882a;
        synchronized (f1e1.class) {
            Boolean bool = f1e1.f64884c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = lzj.m60353c(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                f1e1.f64884c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = vl51.f242385a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = ffe1.m41527a(context).f247445a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = f1e1.f64883b;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = f1e1.f64882a;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f99498b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f99495o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f99496p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f99495o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f99495o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f99509m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49861d(i7d1 i7d1Var) {
        synchronized (i7d1Var.f99497a) {
            try {
                if (i7d1Var.m49863b()) {
                    String.valueOf(i7d1Var.f99506j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    i7d1Var.m49865e();
                    if (i7d1Var.m49863b()) {
                        i7d1Var.f99499c = 1;
                        i7d1Var.m49866f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m49862a(long j) {
        this.f99508l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f99494n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f99497a) {
            try {
                if (!m49863b()) {
                    this.f99504h = pif1.f177935a;
                    this.f99498b.acquire();
                    this.f99505i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f99499c++;
                if (this.f99503g) {
                    TextUtils.isEmpty(null);
                }
                rmf1 rmf1Var = (rmf1) this.f99507k.get(null);
                if (rmf1Var == null) {
                    rmf1Var = new rmf1();
                    this.f99507k.put(null, rmf1Var);
                }
                rmf1Var.f200531a++;
                this.f99505i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.f99501e) {
                    this.f99501e = j2;
                    ScheduledFuture scheduledFuture = this.f99500d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f99500d = this.f99509m.schedule(new zu3(this, 23), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49863b() {
        boolean z;
        synchronized (this.f99497a) {
            z = this.f99499c > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m49864c() {
        if (this.f99508l.decrementAndGet() < 0) {
            String.valueOf(this.f99506j).concat(" release without a matched acquire!");
        }
        synchronized (this.f99497a) {
            try {
                if (this.f99503g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f99507k.containsKey(null)) {
                    rmf1 rmf1Var = (rmf1) this.f99507k.get(null);
                    if (rmf1Var != null) {
                        int i = rmf1Var.f200531a - 1;
                        rmf1Var.f200531a = i;
                        if (i == 0) {
                            this.f99507k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f99506j).concat(" counter does not exist");
                }
                m49866f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m49865e() {
        HashSet hashSet = this.f99502f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: f */
    public final void m49866f() {
        synchronized (this.f99497a) {
            try {
                if (m49863b()) {
                    if (this.f99503g) {
                        int i = this.f99499c - 1;
                        this.f99499c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f99499c = 0;
                    }
                    m49865e();
                    Iterator it = this.f99507k.values().iterator();
                    while (it.hasNext()) {
                        ((rmf1) it.next()).f200531a = 0;
                    }
                    this.f99507k.clear();
                    ScheduledFuture scheduledFuture = this.f99500d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f99500d = null;
                        this.f99501e = 0L;
                    }
                    if (this.f99498b.isHeld()) {
                        try {
                            try {
                                this.f99498b.release();
                                if (this.f99504h != null) {
                                    this.f99504h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.f99506j).concat(" failed to release!");
                                if (this.f99504h != null) {
                                    this.f99504h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f99504h != null) {
                                this.f99504h = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.f99506j).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
