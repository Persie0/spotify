package com.spotify.upselloffer.endpointimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hc10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GetUpsellOfferRequest extends AbstractC0269h implements sre0 {
    private static final GetUpsellOfferRequest DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String locale_ = "";

    static {
        GetUpsellOfferRequest getUpsellOfferRequest = new GetUpsellOfferRequest();
        DEFAULT_INSTANCE = getUpsellOfferRequest;
        AbstractC0269h.registerDefaultInstance(GetUpsellOfferRequest.class, getUpsellOfferRequest);
    }

    private GetUpsellOfferRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22032n(GetUpsellOfferRequest getUpsellOfferRequest, String str) {
        getUpsellOfferRequest.getClass();
        str.getClass();
        getUpsellOfferRequest.locale_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static hc10 m22034p() {
        return (hc10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"locale_"});
        }
        if (iOrdinal == 3) {
            return new GetUpsellOfferRequest();
        }
        if (iOrdinal == 4) {
            return new hc10();
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
        synchronized (GetUpsellOfferRequest.class) {
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
