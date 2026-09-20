package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$TimeProgress extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$TimeProgress DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_FIELD_NUMBER = 1;
    public static final int REMAINING_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration duration_;
    private Duration played_;
    private Duration remaining_;

    static {
        ResumptionProgressEsperanto$TimeProgress resumptionProgressEsperanto$TimeProgress = new ResumptionProgressEsperanto$TimeProgress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$TimeProgress;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$TimeProgress.class, resumptionProgressEsperanto$TimeProgress);
    }

    private ResumptionProgressEsperanto$TimeProgress() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "played_", "remaining_", "duration_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$TimeProgress();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 18);
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
        synchronized (ResumptionProgressEsperanto$TimeProgress.class) {
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
