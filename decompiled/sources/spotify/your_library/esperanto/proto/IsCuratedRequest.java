package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.mo50;
import p204p.no50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class IsCuratedRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final IsCuratedRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int filter_;
    private int updateThrottling_;
    private ae50 uri_ = AbstractC0269h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        IsCuratedRequest isCuratedRequest = new IsCuratedRequest();
        DEFAULT_INSTANCE = isCuratedRequest;
        AbstractC0269h.registerDefaultInstance(IsCuratedRequest.class, isCuratedRequest);
    }

    private IsCuratedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98121n(IsCuratedRequest isCuratedRequest, Iterable iterable) {
        ae50 ae50Var = isCuratedRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            isCuratedRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, isCuratedRequest.uri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m98122o(IsCuratedRequest isCuratedRequest, String str) {
        isCuratedRequest.getClass();
        str.getClass();
        ae50 ae50Var = isCuratedRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            isCuratedRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        isCuratedRequest.uri_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m98123p(IsCuratedRequest isCuratedRequest, String str) {
        isCuratedRequest.getClass();
        str.getClass();
        isCuratedRequest.contextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98124q(IsCuratedRequest isCuratedRequest, no50 no50Var) {
        isCuratedRequest.getClass();
        isCuratedRequest.filter_ = no50Var.getNumber();
    }

    /* JADX INFO: renamed from: r */
    public static mo50 m98125r() {
        return (mo50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ț\u0003Ȉ\u0004\f", new Object[]{"updateThrottling_", "uri_", "contextUri_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedRequest();
        }
        if (iOrdinal == 4) {
            return new mo50(DEFAULT_INSTANCE);
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
        synchronized (IsCuratedRequest.class) {
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
