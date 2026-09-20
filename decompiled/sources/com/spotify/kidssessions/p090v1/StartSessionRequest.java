package com.spotify.kidssessions.p090v1;

import com.google.protobuf.AbstractC0269h;
import p204p.mr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class StartSessionRequest extends AbstractC0269h implements sre0 {
    public static final int ALLOW_TRANSITIONING_TO_MA_FIELD_NUMBER = 3;
    private static final StartSessionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private boolean allowTransitioningToMa_;
    private int bitField0_;
    private String spotifyId_ = "";
    private String userId_ = "";

    static {
        StartSessionRequest startSessionRequest = new StartSessionRequest();
        DEFAULT_INSTANCE = startSessionRequest;
        AbstractC0269h.registerDefaultInstance(StartSessionRequest.class, startSessionRequest);
    }

    private StartSessionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12262n(StartSessionRequest startSessionRequest, boolean z) {
        startSessionRequest.allowTransitioningToMa_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m12263o(StartSessionRequest startSessionRequest, String str) {
        startSessionRequest.getClass();
        startSessionRequest.spotifyId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mr41 m12265q() {
        return (mr41) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0007", new Object[]{"bitField0_", "spotifyId_", "userId_", "allowTransitioningToMa_"});
        }
        if (iOrdinal == 3) {
            return new StartSessionRequest();
        }
        if (iOrdinal == 4) {
            return new mr41();
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
        synchronized (StartSessionRequest.class) {
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
