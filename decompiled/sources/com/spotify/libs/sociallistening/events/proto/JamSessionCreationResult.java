package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k760;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class JamSessionCreationResult extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final JamSessionCreationResult DEFAULT_INSTANCE;
    public static final int ERROR_DATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sessionId_ = "";
    private String action_ = "";
    private String errorData_ = "";

    static {
        JamSessionCreationResult jamSessionCreationResult = new JamSessionCreationResult();
        DEFAULT_INSTANCE = jamSessionCreationResult;
        AbstractC0269h.registerDefaultInstance(JamSessionCreationResult.class, jamSessionCreationResult);
    }

    private JamSessionCreationResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12839n(JamSessionCreationResult jamSessionCreationResult, String str) {
        jamSessionCreationResult.getClass();
        str.getClass();
        jamSessionCreationResult.bitField0_ |= 2;
        jamSessionCreationResult.action_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12840o(JamSessionCreationResult jamSessionCreationResult, String str) {
        jamSessionCreationResult.getClass();
        str.getClass();
        jamSessionCreationResult.bitField0_ |= 4;
        jamSessionCreationResult.errorData_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12841p(JamSessionCreationResult jamSessionCreationResult, String str) {
        jamSessionCreationResult.getClass();
        str.getClass();
        jamSessionCreationResult.bitField0_ |= 1;
        jamSessionCreationResult.sessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static k760 m12842q() {
        return (k760) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "sessionId_", "action_", "errorData_"});
        }
        if (iOrdinal == 3) {
            return new JamSessionCreationResult();
        }
        if (iOrdinal == 4) {
            return new k760(DEFAULT_INSTANCE);
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
        synchronized (JamSessionCreationResult.class) {
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
