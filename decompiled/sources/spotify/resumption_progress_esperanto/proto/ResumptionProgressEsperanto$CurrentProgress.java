package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.h4x0;
import p204p.oax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$CurrentProgress extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$CurrentProgress DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_PERCENTAGE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    public static final int TIME_PLAYED_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration duration_;
    private int positionPercentage_;
    private int state_;
    private Duration timeLeft_;
    private Duration timePlayed_;

    static {
        ResumptionProgressEsperanto$CurrentProgress resumptionProgressEsperanto$CurrentProgress = new ResumptionProgressEsperanto$CurrentProgress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$CurrentProgress;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$CurrentProgress.class, resumptionProgressEsperanto$CurrentProgress);
    }

    private ResumptionProgressEsperanto$CurrentProgress() {
    }

    /* JADX INFO: renamed from: n */
    public static ResumptionProgressEsperanto$CurrentProgress m97857n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\f", new Object[]{"bitField0_", "timeLeft_", "timePlayed_", "duration_", "positionPercentage_", "state_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$CurrentProgress();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 4);
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
        synchronized (ResumptionProgressEsperanto$CurrentProgress.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final oax0 m97858o() {
        oax0 oax0VarM66583a = oax0.m66583a(this.state_);
        return oax0VarM66583a == null ? oax0.UNRECOGNIZED : oax0VarM66583a;
    }

    /* JADX INFO: renamed from: p */
    public final Duration m97859p() {
        Duration duration = this.timePlayed_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
