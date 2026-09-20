package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.cva;
import p204p.dyd0;
import p204p.gva;
import p204p.jac1;
import p204p.ore0;
import p204p.pre0;
import p204p.pvl0;
import p204p.q3p0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj51;
import p204p.sre0;
import p204p.tqo0;
import p204p.uk51;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamStartRequestOuterClass$StreamStartRequest extends AbstractC0269h implements sre0 {
    public static final int AGENTIC_PRODUCT_TYPE_FIELD_NUMBER = 55;
    public static final int ATTRIBUTION_FIELD_NUMBER = 58;
    public static final int CLIENT_OFFLINE_FIELD_NUMBER = 34;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 40;
    public static final int CONFIG_PARAMS_FIELD_NUMBER = 49;
    public static final int CONNECT_CONTROLLER_DEVICE_ID_FIELD_NUMBER = 16;
    public static final int CONTENT_IS_DOWNLOADED_FIELD_NUMBER = 33;
    public static final int CONTENT_URI_FIELD_NUMBER = 6;
    public static final int CUSTOM_REPORTING_ATTRIBUTION_FIELD_NUMBER = 38;
    public static final int DECISION_ID_FIELD_NUMBER = 37;
    private static final StreamStartRequestOuterClass$StreamStartRequest DEFAULT_INSTANCE;
    public static final int DISPLAYED_CONTENT_URI_FIELD_NUMBER = 7;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 53;
    public static final int FEATURE_UUID_FIELD_NUMBER = 36;
    public static final int INTERACTION_ID_FIELD_NUMBER = 18;
    public static final int IS_AUDIO_ON_FIELD_NUMBER = 43;
    public static final int IS_LIVE_FIELD_NUMBER = 32;
    public static final int IS_REPEATING_CONTEXT_FIELD_NUMBER = 42;
    public static final int IS_REPEATING_TRACK_FIELD_NUMBER = 41;
    public static final int IS_SHUFFLE_FIELD_NUMBER = 23;
    public static final int IS_VIDEO_ON_FIELD_NUMBER = 44;
    public static final int LIST_URI_FIELD_NUMBER = 57;
    public static final int MEDIA_ID_FIELD_NUMBER = 28;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 29;
    public static final int ON_DEMAND_TYPE_FIELD_NUMBER = 52;
    public static final int ORCHESTRATION_STACK_FIELD_NUMBER = 56;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 17;
    public static final int PARENT_PLAYBACK_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PLAYBACK_STACK_FIELD_NUMBER = 8;
    public static final int PLAYBACK_STACK_V2_FIELD_NUMBER = 46;
    public static final int PLAYBACK_START_TIME_FIELD_NUMBER = 30;
    public static final int PLAYER_SESSION_ID_FIELD_NUMBER = 47;
    public static final int PLAY_CONTEXT_DECISION_ID_FIELD_NUMBER = 39;
    public static final int PLAY_CONTEXT_FIELD_NUMBER = 5;
    public static final int PREVIEW_IMPRESSION_URI_FIELD_NUMBER = 48;
    public static final int PROVIDER_FIELD_NUMBER = 11;
    public static final int REASON_START_FIELD_NUMBER = 20;
    public static final int REFERRER_FIELD_NUMBER = 12;
    public static final int SOURCE_START_FIELD_NUMBER = 19;
    public static final int START_POSITION_FIELD_NUMBER = 31;
    public static final int STREAMING_RULE_FIELD_NUMBER = 15;
    public static final int VIDEO_SESSION_ID_FIELD_NUMBER = 4;
    public static final int VIDEO_SURFACE_V2_FIELD_NUMBER = 51;
    private String agenticProductType_;
    private StreamReportingAttributionOuterClass$StreamReportingAttribution attribution_;
    private int bitField0_;
    private boolean clientOffline_;
    private Timestamp clientTimestamp_;
    private ae50 configParams_;
    private String connectControllerDeviceId_;
    private boolean contentIsDownloaded_;
    private String contentUri_;
    private String customReportingAttribution_;
    private String decisionId_;
    private String displayedContentUri_;
    private String entrypointUri_;
    private String featureUuid_;
    private String interactionId_;
    private boolean isAudioOn_;
    private boolean isLive_;
    private boolean isRepeatingContext_;
    private boolean isRepeatingTrack_;
    private boolean isShuffle_;
    private boolean isVideoOn_;
    private String listUri_;
    private String mediaId_;
    private int mediaType_;
    private String onDemandType_;
    private int orchestrationStack_;
    private String pageInstanceId_;
    private gva parentPlaybackId_;
    private String playContextDecisionId_;
    private String playContext_;
    private gva playbackId_;
    private int playbackStackV2_;
    private int playbackStack_;
    private long playbackStartTime_;
    private String playerSessionId_;
    private String previewImpressionUri_;
    private String provider_;
    private int reasonStart_;
    private String referrer_;
    private String sourceStart_;
    private long startPosition_;
    private int streamingRule_;
    private String videoSessionId_;
    private int videoSurfaceV2_;

    static {
        StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest = new StreamStartRequestOuterClass$StreamStartRequest();
        DEFAULT_INSTANCE = streamStartRequestOuterClass$StreamStartRequest;
        AbstractC0269h.registerDefaultInstance(StreamStartRequestOuterClass$StreamStartRequest.class, streamStartRequestOuterClass$StreamStartRequest);
    }

    private StreamStartRequestOuterClass$StreamStartRequest() {
        cva cvaVar = gva.f84678b;
        this.playbackId_ = cvaVar;
        this.parentPlaybackId_ = cvaVar;
        this.videoSessionId_ = "";
        this.playContext_ = "";
        this.contentUri_ = "";
        this.displayedContentUri_ = "";
        this.provider_ = "";
        this.referrer_ = "";
        this.connectControllerDeviceId_ = "";
        this.pageInstanceId_ = "";
        this.interactionId_ = "";
        this.sourceStart_ = "";
        this.mediaId_ = "";
        this.featureUuid_ = "";
        this.decisionId_ = "";
        this.customReportingAttribution_ = "";
        this.playContextDecisionId_ = "";
        this.playerSessionId_ = "";
        this.previewImpressionUri_ = "";
        this.configParams_ = AbstractC0269h.emptyProtobufList();
        this.onDemandType_ = "";
        this.entrypointUri_ = "";
        this.agenticProductType_ = "";
        this.listUri_ = "";
    }

    /* JADX INFO: renamed from: A */
    public static void m21656A(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 8;
        streamStartRequestOuterClass$StreamStartRequest.isAudioOn_ = z;
    }

    /* JADX INFO: renamed from: B */
    public static void m21657B(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.isLive_ = z;
    }

    /* JADX INFO: renamed from: C */
    public static void m21658C(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.isShuffle_ = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m21659D(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.isVideoOn_ = z;
    }

    /* JADX INFO: renamed from: E */
    public static void m21660E(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.mediaId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m21661F(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, dyd0 dyd0Var) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.mediaType_ = dyd0Var.getNumber();
    }

    /* JADX INFO: renamed from: G */
    public static void m21662G(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 128;
        streamStartRequestOuterClass$StreamStartRequest.onDemandType_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m21663H(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, pvl0 pvl0Var) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.orchestrationStack_ = pvl0Var.getNumber();
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 1024;
    }

    /* JADX INFO: renamed from: I */
    public static void m21664I(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m21665J(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playContext_ = str;
    }

    /* JADX INFO: renamed from: K */
    public static void m21666K(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playContextDecisionId_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m21667L(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, cva cvaVar) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: M */
    public static void m21668M(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playbackStack_ = q3p0.BETAMAX.getNumber();
    }

    /* JADX INFO: renamed from: N */
    public static void m21669N(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, long j) {
        streamStartRequestOuterClass$StreamStartRequest.playbackStartTime_ = j;
    }

    /* JADX INFO: renamed from: O */
    public static void m21670O(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playerSessionId_ = str;
    }

    /* JADX INFO: renamed from: P */
    public static void m21671P(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 32;
        streamStartRequestOuterClass$StreamStartRequest.previewImpressionUri_ = str;
    }

    /* JADX INFO: renamed from: Q */
    public static void m21672Q(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.provider_ = str;
    }

    /* JADX INFO: renamed from: R */
    public static void m21673R(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, tqo0 tqo0Var) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.reasonStart_ = tqo0Var.getNumber();
    }

    /* JADX INFO: renamed from: S */
    public static void m21674S(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.referrer_ = str;
    }

    /* JADX INFO: renamed from: T */
    public static void m21675T(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, long j) {
        streamStartRequestOuterClass$StreamStartRequest.startPosition_ = j;
    }

    /* JADX INFO: renamed from: U */
    public static void m21676U(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, uk51 uk51Var) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.streamingRule_ = uk51Var.getNumber();
    }

    /* JADX INFO: renamed from: V */
    public static void m21677V(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        str.getClass();
        streamStartRequestOuterClass$StreamStartRequest.videoSessionId_ = str;
    }

    /* JADX INFO: renamed from: W */
    public static void m21678W(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, jac1 jac1Var) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.videoSurfaceV2_ = jac1Var.getNumber();
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: X */
    public static sj51 m21679X() {
        return (sj51) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m21680n(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        ae50 ae50Var = streamStartRequestOuterClass$StreamStartRequest.configParams_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            streamStartRequestOuterClass$StreamStartRequest.configParams_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        streamStartRequestOuterClass$StreamStartRequest.configParams_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m21681o(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.playbackId_ = DEFAULT_INSTANCE.playbackId_;
    }

    /* JADX INFO: renamed from: p */
    public static void m21682p(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.attribution_ = streamReportingAttributionOuterClass$StreamReportingAttribution;
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 4096;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21683q(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.clientOffline_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21684r(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, Timestamp timestamp) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.clientTimestamp_ = timestamp;
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m21685s(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.connectControllerDeviceId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m21686t(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, boolean z) {
        streamStartRequestOuterClass$StreamStartRequest.contentIsDownloaded_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m21687u(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.contentUri_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m21688v(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.customReportingAttribution_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m21689w(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.decisionId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m21690x(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.bitField0_ |= 256;
        streamStartRequestOuterClass$StreamStartRequest.entrypointUri_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m21691y(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.featureUuid_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m21692z(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, String str) {
        streamStartRequestOuterClass$StreamStartRequest.getClass();
        streamStartRequestOuterClass$StreamStartRequest.interactionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000+\u0000\u0001\u0001:+\u0000\u0001\u0000\u0001\n\u0002\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\f\u000bȈ\fȈ\u000f\f\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014\f\u0017\u0007\u001cȈ\u001d\f\u001e\u0003\u001f\u0003 \u0007!\u0007\"\u0007$Ȉ%Ȉ&Ȉ'Ȉ(ဉ\u0000)ဇ\u0001*ဇ\u0002+ဇ\u0003,\u0007.ဌ\u0004/Ȉ0ለ\u00051Ț3ဌ\u00064ለ\u00075ለ\b7ለ\t8ဌ\n9ለ\u000b:ဉ\f", new Object[]{"bitField0_", "playbackId_", "parentPlaybackId_", "videoSessionId_", "playContext_", "contentUri_", "displayedContentUri_", "playbackStack_", "provider_", "referrer_", "streamingRule_", "connectControllerDeviceId_", "pageInstanceId_", "interactionId_", "sourceStart_", "reasonStart_", "isShuffle_", "mediaId_", "mediaType_", "playbackStartTime_", "startPosition_", "isLive_", "contentIsDownloaded_", "clientOffline_", "featureUuid_", "decisionId_", "customReportingAttribution_", "playContextDecisionId_", "clientTimestamp_", "isRepeatingTrack_", "isRepeatingContext_", "isAudioOn_", "isVideoOn_", "playbackStackV2_", "playerSessionId_", "previewImpressionUri_", "configParams_", "videoSurfaceV2_", "onDemandType_", "entrypointUri_", "agenticProductType_", "orchestrationStack_", "listUri_", "attribution_"});
        }
        if (iOrdinal == 3) {
            return new StreamStartRequestOuterClass$StreamStartRequest();
        }
        if (iOrdinal == 4) {
            return new sj51(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (StreamStartRequestOuterClass$StreamStartRequest.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
