package com.spotify.concertsgalleryview.p049v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a910;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetGalleryPageRequest extends AbstractC0269h implements sre0 {
    private static final GetGalleryPageRequest DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int PAGE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String pageUri_ = "";
    private String nextPageToken_ = "";

    static {
        GetGalleryPageRequest getGalleryPageRequest = new GetGalleryPageRequest();
        DEFAULT_INSTANCE = getGalleryPageRequest;
        AbstractC0269h.registerDefaultInstance(GetGalleryPageRequest.class, getGalleryPageRequest);
    }

    private GetGalleryPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7222n(GetGalleryPageRequest getGalleryPageRequest, String str) {
        getGalleryPageRequest.getClass();
        str.getClass();
        getGalleryPageRequest.bitField0_ |= 1;
        getGalleryPageRequest.nextPageToken_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m7223o(GetGalleryPageRequest getGalleryPageRequest, String str) {
        getGalleryPageRequest.getClass();
        str.getClass();
        getGalleryPageRequest.pageUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static a910 m7224p() {
        return (a910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "pageUri_", "nextPageToken_"});
        }
        if (iOrdinal == 3) {
            return new GetGalleryPageRequest();
        }
        if (iOrdinal == 4) {
            return new a910(DEFAULT_INSTANCE);
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
        synchronized (GetGalleryPageRequest.class) {
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
