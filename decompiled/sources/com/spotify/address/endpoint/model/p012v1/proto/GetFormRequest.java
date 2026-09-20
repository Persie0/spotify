package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y810;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetFormRequest extends AbstractC0269h implements sre0 {
    private static final GetFormRequest DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private RequestDetails details_;

    static {
        GetFormRequest getFormRequest = new GetFormRequest();
        DEFAULT_INSTANCE = getFormRequest;
        AbstractC0269h.registerDefaultInstance(GetFormRequest.class, getFormRequest);
    }

    private GetFormRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2436n(GetFormRequest getFormRequest, RequestDetails requestDetails) {
        getFormRequest.getClass();
        getFormRequest.details_ = requestDetails;
        getFormRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static GetFormRequest m2437o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static y810 m2438p() {
        return (y810) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "details_"});
        }
        if (iOrdinal == 3) {
            return new GetFormRequest();
        }
        if (iOrdinal == 4) {
            return new y810(DEFAULT_INSTANCE);
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
        synchronized (GetFormRequest.class) {
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
