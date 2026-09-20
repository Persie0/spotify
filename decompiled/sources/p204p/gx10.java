package p204p;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gx10 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f85144e = 0;

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f85145a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f85146b;

    /* JADX INFO: renamed from: c */
    public final e8y f85147c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f85148d;

    public gx10(HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, e8y e8yVar) {
        this.f85145a = httpURLConnection;
        this.f85146b = jSONObject;
        this.f85147c = e8yVar;
        this.f85148d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f85145a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbM38572u = edb.m38572u("{Response:  responseCode: ", str, ", graphObject: ");
        sbM38572u.append(this.f85146b);
        sbM38572u.append(", error: ");
        sbM38572u.append(this.f85147c);
        sbM38572u.append("}");
        return sbM38572u.toString();
    }
}
