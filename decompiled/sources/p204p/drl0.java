package p204p;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class drl0 {

    /* JADX INFO: renamed from: b */
    public static final Map f52355b = Collections.singletonMap(erl0.f62145a, new pqm0(bk5.m29624m1(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), bk5.m29624m1(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"})));

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f52356a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m36735a(erl0 erl0Var, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.f52356a;
        try {
            HashSet hashSet = v85.f238381f;
            mhf1.m61778z(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(erl0Var)) {
                linkedHashMap.put(erl0Var, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(erl0Var);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final drl0 m36736b() {
        drl0 drl0Var = new drl0();
        LinkedHashMap linkedHashMap = this.f52356a;
        for (erl0 erl0Var : linkedHashMap.keySet()) {
            Map map = (Map) linkedHashMap.get(erl0Var);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        drl0Var.m36735a(erl0Var, str, obj);
                    }
                }
            }
        }
        return drl0Var;
    }
}
