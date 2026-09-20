package com.spotify.share.linkpreview.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ufa1;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLinkPreviewFields extends AbstractC0269h implements sre0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 4;
    private static final UploadLinkPreviewFields DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TWITTER_CARD_FIELD_NUMBER = 5;
    public static final int VIDEO_URL_FIELD_NUMBER = 3;
    private int bitField0_;
    private String title_ = "";
    private String description_ = "";
    private String videoUrl_ = "";
    private String audioUrl_ = "";
    private String twitterCard_ = "";

    static {
        UploadLinkPreviewFields uploadLinkPreviewFields = new UploadLinkPreviewFields();
        DEFAULT_INSTANCE = uploadLinkPreviewFields;
        AbstractC0269h.registerDefaultInstance(UploadLinkPreviewFields.class, uploadLinkPreviewFields);
    }

    private UploadLinkPreviewFields() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21069n(UploadLinkPreviewFields uploadLinkPreviewFields, String str) {
        uploadLinkPreviewFields.getClass();
        str.getClass();
        uploadLinkPreviewFields.bitField0_ |= 8;
        uploadLinkPreviewFields.audioUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21070o(UploadLinkPreviewFields uploadLinkPreviewFields, String str) {
        uploadLinkPreviewFields.getClass();
        str.getClass();
        uploadLinkPreviewFields.bitField0_ |= 2;
        uploadLinkPreviewFields.description_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21071p(UploadLinkPreviewFields uploadLinkPreviewFields, String str) {
        uploadLinkPreviewFields.getClass();
        str.getClass();
        uploadLinkPreviewFields.bitField0_ |= 1;
        uploadLinkPreviewFields.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21072q(UploadLinkPreviewFields uploadLinkPreviewFields, String str) {
        uploadLinkPreviewFields.getClass();
        str.getClass();
        uploadLinkPreviewFields.bitField0_ |= 16;
        uploadLinkPreviewFields.twitterCard_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21073r(UploadLinkPreviewFields uploadLinkPreviewFields, String str) {
        uploadLinkPreviewFields.getClass();
        str.getClass();
        uploadLinkPreviewFields.bitField0_ |= 4;
        uploadLinkPreviewFields.videoUrl_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ufa1 m21074s() {
        return (ufa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "title_", "description_", "videoUrl_", "audioUrl_", "twitterCard_"});
        }
        if (iOrdinal == 3) {
            return new UploadLinkPreviewFields();
        }
        if (iOrdinal == 4) {
            return new ufa1(DEFAULT_INSTANCE);
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
        synchronized (UploadLinkPreviewFields.class) {
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
