package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.noe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.voe1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 11;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo DEFAULT_INSTANCE;
    public static final int GROUP_LABEL_FIELD_NUMBER = 5;
    public static final int HAS_CURATED_ITEMS_FIELD_NUMBER = 13;
    public static final int IMAGE_URI_FIELD_NUMBER = 6;
    public static final int LAST_PLAYED_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFLINE_AVAILABILITY_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PINNABLE_FIELD_NUMBER = 8;
    public static final int PINNED_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 3;
    private long addTime_;
    private boolean hasCuratedItems_;
    private long lastPlayed_;
    private int offlineAvailability_;
    private int pinnable_;
    private boolean pinned_;
    private String name_ = "";
    private String uri_ = "";
    private String groupLabel_ = "";
    private String imageUri_ = "";

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo m98271n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\f\t\f\u000b\u0002\f\u0002\r\u0007", new Object[]{"name_", "uri_", "groupLabel_", "imageUri_", "pinned_", "pinnable_", "offlineAvailability_", "addTime_", "lastPlayed_", "hasCuratedItems_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 17);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m98272o() {
        return this.groupLabel_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m98273p() {
        return this.hasCuratedItems_;
    }

    /* JADX INFO: renamed from: q */
    public final String m98274q() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: r */
    public final long m98275r() {
        return this.lastPlayed_;
    }

    /* JADX INFO: renamed from: s */
    public final noe1 m98276s() {
        noe1 noe1Var;
        int i = this.offlineAvailability_;
        if (i == 0) {
            noe1Var = noe1.UNKNOWN;
        } else if (i == 1) {
            noe1Var = noe1.NO;
        } else if (i == 2) {
            noe1Var = noe1.YES;
        } else if (i != 3) {
            noe1Var = i != 4 ? null : noe1.WAITING;
        } else {
            noe1Var = noe1.DOWNLOADING;
        }
        return noe1Var == null ? noe1.UNRECOGNIZED : noe1Var;
    }

    /* JADX INFO: renamed from: t */
    public final voe1 m98277t() {
        voe1 voe1Var;
        int i = this.pinnable_;
        if (i == 0) {
            voe1Var = voe1.YES;
        } else if (i != 1) {
            voe1Var = i != 2 ? null : voe1.NOT_VALID_TYPE;
        } else {
            voe1Var = voe1.NO_IN_FOLDER;
        }
        return voe1Var == null ? voe1.UNRECOGNIZED : voe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m98278u() {
        return this.pinned_;
    }
}
