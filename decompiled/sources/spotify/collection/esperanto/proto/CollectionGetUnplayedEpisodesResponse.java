package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionGetUnplayedEpisodesResponse extends AbstractC0269h implements sre0 {
    private static final CollectionGetUnplayedEpisodesResponse DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    public static final int LOADING_CONTENT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 3;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private boolean loadingContent_;
    private StatusOuterClass$Status status_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse = new CollectionGetUnplayedEpisodesResponse();
        DEFAULT_INSTANCE = collectionGetUnplayedEpisodesResponse;
        AbstractC0269h.registerDefaultInstance(CollectionGetUnplayedEpisodesResponse.class, collectionGetUnplayedEpisodesResponse);
    }

    private CollectionGetUnplayedEpisodesResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CollectionGetUnplayedEpisodesResponse m97514r(byte[] bArr) {
        return (CollectionGetUnplayedEpisodesResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u000b\u0004\u000b\u0005\u0007", new Object[]{"bitField0_", "status_", "item_", UnplayedEpisodeItem.class, "unfilteredLength_", "unrangedLength_", "loadingContent_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetUnplayedEpisodesResponse();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 1);
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
        synchronized (CollectionGetUnplayedEpisodesResponse.class) {
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
    public final ae50 m97515n() {
        return this.item_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m97516o() {
        return this.loadingContent_;
    }

    /* JADX INFO: renamed from: p */
    public final int m97517p() {
        return this.unfilteredLength_;
    }

    /* JADX INFO: renamed from: q */
    public final int m97518q() {
        return this.unrangedLength_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
