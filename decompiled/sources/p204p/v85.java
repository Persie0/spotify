package p204p;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v85 implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final HashSet f238381f = new HashSet();

    /* JADX INFO: renamed from: a */
    public final JSONObject f238382a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f238383b;

    /* JADX INFO: renamed from: c */
    public final boolean f238384c;

    /* JADX INFO: renamed from: d */
    public final boolean f238385d;

    /* JADX INFO: renamed from: e */
    public final String f238386e;

    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[PHI: r11
      0x00b1: PHI (r11v30 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v29 java.lang.String) binds: [B:37:0x00af, B:57:0x00f2, B:54:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    public v85(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, drl0 drl0Var) throws JSONException {
        JSONObject jSONObject;
        String str3;
        this.f238384c = z;
        this.f238385d = z2;
        this.f238386e = str2;
        String str4 = null;
        if (drl0Var != null) {
            try {
                LinkedHashMap linkedHashMap = drl0Var.f52356a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    ((erl0) ((Map.Entry) obj).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj).getValue());
                }
                jSONObject = new JSONObject(kkc0.m56706s0(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f238383b = jSONObject;
        mhf1.m61778z(str2);
        JSONObject jSONObject2 = new JSONObject();
        l5x0 l5x0Var = l5x0.f130106a;
        Set set = p2l.f173365a;
        if (set.contains(l5x0.class)) {
            str3 = null;
        } else {
            try {
                if (l5x0.f130107b) {
                    l5x0 l5x0Var2 = l5x0.f130106a;
                    boolean zContains = false;
                    if (!set.contains(l5x0Var2)) {
                        try {
                            zContains = l5x0.f130109d.contains(str2);
                        } catch (Throwable th) {
                            p2l.m68953a(l5x0Var2, th);
                        }
                    }
                    if (zContains) {
                        str3 = "_removed_";
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                }
            } catch (Throwable th2) {
                p2l.m68953a(l5x0.class, th2);
                str3 = null;
            }
        }
        if (wj50.m88271j(str3, str2)) {
            pkv0 pkv0Var = pkv0.f178585a;
            Set set2 = p2l.f173365a;
            if (set2.contains(pkv0.class)) {
                str2 = str4;
            } else {
                try {
                    if (pkv0.f178586b) {
                        pkv0 pkv0Var2 = pkv0.f178585a;
                        if (!set2.contains(pkv0Var2)) {
                            try {
                                for (String str5 : pkv0.f178587c.keySet()) {
                                    HashSet hashSet = (HashSet) pkv0.f178587c.get(str5);
                                    if (hashSet != null && hashSet.contains(str2)) {
                                        str4 = str5;
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                p2l.m68953a(pkv0Var2, th3);
                            }
                        }
                        if (str4 != null) {
                            str2 = str4;
                        }
                    }
                } catch (Throwable th4) {
                    p2l.m68953a(pkv0.class, th4);
                }
            }
            str3 = str2;
        }
        jSONObject2.put("_eventName", str3);
        jSONObject2.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject2.put("_ui", str);
        if (uuid != null) {
            jSONObject2.put("_session_id", uuid);
        }
        if (bundle != null) {
            String str6 = this.f238386e;
            HashMap map = new HashMap();
            for (String str7 : bundle.keySet()) {
                mhf1.m61778z(str7);
                Object obj2 = bundle.get(str7);
                if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str7}, 2)));
                }
                map.put(str7, obj2.toString());
            }
            if (!p2l.f173365a.contains(v450.class)) {
                try {
                    if (v450.f237069c && !map.isEmpty()) {
                        try {
                            List<String> listM43728j1 = g6f.m43728j1(map.keySet());
                            JSONObject jSONObject3 = new JSONObject();
                            for (String str8 : listM43728j1) {
                                Object obj3 = map.get(str8);
                                if (obj3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                String str9 = (String) obj3;
                                v450 v450Var = v450.f237067b;
                                if (v450Var.m84633b(str8) || v450Var.m84633b(str9)) {
                                    map.remove(str8);
                                    if (!v450.f237071d) {
                                        str9 = "";
                                    }
                                    jSONObject3.put(str8, str9);
                                }
                            }
                            if (jSONObject3.length() != 0) {
                                map.put("_onDeviceParams", jSONObject3.toString());
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th5) {
                    p2l.m68953a(v450.class, th5);
                }
            }
            Map mapM96561l = zn91.m96561l(map);
            l5x0 l5x0Var3 = l5x0.f130106a;
            if (!p2l.f173365a.contains(l5x0.class)) {
                try {
                    if (l5x0.f130107b) {
                        HashMap map2 = new HashMap();
                        for (String str10 : new ArrayList(mapM96561l.keySet())) {
                            String strM58266a = l5x0.f130106a.m58266a(str6, str10);
                            if (strM58266a != null) {
                                map2.put(str10, strM58266a);
                                mapM96561l.remove(str10);
                            }
                        }
                        if (!map2.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                mapM96561l.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    p2l.m68953a(l5x0.class, th6);
                }
            }
            Map mapM96561l2 = zn91.m96561l(map);
            z4x z4xVar = z4x.f279397a;
            if (!p2l.f173365a.contains(z4x.class)) {
                try {
                    if (z4x.f279398b) {
                        ArrayList<String> arrayList = new ArrayList(mapM96561l2.keySet());
                        for (y4x y4xVar : new ArrayList(z4x.f279399c)) {
                            if (y4xVar.f269239a.equals(str6)) {
                                for (String str11 : arrayList) {
                                    if (y4xVar.f269240b.contains(str11)) {
                                        mapM96561l2.remove(str11);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    p2l.m68953a(z4x.class, th7);
                }
            }
            for (String str12 : map.keySet()) {
                jSONObject2.put(str12, map.get(str12));
            }
        }
        if (d != null) {
            jSONObject2.put("_valueToSum", d.doubleValue());
        }
        if (this.f238385d) {
            jSONObject2.put("_inBackground", "1");
        }
        if (this.f238384c) {
            jSONObject2.put("_implicitlyLogged", "1");
        } else {
            iq3 iq3Var = tra0.f223025b;
            jSONObject2.toString();
            synchronized (p8y.f175081b) {
            }
        }
        this.f238382a = jSONObject2;
    }

    private final Object writeReplace() {
        return new u85(this.f238382a.toString(), this.f238384c, this.f238383b.toString(), this.f238385d);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m84907a() {
        return this.f238382a;
    }

    /* JADX INFO: renamed from: b */
    public final String m84908b() {
        return this.f238386e;
    }

    public final String toString() {
        JSONObject jSONObject = this.f238382a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f238384c), jSONObject.toString()}, 3));
    }

    public v85(String str, boolean z, String str2, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f238382a = jSONObject;
        this.f238383b = new JSONObject(str2);
        this.f238384c = z;
        this.f238386e = jSONObject.optString("_eventName");
        this.f238385d = z2;
    }
}
