package com.spotify.notifications.datasource.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaContent extends AbstractC0269h implements sre0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 5;
    private static final MediaContent DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int TTL_SECONDS_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private int ttlSeconds_;
    private String url_ = "";
    private String mimeType_ = "";
    private String thumbnailUrl_ = "";
    private String altText_ = "";

    static {
        MediaContent mediaContent = new MediaContent();
        DEFAULT_INSTANCE = mediaContent;
        AbstractC0269h.registerDefaultInstance(MediaContent.class, mediaContent);
    }

    private MediaContent() {
    }

    /* JADX INFO: renamed from: o */
    public static MediaContent m15967o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"url_", "ttlSeconds_", "mimeType_", "thumbnailUrl_", "altText_"});
        }
        if (iOrdinal == 3) {
            return new MediaContent();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 0);
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
        synchronized (MediaContent.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final String m15968n() {
        return this.altText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m15969p() {
        return this.mimeType_;
    }

    /* JADX INFO: renamed from: q */
    public final String m15970q() {
        return this.thumbnailUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final int m15971r() {
        return this.ttlSeconds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
