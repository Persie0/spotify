package com.spotify.kidssessions.p090v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v610;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAutoLoginTokenRequest extends AbstractC0269h implements sre0 {
    private static final GetAutoLoginTokenRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 2;
    private String sessionId_ = "";
    private String spotifyId_ = "";

    static {
        GetAutoLoginTokenRequest getAutoLoginTokenRequest = new GetAutoLoginTokenRequest();
        DEFAULT_INSTANCE = getAutoLoginTokenRequest;
        AbstractC0269h.registerDefaultInstance(GetAutoLoginTokenRequest.class, getAutoLoginTokenRequest);
    }

    private GetAutoLoginTokenRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12251n(GetAutoLoginTokenRequest getAutoLoginTokenRequest, String str) {
        getAutoLoginTokenRequest.getClass();
        str.getClass();
        getAutoLoginTokenRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12252o(GetAutoLoginTokenRequest getAutoLoginTokenRequest, String str) {
        getAutoLoginTokenRequest.getClass();
        getAutoLoginTokenRequest.spotifyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static v610 m12254q() {
        return (v610) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"sessionId_", "spotifyId_"});
        }
        if (iOrdinal == 3) {
            return new GetAutoLoginTokenRequest();
        }
        if (iOrdinal == 4) {
            return new v610();
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
        synchronized (GetAutoLoginTokenRequest.class) {
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
