package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$ItemProgress extends AbstractC0269h implements sre0 {
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final ResumptionProgressEsperanto$ItemProgress DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_FIELD_NUMBER = 2;
    private int current_;
    private int total_;

    static {
        ResumptionProgressEsperanto$ItemProgress resumptionProgressEsperanto$ItemProgress = new ResumptionProgressEsperanto$ItemProgress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemProgress;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ItemProgress.class, resumptionProgressEsperanto$ItemProgress);
    }

    private ResumptionProgressEsperanto$ItemProgress() {
    }

    /* JADX INFO: renamed from: o */
    public static ResumptionProgressEsperanto$ItemProgress m97889o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"current_", "total_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemProgress();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 10);
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
        synchronized (ResumptionProgressEsperanto$ItemProgress.class) {
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
    public final int m97890n() {
        return this.current_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m97891p() {
        return this.total_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
