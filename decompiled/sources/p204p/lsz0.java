package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lsz0 {

    /* JADX INFO: renamed from: b */
    public static boolean f136637b;

    /* JADX INFO: renamed from: a */
    public static final lsz0 f136636a = new lsz0();

    /* JADX INFO: renamed from: c */
    public static HashSet f136638c = new HashSet();

    /* JADX INFO: renamed from: d */
    public static HashMap f136639d = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final void m59850b(String str, Bundle bundle) {
        if (p2l.f173365a.contains(lsz0.class)) {
            return;
        }
        try {
            if (f136637b && bundle != null) {
                if (!f136638c.isEmpty() || f136639d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f136639d.get(str);
                        for (String str2 : new ArrayList(bundle.keySet())) {
                            lsz0 lsz0Var = f136636a;
                            if (!p2l.f173365a.contains(lsz0Var)) {
                                try {
                                    if (f136638c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th) {
                                    p2l.m68953a(lsz0Var, th);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            p2l.m68953a(lsz0.class, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m59851a() {
        HashSet hashSetM63365e;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            lty ltyVarM71031k = pty.m71031k(p8y.m69344b(), false);
            if (ltyVarM71031k == null) {
                return;
            }
            try {
                f136638c = new HashSet();
                f136639d = new HashMap();
                JSONArray jSONArray = ltyVarM71031k.f136921q;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (jSONArray2 != null && (hashSetM63365e = n0b1.m63365e(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                f136638c = hashSetM63365e;
                            } else {
                                f136639d.put(string, hashSetM63365e);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
