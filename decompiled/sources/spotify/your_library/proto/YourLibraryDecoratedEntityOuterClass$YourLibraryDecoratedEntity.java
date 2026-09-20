package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.soe1;
import p204p.toe1;
import p204p.uoe1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity extends AbstractC0269h implements uoe1 {
    public static final int ALBUM_FIELD_NUMBER = 2;
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int AUTHOR_FIELD_NUMBER = 17;
    public static final int BOOK_FIELD_NUMBER = 12;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 20;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity DEFAULT_INSTANCE;
    public static final int ENTITY_INFO_FIELD_NUMBER = 1;
    public static final int EVENT_FIELD_NUMBER = 16;
    public static final int FOLDER_FIELD_NUMBER = 6;
    public static final int LOCAL_FILES_FIELD_NUMBER = 11;
    public static final int NEW_EPISODES_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 4;
    public static final int PRERELEASE_FIELD_NUMBER = 15;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int VENUE_FIELD_NUMBER = 19;
    private int bitField0_;
    private int entityCase_ = 0;
    private YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo entityInfo_;
    private Object entity_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = new YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity m98254q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m98255A() {
        return this.entityCase_ == 12;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m98256B() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m98257C() {
        return this.entityCase_ == 6;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m98258D() {
        return this.entityCase_ == 10;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0001\u0001\u0014\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\n<\u0000\u000b<\u0000\f<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"entity_", "entityCase_", "bitField0_", "entityInfo_", YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryArtistExtraInfo.class, C2697xe4161c99.class, YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.class, C2696xb59b5f99.class, C2695x99dcfa9f.class, YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class, C2699x53bf4b87.class, YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryAuthorExtraInfo.class, YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.class, C2694xa58ea99b.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity();
        }
        if (iOrdinal == 4) {
            return new soe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class) {
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

    @Override // p204p.uoe1
    /* JADX INFO: renamed from: e */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo mo78647e() {
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = this.entityInfo_;
        return yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo == null ? YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.m98271n() : yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasAlbum() {
        return this.entityCase_ == 2;
    }

    public final boolean hasArtist() {
        return this.entityCase_ == 3;
    }

    public final boolean hasPlaylist() {
        return this.entityCase_ == 4;
    }

    public final boolean hasShow() {
        return this.entityCase_ == 5;
    }

    /* JADX INFO: renamed from: n */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo m98259n() {
        return this.entityCase_ == 2 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.m98240o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo m98260o() {
        return this.entityCase_ == 12 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.m98244p();
    }

    /* JADX INFO: renamed from: p */
    public final C2694xa58ea99b m98261p() {
        return this.entityCase_ == 20 ? (C2694xa58ea99b) this.entity_ : C2694xa58ea99b.m98250n();
    }

    /* JADX INFO: renamed from: r */
    public final toe1 m98262r() {
        switch (this.entityCase_) {
            case 0:
                return toe1.f222237L0;
            case 1:
            case 7:
            case 8:
            case 9:
            case 13:
            case 14:
            case 18:
            default:
                return null;
            case 2:
                return toe1.f222242a;
            case 3:
                return toe1.f222243b;
            case 4:
                return toe1.f222244c;
            case 5:
                return toe1.f222245d;
            case 6:
                return toe1.f222246e;
            case 10:
                return toe1.f222247f;
            case 11:
                return toe1.f222248g;
            case 12:
                return toe1.f222249h;
            case 15:
                return toe1.f222250i;
            case 16:
                return toe1.f222251t;
            case 17:
                return toe1.f222239X;
            case 19:
                return toe1.f222240Y;
            case 20:
                return toe1.f222241Z;
        }
    }

    /* JADX INFO: renamed from: s */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo m98263s() {
        return this.entityCase_ == 16 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryEventExtraInfo.m98279o();
    }

    /* JADX INFO: renamed from: t */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo m98264t() {
        return this.entityCase_ == 6 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryFolderExtraInfo.m98283n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final C2695x99dcfa9f m98265u() {
        return this.entityCase_ == 11 ? (C2695x99dcfa9f) this.entity_ : C2695x99dcfa9f.m98287n();
    }

    /* JADX INFO: renamed from: v */
    public final C2696xb59b5f99 m98266v() {
        return this.entityCase_ == 10 ? (C2696xb59b5f99) this.entity_ : C2696xb59b5f99.m98289n();
    }

    /* JADX INFO: renamed from: w */
    public final C2697xe4161c99 m98267w() {
        return this.entityCase_ == 4 ? (C2697xe4161c99) this.entity_ : C2697xe4161c99.m98290p();
    }

    /* JADX INFO: renamed from: x */
    public final C2699x53bf4b87 m98268x() {
        return this.entityCase_ == 15 ? (C2699x53bf4b87) this.entity_ : C2699x53bf4b87.m98307o();
    }

    /* JADX INFO: renamed from: y */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo m98269y() {
        return this.entityCase_ == 5 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryShowExtraInfo.m98310o();
    }

    /* JADX INFO: renamed from: z */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo m98270z() {
        return this.entityCase_ == 19 ? (YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo) this.entity_ : YourLibraryDecoratedEntityOuterClass$YourLibraryVenueExtraInfo.m98313p();
    }
}
