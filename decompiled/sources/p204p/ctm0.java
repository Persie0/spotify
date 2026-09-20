package p204p;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ctm0 {

    /* JADX INFO: renamed from: a */
    public final String f41919a;

    /* JADX INFO: renamed from: b */
    public final String f41920b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f41921c;

    /* JADX INFO: renamed from: d */
    public final String f41922d;

    public ctm0(JSONObject jSONObject) {
        this.f41919a = jSONObject.getString("name");
        this.f41920b = jSONObject.optString("value");
        this.f41922d = jSONObject.optString("path_type", "absolute");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new wbn0(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        this.f41921c = arrayList;
    }
}
