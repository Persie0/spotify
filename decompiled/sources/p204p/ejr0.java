package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ejr0 {

    /* JADX INFO: renamed from: a */
    public final String f60283a;

    /* JADX INFO: renamed from: b */
    public final String f60284b;

    /* JADX INFO: renamed from: c */
    public final String f60285c;

    public ejr0(JSONObject jSONObject) throws JSONException {
        this.f60283a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f60284b = true == strOptString.isEmpty() ? null : strOptString;
        this.f60285c = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new k47(jSONObjectOptJSONObject));
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getString("productId");
            jSONObjectOptJSONObject3.optString(ContextTrack.Metadata.KEY_TITLE);
            jSONObjectOptJSONObject3.optString("name");
            jSONObjectOptJSONObject3.optString("description");
            jSONObjectOptJSONObject3.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.optString("billingPeriod");
                jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                jSONObjectOptJSONObject4.optString("formattedPrice");
                jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                jSONObjectOptJSONObject4.optInt("recurrenceMode");
                jSONObjectOptJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i2));
            }
        }
    }
}
