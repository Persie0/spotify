package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionDecorateResponse extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 4;
    public static final int ARTIST_FIELD_NUMBER = 5;
    private static final CollectionDecorateResponse DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 6;
    private int bitField0_;
    private StatusOuterClass$Status status_;
    private ae50 show_ = AbstractC0269h.emptyProtobufList();
    private ae50 episode_ = AbstractC0269h.emptyProtobufList();
    private ae50 album_ = AbstractC0269h.emptyProtobufList();
    private ae50 artist_ = AbstractC0269h.emptyProtobufList();
    private ae50 track_ = AbstractC0269h.emptyProtobufList();

    static {
        CollectionDecorateResponse collectionDecorateResponse = new CollectionDecorateResponse();
        DEFAULT_INSTANCE = collectionDecorateResponse;
        AbstractC0269h.registerDefaultInstance(CollectionDecorateResponse.class, collectionDecorateResponse);
    }

    private CollectionDecorateResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static CollectionDecorateResponse m97478u(byte[] bArr) {
        return (CollectionDecorateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "status_", "show_", CollectionShow.class, "episode_", CollectionEpisode.class, "album_", CollectionAlbum.class, "artist_", CollectionArtist.class, "track_", CollectionTrack.class});
        }
        if (iOrdinal == 3) {
            return new CollectionDecorateResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(29);
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
        synchronized (CollectionDecorateResponse.class) {
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

    public final int getArtistCount() {
        return this.artist_.size();
    }

    public final List getArtistList() {
        return this.artist_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CollectionArtist m97479o() {
        return (CollectionArtist) this.artist_.get(0);
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m97480p() {
        return this.episode_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m97481q() {
        return this.show_;
    }

    /* JADX INFO: renamed from: r */
    public final StatusOuterClass$Status m97482r() {
        StatusOuterClass$Status statusOuterClass$Status = this.status_;
        return statusOuterClass$Status == null ? StatusOuterClass$Status.m97549p() : statusOuterClass$Status;
    }

    /* JADX INFO: renamed from: s */
    public final int m97483s() {
        return this.track_.size();
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m97484t() {
        return this.track_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
