package com.spotify.savetospotify.p145v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.a530;
import p204p.lwo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpGetShowResponse extends AbstractC0269h implements sre0 {
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int CREATED_AT_FIELD_NUMBER = 6;
    private static final HttpGetShowResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 7;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp createdAt_;
    private int playbackControl_;
    private String showUri_ = "";
    private String title_ = "";
    private String description_ = "";
    private String language_ = "";
    private String coverImageUrl_ = "";

    static {
        HttpGetShowResponse httpGetShowResponse = new HttpGetShowResponse();
        DEFAULT_INSTANCE = httpGetShowResponse;
        AbstractC0269h.registerDefaultInstance(HttpGetShowResponse.class, httpGetShowResponse);
    }

    private HttpGetShowResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007\f", new Object[]{"bitField0_", "showUri_", "title_", "description_", "language_", "coverImageUrl_", "createdAt_", "playbackControl_"});
        }
        if (iOrdinal == 3) {
            return new HttpGetShowResponse();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 7);
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
        synchronized (HttpGetShowResponse.class) {
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
    public final lwo0 m20438n() {
        lwo0 lwo0Var;
        int i = this.playbackControl_;
        if (i == 0) {
            lwo0Var = lwo0.PLAYBACK_CONTROL_UNSPECIFIED;
        } else if (i != 1) {
            lwo0Var = i != 2 ? null : lwo0.PLAYBACK_CONTROL_DEFAULT;
        } else {
            lwo0Var = lwo0.PLAYBACK_CONTROL_CHAPTER_SKIP;
        }
        return lwo0Var == null ? lwo0.UNRECOGNIZED : lwo0Var;
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
