package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters2;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryResponseHeader extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_FILTERS_2_FIELD_NUMBER = 22;
    public static final int AVAILABLE_FILTERS_FIELD_NUMBER = 16;
    private static final YourLibraryResponseHeader DEFAULT_INSTANCE;
    public static final int FOLDER_NAME_FIELD_NUMBER = 15;
    public static final int IS_LOADING_FIELD_NUMBER = 12;
    public static final int MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 19;
    public static final int PARENT_FOLDER_URI_FIELD_NUMBER = 20;
    private static volatile r2n0 PARSER = null;
    public static final int PIN_COUNT_FIELD_NUMBER = 18;
    public static final int REMAINING_ENTITIES_FIELD_NUMBER = 9;
    public static final int TAG_INFO_FIELD_NUMBER = 21;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 17;
    private YourLibraryConfig$YourLibraryFilters2 availableFilters2_;
    private YourLibraryConfig$YourLibraryFilters availableFilters_;
    private int bitField0_;
    private boolean isLoading_;
    private int maximumPinnedItems_;
    private int pinCount_;
    private int remainingEntities_;
    private YourLibraryTagInfo tagInfo_;
    private int totalCount_;
    private String folderName_ = "";
    private String parentFolderUri_ = "";

    static {
        YourLibraryResponseHeader yourLibraryResponseHeader = new YourLibraryResponseHeader();
        DEFAULT_INSTANCE = yourLibraryResponseHeader;
        AbstractC0269h.registerDefaultInstance(YourLibraryResponseHeader.class, yourLibraryResponseHeader);
    }

    private YourLibraryResponseHeader() {
    }

    /* JADX INFO: renamed from: o */
    public static YourLibraryResponseHeader m98201o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\t\u0016\n\u0000\u0000\u0000\t\u0004\f\u0007\u000fȈ\u0010ဉ\u0000\u0011\u0004\u0012\u0004\u0013\u0004\u0014Ȉ\u0015ဉ\u0002\u0016ဉ\u0001", new Object[]{"bitField0_", "remainingEntities_", "isLoading_", "folderName_", "availableFilters_", "totalCount_", "pinCount_", "maximumPinnedItems_", "parentFolderUri_", "tagInfo_", "availableFilters2_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryResponseHeader();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 28);
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
        synchronized (YourLibraryResponseHeader.class) {
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
    public final YourLibraryConfig$YourLibraryFilters m98202n() {
        YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = this.availableFilters_;
        return yourLibraryConfig$YourLibraryFilters == null ? YourLibraryConfig$YourLibraryFilters.m98213p() : yourLibraryConfig$YourLibraryFilters;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m98203p() {
        return this.folderName_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m98204q() {
        return this.isLoading_;
    }

    /* JADX INFO: renamed from: r */
    public final int m98205r() {
        return this.maximumPinnedItems_;
    }

    /* JADX INFO: renamed from: s */
    public final YourLibraryTagInfo m98206s() {
        YourLibraryTagInfo yourLibraryTagInfo = this.tagInfo_;
        return yourLibraryTagInfo == null ? YourLibraryTagInfo.m98210n() : yourLibraryTagInfo;
    }

    /* JADX INFO: renamed from: t */
    public final int m98207t() {
        return this.totalCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
