package p204p;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cgw {

    /* JADX INFO: renamed from: a */
    public String f37817a;

    /* JADX INFO: renamed from: b */
    public String f37818b;

    /* JADX INFO: renamed from: c */
    public Long f37819c;

    public cgw(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f37819c = lValueOf;
        this.f37818b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        this.f37817a = stringBuffer.toString();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f37819c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f37818b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        return jSONObject == null ? super.toString() : jSONObject.toString();
    }
}
