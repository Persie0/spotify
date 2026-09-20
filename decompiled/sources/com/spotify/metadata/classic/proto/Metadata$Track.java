package com.spotify.metadata.classic.proto;

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
    public static final int AVAILABILITY_FIELD_NUMBER = 19;
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
    public static final int INDEX_VERSION_FIELD_NUMBER = 26;
    public static final int LANGUAGE_OF_PERFORMANCE_FIELD_NUMBER = 22;
    public static final int LICENSOR_FIELD_NUMBER = 21;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 23;
    public static final int LYRICS_COUNTRY_FIELD_NUMBER = 20;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 5;
    public static final int ORIGINAL_AUDIO_FIELD_NUMBER = 24;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER = 27;
    private static volatile r2n0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 8;
    public static final int PREVIEW_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 11;
    public static final int SALE_PERIOD_FIELD_NUMBER = 14;
    public static final int TAGS_FIELD_NUMBER = 16;
    public static final int VERSION_TITLE_FIELD_NUMBER = 28;
    private Metadata$Album album_;
    private int bitField0_;
    private int discNumber_;
    private int duration_;
    private long earliestLiveTimestamp_;
    private boolean explicit_;
    private boolean hasLyrics_;
    private long indexVersion_;
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
    private ae50 lyricsCountry_ = AbstractC0269h.emptyProtobufList();
    private ae50 languageOfPerformance_ = AbstractC0269h.emptyProtobufList();
    private ae50 localizedName_ = AbstractC0269h.emptyProtobufList();
    private ae50 contentRating_ = AbstractC0269h.emptyProtobufList();
    private String originalTitle_ = "";
    private String versionTitle_ = "";
    private ae50 artistWithRole_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$Track metadata$Track = new Metadata$Track();
        DEFAULT_INSTANCE = metadata$Track;
        AbstractC0269h.registerDefaultInstance(Metadata$Track.class, metadata$Track);
    }

    private Metadata$Track() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static Metadata$Track m15395z(byte[] bArr) {
        return (Metadata$Track) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001 \u001d\u0000\u000e\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဏ\u0003\u0006ဏ\u0004\u0007ဏ\u0005\bဏ\u0006\tဇ\u0007\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u001a\u0011ဂ\b\u0012ဇ\t\u0013\u001b\u0014\u001a\u0015ဉ\n\u0016\u001a\u0017\u001b\u0018ဉ\u000b\u0019\u001b\u001aဂ\f\u001bဈ\r\u001cဈ\u000e \u001b", new Object[]{"bitField0_", "gid_", "name_", "album_", "artist_", Metadata$Artist.class, "number_", "discNumber_", "duration_", "popularity_", "explicit_", "externalId_", Metadata$ExternalId.class, "restriction_", Metadata$Restriction.class, "file_", Metadata$AudioFile.class, "alternative_", Metadata$Track.class, "salePeriod_", Metadata$SalePeriod.class, "preview_", Metadata$AudioFile.class, "tags_", "earliestLiveTimestamp_", "hasLyrics_", "availability_", Metadata$Availability.class, "lyricsCountry_", "licensor_", "languageOfPerformance_", "localizedName_", Metadata$LocalizedString.class, "originalAudio_", "contentRating_", Metadata$ContentRating.class, "indexVersion_", "originalTitle_", "versionTitle_", "artistWithRole_", Metadata$ArtistWithRole.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$Track();
        }
        if (iOrdinal == 4) {
            return new x5f0(DEFAULT_INSTANCE, 11);
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

    public final List getArtistList() {
        return this.artist_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final int getDiscNumber() {
        return this.discNumber_;
    }

    public final int getDuration() {
        return this.duration_;
    }

    public final String getName() {
        return this.name_;
    }

    public final int getNumber() {
        return this.number_;
    }

    /* JADX INFO: renamed from: n */
    public final Metadata$Album m15396n() {
        Metadata$Album metadata$Album = this.album_;
        return metadata$Album == null ? Metadata$Album.m15329q() : metadata$Album;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15397o() {
        return this.alternative_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m15398p() {
        return this.artistWithRole_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m15399q() {
        return this.availability_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m15400r() {
        return this.contentRating_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15401s() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m15402t() {
        return this.externalId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m15403u() {
        return this.file_;
    }

    /* JADX INFO: renamed from: v */
    public final gva m15404v() {
        return this.gid_;
    }

    /* JADX INFO: renamed from: w */
    public final String m15405w() {
        return this.originalTitle_;
    }

    /* JADX INFO: renamed from: x */
    public final ae50 m15406x() {
        return this.preview_;
    }

    /* JADX INFO: renamed from: y */
    public final String m15407y() {
        return this.versionTitle_;
    }
}
