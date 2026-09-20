package com.spotify.familygatedcontent.p063v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zuw0;

/* JADX INFO: loaded from: classes6.dex */
public final class RequestFeatureRequest extends AbstractC0269h implements sre0 {
    private static final RequestFeatureRequest DEFAULT_INSTANCE;
    public static final int OFFER_UUID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTTYPE_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String requestType_ = "";
    private String userId_ = "";
    private String offerUuid_ = "";

    static {
        RequestFeatureRequest requestFeatureRequest = new RequestFeatureRequest();
        DEFAULT_INSTANCE = requestFeatureRequest;
        AbstractC0269h.registerDefaultInstance(RequestFeatureRequest.class, requestFeatureRequest);
    }

    private RequestFeatureRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10597n(RequestFeatureRequest requestFeatureRequest, String str) {
        requestFeatureRequest.getClass();
        str.getClass();
        requestFeatureRequest.bitField0_ |= 2;
        requestFeatureRequest.offerUuid_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10598o(RequestFeatureRequest requestFeatureRequest, String str) {
        requestFeatureRequest.getClass();
        str.getClass();
        requestFeatureRequest.requestType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static zuw0 m10599p() {
        return (zuw0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "requestType_", "userId_", "offerUuid_"});
        }
        if (iOrdinal == 3) {
            return new RequestFeatureRequest();
        }
        if (iOrdinal == 4) {
            return new zuw0(DEFAULT_INSTANCE);
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
        synchronized (RequestFeatureRequest.class) {
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
