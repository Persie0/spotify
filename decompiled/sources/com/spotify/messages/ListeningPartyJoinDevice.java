package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wh90;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListeningPartyJoinDevice extends AbstractC0269h implements sre0 {
    private static final ListeningPartyJoinDevice DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String partyUri_ = "";

    static {
        ListeningPartyJoinDevice listeningPartyJoinDevice = new ListeningPartyJoinDevice();
        DEFAULT_INSTANCE = listeningPartyJoinDevice;
        AbstractC0269h.registerDefaultInstance(ListeningPartyJoinDevice.class, listeningPartyJoinDevice);
    }

    private ListeningPartyJoinDevice() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13926n(ListeningPartyJoinDevice listeningPartyJoinDevice, String str) {
        listeningPartyJoinDevice.getClass();
        str.getClass();
        listeningPartyJoinDevice.bitField0_ |= 1;
        listeningPartyJoinDevice.partyUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static wh90 m13927o() {
        return (wh90) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "partyUri_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyJoinDevice();
        }
        if (iOrdinal == 4) {
            return new wh90(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyJoinDevice.class) {
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
