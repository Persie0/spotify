package com.spotify.savetospotify.p145v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpCreateShowRequest extends AbstractC0269h implements sre0 {
    public static final int AUTO_FOLLOW_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 4;
    private static final HttpCreateShowRequest DEFAULT_INSTANCE;
    public static final int IMAGE_TOKEN_FIELD_NUMBER = 5;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean autoFollow_;
    private int bitField0_;
    private String title_ = "";
    private String summary_ = "";
    private String language_ = "";
    private String coverImageUrl_ = "";
    private String imageToken_ = "";

    static {
        HttpCreateShowRequest httpCreateShowRequest = new HttpCreateShowRequest();
        DEFAULT_INSTANCE = httpCreateShowRequest;
        AbstractC0269h.registerDefaultInstance(HttpCreateShowRequest.class, httpCreateShowRequest);
    }

    private HttpCreateShowRequest() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဇ\u0000", new Object[]{"bitField0_", "title_", "summary_", "language_", "coverImageUrl_", "imageToken_", "autoFollow_"});
        }
        if (iOrdinal == 3) {
            return new HttpCreateShowRequest();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 5);
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
        synchronized (HttpCreateShowRequest.class) {
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
