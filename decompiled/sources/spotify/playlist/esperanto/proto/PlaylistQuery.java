package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ftp0;
import p204p.hn80;
import p204p.jop0;
import p204p.kop0;
import p204p.n350;
import p204p.oh3;
import p204p.on3;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistQuery extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTE_FILTER_FIELD_NUMBER = 14;
    public static final int BOOL_PREDICATES_FIELD_NUMBER = 1;
    private static final PlaylistQuery DEFAULT_INSTANCE;
    public static final int DESCRIPTOR_FILTER_FIELD_NUMBER = 12;
    public static final int DONT_LOAD_ITEM_METADATA_FIELD_NUMBER = 17;
    public static final int GROUP_FIELD_NUMBER = 6;
    public static final int INCLUDE_ALL_PLACEHOLDERS_FIELD_NUMBER = 15;
    public static final int INCLUDE_PREMIUM_CONTENT_FIELD_NUMBER = 9;
    public static final int ITEM_ID_FILTER_FIELD_NUMBER = 13;
    public static final int LANGUAGE_FILTER_FIELD_NUMBER = 18;
    public static final int LENSES_FIELD_NUMBER = 16;
    public static final int LOAD_RECOMMENDATIONS_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDED_SORT_INTERNAL_ID_FIELD_NUMBER = 19;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SHOW_UNAVAILABLE_FIELD_NUMBER = 8;
    public static final int SORT_BY_FIELD_NUMBER = 3;
    public static final int SOURCE_RESTRICTION_FIELD_NUMBER = 7;
    public static final int SUPPORTED_PLACEHOLDER_TYPES_FIELD_NUMBER = 11;
    public static final int TEXT_FILTER_FIELD_NUMBER = 2;
    public static final int UPDATE_THROTTLING_MS_FIELD_NUMBER = 5;
    private static final vd50 boolPredicates_converter_;
    private static final vd50 supportedPlaceholderTypes_converter_;
    private int bitField0_;
    private int boolPredicatesMemoizedSerializedSize;
    private boolean dontLoadItemMetadata_;
    private boolean group_;
    private boolean includeAllPlaceholders_;
    private boolean includePremiumContent_;
    private boolean loadRecommendations_;
    private PlaylistRange range_;
    private boolean showUnavailable_;
    private int sortBy_;
    private int sourceRestriction_;
    private int supportedPlaceholderTypesMemoizedSerializedSize;
    private int updateThrottlingMs_;
    private ud50 boolPredicates_ = AbstractC0269h.emptyIntList();
    private String textFilter_ = "";
    private ud50 supportedPlaceholderTypes_ = AbstractC0269h.emptyIntList();
    private ae50 descriptorFilter_ = AbstractC0269h.emptyProtobufList();
    private String itemIdFilter_ = "";
    private ae50 attributeFilter_ = AbstractC0269h.emptyProtobufList();
    private ae50 lenses_ = AbstractC0269h.emptyProtobufList();
    private ae50 languageFilter_ = AbstractC0269h.emptyProtobufList();
    private String providedSortInternalId_ = "";

    public static final class AttributeFilter extends AbstractC0269h implements sre0 {
        public static final int CONTAINS_ONE_OF_FIELD_NUMBER = 1;
        private static final AttributeFilter DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private ae50 containsOneOf_ = AbstractC0269h.emptyProtobufList();

        static {
            AttributeFilter attributeFilter = new AttributeFilter();
            DEFAULT_INSTANCE = attributeFilter;
            AbstractC0269h.registerDefaultInstance(AttributeFilter.class, attributeFilter);
        }

        private AttributeFilter() {
        }

        /* JADX INFO: renamed from: n */
        public static void m97751n(AttributeFilter attributeFilter, Iterable iterable) {
            ae50 ae50Var = attributeFilter.containsOneOf_;
            if (!((AbstractC1733c9) ae50Var).f35342a) {
                attributeFilter.containsOneOf_ = AbstractC0269h.mutableCopy(ae50Var);
            }
            AbstractC2118m8.addAll(iterable, attributeFilter.containsOneOf_);
        }

        /* JADX INFO: renamed from: o */
        public static C2690a m97752o() {
            return (C2690a) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"containsOneOf_"});
            }
            if (iOrdinal == 3) {
                return new AttributeFilter();
            }
            if (iOrdinal == 4) {
                return new C2690a(DEFAULT_INSTANCE);
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
            synchronized (AttributeFilter.class) {
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

    static {
        int i = 21;
        boolPredicates_converter_ = new oh3(i);
        supportedPlaceholderTypes_converter_ = new on3(i);
        PlaylistQuery playlistQuery = new PlaylistQuery();
        DEFAULT_INSTANCE = playlistQuery;
        AbstractC0269h.registerDefaultInstance(PlaylistQuery.class, playlistQuery);
    }

    private PlaylistQuery() {
    }

    /* JADX INFO: renamed from: A */
    public static void m97729A(PlaylistQuery playlistQuery, ftp0 ftp0Var) {
        playlistQuery.getClass();
        playlistQuery.sourceRestriction_ = ftp0Var.getNumber();
    }

    /* JADX INFO: renamed from: B */
    public static void m97730B(PlaylistQuery playlistQuery, String str) {
        playlistQuery.getClass();
        playlistQuery.textFilter_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m97731C(PlaylistQuery playlistQuery, int i) {
        playlistQuery.updateThrottlingMs_ = i;
    }

    /* JADX INFO: renamed from: E */
    public static PlaylistQuery m97732E() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static C2691b m97733I() {
        return (C2691b) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m97734n(PlaylistQuery playlistQuery, ArrayList arrayList) {
        ud50 ud50Var = playlistQuery.boolPredicates_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playlistQuery.boolPredicates_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jop0 jop0Var = (jop0) it.next();
            ((n350) playlistQuery.boolPredicates_).m63581b(jop0Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m97735o(PlaylistQuery playlistQuery, ArrayList arrayList) {
        ae50 ae50Var = playlistQuery.descriptorFilter_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistQuery.descriptorFilter_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, playlistQuery.descriptorFilter_);
    }

    /* JADX INFO: renamed from: p */
    public static void m97736p(PlaylistQuery playlistQuery, Iterable iterable) {
        ae50 ae50Var = playlistQuery.lenses_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistQuery.lenses_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, playlistQuery.lenses_);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static void m97737q(PlaylistQuery playlistQuery, List list) {
        ud50 ud50Var = playlistQuery.supportedPlaceholderTypes_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playlistQuery.supportedPlaceholderTypes_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hn80 hn80Var = (hn80) it.next();
            ((n350) playlistQuery.supportedPlaceholderTypes_).m63581b(hn80Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m97738r(PlaylistQuery playlistQuery, AttributeFilter attributeFilter) {
        playlistQuery.getClass();
        attributeFilter.getClass();
        ae50 ae50Var = playlistQuery.attributeFilter_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistQuery.attributeFilter_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        playlistQuery.attributeFilter_.add(attributeFilter);
    }

    /* JADX INFO: renamed from: s */
    public static void m97739s(PlaylistQuery playlistQuery) {
        playlistQuery.includeAllPlaceholders_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m97740t(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.includePremiumContent_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m97741u(PlaylistQuery playlistQuery, String str) {
        playlistQuery.getClass();
        playlistQuery.itemIdFilter_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m97742v(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.loadRecommendations_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m97743w(PlaylistQuery playlistQuery, String str) {
        playlistQuery.getClass();
        str.getClass();
        playlistQuery.providedSortInternalId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m97744x(PlaylistQuery playlistQuery, PlaylistRange playlistRange) {
        playlistQuery.getClass();
        playlistRange.getClass();
        playlistQuery.range_ = playlistRange;
        playlistQuery.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: y */
    public static void m97745y(PlaylistQuery playlistQuery, boolean z) {
        playlistQuery.showUnavailable_ = z;
    }

    /* JADX INFO: renamed from: z */
    public static void m97746z(PlaylistQuery playlistQuery, kop0 kop0Var) {
        playlistQuery.getClass();
        playlistQuery.sortBy_ = kop0Var.getNumber();
    }

    /* JADX INFO: renamed from: D */
    public final wd50 m97747D() {
        return new wd50(this.boolPredicates_, boolPredicates_converter_);
    }

    /* JADX INFO: renamed from: F */
    public final ae50 m97748F() {
        return this.descriptorFilter_;
    }

    /* JADX INFO: renamed from: G */
    public final kop0 m97749G() {
        kop0 kop0Var;
        switch (this.sortBy_) {
            case 0:
                kop0Var = kop0.NO_SORT;
                break;
            case 1:
                kop0Var = kop0.ALBUM_ARTIST_NAME_ASC;
                break;
            case 2:
                kop0Var = kop0.ALBUM_ARTIST_NAME_DESC;
                break;
            case 3:
                kop0Var = kop0.TRACK_NUMBER_ASC;
                break;
            case 4:
                kop0Var = kop0.TRACK_NUMBER_DESC;
                break;
            case 5:
                kop0Var = kop0.DISC_NUMBER_ASC;
                break;
            case 6:
                kop0Var = kop0.DISC_NUMBER_DESC;
                break;
            case 7:
                kop0Var = kop0.ALBUM_NAME_ASC;
                break;
            case 8:
                kop0Var = kop0.ALBUM_NAME_DESC;
                break;
            case 9:
                kop0Var = kop0.ARTIST_NAME_ASC;
                break;
            case 10:
                kop0Var = kop0.ARTIST_NAME_DESC;
                break;
            case 11:
                kop0Var = kop0.NAME_ASC;
                break;
            case 12:
                kop0Var = kop0.NAME_DESC;
                break;
            case 13:
                kop0Var = kop0.ADD_TIME_ASC;
                break;
            case 14:
                kop0Var = kop0.ADD_TIME_DESC;
                break;
            case 15:
                kop0Var = kop0.ADDED_BY_ASC;
                break;
            case 16:
                kop0Var = kop0.ADDED_BY_DESC;
                break;
            case 17:
                kop0Var = kop0.DURATION_ASC;
                break;
            case 18:
                kop0Var = kop0.DURATION_DESC;
                break;
            case 19:
                kop0Var = kop0.SHOW_NAME_ASC;
                break;
            case 20:
                kop0Var = kop0.SHOW_NAME_DESC;
                break;
            case 21:
                kop0Var = kop0.PUBLISH_DATE_ASC;
                break;
            case 22:
                kop0Var = kop0.PUBLISH_DATE_DESC;
                break;
            case 23:
                kop0Var = kop0.PROVIDED_ASC;
                break;
            case 24:
                kop0Var = kop0.PROVIDED_DESC;
                break;
            default:
                kop0Var = null;
                break;
        }
        return kop0Var == null ? kop0.UNRECOGNIZED : kop0Var;
    }

    /* JADX INFO: renamed from: H */
    public final String m97750H() {
        return this.textFilter_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0006\u0000\u0001,\u0002Ȉ\u0003\f\u0004ဉ\u0000\u0005\u0004\u0006\u0007\u0007\f\b\u0007\t\u0007\n\u0007\u000b,\fȚ\rȈ\u000e\u001b\u000f\u0007\u0010Ț\u0011\u0007\u0012Ț\u0013Ȉ", new Object[]{"bitField0_", "boolPredicates_", "textFilter_", "sortBy_", "range_", "updateThrottlingMs_", "group_", "sourceRestriction_", "showUnavailable_", "includePremiumContent_", "loadRecommendations_", "supportedPlaceholderTypes_", "descriptorFilter_", "itemIdFilter_", "attributeFilter_", AttributeFilter.class, "includeAllPlaceholders_", "lenses_", "dontLoadItemMetadata_", "languageFilter_", "providedSortInternalId_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistQuery();
        }
        if (iOrdinal == 4) {
            return new C2691b(DEFAULT_INSTANCE);
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
        synchronized (PlaylistQuery.class) {
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
