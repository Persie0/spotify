package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d3o0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PinRequest extends AbstractC0269h implements sre0 {
    public static final int AFTER_URI_FIELD_NUMBER = 2;
    public static final int BEFORE_URI_FIELD_NUMBER = 3;
    private static final PinRequest DEFAULT_INSTANCE;
    public static final int FIRST_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private Object position_;
    private int positionCase_ = 0;
    private String uri_ = "";

    static {
        PinRequest pinRequest = new PinRequest();
        DEFAULT_INSTANCE = pinRequest;
        AbstractC0269h.registerDefaultInstance(PinRequest.class, pinRequest);
    }

    private PinRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98131n(PinRequest pinRequest, String str) {
        pinRequest.getClass();
        str.getClass();
        pinRequest.uri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static d3o0 m98132o() {
        return (d3o0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004:\u0000", new Object[]{"position_", "positionCase_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new PinRequest();
        }
        if (iOrdinal == 4) {
            return new d3o0(DEFAULT_INSTANCE);
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
        synchronized (PinRequest.class) {
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
