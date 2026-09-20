package com.spotify.share.linkpreview.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.m501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetLinkPreviewRequest extends AbstractC0269h implements sre0 {
    private static final SetLinkPreviewRequest DEFAULT_INSTANCE;
    public static final int IMAGE_UPLOAD_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int LINK_PREVIEW_FIELDS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int imageCase_ = 0;
    private Object image_;
    private UploadLinkPreviewFields linkPreviewFields_;

    static {
        SetLinkPreviewRequest setLinkPreviewRequest = new SetLinkPreviewRequest();
        DEFAULT_INSTANCE = setLinkPreviewRequest;
        AbstractC0269h.registerDefaultInstance(SetLinkPreviewRequest.class, setLinkPreviewRequest);
    }

    private SetLinkPreviewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21065n(SetLinkPreviewRequest setLinkPreviewRequest, Image image) {
        setLinkPreviewRequest.getClass();
        image.getClass();
        setLinkPreviewRequest.image_ = image;
        setLinkPreviewRequest.imageCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21066o(SetLinkPreviewRequest setLinkPreviewRequest, String str) {
        setLinkPreviewRequest.getClass();
        str.getClass();
        setLinkPreviewRequest.imageCase_ = 2;
        setLinkPreviewRequest.image_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21067p(SetLinkPreviewRequest setLinkPreviewRequest, UploadLinkPreviewFields uploadLinkPreviewFields) {
        setLinkPreviewRequest.getClass();
        uploadLinkPreviewFields.getClass();
        setLinkPreviewRequest.linkPreviewFields_ = uploadLinkPreviewFields;
        setLinkPreviewRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static m501 m21068q() {
        return (m501) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000", new Object[]{"image_", "imageCase_", "bitField0_", Image.class, "linkPreviewFields_"});
        }
        if (iOrdinal == 3) {
            return new SetLinkPreviewRequest();
        }
        if (iOrdinal == 4) {
            return new m501(DEFAULT_INSTANCE);
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
        synchronized (SetLinkPreviewRequest.class) {
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
