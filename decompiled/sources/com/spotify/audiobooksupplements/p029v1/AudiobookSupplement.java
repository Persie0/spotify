package com.spotify.audiobooksupplements.p029v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudiobookSupplement extends AbstractC0269h implements sre0 {
    private static final AudiobookSupplement DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 2;
    public static final int FILE_SIZE_FIELD_NUMBER = 4;
    public static final int MIME_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int fileSize_;
    private String url_ = "";
    private String fileName_ = "";
    private String mimeType_ = "";

    static {
        AudiobookSupplement audiobookSupplement = new AudiobookSupplement();
        DEFAULT_INSTANCE = audiobookSupplement;
        AbstractC0269h.registerDefaultInstance(AudiobookSupplement.class, audiobookSupplement);
    }

    private AudiobookSupplement() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"url_", "fileName_", "mimeType_", "fileSize_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookSupplement();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 13);
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
        synchronized (AudiobookSupplement.class) {
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
    public final String m3438n() {
        return this.fileName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m3439o() {
        return this.fileSize_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3440p() {
        return this.mimeType_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
