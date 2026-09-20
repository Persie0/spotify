package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pew0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteSessionStartEvent extends AbstractC0269h implements sre0 {
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final RemoteSessionStartEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SENDER_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String clientId_ = "";
    private String sessionId_ = "";
    private String senderId_ = "";

    static {
        RemoteSessionStartEvent remoteSessionStartEvent = new RemoteSessionStartEvent();
        DEFAULT_INSTANCE = remoteSessionStartEvent;
        AbstractC0269h.registerDefaultInstance(RemoteSessionStartEvent.class, remoteSessionStartEvent);
    }

    private RemoteSessionStartEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14415n(RemoteSessionStartEvent remoteSessionStartEvent, String str) {
        remoteSessionStartEvent.getClass();
        str.getClass();
        remoteSessionStartEvent.bitField0_ |= 4;
        remoteSessionStartEvent.senderId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14416o(RemoteSessionStartEvent remoteSessionStartEvent, String str) {
        remoteSessionStartEvent.getClass();
        str.getClass();
        remoteSessionStartEvent.bitField0_ |= 2;
        remoteSessionStartEvent.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static pew0 m14417p() {
        return (pew0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "clientId_", "sessionId_", "senderId_"});
        }
        if (iOrdinal == 3) {
            return new RemoteSessionStartEvent();
        }
        if (iOrdinal == 4) {
            return new pew0(DEFAULT_INSTANCE);
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
        synchronized (RemoteSessionStartEvent.class) {
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
