package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.m57;
import p204p.n350;
import p204p.nje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.w810;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetFeedRequest extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CONTEXT_ARTIST_URI_FIELD_NUMBER = 3;
    private static final GetFeedRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 2;
    public static final int IGNORED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new m57(12);
    private int bitField0_;
    private int capabilitiesMemoizedSerializedSize;
    private FeedFilter filter_;
    private String ignored_ = "";
    private String contextArtistUri_ = "";
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        GetFeedRequest getFeedRequest = new GetFeedRequest();
        DEFAULT_INSTANCE = getFeedRequest;
        AbstractC0269h.registerDefaultInstance(GetFeedRequest.class, getFeedRequest);
    }

    private GetFeedRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m7251n(GetFeedRequest getFeedRequest, nje njeVar) {
        getFeedRequest.getClass();
        ud50 ud50Var = getFeedRequest.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            getFeedRequest.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) getFeedRequest.capabilities_).m63581b(njeVar.getNumber());
    }

    /* JADX INFO: renamed from: o */
    public static void m7252o(GetFeedRequest getFeedRequest, FeedFilter feedFilter) {
        getFeedRequest.getClass();
        feedFilter.getClass();
        getFeedRequest.filter_ = feedFilter;
        getFeedRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m7253p(GetFeedRequest getFeedRequest) {
        getFeedRequest.getClass();
        getFeedRequest.ignored_ = "list_hero,list_wide,list,grid,carousel";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static w810 m7254q() {
        return (w810) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0004,", new Object[]{"bitField0_", "ignored_", "filter_", "contextArtistUri_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedRequest();
        }
        if (iOrdinal == 4) {
            return new w810(DEFAULT_INSTANCE);
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
        synchronized (GetFeedRequest.class) {
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
