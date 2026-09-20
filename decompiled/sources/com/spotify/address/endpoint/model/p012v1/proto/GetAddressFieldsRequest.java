package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h610;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAddressFieldsRequest extends AbstractC0269h implements sre0 {
    public static final int ADDRESS_ID_FIELD_NUMBER = 1;
    private static final GetAddressFieldsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String addressId_ = "";

    static {
        GetAddressFieldsRequest getAddressFieldsRequest = new GetAddressFieldsRequest();
        DEFAULT_INSTANCE = getAddressFieldsRequest;
        AbstractC0269h.registerDefaultInstance(GetAddressFieldsRequest.class, getAddressFieldsRequest);
    }

    private GetAddressFieldsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2430n(GetAddressFieldsRequest getAddressFieldsRequest, String str) {
        getAddressFieldsRequest.getClass();
        str.getClass();
        getAddressFieldsRequest.addressId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static h610 m2431p() {
        return (h610) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"addressId_"});
        }
        if (iOrdinal == 3) {
            return new GetAddressFieldsRequest();
        }
        if (iOrdinal == 4) {
            return new h610(DEFAULT_INSTANCE);
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
        synchronized (GetAddressFieldsRequest.class) {
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
    public final String m2432o() {
        return this.addressId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
