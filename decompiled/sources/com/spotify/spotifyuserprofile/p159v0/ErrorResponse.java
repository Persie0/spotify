package com.spotify.spotifyuserprofile.p159v0;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zdw;

/* JADX INFO: loaded from: classes10.dex */
public final class ErrorResponse extends AbstractC0269h implements sre0 {
    private static final ErrorResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int errorCode_;
    private String errorMessage_ = "";

    static {
        ErrorResponse errorResponse = new ErrorResponse();
        DEFAULT_INSTANCE = errorResponse;
        AbstractC0269h.registerDefaultInstance(ErrorResponse.class, errorResponse);
    }

    private ErrorResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static ErrorResponse m21556n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new ErrorResponse();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 14);
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
        synchronized (ErrorResponse.class) {
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
    public final zdw m21557o() {
        zdw zdwVar;
        switch (this.errorCode_) {
            case 0:
                zdwVar = zdw.ERROR_CODE_UNSPECIFIED;
                break;
            case 1:
                zdwVar = zdw.INVALID_REQUEST;
                break;
            case 2:
                zdwVar = zdw.NOTE_NOT_FOUND;
                break;
            case 3:
                zdwVar = zdw.POLICY_VIOLATION;
                break;
            case 4:
                zdwVar = zdw.UNAUTHORIZED;
                break;
            case 5:
                zdwVar = zdw.CONTENT_TOO_LONG;
                break;
            case 6:
                zdwVar = zdw.MAX_NOTES_REACHED;
                break;
            default:
                zdwVar = null;
                break;
        }
        return zdwVar == null ? zdw.UNRECOGNIZED : zdwVar;
    }

    /* JADX INFO: renamed from: p */
    public final String m21558p() {
        return this.errorMessage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
