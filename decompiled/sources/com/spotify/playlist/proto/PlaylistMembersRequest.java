package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tmp0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaylistMembersRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistMembersRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private OptionalLimit limit_;
    private String uri_ = "";

    static {
        PlaylistMembersRequest playlistMembersRequest = new PlaylistMembersRequest();
        DEFAULT_INSTANCE = playlistMembersRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistMembersRequest.class, playlistMembersRequest);
    }

    private PlaylistMembersRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18533n(PlaylistMembersRequest playlistMembersRequest, String str) {
        playlistMembersRequest.getClass();
        str.getClass();
        playlistMembersRequest.uri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static tmp0 m18534o() {
        return (tmp0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "limit_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistMembersRequest();
        }
        if (iOrdinal == 4) {
            return new tmp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistMembersRequest.class) {
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
