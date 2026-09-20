package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sgz0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DisplaySegment extends AbstractC0269h implements sre0 {
    private static final DisplaySegment DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 8;
    public static final int IS_PREVIEW_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SEEK_START_MS_FIELD_NUMBER = 4;
    public static final int SEEK_STOP_MS_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int durationMs_;
    private boolean isPreview_;
    private int seekStartMs_;
    private int seekStopMs_;
    private int type_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";

    static {
        DisplaySegment displaySegment = new DisplaySegment();
        DEFAULT_INSTANCE = displaySegment;
        AbstractC0269h.registerDefaultInstance(DisplaySegment.class, displaySegment);
    }

    private DisplaySegment() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0004\u0005\u0004\u0006ለ\u0000\u0007ለ\u0001\bለ\u0002\tဇ\u0003", new Object[]{"bitField0_", "uri_", "type_", "durationMs_", "seekStartMs_", "seekStopMs_", "title_", "subtitle_", "imageUrl_", "isPreview_"});
        }
        if (iOrdinal == 3) {
            return new DisplaySegment();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 6);
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
        synchronized (DisplaySegment.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final int m10086n() {
        return this.durationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10087o() {
        return this.isPreview_;
    }

    /* JADX INFO: renamed from: p */
    public final int m10088p() {
        return this.seekStartMs_;
    }

    /* JADX INFO: renamed from: q */
    public final int m10089q() {
        return this.seekStopMs_;
    }

    /* JADX INFO: renamed from: r */
    public final sgz0 m10090r() {
        sgz0 sgz0Var;
        int i = this.type_;
        if (i == 0) {
            sgz0Var = sgz0.SEGMENT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            sgz0Var = i != 2 ? null : sgz0.SEGMENT_TYPE_MUSIC;
        } else {
            sgz0Var = sgz0.SEGMENT_TYPE_TALK;
        }
        return sgz0Var == null ? sgz0.UNRECOGNIZED : sgz0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
