package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UnshortenUrlResponseData extends AbstractC0269h implements sre0 {
    public static final int ANDROID_DEEPLINK_PATH_FIELD_NUMBER = 20;
    public static final int CANONICAL_URL_FIELD_NUMBER = 22;
    public static final int CREATION_SOURCE_FIELD_NUMBER = 8;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 1;
    public static final int DEEPLINK_PATH_FIELD_NUMBER = 4;
    private static final UnshortenUrlResponseData DEFAULT_INSTANCE;
    public static final int DESKTOP_URL_FIELD_NUMBER = 5;
    public static final int FALLBACK_URL_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int LINK_TYPE_FIELD_NUMBER = 21;
    public static final int OG_APP_ID_FIELD_NUMBER = 19;
    public static final int OG_AUDIO_FIELD_NUMBER = 12;
    public static final int OG_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int OG_IMAGE_URL_FIELD_NUMBER = 11;
    public static final int OG_MUSIC_FIELD_NUMBER = 23;
    public static final int OG_TITLE_FIELD_NUMBER = 9;
    public static final int OG_TYPE_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_ID_FIELD_NUMBER = 6;
    public static final int TWITTER_CARD_FIELD_NUMBER = 16;
    public static final int TWITTER_DESCRIPTION_FIELD_NUMBER = 15;
    public static final int TWITTER_SITE_FIELD_NUMBER = 17;
    public static final int TWITTER_TITLE_FIELD_NUMBER = 14;
    public static final int URI_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 18;
    private int bitField0_;
    private int creationSource_;
    private OgMusic ogMusic_;
    private ae50 customData_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";
    private String fallbackUrl_ = "";
    private String deeplinkPath_ = "";
    private String desktopUrl_ = "";
    private String shareId_ = "";
    private String id_ = "";
    private String ogTitle_ = "";
    private String ogDescription_ = "";
    private String ogImageUrl_ = "";
    private String ogAudio_ = "";
    private String ogType_ = "";
    private String twitterTitle_ = "";
    private String twitterDescription_ = "";
    private String twitterCard_ = "";
    private String twitterSite_ = "";
    private String url_ = "";
    private String ogAppId_ = "";
    private String androidDeeplinkPath_ = "";
    private String linkType_ = "";
    private String canonicalUrl_ = "";

    static {
        UnshortenUrlResponseData unshortenUrlResponseData = new UnshortenUrlResponseData();
        DEFAULT_INSTANCE = unshortenUrlResponseData;
        AbstractC0269h.registerDefaultInstance(UnshortenUrlResponseData.class, unshortenUrlResponseData);
    }

    private UnshortenUrlResponseData() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static UnshortenUrlResponseData m21036s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final OgMusic m21037A() {
        OgMusic ogMusic = this.ogMusic_;
        return ogMusic == null ? OgMusic.m21025n() : ogMusic;
    }

    /* JADX INFO: renamed from: B */
    public final String m21038B() {
        return this.ogTitle_;
    }

    /* JADX INFO: renamed from: C */
    public final String m21039C() {
        return this.ogType_;
    }

    /* JADX INFO: renamed from: D */
    public final String m21040D() {
        return this.twitterCard_;
    }

    /* JADX INFO: renamed from: E */
    public final String m21041E() {
        return this.twitterDescription_;
    }

    /* JADX INFO: renamed from: F */
    public final String m21042F() {
        return this.twitterSite_;
    }

    /* JADX INFO: renamed from: G */
    public final String m21043G() {
        return this.twitterTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017ဉ\u0000", new Object[]{"bitField0_", "customData_", CustomData.class, "uri_", "fallbackUrl_", "deeplinkPath_", "desktopUrl_", "shareId_", "id_", "creationSource_", "ogTitle_", "ogDescription_", "ogImageUrl_", "ogAudio_", "ogType_", "twitterTitle_", "twitterDescription_", "twitterCard_", "twitterSite_", "url_", "ogAppId_", "androidDeeplinkPath_", "linkType_", "canonicalUrl_", "ogMusic_"});
        }
        if (iOrdinal == 3) {
            return new UnshortenUrlResponseData();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 21);
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
        synchronized (UnshortenUrlResponseData.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getShareId() {
        return this.shareId_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final String m21044n() {
        return this.androidDeeplinkPath_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21045o() {
        return this.canonicalUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final int m21046p() {
        return this.creationSource_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m21047q() {
        return this.customData_;
    }

    /* JADX INFO: renamed from: r */
    public final String m21048r() {
        return this.deeplinkPath_;
    }

    /* JADX INFO: renamed from: t */
    public final String m21049t() {
        return this.desktopUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m21050u() {
        return this.fallbackUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final String m21051v() {
        return this.linkType_;
    }

    /* JADX INFO: renamed from: w */
    public final String m21052w() {
        return this.ogAppId_;
    }

    /* JADX INFO: renamed from: x */
    public final String m21053x() {
        return this.ogAudio_;
    }

    /* JADX INFO: renamed from: y */
    public final String m21054y() {
        return this.ogDescription_;
    }

    /* JADX INFO: renamed from: z */
    public final String m21055z() {
        return this.ogImageUrl_;
    }
}
