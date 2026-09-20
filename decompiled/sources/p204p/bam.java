package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes3.dex */
public enum bam {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE(ContextTrack.Metadata.KEY_AD_TYPE),
    CURRENCY("fb_currency");


    /* JADX INFO: renamed from: a */
    public final String f25258a;

    bam(String str) {
        this.f25258a = str;
    }
}
