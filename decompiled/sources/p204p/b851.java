package p204p;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b851 {

    /* JADX INFO: renamed from: d */
    public static final long f24494d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f24495e = 0;

    /* JADX INFO: renamed from: a */
    public final String f24496a;

    /* JADX INFO: renamed from: b */
    public final String f24497b;

    /* JADX INFO: renamed from: c */
    public final long f24498c;

    public b851(String str, String str2, long j) {
        this.f24496a = str;
        this.f24497b = str2;
        this.f24498c = j;
    }

    /* JADX INFO: renamed from: a */
    public static b851 m28413a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new b851(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b851(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }
}
