package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uon0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionsEsperanto$CanPlayContentRequest extends AbstractC0269h implements sre0 {
    public static final int CALLER_SOURCE_FIELD_NUMBER = 2;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final PermissionsEsperanto$CanPlayContentRequest DEFAULT_INSTANCE;
    public static final int FORCE_FETCH_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private boolean forceFetch_;
    private ae50 contentUri_ = AbstractC0269h.emptyProtobufList();
    private String callerSource_ = "";

    static {
        PermissionsEsperanto$CanPlayContentRequest permissionsEsperanto$CanPlayContentRequest = new PermissionsEsperanto$CanPlayContentRequest();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentRequest;
        AbstractC0269h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentRequest.class, permissionsEsperanto$CanPlayContentRequest);
    }

    private PermissionsEsperanto$CanPlayContentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97836n(PermissionsEsperanto$CanPlayContentRequest permissionsEsperanto$CanPlayContentRequest, Iterable iterable) {
        ae50 ae50Var = permissionsEsperanto$CanPlayContentRequest.contentUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            permissionsEsperanto$CanPlayContentRequest.contentUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, permissionsEsperanto$CanPlayContentRequest.contentUri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97837o(PermissionsEsperanto$CanPlayContentRequest permissionsEsperanto$CanPlayContentRequest, String str) {
        permissionsEsperanto$CanPlayContentRequest.getClass();
        str.getClass();
        permissionsEsperanto$CanPlayContentRequest.callerSource_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m97838p(PermissionsEsperanto$CanPlayContentRequest permissionsEsperanto$CanPlayContentRequest, boolean z) {
        permissionsEsperanto$CanPlayContentRequest.forceFetch_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static uon0 m97839q() {
        return (uon0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\u0007", new Object[]{"contentUri_", "callerSource_", "forceFetch_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentRequest();
        }
        if (iOrdinal == 4) {
            return new uon0(DEFAULT_INSTANCE);
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
        synchronized (PermissionsEsperanto$CanPlayContentRequest.class) {
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
