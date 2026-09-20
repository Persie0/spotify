package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GenerateUrlResponse extends AbstractC0269h implements sre0 {
    private static final GenerateUrlResponse DEFAULT_INSTANCE;
    public static final int FULL_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SHAREABLE_URL_FIELD_NUMBER = 2;
    public static final int SHARE_ID_FIELD_NUMBER = 3;
    public static final int SPOTIFY_URI_FIELD_NUMBER = 1;
    private String spotifyUri_ = "";
    private String shareableUrl_ = "";
    private String shareId_ = "";
    private String fullUrl_ = "";

    static {
        GenerateUrlResponse generateUrlResponse = new GenerateUrlResponse();
        DEFAULT_INSTANCE = generateUrlResponse;
        AbstractC0269h.registerDefaultInstance(GenerateUrlResponse.class, generateUrlResponse);
    }

    private GenerateUrlResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"spotifyUri_", "shareableUrl_", "shareId_", "fullUrl_"});
        }
        if (iOrdinal == 3) {
            return new GenerateUrlResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 12);
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
        synchronized (GenerateUrlResponse.class) {
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

    public final String getShareId() {
        return this.shareId_;
    }

    /* JADX INFO: renamed from: n */
    public final String m21019n() {
        return this.fullUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21020o() {
        return this.shareableUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21021p() {
        return this.spotifyUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
