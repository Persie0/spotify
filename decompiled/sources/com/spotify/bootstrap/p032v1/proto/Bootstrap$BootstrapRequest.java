package com.spotify.bootstrap.p032v1.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.ucs.p169v0.proto.Ucs$UcsRequest;
import p204p.ore0;
import p204p.pre0;
import p204p.q8a;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Bootstrap$BootstrapRequest extends AbstractC0269h implements sre0 {
    private static final Bootstrap$BootstrapRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRIALS_FACADE_REQUEST_V1_FIELD_NUMBER = 3;
    public static final int UCS_REQUEST_V0_FIELD_NUMBER = 2;
    private Object trialsFacadeRequest_;
    private Object ucsRequest_;
    private int ucsRequestCase_ = 0;
    private int trialsFacadeRequestCase_ = 0;

    static {
        Bootstrap$BootstrapRequest bootstrap$BootstrapRequest = new Bootstrap$BootstrapRequest();
        DEFAULT_INSTANCE = bootstrap$BootstrapRequest;
        AbstractC0269h.registerDefaultInstance(Bootstrap$BootstrapRequest.class, bootstrap$BootstrapRequest);
    }

    private Bootstrap$BootstrapRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4029n(Bootstrap$BootstrapRequest bootstrap$BootstrapRequest, Bootstrap$TrialsFacadeRequestV1 bootstrap$TrialsFacadeRequestV1) {
        bootstrap$BootstrapRequest.getClass();
        bootstrap$TrialsFacadeRequestV1.getClass();
        bootstrap$BootstrapRequest.trialsFacadeRequest_ = bootstrap$TrialsFacadeRequestV1;
        bootstrap$BootstrapRequest.trialsFacadeRequestCase_ = 3;
    }

    /* JADX INFO: renamed from: o */
    public static void m4030o(Bootstrap$BootstrapRequest bootstrap$BootstrapRequest, Ucs$UcsRequest ucs$UcsRequest) {
        bootstrap$BootstrapRequest.getClass();
        ucs$UcsRequest.getClass();
        bootstrap$BootstrapRequest.ucsRequest_ = ucs$UcsRequest;
        bootstrap$BootstrapRequest.ucsRequestCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static q8a m4031p() {
        return (q8a) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0002\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0001", new Object[]{"ucsRequest_", "ucsRequestCase_", "trialsFacadeRequest_", "trialsFacadeRequestCase_", Ucs$UcsRequest.class, Bootstrap$TrialsFacadeRequestV1.class});
        }
        if (iOrdinal == 3) {
            return new Bootstrap$BootstrapRequest();
        }
        if (iOrdinal == 4) {
            return new q8a(DEFAULT_INSTANCE);
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
        synchronized (Bootstrap$BootstrapRequest.class) {
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
