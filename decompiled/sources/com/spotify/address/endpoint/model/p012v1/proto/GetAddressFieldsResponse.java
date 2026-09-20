package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.i610;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAddressFieldsResponse extends AbstractC0269h implements sre0 {
    public static final int ADDRESSFIELDS_FIELD_NUMBER = 1;
    private static final GetAddressFieldsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 addressFields_ = AbstractC0269h.emptyProtobufList();

    static {
        GetAddressFieldsResponse getAddressFieldsResponse = new GetAddressFieldsResponse();
        DEFAULT_INSTANCE = getAddressFieldsResponse;
        AbstractC0269h.registerDefaultInstance(GetAddressFieldsResponse.class, getAddressFieldsResponse);
    }

    private GetAddressFieldsResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2433n(GetAddressFieldsResponse getAddressFieldsResponse, List list) {
        ae50 ae50Var = getAddressFieldsResponse.addressFields_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getAddressFieldsResponse.addressFields_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, getAddressFieldsResponse.addressFields_);
    }

    /* JADX INFO: renamed from: p */
    public static i610 m2434p() {
        return (i610) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"addressFields_", FieldValue.class});
        }
        if (iOrdinal == 3) {
            return new GetAddressFieldsResponse();
        }
        if (iOrdinal == 4) {
            return new i610(DEFAULT_INSTANCE);
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
        synchronized (GetAddressFieldsResponse.class) {
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
    public final ae50 m2435o() {
        return this.addressFields_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
