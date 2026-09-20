package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistAllowsDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int CAN_DELETE_FIELD_NUMBER = 3;
    private static final PlaylistAllowsDecorationPolicy DEFAULT_INSTANCE;
    public static final int INSERT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_FIELD_NUMBER = 2;
    private boolean canDelete_;
    private boolean insert_;
    private boolean remove_;

    static {
        PlaylistAllowsDecorationPolicy playlistAllowsDecorationPolicy = new PlaylistAllowsDecorationPolicy();
        DEFAULT_INSTANCE = playlistAllowsDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistAllowsDecorationPolicy.class, playlistAllowsDecorationPolicy);
    }

    private PlaylistAllowsDecorationPolicy() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"insert_", "remove_", "canDelete_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistAllowsDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new bvo0(16);
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
        synchronized (PlaylistAllowsDecorationPolicy.class) {
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
