package p204p;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pty {

    /* JADX INFO: renamed from: a */
    public static final pty f181269a = new pty();

    /* JADX INFO: renamed from: b */
    public static final List f181270b = h6f.m46715L("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", dq60.m36617q(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f181271c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f181272d = new AtomicReference(oty.f170113a);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentLinkedQueue f181273e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f */
    public static volatile boolean f181274f;

    /* JADX INFO: renamed from: a */
    public static JSONObject m71022a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f181270b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = dx10.f53819j;
        dx10 dx10VarM48882r = hvi0.m48882r(null, "app", null);
        dx10VarM48882r.f53830i = true;
        dx10VarM48882r.f53825d = bundle;
        JSONObject jSONObject = dx10VarM48882r.m37181c().f85148d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static final lty m71023b(String str) {
        return (lty) f181271c.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static final HashMap m71024c() {
        JSONObject jSONObject;
        String string = p8y.m69343a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{p8y.m69344b()}, 1)), null);
        if (!n0b1.m63385y(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
                jSONObject = null;
            }
            if (jSONObject != null) {
                return m71029h(jSONObject);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m71025d() {
        oty otyVar;
        oty otyVar2;
        final Context contextM69343a = p8y.m69343a();
        final String strM69344b = p8y.m69344b();
        boolean zM63385y = n0b1.m63385y(strM69344b);
        oty otyVar3 = oty.f170116d;
        pty ptyVar = f181269a;
        AtomicReference atomicReference = f181272d;
        if (zM63385y) {
            atomicReference.set(otyVar3);
            ptyVar.m71032j();
            return;
        }
        if (f181271c.containsKey(strM69344b)) {
            atomicReference.set(oty.f170115c);
            ptyVar.m71032j();
            return;
        }
        do {
            otyVar = oty.f170113a;
            otyVar2 = oty.f170114b;
            if (atomicReference.compareAndSet(otyVar, otyVar2)) {
            }
            final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM69344b}, 1));
            p8y.m69345c().execute(new Runnable() { // from class: p.mty
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject;
                    Context context = contextM69343a;
                    String str2 = str;
                    String str3 = strM69344b;
                    pty ptyVar2 = pty.f181269a;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    lty ltyVarM71026e = null;
                    String string = sharedPreferences.getString(str2, null);
                    if (!n0b1.m63385y(string)) {
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            p8y p8yVar = p8y.f175080a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            ltyVarM71026e = pty.m71026e(str3, jSONObject);
                        }
                    }
                    JSONObject jSONObjectM71022a = pty.m71022a();
                    pty.m71026e(str3, jSONObjectM71022a);
                    sharedPreferences.edit().putString(str2, jSONObjectM71022a.toString()).apply();
                    if (ltyVarM71026e != null) {
                        String str4 = ltyVarM71026e.f136913i;
                        if (!pty.f181274f && str4.length() > 0) {
                            pty.f181274f = true;
                        }
                    }
                    jty jtyVar = jty.f115983a;
                    JSONObject jSONObjectM54318a = jty.m54318a();
                    p8y.m69343a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str3}, 1)), jSONObjectM54318a.toString()).apply();
                    jty.m54321e(str3, jSONObjectM54318a);
                    csy csyVar = m68.f140420a;
                    Context contextM69343a2 = p8y.m69343a();
                    String strM69344b2 = p8y.m69344b();
                    if (dwa1.m37142c() && (contextM69343a2 instanceof Application)) {
                        phf1.m69986e((Application) contextM69343a2, strM69344b2);
                    }
                    pty.f181272d.set(pty.f181271c.containsKey(str3) ? oty.f170115c : oty.f170116d);
                    ptyVar2.m71032j();
                }
            });
        } while (atomicReference.get() == otyVar);
        while (!atomicReference.compareAndSet(otyVar3, otyVar2)) {
            if (atomicReference.get() != otyVar3) {
                ptyVar.m71032j();
                return;
            }
        }
        final String str2 = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM69344b}, 1));
        p8y.m69345c().execute(new Runnable() { // from class: p.mty
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                Context context = contextM69343a;
                String str3 = str2;
                String str4 = strM69344b;
                pty ptyVar2 = pty.f181269a;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                lty ltyVarM71026e = null;
                String string = sharedPreferences.getString(str3, null);
                if (!n0b1.m63385y(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        p8y p8yVar = p8y.f175080a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        ltyVarM71026e = pty.m71026e(str4, jSONObject);
                    }
                }
                JSONObject jSONObjectM71022a = pty.m71022a();
                pty.m71026e(str4, jSONObjectM71022a);
                sharedPreferences.edit().putString(str3, jSONObjectM71022a.toString()).apply();
                if (ltyVarM71026e != null) {
                    String str5 = ltyVarM71026e.f136913i;
                    if (!pty.f181274f && str5.length() > 0) {
                        pty.f181274f = true;
                    }
                }
                jty jtyVar = jty.f115983a;
                JSONObject jSONObjectM54318a = jty.m54318a();
                p8y.m69343a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectM54318a.toString()).apply();
                jty.m54321e(str4, jSONObjectM54318a);
                csy csyVar = m68.f140420a;
                Context contextM69343a2 = p8y.m69343a();
                String strM69344b2 = p8y.m69344b();
                if (dwa1.m37142c() && (contextM69343a2 instanceof Application)) {
                    phf1.m69986e((Application) contextM69343a2, strM69344b2);
                }
                pty.f181272d.set(pty.f181271c.containsKey(str4) ? oty.f170115c : oty.f170116d);
                ptyVar2.m71032j();
            }
        });
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: e */
    public static p204p.lty m71026e(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX INFO: renamed from: f */
    public static ArrayList m71027f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (wj50.m88271j(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (wj50.m88271j(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m71028g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("key");
            if ((!wj50.m88271j(string, "prod_keys") || !z) && (!wj50.m88271j(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString("key");
                    if (!wj50.m88271j(string2, "_valueToSum") && !wj50.m88271j(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new pqm0(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m71029h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                p8y p8yVar2 = p8y.f175080a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m71030i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final lty m71031k(String str, boolean z) {
        if (!z) {
            ConcurrentHashMap concurrentHashMap = f181271c;
            if (concurrentHashMap.containsKey(str)) {
                return (lty) concurrentHashMap.get(str);
            }
        }
        lty ltyVarM71026e = m71026e(str, m71022a());
        if (str.equals(p8y.m69344b())) {
            f181272d.set(oty.f170115c);
            f181269a.m71032j();
        }
        return ltyVarM71026e;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m71032j() {
        oty otyVar = (oty) f181272d.get();
        if (oty.f170113a != otyVar && oty.f170114b != otyVar) {
            lty ltyVar = (lty) f181271c.get(p8y.m69344b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (oty.f170116d == otyVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f181273e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new nty((r95) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f181273e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new nty((r95) concurrentLinkedQueue2.poll(), ltyVar));
                    }
                }
            }
        }
    }
}
