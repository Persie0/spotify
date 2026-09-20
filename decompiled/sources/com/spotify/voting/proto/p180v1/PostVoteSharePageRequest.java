package com.spotify.voting.proto.p180v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kbq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PostVoteSharePageRequest extends AbstractC0269h implements sre0 {
    private static final PostVoteSharePageRequest DEFAULT_INSTANCE;
    public static final int EPISODE_ID_FIELD_NUMBER = 2;
    public static final int EPISODE_PARTITION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_ID_FIELD_NUMBER = 1;
    private String playlistId_ = "";
    private String episodeId_ = "";
    private String episodePartition_ = "";

    static {
        PostVoteSharePageRequest postVoteSharePageRequest = new PostVoteSharePageRequest();
        DEFAULT_INSTANCE = postVoteSharePageRequest;
        AbstractC0269h.registerDefaultInstance(PostVoteSharePageRequest.class, postVoteSharePageRequest);
    }

    private PostVoteSharePageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22392n(PostVoteSharePageRequest postVoteSharePageRequest, String str) {
        postVoteSharePageRequest.getClass();
        str.getClass();
        postVoteSharePageRequest.episodeId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22393o(PostVoteSharePageRequest postVoteSharePageRequest, String str) {
        postVoteSharePageRequest.getClass();
        str.getClass();
        postVoteSharePageRequest.episodePartition_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22394p(PostVoteSharePageRequest postVoteSharePageRequest, String str) {
        postVoteSharePageRequest.getClass();
        str.getClass();
        postVoteSharePageRequest.playlistId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static kbq0 m22395q() {
        return (kbq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"playlistId_", "episodeId_", "episodePartition_"});
        }
        if (iOrdinal == 3) {
            return new PostVoteSharePageRequest();
        }
        if (iOrdinal == 4) {
            return new kbq0(DEFAULT_INSTANCE);
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
        synchronized (PostVoteSharePageRequest.class) {
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
