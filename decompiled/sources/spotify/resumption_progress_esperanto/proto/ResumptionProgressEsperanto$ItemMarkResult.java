package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.iax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$ItemMarkResult extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$ItemMarkResult DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    private String item_ = "";
    private int result_;

    static {
        ResumptionProgressEsperanto$ItemMarkResult resumptionProgressEsperanto$ItemMarkResult = new ResumptionProgressEsperanto$ItemMarkResult();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemMarkResult;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ItemMarkResult.class, resumptionProgressEsperanto$ItemMarkResult);
    }

    private ResumptionProgressEsperanto$ItemMarkResult() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"item_", "result_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemMarkResult();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 9);
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
        synchronized (ResumptionProgressEsperanto$ItemMarkResult.class) {
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
    public final String m97887n() {
        return this.item_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final iax0 m97888o() {
        iax0 iax0VarM50104a = iax0.m50104a(this.result_);
        return iax0VarM50104a == null ? iax0.UNRECOGNIZED : iax0VarM50104a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
