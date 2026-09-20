package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$ItemOfflineState extends AbstractC0269h implements sre0 {
    private static final PlaylistRequest$ItemOfflineState DEFAULT_INSTANCE;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 3;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean locallyPlayable_;
    private String offline_ = "";
    private int syncProgress_;

    static {
        PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineState = new PlaylistRequest$ItemOfflineState();
        DEFAULT_INSTANCE = playlistRequest$ItemOfflineState;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$ItemOfflineState.class, playlistRequest$ItemOfflineState);
    }

    private PlaylistRequest$ItemOfflineState() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaylistRequest$ItemOfflineState m18605o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "offline_", "syncProgress_", "locallyPlayable_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$ItemOfflineState();
        }
        if (iOrdinal == 4) {
            return new zmp0(12);
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
        synchronized (PlaylistRequest$ItemOfflineState.class) {
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

    public final boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    public final String getOffline() {
        return this.offline_;
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
