package com.spotify.search.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.search.proto.OfflineAlbum;
import com.spotify.search.proto.OfflineAudioEpisode;
import com.spotify.search.proto.OfflinePlaylist;
import com.spotify.search.proto.OfflineTrack;
import java.util.List;
import p204p.ae50;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineSearchResponse extends AbstractC0269h implements sre0 {
    public static final int ALBUMS_FIELD_NUMBER = 1;
    public static final int AUDIO_EPISODES_FIELD_NUMBER = 2;
    private static final OfflineSearchResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLISTS_FIELD_NUMBER = 3;
    public static final int TRACKS_FIELD_NUMBER = 4;
    private ae50 albums_ = AbstractC0269h.emptyProtobufList();
    private ae50 audioEpisodes_ = AbstractC0269h.emptyProtobufList();
    private ae50 playlists_ = AbstractC0269h.emptyProtobufList();
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();

    static {
        OfflineSearchResponse offlineSearchResponse = new OfflineSearchResponse();
        DEFAULT_INSTANCE = offlineSearchResponse;
        AbstractC0269h.registerDefaultInstance(OfflineSearchResponse.class, offlineSearchResponse);
    }

    private OfflineSearchResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static OfflineSearchResponse m20706q(byte[] bArr) {
        return (OfflineSearchResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"albums_", OfflineAlbum.class, "audioEpisodes_", OfflineAudioEpisode.class, "playlists_", OfflinePlaylist.class, "tracks_", OfflineTrack.class});
        }
        if (iOrdinal == 3) {
            return new OfflineSearchResponse();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 26);
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
        synchronized (OfflineSearchResponse.class) {
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

    public final List getTracksList() {
        return this.tracks_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m20707n() {
        return this.albums_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20708o() {
        return this.audioEpisodes_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m20709p() {
        return this.playlists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
