package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.n710;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetConceptsRequest extends AbstractC0269h implements sre0 {
    public static final int BROWSE_LOCATION_FIELD_NUMBER = 2;
    private static final GetConceptsRequest DEFAULT_INSTANCE;
    public static final int IGNORED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String ignored_ = "";
    private String browseLocation_ = "";

    static {
        GetConceptsRequest getConceptsRequest = new GetConceptsRequest();
        DEFAULT_INSTANCE = getConceptsRequest;
        AbstractC0269h.registerDefaultInstance(GetConceptsRequest.class, getConceptsRequest);
    }

    private GetConceptsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7242n(GetConceptsRequest getConceptsRequest, String str) {
        getConceptsRequest.getClass();
        getConceptsRequest.bitField0_ |= 1;
        getConceptsRequest.browseLocation_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7243o(GetConceptsRequest getConceptsRequest) {
        getConceptsRequest.getClass();
        getConceptsRequest.ignored_ = "ignored";
    }

    /* JADX INFO: renamed from: p */
    public static n710 m7244p() {
        return (n710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "ignored_", "browseLocation_"});
        }
        if (iOrdinal == 3) {
            return new GetConceptsRequest();
        }
        if (iOrdinal == 4) {
            return new n710(DEFAULT_INSTANCE);
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
        synchronized (GetConceptsRequest.class) {
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
