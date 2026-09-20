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
public final class ResumptionProgressEsperanto$ItemDetails extends AbstractC0269h implements sre0 {
    public static final int CURRENT_PROGRESS_FIELD_NUMBER = 3;
    private static final ResumptionProgressEsperanto$ItemDetails DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ResumptionProgressEsperanto$CurrentProgress currentProgress_;
    private String item_ = "";
    private Timestamp lastPlayedAt_;
    private int result_;
    private int state_;

    static {
        ResumptionProgressEsperanto$ItemDetails resumptionProgressEsperanto$ItemDetails = new ResumptionProgressEsperanto$ItemDetails();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemDetails;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ItemDetails.class, resumptionProgressEsperanto$ItemDetails);
    }

    private ResumptionProgressEsperanto$ItemDetails() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001", new Object[]{"bitField0_", "item_", "result_", "currentProgress_", "state_", "lastPlayedAt_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemDetails();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 8);
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
        synchronized (ResumptionProgressEsperanto$ItemDetails.class) {
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
    public final ResumptionProgressEsperanto$CurrentProgress m97883n() {
        ResumptionProgressEsperanto$CurrentProgress resumptionProgressEsperanto$CurrentProgress = this.currentProgress_;
        return resumptionProgressEsperanto$CurrentProgress == null ? ResumptionProgressEsperanto$CurrentProgress.m97857n() : resumptionProgressEsperanto$CurrentProgress;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m97884o() {
        return this.item_;
    }

    /* JADX INFO: renamed from: p */
    public final iax0 m97885p() {
        iax0 iax0VarM50104a = iax0.m50104a(this.result_);
        return iax0VarM50104a == null ? iax0.UNRECOGNIZED : iax0VarM50104a;
    }

    /* JADX INFO: renamed from: q */
    public final oax0 m97886q() {
        oax0 oax0VarM66583a = oax0.m66583a(this.state_);
        return oax0VarM66583a == null ? oax0.UNRECOGNIZED : oax0VarM66583a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
