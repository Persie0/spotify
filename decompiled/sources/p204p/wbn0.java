package p204p;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wbn0 {

    /* JADX INFO: renamed from: a */
    public final String f249818a;

    /* JADX INFO: renamed from: b */
    public final int f249819b;

    /* JADX INFO: renamed from: c */
    public final int f249820c;

    /* JADX INFO: renamed from: d */
    public final String f249821d;

    /* JADX INFO: renamed from: e */
    public final String f249822e;

    /* JADX INFO: renamed from: f */
    public final String f249823f;

    /* JADX INFO: renamed from: g */
    public final String f249824g;

    /* JADX INFO: renamed from: h */
    public final int f249825h;

    public wbn0(JSONObject jSONObject) {
        this.f249818a = jSONObject.getString("class_name");
        this.f249819b = jSONObject.optInt("index", -1);
        this.f249820c = jSONObject.optInt("id");
        this.f249821d = jSONObject.optString("text");
        this.f249822e = jSONObject.optString("tag");
        this.f249823f = jSONObject.optString("description");
        this.f249824g = jSONObject.optString("hint");
        this.f249825h = jSONObject.optInt("match_bitmask");
    }
}
