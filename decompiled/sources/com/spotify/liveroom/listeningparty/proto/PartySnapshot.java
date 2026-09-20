package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PartySnapshot extends AbstractC0269h implements sre0 {
    private static final PartySnapshot DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_FIELD_NUMBER = 4;
    public static final int MEDIA_PLAYBACK_DATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PINNED_MESSAGE_DATA_FIELD_NUMBER = 5;
    public static final int STAGE_USER_DATA_FIELD_NUMBER = 2;
    public static final int USERS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp lastUpdated_;
    private MediaPlaybackData mediaPlaybackData_;
    private PinnedMessageData pinnedMessageData_;
    private StageUserData stageUserData_;
    private ae50 users_ = AbstractC0269h.emptyProtobufList();

    static {
        PartySnapshot partySnapshot = new PartySnapshot();
        DEFAULT_INSTANCE = partySnapshot;
        AbstractC0269h.registerDefaultInstance(PartySnapshot.class, partySnapshot);
    }

    private PartySnapshot() {
    }

    /* JADX INFO: renamed from: n */
    public static PartySnapshot m13088n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "users_", User.class, "stageUserData_", "mediaPlaybackData_", "lastUpdated_", "pinnedMessageData_"});
        }
        if (iOrdinal == 3) {
            return new PartySnapshot();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 3);
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
        synchronized (PartySnapshot.class) {
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
    public final PinnedMessageData m13089o() {
        PinnedMessageData pinnedMessageData = this.pinnedMessageData_;
        return pinnedMessageData == null ? PinnedMessageData.m13090n() : pinnedMessageData;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
