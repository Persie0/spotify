package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetFeedNextPageResponse extends AbstractC0269h implements sre0 {
    private static final GetFeedNextPageResponse DEFAULT_INSTANCE;
    public static final int MERGE_FIRST_SECTION_FIELD_NUMBER = 3;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean mergeFirstSection_;
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        GetFeedNextPageResponse getFeedNextPageResponse = new GetFeedNextPageResponse();
        DEFAULT_INSTANCE = getFeedNextPageResponse;
        AbstractC0269h.registerDefaultInstance(GetFeedNextPageResponse.class, getFeedNextPageResponse);
    }

    private GetFeedNextPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ለ\u0000\u0003\u0007", new Object[]{"bitField0_", "sections_", Section.class, "nextPageToken_", "mergeFirstSection_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedNextPageResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 5);
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
        synchronized (GetFeedNextPageResponse.class) {
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

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m7249n() {
        return this.mergeFirstSection_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m7250o() {
        return this.sections_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
