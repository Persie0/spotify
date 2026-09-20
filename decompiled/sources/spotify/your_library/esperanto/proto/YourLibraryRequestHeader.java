package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kqe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xd50;
import p204p.z110;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryRequestHeader extends AbstractC0269h implements sre0 {
    public static final int ALL_PLAYLISTS_FIELD_NUMBER = 17;
    public static final int CURATED_ITEMS_FIELD_NUMBER = 29;
    private static final YourLibraryRequestHeader DEFAULT_INSTANCE;
    public static final int FILL_FOLDERS_FIELD_NUMBER = 34;
    public static final int FILTERS_FIELD_NUMBER = 14;
    public static final int FOLDER_ID_FIELD_NUMBER = 16;
    public static final int IGNORE_PINNING_FIELD_NUMBER = 26;
    public static final int INCLUDE_AUTHORS_FIELD_NUMBER = 33;
    public static final int INCLUDE_CONCERT_CAMPAIGNS_FIELD_NUMBER = 36;
    public static final int INCLUDE_EVENTS_FIELD_NUMBER = 30;
    public static final int INCLUDE_PRERELEASES_FIELD_NUMBER = 31;
    public static final int INCLUDE_VENUES_FIELD_NUMBER = 35;
    public static final int LENGTH_FIELD_NUMBER = 12;
    public static final int LOWER_BOUND_FIELD_NUMBER = 10;
    public static final int NUM_LINK_TYPES_IN_PLAYLISTS_FIELD_NUMBER = 25;
    private static volatile r2n0 PARSER = null;
    public static final int REMAINING_ENTITIES_FIELD_NUMBER = 9;
    public static final int SEPARATE_PINNED_ITEMS_FIELD_NUMBER = 22;
    public static final int SKIP_FIELD_NUMBER = 11;
    public static final int SORT_ORDER_FIELD_NUMBER = 15;
    public static final int TAG_FILTER_FIELD_NUMBER = 24;
    public static final int TEXT_FILTER_FIELD_NUMBER = 13;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 18;
    public static final int UPPER_BOUND_FIELD_NUMBER = 37;
    private boolean allPlaylists_;
    private int bitField0_;
    private CuratedItems curatedItems_;
    private YourLibraryConfig$YourLibraryFilters filters_;
    private boolean ignorePinning_;
    private boolean includeAuthors_;
    private boolean includeConcertCampaigns_;
    private boolean includeEvents_;
    private boolean includePrereleases_;
    private boolean includeVenues_;
    private int length_;
    private Object maybeFolderId_;
    private Object maybeTagFilter_;
    private boolean numLinkTypesInPlaylists_;
    private boolean remainingEntities_;
    private boolean separatePinnedItems_;
    private int skip_;
    private YourLibraryConfig$YourLibrarySortOrder sortOrder_;
    private boolean totalCount_;
    private int maybeFolderIdCase_ = 0;
    private int maybeTagFilterCase_ = 0;
    private int fillFoldersMemoizedSerializedSize = -1;
    private String lowerBound_ = "";
    private String upperBound_ = "";
    private String textFilter_ = "";
    private xd50 fillFolders_ = AbstractC0269h.emptyLongList();

    static {
        YourLibraryRequestHeader yourLibraryRequestHeader = new YourLibraryRequestHeader();
        DEFAULT_INSTANCE = yourLibraryRequestHeader;
        AbstractC0269h.registerDefaultInstance(YourLibraryRequestHeader.class, yourLibraryRequestHeader);
    }

    private YourLibraryRequestHeader() {
    }

    /* JADX INFO: renamed from: A */
    public static void m98174A(YourLibraryRequestHeader yourLibraryRequestHeader, int i) {
        yourLibraryRequestHeader.skip_ = i;
    }

    /* JADX INFO: renamed from: B */
    public static void m98175B(YourLibraryRequestHeader yourLibraryRequestHeader, YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder) {
        yourLibraryRequestHeader.getClass();
        yourLibraryConfig$YourLibrarySortOrder.getClass();
        yourLibraryRequestHeader.sortOrder_ = yourLibraryConfig$YourLibrarySortOrder;
        yourLibraryRequestHeader.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: C */
    public static void m98176C(YourLibraryRequestHeader yourLibraryRequestHeader, YourLibraryTagFilter yourLibraryTagFilter) {
        yourLibraryRequestHeader.getClass();
        yourLibraryTagFilter.getClass();
        yourLibraryRequestHeader.maybeTagFilter_ = yourLibraryTagFilter;
        yourLibraryRequestHeader.maybeTagFilterCase_ = 24;
    }

    /* JADX INFO: renamed from: D */
    public static void m98177D(YourLibraryRequestHeader yourLibraryRequestHeader, String str) {
        yourLibraryRequestHeader.getClass();
        str.getClass();
        yourLibraryRequestHeader.textFilter_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m98178E(YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequestHeader.totalCount_ = true;
    }

    /* JADX INFO: renamed from: G */
    public static kqe1 m98179G() {
        return (kqe1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m98180n(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.allPlaylists_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m98181o(YourLibraryRequestHeader yourLibraryRequestHeader, CuratedItems curatedItems) {
        yourLibraryRequestHeader.getClass();
        curatedItems.getClass();
        yourLibraryRequestHeader.curatedItems_ = curatedItems;
        yourLibraryRequestHeader.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m98182p(YourLibraryRequestHeader yourLibraryRequestHeader, YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters) {
        yourLibraryRequestHeader.getClass();
        yourLibraryConfig$YourLibraryFilters.getClass();
        yourLibraryRequestHeader.filters_ = yourLibraryConfig$YourLibraryFilters;
        yourLibraryRequestHeader.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98183q(YourLibraryRequestHeader yourLibraryRequestHeader, long j) {
        yourLibraryRequestHeader.maybeFolderIdCase_ = 16;
        yourLibraryRequestHeader.maybeFolderId_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: r */
    public static void m98184r(YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequestHeader.ignorePinning_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static void m98185s(YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequestHeader.includeAuthors_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m98186t(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.includeConcertCampaigns_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m98187u(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.includeEvents_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m98188v(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.includePrereleases_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m98189w(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.includeVenues_ = z;
    }

    /* JADX INFO: renamed from: x */
    public static void m98190x(YourLibraryRequestHeader yourLibraryRequestHeader, int i) {
        yourLibraryRequestHeader.length_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m98191y(YourLibraryRequestHeader yourLibraryRequestHeader) {
        yourLibraryRequestHeader.numLinkTypesInPlaylists_ = true;
    }

    /* JADX INFO: renamed from: z */
    public static void m98192z(YourLibraryRequestHeader yourLibraryRequestHeader, boolean z) {
        yourLibraryRequestHeader.separatePinnedItems_ = z;
    }

    /* JADX INFO: renamed from: F */
    public final CuratedItems m98193F() {
        CuratedItems curatedItems = this.curatedItems_;
        return curatedItems == null ? CuratedItems.m98114p() : curatedItems;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0002\u0001\t%\u0016\u0000\u0001\u0000\t\u0007\nȈ\u000b\u0004\f\u0004\rȈ\u000eဉ\u0000\u000fဉ\u0001\u00105\u0000\u0011\u0007\u0012\u0007\u0016\u0007\u0018<\u0001\u0019\u0007\u001a\u0007\u001dဉ\u0002\u001e\u0007\u001f\u0007!\u0007\"%#\u0007$\u0007%Ȉ", new Object[]{"maybeFolderId_", "maybeFolderIdCase_", "maybeTagFilter_", "maybeTagFilterCase_", "bitField0_", "remainingEntities_", "lowerBound_", "skip_", "length_", "textFilter_", "filters_", "sortOrder_", "allPlaylists_", "totalCount_", "separatePinnedItems_", YourLibraryTagFilter.class, "numLinkTypesInPlaylists_", "ignorePinning_", "curatedItems_", "includeEvents_", "includePrereleases_", "includeAuthors_", "fillFolders_", "includeVenues_", "includeConcertCampaigns_", "upperBound_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryRequestHeader();
        }
        if (iOrdinal == 4) {
            return new kqe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryRequestHeader.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
