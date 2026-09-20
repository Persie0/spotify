package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rh90;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes16.dex */
public final class ListeningPartyChannelError extends AbstractC0269h implements sre0 {
    public static final int CHANNEL_FIELD_NUMBER = 2;
    private static final ListeningPartyChannelError DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String roomUri_ = "";
    private String channel_ = "";
    private String error_ = "";

    static {
        ListeningPartyChannelError listeningPartyChannelError = new ListeningPartyChannelError();
        DEFAULT_INSTANCE = listeningPartyChannelError;
        AbstractC0269h.registerDefaultInstance(ListeningPartyChannelError.class, listeningPartyChannelError);
    }

    private ListeningPartyChannelError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13922n(ListeningPartyChannelError listeningPartyChannelError, String str) {
        listeningPartyChannelError.getClass();
        str.getClass();
        listeningPartyChannelError.bitField0_ |= 2;
        listeningPartyChannelError.channel_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13923o(ListeningPartyChannelError listeningPartyChannelError, String str) {
        listeningPartyChannelError.getClass();
        str.getClass();
        listeningPartyChannelError.bitField0_ |= 4;
        listeningPartyChannelError.error_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13924p(ListeningPartyChannelError listeningPartyChannelError, String str) {
        listeningPartyChannelError.getClass();
        str.getClass();
        listeningPartyChannelError.bitField0_ |= 1;
        listeningPartyChannelError.roomUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static rh90 m13925q() {
        return (rh90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "roomUri_", "channel_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyChannelError();
        }
        if (iOrdinal == 4) {
            return new rh90(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyChannelError.class) {
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
