package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ese1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryTagFilter extends AbstractC0269h implements sre0 {
    private static final YourLibraryTagFilter DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_URI_FIELD_NUMBER = 1;
    private String tagUri_ = "";

    static {
        YourLibraryTagFilter yourLibraryTagFilter = new YourLibraryTagFilter();
        DEFAULT_INSTANCE = yourLibraryTagFilter;
        AbstractC0269h.registerDefaultInstance(YourLibraryTagFilter.class, yourLibraryTagFilter);
    }

    private YourLibraryTagFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98208n(YourLibraryTagFilter yourLibraryTagFilter, String str) {
        yourLibraryTagFilter.getClass();
        str.getClass();
        yourLibraryTagFilter.tagUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static ese1 m98209o() {
        return (ese1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"tagUri_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryTagFilter();
        }
        if (iOrdinal == 4) {
            return new ese1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryTagFilter.class) {
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
