package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$ResumePoint extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$ResumePoint DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int RESUME_POINT_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp lastUpdated_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ResumptionProgressEsperanto$ResumePoint resumptionProgressEsperanto$ResumePoint = new ResumptionProgressEsperanto$ResumePoint();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ResumePoint;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ResumePoint.class, resumptionProgressEsperanto$ResumePoint);
    }

    private ResumptionProgressEsperanto$ResumePoint() {
    }

    /* JADX INFO: renamed from: n */
    public static ResumptionProgressEsperanto$ResumePoint m97918n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003<\u0000\u0004Ȼ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", Duration.class, "lastUpdated_", ResumptionProgressEsperanto$ItemResumePointEntry.class});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ResumePoint();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 17);
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
        synchronized (ResumptionProgressEsperanto$ResumePoint.class) {
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

    public final String getUri() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Duration m97919o() {
        return this.valueCase_ == 1 ? (Duration) this.value_ : Duration.m1928p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
