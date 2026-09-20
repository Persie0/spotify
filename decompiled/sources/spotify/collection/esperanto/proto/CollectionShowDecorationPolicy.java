package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u5f;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionShowDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 3;
    public static final int DECORATED_FIELD_NUMBER = 4;
    private static final CollectionShowDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 2;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShowCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private ShowPlayedStateDecorationPolicy playedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;

    static {
        CollectionShowDecorationPolicy collectionShowDecorationPolicy = new CollectionShowDecorationPolicy();
        DEFAULT_INSTANCE = collectionShowDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(CollectionShowDecorationPolicy.class, collectionShowDecorationPolicy);
    }

    private CollectionShowDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97525n(CollectionShowDecorationPolicy collectionShowDecorationPolicy, ShowCollectionDecorationPolicy showCollectionDecorationPolicy) {
        collectionShowDecorationPolicy.getClass();
        showCollectionDecorationPolicy.getClass();
        collectionShowDecorationPolicy.collectionPolicy_ = showCollectionDecorationPolicy;
        collectionShowDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m97526o(CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        collectionShowDecorationPolicy.decorated_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m97527p(CollectionShowDecorationPolicy collectionShowDecorationPolicy, ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        collectionShowDecorationPolicy.getClass();
        showPlayedStateDecorationPolicy.getClass();
        collectionShowDecorationPolicy.playedStatePolicy_ = showPlayedStateDecorationPolicy;
        collectionShowDecorationPolicy.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97528q(CollectionShowDecorationPolicy collectionShowDecorationPolicy, ShowDecorationPolicy showDecorationPolicy) {
        collectionShowDecorationPolicy.getClass();
        showDecorationPolicy.getClass();
        collectionShowDecorationPolicy.showPolicy_ = showDecorationPolicy;
        collectionShowDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static u5f m97529r() {
        return (u5f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007", new Object[]{"bitField0_", "showPolicy_", "playedStatePolicy_", "collectionPolicy_", "decorated_"});
        }
        if (iOrdinal == 3) {
            return new CollectionShowDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new u5f(DEFAULT_INSTANCE);
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
        synchronized (CollectionShowDecorationPolicy.class) {
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
