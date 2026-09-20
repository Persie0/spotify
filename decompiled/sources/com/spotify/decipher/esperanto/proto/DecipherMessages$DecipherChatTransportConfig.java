package com.spotify.decipher.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eqo;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DecipherMessages$DecipherChatTransportConfig extends AbstractC0269h implements sre0 {
    private static final DecipherMessages$DecipherChatTransportConfig DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private String sessionId_ = "";

    static {
        DecipherMessages$DecipherChatTransportConfig decipherMessages$DecipherChatTransportConfig = new DecipherMessages$DecipherChatTransportConfig();
        DEFAULT_INSTANCE = decipherMessages$DecipherChatTransportConfig;
        AbstractC0269h.registerDefaultInstance(DecipherMessages$DecipherChatTransportConfig.class, decipherMessages$DecipherChatTransportConfig);
    }

    private DecipherMessages$DecipherChatTransportConfig() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9160n(DecipherMessages$DecipherChatTransportConfig decipherMessages$DecipherChatTransportConfig, String str) {
        decipherMessages$DecipherChatTransportConfig.getClass();
        str.getClass();
        decipherMessages$DecipherChatTransportConfig.sessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static eqo m9161o() {
        return (eqo) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"sessionId_"});
        }
        if (iOrdinal == 3) {
            return new DecipherMessages$DecipherChatTransportConfig();
        }
        if (iOrdinal == 4) {
            return new eqo(DEFAULT_INSTANCE);
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
        synchronized (DecipherMessages$DecipherChatTransportConfig.class) {
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
