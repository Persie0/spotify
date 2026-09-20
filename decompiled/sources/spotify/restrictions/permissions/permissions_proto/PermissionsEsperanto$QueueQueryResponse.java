package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yon0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionsEsperanto$QueueQueryResponse extends AbstractC0269h implements sre0 {
    private static final PermissionsEsperanto$QueueQueryResponse DEFAULT_INSTANCE;
    public static final int IS_ALLOWED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean isAllowed_;
    private int result_;

    static {
        PermissionsEsperanto$QueueQueryResponse permissionsEsperanto$QueueQueryResponse = new PermissionsEsperanto$QueueQueryResponse();
        DEFAULT_INSTANCE = permissionsEsperanto$QueueQueryResponse;
        AbstractC0269h.registerDefaultInstance(PermissionsEsperanto$QueueQueryResponse.class, permissionsEsperanto$QueueQueryResponse);
    }

    private PermissionsEsperanto$QueueQueryResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static PermissionsEsperanto$QueueQueryResponse m97855p(byte[] bArr) {
        return (PermissionsEsperanto$QueueQueryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"result_", "isAllowed_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$QueueQueryResponse();
        }
        if (iOrdinal == 4) {
            return new hnn0(4);
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
        synchronized (PermissionsEsperanto$QueueQueryResponse.class) {
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
    public final yon0 m97856o() {
        yon0 yon0Var;
        int i = this.result_;
        if (i == 0) {
            yon0Var = yon0.QUEUE_PERMISSION_RESULTS_ALLOWED;
        } else if (i == 1) {
            yon0Var = yon0.QUEUE_PERMISSION_RESULTS_ALLOWED_UNCAPPED_PNS;
        } else if (i != 2) {
            yon0Var = i != 3 ? null : yon0.QUEUE_PERMISSION_RESULTS_DISALLOWED_CAPPED_PNS;
        } else {
            yon0Var = yon0.QUEUE_PERMISSION_RESULTS_DISALLOWED_MFT;
        }
        return yon0Var == null ? yon0.UNRECOGNIZED : yon0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
