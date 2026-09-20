package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.gax0;
import p204p.nax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$GetResumePointRequest extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$GetResumePointRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USE_CASE_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int VIEW_FIELD_NUMBER = 4;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String pageIdentifier_ = "";
    private String useCaseIdentifier_ = "";
    private int view_;

    static {
        ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest = new ResumptionProgressEsperanto$GetResumePointRequest();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetResumePointRequest;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$GetResumePointRequest.class, resumptionProgressEsperanto$GetResumePointRequest);
    }

    private ResumptionProgressEsperanto$GetResumePointRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97875n(ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest, Iterable iterable) {
        ae50 ae50Var = resumptionProgressEsperanto$GetResumePointRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            resumptionProgressEsperanto$GetResumePointRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, resumptionProgressEsperanto$GetResumePointRequest.items_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97876o(ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest, String str) {
        resumptionProgressEsperanto$GetResumePointRequest.getClass();
        str.getClass();
        ae50 ae50Var = resumptionProgressEsperanto$GetResumePointRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            resumptionProgressEsperanto$GetResumePointRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        resumptionProgressEsperanto$GetResumePointRequest.items_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m97877p(ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest, String str) {
        resumptionProgressEsperanto$GetResumePointRequest.getClass();
        str.getClass();
        resumptionProgressEsperanto$GetResumePointRequest.pageIdentifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97878q(ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest, String str) {
        resumptionProgressEsperanto$GetResumePointRequest.getClass();
        resumptionProgressEsperanto$GetResumePointRequest.useCaseIdentifier_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m97879r(ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest) {
        resumptionProgressEsperanto$GetResumePointRequest.getClass();
        resumptionProgressEsperanto$GetResumePointRequest.view_ = nax0.RESUME_POINT_VIEW_BASIC.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static gax0 m97880s() {
        return (gax0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"items_", "pageIdentifier_", "useCaseIdentifier_", "view_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetResumePointRequest();
        }
        if (iOrdinal == 4) {
            return new gax0(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$GetResumePointRequest.class) {
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
