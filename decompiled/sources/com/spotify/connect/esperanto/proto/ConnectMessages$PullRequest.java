package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jti;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectMessages$PullRequest extends AbstractC0269h implements sre0 {
    private static final ConnectMessages$PullRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CommonMessages$LoggingParams loggingParams_;

    static {
        ConnectMessages$PullRequest connectMessages$PullRequest = new ConnectMessages$PullRequest();
        DEFAULT_INSTANCE = connectMessages$PullRequest;
        AbstractC0269h.registerDefaultInstance(ConnectMessages$PullRequest.class, connectMessages$PullRequest);
    }

    private ConnectMessages$PullRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7361n(ConnectMessages$PullRequest connectMessages$PullRequest, CommonMessages$LoggingParams commonMessages$LoggingParams) {
        connectMessages$PullRequest.getClass();
        connectMessages$PullRequest.loggingParams_ = commonMessages$LoggingParams;
        connectMessages$PullRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static jti m7362o() {
        return (jti) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$PullRequest();
        }
        if (iOrdinal == 4) {
            return new jti(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$PullRequest.class) {
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
