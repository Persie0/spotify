package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t5f;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionShow extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 4;
    private static final CollectionShow DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int addTime_;
    private int bitField0_;
    private String link_ = "";
    private ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private ShowPlayState showPlayState_;

    static {
        CollectionShow collectionShow = new CollectionShow();
        DEFAULT_INSTANCE = collectionShow;
        AbstractC0269h.registerDefaultInstance(CollectionShow.class, collectionShow);
    }

    private CollectionShow() {
    }

    /* JADX INFO: renamed from: o */
    public static CollectionShow m97520o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005Ȉ", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "addTime_", "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionShow();
        }
        if (iOrdinal == 4) {
            return new t5f();
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
        synchronized (CollectionShow.class) {
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

    public final String getLink() {
        return this.link_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ShowCollectionState m97521p() {
        ShowCollectionState showCollectionState = this.showCollectionState_;
        return showCollectionState == null ? ShowCollectionState.getDefaultInstance() : showCollectionState;
    }

    /* JADX INFO: renamed from: q */
    public final ShowMetadata m97522q() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final ShowPlayState m97523r() {
        ShowPlayState showPlayState = this.showPlayState_;
        return showPlayState == null ? ShowPlayState.getDefaultInstance() : showPlayState;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97524s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
