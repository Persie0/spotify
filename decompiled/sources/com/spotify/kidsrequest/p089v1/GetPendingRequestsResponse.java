package com.spotify.kidsrequest.p089v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetPendingRequestsResponse extends AbstractC0269h implements sre0 {
    public static final int CHILD_DISPLAY_NAME_FIELD_NUMBER = 1;
    private static final GetPendingRequestsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTS_FIELD_NUMBER = 2;
    private String childDisplayName_ = "";
    private ae50 requests_ = AbstractC0269h.emptyProtobufList();

    static {
        GetPendingRequestsResponse getPendingRequestsResponse = new GetPendingRequestsResponse();
        DEFAULT_INSTANCE = getPendingRequestsResponse;
        AbstractC0269h.registerDefaultInstance(GetPendingRequestsResponse.class, getPendingRequestsResponse);
    }

    private GetPendingRequestsResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"childDisplayName_", "requests_", PendingAllowlistRequest.class});
        }
        if (iOrdinal == 3) {
            return new GetPendingRequestsResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 29);
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
        synchronized (GetPendingRequestsResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m12241n() {
        return this.childDisplayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m12242o() {
        return this.requests_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
