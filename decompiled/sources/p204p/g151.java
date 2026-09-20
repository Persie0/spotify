package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g151 {

    /* JADX INFO: renamed from: b */
    public static boolean f75531b;

    /* JADX INFO: renamed from: a */
    public static final g151 f75530a = new g151();

    /* JADX INFO: renamed from: c */
    public static final HashMap f75532c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final HashMap f75533d = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final void m43340d(Bundle bundle) {
        g151 g151Var = f75530a;
        HashMap map = f75533d;
        if (p2l.f173365a.contains(g151.class)) {
            return;
        }
        try {
            if (f75531b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(str));
                    HashMap map2 = f75532c;
                    boolean z = false;
                    boolean z2 = map2.get(str) != null;
                    boolean z3 = map.get(str) != null;
                    if (z2 || z3) {
                        Set set = (Set) map2.get(str);
                        if (!p2l.f173365a.contains(g151Var) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (it.hasNext()) {
                                        if (Pattern.compile((String) it.next()).matcher(strValueOf).matches()) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                p2l.m68953a(g151Var, th);
                            }
                        }
                        boolean zM43342b = g151Var.m43342b(strValueOf, (Set) map.get(str));
                        if (!z && !zM43342b) {
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th2) {
            p2l.m68953a(g151.class, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43341a(JSONArray jSONArray) {
        HashMap map = f75532c;
        HashMap map2 = f75533d;
        if (p2l.f173365a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (f75531b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet hashSetM43343c = m43343c(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                HashSet hashSet = (HashSet) map2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetM43343c);
                                    hashSetM43343c = hashSet;
                                }
                                map2.put(string, hashSetM43343c);
                            } else {
                                HashSet hashSet2 = (HashSet) map.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetM43343c);
                                    hashSetM43343c = hashSet2;
                                }
                                map.put(string, hashSetM43343c);
                            }
                        }
                    } catch (Exception unused) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43342b(String str, Set set) {
        if (!p2l.f173365a.contains(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).equals(str.toLowerCase(locale))) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(this, th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final HashSet m43343c(JSONArray jSONArray) {
        try {
            if (p2l.f173365a.contains(this)) {
                return null;
            }
            try {
                HashSet hashSetM63365e = n0b1.m63365e(jSONArray);
                return hashSetM63365e == null ? new HashSet() : hashSetM63365e;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }
}
