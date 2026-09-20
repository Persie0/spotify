package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a4f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionGetUnplayedEpisodesRequest extends AbstractC0269h implements sre0 {
    private static final CollectionGetUnplayedEpisodesRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    public static final int FILTER_FIELD_NUMBER = 5;
    public static final int GROUP_FIELD_NUMBER = 6;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SORT_FIELD_NUMBER = 4;
    public static final int START_FIELD_NUMBER = 2;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 7;
    private int bitField0_;
    private CollectionEpisodeDecorationPolicy episodePolicy_;
    private boolean group_;
    private int length_;
    private int start_;
    private int updateThrottling_;
    private String sort_ = "";
    private String filter_ = "";

    static {
        CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest = new CollectionGetUnplayedEpisodesRequest();
        DEFAULT_INSTANCE = collectionGetUnplayedEpisodesRequest;
        AbstractC0269h.registerDefaultInstance(CollectionGetUnplayedEpisodesRequest.class, collectionGetUnplayedEpisodesRequest);
    }

    private CollectionGetUnplayedEpisodesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97506n(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        collectionGetUnplayedEpisodesRequest.getClass();
        collectionGetUnplayedEpisodesRequest.episodePolicy_ = collectionEpisodeDecorationPolicy;
        collectionGetUnplayedEpisodesRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m97507o(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, String str) {
        collectionGetUnplayedEpisodesRequest.getClass();
        str.getClass();
        collectionGetUnplayedEpisodesRequest.filter_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m97508p(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, boolean z) {
        collectionGetUnplayedEpisodesRequest.group_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97509q(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, int i) {
        collectionGetUnplayedEpisodesRequest.length_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m97510r(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, String str) {
        collectionGetUnplayedEpisodesRequest.getClass();
        collectionGetUnplayedEpisodesRequest.sort_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m97511s(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, int i) {
        collectionGetUnplayedEpisodesRequest.start_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m97512t(CollectionGetUnplayedEpisodesRequest collectionGetUnplayedEpisodesRequest, int i) {
        collectionGetUnplayedEpisodesRequest.updateThrottling_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static a4f m97513u() {
        return (a4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u000b", new Object[]{"bitField0_", "episodePolicy_", "start_", "length_", "sort_", "filter_", "group_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetUnplayedEpisodesRequest();
        }
        if (iOrdinal == 4) {
            return new a4f(DEFAULT_INSTANCE);
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
        synchronized (CollectionGetUnplayedEpisodesRequest.class) {
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
