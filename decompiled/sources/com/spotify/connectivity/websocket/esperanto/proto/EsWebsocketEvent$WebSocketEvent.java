package com.spotify.connectivity.websocket.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wpw;
import p204p.xpw;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EsWebsocketEvent$WebSocketEvent extends AbstractC0269h implements sre0 {
    public static final int BINARYPAYLOAD_FIELD_NUMBER = 4;
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final EsWebsocketEvent$WebSocketEvent DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXTPAYLOAD_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean connected_;
    private boolean disconnected_;
    private int error_;
    private String textPayload_ = "";
    private gva binaryPayload_ = gva.f84678b;

    static {
        EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent = new EsWebsocketEvent$WebSocketEvent();
        DEFAULT_INSTANCE = esWebsocketEvent$WebSocketEvent;
        AbstractC0269h.registerDefaultInstance(EsWebsocketEvent$WebSocketEvent.class, esWebsocketEvent$WebSocketEvent);
    }

    private EsWebsocketEvent$WebSocketEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7736n(EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent, cva cvaVar) {
        esWebsocketEvent$WebSocketEvent.getClass();
        esWebsocketEvent$WebSocketEvent.bitField0_ |= 8;
        esWebsocketEvent$WebSocketEvent.binaryPayload_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m7737o(EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent) {
        esWebsocketEvent$WebSocketEvent.bitField0_ |= 1;
        esWebsocketEvent$WebSocketEvent.connected_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m7738p(EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent) {
        esWebsocketEvent$WebSocketEvent.bitField0_ |= 16;
        esWebsocketEvent$WebSocketEvent.disconnected_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m7739q(EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent, wpw wpwVar) {
        esWebsocketEvent$WebSocketEvent.getClass();
        esWebsocketEvent$WebSocketEvent.error_ = wpwVar.getNumber();
        esWebsocketEvent$WebSocketEvent.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m7740r(EsWebsocketEvent$WebSocketEvent esWebsocketEvent$WebSocketEvent, String str) {
        esWebsocketEvent$WebSocketEvent.getClass();
        esWebsocketEvent$WebSocketEvent.bitField0_ |= 4;
        esWebsocketEvent$WebSocketEvent.textPayload_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static xpw m7741s() {
        return (xpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ည\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "connected_", "error_", "textPayload_", "binaryPayload_", "disconnected_"});
        }
        if (iOrdinal == 3) {
            return new EsWebsocketEvent$WebSocketEvent();
        }
        if (iOrdinal == 4) {
            return new xpw(DEFAULT_INSTANCE);
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
        synchronized (EsWebsocketEvent$WebSocketEvent.class) {
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
