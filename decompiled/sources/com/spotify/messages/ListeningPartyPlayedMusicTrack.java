package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ni90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListeningPartyPlayedMusicTrack extends AbstractC0269h implements sre0 {
    private static final ListeningPartyPlayedMusicTrack DEFAULT_INSTANCE;
    public static final int EXPECTED_PARTY_POSITION_FIELD_NUMBER = 5;
    public static final int EXPECTED_SEEK_MS_FIELD_NUMBER = 7;
    public static final int EXPECTED_TRACK_URI_FIELD_NUMBER = 3;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_POSITION_FIELD_NUMBER = 4;
    public static final int ROOM_URI_FIELD_NUMBER = 1;
    public static final int SEEK_MS_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    public static final int TRIGGERING_EVENT_ID_FIELD_NUMBER = 9;
    private int bitField0_;
    private long expectedPartyPosition_;
    private long expectedSeekMs_;
    private long partyPosition_;
    private long seekMs_;
    private String roomUri_ = "";
    private String trackUri_ = "";
    private String expectedTrackUri_ = "";
    private String nextTracks_ = "";
    private String triggeringEventId_ = "";

    static {
        ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack = new ListeningPartyPlayedMusicTrack();
        DEFAULT_INSTANCE = listeningPartyPlayedMusicTrack;
        AbstractC0269h.registerDefaultInstance(ListeningPartyPlayedMusicTrack.class, listeningPartyPlayedMusicTrack);
    }

    private ListeningPartyPlayedMusicTrack() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13936n(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, long j) {
        listeningPartyPlayedMusicTrack.bitField0_ |= 16;
        listeningPartyPlayedMusicTrack.expectedPartyPosition_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m13937o(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, long j) {
        listeningPartyPlayedMusicTrack.bitField0_ |= 64;
        listeningPartyPlayedMusicTrack.expectedSeekMs_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m13938p(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, String str) {
        listeningPartyPlayedMusicTrack.getClass();
        listeningPartyPlayedMusicTrack.bitField0_ |= 4;
        listeningPartyPlayedMusicTrack.expectedTrackUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13939q(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, String str) {
        listeningPartyPlayedMusicTrack.getClass();
        str.getClass();
        listeningPartyPlayedMusicTrack.bitField0_ |= 128;
        listeningPartyPlayedMusicTrack.nextTracks_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13940r(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, long j) {
        listeningPartyPlayedMusicTrack.bitField0_ |= 8;
        listeningPartyPlayedMusicTrack.partyPosition_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13941s(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, String str) {
        listeningPartyPlayedMusicTrack.getClass();
        str.getClass();
        listeningPartyPlayedMusicTrack.bitField0_ |= 1;
        listeningPartyPlayedMusicTrack.roomUri_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13942t(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, long j) {
        listeningPartyPlayedMusicTrack.bitField0_ |= 32;
        listeningPartyPlayedMusicTrack.seekMs_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m13943u(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, String str) {
        listeningPartyPlayedMusicTrack.getClass();
        str.getClass();
        listeningPartyPlayedMusicTrack.bitField0_ |= 2;
        listeningPartyPlayedMusicTrack.trackUri_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13944v(ListeningPartyPlayedMusicTrack listeningPartyPlayedMusicTrack, String str) {
        listeningPartyPlayedMusicTrack.getClass();
        str.getClass();
        listeningPartyPlayedMusicTrack.bitField0_ |= 256;
        listeningPartyPlayedMusicTrack.triggeringEventId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static ni90 m13945w() {
        return (ni90) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "roomUri_", "trackUri_", "expectedTrackUri_", "partyPosition_", "expectedPartyPosition_", "seekMs_", "expectedSeekMs_", "nextTracks_", "triggeringEventId_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyPlayedMusicTrack();
        }
        if (iOrdinal == 4) {
            return new ni90(DEFAULT_INSTANCE);
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
        synchronized (ListeningPartyPlayedMusicTrack.class) {
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
