package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes4.dex */
public final class qdg1 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final qdg1 f187613a = new qdg1();

    /* JADX INFO: renamed from: b */
    public static final guy f187616b = new guy("systemInfo", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(1))));

    /* JADX INFO: renamed from: c */
    public static final guy f187619c = new guy("eventName", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(2))));

    /* JADX INFO: renamed from: d */
    public static final guy f187622d = new guy("isThickClient", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(37))));

    /* JADX INFO: renamed from: e */
    public static final guy f187625e = new guy("clientType", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(61))));

    /* JADX INFO: renamed from: f */
    public static final guy f187628f = new guy("modelDownloadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(3))));

    /* JADX INFO: renamed from: g */
    public static final guy f187631g = new guy("customModelLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(20))));

    /* JADX INFO: renamed from: h */
    public static final guy f187634h = new guy("customModelInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(4))));

    /* JADX INFO: renamed from: i */
    public static final guy f187637i = new guy("customModelCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(29))));

    /* JADX INFO: renamed from: j */
    public static final guy f187640j = new guy("onDeviceFaceDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(5))));

    /* JADX INFO: renamed from: k */
    public static final guy f187643k = new guy("onDeviceFaceLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(59))));

    /* JADX INFO: renamed from: l */
    public static final guy f187646l = new guy("onDeviceTextDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(6))));

    /* JADX INFO: renamed from: m */
    public static final guy f187649m = new guy("onDeviceTextDetectionLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(79))));

    /* JADX INFO: renamed from: n */
    public static final guy f187652n = new guy("onDeviceBarcodeDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(7))));

    /* JADX INFO: renamed from: o */
    public static final guy f187655o = new guy("onDeviceBarcodeLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(58))));

    /* JADX INFO: renamed from: p */
    public static final guy f187658p = new guy("onDeviceImageLabelCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(48))));

    /* JADX INFO: renamed from: q */
    public static final guy f187661q = new guy("onDeviceImageLabelLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(49))));

    /* JADX INFO: renamed from: r */
    public static final guy f187664r = new guy("onDeviceImageLabelDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(18))));

    /* JADX INFO: renamed from: s */
    public static final guy f187667s = new guy("onDeviceObjectCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(26))));

    /* JADX INFO: renamed from: t */
    public static final guy f187670t = new guy("onDeviceObjectLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(27))));

    /* JADX INFO: renamed from: u */
    public static final guy f187673u = new guy("onDeviceObjectInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(28))));

    /* JADX INFO: renamed from: v */
    public static final guy f187676v = new guy("onDevicePoseDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(44))));

    /* JADX INFO: renamed from: w */
    public static final guy f187679w = new guy("onDeviceSegmentationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(45))));

    /* JADX INFO: renamed from: x */
    public static final guy f187682x = new guy("onDeviceSmartReplyLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(19))));

    /* JADX INFO: renamed from: y */
    public static final guy f187685y = new guy("onDeviceLanguageIdentificationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(21))));

    /* JADX INFO: renamed from: z */
    public static final guy f187688z = new guy("onDeviceTranslationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(22))));

    /* JADX INFO: renamed from: A */
    public static final guy f187561A = new guy("cloudFaceDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(8))));

    /* JADX INFO: renamed from: B */
    public static final guy f187563B = new guy("cloudCropHintDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(9))));

    /* JADX INFO: renamed from: C */
    public static final guy f187565C = new guy("cloudDocumentTextDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(10))));

    /* JADX INFO: renamed from: D */
    public static final guy f187567D = new guy("cloudImagePropertiesDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(11))));

    /* JADX INFO: renamed from: E */
    public static final guy f187569E = new guy("cloudImageLabelDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(12))));

    /* JADX INFO: renamed from: F */
    public static final guy f187571F = new guy("cloudLandmarkDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(13))));

    /* JADX INFO: renamed from: G */
    public static final guy f187573G = new guy("cloudLogoDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(14))));

    /* JADX INFO: renamed from: H */
    public static final guy f187575H = new guy("cloudSafeSearchDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(15))));

    /* JADX INFO: renamed from: I */
    public static final guy f187577I = new guy("cloudTextDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(16))));

    /* JADX INFO: renamed from: J */
    public static final guy f187579J = new guy("cloudWebSearchDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(17))));

    /* JADX INFO: renamed from: K */
    public static final guy f187581K = new guy("automlImageLabelingCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(23))));

    /* JADX INFO: renamed from: L */
    public static final guy f187583L = new guy("automlImageLabelingLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(24))));

    /* JADX INFO: renamed from: M */
    public static final guy f187585M = new guy("automlImageLabelingInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(25))));

    /* JADX INFO: renamed from: N */
    public static final guy f187587N = new guy("isModelDownloadedLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(39))));

    /* JADX INFO: renamed from: O */
    public static final guy f187589O = new guy("deleteModelLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(40))));

    /* JADX INFO: renamed from: P */
    public static final guy f187591P = new guy("aggregatedAutomlImageLabelingInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(30))));

    /* JADX INFO: renamed from: Q */
    public static final guy f187593Q = new guy("aggregatedCustomModelInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(31))));

    /* JADX INFO: renamed from: R */
    public static final guy f187595R = new guy("aggregatedOnDeviceFaceDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(32))));

    /* JADX INFO: renamed from: S */
    public static final guy f187597S = new guy("aggregatedOnDeviceBarcodeDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(33))));

    /* JADX INFO: renamed from: T */
    public static final guy f187599T = new guy("aggregatedOnDeviceImageLabelDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(34))));

    /* JADX INFO: renamed from: U */
    public static final guy f187601U = new guy("aggregatedOnDeviceObjectInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(35))));

    /* JADX INFO: renamed from: V */
    public static final guy f187603V = new guy("aggregatedOnDeviceTextDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(36))));

    /* JADX INFO: renamed from: W */
    public static final guy f187605W = new guy("aggregatedOnDevicePoseDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(46))));

    /* JADX INFO: renamed from: X */
    public static final guy f187607X = new guy("aggregatedOnDeviceSegmentationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(47))));

    /* JADX INFO: renamed from: Y */
    public static final guy f187609Y = new guy("pipelineAccelerationInferenceEvents", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(69))));

    /* JADX INFO: renamed from: Z */
    public static final guy f187611Z = new guy("remoteConfigLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(42))));

    /* JADX INFO: renamed from: a0 */
    public static final guy f187614a0 = new guy("inputImageConstructionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(50))));

    /* JADX INFO: renamed from: b0 */
    public static final guy f187617b0 = new guy("leakedHandleEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(51))));

    /* JADX INFO: renamed from: c0 */
    public static final guy f187620c0 = new guy("cameraSourceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(52))));

    /* JADX INFO: renamed from: d0 */
    public static final guy f187623d0 = new guy("imageLabelOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(53))));

    /* JADX INFO: renamed from: e0 */
    public static final guy f187626e0 = new guy("languageIdentificationOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(54))));

    /* JADX INFO: renamed from: f0 */
    public static final guy f187629f0 = new guy("faceDetectionOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(60))));

    /* JADX INFO: renamed from: g0 */
    public static final guy f187632g0 = new guy("documentDetectionOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(85))));

    /* JADX INFO: renamed from: h0 */
    public static final guy f187635h0 = new guy("documentCroppingOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(86))));

    /* JADX INFO: renamed from: i0 */
    public static final guy f187638i0 = new guy("documentEnhancementOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(87))));

    /* JADX INFO: renamed from: j0 */
    public static final guy f187641j0 = new guy("nlClassifierOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(55))));

    /* JADX INFO: renamed from: k0 */
    public static final guy f187644k0 = new guy("nlClassifierClientLibraryLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(56))));

    /* JADX INFO: renamed from: l0 */
    public static final guy f187647l0 = new guy("accelerationAllowlistLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(57))));

    /* JADX INFO: renamed from: m0 */
    public static final guy f187650m0 = new guy("toxicityDetectionCreateEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(62))));

    /* JADX INFO: renamed from: n0 */
    public static final guy f187653n0 = new guy("toxicityDetectionLoadEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(63))));

    /* JADX INFO: renamed from: o0 */
    public static final guy f187656o0 = new guy("toxicityDetectionInferenceEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(64))));

    /* JADX INFO: renamed from: p0 */
    public static final guy f187659p0 = new guy("barcodeDetectionOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(65))));

    /* JADX INFO: renamed from: q0 */
    public static final guy f187662q0 = new guy("customImageLabelOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(66))));

    /* JADX INFO: renamed from: r0 */
    public static final guy f187665r0 = new guy("codeScannerScanApiEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(67))));

    /* JADX INFO: renamed from: s0 */
    public static final guy f187668s0 = new guy("codeScannerOptionalModuleEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(68))));

    /* JADX INFO: renamed from: t0 */
    public static final guy f187671t0 = new guy("onDeviceExplicitContentCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(70))));

    /* JADX INFO: renamed from: u0 */
    public static final guy f187674u0 = new guy("onDeviceExplicitContentLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(71))));

    /* JADX INFO: renamed from: v0 */
    public static final guy f187677v0 = new guy("onDeviceExplicitContentInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(72))));

    /* JADX INFO: renamed from: w0 */
    public static final guy f187680w0 = new guy("aggregatedOnDeviceExplicitContentLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(73))));

    /* JADX INFO: renamed from: x0 */
    public static final guy f187683x0 = new guy("onDeviceFaceMeshCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(74))));

    /* JADX INFO: renamed from: y0 */
    public static final guy f187686y0 = new guy("onDeviceFaceMeshLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(75))));

    /* JADX INFO: renamed from: z0 */
    public static final guy f187689z0 = new guy("onDeviceFaceMeshLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(76))));

    /* JADX INFO: renamed from: A0 */
    public static final guy f187562A0 = new guy("aggregatedOnDeviceFaceMeshLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(77))));

    /* JADX INFO: renamed from: B0 */
    public static final guy f187564B0 = new guy("smartReplyOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(78))));

    /* JADX INFO: renamed from: C0 */
    public static final guy f187566C0 = new guy("textDetectionOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(80))));

    /* JADX INFO: renamed from: D0 */
    public static final guy f187568D0 = new guy("onDeviceImageQualityAnalysisCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(81))));

    /* JADX INFO: renamed from: E0 */
    public static final guy f187570E0 = new guy("onDeviceImageQualityAnalysisLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(82))));

    /* JADX INFO: renamed from: F0 */
    public static final guy f187572F0 = new guy("onDeviceImageQualityAnalysisLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(83))));

    /* JADX INFO: renamed from: G0 */
    public static final guy f187574G0 = new guy("aggregatedOnDeviceImageQualityAnalysisLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(84))));

    /* JADX INFO: renamed from: H0 */
    public static final guy f187576H0 = new guy("imageQualityAnalysisOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(88))));

    /* JADX INFO: renamed from: I0 */
    public static final guy f187578I0 = new guy("imageCaptioningOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(89))));

    /* JADX INFO: renamed from: J0 */
    public static final guy f187580J0 = new guy("onDeviceImageCaptioningCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(90))));

    /* JADX INFO: renamed from: K0 */
    public static final guy f187582K0 = new guy("onDeviceImageCaptioningLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(91))));

    /* JADX INFO: renamed from: L0 */
    public static final guy f187584L0 = new guy("onDeviceImageCaptioningInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(92))));

    /* JADX INFO: renamed from: M0 */
    public static final guy f187586M0 = new guy("aggregatedOnDeviceImageCaptioningInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(93))));

    /* JADX INFO: renamed from: N0 */
    public static final guy f187588N0 = new guy("onDeviceDocumentDetectionCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(94))));

    /* JADX INFO: renamed from: O0 */
    public static final guy f187590O0 = new guy("onDeviceDocumentDetectionLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(95))));

    /* JADX INFO: renamed from: P0 */
    public static final guy f187592P0 = new guy("onDeviceDocumentDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(96))));

    /* JADX INFO: renamed from: Q0 */
    public static final guy f187594Q0 = new guy("aggregatedOnDeviceDocumentDetectionLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(97))));

    /* JADX INFO: renamed from: R0 */
    public static final guy f187596R0 = new guy("onDeviceDocumentCroppingCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(98))));

    /* JADX INFO: renamed from: S0 */
    public static final guy f187598S0 = new guy("onDeviceDocumentCroppingLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(99))));

    /* JADX INFO: renamed from: T0 */
    public static final guy f187600T0 = new guy("onDeviceDocumentCroppingLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(100))));

    /* JADX INFO: renamed from: U0 */
    public static final guy f187602U0 = new guy("aggregatedOnDeviceDocumentCroppingLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(101))));

    /* JADX INFO: renamed from: V0 */
    public static final guy f187604V0 = new guy("onDeviceDocumentEnhancementCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(102))));

    /* JADX INFO: renamed from: W0 */
    public static final guy f187606W0 = new guy("onDeviceDocumentEnhancementLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(103))));

    /* JADX INFO: renamed from: X0 */
    public static final guy f187608X0 = new guy("onDeviceDocumentEnhancementLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(104))));

    /* JADX INFO: renamed from: Y0 */
    public static final guy f187610Y0 = new guy("aggregatedOnDeviceDocumentEnhancementLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(105))));

    /* JADX INFO: renamed from: Z0 */
    public static final guy f187612Z0 = new guy("scannerAutoZoomEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(Error.INVALID_COUNTRY_FIELD_NUMBER))));

    /* JADX INFO: renamed from: a1 */
    public static final guy f187615a1 = new guy("lowLightAutoExposureComputationEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(Error.TOO_YOUNG_FIELD_NUMBER))));

    /* JADX INFO: renamed from: b1 */
    public static final guy f187618b1 = new guy("lowLightFrameProcessEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(108))));

    /* JADX INFO: renamed from: c1 */
    public static final guy f187621c1 = new guy("lowLightSceneDetectionEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(109))));

    /* JADX INFO: renamed from: d1 */
    public static final guy f187624d1 = new guy("onDeviceStainRemovalLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(110))));

    /* JADX INFO: renamed from: e1 */
    public static final guy f187627e1 = new guy("aggregatedOnDeviceStainRemovalLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.SHORT_FORM_ON_DEMAND))));

    /* JADX INFO: renamed from: f1 */
    public static final guy f187630f1 = new guy("stainRemovalOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.LONG_FORM_ON_DEMAND))));

    /* JADX INFO: renamed from: g1 */
    public static final guy f187633g1 = new guy("onDeviceShadowRemovalLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.LIVE))));

    /* JADX INFO: renamed from: h1 */
    public static final guy f187636h1 = new guy("aggregatedOnDeviceShadowRemovalLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(114))));

    /* JADX INFO: renamed from: i1 */
    public static final guy f187639i1 = new guy("shadowRemovalOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(115))));

    /* JADX INFO: renamed from: j1 */
    public static final guy f187642j1 = new guy("onDeviceDigitalInkSegmentationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(116))));

    /* JADX INFO: renamed from: k1 */
    public static final guy f187645k1 = new guy("onDeviceDocumentScannerStartLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(117))));

    /* JADX INFO: renamed from: l1 */
    public static final guy f187648l1 = new guy("onDeviceDocumentScannerFinishLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(118))));

    /* JADX INFO: renamed from: m1 */
    public static final guy f187651m1 = new guy("onDeviceDocumentScannerUiStartLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(119))));

    /* JADX INFO: renamed from: n1 */
    public static final guy f187654n1 = new guy("onDeviceDocumentScannerUiFinishLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(120))));

    /* JADX INFO: renamed from: o1 */
    public static final guy f187657o1 = new guy("documentScannerUiOptionalModuleSessionStartLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND))));

    /* JADX INFO: renamed from: p1 */
    public static final guy f187660p1 = new guy("documentScannerUiOptionalModuleSessionFinishLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND))));

    /* JADX INFO: renamed from: q1 */
    public static final guy f187663q1 = new guy("onDeviceDocumentScannerUiCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(ContentType.USER_GENERATED_LIVE))));

    /* JADX INFO: renamed from: r1 */
    public static final guy f187666r1 = new guy("onDeviceSubjectSegmentationCreateLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(124))));

    /* JADX INFO: renamed from: s1 */
    public static final guy f187669s1 = new guy("onDeviceSubjectSegmentationLoadLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(125))));

    /* JADX INFO: renamed from: t1 */
    public static final guy f187672t1 = new guy("onDeviceSubjectSegmentationInferenceLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(126))));

    /* JADX INFO: renamed from: u1 */
    public static final guy f187675u1 = new guy("aggregatedOnDeviceSubjectSegmentationLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(127))));

    /* JADX INFO: renamed from: v1 */
    public static final guy f187678v1 = new guy("subjectSegmentationOptionalModuleLogEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(128))));

    /* JADX INFO: renamed from: w1 */
    public static final guy f187681w1 = new guy("documentScannerUiModuleScreenViewEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(129))));

    /* JADX INFO: renamed from: x1 */
    public static final guy f187684x1 = new guy("documentScannerUiModuleScreenClickEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(130))));

    /* JADX INFO: renamed from: y1 */
    public static final guy f187687y1 = new guy("documentScannerUiModuleScreenErrorEvent", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(131))));

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        etg1 etg1Var = (etg1) obj;
        bmk0 bmk0Var = (bmk0) obj2;
        bmk0Var.mo29864a(f187616b, etg1Var.f62711a);
        bmk0Var.mo29864a(f187619c, etg1Var.f62712b);
        bmk0Var.mo29864a(f187622d, null);
        bmk0Var.mo29864a(f187625e, etg1Var.f62713c);
        bmk0Var.mo29864a(f187628f, null);
        bmk0Var.mo29864a(f187631g, null);
        bmk0Var.mo29864a(f187634h, null);
        bmk0Var.mo29864a(f187637i, null);
        bmk0Var.mo29864a(f187640j, null);
        bmk0Var.mo29864a(f187643k, null);
        bmk0Var.mo29864a(f187646l, etg1Var.f62714d);
        bmk0Var.mo29864a(f187649m, etg1Var.f62715e);
        bmk0Var.mo29864a(f187652n, null);
        bmk0Var.mo29864a(f187655o, null);
        bmk0Var.mo29864a(f187658p, null);
        bmk0Var.mo29864a(f187661q, null);
        bmk0Var.mo29864a(f187664r, null);
        bmk0Var.mo29864a(f187667s, null);
        bmk0Var.mo29864a(f187670t, null);
        bmk0Var.mo29864a(f187673u, null);
        bmk0Var.mo29864a(f187676v, null);
        bmk0Var.mo29864a(f187679w, null);
        bmk0Var.mo29864a(f187682x, null);
        bmk0Var.mo29864a(f187685y, null);
        bmk0Var.mo29864a(f187688z, null);
        bmk0Var.mo29864a(f187561A, null);
        bmk0Var.mo29864a(f187563B, null);
        bmk0Var.mo29864a(f187565C, null);
        bmk0Var.mo29864a(f187567D, null);
        bmk0Var.mo29864a(f187569E, null);
        bmk0Var.mo29864a(f187571F, null);
        bmk0Var.mo29864a(f187573G, null);
        bmk0Var.mo29864a(f187575H, null);
        bmk0Var.mo29864a(f187577I, null);
        bmk0Var.mo29864a(f187579J, null);
        bmk0Var.mo29864a(f187581K, null);
        bmk0Var.mo29864a(f187583L, null);
        bmk0Var.mo29864a(f187585M, null);
        bmk0Var.mo29864a(f187587N, null);
        bmk0Var.mo29864a(f187589O, null);
        bmk0Var.mo29864a(f187591P, null);
        bmk0Var.mo29864a(f187593Q, null);
        bmk0Var.mo29864a(f187595R, null);
        bmk0Var.mo29864a(f187597S, null);
        bmk0Var.mo29864a(f187599T, null);
        bmk0Var.mo29864a(f187601U, null);
        bmk0Var.mo29864a(f187603V, etg1Var.f62716f);
        bmk0Var.mo29864a(f187605W, null);
        bmk0Var.mo29864a(f187607X, null);
        bmk0Var.mo29864a(f187609Y, null);
        bmk0Var.mo29864a(f187611Z, null);
        bmk0Var.mo29864a(f187614a0, null);
        bmk0Var.mo29864a(f187617b0, null);
        bmk0Var.mo29864a(f187620c0, null);
        bmk0Var.mo29864a(f187623d0, null);
        bmk0Var.mo29864a(f187626e0, null);
        bmk0Var.mo29864a(f187629f0, null);
        bmk0Var.mo29864a(f187632g0, null);
        bmk0Var.mo29864a(f187635h0, null);
        bmk0Var.mo29864a(f187638i0, null);
        bmk0Var.mo29864a(f187641j0, null);
        bmk0Var.mo29864a(f187644k0, null);
        bmk0Var.mo29864a(f187647l0, null);
        bmk0Var.mo29864a(f187650m0, null);
        bmk0Var.mo29864a(f187653n0, null);
        bmk0Var.mo29864a(f187656o0, null);
        bmk0Var.mo29864a(f187659p0, null);
        bmk0Var.mo29864a(f187662q0, null);
        bmk0Var.mo29864a(f187665r0, null);
        bmk0Var.mo29864a(f187668s0, null);
        bmk0Var.mo29864a(f187671t0, null);
        bmk0Var.mo29864a(f187674u0, null);
        bmk0Var.mo29864a(f187677v0, null);
        bmk0Var.mo29864a(f187680w0, null);
        bmk0Var.mo29864a(f187683x0, null);
        bmk0Var.mo29864a(f187686y0, null);
        bmk0Var.mo29864a(f187689z0, null);
        bmk0Var.mo29864a(f187562A0, null);
        bmk0Var.mo29864a(f187564B0, null);
        bmk0Var.mo29864a(f187566C0, null);
        bmk0Var.mo29864a(f187568D0, null);
        bmk0Var.mo29864a(f187570E0, null);
        bmk0Var.mo29864a(f187572F0, null);
        bmk0Var.mo29864a(f187574G0, null);
        bmk0Var.mo29864a(f187576H0, null);
        bmk0Var.mo29864a(f187578I0, null);
        bmk0Var.mo29864a(f187580J0, null);
        bmk0Var.mo29864a(f187582K0, null);
        bmk0Var.mo29864a(f187584L0, null);
        bmk0Var.mo29864a(f187586M0, null);
        bmk0Var.mo29864a(f187588N0, null);
        bmk0Var.mo29864a(f187590O0, null);
        bmk0Var.mo29864a(f187592P0, null);
        bmk0Var.mo29864a(f187594Q0, null);
        bmk0Var.mo29864a(f187596R0, null);
        bmk0Var.mo29864a(f187598S0, null);
        bmk0Var.mo29864a(f187600T0, null);
        bmk0Var.mo29864a(f187602U0, null);
        bmk0Var.mo29864a(f187604V0, null);
        bmk0Var.mo29864a(f187606W0, null);
        bmk0Var.mo29864a(f187608X0, null);
        bmk0Var.mo29864a(f187610Y0, null);
        bmk0Var.mo29864a(f187612Z0, null);
        bmk0Var.mo29864a(f187615a1, null);
        bmk0Var.mo29864a(f187618b1, null);
        bmk0Var.mo29864a(f187621c1, null);
        bmk0Var.mo29864a(f187624d1, null);
        bmk0Var.mo29864a(f187627e1, null);
        bmk0Var.mo29864a(f187630f1, null);
        bmk0Var.mo29864a(f187633g1, null);
        bmk0Var.mo29864a(f187636h1, null);
        bmk0Var.mo29864a(f187639i1, null);
        bmk0Var.mo29864a(f187642j1, null);
        bmk0Var.mo29864a(f187645k1, null);
        bmk0Var.mo29864a(f187648l1, null);
        bmk0Var.mo29864a(f187651m1, null);
        bmk0Var.mo29864a(f187654n1, null);
        bmk0Var.mo29864a(f187657o1, null);
        bmk0Var.mo29864a(f187660p1, null);
        bmk0Var.mo29864a(f187663q1, null);
        bmk0Var.mo29864a(f187666r1, null);
        bmk0Var.mo29864a(f187669s1, null);
        bmk0Var.mo29864a(f187672t1, null);
        bmk0Var.mo29864a(f187675u1, null);
        bmk0Var.mo29864a(f187678v1, null);
        bmk0Var.mo29864a(f187681w1, null);
        bmk0Var.mo29864a(f187684x1, null);
        bmk0Var.mo29864a(f187687y1, null);
    }
}
