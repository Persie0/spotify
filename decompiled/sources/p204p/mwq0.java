package p204p;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes9.dex */
public final class mwq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final mwq0 f147844L0;

    /* JADX INFO: renamed from: M0 */
    public static final mwq0 f147845M0;

    /* JADX INFO: renamed from: N0 */
    public static final mwq0 f147846N0;

    /* JADX INFO: renamed from: O0 */
    public static final mwq0 f147847O0;

    /* JADX INFO: renamed from: P0 */
    public static final mwq0 f147848P0;

    /* JADX INFO: renamed from: Q0 */
    public static final mwq0 f147849Q0;

    /* JADX INFO: renamed from: R0 */
    public static final mwq0 f147850R0;

    /* JADX INFO: renamed from: S0 */
    public static final mwq0 f147851S0;

    /* JADX INFO: renamed from: T0 */
    public static final mwq0 f147852T0;

    /* JADX INFO: renamed from: U0 */
    public static final mwq0 f147853U0;

    /* JADX INFO: renamed from: V0 */
    public static final mwq0 f147854V0;

    /* JADX INFO: renamed from: W0 */
    public static final mwq0 f147855W0;

    /* JADX INFO: renamed from: X */
    public static final mwq0 f147856X;

    /* JADX INFO: renamed from: X0 */
    public static final mwq0 f147857X0;

    /* JADX INFO: renamed from: Y */
    public static final mwq0 f147858Y;

    /* JADX INFO: renamed from: Y0 */
    public static final mwq0 f147859Y0;

    /* JADX INFO: renamed from: Z */
    public static final mwq0 f147860Z;

    /* JADX INFO: renamed from: Z0 */
    public static final mwq0 f147861Z0;

    /* JADX INFO: renamed from: a1 */
    public static final mwq0 f147862a1;

    /* JADX INFO: renamed from: b */
    public static final mwq0 f147863b;

    /* JADX INFO: renamed from: b1 */
    public static final mwq0 f147864b1;

    /* JADX INFO: renamed from: c */
    public static final mwq0 f147865c;

    /* JADX INFO: renamed from: c1 */
    public static final mwq0 f147866c1;

    /* JADX INFO: renamed from: d */
    public static final mwq0 f147867d;

    /* JADX INFO: renamed from: e */
    public static final mwq0 f147868e;

    /* JADX INFO: renamed from: f */
    public static final mwq0 f147869f;

    /* JADX INFO: renamed from: g */
    public static final mwq0 f147870g;

    /* JADX INFO: renamed from: h */
    public static final mwq0 f147871h;

    /* JADX INFO: renamed from: i */
    public static final mwq0 f147872i;

    /* JADX INFO: renamed from: t */
    public static final mwq0 f147873t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147874a;

    static {
        int i = 0;
        f147863b = new mwq0(i, 0);
        f147865c = new mwq0(i, 1);
        f147867d = new mwq0(i, 2);
        f147868e = new mwq0(i, 3);
        f147869f = new mwq0(i, 4);
        f147870g = new mwq0(i, 5);
        f147871h = new mwq0(i, 6);
        f147872i = new mwq0(i, 7);
        f147873t = new mwq0(i, 8);
        f147856X = new mwq0(i, 9);
        f147858Y = new mwq0(i, 10);
        f147860Z = new mwq0(i, 11);
        f147844L0 = new mwq0(i, 12);
        f147845M0 = new mwq0(i, 13);
        f147846N0 = new mwq0(i, 14);
        f147847O0 = new mwq0(i, 15);
        f147848P0 = new mwq0(i, 16);
        f147849Q0 = new mwq0(i, 17);
        f147850R0 = new mwq0(i, 18);
        f147851S0 = new mwq0(i, 19);
        f147852T0 = new mwq0(i, 20);
        f147853U0 = new mwq0(i, 21);
        f147854V0 = new mwq0(i, 22);
        f147855W0 = new mwq0(i, 23);
        f147857X0 = new mwq0(i, 24);
        f147859Y0 = new mwq0(i, 25);
        f147861Z0 = new mwq0(i, 26);
        f147862a1 = new mwq0(i, 27);
        f147864b1 = new mwq0(i, 28);
        f147866c1 = new mwq0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwq0(int i, int i2) {
        super(i);
        this.f147874a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f147874a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return new mj5(nie0.f154250a, 0);
            case 1:
                return new mj5(ql51.f189738a, 0);
            case 2:
                return w2a1Var;
            case 3:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                runningAppProcessInfo.importance = 0;
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                return Integer.valueOf(runningAppProcessInfo.importance);
            case 4:
                return new mj5(e450.f55982a, 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return w2a1Var;
            case 9:
                return new i6h0();
            case 10:
                return new w6h0();
            case 11:
                return new y6h0();
            case 12:
                return new e7h0();
            case 13:
                return new h7h0();
            case 14:
                return new j7h0();
            case 15:
                return w2a1Var;
            case 16:
                return vgg1.m85475p("com.spotify.promptedplaylists.domain.PromptType", wms0.values(), new String[]{"FOUNDATIONAL", "RULE"}, new Annotation[][]{null, null});
            case 17:
                return sam.m77645B(Boolean.FALSE);
            case 18:
                return sam.m77645B(Boolean.FALSE);
            case 19:
                return sam.m77645B(0);
            case 20:
                return sam.m77645B(Boolean.FALSE);
            case 21:
                return sam.m77645B(Boolean.FALSE);
            case 22:
                return sam.m77645B(Boolean.FALSE);
            case 23:
                return sam.m77645B(Boolean.TRUE);
            case 24:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 25:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 26:
                return Boolean.FALSE;
            case 27:
                return s601.m77303f0("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", ContextTrack.Metadata.KEY_AD_TYPE, "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            case 28:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            default:
                return new mj5(u5t0.f227107a, 0);
        }
    }
}
