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
public final class ResumptionProgressEsperanto$ItemResumePoint extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$ItemResumePoint DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int RESUME_POINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int result_;
    private ResumptionProgressEsperanto$ResumePoint resumePoint_;

    static {
        ResumptionProgressEsperanto$ItemResumePoint resumptionProgressEsperanto$ItemResumePoint = new ResumptionProgressEsperanto$ItemResumePoint();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemResumePoint;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ItemResumePoint.class, resumptionProgressEsperanto$ItemResumePoint);
    }

    private ResumptionProgressEsperanto$ItemResumePoint() {
    }

    /* JADX INFO: renamed from: n */
    public static ResumptionProgressEsperanto$ItemResumePoint m97892n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "result_", "resumePoint_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemResumePoint();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 11);
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
        synchronized (ResumptionProgressEsperanto$ItemResumePoint.class) {
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
    public final iax0 m97893o() {
        iax0 iax0VarM50104a = iax0.m50104a(this.result_);
        return iax0VarM50104a == null ? iax0.UNRECOGNIZED : iax0VarM50104a;
    }

    /* JADX INFO: renamed from: p */
    public final ResumptionProgressEsperanto$ResumePoint m97894p() {
        ResumptionProgressEsperanto$ResumePoint resumptionProgressEsperanto$ResumePoint = this.resumePoint_;
        return resumptionProgressEsperanto$ResumePoint == null ? ResumptionProgressEsperanto$ResumePoint.m97918n() : resumptionProgressEsperanto$ResumePoint;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m97895q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
