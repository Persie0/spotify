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
public final class PlaylistRequest$ItemCollectionState extends AbstractC0269h implements sre0 {
    private static final PlaylistRequest$ItemCollectionState DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 2;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean isBanned_;
    private boolean isInCollection_;

    static {
        PlaylistRequest$ItemCollectionState playlistRequest$ItemCollectionState = new PlaylistRequest$ItemCollectionState();
        DEFAULT_INSTANCE = playlistRequest$ItemCollectionState;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$ItemCollectionState.class, playlistRequest$ItemCollectionState);
    }

    private PlaylistRequest$ItemCollectionState() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaylistRequest$ItemCollectionState m18599o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "isInCollection_", "isBanned_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$ItemCollectionState();
        }
        if (iOrdinal == 4) {
            return new zmp0(9);
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
        synchronized (PlaylistRequest$ItemCollectionState.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
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
