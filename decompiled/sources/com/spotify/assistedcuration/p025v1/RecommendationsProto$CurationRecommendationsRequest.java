package com.spotify.assistedcuration.p025v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tev0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendationsProto$CurationRecommendationsRequest extends AbstractC0269h implements sre0 {
    public static final int CURATION_URI_FIELD_NUMBER = 1;
    private static final RecommendationsProto$CurationRecommendationsRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SEED_URIS_FIELD_NUMBER = 3;
    public static final int SKIP_ITEM_URIS_FIELD_NUMBER = 4;
    public static final int SUGGESTED_AUDIOBOOKS_FIELD_NUMBER = 9;
    public static final int SUGGESTED_BY_GENRE_FIELD_NUMBER = 7;
    public static final int SUGGESTED_EPISODES_FIELD_NUMBER = 6;
    public static final int SUGGESTED_TRACKS_FIELD_NUMBER = 5;
    private int limit_;
    private Object type_;
    private int typeCase_ = 0;
    private String curationUri_ = "";
    private ae50 seedUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 skipItemUris_ = AbstractC0269h.emptyProtobufList();

    static {
        RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest = new RecommendationsProto$CurationRecommendationsRequest();
        DEFAULT_INSTANCE = recommendationsProto$CurationRecommendationsRequest;
        AbstractC0269h.registerDefaultInstance(RecommendationsProto$CurationRecommendationsRequest.class, recommendationsProto$CurationRecommendationsRequest);
    }

    private RecommendationsProto$CurationRecommendationsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3336n(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, Iterable iterable) {
        ae50 ae50Var = recommendationsProto$CurationRecommendationsRequest.seedUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            recommendationsProto$CurationRecommendationsRequest.seedUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, recommendationsProto$CurationRecommendationsRequest.seedUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m3337o(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, Iterable iterable) {
        ae50 ae50Var = recommendationsProto$CurationRecommendationsRequest.skipItemUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            recommendationsProto$CurationRecommendationsRequest.skipItemUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, recommendationsProto$CurationRecommendationsRequest.skipItemUris_);
    }

    /* JADX INFO: renamed from: p */
    public static void m3338p(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, String str) {
        recommendationsProto$CurationRecommendationsRequest.getClass();
        str.getClass();
        recommendationsProto$CurationRecommendationsRequest.curationUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3339q(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, int i) {
        recommendationsProto$CurationRecommendationsRequest.limit_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m3340r(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, RecommendationsProto$SuggestedAudiobooks recommendationsProto$SuggestedAudiobooks) {
        recommendationsProto$CurationRecommendationsRequest.getClass();
        recommendationsProto$SuggestedAudiobooks.getClass();
        recommendationsProto$CurationRecommendationsRequest.type_ = recommendationsProto$SuggestedAudiobooks;
        recommendationsProto$CurationRecommendationsRequest.typeCase_ = 9;
    }

    /* JADX INFO: renamed from: s */
    public static void m3341s(RecommendationsProto$CurationRecommendationsRequest recommendationsProto$CurationRecommendationsRequest, RecommendationsProto$SuggestedEpisodes recommendationsProto$SuggestedEpisodes) {
        recommendationsProto$CurationRecommendationsRequest.getClass();
        recommendationsProto$SuggestedEpisodes.getClass();
        recommendationsProto$CurationRecommendationsRequest.type_ = recommendationsProto$SuggestedEpisodes;
        recommendationsProto$CurationRecommendationsRequest.typeCase_ = 6;
    }

    /* JADX INFO: renamed from: t */
    public static tev0 m3342t() {
        return (tev0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\t\b\u0000\u0002\u0000\u0001Ȉ\u0002\u000b\u0003Ț\u0004Ț\u0005<\u0000\u0006<\u0000\u0007<\u0000\t<\u0000", new Object[]{"type_", "typeCase_", "curationUri_", "limit_", "seedUris_", "skipItemUris_", RecommendationsProto$SuggestedTracks.class, RecommendationsProto$SuggestedEpisodes.class, RecommendationsProto$SuggestedByGenre.class, RecommendationsProto$SuggestedAudiobooks.class});
        }
        if (iOrdinal == 3) {
            return new RecommendationsProto$CurationRecommendationsRequest();
        }
        if (iOrdinal == 4) {
            return new tev0(DEFAULT_INSTANCE);
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
        synchronized (RecommendationsProto$CurationRecommendationsRequest.class) {
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
