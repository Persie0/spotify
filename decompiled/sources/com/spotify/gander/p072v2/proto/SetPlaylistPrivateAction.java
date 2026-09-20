package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f601;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SetPlaylistPrivateAction extends AbstractC0269h implements sre0 {
    private static final SetPlaylistPrivateAction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private String playlistUri_ = "";

    static {
        SetPlaylistPrivateAction setPlaylistPrivateAction = new SetPlaylistPrivateAction();
        DEFAULT_INSTANCE = setPlaylistPrivateAction;
        AbstractC0269h.registerDefaultInstance(SetPlaylistPrivateAction.class, setPlaylistPrivateAction);
    }

    private SetPlaylistPrivateAction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11129n(SetPlaylistPrivateAction setPlaylistPrivateAction, String str) {
        setPlaylistPrivateAction.getClass();
        setPlaylistPrivateAction.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static SetPlaylistPrivateAction m11130o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static f601 m11131p() {
        return (f601) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"playlistUri_"});
        }
        if (iOrdinal == 3) {
            return new SetPlaylistPrivateAction();
        }
        if (iOrdinal == 4) {
            return new f601(DEFAULT_INSTANCE);
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
        synchronized (SetPlaylistPrivateAction.class) {
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

    public final String getPlaylistUri() {
        return this.playlistUri_;
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
