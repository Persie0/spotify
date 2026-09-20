package p204p;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bjx0 {

    /* JADX INFO: renamed from: a */
    public static final ae00 f27781a;

    static {
        uk60 uk60Var = new uk60();
        ex7 ex7Var = ex7.f63684a;
        uk60Var.mo40967a(bjx0.class, ex7Var);
        uk60Var.mo40967a(y18.class, ex7Var);
        f27781a = new ae00(uk60Var, 14);
    }

    /* JADX INFO: renamed from: a */
    public static y18 m29571a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new y18(string, string2, string3, string4, j);
    }
}
