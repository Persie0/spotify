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
public final class ResumptionProgressEsperanto$ItemResumePointEntry extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$ItemResumePointEntry DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESUME_POINT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private ResumptionProgressEsperanto$ItemResumePoint resumePoint_;
    private String uri_ = "";

    static {
        ResumptionProgressEsperanto$ItemResumePointEntry resumptionProgressEsperanto$ItemResumePointEntry = new ResumptionProgressEsperanto$ItemResumePointEntry();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$ItemResumePointEntry;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$ItemResumePointEntry.class, resumptionProgressEsperanto$ItemResumePointEntry);
    }

    private ResumptionProgressEsperanto$ItemResumePointEntry() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "resumePoint_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$ItemResumePointEntry();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 12);
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
        synchronized (ResumptionProgressEsperanto$ItemResumePointEntry.class) {
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
