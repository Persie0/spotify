package com.spotify.playlist_signal.model.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a221;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;
import p204p.z121;

/* JADX INFO: loaded from: classes9.dex */
public final class SignalModelProto$Signal extends AbstractC0269h implements a221 {
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SignalModelProto$Signal DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int INSTANCE_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private gva clientPayload_;
    private gva data_;
    private String identifier_ = "";
    private String instanceId_;

    static {
        SignalModelProto$Signal signalModelProto$Signal = new SignalModelProto$Signal();
        DEFAULT_INSTANCE = signalModelProto$Signal;
        AbstractC0269h.registerDefaultInstance(SignalModelProto$Signal.class, signalModelProto$Signal);
    }

    private SignalModelProto$Signal() {
        cva cvaVar = gva.f84678b;
        this.data_ = cvaVar;
        this.clientPayload_ = cvaVar;
        this.instanceId_ = "";
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004Ȉ", new Object[]{"identifier_", "data_", "clientPayload_", "instanceId_"});
        }
        if (iOrdinal == 3) {
            return new SignalModelProto$Signal();
        }
        if (iOrdinal == 4) {
            return new z121(DEFAULT_INSTANCE);
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
        synchronized (SignalModelProto$Signal.class) {
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
