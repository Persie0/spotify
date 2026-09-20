package p204p;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bwz0 {

    /* JADX INFO: renamed from: a */
    public final int f31750a;

    /* JADX INFO: renamed from: b */
    public Object f31751b;

    /* JADX INFO: renamed from: c */
    public final String f31752c;

    public bwz0(int i, String str) {
        this.f31750a = i;
        this.f31752c = str;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m30733a() {
        Object obj = this.f31751b;
        return obj instanceof JSONObject ? (JSONObject) obj : new JSONObject();
    }
}
