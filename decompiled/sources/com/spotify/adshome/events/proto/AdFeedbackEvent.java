package com.spotify.adshome.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.do0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdFeedbackEvent extends AbstractC0269h implements sre0 {
    public static final int ADVERTISER_FIELD_NUMBER = 5;
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final AdFeedbackEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 12;
    public static final int FORMAT_FIELD_NUMBER = 9;
    public static final int IMAGE_URL_FIELD_NUMBER = 10;
    public static final int LINE_ITEM_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_FILES_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 14;
    public static final int PROGRESS_FIELD_NUMBER = 8;
    public static final int SLOT_FIELD_NUMBER = 13;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int VOLUME_FIELD_NUMBER = 7;
    private int bitField0_;
    private long progress_;
    private double volume_;
    private String lineItemId_ = "";
    private String creativeId_ = "";
    private String adPlaybackId_ = "";
    private String adId_ = "";
    private String advertiser_ = "";
    private String title_ = "";
    private String format_ = "";
    private String imageUrl_ = "";
    private String mediaFiles_ = "";
    private String event_ = "";
    private String slot_ = "";
    private String productName_ = "";

    static {
        AdFeedbackEvent adFeedbackEvent = new AdFeedbackEvent();
        DEFAULT_INSTANCE = adFeedbackEvent;
        AbstractC0269h.registerDefaultInstance(AdFeedbackEvent.class, adFeedbackEvent);
    }

    private AdFeedbackEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2822n(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 8;
        adFeedbackEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2823o(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 4;
        adFeedbackEvent.adPlaybackId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2824p(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 16;
        adFeedbackEvent.advertiser_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2825q(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 2;
        adFeedbackEvent.creativeId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2826r(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        adFeedbackEvent.bitField0_ |= 2048;
        adFeedbackEvent.event_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2827s(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 256;
        adFeedbackEvent.format_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2828t(AdFeedbackEvent adFeedbackEvent, String str) {
        adFeedbackEvent.getClass();
        str.getClass();
        adFeedbackEvent.bitField0_ |= 1;
        adFeedbackEvent.lineItemId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static do0 m2829u() {
        return (do0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007က\u0006\bဂ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"bitField0_", "lineItemId_", "creativeId_", "adPlaybackId_", "adId_", "advertiser_", "title_", "volume_", "progress_", "format_", "imageUrl_", "mediaFiles_", "event_", "slot_", "productName_"});
        }
        if (iOrdinal == 3) {
            return new AdFeedbackEvent();
        }
        if (iOrdinal == 4) {
            return new do0(DEFAULT_INSTANCE);
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
        synchronized (AdFeedbackEvent.class) {
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
