package p204p;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class p1a1 {

    /* JADX INFO: renamed from: a */
    public final String f173015a;

    /* JADX INFO: renamed from: b */
    public final String f173016b;

    /* JADX INFO: renamed from: c */
    public final String f173017c;

    /* JADX INFO: renamed from: d */
    public final int f173018d;

    public p1a1(String str) {
        this.f173015a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f173016b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f173017c = strOptString;
        this.f173018d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1a1) {
            return TextUtils.equals(this.f173015a, ((p1a1) obj).f173015a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f173015a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f173016b);
        sb.append("', productType='");
        sb.append(this.f173017c);
        sb.append("', statusCode=");
        return klh.m56832d(this.f173018d, "}", sb);
    }
}
