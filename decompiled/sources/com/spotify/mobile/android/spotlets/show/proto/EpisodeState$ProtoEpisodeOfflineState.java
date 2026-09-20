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
public final class EpisodeState$ProtoEpisodeOfflineState extends AbstractC0269h implements sre0 {
    private static final EpisodeState$ProtoEpisodeOfflineState DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String offlineState_ = "";
    private int syncProgress_;

    static {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = new EpisodeState$ProtoEpisodeOfflineState();
        DEFAULT_INSTANCE = episodeState$ProtoEpisodeOfflineState;
        AbstractC0269h.registerDefaultInstance(EpisodeState$ProtoEpisodeOfflineState.class, episodeState$ProtoEpisodeOfflineState);
    }

    private EpisodeState$ProtoEpisodeOfflineState() {
    }

    /* JADX INFO: renamed from: n */
    public static EpisodeState$ProtoEpisodeOfflineState m15468n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeState$ProtoEpisodeOfflineState();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 21);
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
        synchronized (EpisodeState$ProtoEpisodeOfflineState.class) {
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

    public final String getOfflineState() {
        return this.offlineState_;
    }

    public final int getSyncProgress() {
        return this.syncProgress_;
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
