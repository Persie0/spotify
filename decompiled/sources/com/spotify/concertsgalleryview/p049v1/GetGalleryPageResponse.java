package com.spotify.concertsgalleryview.p049v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetGalleryPageResponse extends AbstractC0269h implements sre0 {
    private static final GetGalleryPageResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Header header_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        GetGalleryPageResponse getGalleryPageResponse = new GetGalleryPageResponse();
        DEFAULT_INSTANCE = getGalleryPageResponse;
        AbstractC0269h.registerDefaultInstance(GetGalleryPageResponse.class, getGalleryPageResponse);
    }

    private GetGalleryPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ለ\u0001", new Object[]{"bitField0_", "header_", "items_", ContentItem.class, "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetGalleryPageResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 9);
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
        synchronized (GetGalleryPageResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getNextPageToken() {
        return this.nextPageToken_;
    }

    /* JADX INFO: renamed from: n */
    public final Header m7225n() {
        Header header = this.header_;
        return header == null ? Header.m7227n() : header;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7226o() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
