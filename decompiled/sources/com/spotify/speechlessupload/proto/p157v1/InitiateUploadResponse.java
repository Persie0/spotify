package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes10.dex */
public final class InitiateUploadResponse extends AbstractC0269h implements sre0 {
    private static final InitiateUploadResponse DEFAULT_INSTANCE;
    public static final int FILE_UPLOAD_URLS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VALIDITY_HOURS_FIELD_NUMBER = 2;
    private ae50 fileUploadUrls_ = AbstractC0269h.emptyProtobufList();
    private int validityHours_;

    static {
        InitiateUploadResponse initiateUploadResponse = new InitiateUploadResponse();
        DEFAULT_INSTANCE = initiateUploadResponse;
        AbstractC0269h.registerDefaultInstance(InitiateUploadResponse.class, initiateUploadResponse);
    }

    private InitiateUploadResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u0004\u0003\u001b", new Object[]{"validityHours_", "fileUploadUrls_", FileUploadUrls.class});
        }
        if (iOrdinal == 3) {
            return new InitiateUploadResponse();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 8);
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
        synchronized (InitiateUploadResponse.class) {
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
    public final ae50 m21509n() {
        return this.fileUploadUrls_;
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
