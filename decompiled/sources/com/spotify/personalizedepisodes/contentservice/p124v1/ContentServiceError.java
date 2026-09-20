package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;
import p204p.zfw;

/* JADX INFO: loaded from: classes9.dex */
public final class ContentServiceError extends AbstractC0269h implements sre0 {
    private static final ContentServiceError DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int errorReason_;
    private String reason_ = "";
    private String message_ = "";

    static {
        ContentServiceError contentServiceError = new ContentServiceError();
        DEFAULT_INSTANCE = contentServiceError;
        AbstractC0269h.registerDefaultInstance(ContentServiceError.class, contentServiceError);
    }

    private ContentServiceError() {
    }

    /* JADX INFO: renamed from: n */
    public static ContentServiceError m17372n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ContentServiceError m17373q(byte[] bArr) {
        return (ContentServiceError) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"reason_", "message_", "errorReason_"});
        }
        if (iOrdinal == 3) {
            return new ContentServiceError();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 24);
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
        synchronized (ContentServiceError.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final zfw m17374o() {
        zfw zfwVar;
        switch (this.errorReason_) {
            case 0:
                zfwVar = zfw.ERROR_REASON_UNSPECIFIED;
                break;
            case 1:
                zfwVar = zfw.ERROR_REASON_PROMPT_REJECTED;
                break;
            case 2:
                zfwVar = zfw.ERROR_REASON_ATTACHMENT_REJECTED;
                break;
            case 3:
                zfwVar = zfw.ERROR_REASON_ATTACHMENT_NOT_VALIDATED;
                break;
            case 4:
                zfwVar = zfw.ERROR_REASON_NO_CREDITS;
                break;
            case 5:
                zfwVar = zfw.ERROR_REASON_GENERATION_NOT_FOUND;
                break;
            case 6:
                zfwVar = zfw.ERROR_REASON_INVALID_VOICE;
                break;
            case 7:
                zfwVar = zfw.ERROR_REASON_INVALID_SCHEDULE;
                break;
            default:
                zfwVar = null;
                break;
        }
        return zfwVar == null ? zfw.UNRECOGNIZED : zfwVar;
    }

    /* JADX INFO: renamed from: p */
    public final String m17375p() {
        return this.reason_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
