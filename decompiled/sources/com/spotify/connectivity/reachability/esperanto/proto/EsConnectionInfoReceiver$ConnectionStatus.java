package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Empty;
import p204p.cjw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsConnectionInfoReceiver$ConnectionStatus extends AbstractC0269h implements sre0 {
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final EsConnectionInfoReceiver$ConnectionStatus DEFAULT_INSTANCE;
    public static final int NOT_CONNECTED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus = new EsConnectionInfoReceiver$ConnectionStatus();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$ConnectionStatus;
        AbstractC0269h.registerDefaultInstance(EsConnectionInfoReceiver$ConnectionStatus.class, esConnectionInfoReceiver$ConnectionStatus);
    }

    private EsConnectionInfoReceiver$ConnectionStatus() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7565n(EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus, EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected) {
        esConnectionInfoReceiver$ConnectionStatus.getClass();
        esConnectionInfoReceiver$Connected.getClass();
        esConnectionInfoReceiver$ConnectionStatus.type_ = esConnectionInfoReceiver$Connected;
        esConnectionInfoReceiver$ConnectionStatus.typeCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m7566o(EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus, Empty empty) {
        esConnectionInfoReceiver$ConnectionStatus.getClass();
        empty.getClass();
        esConnectionInfoReceiver$ConnectionStatus.type_ = empty;
        esConnectionInfoReceiver$ConnectionStatus.typeCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static cjw m7567p() {
        return (cjw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"type_", "typeCase_", EsConnectionInfoReceiver$Connected.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$ConnectionStatus();
        }
        if (iOrdinal == 4) {
            return new cjw(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$ConnectionStatus.class) {
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
