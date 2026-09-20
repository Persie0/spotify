package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qtp0;
import p204p.r110;
import p204p.r2n0;
import p204p.rtp0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistUpdatedEvent extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final PlaylistUpdatedEvent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int action_;
    private String playlistUri_ = "";
    private String trackUri_ = "";

    static {
        PlaylistUpdatedEvent playlistUpdatedEvent = new PlaylistUpdatedEvent();
        DEFAULT_INSTANCE = playlistUpdatedEvent;
        AbstractC0269h.registerDefaultInstance(PlaylistUpdatedEvent.class, playlistUpdatedEvent);
    }

    private PlaylistUpdatedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2959n(PlaylistUpdatedEvent playlistUpdatedEvent, qtp0 qtp0Var) {
        playlistUpdatedEvent.getClass();
        playlistUpdatedEvent.action_ = qtp0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m2960o(PlaylistUpdatedEvent playlistUpdatedEvent, String str) {
        playlistUpdatedEvent.getClass();
        str.getClass();
        playlistUpdatedEvent.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2961p(PlaylistUpdatedEvent playlistUpdatedEvent, String str) {
        playlistUpdatedEvent.getClass();
        str.getClass();
        playlistUpdatedEvent.trackUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static rtp0 m2962q() {
        return (rtp0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"playlistUri_", "trackUri_", "action_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistUpdatedEvent();
        }
        if (iOrdinal == 4) {
            return new rtp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistUpdatedEvent.class) {
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
