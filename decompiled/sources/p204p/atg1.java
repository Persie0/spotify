package p204p;

import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes4.dex */
public enum atg1 implements qqf1 {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(102),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(103),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(104),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(105),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(Error.INVALID_COUNTRY_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(Error.TOO_YOUNG_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(108),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(109),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(110),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(ContentType.SHORT_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(ContentType.LONG_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(ContentType.LIVE),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(114),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(115),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(203),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(204),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(205),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(206),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(207),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(ContentFeedType.EAST_HD),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(ContentFeedType.WEST_HD),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(ContentFeedType.EAST_SD),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(ContentFeedType.WEST_SD),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(305),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(400),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(WindowState.FULL_SCREEN),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(WindowState.MINIMIZED),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(WindowState.MAXIMIZED),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(404),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(405),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(406),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(407),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(501),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(CtaType.BUY_TICKETS_FIELD_NUMBER),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(ContentDeliverySubscriptionType.TRADITIONAL_MVPD),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(ContentDeliverySubscriptionType.VIRTUAL_MVPD),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(ContentDeliverySubscriptionType.SUBSCRIPTION),
    UNKNOWN_ERROR(9999);


    /* JADX INFO: renamed from: a */
    public final int f19679a;

    atg1(int i) {
        this.f19679a = i;
    }

    @Override // p204p.qqf1
    public final int zza() {
        return this.f19679a;
    }
}
