package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionsEsperanto$CanPlayContentResponse extends AbstractC0269h implements sre0 {
    private static final PermissionsEsperanto$CanPlayContentResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private ae50 result_ = AbstractC0269h.emptyProtobufList();

    static {
        PermissionsEsperanto$CanPlayContentResponse permissionsEsperanto$CanPlayContentResponse = new PermissionsEsperanto$CanPlayContentResponse();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentResponse;
        AbstractC0269h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentResponse.class, permissionsEsperanto$CanPlayContentResponse);
    }

    private PermissionsEsperanto$CanPlayContentResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static PermissionsEsperanto$CanPlayContentResponse m97841p(byte[] bArr) {
        return (PermissionsEsperanto$CanPlayContentResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"result_", PermissionsEsperanto$CanPlayContentResult.class});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentResponse();
        }
        if (iOrdinal == 4) {
            return new hnn0(2);
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
        synchronized (PermissionsEsperanto$CanPlayContentResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final ae50 m97842o() {
        return this.result_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
