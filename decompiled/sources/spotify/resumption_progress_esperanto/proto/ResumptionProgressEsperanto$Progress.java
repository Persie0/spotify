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
public final class ResumptionProgressEsperanto$Progress extends AbstractC0269h implements sre0 {
    public static final int CURRENT_STATE_FIELD_NUMBER = 4;
    private static final ResumptionProgressEsperanto$Progress DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_PERCENTAGE_FIELD_NUMBER = 3;
    public static final int TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int currentState_;
    private int positionPercentage_;
    private int progressCase_ = 0;
    private Object progress_;

    static {
        ResumptionProgressEsperanto$Progress resumptionProgressEsperanto$Progress = new ResumptionProgressEsperanto$Progress();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$Progress;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$Progress.class, resumptionProgressEsperanto$Progress);
    }

    private ResumptionProgressEsperanto$Progress() {
    }

    /* JADX INFO: renamed from: n */
    public static ResumptionProgressEsperanto$Progress m97909n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u000b\u0004ဌ\u0000", new Object[]{"progress_", "progressCase_", "bitField0_", ResumptionProgressEsperanto$TimeProgress.class, ResumptionProgressEsperanto$ItemProgress.class, "positionPercentage_", "currentState_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$Progress();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 15);
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
        synchronized (ResumptionProgressEsperanto$Progress.class) {
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
    public final ResumptionProgressEsperanto$ItemProgress m97910o() {
        return this.progressCase_ == 2 ? (ResumptionProgressEsperanto$ItemProgress) this.progress_ : ResumptionProgressEsperanto$ItemProgress.m97889o();
    }

    /* JADX INFO: renamed from: p */
    public final int m97911p() {
        return this.positionPercentage_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m97912q() {
        return this.progressCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
