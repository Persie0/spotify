package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.n350;
import p204p.nje;
import p204p.og6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u810;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetFeedNextPageRequest extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final GetFeedNextPageRequest DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new og6(12);
    private int capabilitiesMemoizedSerializedSize;
    private String nextPageToken_ = "";
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        GetFeedNextPageRequest getFeedNextPageRequest = new GetFeedNextPageRequest();
        DEFAULT_INSTANCE = getFeedNextPageRequest;
        AbstractC0269h.registerDefaultInstance(GetFeedNextPageRequest.class, getFeedNextPageRequest);
    }

    private GetFeedNextPageRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m7246n(GetFeedNextPageRequest getFeedNextPageRequest, nje njeVar) {
        getFeedNextPageRequest.getClass();
        ud50 ud50Var = getFeedNextPageRequest.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            getFeedNextPageRequest.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) getFeedNextPageRequest.capabilities_).m63581b(njeVar.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m7247o(GetFeedNextPageRequest getFeedNextPageRequest, String str) {
        getFeedNextPageRequest.getClass();
        str.getClass();
        getFeedNextPageRequest.nextPageToken_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static u810 m7248p() {
        return (u810) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"nextPageToken_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedNextPageRequest();
        }
        if (iOrdinal == 4) {
            return new u810(DEFAULT_INSTANCE);
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
        synchronized (GetFeedNextPageRequest.class) {
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
