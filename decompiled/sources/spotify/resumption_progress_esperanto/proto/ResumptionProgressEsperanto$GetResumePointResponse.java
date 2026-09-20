package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.h4x0;
import p204p.hax0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$GetResumePointResponse extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$GetResumePointResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int RESUME_POINTS_FIELD_NUMBER = 2;
    private int result_;
    private ihc0 resumePoints_ = ihc0.f102235b;

    static {
        ResumptionProgressEsperanto$GetResumePointResponse resumptionProgressEsperanto$GetResumePointResponse = new ResumptionProgressEsperanto$GetResumePointResponse();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetResumePointResponse;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$GetResumePointResponse.class, resumptionProgressEsperanto$GetResumePointResponse);
    }

    private ResumptionProgressEsperanto$GetResumePointResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static ResumptionProgressEsperanto$GetResumePointResponse m97881o(byte[] bArr) {
        return (ResumptionProgressEsperanto$GetResumePointResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"result_", "resumePoints_", hax0.f89294a});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetResumePointResponse();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 7);
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
        synchronized (ResumptionProgressEsperanto$GetResumePointResponse.class) {
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
    public final Map m97882n() {
        return Collections.unmodifiableMap(this.resumePoints_);
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
