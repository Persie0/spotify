package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.j610;
import p204p.k610;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAdsRequest extends AbstractC0269h implements sre0 {
    private static final GetAdsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    public static final int TARGETING_FIELD_NUMBER = 2;
    private ihc0 targeting_ = ihc0.f102235b;
    private String slotId_ = "";

    static {
        GetAdsRequest getAdsRequest = new GetAdsRequest();
        DEFAULT_INSTANCE = getAdsRequest;
        AbstractC0269h.registerDefaultInstance(GetAdsRequest.class, getAdsRequest);
    }

    private GetAdsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m2654n(GetAdsRequest getAdsRequest) {
        ihc0 ihc0Var = getAdsRequest.targeting_;
        if (!ihc0Var.f102236a) {
            getAdsRequest.targeting_ = ihc0Var.m50613h();
        }
        return getAdsRequest.targeting_;
    }

    /* JADX INFO: renamed from: o */
    public static void m2655o(GetAdsRequest getAdsRequest, String str) {
        getAdsRequest.getClass();
        str.getClass();
        getAdsRequest.slotId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static j610 m2656p() {
        return (j610) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"slotId_", "targeting_", k610.f119611a});
        }
        if (iOrdinal == 3) {
            return new GetAdsRequest();
        }
        if (iOrdinal == 4) {
            return new j610(DEFAULT_INSTANCE);
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
        synchronized (GetAdsRequest.class) {
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
