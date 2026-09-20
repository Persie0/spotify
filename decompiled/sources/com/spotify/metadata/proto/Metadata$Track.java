package com.spotify.metadata.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x5f0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Track extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_FIELD_NUMBER = 13;
    public static final int ARTIST_FIELD_NUMBER = 4;
    public static final int ARTIST_WITH_ROLE_FIELD_NUMBER = 32;
    public static final int AUDIO_FORMATS_FIELD_NUMBER = 41;
    public static final int AVAILABILITY_FIELD_NUMBER = 19;
    public static final int CANONICAL_URI_FIELD_NUMBER = 36;
    public static final int CONTENT_ACCESS_STATUS_FIELD_NUMBER = 51;
    public static final int CONTENT_RATING_FIELD_NUMBER = 25;
    private static final Metadata$Track DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 6;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int EARLIEST_LIVE_TIMESTAMP_FIELD_NUMBER = 17;
    public static final int EXPLICIT_FIELD_NUMBER = 9;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 10;
    public static final int FILE_FIELD_NUMBER = 12;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int HAS_LYRICS_FIELD_NUMBER = 18;
    public static final int LANGUAGE_OF_PERFORMANCE_FIELD_NUMBER = 22;
    public static final int LICENSOR_FIELD_NUMBER = 21;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 5;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER = 24;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER = 27;
    public static final int ORIGINAL_VIDEO_FIELD_NUMBER = 38;
    private static volatile r2n0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 8;
    public static final int PREVIEW_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 11;
    public static final int SALE_PERIOD_FIELD_NUMBER = 14;
    public static final int TAGS_FIELD_NUMBER = 16;
    public static final int VERSION_TITLE_FIELD_NUMBER = 28;
    private Metadata$Album album_;
    private int bitField0_;
    private Metadata$ContentAccessStatus contentAccessStatus_;
    private int discNumber_;
    private int duration_;
    private long earliestLiveTimestamp_;
    private boolean explicit_;
    private boolean hasLyrics_;
    private Metadata$Licensor licensor_;
    private int number_;
    private Metadata$Audio originalAudio_;
    private int popularity_;
    private gva gid_ = gva.f84678b;
    private String name_ = "";
    private ae50 artist_ = AbstractC0269h.emptyProtobufList();
    private ae50 externalId_ = AbstractC0269h.emptyProtobufList();
    private ae50 restriction_ = AbstractC0269h.emptyProtobufList();
    private ae50 file_ = AbstractC0269h.emptyProtobufList();
    private ae50 alternative_ = AbstractC0269h.emptyProtobufList();
    private ae50 salePeriod_ = AbstractC0269h.emptyProtobufList();
    private ae50 preview_ = AbstractC0269h.emptyProtobufList();
    private ae50 tags_ = AbstractC0269h.emptyProtobufList();
    private ae50 availability_ = AbstractC0269h.emptyProtobufList();
    private ae50 languageOfPerformance_ = AbstractC0269h.emptyProtobufList();
    private ae50 contentRating_ = AbstractC0269h.emptyProtobufList();
    private String originalTitle_ = "";
    private String versionTitle_ = "";
    private ae50 artistWithRole_ = AbstractC0269h.emptyProtobufList();
    private String canonicalUri_ = "";
    private ae50 originalVideo_ = AbstractC0269h.emptyProtobufList();
    private ae50 audioFormats_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$Track metadata$Track = new Metadata$Track();
        DEFAULT_INSTANCE = metadata$Track;
        AbstractC0269h.registerDefaultInstance(Metadata$Track.class, metadata$Track);
    }

    private Metadata$Track() {
    }

    /* JADX INFO: renamed from: p */
    public static Metadata$Track m15447p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static Metadata$Track m15448t(gva gvaVar) {
        return (Metadata$Track) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001e\u0000\u0001\u00013\u001e\u0000\u000e\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0005\bဏ\u0006\tဇ\u0007\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u001a\u0011ဂ\b\u0012ဇ\t\u0013\u001b\u0015ဉ\n\u0016\u001a\u0018ဉ\u000b\u0019\u001b\u001bဈ\f\u001cဈ\r \u001b$ဈ\u000e&\u001b)\u001b3ဉ\u000f", new Object[]{"bitField0_", "gid_", "name_", "album_", "artist_", Metadata$Artist.class, "number_", "discNumber_", "duration_", "popularity_", "explicit_", "externalId_", Metadata$ExternalId.class, "restriction_", Metadata$Restriction.class, "file_", Metadata$AudioFile.class, "alternative_", Metadata$Track.class, "salePeriod_", Metadata$SalePeriod.class, "preview_", Metadata$AudioFile.class, "tags_", "earliestLiveTimestamp_", "hasLyrics_", "availability_", Metadata$Availability.class, "licensor_", "languageOfPerformance_", "originalAudio_", "contentRating_", Metadata$ContentRating.class, "originalTitle_", "versionTitle_", "artistWithRole_", Metadata$ArtistWithRole.class, "canonicalUri_", "originalVideo_", Metadata$Video.class, "audioFormats_", Metadata$TrackAudioFormat.class, "contentAccessStatus_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Track();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 10);
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
        synchronized (Metadata$Track.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final boolean hasAlbum() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final Metadata$Album m15449n() {
        Metadata$Album metadata$Album = this.album_;
        return metadata$Album == null ? Metadata$Album.m15423p() : metadata$Album;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15450o() {
        return this.alternative_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15451q() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: r */
    public final gva m15452r() {
        return this.gid_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m15453s() {
        return this.preview_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
