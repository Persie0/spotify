package p204p;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class p8y {

    /* JADX INFO: renamed from: a */
    public static final p8y f175080a = new p8y();

    /* JADX INFO: renamed from: b */
    public static final HashSet f175081b = s601.m77303f0(hsa0.f94649d);

    /* JADX INFO: renamed from: c */
    public static Executor f175082c;

    /* JADX INFO: renamed from: d */
    public static volatile String f175083d;

    /* JADX INFO: renamed from: e */
    public static volatile String f175084e;

    /* JADX INFO: renamed from: f */
    public static String f175085f;

    /* JADX INFO: renamed from: g */
    public static String f175086g;

    /* JADX INFO: renamed from: h */
    public static volatile String f175087h;

    /* JADX INFO: renamed from: i */
    public static volatile Boolean f175088i;

    /* JADX INFO: renamed from: j */
    public static Context f175089j;

    /* JADX INFO: renamed from: k */
    public static int f175090k;

    /* JADX INFO: renamed from: l */
    public static final ReentrantLock f175091l;

    /* JADX INFO: renamed from: m */
    public static final String f175092m;

    /* JADX INFO: renamed from: n */
    public static boolean f175093n;

    /* JADX INFO: renamed from: o */
    public static boolean f175094o;

    /* JADX INFO: renamed from: p */
    public static boolean f175095p;

    /* JADX INFO: renamed from: q */
    public static final AtomicBoolean f175096q;

    /* JADX INFO: renamed from: r */
    public static volatile String f175097r;

    /* JADX INFO: renamed from: s */
    public static volatile String f175098s;

    /* JADX INFO: renamed from: t */
    public static final zfs f175099t;

    /* JADX INFO: renamed from: u */
    public static boolean f175100u;

    static {
        new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f175090k = 64206;
        f175091l = new ReentrantLock();
        f175092m = "v16.0";
        f175096q = new AtomicBoolean(false);
        f175097r = "instagram.com";
        f175098s = "facebook.com";
        f175099t = new zfs(8);
    }

    /* JADX INFO: renamed from: a */
    public static final Context m69343a() {
        zn91.m96564m0();
        Context context = f175089j;
        if (context != null) {
            return context;
        }
        wj50.m88260d0("applicationContext");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m69344b() {
        zn91.m96564m0();
        String str = f175083d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* JADX INFO: renamed from: c */
    public static final Executor m69345c() {
        ReentrantLock reentrantLock = f175091l;
        reentrantLock.lock();
        try {
            if (f175082c == null) {
                f175082c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f175082c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m69346d() {
        String str = f175092m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static final String m69347e() {
        Date date = C1893gd.f78679Y;
        C1893gd c1893gdM67200x = okg1.m67200x();
        String str = c1893gdM67200x != null ? c1893gdM67200x.f78681X : null;
        String str2 = f175098s;
        if (str != null) {
            if (str.equals("gaming")) {
                return bm51.m29801l0(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return bm51.m29801l0(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: f */
    public static final synchronized boolean m69348f() {
        return f175100u;
    }

    /* JADX INFO: renamed from: g */
    public static final void m69349g() {
        synchronized (f175081b) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m69350h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f175083d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (bm51.m29803n0(str.toLowerCase(Locale.ROOT), "fb", false)) {
                        f175083d = str.substring(2);
                    } else {
                        f175083d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f175085f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            f175086g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f175084e == null) {
                f175084e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f175087h == null) {
                f175087h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f175090k == 64206) {
                f175090k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f175088i == null) {
                f175088i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009a A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0130 A[Catch: all -> 0x0011, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0136 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x001f, B:17:0x0026, B:18:0x0029, B:20:0x003c, B:22:0x0043, B:24:0x0049, B:26:0x004d, B:28:0x0053, B:37:0x0078, B:38:0x007a, B:40:0x007e, B:42:0x0082, B:44:0x0088, B:46:0x008c, B:50:0x009d, B:52:0x00a5, B:54:0x00a9, B:60:0x00be, B:61:0x00c2, B:62:0x00c7, B:63:0x00c8, B:65:0x00d4, B:68:0x0130, B:69:0x0135, B:47:0x0094, B:48:0x0099, B:49:0x009a, B:70:0x0136, B:71:0x013b, B:35:0x0073, B:72:0x013c, B:73:0x0143, B:74:0x0144, B:75:0x014b, B:76:0x014c, B:77:0x0151, B:32:0x0066, B:57:0x00b4), top: B:81:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final synchronized void m69351i(Context context, xst xstVar) {
        Context context2;
        cc5 cc5VarM28682i;
        Context context3;
        Context context4;
        Application application;
        if (f175096q.get()) {
            if (xstVar != null) {
                xstVar.m91991w();
            }
            return;
        }
        int i = 1;
        try {
            int i2 = FacebookActivity.f1656Y0;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException unused) {
        }
        context.checkCallingOrSelfPermission("android.permission.INTERNET");
        f175089j = context.getApplicationContext();
        phf1.m69992k(context);
        Context context5 = f175089j;
        if (context5 == null) {
            wj50.m88260d0("applicationContext");
            throw null;
        }
        m69350h(context5);
        String str = f175083d;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f175087h;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        f175096q.set(true);
        dwa1 dwa1Var = dwa1.f53653a;
        boolean zM34117a = false;
        if (!p2l.f173365a.contains(dwa1.class)) {
            try {
                dwa1.f53653a.m37146e();
                zM34117a = dwa1.f53656d.m34117a();
            } catch (Throwable th) {
                p2l.m68953a(dwa1.class, th);
            }
            if (zM34117a) {
                f175100u = true;
            }
            context2 = f175089j;
            if (context2 != null) {
                wj50.m88260d0("applicationContext");
                throw null;
            }
            if (context2 instanceof Application) {
                gk40.m45032h();
            } else {
                gk40.m45032h();
            }
            cc5VarM28682i = cc5.f36311b.m28682i();
            if (cc5VarM28682i != null) {
                context4 = f175089j;
                if (context4 != null) {
                    wj50.m88260d0("applicationContext");
                    throw null;
                }
                application = (Application) context4;
                if (!p2l.f173365a.contains(cc5VarM28682i)) {
                    application.registerActivityLifecycleCallbacks(new h401(i));
                }
            }
            pty.m71025d();
            axi0.m27420k();
            o4a o4aVar = o4a.f161598c;
            context3 = f175089j;
            if (context3 != null) {
                wj50.m88260d0("applicationContext");
                throw null;
            }
            hvg1.m48857j(context3);
            new a470(new m8y());
            hgy.m47480a(new zfs(9), fgy.Instrument);
            hgy.m47480a(new zfs(10), fgy.AppEvents);
            hgy.m47480a(new zfs(11), fgy.ChromeCustomTabsPrefetching);
            hgy.m47480a(new zfs(12), fgy.IgnoreAppSwitchToLoggedOut);
            hgy.m47480a(new zfs(13), fgy.BypassAppSwitch);
            m69345c().execute(new FutureTask(new ejp(xstVar, i)));
            return;
        }
        if (zM34117a) {
            f175100u = true;
        }
        context2 = f175089j;
        if (context2 != null) {
            wj50.m88260d0("applicationContext");
            throw null;
        }
        if ((context2 instanceof Application) || !dwa1.m37142c()) {
            gk40.m45032h();
        } else {
            Context context6 = f175089j;
            if (context6 == null) {
                wj50.m88260d0("applicationContext");
                throw null;
            }
            mf0.m61602d((Application) context6, f175083d);
        }
        cc5VarM28682i = cc5.f36311b.m28682i();
        if (cc5VarM28682i != null) {
            context4 = f175089j;
            if (context4 != null) {
                wj50.m88260d0("applicationContext");
                throw null;
            }
            application = (Application) context4;
            if (!p2l.f173365a.contains(cc5VarM28682i)) {
                try {
                    application.registerActivityLifecycleCallbacks(new h401(i));
                } catch (Throwable th2) {
                    p2l.m68953a(cc5VarM28682i, th2);
                }
            }
        }
        pty.m71025d();
        axi0.m27420k();
        o4a o4aVar2 = o4a.f161598c;
        context3 = f175089j;
        if (context3 != null) {
            wj50.m88260d0("applicationContext");
            throw null;
        }
        hvg1.m48857j(context3);
        new a470(new m8y());
        hgy.m47480a(new zfs(9), fgy.Instrument);
        hgy.m47480a(new zfs(10), fgy.AppEvents);
        hgy.m47480a(new zfs(11), fgy.ChromeCustomTabsPrefetching);
        hgy.m47480a(new zfs(12), fgy.IgnoreAppSwitchToLoggedOut);
        hgy.m47480a(new zfs(13), fgy.BypassAppSwitch);
        m69345c().execute(new FutureTask(new ejp(xstVar, i)));
        return;
        throw th;
    }
}
