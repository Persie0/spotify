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
public final class EsWebsocketConnectRequest$WebSocketConnectRequest extends AbstractC0269h implements sre0 {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    private static final EsWebsocketConnectRequest$WebSocketConnectRequest DEFAULT_INSTANCE;
    public static final int DISABLESSLVERIFICATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private boolean disableSslVerification_;
    private String url_ = "";
    private String accessToken_ = "";

    static {
        EsWebsocketConnectRequest$WebSocketConnectRequest esWebsocketConnectRequest$WebSocketConnectRequest = new EsWebsocketConnectRequest$WebSocketConnectRequest();
        DEFAULT_INSTANCE = esWebsocketConnectRequest$WebSocketConnectRequest;
        AbstractC0269h.registerDefaultInstance(EsWebsocketConnectRequest$WebSocketConnectRequest.class, esWebsocketConnectRequest$WebSocketConnectRequest);
    }

    private EsWebsocketConnectRequest$WebSocketConnectRequest() {
    }

    /* JADX INFO: renamed from: p */
    public static EsWebsocketConnectRequest$WebSocketConnectRequest m7731p(byte[] bArr) {
        return (EsWebsocketConnectRequest$WebSocketConnectRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"url_", "accessToken_", "disableSslVerification_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketConnectRequest$WebSocketConnectRequest();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 16);
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
        synchronized (EsWebsocketConnectRequest$WebSocketConnectRequest.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final String m7732n() {
        return this.accessToken_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7733o() {
        return this.disableSslVerification_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
