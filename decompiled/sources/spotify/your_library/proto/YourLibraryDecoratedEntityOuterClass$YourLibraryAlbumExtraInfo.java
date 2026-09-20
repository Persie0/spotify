package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ooe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo extends AbstractC0269h implements sre0 {
    public static final int ARTIST_NAME_FIELD_NUMBER = 1;
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo DEFAULT_INSTANCE;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 4;
    public static final int NEW_RELEASE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RELEASE_DATE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 3;
    private String artistName_ = "";
    private String artistUri_ = "";
    private boolean isPremiumOnly_;
    private boolean newRelease_;
    private long releaseDate_;
    private int type_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo() {
    }

    /* JADX INFO: renamed from: o */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo m98240o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0007\u0005\u0007\u0006\u0002", new Object[]{"artistName_", "artistUri_", "type_", "isPremiumOnly_", "newRelease_", "releaseDate_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 12);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryAlbumExtraInfo.class) {
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

    public final boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    /* JADX INFO: renamed from: n */
    public final String m98241n() {
        return this.artistName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m98242p() {
        return this.newRelease_;
    }

    /* JADX INFO: renamed from: q */
    public final ooe1 m98243q() {
        ooe1 ooe1Var;
        int i = this.type_;
        if (i == 0) {
            ooe1Var = ooe1.ALBUM;
        } else if (i == 1) {
            ooe1Var = ooe1.SINGLE;
        } else if (i != 2) {
            ooe1Var = i != 3 ? null : ooe1.EP;
        } else {
            ooe1Var = ooe1.COMPILATION;
        }
        return ooe1Var == null ? ooe1.UNRECOGNIZED : ooe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
