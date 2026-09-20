package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;
import p204p.s571;

/* JADX INFO: renamed from: org.chromium.net.b */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1639b {
    /* JADX INFO: renamed from: a */
    public static JSONObject m24262a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(s571.m77251j("Failed adding a default object for key [", str, "]"), e);
        }
    }
}
