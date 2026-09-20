package com.spotify.settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsOuterClass$SettingsState extends AbstractC0269h implements sre0 {
    public static final int ALLOW_AUDIO_QUALITY_DOWNGRADE_FIELD_NUMBER = 8;
    public static final int AUTOMIX_FIELD_NUMBER = 12;
    public static final int CROSSFADE_FIELD_NUMBER = 15;
    public static final int CROSSFADE_TIME_SECONDS_FIELD_NUMBER = 16;
    public static final int CROSSFEED_FIELD_NUMBER = 29;
    public static final int CROSSFEED_INTENSITY_FIELD_NUMBER = 30;
    private static final SettingsOuterClass$SettingsState DEFAULT_INSTANCE;
    public static final int DOWNLOAD_OVER_3G_FIELD_NUMBER = 4;
    public static final int DOWNLOAD_PREFERRED_RESOURCE_TYPE_FIELD_NUMBER = 20;
    public static final int DOWNLOAD_QUALITY_FIELD_NUMBER = 5;
    public static final int DOWNMIX_FIELD_NUMBER = 22;
    public static final int GAPLESS_FIELD_NUMBER = 11;
    public static final int LOCAL_DEVICES_ONLY_FIELD_NUMBER = 18;
    public static final int LOUDNESS_ENVIRONMENT_FIELD_NUMBER = 14;
    public static final int NORMALIZE_FIELD_NUMBER = 13;
    public static final int OFFLINE_MODE_FIELD_NUMBER = 1;
    public static final int OTFN_FIELD_NUMBER = 25;
    public static final int PARROT_FIELD_NUMBER = 27;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 26;
    public static final int PLAY_EXPLICIT_CONTENT_FIELD_NUMBER = 2;
    public static final int PRIVATE_SESSION_FIELD_NUMBER = 3;
    public static final int SHOW_UNAVAILABLE_TRACKS_FIELD_NUMBER = 17;
    public static final int SHUFFLE_MODE_FIELD_NUMBER = 28;
    public static final int STREAM_NON_METERED_QUALITY_FIELD_NUMBER = 7;
    public static final int STREAM_QUALITY_FIELD_NUMBER = 6;
    public static final int TRIM_SILENCE_FIELD_NUMBER = 21;
    public static final int WEBGATE_URL_FIELD_NUMBER = 19;
    private boolean allowAudioQualityDowngrade_;
    private boolean automix_;
    private int crossfadeTimeSeconds_;
    private boolean crossfade_;
    private int crossfeedIntensity_;
    private boolean crossfeed_;
    private boolean downloadOver3G_;
    private int downloadPreferredResourceType_;
    private int downloadQuality_;
    private boolean downmix_;
    private boolean gapless_;
    private boolean localDevicesOnly_;
    private int loudnessEnvironment_;
    private boolean normalize_;
    private boolean offlineMode_;
    private boolean otfn_;
    private boolean parrot_;
    private boolean playExplicitContent_;
    private int playbackSpeed_;
    private boolean privateSession_;
    private boolean showUnavailableTracks_;
    private int streamNonMeteredQuality_;
    private int streamQuality_;
    private boolean trimSilence_;
    private String webgateUrl_ = "";
    private String shuffleMode_ = "";

    static {
        SettingsOuterClass$SettingsState settingsOuterClass$SettingsState = new SettingsOuterClass$SettingsState();
        DEFAULT_INSTANCE = settingsOuterClass$SettingsState;
        AbstractC0269h.registerDefaultInstance(SettingsOuterClass$SettingsState.class, settingsOuterClass$SettingsState);
    }

    private SettingsOuterClass$SettingsState() {
    }

    /* JADX INFO: renamed from: L */
    public static SettingsOuterClass$SettingsState m20947L(byte[] bArr) {
        return (SettingsOuterClass$SettingsState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final int m20949A() {
        return this.loudnessEnvironment_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m20950B() {
        return this.normalize_;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m20951C() {
        return this.offlineMode_;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m20952D() {
        return this.otfn_;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m20953E() {
        return this.parrot_;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m20954F() {
        return this.playExplicitContent_;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m20955G() {
        return this.privateSession_;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m20956H() {
        return this.showUnavailableTracks_;
    }

    /* JADX INFO: renamed from: I */
    public final int m20957I() {
        return this.streamNonMeteredQuality_;
    }

    /* JADX INFO: renamed from: J */
    public final int m20958J() {
        return this.streamQuality_;
    }

    /* JADX INFO: renamed from: K */
    public final String m20959K() {
        return this.webgateUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001e\u001a\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0004\u0006\u0004\u0007\u0004\b\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0004\u000f\u0007\u0010\u0004\u0011\u0007\u0012\u0007\u0013Ȉ\u0014\u0004\u0015\u0007\u0016\u0007\u0019\u0007\u001a\u0004\u001b\u0007\u001cȈ\u001d\u0007\u001e\u0004", new Object[]{"offlineMode_", "playExplicitContent_", "privateSession_", "downloadOver3G_", "downloadQuality_", "streamQuality_", "streamNonMeteredQuality_", "allowAudioQualityDowngrade_", "gapless_", "automix_", "normalize_", "loudnessEnvironment_", "crossfade_", "crossfadeTimeSeconds_", "showUnavailableTracks_", "localDevicesOnly_", "webgateUrl_", "downloadPreferredResourceType_", "trimSilence_", "downmix_", "otfn_", "playbackSpeed_", "parrot_", "shuffleMode_", "crossfeed_", "crossfeedIntensity_"});
        }
        if (iOrdinal == 3) {
            return new SettingsOuterClass$SettingsState();
        }
        if (iOrdinal == 4) {
            return new h8z0(28);
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
        synchronized (SettingsOuterClass$SettingsState.class) {
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

    /* JADX INFO: renamed from: o */
    public final boolean m20960o() {
        return this.allowAudioQualityDowngrade_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20961p() {
        return this.automix_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20962q() {
        return this.crossfade_;
    }

    /* JADX INFO: renamed from: r */
    public final int m20963r() {
        return this.crossfadeTimeSeconds_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20964s() {
        return this.crossfeed_;
    }

    /* JADX INFO: renamed from: t */
    public final int m20965t() {
        return this.crossfeedIntensity_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20966u() {
        return this.downloadOver3G_;
    }

    /* JADX INFO: renamed from: v */
    public final int m20967v() {
        return this.downloadPreferredResourceType_;
    }

    /* JADX INFO: renamed from: w */
    public final int m20968w() {
        return this.downloadQuality_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20969x() {
        return this.downmix_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m20970y() {
        return this.gapless_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20971z() {
        return this.localDevicesOnly_;
    }
}
