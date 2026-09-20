package p204p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z4x {

    /* JADX INFO: renamed from: b */
    public static boolean f279398b;

    /* JADX INFO: renamed from: a */
    public static final z4x f279397a = new z4x();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f279399c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static final HashSet f279400d = new HashSet();

    /* JADX INFO: renamed from: b */
    public static final void m95380b(ArrayList arrayList) {
        if (p2l.f173365a.contains(z4x.class)) {
            return;
        }
        try {
            if (f279398b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (f279400d.contains(((v85) it.next()).m84908b())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(z4x.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m95381a() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            lty ltyVarM71031k = pty.m71031k(p8y.m69344b(), false);
            if (ltyVarM71031k == null) {
                return;
            }
            String str = ltyVarM71031k.f136916l;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                f279399c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            f279400d.add(next);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            y4x y4xVar = new y4x(next, new ArrayList());
                            if (jSONArrayOptJSONArray != null) {
                                y4xVar.m92822a(n0b1.m63366f(jSONArrayOptJSONArray));
                            }
                            f279399c.add(y4xVar);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
