package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.show_cosmos.unfinished_episodes_request.proto.UnfinishedEpisodesRequest$Response;

/* JADX INFO: loaded from: classes10.dex */
public final class GetUnfinishedEpisodesResponse extends AbstractC0269h implements sre0 {
    private static final GetUnfinishedEpisodesResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private UnfinishedEpisodesRequest$Response response_;
    private Status status_;

    static {
        GetUnfinishedEpisodesResponse getUnfinishedEpisodesResponse = new GetUnfinishedEpisodesResponse();
        DEFAULT_INSTANCE = getUnfinishedEpisodesResponse;
        AbstractC0269h.registerDefaultInstance(GetUnfinishedEpisodesResponse.class, getUnfinishedEpisodesResponse);
    }

    private GetUnfinishedEpisodesResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static GetUnfinishedEpisodesResponse m21218o(byte[] bArr) {
        return (GetUnfinishedEpisodesResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "response_", "status_"});
        }
        if (iOrdinal == 3) {
            return new GetUnfinishedEpisodesResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 12);
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
        synchronized (GetUnfinishedEpisodesResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final UnfinishedEpisodesRequest$Response m21219n() {
        UnfinishedEpisodesRequest$Response unfinishedEpisodesRequest$Response = this.response_;
        return unfinishedEpisodesRequest$Response == null ? UnfinishedEpisodesRequest$Response.m97964n() : unfinishedEpisodesRequest$Response;
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
