package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ii90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListeningPartyMusicTrackEnded extends AbstractC0269h implements sre0 {
    private static final ListeningPartyMusicTrackEnded DEFAULT_INSTANCE;
    public static final int EXPECTED_PARTY_POSITION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_POSITION_FIELD_NUMBER = 3;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    public static final int TRIGGERING_EVENT_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private long expectedPartyPosition_;
    private long partyPosition_;
    private String roomUri_ = "";
    private String trackUri_ = "";
    private String triggeringEventId_ = "";

    static {
        ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded = new ListeningPartyMusicTrackEnded();
        DEFAULT_INSTANCE = listeningPartyMusicTrackEnded;
        AbstractC0269h.registerDefaultInstance(ListeningPartyMusicTrackEnded.class, listeningPartyMusicTrackEnded);
    }

    private ListeningPartyMusicTrackEnded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13930n(ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded, long j) {
        listeningPartyMusicTrackEnded.bitField0_ |= 8;
        listeningPartyMusicTrackEnded.expectedPartyPosition_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m13931o(ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded, long j) {
        listeningPartyMusicTrackEnded.bitField0_ |= 4;
        listeningPartyMusicTrackEnded.partyPosition_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m13932p(ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded, String str) {
        listeningPartyMusicTrackEnded.getClass();
        str.getClass();
        listeningPartyMusicTrackEnded.bitField0_ |= 1;
        listeningPartyMusicTrackEnded.roomUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13933q(ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded, String str) {
        listeningPartyMusicTrackEnded.getClass();
        str.getClass();
        listeningPartyMusicTrackEnded.bitField0_ |= 2;
        listeningPartyMusicTrackEnded.trackUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13934r(ListeningPartyMusicTrackEnded listeningPartyMusicTrackEnded, String str) {
        listeningPartyMusicTrackEnded.getClass();
        str.getClass();
        listeningPartyMusicTrackEnded.bitField0_ |= 16;
        listeningPartyMusicTrackEnded.triggeringEventId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ii90 m13935s() {
        return (ii90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "roomUri_", "trackUri_", "partyPosition_", "expectedPartyPosition_", "triggeringEventId_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyMusicTrackEnded();
        }
        if (iOrdinal == 4) {
            return new ii90(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyMusicTrackEnded.class) {
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
