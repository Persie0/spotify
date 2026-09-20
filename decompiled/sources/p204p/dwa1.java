package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dwa1 {

    /* JADX INFO: renamed from: a */
    public static final dwa1 f53653a = new dwa1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f53654b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f53655c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final cwa1 f53656d = new cwa1(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e */
    public static final cwa1 f53657e = new cwa1(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f */
    public static final cwa1 f53658f = new cwa1(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g */
    public static final cwa1 f53659g = new cwa1(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h */
    public static final cwa1 f53660h = new cwa1(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i */
    public static SharedPreferences f53661i;

    /* JADX INFO: renamed from: b */
    public static final boolean m37141b() {
        if (p2l.f173365a.contains(dwa1.class)) {
            return false;
        }
        try {
            f53653a.m37146e();
            return f53658f.m34117a();
        } catch (Throwable th) {
            p2l.m68953a(dwa1.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m37142c() {
        if (p2l.f173365a.contains(dwa1.class)) {
            return false;
        }
        try {
            dwa1 dwa1Var = f53653a;
            dwa1Var.m37146e();
            return dwa1Var.m37144a();
        } catch (Throwable th) {
            p2l.m68953a(dwa1.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Boolean m37143i() {
        String str = "";
        if (p2l.f173365a.contains(dwa1.class)) {
            return null;
        }
        try {
            f53653a.m37151k();
            try {
                SharedPreferences sharedPreferences = f53661i;
                if (sharedPreferences == null) {
                    wj50.m88260d0("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(f53657e.f42685b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
                return null;
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(dwa1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37144a() {
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return false;
        }
        try {
            HashMap mapM71024c = pty.m71024c();
            if (mapM71024c != null && !mapM71024c.isEmpty()) {
                Boolean bool = (Boolean) mapM71024c.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapM71024c.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean boolM37143i = m37143i();
                        if (boolM37143i != null || (boolM37143i = m37147f()) != null) {
                            bool3 = boolM37143i;
                        }
                    } catch (Throwable th) {
                        p2l.m68953a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f53657e.m34117a();
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m37145d() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            cwa1 cwa1Var = f53659g;
            m37150j(cwa1Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (cwa1Var.f42686c == null || jCurrentTimeMillis - cwa1Var.f42687d >= 604800000) {
                cwa1Var.f42686c = null;
                cwa1Var.f42687d = 0L;
                if (f53655c.compareAndSet(false, true)) {
                    p8y.m69345c().execute(new Runnable() { // from class: p.bwa1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lty ltyVarM71031k;
                            long j = jCurrentTimeMillis;
                            if (p2l.f173365a.contains(dwa1.class)) {
                                return;
                            }
                            try {
                                if (dwa1.f53658f.m34117a() && (ltyVarM71031k = pty.m71031k(p8y.m69344b(), false)) != null && ltyVarM71031k.f136911g) {
                                    nr6 nr6VarM43305j = g0g1.m43305j(p8y.m69343a());
                                    String strM65469a = (nr6VarM43305j == null || nr6VarM43305j.m65469a() == null) ? null : nr6VarM43305j.m65469a();
                                    if (strM65469a != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strM65469a);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = dx10.f53819j;
                                        dx10 dx10VarM48882r = hvi0.m48882r(null, "app", null);
                                        dx10VarM48882r.f53825d = bundle;
                                        JSONObject jSONObject = dx10VarM48882r.m37181c().f85146b;
                                        if (jSONObject != null) {
                                            cwa1 cwa1Var2 = dwa1.f53659g;
                                            cwa1Var2.f42686c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            cwa1Var2.f42687d = j;
                                            dwa1.f53653a.m37152l(cwa1Var2);
                                        }
                                    }
                                }
                                dwa1.f53655c.set(false);
                            } catch (Throwable th) {
                                p2l.m68953a(dwa1.class, th);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x008f, NameNotFoundException -> 0x0093, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0093, all -> 0x008f, blocks: (B:32:0x0070, B:34:0x0086), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m37146e() {
        Bundle bundle;
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (p8y.f175096q.get()) {
                if (f53654b.compareAndSet(false, true)) {
                    f53661i = p8y.m69343a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    cwa1[] cwa1VarArr = {f53657e, f53658f, f53656d};
                    if (!set.contains(this)) {
                        for (int i = 0; i < 3; i++) {
                            try {
                                cwa1 cwa1Var = cwa1VarArr[i];
                                if (cwa1Var == f53659g) {
                                    m37145d();
                                } else if (cwa1Var.f42686c == null) {
                                    m37150j(cwa1Var);
                                    if (cwa1Var.f42686c == null) {
                                        m37148g(cwa1Var);
                                    }
                                } else {
                                    m37152l(cwa1Var);
                                }
                            } catch (Throwable th) {
                                p2l.m68953a(this, th);
                                m37145d();
                                if (!p2l.f173365a.contains(this)) {
                                    try {
                                        Context contextM69343a = p8y.m69343a();
                                        bundle = contextM69343a.getPackageManager().getApplicationInfo(contextM69343a.getPackageName(), 128).metaData;
                                        if (bundle != null) {
                                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                            m37141b();
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    } catch (Throwable th2) {
                                        p2l.m68953a(this, th2);
                                    }
                                }
                                m37149h();
                            }
                        }
                    }
                    m37145d();
                    if (!p2l.f173365a.contains(this)) {
                        Context contextM69343a2 = p8y.m69343a();
                        bundle = contextM69343a2.getPackageManager().getApplicationInfo(contextM69343a2.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                            m37141b();
                        }
                    }
                    m37149h();
                }
            }
        } catch (Throwable th3) {
            p2l.m68953a(this, th3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m37147f() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            m37151k();
            try {
                Context contextM69343a = p8y.m69343a();
                ApplicationInfo applicationInfo = contextM69343a.getPackageManager().getApplicationInfo(contextM69343a.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    cwa1 cwa1Var = f53657e;
                    if (bundle.containsKey(cwa1Var.f42685b)) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(cwa1Var.f42685b));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p8y p8yVar = p8y.f175080a;
            }
            return null;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m37148g(cwa1 cwa1Var) {
        String str = cwa1Var.f42685b;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            m37151k();
            try {
                Context contextM69343a = p8y.m69343a();
                ApplicationInfo applicationInfo = contextM69343a.getPackageManager().getApplicationInfo(contextM69343a.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                cwa1Var.f42686c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, cwa1Var.f42684a));
            } catch (PackageManager.NameNotFoundException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m37149h() {
        int i;
        int i2;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (f53654b.get() && p8y.f175096q.get()) {
                Context contextM69343a = p8y.m69343a();
                int i3 = (f53656d.m34117a() ? 1 : 0) | ((f53657e.m34117a() ? 1 : 0) << 1) | ((f53658f.m34117a() ? 1 : 0) << 2) | ((f53660h.m34117a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f53661i;
                if (sharedPreferences == null) {
                    wj50.m88260d0("userSettingPref");
                    throw null;
                }
                int i4 = 0;
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i3) {
                    SharedPreferences sharedPreferences2 = f53661i;
                    if (sharedPreferences2 == null) {
                        wj50.m88260d0("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM69343a.getPackageManager().getApplicationInfo(contextM69343a.getPackageName(), 128);
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i2 = 0;
                            i = 0;
                            while (i4 < 4) {
                                try {
                                    i |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) ? 1 : 0) << i4;
                                    i4++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i4 = i2;
                                    i2 = i4;
                                    i4 = i;
                                    csy csyVar = new csy(contextM69343a);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i4);
                                    bundle.putInt("initial", i2);
                                    bundle.putInt("previous", i5);
                                    bundle.putInt("current", i3);
                                    csyVar.m33790G(bundle);
                                }
                            }
                            i4 = i;
                        } else {
                            i2 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                    csy csyVar2 = new csy(contextM69343a);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i4);
                    bundle2.putInt("initial", i2);
                    bundle2.putInt("previous", i5);
                    bundle2.putInt("current", i3);
                    csyVar2.m33790G(bundle2);
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m37150j(cwa1 cwa1Var) {
        String str = "";
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            m37151k();
            try {
                SharedPreferences sharedPreferences = f53661i;
                if (sharedPreferences == null) {
                    wj50.m88260d0("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(cwa1Var.f42685b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    cwa1Var.f42686c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    cwa1Var.f42687d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m37151k() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (f53654b.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m37152l(cwa1 cwa1Var) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            m37151k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", cwa1Var.f42686c);
                jSONObject.put("last_timestamp", cwa1Var.f42687d);
                SharedPreferences sharedPreferences = f53661i;
                if (sharedPreferences == null) {
                    wj50.m88260d0("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(cwa1Var.f42685b, jSONObject.toString()).apply();
                m37149h();
            } catch (Exception unused) {
                p8y p8yVar = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
