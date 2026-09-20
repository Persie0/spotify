package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.oi90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListeningPartyPlayedTalkTrack extends AbstractC0269h implements sre0 {
    private static final ListeningPartyPlayedTalkTrack DEFAULT_INSTANCE;
    public static final int EXPECTED_PARTY_POSITION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_POSITION_FIELD_NUMBER = 2;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    public static final int TRIGGERING_EVENT_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long expectedPartyPosition_;
    private long partyPosition_;
    private String roomUri_ = "";
    private String triggeringEventId_ = "";

    static {
        ListeningPartyPlayedTalkTrack listeningPartyPlayedTalkTrack = new ListeningPartyPlayedTalkTrack();
        DEFAULT_INSTANCE = listeningPartyPlayedTalkTrack;
        AbstractC0269h.registerDefaultInstance(ListeningPartyPlayedTalkTrack.class, listeningPartyPlayedTalkTrack);
    }

    private ListeningPartyPlayedTalkTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13946n(ListeningPartyPlayedTalkTrack listeningPartyPlayedTalkTrack, long j) {
        listeningPartyPlayedTalkTrack.bitField0_ |= 4;
        listeningPartyPlayedTalkTrack.expectedPartyPosition_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m13947o(ListeningPartyPlayedTalkTrack listeningPartyPlayedTalkTrack, long j) {
        listeningPartyPlayedTalkTrack.bitField0_ |= 2;
        listeningPartyPlayedTalkTrack.partyPosition_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m13948p(ListeningPartyPlayedTalkTrack listeningPartyPlayedTalkTrack, String str) {
        listeningPartyPlayedTalkTrack.getClass();
        str.getClass();
        listeningPartyPlayedTalkTrack.bitField0_ |= 1;
        listeningPartyPlayedTalkTrack.roomUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13949q(ListeningPartyPlayedTalkTrack listeningPartyPlayedTalkTrack, String str) {
        listeningPartyPlayedTalkTrack.getClass();
        str.getClass();
        listeningPartyPlayedTalkTrack.bitField0_ |= 8;
        listeningPartyPlayedTalkTrack.triggeringEventId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static oi90 m13950r() {
        return (oi90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "roomUri_", "partyPosition_", "expectedPartyPosition_", "triggeringEventId_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyPlayedTalkTrack();
        }
        if (iOrdinal == 4) {
            return new oi90(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyPlayedTalkTrack.class) {
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
