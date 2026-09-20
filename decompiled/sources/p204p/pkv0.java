package p204p;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pkv0 {

    /* JADX INFO: renamed from: b */
    public static boolean f178586b;

    /* JADX INFO: renamed from: a */
    public static final pkv0 f178585a = new pkv0();

    /* JADX INFO: renamed from: c */
    public static HashMap f178587c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m70227a() {
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
                f178587c = new HashMap();
                JSONArray jSONArray = ltyVarM71031k.f136920p;
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
                        if (string != null && (hashSetM63365e = n0b1.m63365e(jSONArray2)) != null) {
                            f178587c.put(string, hashSetM63365e);
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
