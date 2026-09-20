package com.spotify.share.chatpreviews.core.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadChatPreviewRequest extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final UploadChatPreviewRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_FIELD_NUMBER = 3;
    public static final int STICKER_FIELD_NUMBER = 2;
    private UploadBackground background_;
    private int bitField0_;
    private String entityUri_ = "";
    private ShareFormat shareFormat_;
    private UploadImage sticker_;

    static {
        UploadChatPreviewRequest uploadChatPreviewRequest = new UploadChatPreviewRequest();
        DEFAULT_INSTANCE = uploadChatPreviewRequest;
        AbstractC0269h.registerDefaultInstance(UploadChatPreviewRequest.class, uploadChatPreviewRequest);
    }

    private UploadChatPreviewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20987n(UploadChatPreviewRequest uploadChatPreviewRequest, UploadBackground uploadBackground) {
        uploadChatPreviewRequest.getClass();
        uploadBackground.getClass();
        uploadChatPreviewRequest.background_ = uploadBackground;
        uploadChatPreviewRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m20988o(UploadChatPreviewRequest uploadChatPreviewRequest, String str) {
        uploadChatPreviewRequest.getClass();
        str.getClass();
        uploadChatPreviewRequest.entityUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20989p(UploadChatPreviewRequest uploadChatPreviewRequest, ShareFormat shareFormat) {
        uploadChatPreviewRequest.getClass();
        shareFormat.getClass();
        uploadChatPreviewRequest.shareFormat_ = shareFormat;
        uploadChatPreviewRequest.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20990q(UploadChatPreviewRequest uploadChatPreviewRequest, UploadImage uploadImage) {
        uploadChatPreviewRequest.getClass();
        uploadImage.getClass();
        uploadChatPreviewRequest.sticker_ = uploadImage;
        uploadChatPreviewRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static jea1 m20991r() {
        return (jea1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "background_", "sticker_", "shareFormat_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new UploadChatPreviewRequest();
        }
        if (iOrdinal == 4) {
            return new jea1(DEFAULT_INSTANCE);
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
        synchronized (UploadChatPreviewRequest.class) {
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
