package p204p;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class nrt {

    /* JADX INFO: renamed from: c */
    public static final nrt f157603c;

    /* JADX INFO: renamed from: a */
    public final pf40 f157604a;

    /* JADX INFO: renamed from: b */
    public final pf40 f157605b;

    static {
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        f157603c = new nrt(wsv0Var, wsv0Var);
    }

    public nrt(List list, List list2) {
        this.f157604a = pf40.m69791p(list);
        this.f157605b = pf40.m69791p(list2);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m65489a() {
        JSONObject jSONObject = new JSONObject();
        pf40 pf40Var = this.f157604a;
        boolean zIsEmpty = pf40Var.isEmpty();
        pf40 pf40Var2 = this.f157605b;
        if (zIsEmpty && pf40Var2.isEmpty()) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < pf40Var.size(); i++) {
            jSONArray.put(((t27) pf40Var.get(i)).getClass().getSimpleName());
        }
        try {
            jSONObject.put("audio", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < pf40Var2.size(); i2++) {
                jSONArray2.put(((cnt) pf40Var2.get(i2)).getClass().getSimpleName());
            }
            jSONObject.put("video", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            yif1.m93821x0("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return m65489a().toString();
    }
}
