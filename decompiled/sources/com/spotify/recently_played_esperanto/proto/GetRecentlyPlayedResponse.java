package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetRecentlyPlayedResponse extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final GetRecentlyPlayedResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int LOADED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    private ae50 context_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";
    private boolean loaded_;
    private int status_;

    static {
        GetRecentlyPlayedResponse getRecentlyPlayedResponse = new GetRecentlyPlayedResponse();
        DEFAULT_INSTANCE = getRecentlyPlayedResponse;
        AbstractC0269h.registerDefaultInstance(GetRecentlyPlayedResponse.class, getRecentlyPlayedResponse);
    }

    private GetRecentlyPlayedResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static GetRecentlyPlayedResponse m20229q(byte[] bArr) {
        return (GetRecentlyPlayedResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u000b\u0004Ȉ", new Object[]{"context_", RecentlyPlayedContext.class, "loaded_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 14);
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
        synchronized (GetRecentlyPlayedResponse.class) {
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
    public final int m20230n() {
        return this.context_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20231o() {
        return this.context_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20232p() {
        return this.loaded_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
