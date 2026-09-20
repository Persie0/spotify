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
import p204p.uev0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendationsProto$ItemSpecificRecommendationsRequest extends AbstractC0269h implements sre0 {
    public static final int CURATION_URI_FIELD_NUMBER = 2;
    private static final RecommendationsProto$ItemSpecificRecommendationsRequest DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    public static final int LIMIT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SEED_URIS_FIELD_NUMBER = 4;
    public static final int SKIP_ITEM_URIS_FIELD_NUMBER = 5;
    public static final int SUGGESTED_AUDIOBOOKS_FIELD_NUMBER = 9;
    public static final int SUGGESTED_BY_GENRE_FIELD_NUMBER = 8;
    public static final int SUGGESTED_EPISODES_FIELD_NUMBER = 7;
    public static final int SUGGESTED_TRACKS_FIELD_NUMBER = 6;
    private int limit_;
    private Object type_;
    private int typeCase_ = 0;
    private String itemUri_ = "";
    private String curationUri_ = "";
    private ae50 seedUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 skipItemUris_ = AbstractC0269h.emptyProtobufList();

    static {
        RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest = new RecommendationsProto$ItemSpecificRecommendationsRequest();
        DEFAULT_INSTANCE = recommendationsProto$ItemSpecificRecommendationsRequest;
        AbstractC0269h.registerDefaultInstance(RecommendationsProto$ItemSpecificRecommendationsRequest.class, recommendationsProto$ItemSpecificRecommendationsRequest);
    }

    private RecommendationsProto$ItemSpecificRecommendationsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3343n(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, Iterable iterable) {
        ae50 ae50Var = recommendationsProto$ItemSpecificRecommendationsRequest.seedUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            recommendationsProto$ItemSpecificRecommendationsRequest.seedUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, recommendationsProto$ItemSpecificRecommendationsRequest.seedUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m3344o(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, Iterable iterable) {
        ae50 ae50Var = recommendationsProto$ItemSpecificRecommendationsRequest.skipItemUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            recommendationsProto$ItemSpecificRecommendationsRequest.skipItemUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, recommendationsProto$ItemSpecificRecommendationsRequest.skipItemUris_);
    }

    /* JADX INFO: renamed from: p */
    public static void m3345p(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, String str) {
        recommendationsProto$ItemSpecificRecommendationsRequest.getClass();
        str.getClass();
        recommendationsProto$ItemSpecificRecommendationsRequest.curationUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3346q(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, String str) {
        recommendationsProto$ItemSpecificRecommendationsRequest.getClass();
        str.getClass();
        recommendationsProto$ItemSpecificRecommendationsRequest.itemUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m3347r(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, int i) {
        recommendationsProto$ItemSpecificRecommendationsRequest.limit_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m3348s(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, RecommendationsProto$SuggestedAudiobooks recommendationsProto$SuggestedAudiobooks) {
        recommendationsProto$ItemSpecificRecommendationsRequest.getClass();
        recommendationsProto$SuggestedAudiobooks.getClass();
        recommendationsProto$ItemSpecificRecommendationsRequest.type_ = recommendationsProto$SuggestedAudiobooks;
        recommendationsProto$ItemSpecificRecommendationsRequest.typeCase_ = 9;
    }

    /* JADX INFO: renamed from: t */
    public static void m3349t(RecommendationsProto$ItemSpecificRecommendationsRequest recommendationsProto$ItemSpecificRecommendationsRequest, RecommendationsProto$SuggestedEpisodes recommendationsProto$SuggestedEpisodes) {
        recommendationsProto$ItemSpecificRecommendationsRequest.getClass();
        recommendationsProto$SuggestedEpisodes.getClass();
        recommendationsProto$ItemSpecificRecommendationsRequest.type_ = recommendationsProto$SuggestedEpisodes;
        recommendationsProto$ItemSpecificRecommendationsRequest.typeCase_ = 7;
    }

    /* JADX INFO: renamed from: u */
    public static uev0 m3350u() {
        return (uev0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ț\u0005Ț\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"type_", "typeCase_", "itemUri_", "curationUri_", "limit_", "seedUris_", "skipItemUris_", RecommendationsProto$SuggestedTracks.class, RecommendationsProto$SuggestedEpisodes.class, RecommendationsProto$SuggestedByGenre.class, RecommendationsProto$SuggestedAudiobooks.class});
        }
        if (iOrdinal == 3) {
            return new RecommendationsProto$ItemSpecificRecommendationsRequest();
        }
        if (iOrdinal == 4) {
            return new uev0(DEFAULT_INSTANCE);
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
        synchronized (RecommendationsProto$ItemSpecificRecommendationsRequest.class) {
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
