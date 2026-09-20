package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoom extends AbstractC0269h implements sre0 {
    public static final int AUDIO_TOKEN_FIELD_NUMBER = 2;
    private static final LiveRoom DEFAULT_INSTANCE;
    public static final int LIVE_AT_FIELD_NUMBER = 4;
    public static final int MESSAGE_TOKEN_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_SNAPSHOT_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp liveAt_;
    private PartySnapshot partySnapshot_;
    private String messageToken_ = "";
    private String audioToken_ = "";

    static {
        LiveRoom liveRoom = new LiveRoom();
        DEFAULT_INSTANCE = liveRoom;
        AbstractC0269h.registerDefaultInstance(LiveRoom.class, liveRoom);
    }

    private LiveRoom() {
    }

    /* JADX INFO: renamed from: n */
    public static LiveRoom m13073n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "messageToken_", "audioToken_", "partySnapshot_", "liveAt_"});
        }
        if (iOrdinal == 3) {
            return new LiveRoom();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 7);
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
        synchronized (LiveRoom.class) {
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

    /* JADX INFO: renamed from: o */
    public final Timestamp m13074o() {
        Timestamp timestamp = this.liveAt_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: p */
    public final String m13075p() {
        return this.messageToken_;
    }

    /* JADX INFO: renamed from: q */
    public final PartySnapshot m13076q() {
        PartySnapshot partySnapshot = this.partySnapshot_;
        return partySnapshot == null ? PartySnapshot.m13088n() : partySnapshot;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
