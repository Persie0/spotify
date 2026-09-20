package spotify.transcript_search.p213v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.lzy0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s1d0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRequest extends AbstractC0269h implements sre0 {
    private static final SearchRequest DEFAULT_INSTANCE;
    public static final int MATCH_BOUNDARIES_CONFIG_FIELD_NUMBER = 5;
    public static final int MATCH_START_HIGHLIGHT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 2;
    public static final int TEXT_LINES_FIELD_NUMBER = 1;
    public static final int TIME_OFFSET_HIGHLIGHT_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object highlightConfig_;
    private int matchBoundariesConfig_;
    private int highlightConfigCase_ = 0;
    private ae50 textLines_ = AbstractC0269h.emptyProtobufList();
    private String showUri_ = "";

    static {
        SearchRequest searchRequest = new SearchRequest();
        DEFAULT_INSTANCE = searchRequest;
        AbstractC0269h.registerDefaultInstance(SearchRequest.class, searchRequest);
    }

    private SearchRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98084n(SearchRequest searchRequest, Iterable iterable) {
        ae50 ae50Var = searchRequest.textLines_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            searchRequest.textLines_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, searchRequest.textLines_);
    }

    /* JADX INFO: renamed from: o */
    public static void m98085o(SearchRequest searchRequest, s1d0 s1d0Var) {
        searchRequest.getClass();
        searchRequest.matchBoundariesConfig_ = s1d0Var.getNumber();
        searchRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m98086p(SearchRequest searchRequest, String str) {
        searchRequest.getClass();
        str.getClass();
        searchRequest.bitField0_ |= 1;
        searchRequest.showUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98087q(SearchRequest searchRequest, TimeOffsetHighlight timeOffsetHighlight) {
        searchRequest.getClass();
        timeOffsetHighlight.getClass();
        searchRequest.highlightConfig_ = timeOffsetHighlight;
        searchRequest.highlightConfigCase_ = 4;
    }

    /* JADX INFO: renamed from: r */
    public static lzy0 m98088r() {
        return (lzy0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003<\u0000\u0004<\u0000\u0005ဌ\u0001", new Object[]{"highlightConfig_", "highlightConfigCase_", "bitField0_", "textLines_", "showUri_", MatchHighlight.class, TimeOffsetHighlight.class, "matchBoundariesConfig_"});
        }
        if (iOrdinal == 3) {
            return new SearchRequest();
        }
        if (iOrdinal == 4) {
            return new lzy0(DEFAULT_INSTANCE);
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
        synchronized (SearchRequest.class) {
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
