package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsWebsocketSendRequest$WebSocketSendTextRequest extends AbstractC0269h implements sre0 {
    private static final EsWebsocketSendRequest$WebSocketSendTextRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private String payload_ = "";

    static {
        EsWebsocketSendRequest$WebSocketSendTextRequest esWebsocketSendRequest$WebSocketSendTextRequest = new EsWebsocketSendRequest$WebSocketSendTextRequest();
        DEFAULT_INSTANCE = esWebsocketSendRequest$WebSocketSendTextRequest;
        AbstractC0269h.registerDefaultInstance(EsWebsocketSendRequest$WebSocketSendTextRequest.class, esWebsocketSendRequest$WebSocketSendTextRequest);
    }

    private EsWebsocketSendRequest$WebSocketSendTextRequest() {
    }

    /* JADX INFO: renamed from: o */
    public static EsWebsocketSendRequest$WebSocketSendTextRequest m7746o(byte[] bArr) {
        return (EsWebsocketSendRequest$WebSocketSendTextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"payload_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketSendRequest$WebSocketSendTextRequest();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 19);
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
        synchronized (EsWebsocketSendRequest$WebSocketSendTextRequest.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m7747n() {
        return this.payload_;
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
