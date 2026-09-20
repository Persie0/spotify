package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ew2;
import p204p.gw2;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Album extends AbstractC0269h implements sre0 {
    public static final int ALBUM_ARTISTS_FIELD_NUMBER = 7;
    public static final int ARTIST_NAMES_FIELD_NUMBER = 1;
    private static final Album DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 10;
    public static final int FOLLOWERSCOUNT_FIELD_NUMBER = 8;
    public static final int MOGEF19_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 9;
    public static final int RELEASE_SIGNIFIER_TEXT_FIELD_NUMBER = 11;
    public static final int RELEASE_TIME_FIELD_NUMBER = 5;
    public static final int RELEASE_YEAR_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int USER_COUNTRY_RELEASE_ISO_TIME_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean explicit_;
    private long followersCount_;
    private boolean mogef19_;
    private boolean premiumOnly_;
    private Timestamp releaseTime_;
    private int releaseYear_;
    private int state_;
    private int type_;
    private ae50 artistNames_ = AbstractC0269h.emptyProtobufList();
    private String userCountryReleaseIsoTime_ = "";
    private ae50 albumArtists_ = AbstractC0269h.emptyProtobufList();
    private String releaseSignifierText_ = "";

    static {
        Album album = new Album();
        DEFAULT_INSTANCE = album;
        AbstractC0269h.registerDefaultInstance(Album.class, album);
    }

    private Album() {
    }

    /* JADX INFO: renamed from: o */
    public static Album m20732o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ț\u0002\f\u0003\u0004\u0004\f\u0005ဉ\u0000\u0006Ȉ\u0007\u001b\b\u0002\t\u0007\n\u0007\u000bȈ\f\u0007", new Object[]{"bitField0_", "artistNames_", "type_", "releaseYear_", "state_", "releaseTime_", "userCountryReleaseIsoTime_", "albumArtists_", RelatedEntity.class, "followersCount_", "premiumOnly_", "explicit_", "releaseSignifierText_", "mogef19_"});
        }
        if (iOrdinal == 3) {
            return new Album();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 29);
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
        synchronized (Album.class) {
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
    public final ae50 m20733n() {
        return this.albumArtists_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20734p() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20735q() {
        return this.mogef19_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20736r() {
        return this.premiumOnly_;
    }

    /* JADX INFO: renamed from: s */
    public final ew2 m20737s() {
        ew2 ew2Var;
        int i = this.state_;
        if (i == 0) {
            ew2Var = ew2.UNKNOWN;
        } else if (i != 1) {
            ew2Var = i != 2 ? null : ew2.LIVE;
        } else {
            ew2Var = ew2.PRERELEASE;
        }
        return ew2Var == null ? ew2.UNRECOGNIZED : ew2Var;
    }

    /* JADX INFO: renamed from: t */
    public final gw2 m20738t() {
        gw2 gw2Var;
        switch (this.type_) {
            case 0:
                gw2Var = gw2.UNDEFINED;
                break;
            case 1:
                gw2Var = gw2.ALBUM;
                break;
            case 2:
                gw2Var = gw2.SINGLE;
                break;
            case 3:
                gw2Var = gw2.COMPILATION;
                break;
            case 4:
                gw2Var = gw2.EP;
                break;
            case 5:
                gw2Var = gw2.AUDIOBOOK;
                break;
            case 6:
                gw2Var = gw2.PODCAST;
                break;
            default:
                gw2Var = null;
                break;
        }
        return gw2Var == null ? gw2.UNRECOGNIZED : gw2Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m20739u() {
        return this.userCountryReleaseIsoTime_;
    }
}
