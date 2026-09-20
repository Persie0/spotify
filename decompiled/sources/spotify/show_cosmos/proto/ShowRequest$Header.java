package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tq11;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowRequest$Header extends AbstractC0269h implements sre0 {
    private static final ShowRequest$Header DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int SHOW_METADATA_FIELD_NUMBER = 1;
    public static final int SHOW_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int SHOW_PLAY_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowShowState$ShowCollectionState showCollectionState_;
    private ShowMetadata showMetadata_;
    private ShowOfflineStateOuterClass$ShowOfflineState showOfflineState_;
    private ShowPlayState showPlayState_;

    static {
        ShowRequest$Header showRequest$Header = new ShowRequest$Header();
        DEFAULT_INSTANCE = showRequest$Header;
        AbstractC0269h.registerDefaultInstance(ShowRequest$Header.class, showRequest$Header);
    }

    private ShowRequest$Header() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowRequest$Header m97932n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "showMetadata_", "showCollectionState_", "showPlayState_", "showOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$Header();
        }
        if (iOrdinal == 4) {
            return new tq11(DEFAULT_INSTANCE);
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
        synchronized (ShowRequest$Header.class) {
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

    /* JADX INFO: renamed from: o */
    public final ShowShowState$ShowCollectionState m97933o() {
        ShowShowState$ShowCollectionState showShowState$ShowCollectionState = this.showCollectionState_;
        return showShowState$ShowCollectionState == null ? ShowShowState$ShowCollectionState.m97959n() : showShowState$ShowCollectionState;
    }

    /* JADX INFO: renamed from: p */
    public final ShowMetadata m97934p() {
        ShowMetadata showMetadata = this.showMetadata_;
        return showMetadata == null ? ShowMetadata.getDefaultInstance() : showMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final ShowOfflineStateOuterClass$ShowOfflineState m97935q() {
        ShowOfflineStateOuterClass$ShowOfflineState showOfflineStateOuterClass$ShowOfflineState = this.showOfflineState_;
        return showOfflineStateOuterClass$ShowOfflineState == null ? ShowOfflineStateOuterClass$ShowOfflineState.m97922n() : showOfflineStateOuterClass$ShowOfflineState;
    }

    /* JADX INFO: renamed from: r */
    public final ShowPlayState m97936r() {
        ShowPlayState showPlayState = this.showPlayState_;
        return showPlayState == null ? ShowPlayState.getDefaultInstance() : showPlayState;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97937s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
