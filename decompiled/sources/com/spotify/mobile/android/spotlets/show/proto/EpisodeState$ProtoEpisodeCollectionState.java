package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EpisodeState$ProtoEpisodeCollectionState extends AbstractC0269h implements sre0 {
    private static final EpisodeState$ProtoEpisodeCollectionState DEFAULT_INSTANCE;
    public static final int IS_FOLLOWING_SHOW_FIELD_NUMBER = 1;
    public static final int IS_IN_LISTEN_LATER_FIELD_NUMBER = 3;
    public static final int IS_NEW_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean isFollowingShow_;
    private boolean isInListenLater_;
    private boolean isNew_;

    static {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = new EpisodeState$ProtoEpisodeCollectionState();
        DEFAULT_INSTANCE = episodeState$ProtoEpisodeCollectionState;
        AbstractC0269h.registerDefaultInstance(EpisodeState$ProtoEpisodeCollectionState.class, episodeState$ProtoEpisodeCollectionState);
    }

    private EpisodeState$ProtoEpisodeCollectionState() {
    }

    /* JADX INFO: renamed from: n */
    public static EpisodeState$ProtoEpisodeCollectionState m15467n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "isFollowingShow_", "isNew_", "isInListenLater_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeState$ProtoEpisodeCollectionState();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 20);
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
        synchronized (EpisodeState$ProtoEpisodeCollectionState.class) {
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

    public final boolean getIsFollowingShow() {
        return this.isFollowingShow_;
    }

    public final boolean getIsInListenLater() {
        return this.isInListenLater_;
    }

    public final boolean getIsNew() {
        return this.isNew_;
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
