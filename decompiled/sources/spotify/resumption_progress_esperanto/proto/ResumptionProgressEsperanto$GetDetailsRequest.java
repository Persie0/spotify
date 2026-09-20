package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$GetDetailsRequest extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$GetDetailsRequest DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private String pageIdentifier_ = "";

    static {
        ResumptionProgressEsperanto$GetDetailsRequest resumptionProgressEsperanto$GetDetailsRequest = new ResumptionProgressEsperanto$GetDetailsRequest();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetDetailsRequest;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$GetDetailsRequest.class, resumptionProgressEsperanto$GetDetailsRequest);
    }

    private ResumptionProgressEsperanto$GetDetailsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97860n(ResumptionProgressEsperanto$GetDetailsRequest resumptionProgressEsperanto$GetDetailsRequest, Iterable iterable) {
        ae50 ae50Var = resumptionProgressEsperanto$GetDetailsRequest.item_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            resumptionProgressEsperanto$GetDetailsRequest.item_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, resumptionProgressEsperanto$GetDetailsRequest.item_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97861o(ResumptionProgressEsperanto$GetDetailsRequest resumptionProgressEsperanto$GetDetailsRequest, String str) {
        resumptionProgressEsperanto$GetDetailsRequest.getClass();
        str.getClass();
        resumptionProgressEsperanto$GetDetailsRequest.bitField0_ |= 1;
        resumptionProgressEsperanto$GetDetailsRequest.pageIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static dax0 m97862p() {
        return (dax0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000", new Object[]{"bitField0_", "item_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetDetailsRequest();
        }
        if (iOrdinal == 4) {
            return new dax0(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$GetDetailsRequest.class) {
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
