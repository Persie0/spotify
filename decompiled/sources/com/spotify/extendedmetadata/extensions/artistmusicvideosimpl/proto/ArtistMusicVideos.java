package com.spotify.extendedmetadata.extensions.artistmusicvideosimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistMusicVideos extends AbstractC0269h implements sre0 {
    private static final ArtistMusicVideos DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRERELEASE_VIDEO_URIS_FIELD_NUMBER = 3;
    public static final int PROFILE_FILTERED_VIDEO_URIS_FIELD_NUMBER = 2;
    public static final int VIDEO_URIS_FIELD_NUMBER = 1;
    private ae50 videoUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 profileFilteredVideoUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 prereleaseVideoUris_ = AbstractC0269h.emptyProtobufList();

    static {
        ArtistMusicVideos artistMusicVideos = new ArtistMusicVideos();
        DEFAULT_INSTANCE = artistMusicVideos;
        AbstractC0269h.registerDefaultInstance(ArtistMusicVideos.class, artistMusicVideos);
    }

    private ArtistMusicVideos() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ArtistMusicVideos m9828q(byte[] bArr) {
        return (ArtistMusicVideos) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț", new Object[]{"videoUris_", "profileFilteredVideoUris_", "prereleaseVideoUris_"});
        }
        if (iOrdinal == 3) {
            return new ArtistMusicVideos();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 3);
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
        synchronized (ArtistMusicVideos.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m9829n() {
        return this.prereleaseVideoUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m9830o() {
        return this.profileFilteredVideoUris_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m9831p() {
        return this.videoUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
