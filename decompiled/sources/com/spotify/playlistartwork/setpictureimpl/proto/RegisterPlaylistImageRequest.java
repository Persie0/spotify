package com.spotify.playlistartwork.setpictureimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yrv0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class RegisterPlaylistImageRequest extends AbstractC0269h implements sre0 {
    private static final RegisterPlaylistImageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UPLOAD_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String uploadToken_ = "";

    static {
        RegisterPlaylistImageRequest registerPlaylistImageRequest = new RegisterPlaylistImageRequest();
        DEFAULT_INSTANCE = registerPlaylistImageRequest;
        AbstractC0269h.registerDefaultInstance(RegisterPlaylistImageRequest.class, registerPlaylistImageRequest);
    }

    private RegisterPlaylistImageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19348n(RegisterPlaylistImageRequest registerPlaylistImageRequest, String str) {
        registerPlaylistImageRequest.getClass();
        str.getClass();
        registerPlaylistImageRequest.bitField0_ |= 1;
        registerPlaylistImageRequest.uploadToken_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static yrv0 m19349o() {
        return (yrv0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "uploadToken_"});
        }
        if (iOrdinal == 3) {
            return new RegisterPlaylistImageRequest();
        }
        if (iOrdinal == 4) {
            return new yrv0(DEFAULT_INSTANCE);
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
        synchronized (RegisterPlaylistImageRequest.class) {
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
