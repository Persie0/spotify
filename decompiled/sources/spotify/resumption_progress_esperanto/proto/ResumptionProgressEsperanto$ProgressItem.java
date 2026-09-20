package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.h4x0;
import p204p.iax0;
import p204p.oax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$ProgressItem extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$ProgressItem DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int RESUME_APPLICABLE_FIELD_NUMBER = 6;
    public static final int STATE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String item_ = "";
    private Timestamp lastPlayedAt_;
    private ResumptionProgressEsperanto$Progress progress_;
    private int result_;
    private boolean resumeApplicable_;
    private int state_;

    static {
        ResumptionProgressEsperanto$ProgressItem resumptionProgressEsperanto$ProgressItem = new ResumptionProgressEsperanto$ProgressItem();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ProgressItem;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ProgressItem.class, resumptionProgressEsperanto$ProgressItem);
    }

    private ResumptionProgressEsperanto$ProgressItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဌ\u0002\u0006ဇ\u0003", new Object[]{"bitField0_", "item_", "result_", "progress_", "lastPlayedAt_", "state_", "resumeApplicable_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ProgressItem();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 16);
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
        synchronized (ResumptionProgressEsperanto$ProgressItem.class) {
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
    public final String m97913n() {
        return this.item_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ResumptionProgressEsperanto$Progress m97914o() {
        ResumptionProgressEsperanto$Progress resumptionProgressEsperanto$Progress = this.progress_;
        return resumptionProgressEsperanto$Progress == null ? ResumptionProgressEsperanto$Progress.m97909n() : resumptionProgressEsperanto$Progress;
    }

    /* JADX INFO: renamed from: p */
    public final iax0 m97915p() {
        iax0 iax0VarM50104a = iax0.m50104a(this.result_);
        return iax0VarM50104a == null ? iax0.UNRECOGNIZED : iax0VarM50104a;
    }

    /* JADX INFO: renamed from: q */
    public final oax0 m97916q() {
        oax0 oax0VarM66583a = oax0.m66583a(this.state_);
        return oax0VarM66583a == null ? oax0.UNRECOGNIZED : oax0VarM66583a;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m97917r() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
