package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dhn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PdfAttachmentMetadata extends AbstractC0269h implements sre0 {
    public static final int CHARACTER_COUNT_FIELD_NUMBER = 2;
    private static final PdfAttachmentMetadata DEFAULT_INSTANCE;
    public static final int PAGE_COUNT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int characterCount_;
    private int pageCount_;

    static {
        PdfAttachmentMetadata pdfAttachmentMetadata = new PdfAttachmentMetadata();
        DEFAULT_INSTANCE = pdfAttachmentMetadata;
        AbstractC0269h.registerDefaultInstance(PdfAttachmentMetadata.class, pdfAttachmentMetadata);
    }

    private PdfAttachmentMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17431n(PdfAttachmentMetadata pdfAttachmentMetadata, int i) {
        pdfAttachmentMetadata.bitField0_ |= 2;
        pdfAttachmentMetadata.characterCount_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m17432o(PdfAttachmentMetadata pdfAttachmentMetadata, int i) {
        pdfAttachmentMetadata.bitField0_ |= 1;
        pdfAttachmentMetadata.pageCount_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static dhn0 m17433p() {
        return (dhn0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "pageCount_", "characterCount_"});
        }
        if (iOrdinal == 3) {
            return new PdfAttachmentMetadata();
        }
        if (iOrdinal == 4) {
            return new dhn0(DEFAULT_INSTANCE);
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
        synchronized (PdfAttachmentMetadata.class) {
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
