package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lo50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class IsCuratedItem extends AbstractC0269h implements sre0 {
    private static final IsCuratedItem DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 4;
    public static final int IS_CURATED_FIELD_NUMBER = 2;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean isBanned_;
    private boolean isCurated_;
    private boolean isInCollection_;
    private String uri_ = "";

    static {
        IsCuratedItem isCuratedItem = new IsCuratedItem();
        DEFAULT_INSTANCE = isCuratedItem;
        AbstractC0269h.registerDefaultInstance(IsCuratedItem.class, isCuratedItem);
    }

    private IsCuratedItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98116n(IsCuratedItem isCuratedItem, boolean z) {
        isCuratedItem.isCurated_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m98117o(IsCuratedItem isCuratedItem, boolean z) {
        isCuratedItem.isInCollection_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static IsCuratedItem m98119q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static lo50 m98120r() {
        return (lo50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"uri_", "isCurated_", "isInCollection_", "isBanned_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedItem();
        }
        if (iOrdinal == 4) {
            return new lo50();
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
        synchronized (IsCuratedItem.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final boolean getIsCurated() {
        return this.isCurated_;
    }

    public final boolean getIsInCollection() {
        return this.isInCollection_;
    }

    public final String getUri() {
        return this.uri_;
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
