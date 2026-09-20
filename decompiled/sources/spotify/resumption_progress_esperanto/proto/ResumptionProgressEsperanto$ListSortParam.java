package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$ListSortParam extends AbstractC0269h implements sre0 {
    public static final int ASCENDING_FIELD_NUMBER = 2;
    private static final ResumptionProgressEsperanto$ListSortParam DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean ascending_;
    private String field_ = "";

    static {
        ResumptionProgressEsperanto$ListSortParam resumptionProgressEsperanto$ListSortParam = new ResumptionProgressEsperanto$ListSortParam();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ListSortParam;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ListSortParam.class, resumptionProgressEsperanto$ListSortParam);
    }

    private ResumptionProgressEsperanto$ListSortParam() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97896n(ResumptionProgressEsperanto$ListSortParam resumptionProgressEsperanto$ListSortParam, boolean z) {
        resumptionProgressEsperanto$ListSortParam.ascending_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m97897o(ResumptionProgressEsperanto$ListSortParam resumptionProgressEsperanto$ListSortParam, String str) {
        resumptionProgressEsperanto$ListSortParam.getClass();
        resumptionProgressEsperanto$ListSortParam.field_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static jax0 m97898p() {
        return (jax0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"field_", "ascending_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ListSortParam();
        }
        if (iOrdinal == 4) {
            return new jax0(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$ListSortParam.class) {
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
