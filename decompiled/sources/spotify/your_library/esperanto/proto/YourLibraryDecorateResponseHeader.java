package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecorateResponseHeader extends AbstractC0269h implements sre0 {
    private static final YourLibraryDecorateResponseHeader DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean isLoading_;

    static {
        YourLibraryDecorateResponseHeader yourLibraryDecorateResponseHeader = new YourLibraryDecorateResponseHeader();
        DEFAULT_INSTANCE = yourLibraryDecorateResponseHeader;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecorateResponseHeader.class, yourLibraryDecorateResponseHeader);
    }

    private YourLibraryDecorateResponseHeader() {
    }

    /* JADX INFO: renamed from: n */
    public static YourLibraryDecorateResponseHeader m98168n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"isLoading_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecorateResponseHeader();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 10);
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
        synchronized (YourLibraryDecorateResponseHeader.class) {
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
    public final boolean m98169o() {
        return this.isLoading_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
