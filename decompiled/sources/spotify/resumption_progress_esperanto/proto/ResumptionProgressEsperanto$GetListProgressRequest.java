package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.eax0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$GetListProgressRequest extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$GetListProgressRequest DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SORT_PARAMS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private ae50 sortParams_ = AbstractC0269h.emptyProtobufList();
    private String pageIdentifier_ = "";

    static {
        ResumptionProgressEsperanto$GetListProgressRequest resumptionProgressEsperanto$GetListProgressRequest = new ResumptionProgressEsperanto$GetListProgressRequest();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetListProgressRequest;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$GetListProgressRequest.class, resumptionProgressEsperanto$GetListProgressRequest);
    }

    private ResumptionProgressEsperanto$GetListProgressRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97866n(ResumptionProgressEsperanto$GetListProgressRequest resumptionProgressEsperanto$GetListProgressRequest, Iterable iterable) {
        ae50 ae50Var = resumptionProgressEsperanto$GetListProgressRequest.item_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            resumptionProgressEsperanto$GetListProgressRequest.item_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, resumptionProgressEsperanto$GetListProgressRequest.item_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97867o(ResumptionProgressEsperanto$GetListProgressRequest resumptionProgressEsperanto$GetListProgressRequest, ArrayList arrayList) {
        ae50 ae50Var = resumptionProgressEsperanto$GetListProgressRequest.sortParams_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            resumptionProgressEsperanto$GetListProgressRequest.sortParams_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, resumptionProgressEsperanto$GetListProgressRequest.sortParams_);
    }

    /* JADX INFO: renamed from: p */
    public static void m97868p(ResumptionProgressEsperanto$GetListProgressRequest resumptionProgressEsperanto$GetListProgressRequest, String str) {
        resumptionProgressEsperanto$GetListProgressRequest.getClass();
        str.getClass();
        resumptionProgressEsperanto$GetListProgressRequest.bitField0_ |= 1;
        resumptionProgressEsperanto$GetListProgressRequest.pageIdentifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static eax0 m97869q() {
        return (eax0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002\u001b\u0003ለ\u0000", new Object[]{"bitField0_", "item_", "sortParams_", ResumptionProgressEsperanto$ListSortParam.class, "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetListProgressRequest();
        }
        if (iOrdinal == 4) {
            return new eax0(DEFAULT_INSTANCE);
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
        synchronized (ResumptionProgressEsperanto$GetListProgressRequest.class) {
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
