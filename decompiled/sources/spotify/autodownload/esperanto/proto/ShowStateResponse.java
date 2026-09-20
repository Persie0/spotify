package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowStateResponse extends AbstractC0269h implements sre0 {
    private static final ShowStateResponse DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean enabled_;
    private String uri_ = "";
    private String error_ = "";

    static {
        ShowStateResponse showStateResponse = new ShowStateResponse();
        DEFAULT_INSTANCE = showStateResponse;
        AbstractC0269h.registerDefaultInstance(ShowStateResponse.class, showStateResponse);
    }

    private ShowStateResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowStateResponse m97428o(byte[] bArr) {
        return (ShowStateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"uri_", "enabled_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ShowStateResponse();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 7);
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
        synchronized (ShowStateResponse.class) {
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

    public final boolean getEnabled() {
        return this.enabled_;
    }

    /* JADX INFO: renamed from: n */
    public final String m97429n() {
        return this.error_;
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
