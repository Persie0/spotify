package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EpisodeState$ProtoEpisodePlayState extends AbstractC0269h implements sre0 {
    private static final EpisodeState$ProtoEpisodePlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 2;
    public static final int IS_PLAYED_FIELD_NUMBER = 3;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isPlayable_;
    private boolean isPlayed_;
    private long lastPlayedAt_;
    private int playabilityRestriction_;
    private int timeLeft_;

    static {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = new EpisodeState$ProtoEpisodePlayState();
        DEFAULT_INSTANCE = episodeState$ProtoEpisodePlayState;
        AbstractC0269h.registerDefaultInstance(EpisodeState$ProtoEpisodePlayState.class, episodeState$ProtoEpisodePlayState);
    }

    private EpisodeState$ProtoEpisodePlayState() {
    }

    /* JADX INFO: renamed from: n */
    public static EpisodeState$ProtoEpisodePlayState m15469n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဃ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "timeLeft_", "isPlayable_", "isPlayed_", "lastPlayedAt_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new EpisodeState$ProtoEpisodePlayState();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 22);
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
        synchronized (EpisodeState$ProtoEpisodePlayState.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    public final boolean getIsPlayed() {
        return this.isPlayed_;
    }

    public final int getTimeLeft() {
        return this.timeLeft_;
    }

    public final boolean hasTimeLeft() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m15470o() {
        return this.lastPlayedAt_;
    }

    /* JADX INFO: renamed from: p */
    public final PlayabilityRestriction m15471p() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
