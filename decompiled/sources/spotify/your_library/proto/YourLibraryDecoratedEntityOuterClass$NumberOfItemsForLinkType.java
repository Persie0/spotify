package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.hn80;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType extends AbstractC0269h implements sre0 {
    private static final YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType DEFAULT_INSTANCE;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    public static final int NUM_ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int linkType_;
    private int numItems_;

    static {
        YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType = new YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType.class, yourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType);
    }

    private YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"linkType_", "numItems_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 11);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$NumberOfItemsForLinkType.class) {
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

    /* JADX INFO: renamed from: h */
    public final hn80 m98238h() {
        hn80 hn80VarM47999a = hn80.m47999a(this.linkType_);
        return hn80VarM47999a == null ? hn80.UNRECOGNIZED : hn80VarM47999a;
    }

    /* JADX INFO: renamed from: i */
    public final int m98239i() {
        return this.numItems_;
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
