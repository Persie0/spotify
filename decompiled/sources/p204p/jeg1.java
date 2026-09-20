package p204p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;

/* JADX INFO: loaded from: classes4.dex */
public enum jeg1 implements taf1 {
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(2),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_CLOSE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_LOAD(4),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_DETECT(11),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_CREATE(12),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_CLOSE(13),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_LOAD(14),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_DETECT(21),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_CREATE(22),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_CLOSE(23),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_LOAD(24),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_LABEL_DETECT(141),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(142),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(143),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_LABEL_LOAD(144),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(151),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(152),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(153),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(154),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(155),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(161),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(162),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(164),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(163),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(171),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(172),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(173),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(174),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(175),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(241),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(242),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(243),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(244),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(245),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(191),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(192),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(193),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(194),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(311),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(312),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(313),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(314),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(315),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(321),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(322),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(323),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(324),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(325),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(331),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(332),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(333),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(334),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(341),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(342),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(343),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(344),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(351),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(352),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(353),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(354),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(31),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(32),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(33),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(41),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(42),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(43),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(51),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(52),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(53),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(61),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(62),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(63),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(71),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(72),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(73),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(81),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(82),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(83),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(91),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(92),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(93),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(ContentType.SHORT_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(ContentType.LONG_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(ContentType.LIVE),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(ContentType.USER_GENERATED_LIVE),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(131),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(132),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(133),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(102),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(103),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(104),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(105),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(181),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(182),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(183),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(184),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(100),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(101),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(251),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(252),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(260),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(261),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(200),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(201),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(202),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(203),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(204),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(205),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(206),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(207),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(208),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(209),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(210),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(AdvertisementType.ON_DEMAND_PRE_ROLL),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(AdvertisementType.ON_DEMAND_MID_ROLL),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(AdvertisementType.ON_DEMAND_POST_ROLL),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(214),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(271),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(272),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(273),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(281),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(291),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(292),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(293),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(ContentFeedType.EAST_HD),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(ContentFeedType.WEST_HD),
    INPUT_IMAGE_CONSTRUCTION(361),
    /* JADX INFO: Fake field, exist only in values array */
    HANDLE_LEAKED(371),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA_SOURCE(381),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_LABELING(391),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID(WindowState.FULL_SCREEN),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_CREATE(WindowState.MINIMIZED),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_INIT(WindowState.MAXIMIZED),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_INFERENCE(404),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_RELEASE(405),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER(411),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_CREATE(412),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_INIT(413),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_INFERENCE(414),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_RELEASE(415),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY(421),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CREATE(422),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CLASSIFY(423),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CLOSE(424),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION(441),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_CREATE(461),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_INIT(462),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_INFERENCE(463),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_RELEASE(464),
    /* JADX INFO: Fake field, exist only in values array */
    ACCELERATION_ALLOWLIST_GET(431),
    /* JADX INFO: Fake field, exist only in values array */
    ACCELERATION_ALLOWLIST_FETCH(432),
    /* JADX INFO: Fake field, exist only in values array */
    ODML_IMAGE(442),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION(443),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_CREATE(471),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INIT(472),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INFERENCE(473),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_RELEASE(474),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INFERENCE_AFTER_RELEASE(475),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_CREATE_EVENT(451),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_LOAD_EVENT(452),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_INFERENCE_EVENT(453),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_DOWNLOAD_EVENT(454),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_CREATE(481),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INIT(482),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INFERENCE(483),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_RELEASE(484),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_SCAN_API(491),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_OPTIONAL_MODULE(492),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_CREATE(501),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_LOAD(502),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_DETECT(503),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_CLOSE(504),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_MESH_CREATE(511),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_MESH_LOAD(512),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_MESH_DETECT(513),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_MESH_CLOSE(514),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_CREATE(521),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_INIT(522),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_INFERENCE(523),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_RELEASE(524),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_TEXT_CREATE(531),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_TEXT_INIT(532),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_TEXT_INFERENCE(533),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_TEXT_RELEASE(534),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_QUALITY_ANALYSIS_CREATE(541),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_QUALITY_ANALYSIS_LOAD(542),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_QUALITY_ANALYSIS_DETECT(543),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_QUALITY_ANALYSIS_CLOSE(544),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_DETECT_CREATE(551),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_DETECT_INIT(552),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_DETECT_PROCESS(553),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_DETECT_RELEASE(554),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_CROP_CREATE(561),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_CROP_INIT(562),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_CROP_PROCESS(563),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_CROP_RELEASE(564),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_ENHANCE_CREATE(571),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_ENHANCE_INIT(572),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_ENHANCE_PROCESS(573),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_DOCUMENT_ENHANCE_RELEASE(574),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_QUALITY_ANALYSIS_CREATE(581),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_QUALITY_ANALYSIS_INIT(582),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_QUALITY_ANALYSIS_INFERENCE(583),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_QUALITY_ANALYSIS_RELEASE(584),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_CAPTIONING_CREATE(591),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_CAPTIONING_INIT(592),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_CAPTIONING_INFERENCE(593),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_CAPTIONING_RELEASE(594),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_CAPTIONING_CREATE(ContentDeliverySubscriptionType.TRADITIONAL_MVPD),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_CAPTIONING_LOAD(ContentDeliverySubscriptionType.VIRTUAL_MVPD),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_CAPTIONING_INFERENCE(ContentDeliverySubscriptionType.SUBSCRIPTION),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_CAPTIONING_CLOSE(ContentDeliverySubscriptionType.ADVERTISING);


    /* JADX INFO: renamed from: a */
    public final int f111569a;

    jeg1(int i) {
        this.f111569a = i;
    }

    @Override // p204p.taf1
    public final int zza() {
        return this.f111569a;
    }
}
