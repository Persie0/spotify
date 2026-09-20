package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tr11;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowStateRequest extends AbstractC0269h implements sre0 {
    private static final ShowStateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int updateThrottling_;
    private String uri_ = "";

    static {
        ShowStateRequest showStateRequest = new ShowStateRequest();
        DEFAULT_INSTANCE = showStateRequest;
        AbstractC0269h.registerDefaultInstance(ShowStateRequest.class, showStateRequest);
    }

    private ShowStateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97425n(ShowStateRequest showStateRequest) {
        showStateRequest.updateThrottling_ = 100;
    }

    /* JADX INFO: renamed from: o */
    public static void m97426o(ShowStateRequest showStateRequest, String str) {
        showStateRequest.getClass();
        str.getClass();
        showStateRequest.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static tr11 m97427p() {
        return (tr11) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"uri_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new ShowStateRequest();
        }
        if (iOrdinal == 4) {
            return new tr11(DEFAULT_INSTANCE);
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
        synchronized (ShowStateRequest.class) {
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
