package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.dbd0;
import p204p.gva;
import p204p.h5f0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Album extends AbstractC0269h implements sre0 {
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_FIELD_NUMBER = 23;
    public static final int COPYRIGHT_FIELD_NUMBER = 13;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int COVER_GROUP_FIELD_NUMBER = 17;
    public static final int DATE_FIELD_NUMBER = 6;
    private static final Metadata$Album DEFAULT_INSTANCE;
    public static final int DELIVERY_ID_FIELD_NUMBER = 28;
    public static final int DISC_FIELD_NUMBER = 11;
    public static final int EARLIEST_LIVE_TIMESTAMP_FIELD_NUMBER = 22;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 10;
    public static final int FEED_GID_FIELD_NUMBER = 27;
    public static final int GENRE_FIELD_NUMBER = 8;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int INDEX_VERSION_FIELD_NUMBER = 30;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LICENSOR_FIELD_NUMBER = 25;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 29;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER = 18;
    private static volatile r2n0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 7;
    public static final int PRERELEASE_END_DATE_FIELD_NUMBER = 42;
    public static final int RELATED_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 14;
    public static final int REVIEW_FIELD_NUMBER = 12;
    public static final int SALE_PERIOD_FIELD_NUMBER = 16;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 20;
    public static final int VERSION_FIELD_NUMBER = 26;
    public static final int VERSION_TITLE_FIELD_NUMBER = 19;
    public static final int VISIBILITY_BLOCK_FIELD_NUMBER = 21;
    public static final int WINDOWED_TRACK_FIELD_NUMBER = 24;
    private int bitField0_;
    private Metadata$ImageGroup coverGroup_;
    private Metadata$Date date_;
    private long earliestLiveTimestamp_;
    private long indexVersion_;
    private Metadata$Licensor licensor_;
    private int popularity_;
    private long prereleaseEndDate_;
    private long version_;
    private gva gid_ = gva.f84678b;
    private String name_ = "";
    private ae50 artist_ = AbstractC0269h.emptyProtobufList();
    private int type_ = 1;
    private String label_ = "";
    private ae50 genre_ = AbstractC0269h.emptyProtobufList();
    private ae50 cover_ = AbstractC0269h.emptyProtobufList();
    private ae50 externalId_ = AbstractC0269h.emptyProtobufList();
    private ae50 disc_ = AbstractC0269h.emptyProtobufList();
    private ae50 review_ = AbstractC0269h.emptyProtobufList();
    private ae50 copyright_ = AbstractC0269h.emptyProtobufList();
    private ae50 restriction_ = AbstractC0269h.emptyProtobufList();
    private ae50 related_ = AbstractC0269h.emptyProtobufList();
    private ae50 salePeriod_ = AbstractC0269h.emptyProtobufList();
    private String originalTitle_ = "";
    private String versionTitle_ = "";
    private String typeStr_ = "";
    private ae50 visibilityBlock_ = AbstractC0269h.emptyProtobufList();
    private ae50 availability_ = AbstractC0269h.emptyProtobufList();
    private ae50 windowedTrack_ = AbstractC0269h.emptyProtobufList();
    private String feedGid_ = "";
    private String deliveryId_ = "";
    private ae50 localizedName_ = AbstractC0269h.emptyProtobufList();

    static {
        Metadata$Album metadata$Album = new Metadata$Album();
        DEFAULT_INSTANCE = metadata$Album;
        AbstractC0269h.registerDefaultInstance(Metadata$Album.class, metadata$Album);
    }

    private Metadata$Album() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Metadata$Album m15329q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static Metadata$Album m15330v(byte[] bArr) {
        return (Metadata$Album) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001*\u001f\u0000\u000e\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001b\u0004᠌\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဏ\u0005\b\u001a\t\u001b\n\u001b\u000b\u001b\f\u001a\r\u001b\u000e\u001b\u000f\u001b\u0010\u001b\u0011ဉ\u0006\u0012ဈ\u0007\u0013ဈ\b\u0014ဈ\t\u0015\u001b\u0016ဂ\n\u0017\u001b\u0018\u001b\u0019ဉ\u000b\u001aဂ\f\u001bဈ\r\u001cဈ\u000e\u001d\u001b\u001eဂ\u000f*ဂ\u0010", new Object[]{"bitField0_", "gid_", "name_", "artist_", Metadata$Artist.class, "type_", nq6.f157154k, "label_", "date_", "popularity_", "genre_", "cover_", Metadata$Image.class, "externalId_", Metadata$ExternalId.class, "disc_", Metadata$Disc.class, "review_", "copyright_", Metadata$Copyright.class, "restriction_", Metadata$Restriction.class, "related_", Metadata$Album.class, "salePeriod_", Metadata$SalePeriod.class, "coverGroup_", "originalTitle_", "versionTitle_", "typeStr_", "visibilityBlock_", Metadata$Block.class, "earliestLiveTimestamp_", "availability_", Metadata$Availability.class, "windowedTrack_", Metadata$Track.class, "licensor_", "version_", "feedGid_", "deliveryId_", "localizedName_", Metadata$LocalizedString.class, "indexVersion_", "prereleaseEndDate_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Album();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 18);
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
        synchronized (Metadata$Album.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m15331n() {
        return this.availability_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Metadata$ImageGroup m15332o() {
        Metadata$ImageGroup metadata$ImageGroup = this.coverGroup_;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.m15383n() : metadata$ImageGroup;
    }

    /* JADX INFO: renamed from: p */
    public final Metadata$Date m15333p() {
        Metadata$Date metadata$Date = this.date_;
        return metadata$Date == null ? Metadata$Date.m15360o() : metadata$Date;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m15334r() {
        return this.disc_;
    }

    /* JADX INFO: renamed from: s */
    public final gva m15335s() {
        return this.gid_;
    }

    /* JADX INFO: renamed from: t */
    public final long m15336t() {
        return this.prereleaseEndDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final h5f0 m15337u() {
        h5f0 h5f0VarM46685a = h5f0.m46685a(this.type_);
        return h5f0VarM46685a == null ? h5f0.ALBUM : h5f0VarM46685a;
    }
}
