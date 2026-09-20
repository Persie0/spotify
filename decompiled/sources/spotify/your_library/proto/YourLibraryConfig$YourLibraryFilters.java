package spotify.your_library.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.aoe1;
import p204p.boe1;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sic1;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryConfig$YourLibraryFilters extends AbstractC0269h implements sre0 {
    private static final YourLibraryConfig$YourLibraryFilters DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 filter_converter_ = new sic1(1);
    private int filterMemoizedSerializedSize;
    private ud50 filter_ = AbstractC0269h.emptyIntList();

    static {
        YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = new YourLibraryConfig$YourLibraryFilters();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryFilters;
        AbstractC0269h.registerDefaultInstance(YourLibraryConfig$YourLibraryFilters.class, yourLibraryConfig$YourLibraryFilters);
    }

    private YourLibraryConfig$YourLibraryFilters() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m98211n(YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters, List list) {
        ud50 ud50Var = yourLibraryConfig$YourLibraryFilters.filter_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            yourLibraryConfig$YourLibraryFilters.filter_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boe1 boe1Var = (boe1) it.next();
            ((n350) yourLibraryConfig$YourLibraryFilters.filter_).m63581b(boe1Var.getNumber());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m98212o(YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters, boe1 boe1Var) {
        yourLibraryConfig$YourLibraryFilters.getClass();
        boe1Var.getClass();
        ud50 ud50Var = yourLibraryConfig$YourLibraryFilters.filter_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            yourLibraryConfig$YourLibraryFilters.filter_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) yourLibraryConfig$YourLibraryFilters.filter_).m63581b(boe1Var.getNumber());
    }

    /* JADX INFO: renamed from: p */
    public static YourLibraryConfig$YourLibraryFilters m98213p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static aoe1 m98214r() {
        return (aoe1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"filter_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryFilters();
        }
        if (iOrdinal == 4) {
            return new aoe1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibraryFilters.class) {
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

    /* JADX INFO: renamed from: q */
    public final wd50 m98215q() {
        return new wd50(this.filter_, filter_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
