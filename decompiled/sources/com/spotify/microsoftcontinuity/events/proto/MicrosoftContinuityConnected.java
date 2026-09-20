package com.spotify.microsoftcontinuity.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qdf0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MicrosoftContinuityConnected extends AbstractC0269h implements sre0 {
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final MicrosoftContinuityConnected DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean connected_;

    static {
        MicrosoftContinuityConnected microsoftContinuityConnected = new MicrosoftContinuityConnected();
        DEFAULT_INSTANCE = microsoftContinuityConnected;
        AbstractC0269h.registerDefaultInstance(MicrosoftContinuityConnected.class, microsoftContinuityConnected);
    }

    private MicrosoftContinuityConnected() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15454n(MicrosoftContinuityConnected microsoftContinuityConnected) {
        microsoftContinuityConnected.bitField0_ |= 1;
        microsoftContinuityConnected.connected_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static qdf0 m15455o() {
        return (qdf0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "connected_"});
        }
        if (iOrdinal == 3) {
            return new MicrosoftContinuityConnected();
        }
        if (iOrdinal == 4) {
            return new qdf0(DEFAULT_INSTANCE);
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
        synchronized (MicrosoftContinuityConnected.class) {
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
