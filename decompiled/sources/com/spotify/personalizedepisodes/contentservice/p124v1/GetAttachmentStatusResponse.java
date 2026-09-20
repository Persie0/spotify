package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tp6;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAttachmentStatusResponse extends AbstractC0269h implements sre0 {
    private static final GetAttachmentStatusResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContentServiceError error_;
    private int status_;

    static {
        GetAttachmentStatusResponse getAttachmentStatusResponse = new GetAttachmentStatusResponse();
        DEFAULT_INSTANCE = getAttachmentStatusResponse;
        AbstractC0269h.registerDefaultInstance(GetAttachmentStatusResponse.class, getAttachmentStatusResponse);
    }

    private GetAttachmentStatusResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetAttachmentStatusResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 0);
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
        synchronized (GetAttachmentStatusResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ContentServiceError m17415n() {
        ContentServiceError contentServiceError = this.error_;
        return contentServiceError == null ? ContentServiceError.m17372n() : contentServiceError;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final tp6 m17416o() {
        tp6 tp6Var;
        int i = this.status_;
        if (i == 0) {
            tp6Var = tp6.ATTACHMENT_VALIDATION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            tp6Var = tp6.ATTACHMENT_VALIDATION_STATUS_PENDING;
        } else if (i != 2) {
            tp6Var = i != 3 ? null : tp6.ATTACHMENT_VALIDATION_STATUS_REJECTED;
        } else {
            tp6Var = tp6.ATTACHMENT_VALIDATION_STATUS_SAFE;
        }
        return tp6Var == null ? tp6.UNRECOGNIZED : tp6Var;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17417p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
