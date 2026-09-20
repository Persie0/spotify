package p204p;

import android.text.TextUtils;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class fjr0 {

    /* JADX INFO: renamed from: a */
    public final String f70389a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f70390b;

    /* JADX INFO: renamed from: c */
    public final String f70391c;

    /* JADX INFO: renamed from: d */
    public final String f70392d;

    /* JADX INFO: renamed from: e */
    public final String f70393e;

    /* JADX INFO: renamed from: f */
    public final String f70394f;

    /* JADX INFO: renamed from: g */
    public final String f70395g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f70396h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f70397i;

    public fjr0(String str) {
        this.f70389a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f70390b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f70391c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f70392d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f70393e = jSONObject.optString(ContextTrack.Metadata.KEY_TITLE);
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f70394f = jSONObject.optString("skuDetailsToken");
        this.f70395g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new ejr0(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f70396h = arrayList;
        } else {
            this.f70396h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f70390b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f70390b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new djr0(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f70397i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f70397i = null;
        } else {
            arrayList2.add(new djr0(jSONObjectOptJSONObject));
            this.f70397i = arrayList2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final djr0 m41856a() {
        ArrayList arrayList = this.f70397i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (djr0) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fjr0) {
            return TextUtils.equals(this.f70389a, ((fjr0) obj).f70389a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f70389a.hashCode();
    }

    public final String toString() {
        String string = this.f70390b.toString();
        String strValueOf = String.valueOf(this.f70396h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        klh.m56844p(sb, this.f70389a, "', parsedJson=", string, ", productId='");
        sb.append(this.f70391c);
        sb.append("', productType='");
        sb.append(this.f70392d);
        sb.append("', title='");
        sb.append(this.f70393e);
        sb.append("', productDetailsToken='");
        return klh.m56837i(sb, this.f70394f, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
