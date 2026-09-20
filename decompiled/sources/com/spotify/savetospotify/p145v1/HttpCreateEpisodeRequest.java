package com.spotify.savetospotify.p145v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yxd0;
import p204p.z110;
import p204p.zg30;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpCreateEpisodeRequest extends AbstractC0269h implements sre0 {
    public static final int CHUNK_COUNT_FIELD_NUMBER = 7;
    private static final HttpCreateEpisodeRequest DEFAULT_INSTANCE;
    public static final int IMAGE_TOKEN_FIELD_NUMBER = 9;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int chunkCount_;
    private int mediaType_;
    private String title_ = "";
    private String summary_ = "";
    private String language_ = "";
    private String imageToken_ = "";

    static {
        HttpCreateEpisodeRequest httpCreateEpisodeRequest = new HttpCreateEpisodeRequest();
        DEFAULT_INSTANCE = httpCreateEpisodeRequest;
        AbstractC0269h.registerDefaultInstance(HttpCreateEpisodeRequest.class, httpCreateEpisodeRequest);
    }

    private HttpCreateEpisodeRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20429n(HttpCreateEpisodeRequest httpCreateEpisodeRequest, int i) {
        httpCreateEpisodeRequest.chunkCount_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m20430o(HttpCreateEpisodeRequest httpCreateEpisodeRequest, String str) {
        httpCreateEpisodeRequest.getClass();
        str.getClass();
        httpCreateEpisodeRequest.imageToken_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m20431p(HttpCreateEpisodeRequest httpCreateEpisodeRequest, yxd0 yxd0Var) {
        httpCreateEpisodeRequest.getClass();
        httpCreateEpisodeRequest.mediaType_ = yxd0Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20432q(HttpCreateEpisodeRequest httpCreateEpisodeRequest, String str) {
        httpCreateEpisodeRequest.getClass();
        str.getClass();
        httpCreateEpisodeRequest.title_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static zg30 m20433r() {
        return (zg30) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\t\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006\f\u0007\u0004\tȈ", new Object[]{"title_", "summary_", "language_", "mediaType_", "chunkCount_", "imageToken_"});
        }
        if (iOrdinal == 3) {
            return new HttpCreateEpisodeRequest();
        }
        if (iOrdinal == 4) {
            return new zg30(DEFAULT_INSTANCE);
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
        synchronized (HttpCreateEpisodeRequest.class) {
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
