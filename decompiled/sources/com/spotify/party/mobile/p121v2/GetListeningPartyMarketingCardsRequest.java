package com.spotify.party.mobile.p121v2;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q910;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetListeningPartyMarketingCardsRequest extends AbstractC0269h implements sre0 {
    private static final GetListeningPartyMarketingCardsRequest DEFAULT_INSTANCE;
    public static final int ORGANIZER_URIS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 organizerUris_ = AbstractC0269h.emptyProtobufList();

    static {
        GetListeningPartyMarketingCardsRequest getListeningPartyMarketingCardsRequest = new GetListeningPartyMarketingCardsRequest();
        DEFAULT_INSTANCE = getListeningPartyMarketingCardsRequest;
        AbstractC0269h.registerDefaultInstance(GetListeningPartyMarketingCardsRequest.class, getListeningPartyMarketingCardsRequest);
    }

    private GetListeningPartyMarketingCardsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16617n(GetListeningPartyMarketingCardsRequest getListeningPartyMarketingCardsRequest, Iterable iterable) {
        ae50 ae50Var = getListeningPartyMarketingCardsRequest.organizerUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getListeningPartyMarketingCardsRequest.organizerUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, getListeningPartyMarketingCardsRequest.organizerUris_);
    }

    /* JADX INFO: renamed from: o */
    public static q910 m16618o() {
        return (q910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"organizerUris_"});
        }
        if (iOrdinal == 3) {
            return new GetListeningPartyMarketingCardsRequest();
        }
        if (iOrdinal == 4) {
            return new q910(DEFAULT_INSTANCE);
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
        synchronized (GetListeningPartyMarketingCardsRequest.class) {
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
