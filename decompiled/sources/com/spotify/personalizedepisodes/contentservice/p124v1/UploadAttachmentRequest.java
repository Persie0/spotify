package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class UploadAttachmentRequest extends AbstractC0269h implements sre0 {
    public static final int CHARACTER_COUNT_FIELD_NUMBER = 4;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    private static final UploadAttachmentRequest DEFAULT_INSTANCE;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 2;
    public static final int IMAGE_METADATA_FIELD_NUMBER = 6;
    public static final int PAGE_COUNT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PDF_METADATA_FIELD_NUMBER = 5;
    private int bitField0_;
    private int characterCount_;
    private long fileSizeBytes_;
    private Object metadata_;
    private int pageCount_;
    private int metadataCase_ = 0;
    private String contentType_ = "";

    static {
        UploadAttachmentRequest uploadAttachmentRequest = new UploadAttachmentRequest();
        DEFAULT_INSTANCE = uploadAttachmentRequest;
        AbstractC0269h.registerDefaultInstance(UploadAttachmentRequest.class, uploadAttachmentRequest);
    }

    private UploadAttachmentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17535n(UploadAttachmentRequest uploadAttachmentRequest, String str) {
        uploadAttachmentRequest.getClass();
        uploadAttachmentRequest.contentType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m17536o(UploadAttachmentRequest uploadAttachmentRequest, long j) {
        uploadAttachmentRequest.fileSizeBytes_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m17537p(UploadAttachmentRequest uploadAttachmentRequest, ImageAttachmentMetadata imageAttachmentMetadata) {
        uploadAttachmentRequest.getClass();
        imageAttachmentMetadata.getClass();
        uploadAttachmentRequest.metadata_ = imageAttachmentMetadata;
        uploadAttachmentRequest.metadataCase_ = 6;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17538q(UploadAttachmentRequest uploadAttachmentRequest, PdfAttachmentMetadata pdfAttachmentMetadata) {
        uploadAttachmentRequest.getClass();
        pdfAttachmentMetadata.getClass();
        uploadAttachmentRequest.metadata_ = pdfAttachmentMetadata;
        uploadAttachmentRequest.metadataCase_ = 5;
    }

    /* JADX INFO: renamed from: r */
    public static eea1 m17539r() {
        return (eea1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003င\u0000\u0004င\u0001\u0005<\u0000\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "bitField0_", "contentType_", "fileSizeBytes_", "pageCount_", "characterCount_", PdfAttachmentMetadata.class, ImageAttachmentMetadata.class});
        }
        if (iOrdinal == 3) {
            return new UploadAttachmentRequest();
        }
        if (iOrdinal == 4) {
            return new eea1(DEFAULT_INSTANCE);
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
        synchronized (UploadAttachmentRequest.class) {
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
